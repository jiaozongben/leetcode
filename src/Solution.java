import java.util.*;

public class Solution {
    public static void main(String[] args) {
//        BitSolution sol = new BitSolution();
//
//        System.out.println(sol.singleNumber(new int[]{2, 2, 1}));
//
//        System.out.println(sol.majorityElement(new int[]{6,6,6,7,7}));
//        SearchSolution ssol = new SearchSolution();
//        System.out.println(ssol.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
//        DynamicSearch ds = new DynamicSearch();
////        System.out.println(ds.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
//        System.out.println(ds.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
//        Solution solution = new Solution();
//        solution.cal_count();



        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = 0;
        String path = "";
        int[] arr = new int[N];
        Map<Integer, Integer> input = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int temp = sc.nextInt();
            arr[i] = temp;

            input.put(i + 1, temp);
        }


        List<Integer> q = new ArrayList<>() ;
        for (int i = 1; i <= N; i++) {
            List<Integer> temp =  get_max_path(input,i,new ArrayList<>());
            if(temp.size() > q.size())
                q = temp;
        }

        String str = "";
        for (int i : q)
        {
            str +=i+ " ";
        }
        str = str.substring(0,str.length()-1);
        System.out.println(str);

    }


    public void meetting() {

    }

    public static List<Integer>  get_max_path(Map<Integer, Integer> map, int id, List<Integer> person) {
        person.add(id);
        Integer next = map.get(id);
        if (person.contains(next))
            return person;
        return get_max_path(map, next, person);

    }


    public void cal_count() {

        int count = 0;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();
        int Q = sc.nextInt();


        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            int temp = sc.nextInt();
            arr[i] = temp;
        }

        Arrays.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }

        System.out.println(count_time(arr, P, Q, count));
    }

    public int count_time(int[] arr, int P, int Q, int count) {


        Arrays.sort(arr);
        if (arr[arr.length - 1] == 0) {
            return count;
        } else {
            count++;

            if (arr[arr.length - 1] > 0)
                if (arr[arr.length - 1] - P > 0)
                    arr[arr.length - 1] = arr[arr.length - 1] - P;
                else
                    arr[arr.length - 1] = 0;
            for (int i = arr.length - 2; i >= 0; i--) {
                if (arr[i] > 0)
                    arr[i] = arr[i] - Q;
                else {
                    break;
                }
            }
            return count_time(arr, P, Q, count);
        }


    }


}
