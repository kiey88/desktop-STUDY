$(function(){
    $('.main-menu').mouseenter(function(){
        $(this).find('.sub-menu').stop().slideDown();
    });
    $('.main-menu').mouseleave(function(){
        $(this).find('.sub-menu').stop().slideUp();
    });

    setInterval(function(){
        $('.slide-wrap').animate({'margin-top':'-100%'},function(){
            $('.slide-item:first').appendTo('.slide-wrap');
            $('.slide-wrap').css({'margin-top':'0'});
        });
    },3000);
});