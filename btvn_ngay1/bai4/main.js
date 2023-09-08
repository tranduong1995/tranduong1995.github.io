function catChuoi(str){
    if(str.length <= 15){
        return str ;
    }else{
        return str.substring(0,10) + "..." ;
    
    }


}
var str = 'djdhjdhjhddskhddhj';
console.log(catChuoi(str));