$(function(){
    $('.main-menu').mouseenter(function(){
        $(this).find('.sub-menu').stop().fadeIn();
    });
    $('.main-menu').mouseleave(function(){
        $(this).find('.sub-menu').stop().fadeOut();
    });
});