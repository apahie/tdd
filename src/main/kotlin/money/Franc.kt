package money

class Franc(private val amount: Int) {
    fun times(multiplier: Int) = Franc(amount * multiplier)
    override fun equals(other: Any?): Boolean = amount == (other as? Franc)?.amount
}