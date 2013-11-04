<%-- 
    Document   : acerca_de
    Created on : 29-oct-2013, 10:19:39
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
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
    <body id="page5">
        <div class="main-bg">
            <div class="bg">
                <!--==============================header=================================-->
                <header>
                    <div class="main">
                        <div class="wrapper">
                            <h1><a href="index.html"><img src="images/slider-img3.jpg" alt="" /></a></h1>
                            <div class="fright">

                            </div>
                        </div>
                        <nav>
                            <ul class="menu" size=2>

                                <li><a href="index.jsp">INICIO</a></li>
                                <li><a href="acerca_de.jsp">CONSULTAS</a></li>
                                <li><a href="mision_vision.jsp">REPORTES </a></li>
                                <li><a href="formulario.jsp">CONTACTANOS</a></li>
                                </font>
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
                                            <article class="grid_4">
                                                <div class="indent-left">

                                                    <h3 class="p3">Control de Registro</h3>

                                                </div>
                                            </article>


                                            <p align="center" >								
                                            <form id="nuevaper" name="frapersona"  action="<%=request.getContextPath()%>/persona" method="post">
                                                <table>
                                                    <hr>
                                                    <TR>
                                                        <TD>Nombre:</TD>

                                                        <TD><INPUT TYPE="text" NAME="nombre" SIZE="20" MAXLENGTH="30" id="nombre" ></TD>
                                                    </TR>
                                                    <TR>
                                                        <TD>Apellido:</TD>
                                                        <TD><INPUT TYPE="text" NAME="apellido" SIZE="20" MAXLENGTH="30" id="apellido" ></TD>
                                                    </TR>
                                                    <TR>
                                                        <TD>Sexo:</TD>
                                                        <TD><INPUT TYPE="radio" NAME="sexo" value="Masculino" checked="M" id="sexo"><b>Masculino</b> </TD>
                                                        <TD><INPUT TYPE="radio" NAME="sexo"  value="Femenino" id="sexo"><b>Femnino</b> </TD> 				
                                                    </TR>
                                                    <TR>
                                                        <TD>Estado Civil:</TD>
                                                        <td>
                                                            <select name ="estado" id="estado" value="">

                                                                <option> Soltero </option>
                                                                <option> Casado </option>
                                                                <option> Divorsiado </option>
                                                                 <option> Viudo </option>
                                                            </select>
                                                        </td>
                                                    </TR>
                                                    <TR>
                                                        <TD>Nacionalidad:</TD>
                                                        <TD>
                                                            <select name ="nacionalidad" id="nacionalidad"value="">
                                                                <option> Guatemalteco </option>
                                                                <option> Nacionalizado</option>                                                                
                                                            </select>
                                                        </TD>
                                                    </TR>
                                                    <TR>
                                                        <TD>Fecha de Nacimiento:</TD>
                                                        <TD><INPUT TYPE="text" NAME="fechaDeNacimiento" SIZE="20" MAXLENGTH="30" id="fechaDeNacimiento" ></TD>
                                                    </TR>
                                                    <TR>
                                                        <TD>Lugar de Nacimiento:</TD>
                                                        <TD><INPUT TYPE="text" NAME="lugarN" SIZE="20" MAXLENGTH="30" id="lugarN" value=""></TD>
                                                    </TR>
                                                    <TR>
                                                        <TD>Vecindad:</TD>
                                                        <TD><INPUT TYPE="text" NAME="vecindad" SIZE="20" MAXLENGTH="30" id="vecindad" value=""></TD>
                                                    </TR>                                                  


                                                        <td >
                                                            <INPUT TYPE="submit" VALUE="Grabar" src="images/user_add.gif" title="Grabar">
                                                        </td>
                                                    </TR>
                                                </table>



                                            </FORM>
                                            </p>
                                            <hr>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </section>
                </body>
                </html>

