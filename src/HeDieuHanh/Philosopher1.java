
package HeDieuHanh;

import java.util.Random;
import java.util.concurrent.TimeUnit;






public class Philosopher1 implements Runnable{
	
    private int philNumber;
    private Monitor monitor;
    private GUI1 frame;

    Random rand;
    Thread t;

    public Philosopher1(int philNumber, Monitor monitor,GUI1 frame){
        this.philNumber = philNumber;
        this.monitor = monitor;
        this.frame = frame;
        rand = new Random();
        t = new Thread(this);
        t.start();
    }

    @Override
    public synchronized void run(){

        long end = System.currentTimeMillis() + 12000;
        // while its not 2 minutes
        while(System.currentTimeMillis() < end) {
            try{
                hungry();
                monitor.pickupChopstick(philNumber);
                eat();
                monitor.putdownChopstick(philNumber);
                thinking();
            }catch(InterruptedException x){
                x.printStackTrace();
            }
        }
    }

    
    private int eat() throws InterruptedException {
    	frame.changeColourToGreen(philNumber+1);
        System.out.println("Philosopher " + (philNumber + 1) + ": is eating");     
        int time = rand.nextInt(3)+1;
        TimeUnit.SECONDS.sleep(time);
        return time;
    }

    private int hungry() throws InterruptedException {
    	frame.setColourToBlack(philNumber);
        System.out.println("Philosopher " + (philNumber + 1) + ": is hungry");
        int time = rand.nextInt(3) + 1;
        TimeUnit.SECONDS.sleep(time);
       
        return time;
    }
    private int thinking() throws InterruptedException {
    	frame.changeColourToRed (philNumber+1);
        System.out.println( "Philosopher " + (philNumber + 1) + ": is thinking");
        int time = rand.nextInt(3) + 1;
        TimeUnit.SECONDS.sleep(time);     
        return time;
    }
    public static void main(String[] args){
        // creates a new monitor
        Monitor monitor = new Monitor(5);
        // creates 5 philosophers
        Philosopher1[] philosophers = new Philosopher1[5];

        
        GUI1 frame = new GUI1();
		frame.setVisible(true);
        
		System.out.println("Phylosophers come to the table.");
        // initializes the philosophers
        for(int i = 0; i < philosophers.length; i++){
            philosophers[i] = new Philosopher1(i, monitor, frame);
        }

        // joins the thread with each of the philosopher
        for(int i = 0; i < philosophers.length; i++) {
            try {
                philosophers[i].t.join();
            } catch (InterruptedException e) {
            	
                e.printStackTrace();
            }
        }
        System.out.println("Dining has completed");
        
    }
}
