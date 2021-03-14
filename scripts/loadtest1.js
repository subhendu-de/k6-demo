import http from 'k6/http';

export let options = {
    stages: [
      { duration: '20s', target: 100 },
      { duration: '20s', target: 50 },
      { duration: '20s', target: 0 },
    ],
  };

export default function () {
  var res = http.get('http://empsvc:8080/all');
}
