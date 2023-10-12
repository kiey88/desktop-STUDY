const elemTodoForm = document.querySelector('#todoForm');
const elemUl = document.querySelector('.todoUl');
const TODO_KEY = 'TODOS';
let arrTodo = [];

const saveLocalStorage = () => {
    const txt = JSON.stringify(arrTodo);
    console.log("stringfy",txt);
    localStorage.setItem(TODO_KEY,txt);
}
const readLocalStorage = () => {
    const read = localStorage.getItem(TODO_KEY);
    console.log("read",read)
    if( read ) {
        const obj = JSON.parse(read);
        console.log("parse",read);
        obj.forEach( (value) => {
            console.log('value',value);
            addTodoList(value.id,value.txt);
        });
    }    
}
const saveTodos = (id,txt) => {
    const obj = {
        id,txt
    };
    arrTodo.push(obj);
}
const onEventTodoDel = (event) => {
    const obj = event.target.parentElement;
    obj.remove();
    arrTodo = arrTodo.filter((value)=>{
        return value.id != obj.id
    });
    saveLocalStorage();
}
const addTodoList = (id,txt)=>{    
    const btn =document.createElement('button');
    btn.textContent = 'x';
    btn.addEventListener('click',onEventTodoDel);
    const span = document.createElement('span');
    span.textContent = txt;
    const li = document.createElement('li');  //button,span
    li.appendChild(btn);
    li.appendChild(span);
    elemUl.appendChild(li);
    li.id = id;
    saveTodos(id,txt);
}
const onEventFormSubmit = (event) => {
    event.preventDefault();   
    const elemInput = elemTodoForm.querySelector('input');    
    const txt =elemInput.value;
    elemInput.value = '';
    addTodoList(Date.now(),txt); 
    saveLocalStorage();
}
const todos_init = () => {
    readLocalStorage();
    elemTodoForm.addEventListener('submit',onEventFormSubmit);    
}
todos_init();