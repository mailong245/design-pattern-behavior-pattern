package mailong245.StrategyPattern;

import java.util.List;

public class QuickSort implements SortStrategy {

    @Override
    public <T> void sort(List<T> items) {
        System.out.println("---------------------------");
        System.out.println(items);
        System.out.println("Quick sort");
    }
}
