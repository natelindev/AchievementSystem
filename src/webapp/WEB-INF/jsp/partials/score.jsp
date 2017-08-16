<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<div id="page-wrapper">
    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">英雄排行榜</h1>
        </div>
    </div>

    <div class="row">
        <c:choose>
            <c:when test="${fn:length(allScores) gt 0}">
                <div class="col-lg-10">
                    <div class="panel panel-success">
                        <div class="panel-heading">
                            排行榜
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-bordered">
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
                                </table>
                            </div>
                            <!-- /.table-responsive -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
                </div>
            </c:when>
            <c:otherwise>
                <div class="col-lg-10">
                    <div class="panel panel-success">
                        <div class="panel-heading">
                            没有可以显示的信息
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <p class="text text-danger">没有可以显示的信息</p>
                        </div>
                        <!-- /.panel-body -->
                    </div>
                </div>
            </c:otherwise>
        </c:choose>

        <div class="col-lg-10" id="lv-container" data-id="city" data-uid="MTAyMC8zMDE1MC82NzA1">
            <script type="text/javascript">
                (function(d, s) {
                    var j, e = d.getElementsByTagName(s)[0];

                    if (typeof LivereTower === 'function') { return; }

                    j = d.createElement(s);
                    j.src = 'https://cdn-city.livere.com/js/embed.dist.js';
                    j.async = true;

                    e.parentNode.insertBefore(j, e);
                })(document, 'script');
            </script>
        </div>

    </div>

    <style>
        body  {
            background: linear-gradient(rgba(248,248,248,0.1), rgba(248,248,248,0.1)),
            url("../../../static/bg1.svg") no-repeat;
            background-size: cover;
            opacity: 0.8;
            filter: alpha(opacity=80); /* For IE8 and earlier */
        }

    </style>

</div>

