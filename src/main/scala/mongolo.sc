import com.mongodb.casbah.MongoClient

try{
  val mongoClient : MongoClient = MongoClient()
  print("Conexion establecida")
}
catch {
case e:Exception =>
print("No se ha podido establecer")

}
