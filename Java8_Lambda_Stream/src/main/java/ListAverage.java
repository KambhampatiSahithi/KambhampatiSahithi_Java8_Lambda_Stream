import java.util.List;
import java.util.OptionalDouble;
public class ListAverage {
    public double avgCalculate(List<Integer> lst){
        return (float) lst.stream().mapToInt(Integer::intValue).average().getAsDouble();
    }
}
