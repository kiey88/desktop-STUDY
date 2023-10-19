$(function(){
    //지역변수
    $('.main-menu').mouseenter(function(){
        $(this).find('.sub-menu').stop().slideDown();
    });
    $('.main-menu').mouseleave(function(){
        $(this).find('.sub-menu').stop().slideUp();
    });
    /** slide */
    setInterval(function(){
        $('.slideWrap').animate({'margin-left':'-100%'},function(){
            $('.slideItem:first').appendTo('.slideWrap');
            $('.slideWrap').css({'margin-left':'0'});
        })
    },3000)
    //팝업
    $('.notice li:nth-child(1)').click(function(){
        $('.popupBox').show();
    });
    $('.popup>button').click(function(){
        $('.popupBox').hide();
    });
});