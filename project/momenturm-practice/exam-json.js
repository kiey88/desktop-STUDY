const obj={
    name : 'hong',
    age : 20,
    skills : ['html','css','js']
};
//stringify-json형식을 기반으로 객체을 문자열로변환,
//parser- 문자열을 json형식을 기반으로한 객체로 변환
const json = JSON.stringify(obj);
console.log(json);
console.log(typeof json);

const parsed = JSON.parse(json);
console.log(parsed);
console.log(typeof parsed);