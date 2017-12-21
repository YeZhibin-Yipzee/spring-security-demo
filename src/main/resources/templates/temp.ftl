<#import "/spring.ftl" as spring />
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>templates page</title>
    <link rel="stylesheet" href="/bootstrap/css/bootstrap.css">
    <script src="/jquery/jquery-2.1.3.js"></script>
    <script src="/bootstrap/js/bootstrap.js"></script>
</head>
<body>
<h1>temp</h1>
<h2>${msg}</h2>
<table class="table table-striped">
    <tr class="success">
        <th>id</th>
        <th>username</th>
        <th>password</th>
    </tr>
<#if list??>
    <#list list as user>
        <tr class="active">
            <td>${user.id}</td>
            <td>${user.username}</td>
            <td>${user.password}</td>
        </tr>
    </#list>
<#else>
    <h2>no list here!</h2>
</#if>

</table>
<form action="<@spring.url '/login' />" method="post" class="form-horizontal">
    <div class="form-group">
        <label for="inputEmail3" class="col-sm-2 control-label">账号</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" name="username" id="inputEmail3" placeholder="username">
        </div>
    </div>
    <div class="form-group">
        <label for="inputPassword3" class="col-sm-2 control-label">密码</label>
        <div class="col-sm-10">
            <input type="password" class="form-control" name="password" id="inputPassword3" placeholder="Password">
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <div class="checkbox">
                <label>
                    <input type="checkbox"> Remember me
                </label>
            </div>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-default">Sign in</button>
        </div>
    </div>
</form>
</body>
</html>