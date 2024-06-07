package ru.netology

import kotlin.time.times

fun main() {
    val minCommission = 35
    val commission = 0.075 // 0.75 процента
    val amount: Int = 12348 // сумма перевода
    val cashCommission = if (amount * commission < minCommission) minCommission
    else (amount * commission).toInt()

    println("Ваша комиссия за перевод составит $cashCommission рублей")

}