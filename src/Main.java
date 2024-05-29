//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Heap<Integer> hp= new Heap<>();
        hp.add(2);
        hp.add(3);
        hp.add(8);
        hp.add(4);
        hp.add(7);
        hp.add(1);
        hp.add(5);
        System.out.println(hp.get_heap_array());
        hp.remove_smallest();
        System.out.println(hp.get_heap_array());

        hp.remove_smallest();
        System.out.println(hp.get_heap_array());

        hp.remove_smallest();
        System.out.println(hp.get_heap_array());

        hp.remove_smallest();
        System.out.println(hp.get_heap_array());

        hp.remove_smallest();
        System.out.println(hp.get_heap_array());

        hp.remove_smallest();
        System.out.println(hp.get_heap_array());

        hp.remove_smallest();
        System.out.println(hp.get_heap_array());


    }
}