<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<div id="page-wrapper">
    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">作文</h1>

        </div>

        <c:choose>
            <c:when test="${fn:length(articles) gt 0}">
                <c:forEach items="${articles}" var="article">
                    <!-- /.col-lg-6 -->
                    <div class="col-lg-4">
                        <div class="panel panel-info">
                            <div class="panel-heading">
                                ${article.tittle} - ${article.author}
                            </div>
                            <!-- /.panel-heading -->
                            <div class="panel-body">
                                <p>"${fn:substring(article.content, 0, 100)}..."</p>
                            </div>
                            <!-- /.panel-body -->
                            <a href="${pageContext.request.contextPath}/articles/${article.articleID}.html">
                                <div class="panel-footer">
                                    <span class="pull-left">查看全文</span>
                                    <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                                    <div class="clearfix"></div>
                                </div>
                            </a>
                        </div>
                        <!-- /.panel -->
                    </div>
                    <!-- /.col-lg-6 -->
                </c:forEach>
            </c:when>
            <c:otherwise>
                <!-- /.col-lg-8 -->
                <div class="col-lg-8">
                    <div class="panel panel-info">
                        <div class="panel-heading">
                            文章标题
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <p class="text text-danger">暂时没有文章可以显示</p>
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-8 -->
            </c:otherwise>
        </c:choose>

        <style>
            #page-wrapper  {
                background: linear-gradient(rgba(248,248,248,0.1), rgba(248,248,248,0.1)),
                url("../../../static/bg3.svg") no-repeat;
                background-size: cover;
                opacity: 0.8;
                filter: alpha(opacity=80); /* For IE8 and earlier */
            }

        </style>

    </div>
</div>
