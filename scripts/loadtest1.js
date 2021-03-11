import http from 'k6/http';
import { sleep } from 'k6';
import { Trend } from 'k6/metrics';

let durationTrend = new Trend('resp_duration');

export let options = {
    stages: [
      { duration: '20s', target: 10 },
      { duration: '20s', target: 5 },
      { duration: '20s', target: 0 },
    ],
  };

export default function () {
  var res = http.get('http://empsvc:8080/all');
  //durationTrend.add(res.timings.duration);
  //console.log('Response time was ' + String(res.timings.duration) + ' ms');
  //sleep(1);
}
