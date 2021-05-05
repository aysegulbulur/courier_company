<!--
 * @author AysegulBulur
 * @version 2.4.5
 * @since  2021-05-04
-->

<%@ page language="java" 
		contentType="text/html; charset=ISO-8859-1"
    	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html bgcolor="#CCFFFF">
<head>
	<title>Courier Company</title>
	<link rel = "icon" href = "data:image/png;base64,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" 
        type = "image/x-icon">
	<meta charset="utf-8">
	
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body bgcolor="#CCFFFF">
	<center>
		<br></br>
		<h1>${message}</h1>
		<!-- The message is received from the WelcomeController page. -->
		<br></br>
		<input type="text" style="width: 300px; height: 40px" id="txtTarget" name="target" placeholder="Please write in kilograms of your package..."/>
    	<br></br>
    	<input type="submit" class="btn btn-primary" id="btnCheck" value="Check"/>
    	<br></br>
    	<label id="lblTarget"></label>
    	<br></br><br></br><br></br><br></br><br></br><br></br><br></br>
    	<label id="lblInformation" color="white" >*You can send a package of minimum 2 kg and maximum 30 kg....</label>
	</center>
	<script>
		var calculation=document.getElementById("txtTarget");
		var btnCalculation=document.getElementById("btnCheck");
		<!-- document.getElementById : Its id takes the reference of the specified element. -->
		
		btnCalculation.onclick=function(){
			var text="";	<!-- When run, lbl comes as free space. -->
			var target=Number(calculation.value);	<!-- Account value is of type Number -->
			
			var septuple = 0, multiplesOfTwo = 0, remainderInDivision;
			<!-- septuple : 7 kg , multiplesOfTwo : 2 kg , remainderInDevision : Remainder from dividing by 7 or 2 -->
			var flag = new Boolean(true);
			<!-- Outputs will be generated according to true and false status. -->
			
			try{
				if(target == "") throw "Please do not leave blank...";
				if(isNaN(target)) throw "Please write the value as integer...";
				
				if(0 < target && target <= 30){
					if (target < 7){
						if(target % 2 == 0){
							multiplesOfTwo = target / 2;
							text = "Use " + multiplesOfTwo + " grains, 2 kilograms of soap..." + "<br>" + "To reach the " + target + 
								" kilograms we can create a " + target + " kilograms package with " + multiplesOfTwo + 
								" ,2 kilograms soaps...";
						
						}
						else{
							flag = false;
						}
					}
					else{
						septuple = parseInt(target / 7);
						remainderInDivision = target % 7;
						if(target % 7 == 0){
							text = "No soap of 2 kilograms is used...." + "<br>" + "To reach the " + target + 
								" kilograms we can create a " + target + " kilograms package with " + septuple + 
								" ,7 kilograms soaps...";
						
						}
						else{
							if(remainderInDivision % 2 == 0){
								multiplesOfTwo = remainderInDivision / 2;
								text = "Use " + multiplesOfTwo + " grains, 2 kilograms of soap..." + "<br>" + "In order to reach the " + target + 
									" kilogram, we can create a " + target + " kilogram package with " + septuple + " of 7 kilograms and " + multiplesOfTwo + " pieces of 2 kilograms of soap...";
							
							}
							else{
								flag = false;
							}
						}
					}
				}
				else{
					flag = false;
				}
				if(flag == false){
					text = "-1" + "<br>" + "We cannot reach the " + target + " kilogram with 7 and 2 kilogram packages....";
				}
				document.getElementById("lblTarget").innerHTML=text;
			}
			catch(err){
				document.getElementById("lblTarget").innerHTML=err;
			}
		}
			
	</script>
</body>
</html>