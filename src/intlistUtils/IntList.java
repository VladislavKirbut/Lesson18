package intlistUtils;

public interface IntList {
    int get(int index);
    int set(int index, int element);
    int size();
    void add(int element);
    int remove(int index);
    IntArrayList subList(int startIndexInclusive, int endIndexExclusive);
    IntArrayList subList(int startIndexInclusive);
    int lastIndexOf(int element);
}
