

/*Comando para imagens na tela*/

function myFunction(imgs) {
    var expandImg = document.getElementById("expandedImg");
    var imgNome = document.getElementById("imgNome");
    var imgText = document.getElementById("imgText");
    expandImg.src = imgs.src;
    imgNome.innerHTML = imgs.alt;
    // imgText.innerHTML = imgs.TAG DO BANCO PARA A DESCRICAO
    expandImg.parentElement.style.display = "block";
}

/*Comando para imagens Curiosidades */



    function getImagePath(){
     return "src='img/easter/1.png'";
   }
   document.onload = function(){
       document.getElementById('someImage').src=getImagePath();
   };

