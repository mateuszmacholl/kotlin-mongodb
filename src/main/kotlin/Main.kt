
import com.mongodb.BasicDBObject
import com.mongodb.MongoClient
import com.mongodb.MongoClientURI
import java.util.*





fun main(args: Array<String>) {
    val mongoClient = MongoClient(MongoClientURI("mongodb://localhost:27017"))
    val database = mongoClient.getDB("kotlinmongodb")
    val collection = database.createCollection("user", null)

    val numbers = Arrays.asList(27464, 747854)
    val user = BasicDBObject("_id", "id123")
            .append("username", "root")
            .append("address", BasicDBObject("street", "Fake street")
                    .append("city", "MyTown")
                    .append("state", "FA")
                    .append("zip", 12345))
            .append("numbers", numbers)
    collection.insert(user)
}