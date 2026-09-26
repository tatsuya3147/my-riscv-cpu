package practice

import chisel3._
import org.scalatest._
import chiseltest._

class SplitterTest extends FlatSpec with ChiselScalatestTester{
    "Splitter" should "decode instruction" in {
     test(new Splitter) { c =>
      c.io.inst.poke("h00500093".U)
      println("opcode = " + c.io.opcode.peek().litValue.toString)
      println("rd     = " + c.io.rd.peek().litValue.toString)
      println("funct3 = " + c.io.funct3.peek().litValue.toString)
    }
    }
}