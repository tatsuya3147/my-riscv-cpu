package practice

import chisel3._
import chisel3.util._

class Concatrate extends Module {
    val io = IO(new Bundle{
        val x_in = Input(UInt(16.W))
        val x_out = Output(UInt(16.W))
    })
    
    val a = io.x_in(7, 0)
    val b = io.x_in(15, 8)
    
    io.x_out := Cat(a, b)

}