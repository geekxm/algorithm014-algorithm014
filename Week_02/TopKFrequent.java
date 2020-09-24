import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TopKFrequent {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counter = IntStream.of(nums).boxed().collect(Collectors.toMap(e -> e, e -> 1, Integer::sum));
        List<Integer>[] freqList = new List[nums.length + 1];
        for (int i = 0; i < freqList.length; i++)
            freqList[i] = new ArrayList<>();
        counter.forEach((num, freq) -> freqList[freq].add(num));
        int[] result = new int[k];
        int index = 0;
        for (int i = freqList.length - 1; i > 0; i--) {
            for (int num : freqList[i]) {
                result[index++] = num;
                if (index >= k) return result;
            }
        }
        return result;
    }

}
