/**
 * function 함수명(){
 *     명령어 추가
 * }
 * 변수선언 = () => {
 *      명령어추가
 * }
*/

/**두수를 더하는 기능을 가진 함수를 구현하여 사용한다. */

/**
 * 2+3
 * 3+4
 * 4+5
 * 5+6
 * 6+7
 */

//함수 선언

// arrow함수는 함수 호출먼저 작성후 함수 선언해서 사용 할수 없다

const add = (a) => {
    console.log(`${a} + ${a} = ${a+a}`);
}
//함수 호출
add(1);


// function함수는 함수 호출먼저 작성후 함수 선언해서 사용 할수 있다
// add();
// function add(){
//     console.log("add function");
// }


//함수 호출
// add(2,3);

// for(let i=2; i<=6; i++){
//     add(i);
// }