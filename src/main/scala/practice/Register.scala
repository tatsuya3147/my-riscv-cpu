package practice

import chisel3._


class Register extends Module {
    val io = IO(new Bundle{
        val reg = Output(UInt(8.W))
    })

    val reg = RegInit(0.U(8.W))
    reg := reg + 1.U
    io.reg := reg
}
