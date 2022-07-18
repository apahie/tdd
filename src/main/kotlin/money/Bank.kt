package money

class Bank {
    private val rates = HashMap<Pair, Int>()
    fun reduce(source: Expression, to: String) = source.reduce(this, to)
    fun addRate(from: String, to: String, rate: Int) {
        rates[Pair(from, to)] = rate
    }
    fun rate(from: String, to: String) = if (from == to) 1 else rates[Pair(from, to)]!!
}