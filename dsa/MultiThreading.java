
class MyThread extends Thread{

    public void run(){
        while(true) {
            System.out.println("Cooking Thread is Runnning");
            System.out.println("I am Happy");
        }
    }
}
class MyThread2 extends Thread{

    public void run(){

        while(true) {
            System.out.println("Coding Thread is Runnning");
            System.out.println("I am Sad");
        }

    }
}



public class MultiThreading {


    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
