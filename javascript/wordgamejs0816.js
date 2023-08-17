// const maxUser = Number(prompt("몇명이 참가하나요?"));
const maxUser = 3;
const midUser = 2;
const minUser = 1;
const arrHistory = [];

const elemInput = document.querySelector('input');
const elemBtn = document.querySelector('button');
const elemWord = document.querySelector('.word');
const elemHistory  = document.querySelector('.history');
const elemOrder = document.querySelector('.order')

const addStringHistory = (str)=>{
    arrHistory.push(str);
    let view = '';
    arrHistory.forEach((value)=>{
        view += value + '->';
    });
    elemHistory.textContent = view;
};
const changeOrder =()=>{
    let idx = Number(elemOrder.textContent);
    // console.log(typeof(idx));
    if(idx+1 > maxUser){
        elemOrder.textContent = 1;
    }else{
        elemOrder.textContent = idx+1
    }

};
const onClickBtn = () =>{
    let strInput = elemInput.value;
    if(strInput){
        let strWord = elemWord.textContent;
        if( !strWord || strWord[strWord.length-1] === strInput[0]){
            elemWord.textContent= strInput;
            addStringHistory(strInput);
            changeOrder();
        }else{
            alert("올바르지 않은 단어입니다")
        }        
    }else{
        alert('올바르지 않은 단어입니다');
    }
    elemInput.value = '';
    elemInput.focus();
};
const init = () => {
    console.log("바로 시작");
    elemInput.focus();
    elemBtn.addEventListener('click',onClickBtn);
}
init();