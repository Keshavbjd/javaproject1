// Step 1: Extend the Thread class
class MyThread extends Thread {
    // Step 2: Override the run method
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
public class ThreadExample {
    public static void main(String[] args) {
        // Step 3: Create an instance of your thread class
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        // Set custom names for threads (optional)
        thread1.setName("Thread-1");
        thread2.setName("Thread-2");

        // Start the threads
        thread1.start();
        thread2.start();
    }
}
