<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="navbar-default sidebar" role="navigation">
    <div class="sidebar-nav navbar-collapse">
        <ul class="nav" id="side-menu">

            <li>
                <a href="${pageContext.request.contextPath}/index.html"><i class="fa fa-list-ol fa-fw"></i> 排行榜</a>
            </li>
            <li>
                <a href="${pageContext.request.contextPath}/detail.html"><i class="fa fa-list-ul fa-fw"></i> 详细信息</a>
            </li>
            <li>
                <a href="${pageContext.request.contextPath}/articles.html"><i class="fa fa-file-text-o fa-fw"></i> 优秀作文</a>
            </li>
            <li>
                <a href="${pageContext.request.contextPath}/login/score.html"><i class="fa fa-gears fa-fw"></i> 分数维护</a>
            </li>
            <li>
                <a href="${pageContext.request.contextPath}/login/article.html"><i class="fa fa-edit fa-fw"></i> 文章维护</a>
            </li>

        </ul>
    </div>
    <!-- /.sidebar-collapse -->
    <style>
        #wrapper{
            overflow: hidden;
        }
        .sidebar{
            padding-bottom: 100%;
            margin-bottom: -100%;
        }
    </style>
</div>
