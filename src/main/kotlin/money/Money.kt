package money

open class Money(internal val amount: Int) {
    override fun equals(other: Any?): Boolean = other is Money && amount == other.amount
}