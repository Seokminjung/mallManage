package model;

public class Members implements ModelInterface{
	
private int no;
private String id;
private String password;
private String name;
private String address;
private String phone;
private int mileage;
private String regDate;
private String accAnswer;
private String accAsk;
private String grade;

public int getNo() {
	return no;
}
public void setNo(int no) {
	this.no = no;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public int getMileage() {
	return mileage;
}
public void setMileage(int mileage) {
	this.mileage = mileage;
}

public String getRegDate() {
	return regDate;
}
public void setRegDate(String regDate) {
	this.regDate = regDate;
}
public String getAccAnswer() {
	return accAnswer;
}
public void setAccAnswer(String accAnswer) {
	this.accAnswer = accAnswer;
}
public String getAccAsk() {
	return accAsk;
}
public void setAccAsk(String accAsk) {
	this.accAsk = accAsk;
}
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}


}
