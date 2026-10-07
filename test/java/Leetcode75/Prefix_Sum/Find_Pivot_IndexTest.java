package leetcode75.prefix_sum.find_pivot_index;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class Find_Pivot_IndexTest {
    private final Solution solution = new Solution();

    @Disabled("Enable after implementing pivotIndex")
    @Test
    void returnsPivotIndexForExampleOne() {
        int[] nums = {1, 7, 3, 6, 5, 6};

        assertEquals(3, solution.pivotIndex(nums));
    }

    @Disabled("Enable after implementing pivotIndex")
    @Test
    void returnsNegativeOneForExampleTwo() {
        int[] nums = {1, 2, 3};

        assertEquals(-1, solution.pivotIndex(nums));
    }
}
