	<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ include file="/WEB-INF/view/include.jsp"%>

<html>
	<head>
		<meta charset="utf-8">
		<title>Welcome</title>

		<link rel="stylesheet" href="${baseCssLocation}select2.css" />
        <script src="${baseJsLocation}jquery-1.10.2.min.js"></script>
		<script src="${baseJsLocation}jquery.min.js"></script>
		<script src="${baseJsLocation}amazingslider.js"></script>
   		<script src="${baseJsLocation}initslider-1.js"></script>
		<script src="${baseJsLocation}select2.js"></script>
		 
		<script>
		$(document).ready(function() { 
	
			$("#e1_1").select2({
			
			allowClear : true,
			width : '90%'		
		});
		
		$("#e2_1").select2({
			allowClear : true,
			width : '100%'		
		});
		
		}); // END OF DOCUMENT READY
		</script> 
		 
		<style>
		h1 { color: #F90B6D; font-family: Verdana, Arial; font-size: 34px; font-weight: 300; line-height: 40px; margin: 0 0 16px; }
		h3 { color: #F90B6D; font-family: Verdana, Arial; font-size: 18px; font-weight: 300; line-height: 10px; margin: 0 0 10px; }
		
		
		.button {
		  -moz-border-radius: 25px;
		  -moz-box-shadow: #6E7849 0px 0px 10px;
		  -moz-transition: all 0.5s ease;
		  -ms-transition: all 0.5s ease;
		  -o-transition: all 0.5s ease;
		  -webkit-border-radius: 25px;
		  -webkit-box-shadow: #6E7849 0 0 10px;
		  -webkit-transition: all 0.5s ease;
		  background-color: #ffffff;
		  border-radius: 25px;
		  border: 2px solid #4a5032;
		  box-shadow: #6E7849 0px 0px 10px;
		  color: #F90B6D;
		  display: inline-block;
		  font-size: 1.2em;
		  margin: auto;
		  padding: 15px;
		  text-decoration: none;
		  transition: all 0.5s ease;
		}
		.button:hover {
		  padding: 15px;
		}
		
				
		</style> 
		 
	</head> 
	<body>
		
		<div id="amazingslider-1" style="display:block;position:relative;margin:16px auto 56px;">
        <ul class="amazingslider-slides" style="display:none;">
            <li><img src="${baseImageLocation}pano4.jpg" alt="pano4" /></li>
            <li><img src="${baseImageLocation}pano5.jpg" alt="pano5" /></li>
            <li><img src="${baseImageLocation}pano6.jpg" alt="pano6" /></li>
            <li><img src="${baseImageLocation}pano7.jpg" alt="pano7" /></li>
        </ul>
       
         
    </div>

		<h1 align="center"> Welcome Pablo Chacon 
		</h1>
	
	
			
		<form id="temperatureForm" commandName="temperatureForm" action="${baseLocation}showMessage.action">
		
	
	<table border="0.4" width="30%" cellpadding="2" cellspacing="2" align="center">
		<tr align="right">
		<td align="right">
			<h3>Select a City: </h3> 
		</td>
		<td>
		<div>
		                <!-- Select City -->       
		               	<select id="e1_1" name="zipSelected" data-validation-engine="validate[required]" data-prompt-position="bottomLeft:150,75" data-errormessage="Cannot be empty">
		                  	
		                  	<option value="" selected>Select City:</option>
		                  	
		                  	<option value="30303">ATLANTA</option>
		                  	<option value="21204">BALTIMORE</option>
		                  	<option value="77002">HOUSTON</option>
		                  	<option value="32801">ORLANDO</option>
		                  	<option value="98101">SEATTLE</option>
		                  	
		             	</select>
		</div>
		
		</td>
		
		<td align="right">
			<button class="button" align="right" data-loading-text="loading..." type="submit" class="btn btn-success">SUBMIT</button>
		</td>
		
		</tr>
		</table>
		
		</form>
		
			
	
		
	</body>
</html>
		