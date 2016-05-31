package member;

import java.util.ArrayList;
import java.util.List;

import model.Events;
import model.EventsCategorization;
import model.Items;
import model.Members;
import model.ModelInterface;
import model.PurchaseRecord;
import db.TestMapper;

public class ViewMemberInfo extends BordList{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TestMapper testMapper;
	private String no;
	private Members memberObject;
	private ModelInterface purchaseRecord;
	private List<List> proceedPurchaseList;
	private List<List> endedPurchaseList;
	
public String execute() throws Exception {
	List<PurchaseRecord> purchaseRecordList;
	List<ModelInterface> onePurchaseList;
//	Items itemObject;
System.out.println("");
System.out.println("Start ViewMemberInfo action!");	
System.out.println("no: "+no);

	memberObject = testMapper.getMemberWithNo(Integer.parseInt(no));
	purchaseRecordList = testMapper.getPurchaseRecordWithNo(Integer.parseInt(no));
	
	proceedPurchaseList = new ArrayList<List>();
	endedPurchaseList = new ArrayList<List>();
	
	for(PurchaseRecord purObj: purchaseRecordList) {
System.out.println("purObj.no "+purObj.getNo());		
		if(!purObj.getPurchaseState().equals("okShipping")) {
System.out.println("starting no okShipping ");
System.out.println("purObj.getPurchaseState(): "+ purObj.getPurchaseState());
System.out.println("purObj.getItem(): "+ purObj.getItem());
			Items itemObject = testMapper.getItemsWithCode(purObj.getItem());
			onePurchaseList = new ArrayList<ModelInterface>();
			onePurchaseList.add((ModelInterface)itemObject);
			onePurchaseList.add((ModelInterface)purObj);
			proceedPurchaseList.add(onePurchaseList);
System.out.println("ending no okShipping ");			
		}
		else {
System.out.println("starting okShipping ");			
System.out.println("purObj.getPurchaseState(): "+ purObj.getPurchaseState());
System.out.println("purObj.getItem(): "+ purObj.getItem());
			Items itemObject = testMapper.getItemsWithCode(purObj.getItem());
			onePurchaseList = new ArrayList<ModelInterface>();
			onePurchaseList.add((ModelInterface)itemObject);
			onePurchaseList.add((ModelInterface)purObj);
			endedPurchaseList.add(onePurchaseList);
System.out.println("ending okShipping ");			
		}
	}
System.out.println("proceedPurchaseList.size: "+proceedPurchaseList.size());	
System.out.println("endedPurchaseList.size: "+endedPurchaseList.size());

System.out.println("member.name: "+memberObject.getName());
//	initVariable(memberList);
System.out.println("End ViewMemberInfo action!");
System.out.println("");
return "success";
	}


public ModelInterface getPurchaseRecord() {
	return purchaseRecord;
}


public void setPurchaseRecord(ModelInterface purchaseRecord) {
	this.purchaseRecord = purchaseRecord;
}


public List<List> getProceedPurchaseList() {
	return proceedPurchaseList;
}


public void setProceedPurchaseList(List<List> proceedPurchaseList) {
	this.proceedPurchaseList = proceedPurchaseList;
}


public List<List> getEndedPurchaseList() {
	return endedPurchaseList;
}


public void setEndedPurchaseList(List<List> endedPurchaseList) {
	this.endedPurchaseList = endedPurchaseList;
}


public String getNo() {
	return no;
}


public void setNo(String no) {
	this.no = no;
}


public Members getMemberObject() {
	return memberObject;
}


public void setMemberObject(Members memberObject) {
	this.memberObject = memberObject;
}


public TestMapper getTestMapper() {
	return testMapper;
}


public void setTestMapper(TestMapper testMapper) {
	this.testMapper = testMapper;
}

}
