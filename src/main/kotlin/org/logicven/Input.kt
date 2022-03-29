package org.logicven


data class Input(

    val userId: String,

    //  @field:Max(1000)
    val amount: Int,

    val currency: String,

    val accountFrom: String,

    val accountTo: String
)

data class Output(
    val passed: Boolean,
    val code: String?
)
