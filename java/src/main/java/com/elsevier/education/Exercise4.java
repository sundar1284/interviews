package com.elsevier.education;

import java.util.concurrent.atomic.LongAdder;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

*/
public class Exercise4 {

	public static class Counter {
		
		private LongAdder count = new LongAdder();
		
		//LongAdder is preferred in high contention areas
		public int increment() {
			count.increment();
			return count.intValue();
		}
		
		public int getCount() {
			return count.intValue();
		}
		
		public void resetCount() {
			count.reset();
		}
	}
}