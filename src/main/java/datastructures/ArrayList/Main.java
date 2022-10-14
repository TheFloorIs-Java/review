package algorithms.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayListImplementation<String> list = new ArrayListImplementation();
        list.add("item 1");
        list.add("item 2");
        list.add("item 3");
        list.add("item 4");
        list.add("item 5");
        list.add("item 6");
        System.out.println(list.get(5));
    }
}
