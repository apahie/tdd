package money

abstract class Money(protected val amount: Int) {
    abstract fun times(multiplier: Int) : Money
    override fun equals(other: Any?) : Boolean = other is Money && amount == other.amount && this::class == other::class

    companion object {
        fun dollar(amount: Int) : Money = Dollar(amount)
        fun franc(amount: Int) : Money = Franc(amount)
    }
}