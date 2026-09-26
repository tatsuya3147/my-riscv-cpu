package practice

import chisel3._
import org.scalatest._
import chiseltest._

class ConcatrateTest extends FlatSpec with ChiselScalatestTester {
    "Concatrate" should "change arrange" in {
        test(new Concatrate) {c =>
         c.io.x_in.poke("h1234".U)
         println("out = " + c.io.x_out.peek().litValue.toString(16))
        }
    }
}