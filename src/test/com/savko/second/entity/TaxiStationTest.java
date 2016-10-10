package test.com.savko.second.entity;

import com.savko.second.entity.Car;
import com.savko.second.entity.Taxi;
import com.savko.second.entity.TaxiStation;
import com.savko.second.entity.TruckBus;
import com.savko.second.entity.MiniBus;
import com.savko.second.tool.TaxiStationTools;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

public class TaxiStationTest {

    private TaxiStation taxiStation;

    @Before
    public void doBefore() {
        taxiStation = new TaxiStation("Taxi Station");
        Car car1 = new TruckBus(2, "mercedes", "black", 70000, 18, 2, 25000, 2);
        Car car2 = new Taxi(1, "mercedes", "black", 50000, 7, 4, 500, true, true);
        Car car3 = new Taxi(3, "mercedes", "white", 50000, 9, 2, 700, true, true);
        taxiStation.addCar(car1);
        taxiStation.addCar(car2);
        taxiStation.addCar(car3);
    }


    @Test
    public void testCalculateCostOfTaxiStation() {
        Assert.assertEquals(170000, TaxiStationTools.calculateCostOfTaxiStation(taxiStation));
    }

    @Test
    public void testSortByFuelConsumptionCorrect() {
        TaxiStationTools.sortByFuelConsumption(taxiStation);
        List<Car> cars = taxiStation.getCars();
        Assert.assertTrue(cars.get(0).getCarId() == 1);
        Assert.assertTrue(cars.get(1).getCarId() == 3);
        Assert.assertTrue(cars.get(2).getCarId() == 2);
    }

    @Test
    public void testFindCarByPassengerCapacity() {
        List<Car> cars = TaxiStationTools.findCarByPassengerCapacity(taxiStation, 3, 10);
        Assert.assertTrue(cars.size() == 1);
        Assert.assertTrue(cars.get(0).getCarId() == 1);
    }


    @Test
    public void testFindCarByBearingCapacity() {
        List<Car> cars = TaxiStationTools.findCarByBearingCapacity(taxiStation, 600, 30000);
        Assert.assertTrue(cars.size() == 2);
        Assert.assertTrue(cars.get(0).getCarId() == 2);
        Assert.assertTrue(cars.get(1).getCarId() == 3);
    }


}
