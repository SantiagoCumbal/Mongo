package org.example;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.bson.Document;
import com.mongodb.client.FindIterable;
import com.mongodb.client.result.UpdateResult;
import com.mongodb.client.result.DeleteResult;


public class Main {
    //insert
    public static void main(String[] args) {
        try (MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017")) {
            MongoDatabase database = mongoClient.getDatabase("miBaseDeDatos");
            MongoCollection<Document> collection = database.getCollection("miColeccion");
            Document documento = new Document("nombre", "Juan")
                    .append("apellido", "Zaldumbide")
                    .append("edad", 31);
            collection.insertOne(documento);
            System.out.println("Documento insertado con éxito");
        }
    }
    //leer
}