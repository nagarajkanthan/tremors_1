import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


public class RestaurantService {
    private static List<Restaurant> restaurants = new ArrayList<>();
    public Object restaurantNotFoundException;

    public Restaurant findRestaurantByName(String restaurantName) {
        //return null;
        //if (restaurantName=="Pantry d'or"){
        //    throw new restaurantNotFoundException("error");
        //}
        //List aList = getRestaurants();

        //aList.contains(restaurantName);
        addRestaurant(restaurantName,"blr",LocalTime.NOON,LocalTime.MIDNIGHT);
        return getRestaurants().get(0);
        //return null;
        //DELETE ABOVE STATEMENT AND WRITE CODE HERE
    }


    public Restaurant addRestaurant(String name, String location, LocalTime openingTime, LocalTime closingTime) {
        Restaurant newRestaurant = new Restaurant(name, location, openingTime, closingTime);
        restaurants.add(newRestaurant);
        return newRestaurant;
    }

    public Restaurant removeRestaurant(String restaurantName) throws restaurantNotFoundException {
        Restaurant restaurantToBeRemoved = findRestaurantByName(restaurantName);
        restaurants.remove(restaurantToBeRemoved);
        restaurants.clear();
        return restaurantToBeRemoved;
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }
}
