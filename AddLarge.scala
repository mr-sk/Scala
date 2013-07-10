import scala.actors.Actor._

object Main {

    def randomArrayCreation(n: Int): Array[Int] = {
            // http://www.scala-lang.org/api/2.7.7/scala/Range.html
            val range = 0 to n/2
            var a:Array[Int] = new Array[Int](n)

            def getRndInt(range: Range): Int = {
                val rnd = new scala.util.Random

                return rnd.nextInt(range.length)

            }

            for (index <- 0 to a.length - 1) a(index) = (getRndInt(range))

            return a
    }

    def main(args: Array[String]) {
        println("main...")
    }
}

//def sumOf()