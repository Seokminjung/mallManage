package model;

public class Items implements ModelInterface{
private int code;
private String name1;
private String name2;
private String name3;
private int categorization;
private String origin;
private int supplier;
private String standard;
private int orgInventory;
private int curInventory;
private int price;
private int discountedPrice;
private String contents;
private String eventContents;
private int orderCount;
private int clickCount;
private Boolean display;
private String regDate;
private Boolean event;

public int getCode() {
	return code;
}
public void setCode(int code) {
	this.code = code;
}
public String getName1() {
	return name1;
}
public void setName1(String name1) {
	this.name1 = name1;
}
public String getStandard() {
	return standard;
}
public void setStandard(String standard) {
	this.standard = standard;
}
public String getName2() {
	return name2;
}
public void setName2(String name2) {
	this.name2 = name2;
}
public String getName3() {
	return name3;
}
public void setName3(String name3) {
	this.name3 = name3;
}
public int getCategorization() {
	return categorization;
}
public void setCategorization(int categorization) {
	this.categorization = categorization;
}
public void setCategorization(String categorization) {
	this.categorization = Integer.parseInt(categorization);
}
public String getOrigin() {
	return origin;
}
public void setOrigin(String origin) {
	this.origin = origin;
}
public int getSupplier() {
	return supplier;
}
public void setSupplier(int supplier) {
	this.supplier = supplier;
}
public void setSupplier(String supplier) {
	this.supplier = Integer.parseInt(supplier);
}
public int getOrgInventory() {
	return orgInventory;
}
public void setOrgInventory(int orgInventory) {
	this.orgInventory = orgInventory;
}
public void setOrgInventory(String orgInventory) {
	this.orgInventory = Integer.parseInt(orgInventory);
}
public int getCurInventory() {
	return curInventory;
}
public void setCurInventory(int curInventory) {
	this.curInventory = curInventory;
}
public void setCurInventory(String curInventory) {
	this.curInventory = Integer.parseInt(curInventory);
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public void setPrice(String price) {
	this.price =Integer.parseInt(price);
}
public int getDiscountedPrice() {
	return discountedPrice;
}
public void setDiscountedPrice(int discountedPrice) {
	this.discountedPrice = discountedPrice;
}
public String getContents() {
	return contents;
}
public void setContents(String contents) {
	this.contents = contents;
}
public String getEventContents() {
	return eventContents;
}
public void setEventContents(String eventContents) {
	this.eventContents = eventContents;
}
public int getOrderCount() {
	return orderCount;
}
public void setOrderCount(int orderCount) {
	this.orderCount = orderCount;
}
public int getClickCount() {
	return clickCount;
}
public void setClickCount(int clickCount) {
	this.clickCount = clickCount;
}
public Boolean getDisplay() {
	return display;
}
public void setDisplay(Boolean display) {
	this.display = display;
}
public String getRegDate() {
	return regDate;
}
public void setRegDate(String regDate) {
	this.regDate = regDate;
}
public Boolean getEvent() {
	return event;
}
public void setEvent(Boolean event) {
	this.event = event;
}


}
