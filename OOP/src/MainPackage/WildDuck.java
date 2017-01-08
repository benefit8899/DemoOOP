package MainPackage;

/**
 * @author MIK
 * demo class using polymorphism
 */
public class WildDuck extends Duck{
	//override this method from Duck to show polymorphism
	@Override
	public void move() {
		System.out.println("flying");
	}
}
