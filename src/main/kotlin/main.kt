fun main() {
    val deck = Deck()

    deck.shuffle()

    for (int in 0 until deck.size()+1) {
        val myCard = deck.dealOneCard()
        if (myCard != null) {
            println("My card is the ${myCard.face} of ${myCard.suit}")
        } else {
            println("The deck is empty")
        }
    }
}
