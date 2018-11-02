<html>
<%@ include file="include/head.htm" %>
<body>
<div class = "container">
<%@ include file="include/menu.htm" %>
<p>CreateAd: ${message}</p>
<form class="form-horizontal" action="do?command=CreateAd" method="post">
<fieldset>

<!-- Form Name -->
<legend>Add ad</legend>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="name">Name</label>
  <div class="col-md-6">
  <input id="name" name="name" type="text" placeholder="" value="name" class="form-control input-md">

  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="address">Address</label>
  <div class="col-md-6">
  <input id="address" name="address" type="text" placeholder="" value="address" class="form-control input-md">

  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="description">Description</label>
  <div class="col-md-6">
  <input id="description" name="description" type="text" placeholder="" value="description" class="form-control input-md">

  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="condition">Condition</label>
  <div class="col-md-6">
  <input id="condition" name="condition" type="text" placeholder="" value="condition" class="form-control input-md">

  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="number">CellNumber</label>
  <div class="col-md-6">
  <input id="number" name="number" type="text" placeholder="" value="1515151115" class="form-control input-md">

  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="price">Price</label>
  <div class="col-md-6">
  <input id="price" name="price" type="text" placeholder="" value="99999" class="form-control input-md">

  </div>
</div>

<!-- Button -->

<div class="form-group" >
  <label class="col-md-5 control-label  " for="submit" ></label>
  <div class="col-md-5" align="right">
    <button id="submit" name="submit" class="btn btn-primary btn-md" >Post</button>
  </div>
</div>

</fieldset>
</form>
</div>
</body>
</html>


