<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <title>poc.cloudwise.cxf</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport"/>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/bootstrap/bootstrap-3.3.7.min.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/css/AdminLTE.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/css/skins/_all-skins.min.css"/>

    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/statics/bootstrap/bootstrap-3.3.7.min.js"></script>

</head>
<body class="hold-transition skin-blue login-page" target="_top">

<div class="login-box">
    <div class="login-logo">
        <b>cxf say hello program</b>
    </div>
    <div class="login-box-body">
        <h3 class="text-center">try: type your english name, and click "say hi"</h3>
        <form onsubmit="return false;">
            <div class="form-group has-feedback">
                <input type="text" id="hi_name" class="form-control" placeholder="your english name"/>
                <span class="glyphicon glyphicon-pencil form-control-feedback"></span>
            </div>
            <div class="row">
                <div class="col-xs-12">
                    <button id="hi_button" class="btn btn-primary btn-block btn-flat">say hi</button>
                </div>
            </div>
        </form>
    </div>
</div>

<script type="text/javascript">

    $("#hi_button").on('click', function () {
        var hi_name = $("#hi_name").val();
        $.post('${pageContext.request.contextPath}/cxf/say', {
            name: hi_name
        }, function (ret) {
            if (ret == "error") {
                alert("程序出小差了,请检查后端服务");
            } else {
                alert("调用成功,返回结果:" + ret);
            }
        });
    });
</script>
</body>
</html>
