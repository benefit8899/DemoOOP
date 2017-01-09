package MainPackage;
/**
 * @author MIK
 * Class demo for using inheritance and interface
 */
public class Student extends Person implements IPersonAction {
	private String id;
	private String classId;
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}

	//this method overiding from IPersonAction 
	@Override
	public void actionFavorite() {
		// TODO Auto-generated method stub
	}
}
