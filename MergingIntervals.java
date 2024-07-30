import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergingIntervals {
        public int[][] merge(int[][] intervals) {
            // Sort the intervals by their start time
            Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

            List<int[]> result = new ArrayList<>();
            result.add(intervals[0]);

            for (int i = 1; i < intervals.length; i++) {
                // Get the last interval in the result list
                int[] lastInterval = result.get(result.size() - 1);

                // If the current interval overlaps with the last interval, merge them
                if (intervals[i][0] <= lastInterval[1]) {
                    lastInterval[1] = Math.max(lastInterval[1], intervals[i][1]);
                } else {
                    // Add the current interval to the result list
                    result.add(intervals[i]);
                }
            }

            // Convert the result list to a 2D array
            return result.toArray(new int[result.size()][]);
        }
}
