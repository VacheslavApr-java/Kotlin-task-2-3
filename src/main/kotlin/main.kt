fun main() {
    val payment = 1001.0
    var totalPrice = 0.0
    val standartDiscount = 100.0
    val maxDiscount = 0.05
    val premiumDiscount = 0.01
    val isOftSale = true

    println("Ты готов заплатить: $payment руб.")

    if (payment > 1_000 && payment <= 10_000) {
        totalPrice = payment - standartDiscount
        println("Уже лучше! Поймал стандартную скидку $standartDiscount руб.! -  $totalPrice руб.")
    } else if (payment > 10_000) {
        totalPrice = payment - payment * maxDiscount
        println("Это просто мощь!!! Держи скидку 5%! $totalPrice руб.")
    } else {
        totalPrice = payment
        println("Эх... Цена без скидки: $payment руб.")
    }

    if (isOftSale) {
        totalPrice -= totalPrice * premiumDiscount
        println("Плюшка настоящим меломанам! Плюс доп.скидка 1%! -  $totalPrice руб.")
    }
}
