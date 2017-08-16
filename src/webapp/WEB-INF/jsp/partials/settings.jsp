<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<div id="page-wrapper">
    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header" href="settings.html">分数维护</h1>
        </div>
        <!-- /.col-lg-12 -->
    </div>
    <div class="row">
        <div class="col-lg-8">
            <div class="panel panel-info">
                <div class="panel-heading">
                    分数维护
                </div>
                <!-- /.panel-heading -->
                <c:choose>
                    <c:when test="${save == false}">
                        <form:form modelAttribute="Form" action="${pageContext.request.contextPath}/settings.html" method="post" command="userModel">
                            <div class="panel-body">
                                <!-- Nav tabs -->
                                <ul class="nav nav-tabs">
                                    <li class="active"><a href="#update" data-toggle="tab">学生成绩更新</a>
                                    </li>
                                    <li><a href="#insert" data-toggle="tab">添加新学生</a>
                                    </li>
                                    <li><a href="#delete" data-toggle="tab">删除学生</a>
                                    </li>
                                </ul>
                                <!-- Tab panes -->
                                <div class="col-lg-8">
                                    <div class="tab-content">
                                        <div class="tab-pane fade in active" id="update">
                                            <br>
                                            <div class="form-group">
                                                <label>选择要更新成绩的学生</label>
                                                <form:select path="updateForm_studentID" class="form-control" id="update_select_id">
                                                    <form:option value="0">请选择</form:option>
                                                    <c:forEach items="${allScores}" var="score">
                                                        <form:option value="${score.studentID}">${score.studentName}</form:option>
                                                    </c:forEach>
                                                </form:select>
                                            </div>

                                            <br>

                                            <div class="form-group">
                                                <label>按时到校</label>
                                                <form:input path="updateForm_otmScore" class="form-control" type="text" id="update_otmScore" />
                                            </div>

                                            <div class="form-group">
                                                <label>完成作业</label>
                                                <form:input path="updateForm_asnScore" class="form-control" type="text" id="update_asnScore" />
                                            </div>

                                            <div class="form-group">
                                                <label>上课发言</label>
                                                <form:input path="updateForm_icbScore" class="form-control" type="text" id="update_icbScore" />
                                            </div>

                                            <div class="form-group">
                                                <label>打扫卫生</label>
                                                <form:input path="updateForm_clnScore" class="form-control" type="text" id="update_clnScore" />
                                            </div>

                                            <div class="form-group">
                                                <label>好人好事</label>
                                                <form:input path="updateForm_gddScore" class="form-control" type="text" id="update_gddScore" />
                                            </div>

                                            <div class="form-group">
                                                <label>成绩优异</label>
                                                <form:input path="updateForm_gssScore" class="form-control" type="text" id="update_gssScore" />
                                            </div>

                                            <div class="form-group">
                                                <label>学习进步</label>
                                                <form:input path="updateForm_pgsScore" class="form-control" type="text" id="update_pgsScore" />
                                            </div>

                                            <div class="form-group">
                                                <label>遵守纪律</label>
                                                <form:input path="updateForm_dspScore" class="form-control" type="text" id="update_dspScore" />
                                            </div>

                                            <div class="form-group">
                                                <label>节日送分</label>
                                                <form:input path="updateForm_hldScore" class="form-control" type="text" id="update_hldScore" />
                                            </div>

                                            <div class="form-group">
                                                <label>集体活动</label>
                                                <form:input path="updateForm_gpaScore" class="form-control" type="text" id="update_gpaScore" />
                                            </div>

                                            <div class="form-group">
                                                <label>学校比赛</label>
                                                <form:input path="updateForm_cmpScore" class="form-control" type="text" id="update_cmpScore" />
                                            </div>

                                            <div class="form-group">
                                                <label>家庭表现</label>
                                                <form:input path="updateForm_fmlScore" class="form-control" type="text" id="update_fmlScore" />
                                            </div>
                                        </div>
                                        <!-- update tab end -->

                                        <div class="tab-pane fade" id="insert">
                                            <br>
                                            <div class="form-group">
                                                <label>新学生姓名</label>
                                                <form:input path="insertForm_studentName" class="form-control" type="text" id="insert_name"/>
                                            </div>

                                            <div class="form-group">
                                                <label>按时到校</label>
                                                <form:input path="insertForm_otmScore" class="form-control" type="text" id="insert_otmScore" />
                                            </div>

                                            <div class="form-group">
                                                <label>完成作业</label>
                                                <form:input path="insertForm_asnScore" class="form-control" type="text" id="insert_asnScore" />
                                            </div>

                                            <div class="form-group">
                                                <label>上课发言</label>
                                                <form:input path="insertForm_icbScore" class="form-control" type="text" id="insert_icbScore" />
                                            </div>

                                            <div class="form-group">
                                                <label>打扫卫生</label>
                                                <form:input path="insertForm_clnScore" class="form-control" type="text" id="insert_clnScore" />
                                            </div>

                                            <div class="form-group">
                                                <label>好人好事</label>
                                                <form:input path="insertForm_gddScore" class="form-control" type="text" id="insert_gddScore" />
                                            </div>

                                            <div class="form-group">
                                                <label>成绩优异</label>
                                                <form:input path="insertForm_gssScore" class="form-control" type="text" id="insert_gssScore" />
                                            </div>

                                            <div class="form-group">
                                                <label>学习进步</label>
                                                <form:input path="insertForm_pgsScore" class="form-control" type="text" id="insert_pgsScore" />
                                            </div>

                                            <div class="form-group">
                                                <label>遵守纪律</label>
                                                <form:input path="insertForm_dspScore" class="form-control" type="text" id="insert_dspScore" />
                                            </div>

                                            <div class="form-group">
                                                <label>节日送分</label>
                                                <form:input path="insertForm_hldScore" class="form-control" type="text" id="insert_hldScore" />
                                            </div>

                                            <div class="form-group">
                                                <label>集体活动</label>
                                                <form:input path="insertForm_gpaScore" class="form-control" type="text" id="insert_gpaScore" />
                                            </div>

                                            <div class="form-group">
                                                <label>学校比赛</label>
                                                <form:input path="insertForm_cmpScore" class="form-control" type="text" id="insert_cmpScore" />
                                            </div>

                                            <div class="form-group">
                                                <label>家庭表现</label>
                                                <form:input path="insertForm_fmlScore" class="form-control" type="text" id="insert_fmlScore" />
                                            </div>
                                        </div>
                                            <%--insert tab end--%>


                                        <div class="tab-pane fade" id="delete">
                                            <div class="form-group">
                                                <br>
                                                <label>选择要删除的学生</label>
                                                <form:select path="deleteForm_studentID" class="form-control">
                                                    <form:option value="0">请选择</form:option>
                                                    <c:forEach items="${allScores}" var="score">
                                                        <form:option value="${score.studentID}">${score.studentName}</form:option>
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
                            <a href="${pageContext.request.contextPath}/settings.html" class="btn btn-outline btn-success">返回</a>
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
                            url: '${pageContext.request.contextPath}/ajax_getStudentInfo.html',
                            data: {studentID: $('#update_select_id').val()},
                            success: function(data) {
                                var array = data.split(',');
                                $('#update_otmScore').val(array[0]);
                                $('#update_asnScore').val(array[1]);
                                $('#update_icbScore').val(array[2]);
                                $('#update_clnScore').val(array[3]);
                                $('#update_gddScore').val(array[4]);
                                $('#update_gssScore').val(array[5]);
                                $('#update_pgsScore').val(array[6]);
                                $('#update_dspScore').val(array[7]);
                                $('#update_hldScore').val(array[8]);
                                $('#update_gpaScore').val(array[9]);
                                $('#update_cmpScore').val(array[10]);
                                $('#update_fmlScore').val(array[11]);
                            }
                        });
                    });

                });
            </script>

            <style>
                body  {
                    background: linear-gradient(rgba(248,248,248,0.1), rgba(248,248,248,0.1)),
                    url("../../../static/bg4.svg") no-repeat;
                    background-size: cover;
                    opacity: 0.8;
                    filter: alpha(opacity=80); /* For IE8 and earlier */
                }

            </style>

        </div>
        <!-- /.col-lg-8 -->
    </div>

</div>
</div>