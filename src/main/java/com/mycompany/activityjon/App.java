package com.mycompany.activityjon;

public class App {

    public static void main(String[] args) {
        Thread thread1, thread2;

        // Get user input for thread names
        System.out.print("Name your first thread: ");
        String name1 = new java.util.Scanner(System.in).nextLine();
        System.out.print("Name your second thread: ");
        String name2 = new java.util.Scanner(System.in).nextLine();

        // Create threads
        thread1 = new Thread(new MyRunnable(name1));
        thread2 = new Thread(new MyRunnable(name2));

        // Display initial state
        System.out.println(thread1.getName() + " is " + thread1.getState());
        System.out.println(thread2.getName() + " is " + thread2.getState());

        // Start the threads
        System.out.println();
        System.out.println("Starting the threads...");
        thread1.start();
        thread2.start();

        // Sleep for half a second
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Display final state
        System.out.println();
        System.out.println("After sleep...");
        System.out.println(thread1.getName() + " is " + thread1.getState());
        System.out.println(thread2.getName() + " is " + thread2.getState());
    }
}

class MyRunnable implements Runnable {

    private final String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " is " + Thread.currentThread().getState());
    }
}
