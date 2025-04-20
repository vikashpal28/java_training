public class Q4 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread thread = new Thread(()->{
            for(int i = 0;i<1000;i++){
                counter.increment();
            }
        });
        thread.start();
        try{
            thread.join();
        }
        catch(InterruptedException e){
            System.out.println("Thread interrupted: "+e.getMessage());
        }
        System.out.println("final count: "+counter.getCount());
    }
}
class Counter{
    private int count = 0;
    public synchronized void increment(){
        // System.out.println(count);
        count++;
    }
    public int getCount(){
        return count;
    }
}

// output:-
// final count: 1000