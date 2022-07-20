package money

class Money(internal val amount: Int, private val currency: String) : Expression {
    override fun times(multiplier: Int) : Expression = Money(amount * multiplier, currency)
    override fun plus(addend: Expression) : Expression = Sum(this, addend)
    override fun reduce(bank: Bank, to: String) : Money {
        val rate = bank.rate(currency, to)
        return Money(amount / rate, to)
    }
    fun currency() : String = currency
    override fun equals(other: Any?) : Boolean = other is Money && amount == other.amount && currency() == other.currency()
    override fun toString(): String = "$amount $currency"

    companion object {
        fun dollar(amount: Int) : Money = Money(amount, "USD")
        fun franc(amount: Int) : Money = Money(amount, "CHF")
    }
}