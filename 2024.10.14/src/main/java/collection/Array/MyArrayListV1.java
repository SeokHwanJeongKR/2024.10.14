package collection.Array;

public class MyArrayListV1 {


    private static final int Default_Capacity = 5;

    private Object[] elementData;
    private int size;

    public MyArrayListV1() {
        Object[] elementData = new Object[Default_Capacity];
    }

    public MyArrayListV1(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int Size() {
        return size;
    }

    public void add(Object e){
        elementData[size++] = e;
        size++;
    }

    public Object get(int index) {
        return elementData[index];
    }

    public Object set(int index, Object element) {

    }
}
