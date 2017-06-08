package com.example.demo;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;


public class MongoDBConnection {
	
	 MongoClient mongoClient = new MongoClient(new ServerAddress("localhost", 27017));
	 DB db = mongoClient.getDB("test");
	 DBCollection coll = db.getCollection("Animals"); 
	 DBObject myDoc = coll.findOne();
	 DBCursor cursor1 = coll.find(); 
	 
	 
	// System.out.println("Spring Boot Application start");
	/* DBCursor cursor = coll.find();
	 while(cursor.has)
	 //DBCursor cursor = coll.find();
    
     while (cursor.hasNext()) { 
        System.out.println("Inserted Document: "+i); 
        System.out.println(cursor.next()); 
        i++;
     }
*/
		 
}
