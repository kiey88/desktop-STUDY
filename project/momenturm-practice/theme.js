//버튼 객체 가져오기
const elemBtn = document.querySelector('.theme');
//다크테마변수
const THEME_KEY = "darkTheme"
const onThemeClick=()=>{
    const elemHtml = document.documentElement;
    if(elemHtml.classList.contains('dark')){
        //다크모드일때 밝은모드로 변경
        elemHtml.classList.remove('dark');
        window.localStorage.setItem(THEME_KEY,"false");
    }else{
        //밝은모드일때 다크모드로 변경
        elemHtml.classList.add('dark');
        window.localStorage.setItem(THEME_KEY,"true");
    }
}
const theme_init=()=>{
    //초기테마설정
    const saveItem = window.localStorage.getItem(THEME_KEY);
    
    if(saveItem !== null){
        
        if(saveItem === 'true'){
            
            document.documentElement.classList.add('dark')
        }
    }
    elemBtn.addEventListener('click',onThemeClick);
}
// 시간을 업데이트하는 함수
function updateTime() {
    const now = new Date();
    let hours = now.getHours();
    const minutes = String(now.getMinutes()).padStart(2, '0');
    const seconds = String(now.getSeconds()).padStart(2, '0');
    
    let period = '오전';

    // 12시간 형식으로 변경하고 오전/오후 설정
    if (hours >= 12) {
    period = '오후';
    if (hours > 12) {
        hours -= 12;
    }
    } else if (hours === 0) {
    hours = 12;
    }

    const timeString = `${period} ${String(hours).padStart(2, '0')}:${minutes}:${seconds}`;
    
    // 'clock' 이라는 id를 가진 div의 내용을 업데이트
    document.getElementById('clock').innerText = timeString;
}

  // 즉시 시간 업데이트
updateTime();

  // 1초마다 시간 업데이트
setInterval(updateTime, 1000);


theme_init();