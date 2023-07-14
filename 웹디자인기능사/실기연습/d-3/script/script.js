$(function(){
    /*** 동작하는 기능 */
    $('.tabmenu > li').click(function(){
        $('.tabmenu > li').removeClass('tabon');
        $(this).addClass('tabon');
        /**tabitem change */
        let idx = $(this).index();
        console.log( idx );
        $('.tabitem > ul').hide().removeClass('tabon');
        $('.tabitem > ul').eq(idx).show().addClass('tabon');
    });
    /** slide */
    setInterval(function(){
        $('.slideitem:first').fadeOut(3000).next().fadeIn(3000);
        $('.slideitem:first').appendTo('.slidewrap');
    },4000);
    /** menu */
    $('.mainmenu').mouseenter(function(){
        $(this).find('.submenu').stop().slideDown();
    });
    $('.mainmenu').mouseleave(function(){
        $(this).find('.submenu').stop().slideUp();
    });
})
