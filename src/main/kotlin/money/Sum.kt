package money

data class Sum(internal val augend: Money, internal val addend: Money) : Expression {
    override fun reduce(to: String) : Money {
        val amount = augend.amount + addend.amount
        return Money(amount, to)
    }
}