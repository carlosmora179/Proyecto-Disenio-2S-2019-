package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.json.JSONArray;
import org.json.JSONException;
import Procesamiento.Consulta;

public final class PaginaPrincipal_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String baseDeDatos1 = "";
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <title>HappyTrip</title>\r\n");
      out.write("    <link href=\"estilo.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css\" integrity=\"sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4\" crossorigin=\"anonymous\">\r\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Alata' rel='stylesheet'>\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("        ");

            
            Consulta consultar = new Consulta();
            baseDeDatos1 = consultar.consultarHoteles(); 
            
        
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <script>\r\n");
      out.write("        window.onload = function () {\r\n");
      out.write("            // Variables\r\n");
      out.write("            let baseDeDatos = ");
      out.print(baseDeDatos1);
      out.write(";\r\n");
      out.write("                \r\n");
      out.write("            let $items = document.querySelector('#items');\r\n");
      out.write("            // Funciones\r\n");
      out.write("            function renderItems () {\r\n");
      out.write("                for (let info of baseDeDatos) {\r\n");
      out.write("                    // Estructura\r\n");
      out.write("                    let miNodo = document.createElement('div');\r\n");
      out.write("                    miNodo.classList.add('card', 'col-sm-4');\r\n");
      out.write("                    // Body\r\n");
      out.write("                    let miNodoCardBody = document.createElement('div');\r\n");
      out.write("                    miNodoCardBody.classList.add('card-body');\r\n");
      out.write("                    //imagen\r\n");
      out.write("                    let miNodoImagen = document.createElement('img');\r\n");
      out.write("                    miNodoImagen.classList.add('card-img');\r\n");
      out.write("                    miNodoImagen.alt = info['nombre'];\r\n");
      out.write("                    miNodoImagen.src = info['URL'];\r\n");
      out.write("\r\n");
      out.write("                    // Titulo\r\n");
      out.write("                    let miNodoTitle = document.createElement('h5');\r\n");
      out.write("                    miNodoTitle.classList.add('card-title');\r\n");
      out.write("                    miNodoTitle.textContent = info['Nombre'];\r\n");
      out.write("                    // Precio\r\n");
      out.write("                    let miNodoPrecio = document.createElement('p');\r\n");
      out.write("                    miNodoPrecio.classList.add('card-text');\r\n");
      out.write("                    miNodoPrecio.textContent = 'Pais: '+info['pais'];\r\n");
      out.write("                    \r\n");
      out.write("                    let miNodoRegion = document.createElement('p');\r\n");
      out.write("                    miNodoRegion.classList.add('card-text');\r\n");
      out.write("                    miNodoRegion.textContent = 'Region: '+info['region'];\r\n");
      out.write("                    \r\n");
      out.write("                    let miNodoPuntaje = document.createElement('p');\r\n");
      out.write("                    miNodoPuntaje.classList.add('card-text');\r\n");
      out.write("                    let recomen = info['Recomendado']/info['Total']*100;\r\n");
      out.write("                    recomen = Math.floor(recomen);\r\n");
      out.write("                    miNodoPuntaje.textContent = 'Recomendado: '+recomen+'%';\r\n");
      out.write("                    // Boton\r\n");
      out.write("                    let miNodoBoton = document.createElement('button');\r\n");
      out.write("                    miNodoBoton.classList.add('btn', 'btn-primary');\r\n");
      out.write("                    miNodoBoton.textContent = 'ver más';\r\n");
      out.write("                    miNodoBoton.setAttribute('marcador', info['idHotel']);\r\n");
      out.write("                    miNodoBoton.addEventListener('click', function (event) {\r\n");
      out.write("                                let num = this.getAttribute('marcador');\r\n");
      out.write("                                \r\n");
      out.write("                                window.location = 'HotelVista.jsp?numero='+num;\r\n");
      out.write("                        },\r\n");
      out.write("                        false);\r\n");
      out.write("                    // Insertamos\r\n");
      out.write("                    miNodoCardBody.appendChild(miNodoImagen);\r\n");
      out.write("                    miNodoCardBody.appendChild(miNodoTitle);\r\n");
      out.write("                    miNodoCardBody.appendChild(miNodoPrecio);\r\n");
      out.write("                    miNodoCardBody.appendChild(miNodoRegion);\r\n");
      out.write("                    miNodoCardBody.appendChild(miNodoPuntaje);\r\n");
      out.write("                    miNodoCardBody.appendChild(miNodoBoton);\r\n");
      out.write("                    miNodo.appendChild(miNodoCardBody);\r\n");
      out.write("                    $items.appendChild(miNodo);\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            // Inicio\r\n");
      out.write("            renderItems();\r\n");
      out.write("            \r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"container\" >\r\n");
      out.write("    \r\n");
      out.write("     <form>\r\n");
      out.write("            <div class=\"header\">\r\n");
      out.write("                <img onclick=\"window.location = 'PaginaPrincipal.jsp'\" class=\"img\"  src=\"img/logo.jpeg\" style=\"border-radius: 50px\">\r\n");
      out.write("                <h1>BIENVENIDO A HAPPYTRIP</h1>   \r\n");
      out.write("            </div> \r\n");
      out.write("            <div class=\"barra\">\r\n");
      out.write("                <button class=\"btn btn-primary\" style=\" background-color: #74818A; border-color: #74818A; font-family: 'Alata';font-size: 18px;margin-bottom: 4px\" >Buscar</button>\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                <input type=\"text\" name=\"search\" placeholder=\"Search..\">\r\n");
      out.write("                <a href=\"reservacionesVista.jsp\" style=\"font-family: 'Alata';font-size: 18px\">Reservaciones</a>\r\n");
      out.write("                <a href=\"#\" style=\"font-family: 'Alata';font-size: 18px\">Recomendados</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"slider\" style=\"margin-top: 10px \">\r\n");
      out.write("                <ul>\r\n");
      out.write("                     <li><img src=\"img/imagen1.jpg\" alt=\"\"></li>\r\n");
      out.write("                    <li><img src=\"img/imagen2.jpg\" alt=\"\"></li>\r\n");
      out.write("                    <li><img src=\"img/imagen3.jpg\" alt=\"\"></li>\r\n");
      out.write("                    <li><img src=\"img/imagen5.jpg\" alt=\"\"></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("    <div style=\"margin-top: 10px\">\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <!-- Elementos generados a partir del JSON -->\r\n");
      out.write("                <main id=\"items\" class=\"col-sm-13 row\"></main>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
