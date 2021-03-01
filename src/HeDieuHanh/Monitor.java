package HeDieuHanh;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Monitor {
	// Private data.
	private int numOfPhilosophers;
	final Lock lock;
	private enum States {HUNGRY, THINKING, EATING};
	private States [] state;
	final Condition [] seft;	
//	boolean [] leftHungry = new boolean[5];
//	boolean [] rightHungry = new boolean[5];
	DateTimeFormatter tf = DateTimeFormatter.ofPattern("HH:mm:ss");
	// Constructor.
	public Monitor(int numOfPhil){
		this.numOfPhilosophers = numOfPhil;
		lock = new ReentrantLock();
		state = new States[numOfPhilosophers];
		seft = new Condition[numOfPhilosophers];
		// Set initial states and the conditions of the philosophers.
		for(int i = 0; i < numOfPhilosophers; i++){
			state[i] = States.THINKING;
			seft[i] = lock.newCondition();
			//leftHungry[i] = false;
			//rightHungry[i] = false;
		}
	}
	public void test(int i) {
		if ((state[right(i)]!=States.EATING) && (state[left(i)]!=States.EATING)&&
				state[i] == States.HUNGRY ) {
			System.out.format(LocalTime.now().format(tf) + " " +"Philosopher %d picks up left chopstick\n", i+1);
			System.out.format(LocalTime.now().format(tf) + " " +"Philosopher %d picks up right chopstick\n", i+1);
			state[i] = States.EATING;
			seft[i].signal();
		}
	}
	// Synchronized interface methods.
	// Pick up both chopstics for a philosopher i.
	public void pickupChopstick(int i){
		lock.lock();
		try{
			// Indicate that I want to take chopsticks.
			state[i] = States.HUNGRY;
			test(i);
			if (state[i] != States.EATING) {
				try {
					seft[i].await();
					
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
//			rightHungry[left(i)] = false;
//			leftHungry[right(i)] = false;
		}// end try
		finally{
			lock.unlock();
		}
	}
	// Put down both chopstics.
	public void putdownChopstick(int i){
		lock.lock();
		try{
			System.out.format(LocalTime.now().format(tf) + " " +"Philosopher %d puts down right chopstick\n", i+1);
			System.out.format(LocalTime.now().format(tf) + " " +"Philosopher %d puts down left chopstick\n", i+1);
			state[i] = States.THINKING;
			// Tell the left neighbor about the possibility to eat.
			test(left(i));
			//if (state[left(i)] == States.HUNGRY) leftHungry[i] = true;
			test (right(i));
			//if (state[right(i)] == States.HUNGRY) rightHungry[i] = true;
		}// end try
		finally {
			lock.unlock();
		}
	}
	private int left (int i) {
		return (i+1)%5;
	}
	private int right (int i) {
		return (i+4)%5;
	}
}

