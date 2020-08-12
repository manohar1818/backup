<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<html>
<head><link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link href="https://fonts.googleapis.com/css?family=Heebo:400,500,700|Open+Sans:400,600,700|Source+Sans+Pro:400,600,700" rel="stylesheet">
<link rel="import" href="https://fonts.googleapis.com/css?">
<style>
.contain{
  border:1px solid grey;
  border-radius:20px;
  box-shadow: 0px 2px 5px 0px;
  width:700px;
  background:white;
}
.booshanam{
  overflow-wrap: break-word;
  white-space: pre-wrap;
  overflow-x: hidden;
}
#img1{
  width:100%;
  height:350px;
  border-radius: 20px 20px 0px 0px;
}
h1{
  font-family: Heebo;
}
#con{
  margin-left: 25%;
}
.nav1{
  display:flex;
  background:white;
  height: 110px;

}
.a1 a{
  text-decoration: none;
  color:grey;
  margin-left: 10px;
}
.a1{
  padding-top: 15px;
  height:50px;
  margin-left: 20px;
  width: 276px;
  margin-top: 15px;
}
.navtitle{
  font-size: 28px;
  font-weight: 2px;
  text-align: center;
  margin-top: 5px;
  height:180px;
  width: 100px;
  padding-left: 10px;
}
.log{
  margin-left: 450px;
padding-top: 15px;
height: 50px;
margin-top: 15px;

}
.log a{
  text-decoration: none;
  color:grey;
  padding-left: 20px;

}
#img2{
  width: 168px;
height: 110px;
}
#jumb{
  background:#e55f0b;
  text-align: center;
  color:white;
  height:100px;
  font-size: 38px;
  font-weight: 600;
  padding-top: 15px;
}

</style>
</head>
<body style="background:#e9ecef6e;">

  <div class="nav1">
    <div class="navtitle"><img id="img2" src="{% static 'images/logo1.png' %}"></div>


  </div><div id="jumb">Explore Here</div><br><br><br>
<div id='con'><div class="contain">

{% for article in all_article %}
  {% if article.image %}
  <img id="img1" src={{article.image.url}} />
  <center><div class="container" style="font-family:'Roboto',sans-serif">
  <br><h1>{{ article.Title }}</h1><br>
  {% endif %}
</center><br>

  <pre style="font-family:'Roboto',sans-serif; font-size:19.2px;font-weight:400px;"><div class="booshanam" style="padding-left:15px;padding-right:15px;"> {{ article.Description }} </div></pre>
  <p style="text-align:center;"></p>

  <h3 style="font-size:115%;padding-left:15px;padding-right:15px;"> Start date : {{ article.start_date }}<br></h3>
  <h3 style="font-size:115%;padding-left:15px;padding-right:15px;" > End date :  {{ article.end_date }}</h3><br>
  <center>
  <a href="{{ article.official_link }}"><button class="btn"style="background:#1D4350;color:white">Official Link</button></a><br><br><br>
{% endfor %}
</center></div>
</div></div><br><br><br>
</body>
</html>
