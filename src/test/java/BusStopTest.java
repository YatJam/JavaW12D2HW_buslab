import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person person;

    @Before
    public void before(){
        busStop = new BusStop("Jamie's Mum's house");
    }

    @Test
    public void busStopStartsEmpty(){
        assertEquals(0, busStop.busStopCount());
    }

    @Test
    public void addPersonToQueue() {
        busStop.addPersonToQueue(person);
        assertEquals(1, busStop.busStopCount());
    }

    @Test
    public void removePersonFromQueue(){
        busStop.addPersonToQueue(person);
        busStop.removePersonFromQueue();
        assertEquals(0, busStop.busStopCount());
    }


}
