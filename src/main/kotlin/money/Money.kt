package money

abstract class Money(protected val amount: Int, private val currency: String) {
    abstract fun times(multiplier: Int) : Money
    fun currency() : String = currency
    override fun equals(other: Any?) : Boolean = other is Money && amount == other.amount && this::class == other::class

    companion object {
        fun dollar(amount: Int) : Money = Dollar(amount, "USD")
        fun franc(amount: Int) : Money = Franc(amount, "CHF")
    }
}