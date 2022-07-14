package money

class Dollar(private val amount: Int) {
    fun times(multiplier: Int) = Dollar(amount * multiplier)
    override fun equals(other: Any?): Boolean = amount == (other as? Dollar)?.amount
}