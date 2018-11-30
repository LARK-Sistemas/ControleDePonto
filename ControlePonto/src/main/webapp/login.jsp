<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page contentType="text/html; charset=UTF-8" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>CG-Ponto</title>

    <link href="css/bootstrap.css" rel="stylesheet" />
    <link href="css/bootstrap-responsive.css" rel="stylesheet" />
  <!--  <link href="css/login.css" rel="stylesheet" /> -->
    <link href="css/styles.css" rel="stylesheet" />
    
      

	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<meta http-equiv="Cache-Control" content="no-cache, no-store, must-revalidate" />
	<meta http-equiv="Pragma" content="no-cache" />
	<meta http-equiv="Expires" content="0" />
	<script>
		function focar() {
			document.getElementById("usuario").focus();
		}
	</script>
</head>
<body>
	<form action="j_spring_security_check" method="post">
	<div class="wrapper">
	<div class="header">
    	<div class="container">
        	<div class="row branding">
            	<div class="span6">
                	<h1 class="pull-left"><strong>CONTROLE E GESTÃO DE PONTO</strong></h1>
                	<h2 class="pull-left"><strong>LARK SISTEMAS</strong></h2>
                </div>            	
            </div>
                        <div class="row navigation">
	           
            </div>
        </div>        
    </div>
	<div class="row">
        <div class="span8 sidebar">  
	            	<div class="well quickSignupForm" style="height: 35%; margin-top: 20%; margin-left: 60%; width: 60%;">			        
			        <!-- 	<div class="boxBottom colorFive"> -->
			          		<h2 class="colorTextThree" style="margin-left: 40%">Login</h2>
			          		<br/>
			          		<div class="span4 sidebar">  		                               
								<%
								if (request.getParameter("msg") != null) {
									out.print("<span style='color: red;font-weight: bold;'>Usuário ou senha incorretos</span>");
								}%>		
			                  <!--  <h2 class="colorTextThree">Usuário</h2>
			                 </p><input type="text" id="usuario" name="j_username" class="span3"/>  -->
			                 
			                 
			                  <input type="text" id="usuario" name="j_username" class="form-control" placeholder="Usuário" required autofocus style="width: 105%;">
			                  
			                  
			                  <!-- <h2 class="colorTextThree">Senha</h2>
			                  <input id="senha" name="j_password" type="password" class="span3" />   -->
			                  <br />                
			                  
			                  <input type="password" id="senha" name="j_password" class="form-control" placeholder="Senha" required autofocus style="width: 105%;"> <br>
			                  <br>
			                  <input class="btn btn-info" id="btnEntrar" type="submit" value="Entrar" style="width: 40%; margin-left: 35%"></input> 		                        
			            	</div>
			          	</div>
			        
	        	</div>                    
    	</div>
    </div>
</body>
</html>