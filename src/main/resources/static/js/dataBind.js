let btnPlus=document.querySelector('#plus');
let btnMinus=document.querySelector('#minus');
let input=document.querySelector('#input');


btnPlus.addEventListener('click',()=>{
    input.value=parseInt(input.value)+1;
});
btnMinus.addEventListener('click',()=>{
    input.value=parseInt(input.value)-1;
});
