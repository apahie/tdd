package money

class Money(private val amount: Int, private val currency: String) {
    fun times(multiplier: Int) : Money = Money(amount * multiplier, currency)
    fun currency() : String = currency
    override fun equals(other: Any?) : Boolean = other is Money && amount == other.amount && currency() == other.currency()

    companion object {
        fun dollar(amount: Int) : Money = Money(amount, "USD")
        fun franc(amount: Int) : Money = Money(amount, "CHF")
    }
    override fun toString(): String = "$amount $currency"
}