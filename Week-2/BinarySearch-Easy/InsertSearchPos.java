import java.util.List;

public class InsertSearchPos {
    public int searchInsert(List<Integer> nums, int target) {
        int left = 0;
        int right = nums.size() - 1;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums.get(mid) == target) {
                return mid;
            } else if (nums.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (nums.get(left) < target) {
            return left + 1;
        } else {
            return left;
        }
    }
}
