function tab() {
	clickEvent();
}

function clickEvent() {
//alert("clickEvent!");	
	$proceedItemLink.click(function() {
//alert("proceedItemLinkClick!");		
/*below code hidden all contents area*/		
		$("div.tabcontent").hide();
/*below code change white color of the title.*/		
		$("div.dealSubBody>div>span").css("background-color","#ffffff");
/*below code show contents of itemInfo area*/				
		$("div#proceedItem").show();
/*below code change #ccc color of the selected title.*/		
		$(this).parent().css("background-color","#ccc");
	});
	$endItemLink.click(function() {
//alert("endItemLinkClick!");		
		$("div.tabcontent").hide();
/*below code change white color of the title.*/		
		$("div.dealSubBody>div>span").css("background-color","white");
		
		$("div#endItem").show();
		$(this).parent().css("background-color","#ccc");		
	});
	$shoppingBoxLink.click(function() {
//alert("shoppingBoxLinkClick!");		
		$("div.tabcontent").hide();
/*below code change white color of the title.*/		
		$("div.dealSubBody>div>span").css("background-color","white");
		
		$("div#shoppingBox").show();
		
		$(this).parent().css("background-color","#ccc");		
	});
	$interestedItemLink.click(function() {
//alert("interestedItemLinkClick!");		
		$("div.tabcontent").hide();
		$("div.dealSubBody>div>span").css("background-color","white");
		
		$("div#interestedItem").show();
		$(this).parent().css("background-color","#ccc");		
	});
	
}
