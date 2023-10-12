package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImp implements CarDao {

    private final List<Car> carList;

    {
        carList = new ArrayList<>();

        carList.add(new Car("BMW", 550, 440));
        carList.add(new Car("LADA", 2108, 75));
        carList.add(new Car("AUDI", 6, 320));
        carList.add(new Car("BMW", 320, 220));
        carList.add(new Car("LEXUS", 570, 280));
    }


    @Override
    public List<Car> showList() {
        return carList;
    }

    @Override
    public List<Car> showCountList(Integer count) {
        if (count == null) {
            return carList;
        } else if (count < 5) {
            return carList.stream().limit(count).toList();
        } else {
            return carList;
        }
    }
}
