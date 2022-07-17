package money

class Money(internal val amount: Int, private val currency: String) : Expression {
    fun times(multiplier: Int) = Money(amount * multiplier, currency)
    fun plus(addend: Money) : Expression = Sum(this, addend)
    override fun reduce(to: String) = this
    fun currency() : String = currency
    override fun equals(other: Any?) : Boolean = other is Money && amount == other.amount && currency() == other.currency()
    override fun toString(): String = "$amount $currency"

    companion object {
        fun dollar(amount: Int) : Money = Money(amount, "USD")
        fun franc(amount: Int) : Money = Money(amount, "CHF")
    }
}