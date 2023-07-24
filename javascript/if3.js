let input = prompt('숫자를입력해주세요')
num = parseInt(input)
if(num<0){
    document.write('음수')
} else if(num>0){ 
    document.write('양수')
} else{
    document.write('0')
};