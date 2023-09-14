//객체 선택
const elemSec2= document.querySelector('.sec2');
const elemSlider = elemSec2.querySelector('.slider');
//변수선언
let posLeft = 0;
//가로 스크롤 종료 기준위치 정하기
// const MAX_LEFT_POS = (elemSlider.scrollWidth-(document.documentElement.clientWidth*0.7))*-1;
const MAX_LEFT_POS = (elemSlider.offsetWidth-(window.innerWidth*0.7))*-1;
let posTop = 0;
//함수정의
console.log('맥스레프트:',MAX_LEFT_POS)
const progressBar = ()=>{
    let progress =(posLeft/MAX_LEFT_POS)*100;
    console.log('progress:',progress);
    const bar = document.querySelector('.indicator>.bar');
    bar.style.width = `${progress}%`;
}
const moveSliderY =(moveY)=>{
    posTop += moveY;
    for(let i=0;i<elemSlider.childElementCount;i++){
        if(i%2){
            elemSlider.children[i].style.transform =`translateY(${posTop/(i*3)}px)`
        }else{
            elemSlider.children[i].style.transform =`translateY(${-posTop/(i*3)}px)`
        }
    }
}

const moveSliderX = (moveY)=>{
    console.log('moveY:',moveY);
    posLeft -= moveY;
    console.log('posleft:',posLeft);
    if(posLeft < MAX_LEFT_POS){
        posLeft=MAX_LEFT_POS;
        return;
    }else if(posLeft>0){
        posLeft = 0;
        return;
    }

    elemSlider.style.transform = `translateX(${posLeft}PX)`
    moveSliderY(moveY)
    progressBar();
}
const onEventSection2=(event)=>{
    event.preventDefault();
    moveSliderX(event.deltaY);
    if(event.deltaY < 0&&posLeft>=0){
        elemSec2.style.top =`100%`
    }
    console.log('deltaY:',event.deltaY);
}

elemSec2.addEventListener('wheel',onEventSection2,{passive:false});