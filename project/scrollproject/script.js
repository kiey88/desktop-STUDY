const elemBg = document.querySelectorAll('#wrapper>div')

const onScrollEvent =()=>{
    const{scrollHeight,clientHeight,scrollTop} = document.documentElement;
    const realHeight = scrollHeight - clientHeight
    const percent = Math.floor(( scrollTop / realHeight)*100);
    console.log(percent)
    if ( 25 < percent ){
        
        elemBg[0].classList.remove('active')
        elemBg[1].classList.add('active')
    } else if (50 < percent){
        elemBg[1].classList.remove('active')
        elemBg[2].classList.add('active')
    } else if (75 <percent ){
        elemBg[2].classList.remove('active')
        elemBg[3].classList.add('active')
    }
}

const init =()=>{
    window.addEventListener('scroll',onScrollEvent)
    elemBg[0].classList.add('active')
}
init();