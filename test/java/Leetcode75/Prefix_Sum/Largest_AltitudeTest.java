package leetcode75.prefix_sum.largest_altitude;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Largest_AltitudeTest {
    private final Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("altitudeExamples")
    void returnsHighestAltitude(int[] gain, int expectedAltitude) {
        assertEquals(expectedAltitude, solution.largestAltitude(gain));
    }

    private static Stream<Arguments> altitudeExamples() {
        return Stream.of(
                Arguments.of(new int[] {-5, 1, 5, 0, -7}, 1),
                Arguments.of(new int[] {-4, -3, -2, -1, 4, 3, 2}, 0));
    }
}
