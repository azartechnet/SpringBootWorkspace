var url=require('url')
var adr='http://localhost:8081/default.html?year=2020&month=june';
var q=url.parse(adr,true)

console.log(q.host);//return localhost:8081
console.log(q.pathname);//return '/default.html'
console.log(q.search);//return 'years'

var qdata=q.query;//return an object{year,month}
console.log(qdata.month);