// for(let i=1;i<=10; i++){
//     console.log('('+i+')'+'hello');
// }
// for(let i=9;i>0; i-=2){
//     console.log('('+i+')'+'hello');
// }
// for(let i=10;i>=0; i--){
//     console.log('('+i+')'+'hello');
// }

//구구단3단
value = 3
for(let i=1; i<=9; i++){
    console.log(value + '*' + i ,'=', value*i);
}
for(let i=1; i<=9; i++){
    // console.log('3*' + i +'='+ (3*i));
    console.log(`3 * ${i} = ${3*i}`);
}
//1부터100까지의 합을 계산하여 출력하라
let sum = 0;
for(let i=0; i<=100; i++){
    sum += i;
}
console.log(`1부터 100까지의 합 = ${sum}`)

let sum2 = 0;
for(let i=0; i<=100; i+=2){
    sum2 += i;
}
console.log(`1부터 100사이에 짝수의합 = ${sum2}`)
