class MyThreadRunnable extends Thread{

    public void run(){
        while(true) {
            System.out.println("Cooking Thread is Runnning");
            System.out.println("I am Happy");
        }
    }
}
class MyThreadRunnable2 extends Thread{

    public void run(){

        while(true) {
            System.out.println("Coding Thread is Runnning");
            System.out.println("I am Sad");
        }

    }
}




public class MutliThreadingRunnable {


    public static void main(String[] args) {

        MyThreadRunnable bullet1 = new MyThreadRunnable();
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun1 = new Thread(bullet1);
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }

}
