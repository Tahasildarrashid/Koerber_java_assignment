package day9.src_day9;

class DoSideWork implements AutoCloseable{
    public DoSideWork(){
        System.out.println("constructor of DoSideWork");
    }

    void doSideWork(){
        System.out.println("doing side work");
    }

    @Override
    public void close() throws Exception {
        System.out.println("closing side work");
    }
}
class Work implements AutoCloseable{
    public Work(){
        System.out.println("ctr of work");
    }

    void doWork(){
        System.out.println("doing main work");
    }

    @Override
    public void close() throws Exception {
        System.out.println("close ");
    }
}
public class B_TryWIthResouceImprovement {
    public static void main(String[] args) {
        try(DoSideWork d = new DoSideWork()){
            d.doSideWork();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}