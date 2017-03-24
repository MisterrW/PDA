window.onload = function(){
  var helloText = document.getElementById("hello")

  helloText.innerText = "hi there"
  var retrievedText = document.getElementById("retrieved-text")

  if(localStorage.getItem("textEntered") !== null){
    console.log(localStorage)
    retrievedText.innerText = localStorage.getItem("textEntered")
  } else {
    retrievedText.innerText = "you haven't saved anything yet"
  }

  var input = document.getElementById("get-info")
  var go = document.getElementById("go-button")

  go.onclick = function(){
    var textEntered = input.value
    localStorage.setItem("textEntered", textEntered);
    console.log(textEntered)
    console.log(hello)
  }
}
