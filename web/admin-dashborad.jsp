<html>
<head>
<link href="stylesheet.css" type="text/css" rel="stylesheet">
<title>Bus Management system</title>
<style>


</style>
</head>
<body>
<div class="top-bar">
    <h1> <i class="fas fa-bus"> </i>BUS MANAGEMENT SYSTEM </h1>
</div>
<div class="content">
	
		<div class="login-form">
			<div class="buttons">
				<div class="form-group w50">
                                    <input type="button"  class="form-control" class="btn" id="add-student" name="btn-login" value="Add Student" />
                                    </div>
				<div class="form-group w50">
					<input type="button"  class="form-control"  id="remove-student" name="btn-forget" value="Remove Student" />
				</div>
				<div class="form-group w50">
					<input type="button"  class="form-control" id="add-driver" name="btn-login" value="Add Driver" />
				</div>
				<div class="form-group w50">
					<input type="button"  class="form-control"  id="delete-driver" name="btn-forget" value="Delete Driver" />
				</div>
				<div class="form-group w50">
					<input type="button"  class="form-control"  id="give-route" name="btn-login" value="Give New Route" />
				</div>
				<div class="form-group w50">
					<input type="button"  class="form-control"  id="change-route" name="btn-forget" value="Change Route" />
				</div>
			</div>
	</div>
</div>

<div id="addstudentform" class="modal">
	<div class="modal-content">
            <form action="AdminServlet" method="get">
                <input type="hidden" name="test" value="addS"/>
		<span class="close">&times;</span>
		<h2>Fill Details</h2><br> <br>
		<div class="form-group">
                    
                    <input type="text" class="form-control" name="firstname" placeholder="Student Name">
                </div>
                <div class ="form-group">
                    <input type="text" class="form-control" name="id" placeholder="Student ID">
                </div>
	
                <div class ="form-group">
                    <input type="text" class="form-control"name="phone" placeholder="Student Phone Number">
                </div>
                <div class ="form-group">
                    <input type="text" class="form-control" name="address" placeholder="Address">
                </div>
                <div class="form-group">
                     <input type="text" class="form-control" name="sroute" placeholder="Student Route">
                </div>  

                <div class="form-group">
                   <input type="password" class="form-control" name="spassword" placeholder="Student Password"> 
                </div>
                <div class =form-group>
                    <input type="submit" class ="form-control" value="Submit">
                </div>
                </form>
	 </div>

</div>

<div id="adddriverform" class="modal">
	<div class="modal-content">
            <form action="AdminServlet" method="get">
                <input type="hidden" name="test" value="addD"/>
		<span class="close">&times;</span>
		<h2>Fill Details</h2>
                <div class="form-group"> 
			  <input type="text" class="form-control" name="dname" placeholder="Driver Name">
                </div>
                <div class="form-group"> 
			  <input type="text" class="form-control" name="dnumber" placeholder="Driver Phone Number">
                </div>
                <div class="form-group"> 
			  <input type="text" class="form-control" name="did" placeholder="Driver ID">
                </div>
                <div class="form-group"> 
			  <input type="text" class="form-control" name="daddress" placeholder="Address">
                </div>
		 <div class="form-group"> 
                     <input type="submit" class ="form-control" value="Submit">
                 </div>
            </form>
	 </div>

</div>

<div id="deletedriverform" class="modal">
	<div class="modal-content">
            <form action="AdminServlet" method="get">
                <input type="hidden" name="test" value="deleteD"/>
		<span class="close">&times;</span>
		<h2>Fill Details</h2><br> <br>
                    <div class="form-group">
                    <input type="text" class="form-control" name="dname" placeholder="Driver Name">
                    </div>
                    <div class ="form-group">
                     <input type="text" class="form-control" name="did" placeholder="Driver ID">
                    </div>
                    <div class ="form-group">
                              <input type="submit" class ="form-control" value="Delete">
                    </div>
            </form>
	 </div>

</div>
    <div id="removestudentform" class="modal">
	<div class="modal-content">
            <form action="AdminServlet" method="get">
                <input type="hidden" name="test" value="deleteS"/>
		<span class="close">&times;</span>
		<h2>Fill Details</h2><br> <br>
		<div class="form-group">
			
			  <input type="text" class="form-control" name="sid" placeholder="Student ID">
                </div>  
                
                <div class="form-group">
			  <input type="submit" class="form-control" value="Delete">
                </div>
            </form>
	 </div>
</div>
    <div id="giverouteform" class="modal">
	<div class="modal-content">
            <form action="AdminServlet" method="get">
                <input type="hidden" name="test" value="giveR"/>
		<span class="close">&times;</span>
		<h2>Fill Details</h2><br> <br>
		<div class="form-group">
			
			  <input type="text" class="form-control" name="route_id" placeholder="Route ID">
                </div> 
		<div class="form-group">
			
			  <input type="text" class="form-control" name="stop1" placeholder="Stop 1">
                </div> 				
				<div class="form-group">
			
			  <input type="text" class="form-control" name="stop2" placeholder="Stop 2">
                </div> 
				<div class="form-group">
			
			  <input type="text" class="form-control" name="pickip" placeholder="Pick Up">
                </div> 
                
                <div class="form-group">
			  <input type="submit" class="form-control" value="Create">
                </div>
            </form>
	 </div>
</div>
    <div id="changerouteform" class="modal">
	<div class="modal-content">
            <form action="AdminServlet" method="get">
                <input type="hidden" name="test" value="changeR"/>
		<span class="close">&times;</span>
                <h2>Fill Details</h2><br> <br>
		<div class="form-group">
			
			  <input type="text" class="form-control" name="rid" placeholder="Route ID">
                </div> 
		<div class="form-group">
			
			  <input type="text" class="form-control" name="s1" placeholder="Stop 1">
                </div> 				
				<div class="form-group">
			
			  <input type="text" class="form-control" name="s2" placeholder="Stop 2">
                </div> 
				<div class="form-group">
			
			  <input type="text" class="form-control" name="p1" placeholder="Pick Up">
                </div> 
                
                <div class="form-group">
			  <input type="submit" class="form-control" value="Create">
                </div>
            </form>
	 </div>
</div>
    


    


<div class="footer"> </div>
<script>
//getting forms
var addstudent = document.getElementById('addstudentform');
var adddriver = document.getElementById('adddriverform');
var deletedriver = document.getElementById('deletedriverform');
var removestudent= document.getElementById('removestudentform');
var giveroute= document.getElementById('giverouteform');
var changeroute= document.getElementById('changerouteform');

document.getElementsByClassName("close")[0].onclick = function() {
  addstudent.style.display = "none";
}
document.getElementsByClassName("close")[1].onclick = function() {
  adddriver.style.display = "none";
}
document.getElementsByClassName("close")[2].onclick = function() {
  deletedriver.style.display = "none";
}
document.getElementsByClassName("close")[3].onclick = function() {
  removestudent.style.display = "none";
}
document.getElementsByClassName("close")[4].onclick = function() {
  giveroute.style.display = "none";
}
document.getElementsByClassName("close")[5].onclick = function() {
  changeroute.style.display = "none";
}
//getting the buttons from main form
addstudentbtn = document.getElementById('add-student');
adddriverbtn = document.getElementById('add-driver');
deletedriverbtn = document.getElementById('delete-driver');
removestudentbtn=document.getElementById('remove-student');
giveroutebtn=document.getElementById('give-route');
changeroutebtn=document.getElementById('change-route')
addstudentbtn.onclick = function(){
    addstudent.style.display ='block';
}
adddriverbtn.onclick = function(){
    adddriver.style.display ='block';
}
deletedriverbtn.onclick = function(){
    deletedriver.style.display ='block';
}
    
removestudentbtn.onclick = function(){
    removestudent.style.display ='block';
}
giveroutebtn.onclick = function(){
    giveroute.style.display ='block';
}
changeroutebtn.onclick = function(){
    changeroute.style.display ='block';
}



</script>

</body>
</html>