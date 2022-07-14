package money

class Dollar(var amount: Int) {
    fun times(multiplier: Int) = Dollar(amount * multiplier)
    override fun equals(other: Any?): Boolean = amount == (other as? Dollar)?.amount
}