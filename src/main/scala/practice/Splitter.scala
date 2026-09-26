package practice

import chisel3._

class Splitter extends Module {

    val io = IO(new Bundle{
        val inst = Input(UInt(32.W))
        val opcode = Output(UInt(7.W))
        val rd = Output(UInt(5.W))
        val funct3 = Output(UInt(3.W))
    })

    io.opcode := io.inst(6, 0)
    io.rd := io.inst(11, 7)
    io.funct3 := io.inst(14, 12)

}

