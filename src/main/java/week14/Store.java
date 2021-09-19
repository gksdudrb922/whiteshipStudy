package week14;

import java.util.List;

public class Store {

    public static void main(String[] args) {
//        AppleDao appleDao = new AppleDao();

        GenericDao<Apple, Integer> appleDao = new GenericDao<>();

        appleDao.save(Apple.of(1));
        appleDao.save(Apple.of(2));

        List<Apple> all = appleDao.findAll();
        all.forEach(System.out::println);
    }
}
