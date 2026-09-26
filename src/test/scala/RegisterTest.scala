package practice

import chisel3._
import org.scalatest._
import chiseltest._

class RegisterTest extends FlatSpec with ChiselScalatestTester {
    "Register" should "count up reg" in {
        test(new Register) { c =>
        for (i <- 0 until 8) {
            c.clock.step(1)
            println("reg = " + c.io.reg.peek().litValue.toString)
        }
        }
    }

}
