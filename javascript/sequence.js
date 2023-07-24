/**
 * 순차구조
 * 두수의 덧셈과 곱셈 출력
 * 1. 두수를 정한다.3,6
 * 2. 연산 : 덧셈 3+6 
 * 3. 출력
 * 4. 연산: 곱셈 3*6
 * 5. 출력 
*/
/*1.번째*/
// const a=3;
// const b=6;
const a=3,b=6

/*2.연산*/
const add= a+b;

/*3.출력*/
console.log("a+b=",add);
console.log("a+b=",a+b);
/**4.연산 */
const mul = a*b;

/**5.출력*/
console.log("a*b=",mul);
console.log("a+b=",a*b);

const c = window.prompt("숫자를 입력하세요");
const d = prompt("숫자를 입력하세요");

console.log("c+d=",c+d);
console.log("c*d=",c*d);

document.write('<br>');
document.write("c+d=",c+d);
document.write("c*d=",c*d);

document.write('<br>');
document.write("c+d=",c+d);

document.write('<br>');
document.write("c*d=",c*d);

const e = parseInt(window.prompt("숫자를 입력하세요"));
const f = parseInt(prompt("숫자를 입력하세요"));

console.log("e+f=",e+f);
console.log("e*f=",e*f);

document.write('<br>');
document.write("e+f=",e+f);
document.write("e*f=",e*f);

document.write('<br>');
document.write("e+f=",e+f);
document.write('<br>');
document.write("e*f=",e*f);

document.write('<br>');
document.write('e-f=',e-f);
document.write('e/f=',e/f);