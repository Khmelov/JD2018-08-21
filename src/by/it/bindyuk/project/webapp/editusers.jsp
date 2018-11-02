<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<%@ include file="include/head.htm" %>
<body>
<div class="container">
    <%@ include file="include/menu.htm" %>

    <div class="container">
        <div class="row">
            <div class=col-md-1>Имя</div>
            <div class=col-md-1>Пароль</div>
            <div class=col-md-2>Email</div>
            <div class=col-md-1>Серия пасспорта</div>
            <div class=col-md-1>Номер пасспорта</div>
            <div class=col-md-2>Номер б.к.</div>
            <div class=col-md-1>cid</div>
            <div class=col-md-1>Роль</div>
        </div>
    </div>

    <div class="container">
        <c:forEach items="${users}" var="user">
            <form class="update-user-${user.id}" action="do?command=EditUsers" method=POST>
                <div class="row">
                    <input name="id" type="hidden" value="${user.id}"/>
                    <div class=col-md-1>
                        <input id="login" class="form-control input-md" name="login"
                               value="${user.login}"/>
                    </div>

                    <div class=col-md-1>
                        <input id="password" class="form-control input-md" name="password"
                               value="${user.password}"/>
                    </div>

                    <div class=col-md-2>
                        <input id="email" class="form-control input-md" name="email"
                               value="${user.email}"/>
                    </div>

                    <div class=col-md-1>
                        <input id="passpostSeries" class="form-control input-md" name="passpostSeries"
                               value="${user.passpostSeries}"/>
                    </div>

                    <div class=col-md-1>
                        <input id="passportId" class="form-control input-md" name="passportId"
                               value="${user.passportId}"/>
                    </div>

                    <div class=col-md-2>
                        <input id="bancardNumber" class="form-control input-md" name="bancardNumber"
                               value="${user.bancardNumber}"/>
                    </div>

                    <div class=col-md-1>
                        <input id="cid" class="form-control input-md" name="cid"
                               value="${user.cid}"/>
                    </div>

                    <div class=col-md-1>
                        <select id="roles_id" name="roles_id" class="form-control">
                            <c:forEach items="${roles}" var="role">
                                <option value="${role.id}" role=${role.id} ${role.id==user.roles_id?"selected":""}>
                                        ${role.role}
                                </option>
                            </c:forEach>
                        </select>
                    </div>

                    <button id="Update" value="Update" name="Update" class="btn btn-success col-md-1">
                        Обновить
                    </button>

                    <button id="Delete" value="Delete" name="Delete" class="btn btn-danger col-md-1">
                        Удалить
                    </button>
                </div>
            </form>
            <p></p>
        </c:forEach>
    </div>

</div>
</body>

