package member;

import db.TestMapper;
import model.*;

import java.util.List;
import java.util.ArrayList;

public class BordList {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TestMapper testMapper;
/*	Below variables is sent to other page. */	
	private List<ModelInterface> totalBordList, partBordList;
	private List<Integer> pageNumList;
	private int pageNum=-1, sectionSize, sectionNum, totalBordSize;
/*	Below variables is't sent to other page. */
	private int pageSize;
	
	BordList() {
//		initVariable();
	}

	public void initVariable(List<ModelInterface> modelList) {
		if(pageNum<0)
		{
			pageNum=1;
		}
		initiateTotalBordList(modelList);
		initiateSectionOrPage();
		initPartBordList();
		initSectionNum();
		initPageNumList();
	}
	void initiateTotalBordList(List<ModelInterface> modelList)
	{
		totalBordList = modelList;
//		totalBordList = testMapper.getFaqList();
//		categorizationList = testMapper.getCategorizationList();
		totalBordSize = totalBordList.size();
		
	}
	void initiateSectionOrPage()
	{
		int listSize=totalBordList.size();

//		pageSize = listSize/10;
//		int modNum = listSize%10;
		
		pageSize = listSize/40;
		int modNum = listSize%40;
		
		if(modNum>0)
			pageSize++;

			sectionSize = pageSize/5;
			modNum= pageSize%5;
		if(modNum>0)
			sectionSize++;
/*
System.out.println("pageSize = listSize/40");
System.out.println("sectionSize = pageSize/5");
System.out.println("pageNum: "+pageNum);		
System.out.println("TotalBordlistSize: "+ listSize);		
System.out.println("pageSize: "+ pageSize);
System.out.println("sectionSize: "+ sectionSize);
*/
	}
/*	public ArrayList<GeneralBord> getPartBordList()*/
	public void initPartBordList()	
	{
//		initiateTotalBordList();
//		initiateSectionOrPage();

		partBordList = new ArrayList<ModelInterface>();
		ModelInterface bordObject;
		int endNum, startNum;

		if(totalBordSize!=0)	// result of db is 0.
			{
			if(pageNum==pageSize)	//if end page
			{	endNum=(totalBordList.size()-1);  }
			else
/*			{	endNum = (pageNum *10)-1;  }*/
/*				startNum = (pageNum *10)-10;*/
			{	endNum = (pageNum *40)-1;  }
				startNum = (pageNum *40)-40;			
		
				for(int i=startNum; i<=endNum; i++)
				{
					bordObject = totalBordList.get(i);
					partBordList.add(bordObject);
				}
			}
//System.out.println("partBordList: "+ partBordList.size());		
/*		return partBordList;*/
	}
/*	public int getSectionNum()*/
	public void initSectionNum()	
	{
		if(totalBordSize == 0)
		{
			sectionNum=0;
		}
		else
		{
			int startNum,endNum,secNum=1;
			int dou=5;

			for(int i=0; i<sectionSize; i++)
			{
				startNum=dou-4;
				endNum=dou;
/*below code increase sectionNum by 1 when page num increased by 5.*/				
				if(startNum<=pageNum&&endNum>=pageNum)
					break;
				dou=dou+5;
				secNum++;
			}
		sectionNum=secNum;
		}
//System.out.println("sectionNum: "+ sectionNum);		
/*		return secNum;*/
	}
/*	public ArrayList<Integer> getPageNumList()*/
	public void initPageNumList()
	{
		int startNum,endNum,secNum=0;
//System.out.println("sectionNum.size:"+getSectionNum());
		secNum = getSectionNum();
		startNum=(secNum*5)-4;

		if(secNum==sectionSize)
		{	endNum=pageSize; }
		else
		{ endNum=secNum*5; }

		pageNumList = new ArrayList<Integer>();
		if(totalBordSize!=0)
		{
			for(int i=startNum; i<=endNum; i++)
			{
				pageNumList.add(i);
			}
		}
//System.out.println("pageNumList.size:"+pageNumList.size());
/*	return pageNumList;*/
	}
	
	public List<ModelInterface> getTotalBordList() {
		return totalBordList;
	}
	public void setTotalBordList(List<ModelInterface> totalBordList) {
		this.totalBordList = totalBordList;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalBordSize() {
		return totalBordSize;
	}
	public void setTotalBordSize(int totalBordSize) {
		this.totalBordSize = totalBordSize;
	}
	public int getSectionSize() {
		return sectionSize;
	}
	public void setSectionSize(int sectionSize) {
		this.sectionSize = sectionSize;
	}
	public void setPartBordList(List<ModelInterface> partBordList) {
		this.partBordList = partBordList;
	}
	public void setPageNumList(List<Integer> pageNumList) {
		this.pageNumList = pageNumList;
	}
	public void setSectionNum(int sectionNum) {
		this.sectionNum = sectionNum;
	}
	public TestMapper getTestMapper() {
		return testMapper;
	}
	public void setTestMapper(TestMapper testMapper) {
		this.testMapper = testMapper;
	}
	public List<ModelInterface> getPartBordList() {
		return partBordList;
	}
	public List<Integer> getPageNumList() {
		return pageNumList;
	}
	public int getSectionNum() {
		return sectionNum;
	}
	
}
