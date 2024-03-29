

<%@page import="Procesamiento.Consulta" %>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HappyTrip</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
        <link rel="stylesheet" href="${pageContext.request.contextPath}\estilo.css"/>
        <link href='https://fonts.googleapis.com/css?family=Alata' rel='stylesheet'>
    </head>
    <body>
       <%
            String toInsert = "";
            
            Consulta consultar = new Consulta();
            ResultSet resultado = consultar.conultaReservaciones();
            
            %>
            <div class="container">
            <form>
            <div class="header">
                <img onclick="window.location = 'PaginaPrincipal.jsp'" class="img"  src="img/logo.jpeg" style="border-radius: 50px">
                <h1>BIENVENIDO A HAPPYTRIP</h1>   
            </div> 
            <div class="barra">
                <button  class="btn btn-primary" style=" background-color: #74818A; border-color: #74818A; font-family: 'Alata';font-size: 18px;margin-bottom: 4px" >Buscar</button>
                <input type="text" name="search" placeholder="Search..">
                <a href="#" style="font-family: 'Alata';font-size: 18px">Reservaciones</a>
                <a href="#" style="font-family: 'Alata';font-size: 18px">Recomendados</a>
            </div>
            
        </form>
            <div style="background-color: white;">
                <h1 style="text-align: center;">Lista de Observacion</h1>
                    <table class="table table-striped" id="tabla_vista">
                       <thead>
                        <tr>
                            <th scope="col">Usuario</th>
                            <th scope="col">Hotel</th>
                            <th scope="col">Habitacion</th>
                            <th scope="col">Fecha inicio</th>
                            <th scope="col">Fecha final</th>
                            <th scope="col">Mostrar Hotel</th>
                            <th scope="col">Mostrar Habitacion</th>
                        </tr>
                       </thead>
                       
                        <%
                            while(resultado.next()){
                        
                        %>
                        
                        <tr>
                            <td><%= resultado.getString("u.Nombre") %></td>
                            <td><%= resultado.getString("h.Nombre")%></td>
                            <td><%= resultado.getString("th.Tipo_habitacioncol") %></td>
                            <td><%= resultado.getString("r.CheckIn") %></td>
                            <td><%= resultado.getString("r.CheckOut") %></td>
                            <td>
                                <a href="HotelVista.jsp?numero=<%=resultado.getInt("h.idHotel")%>">Ver Hotel</a>
                            </td>
                            <td>
                                 <a href="habitacionVista.jsp?numero=<%=resultado.getInt("hab.idHabitacion")%>">Ver Habitacion</a>
                            </td>
                            <% }%>
                            
                        </tr>
                    </table>                 
                </div>
            </div>
    </body>
    <br>
    <br>
    <br>
    <br>
</html>