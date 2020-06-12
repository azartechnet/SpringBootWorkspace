var fs=require('fs')
//create an empty file named myfile2.txt
fs.open('myfile2.txt','w',function(err,file){
    if(err) throw err;
    console.log('Saved');
});