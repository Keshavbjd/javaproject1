import java.util.LinkedList;
import java.util.Queue;

class ProducerConsumer {
    private final Queue<Integer> queue = new LinkedList<>();
    private final int MAX_SIZE = 5; // Maximum size of the shared queue

    // Producer method
    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (this) {
                // Wait if the queue is full
                while (queue.size() == MAX_SIZE) {
                    System.out.println("Queue is full. Producer is waiting...");
                    wait();
                }
                // Produce an item and add it to the queue
                System.out.println("Producer produced: " + value);
                queue.add(value++);
                // Notify the consumer
                notify();
                // Simulate some delay
                Thread.sleep(500);
            }
        }
    }

    // Consumer method
    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                // Wait if the queue is empty
                while (queue.isEmpty()) {
                    System.out.println("Queue is empty. Consumer is waiting...");
                    wait();
                }
                // Consume an item from the queue
                int value = queue.poll();
                System.out.println("Consumer consumed: " + value);
                // Notify the producer
                notify();
                // Simulate some delay
                Thread.sleep(500);
            }
        }
    }
}

// Main class
public class ProducerConsumerDemo {
    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();

        // Create the producer thread
        Thread producerThread = new Thread(() -> {
            try {
                pc.produce();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Producer thread interrupted.");
            }
        });

        // Create the consumer thread
        Thread consumerThread = new Thread(() -> {
            try {
                pc.consume();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Consumer thread interrupted.");
            }
        });

        // Start the threads
        producerThread.start();
        consumerThread.start();
    }
}
