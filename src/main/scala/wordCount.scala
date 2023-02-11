import org.apache.spark.sql.SparkSession

import scala.collection.IterableOnce.iterableOnceExtensionMethods

object wordCount extends App {

// read csv file
  def readCSV(a:String):String = {
    val source = scala.io.Source.fromFile(a).mkString
    source
  }
// word count 
  def workCount(b: List[String])= {

    val word = b.flatMap( line => line.split(" "))
    val keyData = word.map( word => (word,1))
    val grouped = keyData.groupBy(_._1)

    val result = grouped.mapValues( list => {
      list.map(_._2).sum
    })

    result.foreach(println)

    result.keys.mkString


  }









}
