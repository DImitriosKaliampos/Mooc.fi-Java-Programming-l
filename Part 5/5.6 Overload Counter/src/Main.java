public class Main {
    public static void main(String[] args)  {
       
        Counter counter = new Counter(1);
        System.out.println(counter);
        counter.decrease(1);
        System.out.println(counter);
        counter.increase(1);
        System.out.println(counter);

    }
}
