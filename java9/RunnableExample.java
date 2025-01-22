// Step 1: Implement the Runnable interface
class MyRunnable implements Runnable {
    @Override
    public void run() {
        // Code to be executed by the thread
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                // Sleep for 500ms to simulate some work
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

// Main class
public class RunnableExample {
    public static void main(String[] args) {
        // Step 2: Create an instance of the Runnable implementation
        MyRunnable myRunnable = new MyRunnable();

        // Step 3: Create Thread objects and pass the Runnable instance
        Thread thread1 = new Thread(myRunnable, "Thread-1");
        Thread thread2 = new Thread(myRunnable, "Thread-2");

        // Step 4: Start the threads
        thread1.start();
        thread2.start();
    }
}
