import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SearchSolution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        Set set = new HashSet();
        for (int n : nums) {
            set.add(n);
        }

        List<Integer> l = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                l.add(i);
            }
        }
        return l;
    }


}
