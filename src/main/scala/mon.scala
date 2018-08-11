import com.mongodb.DBCollection
import com.mongodb.casbah.{MongoClient, MongoCollection, MongoDB}
import com.mongodb.client.MongoDatabase
import org.bson.Document

object mon {
  def main(args: Array[String]): Unit = {
    try{
      val mongoClient : MongoClient = MongoClient()
      print("Cliente creado")
      val database: MongoDB = mongoClient.getDB("inteli")

      val collection : DBCollection = database.getCollection("inteli")

      println(collection.find().toArray)

      //val collection: DBCollection = database.getCollection("");

    }
    catch{
      case e:Exception =>
        print(e)

    }
  }
}
