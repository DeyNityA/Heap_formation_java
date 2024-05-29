import java.util.*;

public class Heap<T extends Comparable> {
    private ArrayList<T> arr;
    public Heap(){
        arr= new ArrayList<>();
    }

    private int parent(int node){
        return (node-1)/2;
    }
    private int left_child(int node){
        return 2*node+1;
    }
    private int right_child(int node){
        return 2*node+2;
    }
    private void upheap(int n){
        if(n==0) return;
        if(arr.get(n).compareTo(arr.get(parent(n)))<0) Collections.swap(arr,n,parent(n));
        else return;
        upheap(parent(n));
    }
    private void downheap(int n){
        if(left_child(n)>arr.size()-1 && right_child(n)>arr.size()-1) return;
        int min=0;
        if(left_child(n)>arr.size()-1 && right_child(n)<=arr.size()-1) min=right_child(n);
        else if(left_child(n)<=arr.size()-1 && right_child(n)>arr.size()-1) min=left_child(n);
        else {
            if (arr.get(left_child(n)).compareTo(arr.get(right_child(n))) > 0) min = right_child(n);
            else min = left_child(n);
        }

        if(arr.get(n).compareTo(arr.get(min))>0) Collections.swap(arr,n,min);
        else return;
        downheap(min);
    }
    public void add(T no){
        arr.add(no);
        this.upheap(arr.size()-1);
    }

    public void remove_smallest(){
        if(arr.isEmpty()) return;
        arr.set(0,arr.getLast());
        arr.removeLast();
        this.downheap(0);
    }

    public ArrayList<T> get_heap_array(){
        return this.arr;
    }
}
