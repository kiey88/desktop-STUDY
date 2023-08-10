const elemInput = document.querySelector('input');
const elemBtn = document.querySelectorAll('button');

//변수 만들기
let strDisplay = '';

const updateDisplay = () =>{
    elemInput.value = strDisplay;
}
const strCalc= ()=>{
    let value = eval(strDisplay);
            strDisplay += '=';
            strDisplay += value;
            updateDisplay();
            strDisplay = '';
}
//각 버튼의 click 이벤트가 실행되면
const clickBtn = (e) =>{
    //console.dir() 메서드는 특정 객체의 속성을 콘솔에 표시하기 위해 사용됩니다.
    //console.log()와 비슷하지만, console.dir()는 객체의 속성을 트리 형태로 
    //표시합니다. 이를 통해 객체의 계층 구조와 속성을 더 쉽게 볼 수 있습니다.
    //console.dir(e);는 이벤트 객체의 모든 속성과 메서드를 콘솔에 트리 형태로 
    //표시하려는 것일 수 있습니다.
    console.dir(e);
    switch(e.target.className){
        case 'ac':
            //input에 입력된 수식을 모두 삭제
            strDisplay = '';
            updateDisplay();
            break;
        case 'equal':
            //input에 입력된 수식을 계산
            strCalc();
            break;
        default:
            //input에 값을 추가해야 한다
            strDisplay += e.target.textContent;
            updateDisplay();
            break;
    }
}
// button 객체에 click 이벤트를 등록
for(let i=0; i<elemBtn.length; i++){
    elemBtn[i].addEventListener('click',clickBtn);
}