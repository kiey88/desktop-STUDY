/**
 * 배열(객체)
 */
// arr = ["사과","딸기","배","오렌지"]
// console.log(arr[2]);
// console.log(arr.length);
// for(let i=0; i<arr.length; i++){
//     console.log(arr[i])
// }
// let i =  0;
// let arr = [];
// for(let i=0; i<10; i++){
//     arr[i] = i +1
// }
// console.log(arr)

// let arr = [];
// for(let i=0; i<10; i++){
//     arr[i] = (i*10)+10
// }
// console.log(arr)

// let arr = [];
// let rev = [];
// for(let i=0; i<10; i++){
//     arr[i] = (i*10)+10
// }
// for(let j=0; j<arr.length ; j++){
//     rev[j] = arr[(arr.length-1)-j]
// }
// console.log(rev)

// const a=[1,2,3,4,5];
// // a = [1,2,3];
// a[0] = 9;
// console.log(a);

const arrOfarr = [[1,2,3],'aaa',true];
console.log(arrOfarr[0]);
console.log(arrOfarr[2]);
arrOfarr[3] = 5000;
arrOfarr[arrOfarr.length] = '끝';
arrOfarr.push('진짜끝');
console.log(arrOfarr);
let a = arrOfarr.pop();
arrOfarr.unshift('처음')
console.log(arrOfarr);
arrOfarr.shift();
console.log(arrOfarr);
// let data = arrOfarr.splice(1,2);
// console.log(data);
console.log(arrOfarr);
let data = arrOfarr.splice(1,2,3,"추가2","추가3");
console.log(data);
console.log(arrOfarr);
// let idx = arrOfarr.indexOf('추가2');
let idx = arrOfarr.indexOf('추가6');
//indexOf()에 입력값이 배열에 없으면 console출력시 -1 출력 
console.log(idx)
let temp = arrOfarr.includes('추가6');
console.log(temp);