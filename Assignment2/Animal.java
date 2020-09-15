
public abstract class Animal {
	private String type;
	private String name;
	private String gender;
	private String environment;
	
public Animal(String type, String name, String gender, String environment) {
	this.type = type;
	this.name = name;
	this.gender = gender;
	this.environment = environment;
	
}

public void settype(String type) {
	this.type = type;
}
public void setname(String name) {
	this.name = name;
}
public void setgender(String gender) {
	this.gender = gender;
}
public void setenvironment(String environment) {
	this.environment = environment;
}
public String gettype() {
	return type;
}
public String getname() {
	return name;
}
public String getgender() {
	return gender;
}
public String getenvironment() {
	return environment;
}

public String toString() {
	String str = "Name of Animal: " + name + "Gender: " + gender + "Environment: " + environment;
	return str;
}

}
