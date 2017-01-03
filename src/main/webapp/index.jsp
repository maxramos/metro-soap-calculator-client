<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Metro Soap Calculator Client</title>
</head>
<body>
<div>
	<h1>Calculator</h1>
	<form method="post" action="calculator">&nbsp;
		<input type="text" name="value1" value="2" size="3" />+
		<input type="text" name="value2" value="2" size="3" />=
		<input type="submit" value="Sum" />
	</form>
</div>
<div>	
	<h1>Asymmetric Calculator</h1>
	<form method="post" action="asymmetric-calculator">&nbsp;
		<input type="text" name="value1" value="2" size="3" />+
		<input type="text" name="value2" value="2" size="3" />=
		<input type="submit" value="Sum" />
	</form>
</div>
<div>	
	<h1>Symmetric Calculator</h1>
	<form method="post" action="symmetric-calculator">&nbsp;
		<input type="text" name="value1" value="2" size="3" />+
		<input type="text" name="value2" value="2" size="3" />=
		<input type="submit" value="Sum" />
	</form>
</div>
<div>	
	<h1>Transport Calculator</h1>
	<form method="post" action="transport-calculator">&nbsp;
		<input type="text" name="value1" value="2" size="3" />+
		<input type="text" name="value2" value="2" size="3" />=
		<input type="submit" value="Sum" />
	</form>
</div>
</body>
</html>
