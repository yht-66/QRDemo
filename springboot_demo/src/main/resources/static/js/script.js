$(document).ready(function(){
		var result = $(".select-result .select-text").text();	
		var aresult ="";
		var bresult ="";
		var cresult ="";


	var url;

	$("#select1 dd").click(function () {
		$(this).addClass("selected").siblings().removeClass("selected");
		if ($(this).hasClass("select-all")) {
			$("#selectA").remove();
			aresult="";
		} else {
			var copyThisA = $(this).clone();
			if ($("#selectA").length > 0) {
				$("#selectA a").html($(this).text());
				console.log("a>>>>:"+$("#selectA a").html($(this).text()).text());
				 
				aresult="&brand=" +  $("#selectA a").html($(this).text()).text();
				
			} else {
				$(".select-result .select-text").append(copyThisA.attr("id", "selectA"));
				//$(".select-result dl").append(copyThisA.attr("id", "selectA"));
				console.log("a<<<<" + copyThisA.attr("id", "selectA").text());
				 
				aresult="&brand=" + copyThisA.attr("id", "selectA").text();
				 
		 
			}
		}


		result = aresult + bresult + cresult;

		
		console.log(" you have select:"+result);
		 url = "product?pageNum=1" + result;
		console.log("url:" + url);

		window.location.href= url;
	});
	
	$("#select2 dd").click(function () {
		$(this).addClass("selected").siblings().removeClass("selected");
		if ($(this).hasClass("select-all")) {
			$("#selectB").remove();
		} else {
			var copyThisB = $(this).clone();
			if ($("#selectB").length > 0) {
				$("#selectB a").html($(this).text());
				//bresult = $("#selectB a").html($(this).text()).text();
				bresult="&color=" +  $("#selectB a").html($(this).text()).text();

			 


			} else {
				$(".select-result .select-text").append(copyThisB.attr("id", "selectB"));
				console.log("b::::" + copyThisB.attr("id", "selectB").text());
				bresult="&color=" + copyThisB.attr("id", "selectB").text();

				 
			}
		}

		result = aresult +bresult + cresult;

		
		console.log(" you have select:"+result);
		 url = "product?pageNum=1" + result;
		console.log("url:" + url);
		window.location.href= url;
		
	});
	
	$("#select3 dd").click(function () {
		$(this).addClass("selected").siblings().removeClass("selected");
		if ($(this).hasClass("select-all")) {
			$("#selectC").remove();
		} else {
			var copyThisC = $(this).clone();
			if ($("#selectC").length > 0) {
				$("#selectC a").html($(this).text());
				 
				cresult="&size=" +  $("#selectC a").html($(this).text()).text();
			} else {
				$(".select-result .select-text").append(copyThisC.attr("id", "selectC"));
					console.log("c::::" + copyThisC.attr("id", "selectC").text());
				   
				   cresult="&size=" + copyThisC.attr("id", "selectC").text();
			}
		}
		result = aresult +bresult + cresult;
		
		console.log(" you have select:"+result);
		 url = "product?pageNum=1" + result;
		console.log("url:" + url);
		window.location.href= url;
	});
	
	$("#selectA").live("click", function () {
		$(this).remove();
		$("#select1 .select-all").addClass("selected").siblings().removeClass("selected");
	});
	
	$("#selectB").live("click", function () {
		$(this).remove();
		$("#select2 .select-all").addClass("selected").siblings().removeClass("selected");
	});
	
	$("#selectC").live("click", function () {
		$(this).remove();
		$("#select3 .select-all").addClass("selected").siblings().removeClass("selected");
	});
	
	$(".select dd").live("click", function () {
		if ($(".select-result dd").length > 1) {
			$(".select-no").hide();
		} else {
			$(".select-no").show();
		}
	});

});


