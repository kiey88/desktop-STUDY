const elemCom = document.querySelector('#com');
const elemBtn = document.querySelector('#self>div');
let timeId = 0;
//전역변수선언
let change = 0;
const onClickBtn =(event)=>{
    // console.dir(event.target.dataset.index);
    // console.dir(event.target);
    let idx = event.target.dataset.index;
    const elemSelf = document.querySelector('#self');
    elemSelf.style.backgroundPosition =`${idx*(-200)}px`;
    clearInterval(timeId)
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