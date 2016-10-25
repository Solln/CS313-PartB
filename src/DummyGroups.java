/**
 * Created by Darren on 25/10/2016.
 */
public class DummyGroups {

    public DummyGroups(){

        ThreadGroup a = new ThreadGroup("A");
        ThreadGroup b = new ThreadGroup("B");
        ThreadGroup c = new ThreadGroup(a, "C");


        (new Thread(a, new GroupWorker())).start();
        (new Thread(a, new GroupWorker())).start();
        (new Thread(a, new GroupWorker())).start();

        (new Thread(b, new GroupWorker())).start();

        (new Thread(c, new GroupWorker())).start();
        (new Thread(c, new GroupWorker())).start();
        (new Thread(c, new GroupWorker())).start();
        (new Thread(c, new GroupWorker())).start();



    }

}
