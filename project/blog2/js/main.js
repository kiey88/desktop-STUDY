const elemBtn = document.querySelector('.thankyou_message > .close')
const elemSec = document.querySelectorAll('main > section');
let currentPage = 0;
// console.log(elemSec)
const setSectionTop = ()=>{
    let offsetTop = elemSec[currentPage-1].offsetTop;
    return offsetTop;
}
const onEventWheel=(event)=>{
    console.log(event.deltaY);
    event.preventDefault();
    if(event.deltaY>=0){
        currentPage++;
        if(currentPage>=4){currentPage=4;}
    }else{
        currentPage--;
        if(currentPage<=0){currentPage=0;}
    }
    // let topPos = document.documentElement.clientHeight*currentPage;
    // if(currentPage>=3){
    //     topPos+=(document.documentElement.clientHeight*0.5);
    // }
    // console.log(topPos)
    let topPos = 0;
    if(currentPage >=1){
        topPos = elemSec[currentPage-1].offsetTop;
    }
    window.scrollTo({left:0,top:topPos,behavior:"smooth"});
}
const init =()=>{
    elemBtn.addEventListener('click',() => {
        elemBtn.parentElement.style.display = "none";
    });
    window.addEventListener('wheel',onEventWheel,{passive:false});
};
init();