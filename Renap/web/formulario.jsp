<%-- 
    Document   : formulario
    Created on : 29-oct-2013, 10:51:10
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Comentarios</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="css/reset.css" type="text/css" media="screen">
    <link rel="stylesheet" href="css/style.css" type="text/css" media="screen">
    <link rel="stylesheet" href="css/grid.css" type="text/css" media="screen">   
    <script src="js/jquery-1.7.1.min.js" type="text/javascript"></script>
    <script src="js/cufon-yui.js" type="text/javascript"></script>
    <script src="js/cufon-replace.js" type="text/javascript"></script>
	<script src="js/Vegur_500.font.js" type="text/javascript"></script> 
    <script src="js/FF-cash.js" type="text/javascript"></script>
    </head>
    <body id="page6">
	<div class="main-bg">
        <div class="bg">
            <!--==============================header=================================-->
            <header>
                <div class="main">
                    <div class="wrapper">
                        <h1><a href="index.html">logo</a></h1>
                        <div class="fright">
                            <div class="indent">
                                <span class="phone">Tel: (+502)2248-3800</span>
                            </div>
                        </div>
                    </div>
                    <nav>
                        <ul class="menu">
                            <li><a href="index.jsp">Home</a></li>
                            <li><a href="acerca_de.jsp">Acerca de...</a></li>
                            <li><a href="mision_vision.jsp">Mision y Vision </a></li>
                            <li><a href="valores.jsp">Valores</a></li>
                            <li><a href="carros.jsp">Operaciones</a></li>
                            <li><a class="active" href="formulario.jsp">Comentarios</a></li>
                            <li><a href="integrantes.jsp">Integrantes</a></li>
                        </ul>
                    </nav>
                </div>
            </header>
            
            <!--==============================content================================-->
            <section id="content"><div class="ic"></div>
                <div class="main">
                    <div class="container_12">
                        
                        <div class="container-bot">
                            <div class="container-top">
                                <div class="container">
                                    <div class="wrapper">
                                        <article class="grid_8">
                                            
                                                <h3 class="p1">Envienos sus comentarios</h3> 
						<fieldset>
						<p><label>Nombre: <input type="text" name="nombre" size="25"/></label></p>
						<p><label>E - Mail: <input type="text" name="email" size="25"/></label></p>
						<p><label>Telefono: <input type="text" name="telefono" size="25"/></label></p>
                                                Mensaje:  
						<p><label><textarea name="texto" cols="32" rows="10"></textarea></label></p>
						<input type="submit" value="Enviar"/>
														                           
                                                    </fieldset>						
                                                </form>
                                            
                                        </article>
                                        
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
            
            <!--==============================footer=================================-->
            <footer>
                <div class="main">
                    <span>Car & Tools; 2013</span>
                </div>
            </footer>
        </div>
    </div>
	<script type="text/javascript"> Cufon.now(); </script>
</body>
</html>
