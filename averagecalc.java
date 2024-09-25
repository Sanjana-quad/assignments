package basics;

public class averagecalc {

    private int[] arr;
    private int AVG;
    public averagecalc(int[] arr) {
        this.arr = arr;
    }
    public void avg(){
        int sum=0;
        for (int j : arr) {
            sum += j;
        }
        AVG=sum/arr.length;
    }

    public int getavg(){
        return AVG;
    }
    public void display(){
        System.out.println(getavg());
    }
}

class maIN{
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        averagecalc a = new averagecalc(arr);
        a.avg();
        a.display();
    }
}
