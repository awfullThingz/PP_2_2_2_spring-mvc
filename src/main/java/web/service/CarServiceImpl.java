package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class CarServiceImpl implements CarService {
    private static int CAR_COUNT;
    private final List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car(++CAR_COUNT, "Toyota", 11));
        cars.add(new Car(++CAR_COUNT, "car2", 22));
        cars.add(new Car(++CAR_COUNT, "car3", 33));
        cars.add(new Car(++CAR_COUNT, "car4", 44));
        cars.add(new Car(++CAR_COUNT, "car5", 55));

    }


    public List<Object> carList(int returnValue) {
        return cars.stream().limit(returnValue).collect(Collectors.toList());

    }
}
