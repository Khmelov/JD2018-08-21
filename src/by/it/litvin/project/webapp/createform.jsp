<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<%@ include file="include/head.htm" %>
<body>
    <div class="container">
    <%@ include file="include/menu.htm" %>

<form class="form-horizontal" action="do?command=CreateForm" method="post">
<fieldset>

<p>${user}<br></p>

<!-- Form Name -->
<legend>Form Create</legend>

<!-- Text input-->
<div class="form-group">
<label class="col-md-4 control-label" for="name">Name</label>
<div class="col-md-4">
<input id="name" name="name" value="TestName" type="text" placeholder="" class="form-control input-md" required="">

  </div>
</div>


<!-- Text input-->
<div class="form-group">
<label class="col-md-4 control-label" for="surname">Surname</label>
<div class="col-md-4">
<input id="surname" name="surname" value="TestSurname" type="text" placeholder="" class="form-control input-md" required="">

  </div>
</div>


<!-- Text input-->
<div class="form-group">
<label class="col-md-4 control-label" for="address">Address</label>
<div class="col-md-4">
<input id="address" name="address" value="TestAddress" type="text" placeholder="" class="form-control input-md" required="">

  </div>
</div>


<!-- Text input-->
<div class="form-group">
<label class="col-md-4 control-label" for="description">Description</label>
<div class="col-md-4">
<input id="description" name="description" value="TestDescription" type="text" placeholder="" class="form-control input-md" required="">

  </div>
</div>

<!-- Text input-->
<div class="form-group">
<label class="col-md-4 control-label" for="age">Age</label>
<div class="col-md-4">
<input id="age" name="age" value="19" type="text" placeholder="" class="form-control input-md" required="">

  </div>
</div>


<!-- Text input-->
<div class="form-group">
<label class="col-md-4 control-label" for="information">Information</label>
<div class="col-md-4">
<input id="information" name="information" value="TestInformation" type="text" placeholder="" class="form-control input-md" required="">

  </div>
</div>


<!-- Text input-->
<div class="form-group">
<label class="col-md-4 control-label" for="aim">Aim</label>
<div class="col-md-4">
<input id="aim" name="aim" value="Test Aim" type="text" placeholder="" class="form-control input-md" required="">

  </div>
</div>



<!-- Button -->
<div class="form-group">
   <label class="col-md-4 control-label" for="signupsubmit">Single Button</label>
   <div class="col-md-4">
     <button id="signupsubmit" name="signupsubmit" class="btn btn-success">SignUp</button>
  </div>
</div>

    </fieldset>
    </form>


</body>
</html>


