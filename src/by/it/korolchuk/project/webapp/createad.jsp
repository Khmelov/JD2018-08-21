<html>
<%@ include file="include/head.htm" %>
<body>
<div class="container">
<%@ include file="include/menu.htm" %>
<p>Cmd Create-ad: ${message}</p>
<form class="form-horizontal">
<fieldset>

<!-- Form Name -->
<legend>Form Name</legend>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="textinput">Description</label>
  <div class="col-md-4">
  <input id="textinput" name="textinput" type="text" placeholder="description" class="form-control input-md">

  </div>
</div>

<!-- Select Basic -->
<div class="form-group">
  <label class="col-md-4 control-label" for="selectbasic">Kind of animal</label>
  <div class="col-md-2">
    <select id="selectbasic" name="selectbasic" class="form-control">
      <option value="1">a dog</option>
      <option value="2">a cat</option>
      <option value="3">a rat</option>
      <option value="4">a parrot</option>
    </select>
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="textinput">Greed</label>
  <div class="col-md-4">
  <input id="textinput" name="textinput" type="text" placeholder="without greed" class="form-control input-md">

  </div>
</div>

</fieldset>
</form>


</div>
</body>
</html>

