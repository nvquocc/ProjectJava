<%-- 
    Document   : nhansu
    Created on : Oct 20, 2019, 12:21:48 AM
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
        <style>
            table, th, td {
                border: 1px solid black;
                border-collapse: collapse;
            }
        </style>
        <br/>
        <h1>Danh sách và thông tin nhân sự</h1>
        <table style="border: solid 1px;width: 50%">
            <tr>
                <th>Mã nhân viên</th>
                <th>Họ và tên</th>
                <th>Ngày sinh</th>
                <th>Chuyên ngành</th>
                <th>Vị trí công việc</th>
                <th>Đơn vị công tác</th>
                <th>Email</th>
                <th>Điện thoại</th>
                <th>Thông tin khác</th>
                <th>Action</th>
            </tr>

            <c:forEach items="${nhansu}" var="ns">
                <tr>

                    <td>${ns.manhanvien}</td>
                    <td>${ns.hoten}</td>
                    <td>${ns.ngaysinh}</td>
                    <td>${ns.chuyennganh}</td>
                    <td>${ns.vitricongviec}</td>
                    <td>${ns.donvicongtac}</td>
                    <td>${ns.email}</td>
                    <td>${ns.dienthoai}</td>
                    <td>${ns.thongtinkhac}</td>
                    <td>
                        <a href="NhanSuController?action=Delete&tenid=${ns.manhanvien}">Delete</a>|
                        <a href="NhanSuController?action=Edit&tenid=${ns.manhanvien}">Update</a>

                    </td>
                </tr>
            </c:forEach>
        </table>
        <hr/>


        <a href="newNhanSu.jsp">Add new</a><br/>
        <a href="home.jsp">Home</a>
    </body>
</html>
