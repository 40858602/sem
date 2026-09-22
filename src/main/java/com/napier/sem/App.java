package com.napier.sem;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class App {
    public static void main(String[] args) {
        // Connect to MongoDB on local system using port 27000
        // Connect to MongoDB container named 'db'
        MongoClient mongoClient = new MongoClient("db", 27017);

        // Get database (will be created if it doesn't exist)
        MongoDatabase database = mongoClient.getDatabase("test");

        // Get collection
        MongoCollection<Document> collection = database.getCollection("test");

        // Create a document and insert it
        Document doc = new Document("name", "Fred Flintstone")
                .append("company", "Slate Rock and Gravel");
        collection.insertOne(doc);

        // Retrieve and print the document
        Document myDoc = collection.find().first();
        System.out.println(myDoc.toJson());
    }
}