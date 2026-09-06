class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         // Step 1: Count frequency of each number
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        // Step 2: Store the unique numbers in an array
        Integer[] arr = map.keySet().toArray(new Integer[0]);

        // Step 3: Sort according to frequency
        Arrays.sort(arr, (a, b) -> map.get(b) - map.get(a));

        // Step 4: Take first k elements
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = arr[i];
        }

        return result;
    }
    
}
