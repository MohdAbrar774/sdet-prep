# Java Multithreading: Concise Notes

***

## 1. What is Multithreading?

- **Multithreading** is running multiple threads (lightweight processes) within a single program, allowing concurrent execution of parts of code.
- **Goal:** Efficient use of CPU/resources by letting multiple tasks proceed at once instead of sequentially.
- **Threads** share memory within a process, making communication easier and context switching fast.
- **Practical analogy:** Like multiple waiters (threads) serving tables (tasks) in a restaurant at the same time, instead of just one doing all work.


## 2. Differences: Multitasking, Multiprocessing, Multithreading

- **Multitasking:** Performing multiple tasks at once (can be processes or threads).
- **Multiprocessing:** Multiple processes running, each with separate memory (example: opening browser and text editor together).
- **Multithreading:** Multiple threads within one process, sharing the process’s memory (example: text editor autosaving while typing).


## 3. Why Multithreading?

- Helps use CPU better when tasks can proceed independently or must wait (like downloading while processing other data).
- Ideal when you want background work without blocking the main task/flow.
- Faster than launching new processes (threads are light and share data easily).

***

## 4. Creating Threads in Java

There are **two main ways**:

### A. Extending the Thread Class

1. **Define a class** that *extends* the `Thread` class.
2. **Override** the `run()` method — code here runs when the thread starts.
3. **Create an object** of your class and **call `start()`** to begin the thread. Never call `run()` directly!

**Basic Example:**

```java
class MyThread extends Thread {
    public void run() {
        System.out.println("My thread is running");
    }
}

public class Demo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start(); // starts a new thread
    }
}
```

- Methods like `getId()`, `isAlive()`, `setName()`, etc., are available.
- You can create multiple thread objects and manage them easily.


### B. Implementing Runnable Interface

1. **Define a class** that *implements* the `Runnable` interface.
2. **Override the `run()`** method with thread code.
3. **Create a Thread object**, passing your Runnable object as a parameter.
4. Call **`start()`** on the Thread object to run it.

**Basic Example:**

```java
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable task running");
    }
}

public class Demo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        t1.start(); // starts the thread
    }
}
```

- This approach is more flexible (supports multiple inheritance).

***

## 5. Key Points

- **start()** creates a new thread and calls `run()` in that thread. Calling `run()` manually does not start a new thread.
- Threads can do work in parallel, sharing process memory but each having its own stack.
- Multithreading enables writing responsive apps (e.g., UI stays active while downloading).

***

### Summary Table: Differences

| Approach | What to do | Flexibility |
| :-- | :-- | :-- |
| Extend Thread class | Subclass Thread, override run | Less (single inheritance) |
| Implement Runnable interface | Implement run, pass to Thread | More (multiple inheritance) |


***

## When to Use Which?

- Use **Runnable** when your class already extends another class, or you want loose coupling.
- Use **Thread** subclass if you only need simple threading and don’t need to extend any other class.

***

**TIP:** Always use `start()` to launch a thread, never call `run()` directly.


