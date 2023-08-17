//객체 선언
const elemMenuList = document.querySelectorAll('nav>ul>li');
const elemMenuIcon = document.querySelector('.menu-icon');
//메뉴 리스트에서 클릭을 하면 실행되는 함수
const onClickMenu = () =>{
    // console.log('menu list click');
    const menuBar = document.querySelector('nav');
    menuBar.classList.toggle('menu-off');
    //menu-icon 에 class=icon-on 추가
    elemMenuIcon.classList.toggle('icon-on');
}

const intit =()=>{
    //처음 시작 함수
    elemMenuList.forEach((value)=>{
        value.addEventListener('click',onClickMenu);
    });
    elemMenuIcon.addEventListener('click',onClickMenu)
}


intit();