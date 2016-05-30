var oEditors = [];
window.onload=onLoadSmartEditor;
function onLoadSmartEditor() 
{
	nhn.husky.EZCreator.createInIFrame({
		oAppRef: oEditors,
		elPlaceHolder: "ir1",
		sSkinURI: "./sm/SmartEditor2Skin.html",
		fCreator: "createSEditor2"
	});
}

