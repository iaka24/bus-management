<html>
<head>
<title>Bus Management system</title>
<link href="stylesheet.css" type="text/css" rel="stylesheet">

</head>
<body>
<div class="top-bar">
<h1> BUS MANAGEMENT SYSTEM </h1>
</div>
<div class="content">
	
		<div class="login-form">
			<div class="buttons">
				<div class="form-group w50">
					<input type="button"  class="form-control" class="btn" id="add-driver" name="btn-login" value="Add driver" />
				</div>
				<div class="form-group w50">
					<input type="button"  class="form-control"  id="btn-login" name="btn-forget" value="Remove driver" />
				</div>
				<div class="form-group w50">
					<input type="button"  class="form-control" id="btn-login" name="btn-login" value="Add Driver" />
				</div>
				<div class="form-group w50">
					<input type="button"  class="form-control"  id="btn-login" name="btn-forget" value="Delete Driver" />
				</div>
				<div class="form-group w50">
					<input type="button"  class="form-control"  id="btn-login" name="btn-login" value="Give New Route" />
				</div>
				<div class="form-group w50">
					<input type="button"  class="form-control"  id="btn-login" name="btn-forget" value="Change Route" />
				</div>
			</div>
	</div>
</div>

<div id="myModal2" class="modal2">
	<div class="modal-content">
		<span class="close">&times;</span>
		<p>Fill Details</p>
		<form class="driver-form" >
		  Driver Name:<br>
		  <input type="text" class="driver-form" name="id" value="Driver Name"><br><br>
		   Driver Phone Number:<br>
		  <input type="text" class="driver-form" name="id" value="Driver Phone Number"><br><br>
		  <br><br>
		  Driver ID:<br>
		  <input type="text" class="driver-form" name="id" value="Driver ID"><br><br>
		 
		  Address:<br>
		  <input type="text" class="driver-form" name="id" value="Address"><br><br>
		 
		  <input type="submit" value="Submit">
	    </form> 
	 </div>

</div>



<div class="footer"> </div>
<script>

var modal2 = document.getElementById('myModal2');


var btn2 = document.getElementById("add-driver");


var span2 = document.getElementsByClassName("close")[0];


btn2.onclick = function() {
  modal2.style.display = "block";
}

span.onclick = function() {
  modal2.style.display = "none";
}

window.onclick = function(event) {
  if (event.target == modal2) {
    modal2.style.display = "none";
  }
}
</script>

</body>
</html>