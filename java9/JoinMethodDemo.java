class ClassA extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("ClassA is running: " + i);
            try {
                Thread.sleep(500); // Sleep for 500ms
            } catch (InterruptedException e) {
                System.out.println("ClassA interrupted: " + e.getMessage());
            }
        }
        System.out.println("ClassA finished execution.");
    }
}

class ClassB extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("ClassB is running: " + i);
            try {
                Thread.sleep(700); // Sleep for 700ms
            } catch (InterruptedException e) {
                System.out.println("ClassB interrupted: " + e.getMessage());
            }
        }
        System.out.println("ClassB finished execution.");
    }
}

public class JoinMethodDemo {
    public static void main(String[] args) {
        ClassA threadA = new ClassA();
        ClassB threadB = new ClassB();

        // Start both threads
        threadA.start();
        threadB.start();

        try {
            // Wait for ClassA to finish
            threadA.join();
            System.out.println("ClassA has completed. Main thread continues.");

            // Wait for ClassB to finish
            threadB.join();
            System.out.println("ClassB has completed. Main thread continues.");
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }

        System.out.println("Main thread finished execution.");
    }
}
