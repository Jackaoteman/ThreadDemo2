package Com.liyue.Demo;

public class Demo implements Runnable {

    private  int countDown=10;
    private  static  int count=0;
    private  int id=count++;
    public Demo(){}
    public Demo(int countDown){
        this.countDown=countDown;
    }
    public String status(){
        return "#"+id+"("+(countDown>0?countDown:"Liftoff!")+"),";
    }
    @Override
    public void run(){
        while(countDown-->0){
            System.out.println(status());
            Thread.yield();
        }
    }
}
