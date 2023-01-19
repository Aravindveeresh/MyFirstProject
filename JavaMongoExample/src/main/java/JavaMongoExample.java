import com.mongodb.MongoClient;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class JavaMongoExample {

	public static void main(String[] args) {
		// Creating a Mongo client 
		MongoClient mongoClient = new MongoClient( "mongodb+srv://Aravindveeresh:<Av_expleo@2907>@cluster0.n01yfca.mongodb.net/?retryWrites=true&w=majority" ); 
		System.out.println("Created Mongo Connection successfully"); 
		
		MongoDatabase db = mongoClient.getDatabase("youtube");
		System.out.println("Get database is successful");
		
		System.out.println("Below are list of databases present in MongoDB");
		// To get all database names        
		 MongoCursor<String> dbsCursor = mongoClient.listDatabaseNames().iterator();
		   while(dbsCursor.hasNext()) {
		          System.out.println(dbsCursor.next());
		      }

	}

}
