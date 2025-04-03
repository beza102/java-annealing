import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.beans.Transient;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class ProblemSolvingTest {
  @Test
  void testAllStartWithA_trueMixedCase() {
    // arrange
    Set<String> input = Set.of("armadillo", "Arcanine", "asbestos", "ABBA");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    //assert
    assertTrue(actual);
  }

  @Test
  void testAllStartWithA_falseOneElement() {
    // arrange
    Set<String> input = Set.of("armadillo", "utopia", "Arcanine");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertFalse(actual);
  }

  // TODO:
  // Come up with more tests to thoroughly test testAllStartWithA
  // Suggestions:
  //  - test an empty set
  @Test
  void testAllStartWithA_emptySet(){
    //arrange
    Set<String> input = Set.of();
    //act
    boolean actual =  ProblemSolving.allStartWithA(input);
    //assert
    assertTrue(actual);
  }
  //  - test a set where none start with A
  @Test
  void testAllStartWithA_nonStartWithA(){
    //arrange
    Set<String> input = Set.of("dog", "cat","lion");
    //act
    boolean actual = ProblemSolving.allStartWithA(input);
    //assert
    assertFalse(actual);
  }
  //  - test a set with only a single element
  @Test
  void testAllStartWithA_singleElement(){
    //arrange
    Set<String> input = Set.of("anger");
    //act
    boolean actual =ProblemSolving.allStartWithA(input);
    //assert
    assertTrue(actual);
  
  }

  //  - more you can think of!

  @Test
  void testHasEmptyString_falseAllNonEmpty() {
    // arrange
    Set<String> input = Set.of("armadillo", "Arcanine", "utopia");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testHasEmptyString_trueOneEmpty() {
    // arrange
    Set<String> input = Set.of("armadillo", "", "utopia", "yeah");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertTrue(actual);
  }


  // TODO:
  // Come up with more tests to thoroughly test hasEmptyString
  // Use your creativity here!
  @Test
  void testHasEmptyString_emptySet(){
    //arrange
    Set<String> input = Set.of();
    //act
    boolean actual = ProblemSolving.hasEmptyString(input);
    //assert
    assertFalse(actual);
  }

  @Test
  void testHasEmptyString_emptyStringAtBeginning(){
    //arrange
    Set<String> input = Set.of("", "red","blue");
    //act
    boolean actual = ProblemSolving.hasEmptyString(input);
    //assert
    assertTrue(actual);
  }

  @Test
  void testHasEmptyString_emptyStringAtEnd(){
    //arrange
    Set<String> input = Set.of("car", "plane", "");
    //act
    boolean actual = ProblemSolving.hasEmptyString(input);
    //assert
    assertTrue(actual);
  }

  @Test
  void testHasEmptyString_OnlyEmptyStrings(){
    //arrange
    Set<String> input = Set.of("", "", "");
    //act
    boolean actual = ProblemSolving.hasEmptyString(input);
    //assert
    assertTrue(actual);
  }




  @Test
  void testMaxLength_multipleWords() {
    // arrange
    Set<String> input = Set.of("by", "a", "commodius", "vicus");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(9, actual);
  }


  // TODO:
  // Come up with more tests to thoroughly test maxLength
  // Use your creativity here!
  @Test
  void testMaxLength_singleWord(){
    //arrange
    Set<String> input = Set.of("Hello");
    //act
    int actual = ProblemSolving.maxLength(input);
    //assert
    assertEquals(5, actual);
  }

  @Test
    Void testMaxLength_sameLength(){
      //arrange
      Set<String> input =Set.of("car", "dog", "pig");
      //act
      int actual = ProblemSolving.maxLength(input);
      //assert
      assertEquals(3, actual);

    }
  
  // TODO:
  // Come up with ALL tests to thoroughly test minLength
  // Use your creativity here, and consider looking back at the maxLength
  // tests for inspiration
  @Test
  void testMinLength_singleWord(){
    //arrange
    Set<String> input = Set.of("Music");
    //act
    int actual = ProblemSolving.maxLength(input);
    //assert
    assertEquals(5, actual);
  
  }

  @Test
  void testMinLength_moreWords(){
    //arrange
    Set<String> input = Set.of("cry", "dance", "sing");
    //act
    int actual = ProblemSolving.minLength(input);
    //assert
    assertEquals(3, actual);
  }

  @Test
  void testMinLength_sameLength(){
     //arrange
     Set<String> input =Set.of("car", "dog", "pig");
     //act
     int actual = ProblemSolving.minLength(input);
     //assert
     assertEquals(3, actual);

  }

  @Test
  void testMinLength_emptySet(){
    //arrange
    Set<String> input =Set.of();
    //act
    int actual = ProblemSolving.minLength(input);
    //assert
    assertEquals(Integer.MAX_VALUE, actual);
  }
}
