package mailong245.StrategyPattern;

public class StrategyPatternApplication {
    public static void main(String[] args) {
        SortedList sortedList = new SortedList();
        sortedList.add("Java core");
        sortedList.add("Java design pattern");
        sortedList.add("Java library");
        sortedList.add("Java framework");

        sortedList.setStrategy(new MergeSort());
        sortedList.sort();

        sortedList.setStrategy(new QuickSort());
        sortedList.sort();
    }
}
