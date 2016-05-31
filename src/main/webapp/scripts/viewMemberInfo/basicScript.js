
var $proceedItemLink;
var $endItemLink;
var $shoppingBoxLink;
var $interestedItemLink;

$(document).ready(function(){
	varInit();
	eventInit();
});

function varInit() {
	$proceedItemLink = $("span.proceedItemT a");
	$endItemLink = $("span.endItemT a");
	$shoppingBoxLink = $("span.shoppingBoxT a");
	$interestedItemLink = $("span.interestedItemT a");
}

function eventInit() {
	tab();
	}

