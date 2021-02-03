data class Card (val suit: CardSuit, val face: CardFace)

enum class CardSuit { HEART, SPADE, CLUB, DIAMOND }

enum class CardFace { ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING }
