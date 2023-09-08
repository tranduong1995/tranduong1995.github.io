function giathua(n){
    if(n === 0 || n === 1){
        return 1 ;
    }
   return n * giathua(n -1);
}

var n = parseInt(prompt("nhập n"))
console.log(giathua(n))