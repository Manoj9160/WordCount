import org.apache.spark.sql.SparkSession
import org.mockito.Mockito.{RETURNS_DEFAULTS, RETURNS_MOCKS, mock, spy, when}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should
//Unit test cases
class wordCountTest extends AnyFlatSpec with should.Matchers {

  "readCSV" should "simple read" in {

   val len =  wordCount.readCSV("data/data.csv").length

    assert(len == 38)
  }

  "work count" should "spark" in {
   val data =
    List("Project Gutenberg’s"
    ,
    "Alice’s Adventures in Wonderland"
    ,
    "Project Gutenberg’s"
    ,
    "Adventures in Wonderland"
    ,
    "Project Gutenberg’s"
    )


    val count = wordCount.workCount(data)

    assert(count.length == 47)



  }

  "mock" should "mocked class" in {

    val mocked  = spy(new sampleTest)


    when(mocked.add(9)).thenReturn(100)

    assert(mocked.add(9) == 100)






  }


}
