/**
 * 1 상세설명보기 버튼을 클릭한다
 *      1-1 상세설명보기 버튼이 click 이라는 동작을 할 수 있도록 명령을 부여
 *      1-2 명령을 주려면 상세설명보기 버튼의 정보를 가지고 있어야 한다
 * 
 * 2 클릭을 하면 상세설명 div가 보여야 한다
 */

//1 상세설명보기의 정보를 가져 와야한다
const open = document.querySelector('button.open');
//상세설명 div의 정보를 가지고 온다
const detail = document.querySelector('.detail')
//3 openClick 함수 생성
const close = document.querySelector('button.close');

const openClick = () =>{
    console.log("상세설명보기 클릭");
    //1. detail인 요소가 보여지도록 한다
    // 1-1 현재는 display : none
    // 1-2 detail의 display : block으로 변경
    //2. open버튼이 사라져야한다
    // 2-1 현재는 display : block
    // 2-2 detail의 display : none으로 변경
    // console.dir(detail);
    detail.style.display = "block";
    open.style.display = "none";
}
const closeClick = () =>{
    
    
    detail.style.display = "none";
    open.style.display = "block";
}

//2 click 이벤트 등록
open.addEventListener('click',openClick);
close.addEventListener('click',closeClick);