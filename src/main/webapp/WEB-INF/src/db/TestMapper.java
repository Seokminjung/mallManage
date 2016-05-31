package db;

import java.util.ArrayList;
import java.util.List;

import model.Events;
import model.EventsCategorization;
import model.EventsPictures;
import model.Items;
import model.ItemsCategorization;
import model.ItemsPictures;
import model.Members;
import model.ModelInterface;
import model.PurchaseRecord;
import model.Suppliers;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface TestMapper {
	@Select("SELECT * FROM members")
	List<Members> getMemberList();
	@Select("SELECT * FROM members WHERE no=#{no}")
	Members getMemberWithNo(int no);
	@Select("SELECT * FROM items WHERE code=#{code}")
	Items getItemsWithCode(int code);
	@Select("SELECT * FROM purchaseRecord WHERE member=#{memberNo}")
	List<PurchaseRecord> getPurchaseRecordWithNo(int memberNo);

/*	
	@Select("SELECT * FROM events")
	List<Events> getEventList();
	@Select("SELECT * FROM itemscategorization WHERE maincategorization = #{no}")
	List<ItemsCategorization> getSubCategorizationList(int no);	
	@Select("SELECT events.no, events.item, items.name1 title1, events.categorization, events.state, events.startDate, events.endDate, events.regDate "
			+ "FROM events JOIN items ON events.item = items.code")
	List<Events> getEventWithItemList();
	@Select("SELECT events.no, events.item, items.name1 title1, events.categorization, events.state, events.startDate, events.endDate, events.regDate "
			+ "FROM events JOIN items ON events.item = items.code "
			+ "where items.name1 like #{searchString}")
	List<Events> getSearchEventWithItemList(String searchString);
	@Select("SELECT * FROM eventsCategorization ORDER BY displayOrder ASC")
	List<EventsCategorization> getEventCategorizationList();
	@Select("SELECT MAX(code) FROM items")
	int getMaxNumItems();
	@Select("SELECT name FROM itemsCategorization where no=#{no}")
	String getSubCategorizationName(int no);
	@Select("SELECT name FROM itemsCategorization where no=("
			+ "select mainCategorization from itemsCategorization where no=#{no})")
	String getSuperCategorizationName(int no);
	@Select("SELECT * FROM suppliers")
	List<Suppliers> getSuppliersList();
	
	@Select("SELECT * FROM itemsCategorization where maincategorization IS NULL")
	List<ItemsCategorization> getSuperItemCategorizationList();

	@Select("SELECT * FROM items WHERE categorization = #{code}")
	List<Items> getItemListWithCategory(int code);
	
	@Select("SELECT * FROM items WHERE code = #{code}")
	Items getItemWithItemCode(int code);
	
	@Select("SELECT * FROM items WHERE name1 like #{name}")
	List<Items> getItemListWithItemName(String name);
	
	@Select("SELECT * FROM eventsState")
	List<String> getEventsState();
	
	@Select("SELECT item FROM events where banner = true")
	List<Integer> getItemOfEventsByBanner();
	@Update("UPDATE events SET banner = false where item = #{code}")
	void updateBannerOfEvents(int code);
	
	@Select("SELECT YEAR(NOW())")
	String getDbYear();	
	@Insert("INSERT INTO events(categorization, item,banner,regDate, startDate, endDate, state) "
			+ "VALUES(#{categorization}, #{item}, #{banner}, now(), #{startDate}, #{endDate}, #{state})")
	@Options(useGeneratedKeys=true, keyProperty="no")
	int insertEventItem(Events event);
	
	@Insert("INSERT INTO eventsPictures(event,name,value) VALUES(#{event}, #{name}, #{value})")
	void insertEventsPictures(EventsPictures epictures);
	@Delete("DELETE FROM eventsPictures WHERE event = (SELECT no FROM events WHERE item=#{code})")
	void deleteEventsPicturesWithItemCode(int code);
	
	@Select("SELECT * FROM events WHERE no=#{no}")
	Events getEventWithNo(int no);
	@Select("SELECT * FROM items WHERE code=#{code}")
	Items getItemsWithCode(int code);
	@Select("SELECT * FROM itemsPictures WHERE item=#{code}")
	List<ItemsPictures> getItemsPicturesWithItemCode(int code);
	@Select("SELECT value FROM eventsPictures WHERE event=#{no} and name='banner'")
	String getBannerPictureOfEventsPicturesWithEventNo(int no);
	@Select("SELECT * FROM itemscategorization WHERE no = #{no}")
	ItemsCategorization getItemsCategorization(int no);
	@Select("SELECT displayName FROM eventsCategorization WHERE displayOrder = #{no}")
	String getEventCategorizationNameWithDisplayOrder(int no);
	@Select("SELECT eventscategorization.displayName FROM items JOIN events ON items.code = events.item "
			+ "JOIN eventscategorization ON events.categorization = eventscategorization.displayorder "
			+ "where items.code = #{code}")
	String getEventCategorizationNameWithItemCode(int code);

	@Delete("Delete from events where no=#{no} ")
	void deleteEventsWithEventNo(int no);
	
	@Update("UPDATE items SET event=#{eventValue} WHERE code=#{itemCode}")
	void updateEventOfItemsWithItemCode(@Param("eventValue") boolean eventValue, @Param("itemCode") int itemCode);
	
	@Delete("Delete from eventsPictures where event=#{no} ")
	void deleteEventsPicturesWithEventNo(int no);
	
	@Select("SELECT * FROM eventspictures WHERE event=#{no}")
	EventsPictures getEventsPicturesWithEventNo(int no);
	@Select("SELECT item FROM events WHERE no=#{no}")
	int getItemsCodeOfEventsWithEventNo(int no);
	
	@Update("UPDATE eventspictures SET value=#{value} WHERE event=#{no}")
	void updateValueOfEventsPicturesWithEventNo(@Param("value") String value, @Param("no") int no);
	
	@Update("UPDATE events SET categorization =#{categorization}, item =#{item}, title1=#{title1}, title2=#{title2}, "
			+ "banner=#{banner}, startDate=#{startDate}, endDate=#{endDate}, state=#{state} "
			+ "WHERE no=#{no}")
	void updateEvents(Events event);
	
	@Select("SELECT no FROM events WHERE item=#{no}")
	int getEventNoOfEventsWithItemCode(int no);
	
	@Select("SELECT COUNT(no) FROM events WHERE categorization=#{cateNo}")
	int getItemCountOfEventsWithEventCategorization(int cateNo);
	
	@Update("UPDATE eventsCategorization SET displayOrder=#{newNum} WHERE displayOrder=#{oldNum}")
	void updateDisplayOrderOfEventsCategorization(@Param("newNum") int newNum, @Param("oldNum") int oldNum);

	@Insert("INSERT INTO eventsCategorization(displayOrder, displayName, name) "
			+ "VALUES(#{displayOrder}, #{displayName}, #{name})")
	void insertEventsCategorization(EventsCategorization eventCate);
	
	@Select("Select MAX(displayOrder) from eventscategorization")
	int getMaxOfEventsCategorization();
	@Select("Select * from eventsCategorization WHERE displayOrder = #{no}")
	EventsCategorization getEventsCategorizationWithNo(int no);

	@Update("UPDATE eventsCategorization SET displayOrder=#{displayOrder}, displayName=#{displayName}, name=#{name} WHERE displayOrder=#{oldNum}")
	void updateAllOfEventsCategorizationWithNo(@Param("displayOrder") int displayOrder, @Param("displayName") String displayName, @Param("name") String name , @Param("oldNum") int oldNum);
	@Select("SELECT * FROM events WHERE categorization = #{cateNo}")
	List<Events> getEventsListWithCategorization(int cateNo);
	
	@Delete("DELETE FROM eventsCategorization WHERE displayOrder=#{no}")
	void deleteEventsCategorization(int no);
*/
}
