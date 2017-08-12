<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<div id="page-wrapper">
    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">详细分数信息</h1>

        </div>
        <!-- /.col-lg-12 -->
        <div class="col-lg-12">
            <div class="panel panel-info">
                <div class="panel-heading">
                    分数信息
                </div>
                <!-- /.panel-heading -->
                <div class="panel-body">
                    <c:choose>
                        <c:when test="${fn:length(allScores) gt 0}">
                            <div class="table-responsive">
                                <table class="table table-bordered table-hover">
                                    <thead>
                                    <tr>
                                        <th>ID</th>
                                        <th>姓名</th>
                                        <th>按时到校</th>
                                        <th>完成作业</th>
                                        <th>上课发言</th>
                                        <th>打扫卫生</th>
                                        <th>好人好事</th>
                                        <th>成绩优异</th>
                                        <th>学习进步</th>
                                        <th>遵守纪律</th>
                                        <th>节日送分</th>
                                        <th>集体活动</th>
                                        <th>学校比赛</th>
                                        <th>家庭表现</th>
                                        <th>总分</th>
                                    </tr>
                                    </thead>
                                    <c:forEach items="${allScores}" var="score">
                                    <tr>
                                        <td>${score.studentID}</td>
                                        <td>${score.studentName}</td>
                                        <td>${score.otmScore}</td>
                                        <td>${score.asnScore}</td>
                                        <td>${score.icbScore}</td>
                                        <td>${score.clnScore}</td>
                                        <td>${score.gddScore}</td>
                                        <td>${score.gssScore}</td>
                                        <td>${score.pgsScore}</td>
                                        <td>${score.dspScore}</td>
                                        <td>${score.hldScore}</td>
                                        <td>${score.gpaScore}</td>
                                        <td>${score.cmpScore}</td>
                                        <td>${score.fmlScore}</td>
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
                background: url("../../../static/bg2.jpg") no-repeat;
                background-size: 100%;
                height:100%;
                opacity: 0.9;
                filter: alpha(opacity=90); /* For IE8 and earlier */
            }

        </style>

    </div>
</div>