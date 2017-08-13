<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<div id="page-wrapper">
    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header" href="settings.html">精品作文维护</h1>
        </div>
        <!-- /.col-lg-12 -->
    </div>
    <div class="row">
        <div class="col-lg-8">
            <div class="panel panel-default">
                <div class="panel-heading">
                    精品作文维护
                </div>
                <!-- /.panel-heading -->
                <c:choose>
                    <c:when test="${save == false}">
                        <form:form modelAttribute="Form" action="article_settings.html" method="post" command="userModel">
                            <div class="panel-body">
                                <!-- Nav tabs -->
                                <ul class="nav nav-tabs">
                                    <li class="active"><a href="#update" data-toggle="tab">文章内容更新</a>
                                    </li>
                                    <li><a href="#insert" data-toggle="tab">添加新文章</a>
                                    </li>
                                    <li><a href="#delete" data-toggle="tab">删除文章</a>
                                    </li>
                                </ul>
                                <!-- Tab panes -->
                                <div class="col-lg-8">
                                    <div class="tab-content">
                                        <div class="tab-pane fade in active" id="update">
                                            <br>
                                            <div class="form-group">
                                                <label>选择要修改的文章</label>
                                                <form:select path="updateForm_articleID" class="form-control" id="update_select_id">
                                                    <form:option value="0">请选择</form:option>
                                                    <c:forEach items="${articles}" var="article">
                                                        <form:option value="${article.articleID}">${article.tittle} -${article.author}</form:option>
                                                    </c:forEach>
                                                </form:select>
                                            </div>

                                            <br>

                                            <div class="form-group">
                                                <label>标题</label>
                                                <form:input path="updateForm_tittle" class="form-control" type="text" id="update_tittle" />
                                            </div>

                                            <div class="form-group">
                                                <label>作者</label>
                                                <form:input path="updateForm_author" class="form-control" type="text" id="update_author" />
                                            </div>

                                            <div class="form-group">
                                                <label>内容</label>
                                                <form:textarea path="updateForm_content" class="form-control" rows="5" id="update_content" />
                                            </div>
                                        </div>
                                        <!-- update tab end -->

                                        <div class="tab-pane fade" id="insert">
                                            <br>
                                            <div class="form-group">
                                                <label>新文章标题</label>
                                                <form:input path="insertForm_tittle" class="form-control" type="text" id="insert_tittle"/>
                                            </div>

                                            <div class="form-group">
                                                <label>作者</label>
                                                <form:input path="insertForm_author" class="form-control" type="text" id="insert_author" />
                                            </div>

                                            <div class="form-group">
                                                <label>内容</label>
                                                <form:textarea path="insertForm_content" class="form-control" rows="5" id="insert_content" />
                                            </div>

                                        </div>
                                        <%--insert tab end--%>


                                        <div class="tab-pane fade" id="delete">
                                            <div class="form-group">
                                                <br>
                                                <label>选择要删除的文章</label>
                                                <form:select path="deleteForm_articleID" class="form-control">
                                                    <form:option value="0">请选择</form:option>
                                                    <c:forEach items="${articles}" var="article">
                                                        <form:option value="${article.articleID}">${article.tittle} -${article.author}</form:option>
                                                    </c:forEach>
                                                </form:select>

                                            </div>
                                        </div>
                                        <!-- delete tab end -->
                                    </div>
                                </div>
                            </div>

                            <!-- /.panel-body -->
                            <div class="panel-footer">
                                <input class="btn btn-outline btn-primary" type="submit" value="保存"/>
                            </div>
                        </form:form>
                    </c:when>
                    <c:otherwise>
                        <div class="panel-body">
                            <div class="panel-body">
                                <p class="text-success">保存成功</p>
                            </div>
                        </div>
                        <div class="panel-footer">
                            <a href="article_settings.html" class="btn btn-outline btn-success">返回</a>
                        </div>
                    </c:otherwise>
                </c:choose>
            </div>
            <!-- /.panel -->

            <script>
                $(document).ready(function() {
                    $('#update_select_id').change(function(){
                        $.ajax({
                            type: 'POST',
                            url: 'ajax_getArticleInfo.html',
                            data: {articleID: $('#update_select_id').val()},
                            success: function(data) {
                                var array = data.split('&');
                                $('#update_tittle').val(array[0]);
                                $('#update_author').val(array[1]);
                                $('#update_content').val(array[2]);
                            }
                        });
                    });

                });
            </script>

            <style>
                #page-wrapper  {
                    background: url("../../../static/bg3.jpg") no-repeat;
                    background-size: 100%;
                    height:100%;
                    opacity: 0.9;
                    filter: alpha(opacity=90); /* For IE8 and earlier */
                }

            </style>

        </div>
        <!-- /.col-lg-8 -->
    </div>

</div>
</div>