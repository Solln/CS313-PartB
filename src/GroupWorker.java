/**
 * Created by Darren on 25/10/2016.
 */
public class GroupWorker implements Runnable {
    @Override
    public void run() {

        while(true){

            try{
                Thread.sleep(1000);
                for (int i = 0; i < 1000000; i++);

            }

            catch(InterruptedException ie){

            }

        }

    }
}
