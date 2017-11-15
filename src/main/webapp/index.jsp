<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <script src="jquery.min.js"></script>
    <script>
        function getCourse() {
            $.ajax({
                url : '<%=basePath%>hello.do',
                type: 'POST',
                dataType : 'text',
                async : true,
                timeout : 50000,
                success : function(data) {
                    document.getElementById('course').innerHTML = data;
//                    var json = eval(data);
//                    $.each(json, function(index, item) {
//                        var id = json[index].id;
//                        var name = json[index].name;
//                        var description = json[index].description;
//                        console.info(id + name + description);
//                    });

                },
                error : function() {
                    var errorMsg = '无法获取课程';
                    document.getElementById('course').innerHTML = errorMsg;
                }
            });
        }
    </script>
</head>
<body>
<input type="button" id="me" value="查看课程" onclick="getCourse()"/>
<div id="course"></div>
</body>
</html>
