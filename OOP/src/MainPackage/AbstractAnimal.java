package MainPackage;

/**
 * @author MIK
 * this is a demo abstract class, this have a abstract method
 */
public abstract class AbstractAnimal {
	private String name;

	abstract protected void move();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
