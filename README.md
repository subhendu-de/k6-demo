### k6-demo
This repository contains the files and artifacts used for giving a k6 demo 

#### Running the influxdb and grafana container

```bash
docker-compose up influxdb grafana
```

#### Running the K6 container

```bash
docker-compose run k6 run /scripts/loadtest1.js
```
