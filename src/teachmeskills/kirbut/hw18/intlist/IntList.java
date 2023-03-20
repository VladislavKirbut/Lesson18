package teachmeskills.kirbut.hw18.intlist;

public interface IntList {
    int get(int index);
    int set(int index, int element);
    int size();
    void add(int element);
    int remove(int index);
    int lastIndexOf(int element);
}
