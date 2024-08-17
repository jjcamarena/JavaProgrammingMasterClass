import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AtosInterview {
    public static void main(String[] args) {

        // First solution
        List<String> cities = List.of("New York", "Miami", "Atlanta", "Miami", "Atlanta", "Miami", "Miami", "Miami");
        Map map = new HashMap();
        for (int i = 0; i < cities.size(); i++) {
            map.put(cities.get(i), 1);
        }
        int count = 1;
        for (int i = 0; i < cities.size(); i++) {
            for (int j = i + 1; j < cities.size(); j++) {
                if (cities.get(i).equals(cities.get(j))) {
                    map.put(cities.get(i), count + 1);
                }
            }
        }

        // Second solution
        Map<String, Long> solution = cities.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        solution.forEach((name, cuenta) -> System.out.println(name + " => " + cuenta));
    }
}

/**
 * List<String> cities = List.of ("New York","Atlanta","Miami","Atlanta","Miami");
 *
 * Map map = new Map();
 *
 * for (int i = 0; i < cities.size(); i ++) {
 * 	int count = 1;
 * 	for (int j = i + 1; j < cities.size(); j++) {
 *   	if (cities[i] == cities[j]) {
 *     	count++;
 *       map.add(cities[i], count);
 *     }
 *   }
 * }
 *
 * // Result
 * New York,  1
 * Atlanta , 2
 * Miami , 2
 */