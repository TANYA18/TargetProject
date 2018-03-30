<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta name="viewport" content="width=device-width, initial-scale=1">
 <!-- Bootstrap 3.3.5 -->
	 <link rel="stylesheet" type="text/css" href="css/bootstrap-responsive.min.css"/>
	 
	 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 


</head>
<body>

<form action="LoginController" method="post">
 <div id="loginCard" class="col-md-4 col-md-offset-4 vertical-center">
        <div class="box box-warning">
            <div class="box-header with-border">
                <h3 class="box-title text-left">Login</h3>
            </div><!-- /.box-header -->
            <!-- form start -->
			<div class="row">&nbsp;</div>
		<%
				HttpSession s = request.getSession();
				s.setAttribute("username", null);
			%>
		
               <div class="box-body">
                    <div class="form-group text-left">
                        <label for="userid" class="col-sm-3 control-label" >UserID&nbsp;</label>
                        <div class="col-xs-8">
                            <input type="text" class="form-control" id="username" placeholder="User ID" name="username" required/>
                            
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="password" class="col-sm-3 control-label">Password</label>
                        <div class="col-xs-8">
                           <input type="password" class="form-control" id="password" placeholder="Password" name="password" required/>

                        </div>
                    </div>
                </div><!-- /.box-body -->
                <div class="box-footer">
				<div class="col-xs-3 col-xs-offset-9">
				 <button type="submit" class="btn btn-primary btn-sm ">Login</button>
					</div>
                </div><!-- /.box-footer -->
           
        </div>            
    </div>

	</form>	

</body>
</html>
