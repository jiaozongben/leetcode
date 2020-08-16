import java.util.HashMap;
import java.util.Map;

public class BitSolution {
    /**
     * 136
     只出现一次的数字
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {


        if (nums == null) return 0;
        int x = 0;
        for (int n : nums) {
            x ^= n;
        }
        return x;
    }

    /**
     * 169
     多数元素
     */
    public int majorityElement(int[] nums) {

        Map<Integer,Integer > map = new HashMap<>();
        for (int i :nums)
        {

            if(!map.containsKey(i))
            {
                map.put(i,1);
            }else
            {
                map.put(i,map.get(i)+1);
            }
        }


        Map.Entry<Integer,Integer> majoyrityEntry= null;
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if ( entry.getValue() > nums.length/2)
            {
                majoyrityEntry = entry;
            }
        }
        return majoyrityEntry.getKey();
    }

}
