package exercises;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;

class SCExecutor implements Executor {
   final List<Runnable> activetasks = Collections.synchronizedList(new ArrayList<Runnable>());
   final Queue<Runnable> waitingtasks = new ArrayDeque<Runnable>();
   int Maxcoresize = 5; //parallel tasks
   Thread monitor = new Thread();

   public synchronized void execute(final Runnable r) {
	   if(activetasks.size() < Maxcoresize) {
		   activetasks.add(r);
		   new Thread(r).start();
	   }
	   else {
			waitingtasks.offer(r);
	   }
   }
   
   

 }
