const elemSpan = document.querySelector('.home span');
const strData ="PublisherFront-end DeveloperBack-end Developer";
const content = strData.split('')
//lengt= 9 ['P', 'u', 'b', 'l', 'i', 's', 'h', 'e', 'r']

let textIdx = 0;
elemSpan.textContent = "";
//타이핑 효과중 글자 삭제
const deleteText=()=>{
    --textIdx;
    content.pop();
    elemSpan.textContent = content.join('');
    if( textIdx >= 1){
        
        setTimeout(deleteText,300);
    } else {
        textIdx = 0;
        content = strData.split('');
        setTimeout( addText, 300);
    }
    
}


const addText =()=>{
    let text = content[textIdx];
    textIdx+=1
    elemSpan.textContent += text;
    if( textIdx < content.length){
        setTimeout( addText, 300);
        //0.5초마다 실행
    } else{
        //인덱스값이 9이면 인덱스값1삭제
        
        setTimeout(deleteText,1000);
    }
}
addText();
