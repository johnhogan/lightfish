package org.lightfish.business.servermonitoring.control.collectors.jvm;

import org.lightfish.business.servermonitoring.control.collectors.AbstractRestDataCollector;
import org.lightfish.business.servermonitoring.control.collectors.DataPoint;
import org.lightfish.business.servermonitoring.control.collectors.SnapshotDataCollector;

/**
 *
 * @author Rob Veldpaus
 */
@SnapshotDataCollector
public class ThreadCountCollector extends AbstractRestDataCollector<Integer> {
    
    public static final String THREAD_COUNT_URI = "jvm/thread-system/threadcount";

    @Override
    public DataPoint<Integer> collect() throws Exception{
        return new DataPoint<>("threadCount",getInt(THREAD_COUNT_URI, "threadcount"));
    }
    
}
