## 快速创建验证环境

### 创建网络
```shell
docker network create develop-network
```

### 创建 mysql 容器

```shell
docker pull mysql:5.7

docker run -d --network develop-network --network-alias docker-mysql --name docker-mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=123456 mysql:5.7
```

### 创建 xxl-job 容器

```shell
docker pull xuxueli/xxl-job-admin:2.4.0

docker run -e PARAMS="--spring.datasource.url=jdbc:mysql://docker-mysql:3306/xxl_job?useUnicode=true&characterEncoding=UTF-8&autoReconnect=true&serverTimezone=Asia/Shanghai --spring.datasource.username=root --spring.datasource.password=123456" -p 8090:8080  --network develop-network --network-alias docker-xxl-job --name xxl-job-admin  -d xuxueli/xxl-job-admin:2.4.0
```

### xxl-job 登录

登录地址：[xxl-job](http://127.0.0.1:8090/xxl-job-admin)

```txt
username: admin
password: 123456
```