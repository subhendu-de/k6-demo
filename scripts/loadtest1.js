import http from 'k6/http';
import { sleep } from 'k6';

export let options = {
    stages: [
      { duration: '20s', target: 10 },
      { duration: '20s', target: 5 },
      { duration: '20s', target: 0 },
    ],
  };

export default function () {
  http.get('https://ekartapi2021.azurewebsites.net/Products');
  sleep(1);
}
