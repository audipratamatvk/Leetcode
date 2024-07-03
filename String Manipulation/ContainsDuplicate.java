import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/contains-duplicate/description/
public class ContainsDuplicate {
  public static void main(String[] args) {

  }
  public boolean containsDuplicate(int[] nums) {
    Set<Integer> savedNumbers = new HashSet<>();
    for (int number : nums) {
      if (!savedNumbers.add(number))
        return true;
    }
    return false;
  }
}
