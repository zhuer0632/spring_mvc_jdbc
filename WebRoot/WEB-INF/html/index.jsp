<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<#assign path="${request.getContextPath()}">
<html>
	<head>
		<title>首页</title>
		
	</head>
	<body>
	
	
		${path}
		<br>
		${user.userName}
		
		<br>
		
		<div>
			<form action="${path}/person/addperson.do">
				<input type="submit" value="添加"/>
			</form>		
			
		</div>
		
	</body>
</html>
