package model;

public class PurchaseRecord implements ModelInterface{
	
private int no;
private int item;
private int member;
private int quantity;
private String regDate;
private Boolean event;
private String purchaseState;
private String refundState;
private String returnState;
private String remittanceDate;
private String sendDate;
private String cancelationDate;

public int getNo() {
	return no;
}
public void setNo(int no) {
	this.no = no;
}
public int getItem() {
	return item;
}
public void setItem(int item) {
	this.item = item;
}
public int getMember() {
	return member;
}
public void setMember(int member) {
	this.member = member;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
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
public String getPurchaseState() {
	return purchaseState;
}
public void setPurchaseState(String purchaseState) {
	this.purchaseState = purchaseState;
}
public String getRefundState() {
	return refundState;
}
public void setRefundState(String refundState) {
	this.refundState = refundState;
}
public String getReturnState() {
	return returnState;
}
public void setReturnState(String returnState) {
	this.returnState = returnState;
}
public String getRemittanceDate() {
	return remittanceDate;
}
public void setRemittanceDate(String remittanceDate) {
	this.remittanceDate = remittanceDate;
}
public String getSendDate() {
	return sendDate;
}
public void setSendDate(String sendDate) {
	this.sendDate = sendDate;
}
public String getCancelationDate() {
	return cancelationDate;
}
public void setCancelationDate(String cancelationDate) {
	this.cancelationDate = cancelationDate;
}





}
