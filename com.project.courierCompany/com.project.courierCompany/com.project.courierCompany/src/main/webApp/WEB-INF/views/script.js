<script>

<%@page import="com.courierCompany.com.project.courierCompany.JspLogger"%>
<%JspLogger sLogger = new JspLogger();
  sLogger.scriptPage();%>

class A{
	constructor(septuple, multiplesOfTwo, remainderInDivision, target){
		this.septuplee = 0;
		this.multiplesOfTwoo = 0;
		this.remainderInDivisionn = remainderInDivision;
		this.targett = target;
	}
	
	get septuple(){
		return this.septuplee;
	}
	set septuple(y){
		this.septuplee = y;
	}
	get multiplesOfTwo(){
		return this.multiplesOfTwoo;
	}
	set multiplesOfTwo(i){
		this.multiplesOfTwoo = i;
	}
	get remainderInDivision(){
		return this.remainderInDivisionn;
	}
	set remainderInDivision(k){
		this.remainderInDivisionn = k;
	}
	get target(){
		return this.targett;
	}
	set target(h){
		this.targett = h;
	}
}

var preparePackage = function(){
	
	var a = new A(0, 0, 0, 0);
	
	a.target = document.getElementById("txtTarget").value;
	
	try{
		if(a.target == "") throw "Please do not leave blank...";
		if(isNaN(a.target)) throw "Please write the value as integer...";
		if(0 < a.target && a.target <= 30){
			if(a.target < 7){
				if(a.target % 2 == 0){
					a.multiplesOfTwo = a.target / 2;
					document.getElementById("second").innerHTML = "Use " + a.multiplesOfTwo + " grains, 2 kilograms of soap..." + "<br>" + 
						"To reach the " + a.target + " kilograms we can create a " + a.target + " kilograms package with " + a.multiplesOfTwo + 
						" ,2 kilograms soaps...";
				}
				else{
					document.getElementById("second").innerHTML = "-1" + "<br>" + "We cannot reach " + a.target + " kilograms with 7 and 2 kilograms packages...";
				}
			}
			else{
				a.septuple = parseInt(a.target / 7);
				a.remainderInDivision = a.target % 7;
				if(a.target % 7 == 0){
					document.getElementById("second").innerHTML = "No soap of 2 kilograms is used..." + "<br>" + "To reach the " + a.target + " liograms we can create a " + a.target + " kilograms package with " + 
						a.septuple + " ,7 kilograms soap...";
				}
				else{
					if(a.remainderInDivision % 2 == 0){
						a.multiplesOfTwo = a.remainderInDivision / 2;
						document.getElementById("second").innerHTML = "Use " + a.multiplesOfTwo + " grains, 2 kilograms of soap..." + "<br>" + "In order to reach the " + a.target + " kilograms, we can create a " + 
							a.target + " kilograms package with " + a.septuple + " of 7 kilograms and " + a.multiplesOfTwo + "pieces of 2 kilograms of soap...";
					}
					else{
						document.getElementById("second").innerHTML = "-1" + "<br>" + "We cannot reach " + a.target + " kilograms with 7 and 2 kilograms packages...";
					}
				}
			}
		}
		else{
			document.getElementById("second").innerHTML = "-1" + "<br>" + "We cannot reach " + a.target + " kilograms with 7 and 2 kilograms packages...";
		}
	}
	catch(err){
		document.getElementById("second").innerHTML = err;
	}
	
}

</script>