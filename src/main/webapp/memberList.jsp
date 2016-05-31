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
<title>event item List</title>
<link rel="stylesheet" href="./styles/memberList/basic.css">
<link rel="stylesheet" href="./styles/memberList/header.css">
<link rel="stylesheet" href="./styles/memberList/listContents.css">
<link rel="stylesheet" href="./styles/memberList/footer.css">
<script type="text/javascript" src="./scripts/jquery-2.1.4.min.js"></script>
<script type="text/javascript" src="./scripts/jquery.easing.1.3.js"></script>
<script src="./scripts/memberList/basicScript.js"></script>
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
			<li><a href="<%=response.encodeURL("eventCategoryList.action")%>">event category </a></li>
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
			<span> Home > member > list </span>
		</div>
	</div>
	<div id="contents">
		<div id="centerContents">
			<div id="contentsTitle">
				<h3>Member list</h3>
			</div>
			<div id="contentsInputBox">
				<div id="leftHeader">
					<input type="button" name="delete" value="삭제" />
<!-- 					<input type="button" name="modify" value="수정" />  -->
					<input type="button" name="add" value="추가" />
				</div>
				<div id="rightHeader">
				 <form name="searchForm"  method='POST' action='<s:url action="searchMemberList" />'>
				 	<select>
				 		<option> ID </option>
				 		<option> NAME </option>
				 		<option> TELL </option>
				 	</select>
					<input type="text" name="searchText" />
					<input type="submit" name="searchSubmit" value="Search" />
				</form>
				</div>
			</div>
			<div id="contentsBody">
				<div id="contentsHeader">
					<span class="checkBox"><input class='firstCheckBox' type="checkbox" name="checkEventNo" /></span>
					<span class="id"> ID </span>
					<span class="name"> NAME </span>
					<span class="tell"> TELL </span>
					<span class="regDate"> Registration Date </span>
				</div>
				
<c:forEach var="memberObj" items="${partBordList}"  varStatus="status1">
				<div class="contentsList">
					<span class="checkBox"><input type="checkbox" name="checkMemberNo" value='222'/></span>
					<span class="id"><a href='<%=response.encodeURL("viewMemberInfo.action?no=")%>${memberObj.no}' > ${memberObj.id} </a></span>
					<span class="name"> ${memberObj.name}	</span>	
					<span class="tell"> ${memberObj.phone}  </span>
					<span class="regDate"> ${memberObj.regDate} </span>
				</div>
</c:forEach>	
				
			</div>
			<div id="itemIndex">
			
	<c:forEach varStatus="i" begin="0" end="6">
      <c:choose>
		 <c:when test="${i.index==0}">
			<c:choose>
				<c:when test="${secNum<=1}">
					<div><i><a href="#">&nbsp;</a>	</i></div>
				</c:when>
				<c:otherwise>
					<div>
	<c:set var="pn" value="${(secNum*5)-5}"/>
					<i> <a href=${url}${pn}>PriviousPage</a>	</i>
					</div>
				</c:otherwise>
			</c:choose>
		</c:when>
		<c:when test="${i.index==6}">
			<c:if test="${secNum==secSize}">
					<div><i><a href="#">&nbsp;</a>	</i></div>
			</c:if>
			<c:if test="${secNum!=secSize}">
				<div>
				<c:set var="pn" value="${(secNum*5)+1}"/>
			<i> <a href=${url}${pn}> NextPage</a></i>
				</div>
			</c:if>
		</c:when>
	   <c:otherwise>
			<c:if test="${pgNumSize<i.index}">
					<div><i><a href="#">&nbsp;</a>	</i></div>
			</c:if>
			<c:if test="${pgNumSize>=i.index}">
				<div>
			<i> <a href=${url}${pgNumList[i.index-1]}>
				</a>	</i>
				</div>
			</c:if>			
	   </c:otherwise>
     </c:choose>
   </c:forEach>					

			</div>							
		</div>
	</div>
	<div id="footer">
	</div>
</div>	
</body>
</html>