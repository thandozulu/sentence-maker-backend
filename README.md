# Sentence Maker Application Setup

This guide will help you set up the Sentence Maker application along with its dependencies. Follow the steps below to run the components in the specified order.
(docker-compose coming soon)

## 1. Set Up PostgreSQL with Two Databases

Start by running a PostgreSQL container with two databases: `sentence_db` and `word_db`. Use the following credentials:

- **Username:** admin
- **Password:** password
- **Port:** 5432

```bash
docker run -d \
  --name sentence-maker-postgres \
  -p 5432:5432 \
  -e POSTGRES_USER=admin \
  -e POSTGRES_PASSWORD=password \
  -e POSTGRES_DB=sentence_db \
  -e POSTGRES_DB=word_db \
  postgres:latest
```

## 2. Run Config-Server

Pull the config-server-repo
Change the spring.cloud.config.server.git.uri in the config server to reference the config-server-repo
Start the config-server application using: mvn spring-boot run 

## 3. Run API-Gateway
Start the api-gateway application using: mvn spring-boot run 

## 4. Run Sentence-Service
Start the sentence-service application using: mvn spring-boot run 

## 5. Run Word-Service
Start the word-service application using: mvn spring-boot run 

## 6. Run Sentence-Service
Start the sentence-service application using: mvn spring-boot run 

## 4. Run Sentence-Maker-Frontend
Start the sentence-maker-frontend application using: ng serve 
