<html>
<%@ include file="include/head.htm" %>
<body>
<div class="container">
<%@ include file="include/menu.htm" %>

<form class="form-horizontal" action="do?command=CreateAd" method="post">
<fieldset>

<!-- Form Name -->
<legend>New ad</legend>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="description">Description</label>
  <div class="col-md-5">
  <input id="description" value="Test description" name="description" type="text" placeholder="input header of your ad" class="form-control input-md">

  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="kindOfAnimal">Kind of animal</label>
  <div class="col-md-4">
  <input id="kindOfAnimal" name="kindOfAnimal" type="text" placeholder="a dog" class="form-control input-md">

  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="greed">Greed</label>
  <div class="col-md-4">
  <input id="greed" name="greed" type="text" placeholder="dachshund" class="form-control input-md">

  </div>
</div>

<!-- Select Basic -->
<div class="form-group">
  <label class="col-md-4 control-label" for="sex">Sex</label>
  <div class="col-md-4">
    <select id="sex" name="sex" class="form-control">
      <option value="1">male</option>
      <option value="2">female</option>
    </select>
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="age">Age</label>
  <div class="col-md-4">
  <input id="age" name="age" type="text" placeholder="1" class="form-control input-md">
  <span class="help-block">years</span>
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="height">Height</label>
  <div class="col-md-4">
  <input id="height" name="height" type="text" placeholder="30" class="form-control input-md">
  <span class="help-block">cm</span>
  </div>
</div>

<!-- Textarea -->
<div class="form-group">
  <label class="col-md-4 control-label" for="qualities">Qualities</label>
  <div class="col-md-4">
    <textarea class="form-control" id="qualities" name="qualities">input special qualities or futures if it's needed </textarea>
  </div>
</div>


<!-- Button -->
<div class="form-group">
  <label class="col-md-4 control-label" for="singlebutton">Submit</label>
  <div class="col-md-4">
    <button id="singlebutton" name="singlebutton" class="btn btn-primary">Button</button>
  </div>
</div>

</fieldset>
</form>

</div>
</body>
</html>

