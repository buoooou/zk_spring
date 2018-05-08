package kafeihu.zk.service;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public interface ZKExecutorService<V> {

    Future<V> executte(Callable callable);
}
