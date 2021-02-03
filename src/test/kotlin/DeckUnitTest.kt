import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class DeckUnitTest {

    var cut = Deck()

    @Test
    fun `shuffle is working`() {
        assertEquals(cut, Deck())
        cut.shuffle()
        assertNotEquals(cut, Deck())
    }

    @Test
    fun `deck is empty after getting all cards`() {
        emptyDeck()
        assert(cut.isEmpty())
    }

    private fun emptyDeck() {
        for (int in 0 until cut.size()) {
            cut.dealOneCard()
        }
    }

}
