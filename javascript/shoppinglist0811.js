const elemSmall = document.querySelectorAll('.small>img');
const elemPrev = document.querySelector('button:nth-of-type(1)');
const elemNext = document.querySelector('button:nth-of-type(2)');

let imgIndex = 1;

const showSmallBorder = (obj) => {
    
    for( let i=0; i<elemSmall.length ; i++){
        elemSmall[i].style.outline = '';
    };
    obj.style.outline = '2px solid blue';
};
const btnImgChange = (obj) => {    
/**
 * path = obj.getAttribute('src'); 코드에서 obj는 작은 이미지의 DOM 
 * 요소를 참조하며, getAttribute('src')는 그 요소의 src 속성 값을 
 * 가져오는 메서드입니다. 즉, path 변수에는 클릭된 작은 이미지의 소스 
 * 경로, 즉 이미지 파일의 URL이 저장됩니다. */
    let path = obj.getAttribute('src');
    let bigImg = document.querySelector('.imgwrap>img');
    bigImg.setAttribute('src',path);
    showSmallBorder(obj);
};
const onClickSmall = (event) => {
    /**
     * 여기서 event.target은 이벤트가 발생한 DOM 요소를
     *  참조합니다. 이 경우, 사용자가 클릭한 작은 이미지
     * (.small > img)가 됩니다.
     * JavaScript에서 이벤트 객체는 이벤트에 
     * 대한 여러 정보를 포함하고 있는데, 그 중 target
     *  프로퍼티는 이벤트가 발생한 요소를 가리키고 
     * 있습니다. 위 코드에서 event.target을 사용하면    
     * 클릭한 작은 이미지 요소에 직접 접근할 수 있으며, 
     * 그것을 통해 해당 이미지의 src 속성과 같은 다른 
     * 정보를 가져올 수 있습니다.
     *  클래스 small의 
     * <img src="../image/image-01.png" alt="image-01" style></img>
    */
    console.log(event.target);
    btnImgChange(event.target);    
}
// for(let i = 0 ; i < elemSmall.length ; i ++){
//     elemSmall[i].addEventListener('click',onClickSmall);

// }
elemSmall.forEach((value)=>{
    //반복코드
    value.addEventListener('click',onClickSmall)
});
elemPrev.addEventListener('click',()=>{
    console.log('click prev')
    imgIndex--;
    if(imgIndex<=1){
        imgIndex = 1;
    };
    btnImgChange(elemSmall[imgIndex-1]);
});
elemNext.addEventListener('click',()=>{
    console.log('click next')
    imgIndex++
    if(imgIndex >= elemSmall.length){
        imgIndex = elemSmall.length;
    };
    btnImgChange(elemSmall[imgIndex-1]);
});
btnImgChange(elemSmall[imgIndex-1]);