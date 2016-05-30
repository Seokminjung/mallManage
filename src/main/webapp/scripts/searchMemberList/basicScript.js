
/*below variables are used in the leftNav function*/
var $superLink;
var $subUl;
var $superLi;
var $subLi;
var $allLi;

/*below variables are used in the tab function*/
var $itemInfoLink;
var $deliveryInfoLink;
var $exchangeInfoLink;
var $questionInfoLink;

$(document).ready(function(){
	varInit();
	eventInit();
});

function varInit() {

/*below variables are used in the leftNav function*/	
	$superLink = $("li.superLi a");
	$subUl = $("ul.subUl");
	$superLi = $("li.superLi");
	$subLink = $("li.subLi a");
	$allLi = $("div#leftContents li");
		
/*below variables are used in the tab function*/
	$itemInfoLink = $("div#detailInfo span.itemInfoT a");
	$deliveryInfoLink  = $("div#detailInfo span.deliveryInfoT a");
	$exchangeInfoLink = $("div#detailInfo span.exchangeInfoT a");
	$questionInfoLink = $("div#detailInfo span.questionInfoT a");	

}

function eventInit() {
	tab();
	leftNav();
	}

