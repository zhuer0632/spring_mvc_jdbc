<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<#assign path="${request.getContextPath()}">
<html>
	<head>
		<title>首页</title>
		<style type="text/css">
.divclass {
	margin: 10px;
	border: 1px solid red;
}

.divclass input {
	display: block;
	margin: 20px;
}
</style>
		<script type="text/javascript" src="${path}/js/jquery-1.7.2.min.js"></script>
		<script type="text/javascript" src="${path}/js/common.js"></script>
		<script>
	$(document).ready(function() {
		$("#btn").click(func);
	});

	function func() {
		var result = getJson("", "${path}/TransCtrl/test00.do");
		alert(result);
	}
 
</script>
	</head>
	<body>
		t${path}
		<br>
		${user.userName}
		<br>

		<div class="divclass">
			<input type="button" id="btn" value="测试">
		</div>

	</body>
</html>
