class ClassA extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("ClassA is running: " + i);
                Thread.sleep(1000); // Sleep for 1 second
            }
        } catch (InterruptedException e) {
            System.out.println("ClassA interrupted: " + e.getMessage());
        }
        System.out.println("ClassA finished execution.");
    }
}

class ClassB extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("ClassB is running: " + i);
                Thread.sleep(1500); // Sleep for 1.5 seconds
            }
        } catch (InterruptedException e) {
            System.out.println("ClassB interrupted: " + e.getMessage());
        }
        System.out.println("ClassB finished execution.");
    }
}

public class SleepMethodDemo {
    public static void main(String[] args) {
        ClassA threadA = new ClassA();
        ClassB threadB = new ClassB();

        // Start both threads
        threadA.start();
        threadB.start();

        try {
            // Wait for both threads to finish
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }

        System.out.println("Main thread finished execution.");
    }
}
