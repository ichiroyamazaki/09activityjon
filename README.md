# 09activityjon

A Java programming activity demonstrating **multithreading and thread states** using the `Thread` class and the `Runnable` interface.

## Overview

This project creates two Java threads using names provided by the user. Each thread runs a `MyRunnable` task that displays its name and current execution state.

The main program displays each thread's initial state, starts both threads, waits for 500 milliseconds, and then displays their states again.

## Features

- **User-defined thread names:** Prompts the user to name two threads.
- **Thread creation:** Creates two threads using the `Thread` class.
- **Runnable implementation:** Uses `MyRunnable` to define the task executed by each thread.
- **Initial state display:** Prints each thread's state before starting.
- **Concurrent execution:** Starts both threads.
- **Thread state monitoring:** Displays their states after a 500-millisecond pause.
- **Maven project structure:** Uses Maven for project configuration and building.

## Technologies Used

- Java 21
- Maven
- `Thread` class
- `Runnable` interface
- `Scanner` for console input

## Requirements

- JDK 21 or a compatible Java installation
- Apache Maven, if running the project through Maven
- A Java IDE such as NetBeans or IntelliJ IDEA, or a terminal

## Project Structure

```text
09activityjon/
├── pom.xml
├── README.md
└── src/
    └── main/
        └── java/
            └── com/
                └── mycompany/
                    └── activityjon/
                        └── App.java
```

## How to Run

### Option 1: Using Maven

1. Clone or download the repository.
2. Open a terminal in the project directory.
3. Compile the project:

   ```bash
   mvn compile
   ```

4. Run the application using Maven:

   ```bash
   mvn exec:java
   ```

The Maven configuration specifies `com.mycompany.activityjon.App` as the main class.

### Option 2: Using an IDE

1. Open the project in a Java IDE that supports Maven.
2. Allow the IDE to load the Maven configuration.
3. Open `App.java`.
4. Run the `App` class.
5. Enter a name for each thread when prompted.

## Example Output

The output will vary depending on the names entered and the timing of thread execution.

```text
Name your first thread: ThreadOne
Name your second thread: ThreadTwo
Thread-0 is NEW
Thread-1 is NEW

Starting the threads...
ThreadOne is RUNNABLE
ThreadTwo is RUNNABLE

After sleep...
Thread-0 is TERMINATED
Thread-1 is TERMINATED
```

**Note:** This is illustrative output. Actual thread names and states may differ. The thread objects retain Java's automatically assigned names unless the program explicitly calls `setName()`. The task also prints each running thread's state, which can vary depending on execution timing.

## How It Works

1. The program requests two names from the user.
2. It creates two `MyRunnable` objects using those names.
3. Each runnable object is passed to a new `Thread`.
4. The program prints the threads' initial states.
5. Both threads are started using `start()`.
6. The main thread pauses for 500 milliseconds using `Thread.sleep(500)`.
7. The program prints the thread states again.

## Learning Objectives

This activity demonstrates:

- Java classes and objects
- Console input with `Scanner`
- The `Runnable` interface
- Creating and starting threads
- Basic concurrency
- The `Thread.State` enumeration
- Handling `InterruptedException`

## Limitations

- The program uses a fixed 500-millisecond delay rather than waiting for both threads with `join()`.
- Thread states depend on execution timing and are not guaranteed to be identical on every run.
- The names entered by the user are printed by each runnable task but are not assigned to the actual `Thread` objects.
- The program does not validate empty thread names.

## Author

**Ichiro Yamazaki**

## License

No license has been specified for this repository.
