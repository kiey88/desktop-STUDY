$(function(){
    //source 추가 $는 j쿼리
    /** header menu */
    $('.gnb > ul').mouseenter(function(){
        $('.sub-menu').slideDown();
    });
    $('.gnb > ul').mouseleave(function(){
        $('.sub-menu').slideUp();
    });

    /** image slide */
    setInterval(function(){
        $('.slidewrap').animate({'margin-top':'-300px'},function(){
            $('.item:first').appendTo('.slidewrap');
            $('.slidewrap').css({'margin-top':'0'});
        })
    },3000);

    /*popupbox show*/
    $('.notice > ul > li:first').click(function(){
        $('.popupbox').show();
        
    });
    $('.popup > button').click(function(){
        $('.popupbox').hide();
    });
})