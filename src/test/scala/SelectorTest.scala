package practice

import chisel3._
import org.scalatest._
import chiseltest._

class SelectorTest extends FlatSpec with ChiselScalatestTester{
    "Selector" should "select Output signal" in {
        test(new Selector) {c =>
         c.io.sel.poke(true.B)
         c.io.a.poke(100.U)
         c.io.b.poke(200.U)

         println("out = " + c.io.out.peek().litValue.toString)
        
         c.io.sel.poke(false.B)
         println("out = " + c.io.out.peek().litValue.toString)
        
        
        }
    }
}