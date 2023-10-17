$(document).ready(function() {
	$("#searchBtn").click(function() {
		var searchLocation = $("#searchLocation").val();
		$("#hotelTbl tr:not(:first)").remove();
		$.ajax({
			type: "GET",
			contentType: "application/json",
			url: "http://localhost:8282/searchHotel/"+searchLocation,
			success: function(result) {
				$.each(result, function(key, value) {
					$("#hotelTbl").append("<tr data-hotelName='"+value.hotelName+"' data-starRating='"+value.starRating+"' data-averagePrice='"+value.averagePrice+"'><td>" + value.hotelName + "</td><td><img src='"+ value.imageURL + "' width='400',height='400'/></td><td>" + value.starRating + "</td><td>" + value.averagePrice + "</td></tr>")
					
				});
			},
			error: function(e) {
	
			}
		});
	});
	
	$("#filterBtn").click(function() {
		var price = parseInt($("#priceValue").text());
		var hotelList = $("#hotelTbl tr:not(:first)");
		$.each(hotelList, function(key, value) {
			var averagePrice = parseInt($(value).attr("data-averagePrice"));
			
			if(averagePrice>price){
				$(this).hide();
			}
		});
	});
	
	
});
