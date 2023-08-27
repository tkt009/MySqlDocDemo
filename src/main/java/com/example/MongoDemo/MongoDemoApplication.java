package com.example.MongoDemo;

import com.example.MongoDemo.model.Demo;
import com.example.MongoDemo.service.DemoService;
import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.mysql.cj.xdevapi.*;

import java.util.logging.Logger;

@SpringBootApplication
public class MongoDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoDemoApplication.class, args);
		Logger.getLogger("MainClass").info("%%%% app started %%%%");

		//connectToMySqlDb();
	}

	public static void connectToMySqlDb(){
		// Connect to server
		/*Session mySession = new SessionFactory().getSession("mysqlx://localhost:33060/demo?user=root&password=tulasi123**");

		Schema myDb = mySession.getSchema("demo");

// Create a new collection 'my_collection'
		//
		Collection myColl = myDb.getCollection("my_collection");*/


// Insert documents
//		myColl.add("{ \"name\":\"Laurie\", \"age\":19 }").execute();
//		myColl.add("{ \"name\":\"Nadya\", \"age\":54 }").execute();
//		myColl.add("{ \"name\":\"Lukas\", \"age\":32 }").execute();

		Demo d1 = new Demo("Flourie",19,true);
		Demo d2 = new Demo("Nadie",54,false);
		Demo d3 = new Demo("Luke",32,false);



//		DbDoc doc1 = new DbDocImpl().add("name", new JsonString().setValue("Flourie"))
//				.add("age", new JsonNumber().setValue("19"))
//				.add("isStudent",JsonLiteral.TRUE);
//
//		DbDoc doc2 = new DbDocImpl().add("name", new JsonString().setValue("Nadie"))
//				.add("age", new JsonNumber().setValue("54"))
//				.add("isStudent",JsonLiteral.FALSE);
//
//		DbDoc doc3 = new DbDocImpl().add("name", new JsonString().setValue("Luke"))
//				.add("age", new JsonNumber().setValue("32"))
//				.add("isStudent",JsonLiteral.FALSE);
//
//		myColl.add(doc1).execute();
//		myColl.add(doc2).execute();
//		myColl.add(doc3).execute();



// Find a document

//		DocResult docs = myColl.find("name like :name AND age < :age")
//				.bind("name", "F%").bind("age", 20).execute();
//
//// Print document
//		DbDoc doc = docs.fetchOne();
//		System.out.println(doc);

// Drop the collection
		//myDb.dropCollection("my_collection");
	}

}
