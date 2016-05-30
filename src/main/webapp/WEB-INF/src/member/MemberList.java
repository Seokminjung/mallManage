package member;

import java.util.ArrayList;
import java.util.List;

import model.Events;
import model.EventsCategorization;
import model.Items;
import model.Members;
import model.ModelInterface;
import db.TestMapper;

public class MemberList extends BordList{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TestMapper testMapper;
	private List<ModelInterface> memberList;

	
public String execute() throws Exception {
System.out.println("");
System.out.println("Start memberList action!");	
	List<Members> mList;
	ModelInterface modelObj;
	StringBuffer sbStr;
	String str;
	int insertNo;
	
	memberList = new ArrayList<ModelInterface>();
	mList=testMapper.getMemberList();
System.out.println("mList.size: " + mList.size());	
	for(Members obj: mList) {
		if(obj.getPhone() != null) {
			str = obj.getPhone();
System.out.println("str.size: " + str.length());
			insertNo = str.length();
			sbStr = new StringBuffer(obj.getPhone());
			sbStr.insert((insertNo-4),"-");
			sbStr.insert((insertNo-8),"-");
System.out.println("sbStr: " + sbStr.toString());			
System.out.println("sbStr: " + sbStr.toString());
			obj.setPhone(sbStr.toString());
		}
		modelObj = obj;
		memberList.add(modelObj);
	}

	initVariable(memberList);
System.out.println("End memberList action!");
System.out.println("");
return "success";
	}


public TestMapper getTestMapper() {
	return testMapper;
}


public void setTestMapper(TestMapper testMapper) {
	this.testMapper = testMapper;
}


public List<ModelInterface> getMemberList() {
	return memberList;
}


public void setMemberList(List<ModelInterface> memberList) {
	this.memberList = memberList;
}


}
