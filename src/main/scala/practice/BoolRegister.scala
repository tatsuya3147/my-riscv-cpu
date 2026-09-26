package practice

import chisel3._


class BoolRegister extends Module {
    val io = IO(new Bundle{
        val en = Input(Bool())
        val reg = Output(UInt(8.W))
    })

    val reg = RegInit(0.U(8.W))
    
    when(io.en){
        reg := reg + 1.U
    }
        io.reg := reg
}