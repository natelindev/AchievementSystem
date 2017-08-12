<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<div id="page-wrapper">
    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">分数排名信息</h1>

        </div>
        <!-- /.col-lg-6 -->
        <div class="col-lg-8">
            <div class="panel panel-info">
                <div class="panel-heading">
                    分数排名
                </div>
                <!-- /.panel-heading -->
                <div class="panel-body">
                    <c:choose>
                        <c:when test="${fn:length(allScores) gt 0}">
                        <div class="table-responsive">
                            <table class="table table-bordered table-hover">
                                <thead>
                                <tr>
                                    <th>名次</th>
                                    <th>姓名</th>
                                    <th>分数</th>
                                </tr>
                                </thead>
                                <c:set var="count" value="0" scope="page" />
                                <c:forEach items="${allScores}" var="score">
                                    <c:set var="count" value="${count + 1}" scope="page"/>
                                    <tr>
                                        <td>${count}</td>
                                        <td>${score.studentName}</td>
                                        <td>${score.studentTotalScore}</td>
                                    </tr>
                                </c:forEach>
                        </div>
                        <!-- /.table-responsive -->
                        </c:when>
                        <c:otherwise>
                            <p class="text text-danger">没有可以显示的信息</p>
                        </c:otherwise>
                    </c:choose>
                </div>
                <!-- /.panel-body -->
            </div>
            <!-- /.panel -->
        </div>
        <!-- /.col-lg-12 -->

        <style>
            #page-wrapper  {
                background: url("../../../static/bg1.jpg") no-repeat;
                background-size: 100%;
                height:100%;
                opacity: 0.9;
                filter: alpha(opacity=90); /* For IE8 and earlier */
            }

        </style>

    </div>
</div>