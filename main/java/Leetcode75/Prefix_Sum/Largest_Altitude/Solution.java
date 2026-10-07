package leetcode75.prefix_sum.largest_altitude;

public class Solution {
    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int highestAltitude = 0;

        for (int netGain : gain) {
            altitude += netGain;
            highestAltitude = Math.max(highestAltitude, altitude);
        }

        return highestAltitude;
    }
}
