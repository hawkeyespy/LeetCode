package leetcode75.prefix_sum.largest_altitude;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Largest_AltitudeTest {
    private final Solution solution = new Solution();

    @Test
    void returnsHighestAltitudeForExampleOne() {
        int[] gain = {-5, 1, 5, 0, -7};

        assertEquals(1, solution.largestAltitude(gain));
    }

    @Test
    void returnsHighestAltitudeForExampleTwo() {
        int[] gain = {-4, -3, -2, -1, 4, 3, 2};

        assertEquals(0, solution.largestAltitude(gain));
    }
}
