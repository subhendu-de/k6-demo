### k6-demo
This repository contains the files and artifacts used for giving a k6 demo

## Setup k6 to run the load test

k6 requires following components to install
- Free open source k6 load testing tool
- InfluxDb docker container
- Grafana docker container

### Installation

- Step 1 - Install k6 tool [here](https://k6.io/open-source)
- Step 2 - Open Azure CLI Bash command interface from Azure Portal
- Step 3 - Run the following command to create the Azure Resource Group (this step is optional and can be skipped if opt for docker containers in the developer sandbox environment)

```sh
az group create --name k6loadtest --location southindia
```

- Step 5 - Run the following command to create the influxdb container instance. Once deployed, it is accessible http://k6influxdb.southindia.azurecontainer.io:8086/

```sh
az container create --resource-group k6loadtest --location southindia --name k6influxdb --image influxdb:1.8 --dns-name-label k6influxdb --ports 8086
```

- Step 6 - Run the following command to create the grafana container instance. Once deployed, it is accessible http://k6grafana.southindia.azurecontainer.io:3000/

```sh
az container create --resource-group k6loadtest --location southindia --name k6grafana --image grafana/grafana --dns-name-label k6grafana --ports 3000
```

- Step 7 - Run the following command to execute the load test in k6

```
k6 run --out influxdb=http://k6influxdb.southindia.azurecontainer.io:8086/k6bucket .\loadtest1.js
```

- Step 8 - Open grafana dashboard and set up the data source pointing to k6bucket
- Step 9 - Import the dashboard from the [repo](/grafana/dashboards/performance-test-dasboard.json)
