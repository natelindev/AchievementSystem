<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>学生成就激励系统</title>

    <!-- icon -->
    <link rel="icon" type="image/png"  href="../../../static/favicon.png" />

    <!-- Bootstrap Core CSS -->
    <link href="../../../static/bower_components/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="../../../static/bower_components/metisMenu/dist/metisMenu.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="../../../static/dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="../../../static/bower_components/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

    <!-- jQuery -->
    <script src="../../../static/bower_components/jquery/dist/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="../../../static/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="../../../static/bower_components/metisMenu/dist/metisMenu.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="../../../static/dist/js/sb-admin-2.js"></script>
</head>

<body>

<div id="wrapper">

    <!-- Navigation -->
    <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href=${pageContext.request.contextPath}/index.html>学生成就激励系统</a>
        </div>

        <%@ include file="../partials/header.jsp" %>

        <%@ include file="../partials/sidebar.jsp"%>

        <!-- /.navbar-static-side -->
    </nav>

        <jsp:include page ="../partials/${contentPage}" flush="true"/>
</div>
<!-- /#wrapper -->

</body>
</html>