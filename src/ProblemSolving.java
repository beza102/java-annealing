import java.util.Set;

public class ProblemSolving {

  /**
   * Returns whether every word in the set starts with the letter A (either
   * upper or lower case).
   * 
   * Edge case: If set is empty, return true.
   * 
   * @param words a set of words
   * @return true if every word starts with A (case-insensitive), false otherwise.
   */
  public static boolean allStartWithA(Set<String> words) {
    //check if set is empty and return true
    if (words.isEmpty()){
      return true;
    }

    //loop through each word
    for(String word : words){
      //If word is empty or dont start with A return false
      if(word.isEmpty() || Character.toLowerCase(word.charAt(0)) != 'a'){
        return false;
      }
    }

    return true;


  }

  /**
   * Returns whether there exists at least one empty string in the set of words.
   * 
   * Edge case: If set is empty, return false.
   * 
   * @param words a set of words
   * @return true if there is at least one empty string, false otherwise
   */
  public static boolean hasEmptyString(Set<String> words) {
    //return true if there is an empty string, false if not
    return words.contains("");
  }

  /**
   * Returns the length of the longest word in the set.
   * 
   * Edge case: If the set is empty, return 0
   * 
   * @param words a set of words
   * @return the maximum length of a word in the set
   */
  public static int maxLength(Set<String> words) {
    int maxLength = 0;
    for(String word : words){
      if(word.length() > maxLength){
        maxLength = word.length();
      }
      

      }
    
    return maxLength;
  }

 /**
   * Returns the length of the shortest word in the set.
   * 
   * Edge case: if set is empty, return Integer.MAX_VALUE
   * 
   * @param words a set of words
   * @return the minimum length of a word in the set
   */
  public static int minLength(Set<String> words) {
    //if set empty return Max_VALUE
    if(words.isEmpty()){
      return Integer.MAX_VALUE;
    }

    int minLength = Integer.MAX_VALUE;

    for(String word : words){
      //update minLength if word is shorter
      minLength = Math.min(minLength, word.length());
    }


    return minLength;
  }
}