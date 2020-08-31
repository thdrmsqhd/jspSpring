<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<div id="map" style="width:500px;height:400px;"></div>
    <script type="text/javascript" 
    src="//dapi.kakao.com/v2/maps/sdk.js?appkey=5cb49ebebf3987887f76ee04385397f2">
    </script>
	<script>
		var container = document.getElementById('map');
		var options = {
			center: new kakao.maps.LatLng(33.450701, 126.570667),//지도 중심좌표 지정
			level: 3//지도 레벨 설정
		};

		var map = new kakao.maps.Map(container, options);
	</script>
</body>
</html>
