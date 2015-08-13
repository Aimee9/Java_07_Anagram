import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class AnagramTest {
  @Test
  public void anagram_single_single() {
    Anagrams display = new Anagrams();
    //Boolean result = true;
    //char value = "a";
    ArrayList result = new ArrayList();
    assertEquals(result, display.isAnagram("an", "na"));
  }
}
