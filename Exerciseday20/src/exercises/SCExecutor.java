package exercises;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

class SCExecutor implements Executor {
   final Queue<Runnable> waitingtasks = new ArrayDeque<Runnable>();
   final Queue<Runnable> activetasks = new ArrayDeque<Runnable>();
   int Maxcoresize = 5; //parallel tasks
   Thread monitor = new Thread();

   public synchronized void execute(final Runnable r) {
	   if(activetasks.size() < Maxcoresize) {
		   activetasks.offer(r);
		   new Thread(r).start();
	   }
	   else {
			waitingtasks.offer(r);
	   }
   }

 }
