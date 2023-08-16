/**
 * for of:배열
 * for in:객체
 */

//for of - 배열의 값출력
let arr = ['a','b','c','d','e'];
// for(let i=0; i<arr.length; i++){
//     console.log(arr[i]);
// };

//of는 배열의 값을 각각 출력
for(let item of arr){
    console.log(item);
};

//for in - index와 key 출력
for( let item in arr){
    console.log(item);
};
let obj = {
    a:'aaa',
    b:'bbb',
    c:'ccc',
    d:'ddd'
};
//for in 은 객체의 key출력
for( let item in obj){
    console.log(item);
};
// of 는 객체를 읽지 못한다
// for( let item of obj){
//     console.log(item);
// };
// for each는 객체의 key와 index값, 자기자신 그대로를 출력 가능
//for each 메소드
arr.forEach((value,idx,callArr)=>{
    //code
    console.log(value);
    console.log(value,idx);
    console.log(callArr);
});