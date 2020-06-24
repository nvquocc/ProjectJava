<%-- 
    Document   : newNhanSu
    Created on : Oct 20, 2019, 12:29:02 AM
    Author     : quoc0
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
        input{
            /*width: 50%;*/
        }
    </style>
    <body>
        <h1>Thêm mới nhân sự</h1>
        <form action="NhanSuController" name="newNhanSu">
            <table>
                <tr>
                    <td>Mã nhân viên</td>
                    <td><input type="text" name="txtmanv" value=""/></td>
                </tr>
                <tr>
                    <td>Họ và tên</td>
                    <td><input type="text" name="txthoten" value=""/></td>
                </tr>
                <tr>
                    <td>Ngày sinh</td>
                    <td><input type="text" name="txtngaysinh" value=""></td>
                </tr>
                <tr>
                    <td>Chuyên ngành</td>
                    <td><input type="text" name="txtchuyennganh" value=""></td>
                </tr>
                <tr>
                    <td>Vị trí công việc</td>
                    <td><input type="text" name="txtvitricv" value=""/></td>
                </tr>
                <tr>
                    <td>Đơn vị công tác</td>
                    <td><input type="text" name="txtdonvict" value=""/></td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td><input type="text" name="txtemail" value=""></td>
                </tr>
                <tr>
                    <td>Điện thoại</td>
                    <td><input type="text" name="txtdt" value=""></td>
                </tr>
                <tr>
                    <td>Thông tin khác</td>
                    <td><input type="text" name="txtthongtinkhac" value=""></td>
                </tr>
            </table>
            <br>
            <input type="submit" name="action" value="Save">
        </form>
    </body>
</html>
