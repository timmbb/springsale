jQuery(document).ready(function(){

	///// TRANSFORM CHECKBOX /////
	jQuery('input:checkbox').uniform();

	///// LOGIN FORM SUBMIT /////
	jQuery('#login').submit(function(){

		if(jQuery('#UserName').val() == '' && jQuery('#PassWord').val() == '') {
			jQuery('.nousername').fadeIn();
			jQuery('.nopassword').hide();
			return false;
		}
		if(jQuery('#UserName').val() != '' && jQuery('#PassWord').val() == '') {
			jQuery('.nopassword').fadeIn().find('.userlogged h4, .userlogged a span').text(jQuery('#UserName').val());
			jQuery('.nousername').hide();
			return false;;
		}
	});

	///// ADD PLACEHOLDER /////
	jQuery('#UserName').attr('placeholder','Username');
	jQuery('#PassWord').attr('placeholder','Password');
});