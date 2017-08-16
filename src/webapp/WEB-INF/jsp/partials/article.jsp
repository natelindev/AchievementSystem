<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<div id="page-wrapper">
    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">${article.tittle}</h1>
        </div>
        <!-- /.col-lg-10 -->
        <div class="col-lg-10">
            <div class="panel panel-success">
                <div class="panel-heading">
                    ${article.author}
                </div>
                <!-- /.panel-heading -->
                <div class="panel-body">
                    <p>${article.content}</p>
                </div>
                <!-- /.panel-body -->
            </div>
            <!-- /.panel -->
        </div>
        <!-- /.col-lg-10 -->
        <!-- 来必力City版安装代码 -->
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
        <!-- City版安装代码已完成 -->

        <style>
            #page-wrapper  {
                background: linear-gradient(rgba(248,248,248,0.1), rgba(248,248,248,0.1)),
                url("../../../static/bg1.svg") no-repeat;
                background-size: cover;
                opacity: 0.8;
                filter: alpha(opacity=80); /* For IE8 and earlier */
            }

        </style>

    </div>
</div>