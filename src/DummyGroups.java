/**
 * Created by Darren on 25/10/2016.
 */
public class DummyGroups {

    public DummyGroups(){

        ThreadGroup a = new ThreadGroup("G - A");
        ThreadGroup b = new ThreadGroup("G - B");
        ThreadGroup c = new ThreadGroup(a, "G - C");


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
