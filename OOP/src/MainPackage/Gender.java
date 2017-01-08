package MainPackage;

/**
 * @author MIK
 * demo declare enum
 */
public enum Gender {

	/**
	 * Define MALE with its code and text
	 */
	MALE("M", "Male"),

	/**
	 * Define FEMALE with its code and text
	 */
	FEMALE("F", "Female");

	private String code;

	private String text;

	private Gender(String code, String text) {
		this.setCode(code);
		this.setText(text);
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
