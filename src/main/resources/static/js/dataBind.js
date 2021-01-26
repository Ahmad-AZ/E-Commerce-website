
// let btnPlus = document.querySelector('#plus');
// let btnMinus=document.querySelector('#minus');
// let btnInput=document.querySelector('#quantityValue');
//
// console.log(btnInput,btnMinus,btnPlus);
// btnPlus.addEventListener('click',function () {
//
//     btnInput.value=parseInt(btnInput.value)+1;
// });
//
//
// btnMinus.addEventListener('click',function () {
//     if (btnInput.value<=0){
//         btnInput.value=0;
//     }
//     else {
//
//         btnInput.value=parseInt(btnInput.value)-1;
//     }
// });




function increment() {

    var element =document.getElementById('quantityValue');
    console.log(element);
    var value = element.innerHTML;
    ++value;

    document.getElementById('quantityValue').innerHTML=value;

}
function decrement() {
    var element = document.getElementById('quantityValue');
    var value = element.innerHTML;
    if (value<=1){
        document.getElementById('quantityValue').innerHTML='1';
    }
    else {
        value=value-1;
        document.getElementById('quantityValue').innerHTML=value;

    }


}

