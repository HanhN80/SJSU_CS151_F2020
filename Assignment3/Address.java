
public class Address {
	protected int streetNum;
	protected String streetName;
	protected String city;
	protected String zip;
	protected String state;
	
	public Address (int streetNum, String streetName, String city, String zip, String state) {
		this.streetNum = streetNum;
		this.streetName = streetName;
		this.city = city;
		this.zip = zip;
		this.state = state;
	}
	public void setstreetNum(int streetNum) {
		this.streetNum = streetNum;
	}
	public void setstreetName(String streetName) {
		this.streetName = streetName;
	}
	public void setcity(String city) {
		this.city = city;
	}
	public void setzip(String zip) {
		this.zip = zip;
	}
	public void setstate(String state) {
		this.state = state;
	}
	public int getstreetNum() {
		return streetNum;
	}
	public String getstreetName() {
		return streetName;
	}
	public String getcity() {
		return city;
	}
	public String getzip() {
		return zip;
	}
	public String getstate() {
		return state;
	}
	
	public String toString() {
		String str = streetNum + ", " + streetName + ", " + city + ", " + zip + ", " + state;
		return str;
	}

}
