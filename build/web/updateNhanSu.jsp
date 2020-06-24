<%-- 
    Document   : updateNhanSu
    Created on : Oct 20, 2019, 1:05:41 AM
    Author     : quoc0
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cập nhật nhân sự</h1>
        <form action="NhanSuController" name="updateNhanSu">

            <table>
                <tr>
                    <td>Mã đăng ký</td>
                    <td><input type="text"  readonly="true" name="txtmanv" value="<c:out value="${nhansu.manhanvien}"/>"/></td>
                </tr>
                <tr>
                    <td>Họ tên</td>
                    <td><input type="text"  name="txthoten" value="<c:out value="${nhansu.hoten}"/>"/></td>
                </tr>
                <tr>
                    <td>Ngày sinh</td>
                    <td><input type="text" name="txtngaysinh" value="<c:out value="${nhansu.ngaysinh}"/>"/></td>
                </tr>
                <tr>
                    <td>Chuyên ngành</td>
                    <td><input type="text"  name="txtchuyennganh" value="<c:out value="${nhansu.chuyennganh}"/>"/></td>
                </tr>
                <tr>
                    <td>Vị trí công việc</td>
                    <td><input type="text"  name="txtvitricv" value="<c:out value="${nhansu.vitricongviec}"/>"/></td>
                </tr>
                <tr>
                    <td>Đơn vị công tác</td>
                    <td><input type="text"  name="txtdonvict" value="<c:out value="${nhansu.donvicongtac}"/>"/></td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td><input type="text" name="txtemail" value="<c:out value="${nhansu.email}"/>"/></td>
                </tr>
                <tr>
                    <td>Điện thoại</td>
                    <td><input type="text"  name="txtdt" value="<c:out value="${nhansu.dienthoai}"/>"/></td>
                </tr>
                <tr>
                    <td>Thông tin khác</td>
                    <td><input type="text"  name="txtthongtinkhac" value="<c:out value="${nhansu.thongtinkhac}"/>"/></td>
                </tr>
            </table>
            <input type="submit" name="action" value="Update"/> 
        </form>
    </body>
</html>
