<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>学生成就激励系统登录页面</title>

    <!-- icon -->
    <link rel="shortcut icon" type="image/x-icon" href="../../static/favicon.ico" />

    <!-- Bootstrap Core CSS -->
    <link href="../../static/bower_components/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="../../static/bower_components/metisMenu/dist/metisMenu.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="../../static/dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="../../static/bower_components/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

    <div class="container">
        <div class="row">
            <div class="col-md-4 col-md-offset-4">
                <div class="login-panel panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">请登录学生成就激励系统</h3>
                    </div>
                    <div class="panel-body">
                        <form:form role="form" modelAttribute="userForm" action="login.html" method="post" >
                            <fieldset>
                                <div class="form-group">
                                    <form:input path="userName" class="form-control" placeholder="用户名" name="username" type="text" />
                                </div>
                                <div class="form-group">
                                    <form:input path="userPassword" class="form-control" placeholder="密码" name="password" type="password"
                                                onpaste="return false" oncontextmenu="return false" oncopy="return false" oncut="return false"/>
                                </div>
                                <c:if test="${message != null }">
                                    <p class="text-danger"> ${message}</p>
                                </c:if>
                                <input type="submit" value="登录" class="btn btn-lg btn-success btn-block">
                            </fieldset>
                        </form:form>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- jQuery -->
    <script src="../../static/bower_components/jquery/dist/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="../../static/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="../../static/bower_components/metisMenu/dist/metisMenu.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="../../static/dist/js/sb-admin-2.js"></script>

</body>

</html>
