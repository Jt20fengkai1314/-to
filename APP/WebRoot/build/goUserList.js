$(function() {
	$("#A").change(function() {

				var parentId = $(this).val();
				if (parentId == 0) {
					$("#B").html("<option value='0'></option>");
				} else {

					$("#B").html("<option value='0'>--请选择--</option>");
					$.post("../user/Secondary/" + parentId, {}, function(data) {
			
						if (data != null) {
							if (data.data != null) {
								var B = $("#B").html();
								for (var i = 0; i < data.data.length; i++) {
									B = B + "<OPTION value='" + data.data[i].id
											+ "'>" + data.data[i].categoryname
											+ "</OPTION>";
								}
								$("#B").html(B);
							}
						}
					}, "json");
				}
			});


		$("#B").change(function() {
							var parentId = $("#B").val();
							if (parentId == 0) {
								$("#C").html("<option value='0'></option>");
							} else {
								$("#C").html("<option value='0'>--请选择--</option>");
								$.post("../user/Secondary2/"+ parentId,{},function(data) {
													if (data != null) {
														if (data.data != null) {
															var C = $("#C").html();
															for (var a = 0; a < data.data.length; a++) {
																C = C+ "<OPTION value='"+ data.data[a].id+ "'>"+ data.data[a].categoryname+ "</OPTION>";
															}
															$("#C").html(C);
														}
													}
												}, "json");
							}
						});
		

		
		$("#BB").click(function(){
			alert("版本没有更新，不能进行审核！");
			
		});							

});