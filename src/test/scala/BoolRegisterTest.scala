package practice

import chisel3._
import org.scalatest._
import chiseltest._

class BoolRegisterTest extends FlatSpec with ChiselScalatestTester {
    "BoolRegister" should "if en count up" in {
        test(new BoolRegister) { c =>
        c.io.en.poke(true.B)
        for(i <- 0 until 9){
            c.clock.step(1)
            println("reg = " + c.io.reg.peek().litValue.toString)
        }
        c.io.en.poke(false.B)
        for(i <- 0 until 9){
            c.clock.step(1)
            println("reg = " + c.io.reg.peek().litValue.toString)
        }
        }
    }
}