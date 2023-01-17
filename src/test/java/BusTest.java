import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;

    private BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("Jamie's Mum's house", 3);
        person = new Person();
        busStop = new BusStop("Jamie's Mum's house");
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);

    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void addPassenger(){
        bus.addPassenger(busStop);
        assertEquals(1, bus.passengerCount());

    }

    @Test
    public void removePassenger(){
        bus.addPassenger(busStop);
        bus.removePassenger();
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void checkCapacityThenAddPassengerIf(){
        bus.addPassenger(busStop);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void addPassengersToCapacity(){
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        assertEquals(3, bus.passengerCount());

    }

}
