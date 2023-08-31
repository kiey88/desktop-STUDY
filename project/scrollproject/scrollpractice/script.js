const elemBg = document.querySelectorAll('.bg')
const elemTown = document.querySelectorAll('.town>img')
const elemSun = document.querySelector('.sun')
const elemMoon = document.querySelector('.moon')
const changeBgImage = (percent)=>{
    const obj = document.querySelector('.active');
    obj.classList.remove('active');
    if(percent >= 0 && percent < 25){
        elemBg[0].classList.add('active');
        elemSun.style.transform = "rotate(-90deg)"
        elemSun.style.opacity = "0"
        
    } else if(percent >= 25 && percent < 50){
        elemBg[1].classList.add('active');
        elemSun.style.transform = "rotate(-35deg)"
        elemSun.style.opacity = "1"
        
    } else if(percent >= 50 && percent < 75){
        elemBg[2].classList.add('active');
        elemSun.style.transform = "rotate(35deg)"
        elemSun.style.opacity = "1"
        
        elemMoon.style.transform = "rotate(70deg)"
    } else if(percent >= 75 && percent <= 100){
        elemBg[3].classList.add('active');
        elemSun.style.transform = "rotate(90deg)"
        elemSun.style.opacity = "0"
        
        
    }
}
const changeTown = (percent) => {
    
    elemTown.forEach((value)=>{
        value.classList.remove('active');
    })

    if(percent >= 0 && percent < 50){
        elemTown[0].classList.add('active'); 
    } else if(percent >= 50 && percent <= 100){
        elemTown[1].classList.add('active');
    } 
} 
const changeMoon=(percent)=>{
    if(percent >= 75 && percent <= 100){
        elemMoon.classList.add('show');
    } else{
        elemMoon.classList.remove('show');
    }
}
const onScrollEvent =()=>{
    const{scrollHeight,clientHeight,scrollTop} = document.documentElement;
    const realHeight = scrollHeight - clientHeight
    const percent = Math.floor(( scrollTop / realHeight)*100);
    changeBgImage(percent);
    changeTown(percent);
    changeMoon(percent);
}

const init =()=>{
    window.addEventListener('scroll',onScrollEvent)
    
}
init();