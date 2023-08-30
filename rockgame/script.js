const elemCom = document.querySelector('#com');
const elemBtn = document.querySelector('#self>div');
const elemCalc = document.querySelector("#result");

let timeId = 0;
//전역변수선언

let change = 0;

const checkResult =(userIdx) =>{
    let calc = Number(change) - Number(userIdx);
    if( [-1,2].includes(calc)){
        elemCalc.textContent = "사람이 이겼습니다"
    }
    else if ([-2,1].includes(calc)){
        elemCalc.textContent = "사람이 이겼습니다"
    }
    else if(calc === 0){
        elemCalc.textContent = "무승부입니다"
    }
}

const onClickBtn =(event)=>{
    // console.dir(event.target.dataset.index);
    // console.dir(event.target);
    let idx = event.target.dataset.index;
    const elemSelf = document.querySelector('#self');
    elemSelf.style.backgroundPosition =`${idx*(-200)}px`;
    clearInterval(timeId);
    checkResult(idx);
}
const handlerChange = () =>{
    // change++;
    // if(change>2){
    //     change = 0;
    //     }
    // console.log(change)
    change = (change >= 2) ? 0: ++change;
    elemCom.style.backgroundPosition =`${change*(-200)}px`;
}
const init = () =>{
    timeId = setInterval(handlerChange,50);
    elemBtn.addEventListener('click',onClickBtn);
    
};
init();