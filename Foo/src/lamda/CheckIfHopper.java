package lamda;

public class CheckIfHopper implements CheckTrait{

	@Override
	public boolean test(Animal animal) {
		// TODO Auto-generated method stub
		return animal.isCanHop();
	}

}
