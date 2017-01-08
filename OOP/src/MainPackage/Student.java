package MainPackage;
/**
 * @author MIK
 * Class demo for using inheritance and interface
 */
public class Student extends Person implements IPersonAction {
	private String id;
	private String classid;
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getClassid() {
		return classid;
	}
	public void setClassid(String classid) {
		this.classid = classid;
	}

	@Override
	public void actionFavorite() {
		// TODO Auto-generated method stub
	}
}
