
var $addEventItemButton;
var $modifyEventItemButton;
var $deleteEventItemButton;

var $checkBox;
var $firstCheckBox;
$(document).ready(function(){
	varInit();
	eventInit();
});

function varInit() {
	$addEventItemButton=$("div#leftHeader input[name=add]");
/*	$modifyEventItemButton=$("div#leftHeader input[name=modify]");*/
	$deleteEventItemButton=$("div#leftHeader input[name=delete]");
	
	$checkBox = $("div#contentsBody input[name=checkEventNo]");
	$firstCheckBox = $("div#contentsHeader input.firstCheckBox");
}

function eventInit() {
	clickEvent();
	firstCheckEvent();
	}
function firstCheckEvent() {

	$firstCheckBox.change(function() {
		
		if($firstCheckBox.prop('checked') == true) {
			$checkBox.each(function() {
				if($(this).prop('checked')==false) {
					$(this).prop('checked',true);
					}
			});
		}
		else {
			$checkBox.each(function() {
				if($(this).prop('checked')==true) {
					$(this).prop('checked',false);
					}
			});
		}
	});
}
function clickEvent() {
	var checkCount=0;
	var eventNo;
	
	$addEventItemButton.click(function() {
	location.assign("addEventItem.action");
	});
	
	$modifyEventItemButton.click(function() {
	
		$checkBox.each(function() {
			if($(this).prop('checked')==true) {
				eventNo = $(this).val();
				checkCount++;
			}
		});		

		if(checkCount>1) {
			alert("select one event only!");
			checkCount=0;
		return false;
			}
		if(checkCount==0) {
			alert("not select event, select event!");
			checkCount=0;			
		return false;
						}
		if(checkCount==1) {
			alert("selected event code: " + eventNo);
			location.assign("modifyEventItem.action?eventNo="+eventNo);
		}		
		return true;
		
	});
	
	$deleteEventItemButton.click(function() {
		var noList = [];
		$checkBox.each(function() {
			if($(this).prop('checked')==true) {
				noList.push($(this).val());
				}
		});
		location.assign("deleteEventItem.action?eventNoList="+noList);		
	});
}

