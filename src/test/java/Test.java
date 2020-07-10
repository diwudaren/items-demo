import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class Test {

    @org.junit.Test
   public void test() throws BrokenBarrierException, InterruptedException {
        //栅栏方式-测试高并发
       CyclicBarrier cyclicBarrier = new CyclicBarrier(2000);
       for (int i =0;i<=20000;i++){
           new Thread(()->{
               try {
                   cyclicBarrier.await();//线程等待
                   synchronized (this){
                       Semaphore semaphore = new Semaphore(50);
                       semaphore.tryAcquire();
                       System.out.println("开始执行"+cyclicBarrier);
                       semaphore.release();
                   }
               } catch (InterruptedException e) {
                   e.printStackTrace();
               } catch (BrokenBarrierException e) {
                   e.printStackTrace();
               }

           }).start();
       }
   }


   @org.junit.Test
    public void TokeTest(){

   }
}
