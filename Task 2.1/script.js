function checkDate(){
var GivenDate = document.getElementById("date")

var CurrentDate = new Date();
GivenDate = new Date(GivenDate);
if(GivenDate > CurrentDate){
    alert('Given date should not be greater than the current date.');
}else{
    alert('Thanks.');
}
}