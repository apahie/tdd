package money

open class Money(protected val amount: Int, private val currency: String) {
    open fun times(multiplier: Int) : Money = Money(amount * multiplier, currency)
    fun currency() : String = currency
    override fun equals(other: Any?) : Boolean = other is Money && amount == other.amount && currency() == other.currency()

    companion object {
        fun dollar(amount: Int) : Money = Dollar(amount, "USD")
        fun franc(amount: Int) : Money = Franc(amount, "CHF")
    }
    override fun toString(): String = "$amount $currency"
}