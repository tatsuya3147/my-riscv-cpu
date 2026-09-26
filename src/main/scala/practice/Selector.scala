package practice

import chisel3._


class Selector extends Module{
    val io = IO(new Bundle{
        val sel = Input(Bool())
        val a = Input(UInt(8.W))
        val b = Input(UInt(8.W))
        val out = Output(UInt(8.W))

    })

    when(io.sel){
        io.out := io.a    
    }.otherwise{
        io.out := io.b
    }

    //io.out := Mux(io.sel, io.a, io.b)

}