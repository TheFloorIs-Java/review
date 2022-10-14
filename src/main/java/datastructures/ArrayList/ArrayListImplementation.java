package algorithms.ArrayList;

/**
 * hypothetically store an infinite amount of items, rather than being restricted by an array.
 * @param <T>
 */
public class ArrayListImplementation<T> {
    private T[] data;
    private int size;
    public ArrayListImplementation(){
        size = 0;
        data = (T[]) new Object[2];
    }

    /**
     * first, check if the data array can hold any more elements.
     * if not, create a new array of double the size and copy the old elements over.
     * then, add the new item.
     * @param item
     */
    public void add(T item){
        if(size==data.length){
            T[] newData = (T[]) new Object[size*2];
            for(int i = 0; i < size; i++){
                newData[i] = data[i];
            }
            data=newData;
        }
        data[size]=item;
        size++;
    }
    public T get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }
}
