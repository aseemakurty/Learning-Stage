import java.util.List;
import java.util.ArrayList;

public class Testclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vehicle v1 = new Car("Hondacity","Car","White",1234);
//Vehicle v1 = new Car("Benz","Car","Black",9845); 
Vehicle v2 = new Bike("Pleaure","Bike","Red",3213);
Vehicle v3 = new Auto("Tera","Auto","Yellow",987);

List<Vehicle> list = new ArrayList<Vehicle>();
list.add(v1);
list.add(v2);
list.add(v3);
for(Vehicle vehicle:list)
{
	vehicle.details();
}

	}

}
