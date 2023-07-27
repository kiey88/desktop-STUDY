/**
 * while문,do while문
 * while(조건식){
 *     실행문;
 * }
 */
// let i = 1;
// while( i <= 10 ){
//     console.log(`i = ${i}`)
//     i++
// }
// while( true ){
//     console.log(`i = ${i}`);
//     i++
//     if(i>10){
//         break;
//     }
// }
// let i = 100;
// do{
//     console.log(`hello`);
//     i++;
// } while( i<=10 )

while(i< 10){
    i++;
    if(i%2===0) continue;
    console.log(i);
}


// //구구단출력
// for(let i=2;i<=9;i++){
    
//     console.log(`${i}단`)
//     for(let j=1;j<=9;j++){
//         console.log(`${i} * ${j} = ${i*j}`)
//     };
// };