# Mysql docker 설치

## 1. 정보 수정
- .env파일 계정정보 수정
- 필요하다면 my.cnf 설정정보 custom

## 2. 실행
``docker-compose up -d``

## 주의사항
- apple silicon의 경우 docker image 플랫폼을 명시하여 pull을 먼저 받을 것
```
# mysql 8버전
docker pull --platform linux/amd64 mysql:8.0.29

# mysql 5버전
docker pull --platform linux/amd64 mysql:5.7.38
```