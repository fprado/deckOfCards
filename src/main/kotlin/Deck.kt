import kotlin.random.Random

class Deck {
    private val deck: MutableList<Card> = mutableListOf()

    init {
        for (suit in CardSuit.values())
            for (rank in CardFace.values())
                deck.add(Card(suit, rank))
    }

    fun size() = deck.size
    fun isEmpty() = deck.isEmpty()

    /**
     * Shuffles the cards list
     */
    fun shuffle() {
        for (i in 0 until deck.size) {
            val j = Random.nextInt(i + 1)
            val temp = deck[i].also { deck[i] = deck[j] }
            deck[j] = temp
        }
    }

    /**
     * Removes the first card form the cards list
     * @return Card if deck is not empty, null otherwise
     */
    fun dealOneCard(): Card? = if (deck.isNotEmpty()) deck.removeAt(0) else null


    override fun equals(other: Any?): Boolean {
        if (other !is Deck) return false

        for (i in 0 until deck.size) {
            if (deck[i].face != other.deck[i].face || deck[i].suit != other.deck[i].suit)
                return false
        }
        return true
    }
}
