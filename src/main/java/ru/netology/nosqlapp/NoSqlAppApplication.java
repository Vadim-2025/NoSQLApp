package ru.netology.nosqlapp;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class NoSqlAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(NoSqlAppApplication.class, args);

    }
}
