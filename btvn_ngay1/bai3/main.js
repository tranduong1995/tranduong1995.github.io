function tranlate(messege){
    
    switch (messege){
        case 'VN':
            messege = 'xin chao';
            break;
        
        case 'EN' :
            messege = 'hello';
            break
          
        default:
            messege = 'không có kết quả';

    }
    return messege ;

}

let messege = 'VN';
console.log(tranlate(messege));

