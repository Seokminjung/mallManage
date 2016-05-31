<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" %>
<!-- The express language is enable. -->    
<%@ page isELIgnored="false" %>   
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

		<c:set var="bordList" value="${partBordList}" />	
	  	<c:set var="pgNumList" value="${pageNumList}" />	
		<c:set var="secSize" value="${sectionSize}" />
		<c:set var="secNum" value="${sectionNum}" />	
		<c:set var="totalItemSize" value="${totalBordSize}" />
		<c:set var="pgNumSize" value="${fn:length(pgNumList)}" />
		<c:set var="pageNum" value="${pageNum}" />
		<c:set var="url" value='<%=response.encodeURL("eventItemList.action?pageNum=")%>'/>
		<c:set var="url2" value='&searchTarget=${searchTarget}&searchContents=${searchContents}'/>
		
<html>
<head>
<meta charset="UTF-8">
<title>MALL HOME</title>
<link rel="stylesheet" href="./styles/viewMemberInfo/basic.css">
<link rel="stylesheet" href="./styles/viewMemberInfo/header.css">
<link rel="stylesheet" href="./styles/viewMemberInfo/contents.css">
<link rel="stylesheet" href="./styles/viewMemberInfo/footer.css">
<script type="text/javascript" src="./scripts/jquery-2.1.4.min.js"></script>
<script src="./scripts/viewMemberInfo/basicScript.js"></script>
<script src="./scripts/viewMemberInfo/tabScript.js"></script>
</head>
<body>
<div id="container">
	<div id="header">
		<div id="banner">
		This area is banner<br>
		width 1024px<br>
		height 100px
	</div>
		<div id="nav1">
<ul id="nav">
    <li><a href="#">Statistics</a> 
		<ul id="statisticsUl">
	    	<li><a href="#">Counting</a>
				<ul id="countUl">
	            	<li><a class="countA" href="#" >The number of visits</a></li>
	            	<li><a class="countA" href="#">The number of click the item</a></li>
	            	<li><a class="countA" href="#">The number of buyer</a></li>
				</ul>
  	    	</li>	
        	<li><a href="#">Trend in sale</a>
				<ul id="saleUl">
        	    	<li><a href="#">Total</a></li>
	            	<li><a href="#">Category</a></li>
        	    	<li><a href="#">item</a></li>
				</ul>
	    	</li>
        	<li><a href="#">Rank</a>
				<ul id="rankUl">
       		    	<li><a href="#">Item sales Aggregate</a></li>
        	    	<li><a href="#">The number of goods sold</a></li>
        	    	<li><a href="#">The number of buyers</a></li>
				</ul>
	    	</li>
		</ul>
    </li>
    <li><a href="#">Log</a> 
	<ul class="logUl">
       	    <li><a class="userA" href="#">Connecting</a></li>
	    <li><a class="userA" href="#">Person information</a></li>
       	    <li><a class="userA" href="#">Site navigation</a></li>
	</ul>
    </li>
    <li><a href="#">Event</a> 
		<ul id="eventUl">
			<li><a href="#">event category </a></li>
            <li><a href="#">Nomal event </a></li>
            <li><a href="#">Event associated with the item </a>
				<ul>
					<li><a href="#">Nomal</a></li>
					<li><a href="#">Discount</a></li>
					<li><a href="#">Planned sale	 </a></li>
                    <li><a href="#">Best </a></li>
					<li><a href="#">Etc</a></li>
				</ul>
	   		</li>
		</ul>
    </li>
    <li><a href="#">Board</a>
	<ul id="boardUl">
            <li><a class="boardA" href="#">QnA</a></li>
            <li><a class="boardA" href="#">FAQ</a></li>
            <li><a class="boardA" href="#">NOTICE</a></li>
	</ul>
    </li>
    <li><a href="#">ShoppingBag</a>
    </li>
    <li><a href="#">WishList</a>
    </li>
    <li><a href="#">OrderItem</a></li>
    <li><a href="#">Member</a> </li>
    <li><a href="#">Suppliers</a> </li>
    <li><a href="#">Item</a>
	<ul id="itemUl">
            <li><a class="itemA" href="#">Category</a>
			<ul>
		            <li><a class="itemA" href="#">Addition</a></li>
		            <li><a class="itemA" href="#">Modification</a></li>
		            <li><a class="itemA" href="#">Removal</a></li>
			</ul>
	    </li>
            <li><a class="itemA" href="#">Item</a>
			<ul>
		            <li><a class="itemA" href="#">Addition</a></li>
		            <li><a class="itemA" href="#">Modification</a></li>
		            <li><a class="itemA" href="#">Removal</a></li>
			</ul>
	    </li>		
            <li><a class="itemA" href="#">Information </a></li>
	</ul>
    </li>
    <li><a href="#">Message box</a>
	<ul id="messageUl">
            <li><a class="messageA" href="#">Writing </a></li>
            <li><a class="messageA" href="#">Sent box </a></li>
            <li><a class="messageA" href="#">Inbox </a></li>
	</ul>
    </li>
    
    <li><a href="#">SiteMap</a> </li>
</ul>
		</div>

		<div id="navState">
			<span>Home > member > <a href='<%=response.encodeURL("memberList.action")%>' > list </a> > view member </span>
		</div>
	</div>
	<div id="contents">
		<div id="centerContents">
			<div id="contentsTitle">
				<h3>View member information</h3>
			</div>
			<div id="contentsBody">
				<div class="subTitle">
					<input type='radio' name='subMenu' value='general' />
					<spna>General information</spna>
					<div class='date'>
						<span>등록일: ${memberObject.regDate}</span>
<!-- this tag 'ne' mean not equal. -->						
						<c:if test='${memberObject.modifyDate ne null }' >
							<span>수정일: ${memberObject.modifyDate}</span>
						</c:if>
						<c:if test='${memberObject.modifyDate eq null }' >
							<span>수정일: ${memberObject.regDate}</span>
						</c:if>
					</div>
				</div>
				<div class="subBody">
					<div>
						<span class='index'> Name: </span>
						<input type='text' name='name' value='${memberObject.name}' />
					</div>
					<div>
						<span class='index'> Id: </span>
						<input type='text' name='Id' value='${memberObject.id}' />
					</div>
					<div>
						<span class='index'> Password: </span>
						<input type='text' name='Password' value='${memberObject.password}' />
					</div>
					<div>
						<span class='index'> Phone: </span>
						<input type='text' name='Phone' value='${memberObject.phone}' />
					</div>
					<div>
						<span class='index'> Mileage: </span>
						<input type='text' name='Mileage' value='${memberObject.mileage}' />
					</div>
					<div>
						<span class='index addr'> Address</span>
<!-- below value of name is used to css. -->						
						<input type='text' name='addr1' />
						<input type='text' name='addr2' />
					</div>
					<div id='recover'>
						<span class='index'> Recover account</span>
						<div>
							<span class='index'> request: </span>
							<input type='text' name='request' value='${memberObject.accAsk}' />
						</div>
						<div>
							<span class='index'> answer: </span>
							<input type='text' name='answer' value='${memberObject.accAnswer}' />
						</div>
					</div>
				</div>
				
				<div class="subTitle dealSubTitle">
					<input type='radio' name='subMenu' value='dealActivity' />
					<spna>Deal activity information</spna>
				</div>
<!-- 				<div class="subBody dealSubBody"> -->
				<div class="dealSubBody">
					<div>
						<span class="proceedItemT"><a href="#">진행중인 구매 상품</a></span>
						<span class="endItemT"><a href="#">종료된 구매 상품</a></span>
						<span class="shoppingBoxT"><a href="#">장바구니 상품</a></span>
						<span class="interestedItemT"><a href="#">관심 상품</a></span>
					</div>
					<div id="proceedItem" class="tabcontent">
							<div class='listHeader'>
								<span class='no'>NO</span>
								<span class='code'>CODE</span>
								<span class='name1'>NAME1</span>
								<span class='quantity'>QUANTITY</span>
								<span class='state'>STATE</span>
								<span class='date'>DATE</span>
							</div>
<c:if test='${proceedPurchaseList ne null}' >
	<c:forEach var="purchaseObjList" items="${proceedPurchaseList}"  varStatus="status">
							<div class='list'>
								<span class='no'>${status.index}</span>
								<span class='code'>${purchaseObjList.itemObject.code}</span>
								<span class='name1'>${purchaseObjList.itemObject.name1}</span>
								<span class='quantity'>${purchaseObjList.purObj.quantity}</span>
								<span class='state'>${purchaseObjList.purObj.purchasestate}</span>
								<span class='date'>${purchaseObjList.purObj.regdate}</span>
							</div>
	</c:forEach>							
</c:if>
				</div>

				<div id="endItem" class="tabcontent">
						<div class='listHeader'>
							<span class='no'>NO</span>
							<span class='code'>CODE</span>
							<span class='name1'>NAME1</span>
							<span class='quantity'>QUANTITY</span>
							<span class='state'>STATE</span>
							<span class='date'>DATE</span>
						</div>
<c:if test='${endedPurchaseList ne null}' >	
<c:forEach var="purchaseObjList" items="${endedPurchaseList}"  varStatus="status">
						<div class='list'>
							<span class='no'>{status.index}</span>
							<span class='code'>${purchaseObjList.itemObject.code}</span>
							<span class='name1'>${purchaseObjList.itemObject.name1}</span>
							<span class='quantity'>${purchaseObjList.purObj.quantity}</span>
							<span class='state'>${purchaseObjList.purObj.purchasestate}</span>
							<span class='date'>${purchaseObjList.purObj.regdate}</span>
						</div>						
</c:forEach>						
</c:if>						
				</div>

				<div id="shoppingBox" class="tabcontent">
						<div class='listHeader'>
							<span class='no'>NO</span>
							<span class='code'>CODE</span>
							<span class='name1'>NAME1</span>
							<span class='quantity'>QUANTITY</span>
							<span class='date'>DATE</span>
						</div>
						<div class='list'>
							<span class='no'>1</span>
							<span class='code'>123</span>
							<span class='name1'>상주참외</span>
							<span class='quantity'>2</span>
							<span class='date'>2001-02-11</span>
						</div>
						<div class='list'>
							<span class='no'>2</span>
							<span class='code'>124</span>
							<span class='name1'>상주딸기</span>
							<span class='quantity'>4</span>
							<span class='date'>2001-02-11</span>
						</div>
				</div>
				<div id="interestedItem" class="tabcontent">
						<div class='listHeader'>
							<span class='no'>NO</span>
							<span class='code'>CODE</span>
							<span class='name1'>NAME1</span>
							<span class='date'>DATE</span>
						</div>
						<div class='list'>
							<span class='no'>1</span>
							<span class='code'>123</span>
							<span class='name1'>상주참외</span>
							<span class='date'>2001-02-11</span>
						</div>
						<div class='list'>
							<span class='no'>2</span>
							<span class='code'>124</span>
							<span class='name1'>상주딸기</span>
							<span class='date'>2001-02-11</span>
						</div>
				</div>
			</div>
															
				</div>				
			</div>							
		</div>
	</div>
	<div id="footer">
	</div>
</div>	
</body>
</html>