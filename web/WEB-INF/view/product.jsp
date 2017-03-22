<%@ page pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
	<title>搜索结果</title>
	<link href="${pageContext.request.contextPath}/css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
	<!-- Custom Theme files -->
	<!--theme-style-->
	<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css" media="all" />
	<!--//theme-style-->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="keywords" content="Sport Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
	<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>

</head>
<body>
<!--header-->
<div class="line">

</div>
<div class="header">
	<div class="logo">
		<a href="${pageContext.request.contextPath}/index.jsp"><img src="${pageContext.request.contextPath}/images/logo.png" alt="" ></a>
	</div>
	<div  class="header-top">
		<div class="header-grid">
			<ul class="header-in">
				<li ><a href="account.html">我的账户   </a> </li>
			</ul>
			<div class="search-box">
				<div id="sb-search" class="sb-search">
					<form action="medicine/initProductPage" method="POST">
						<input class="sb-search-input" placeholder="Enter your search term..." type="search" name="search" id="search">
						<input class="sb-search-submit" type="submit">
						<span class="sb-icon-search"> </span>
					</form>
				</div>
			</div>
			<!-- search-scripts -->
			<script src="${pageContext.request.contextPath}/js/classie.js"></script>
			<script src="${pageContext.request.contextPath}/js/uisearch.js"></script>
			<script>
				new UISearch( document.getElementById( 'sb-search' ) );
			</script>
			<!-- //search-scripts -->
			<div class="online">
				<a href="cart.html" >购物车</a>
			</div>
			<div class="clearfix"> </div>
		</div>
		<div class="header-bottom">
			<div class="h_menu4"><!-- start h_menu4 -->
				<a class="toggleMenu" href="#">Menu</a>
				<ul class="nav">
					<li><a href="product.html">药物查询</a></li>
					<li><a href="product.html">出诊预约</a>
					</li>
					<li><a href="product.html">更多 <i> </i></a>
						<ul>
							<li><a href="contact.html">联系我们</a></li>
							<li><a href="account.html">我的账号</a></li>
							<li><a href="${pageContext.request.contextPath}/register.html">注册</a></li>
						</ul>
					</li>
				</ul>
				<script type="text/javascript" src="${pageContext.request.contextPath}/js/nav.js"></script>
			</div><!-- end h_menu4 -->
			<ul class="header-bottom-in">
				<li ><select class="drop">
					<option value="Dollars" class="in-of">Get Active</option>
					<option value="Euro" class="in-of">Get Active1</option>
					<option value="Yen" class="in-of">Get Active2</option>
				</select> </li>
				<li ><select class="drop">
					<option value="Dollars" class="in-of">Community</option>
					<option value="Euro" class="in-of">Community1</option>
					<option value="Yen" class="in-of">Community2</option>
				</select></li>
			</ul>
			<div class="clearfix"> </div>
		</div>
	</div>
	<div class="clearfix"> </div>
</div>
<!---->
<div class="product-grids">
	<div class="container"  id="itemContainer">
	</div>
	<div class="container">
		<ul class="pagination" id="mainpaginator">
			<li id="pf" class="disabled"><a href="#">&laquo;</a></li>
			<li id="p1" class="active"><a href="#">1</a></li>
			<li id="p2" class="disabled"><a href="#">2</a></li>
			<li id="p3" class="disabled" ><a href="#">3</a></li>
			<li id="p4" class="disabled" ><a href="#">4</a></li>
			<li id="p5" class="disabled" ><a href="#">5</a></li>
			<li id="pa" class="disabled"><a href="#">&raquo;</a></li>
		</ul>
	</div>
	<!--测试自动排版代码用的，可以删除
    <button onclick='appendItem("1","六味地黄丸","20","/medsite/images/ac.png")' >啊啊啊</button>
    //测试自动排版代码用的，可以删除-->
</div>
<!---->
<!--footer-->
<div class="footer">
	<div class="col-md-3 footer-left">
		<h4>常见疾病</h4>
		<div class="run-top">
			<ul class="run-grid">
				<li><a href="product.html">感冒</a></li>
				<li><a href="product.html">胃痛</a></li>
				<li><a href="product.html">消化不良</a></li>
				<li><a href="product.html">失眠</a></li>
				<li><a href="product.html">缺钙</a></li>
				<li><a href="product.html">其他</a></li>
			</ul>
			<ul class="run-grid">
				<li><a href="product.html">头痛</a></li>
				<li><a href="product.html">营养不良</a></li>
				<li><a href="product.html">维生素缺乏</a></li>
			</ul>
			<div class="clearfix"> </div>
		</div>
	</div>
	<div class="col-md-3 footer-left left-footer">
		<h4>最新</h4>
		<div class="run-top top-run">
			<ul class="run-grid">
				<li><a href="#">新闻</a></li>
				<li><a href="#">活动</a></li>
				<li><a href="#">视频</a></li>
				<li><a href="#">促销</a></li>
			</ul>
			<ul class="run-grid">
				<li><a href="#">新闻</a></li>
				<li><a href="#">活动</a></li>
				<li><a href="#">视频</a></li>
				<li><a href="#">促销</a></li>
			</ul>
			<div class="clearfix"> </div>
		</div>
	</div>
	<div class="col-md-2 footer-left left-footer">
		<h4>我的账户</h4>
		<ul class="run-grid-in">
			<li><a href="account.html">请登陆</a></li>
		</ul>
		<div class="clearfix"> </div>
	</div>
	<div class="col-md-4 footer-left left-footer">
		<ul class="social-in">
			<li><a href="#"><i> </i></a></li>
			<li><a href="#"><i class="youtube"> </i></a></li>
			<li><a href="#"><i class="facebook"> </i></a></li>
			<li><a href="#"><i class="twitter"> </i></a></li>
		</ul>
		<div class="letter">

		</div>

	</div>
	<div class="clearfix"> </div>
</div>

<!--用来存储关键词和过敏信息的隐藏表单-->

<form>
	<input type="text" hidden="true" name="keyword" id="keyword" value="${keyword}"/>
	<input type="text" hidden="true" name="forbidden" id="forbidden" value="${forbidden}"/>
	<input type="text" hidden="true" name="currentpage" id="currentpage" value="${currentpage}"/>
</form>

<!--\\用来存储关键词和过敏信息的隐藏表单-->




<script>

	<!--自动排版-->

	window.sumofitem=0;
	window.currentCon=null;
	window.maxPage=1;
	window.currentPage=1;

	function createContainer(sum){
		var newContainer=document.createElement('div');
		newContainer.className="product-top";
		newContainer.id="C"+parseInt(sum/3);
		document.getElementById("itemContainer").appendChild(newContainer);
		return newContainer;
	}


	function appendItem(id,name,price,pic){

		if (window.sumofitem%3==0)
		{window.currentCon=createContainer(window.sumofitem);}

		var newItem=document.createElement("div");
		newItem.className="col-md-4 grid-product-in";
		newItem.innerHTML='<div class=" product-grid"><a href=/detail?id='+id+'><img class="img-responsive " src="'+pic+'" alt=""></a><div class="shoe-in"><h6><a href="/detail?id='+id+'">'+name+' </a></h6><label>'+price+'元</label><a href="/detail?id='+id+'" class="store">查看详情</a></div><b class="plus-on">+</b></div></div>';
		window.currentCon.appendChild(newItem);



		if (window.sumofitem%3==2)
		{
			var newEndEle=document.createElement('div');
			newEndEle.class="clearfix";
			window.currentCon.appendChild(newEndEle);
		}

		window.sumofitem+=1;
	}

	<!--自动排版 -->

			<!--AJAX-->

			function HttpRequest(url, callback)
			{
				this.request=new XMLHttpRequest();
				this.request.open("GET",url);
				this.request.setRequestHeader("Content-Type", "text/html;charset=UTF-8");

				var tempRequest=this.request;

				function reqReadyStateChange(){
					if (tempRequest.readyState==4){
						if (tempRequest.status == 200){
							callback(tempRequest.responseText);
						}else{alert("无法连接到服务器！status:"+tempRequest.status+" readyState:"+tempRequest.readyState);}
					}
				}
				this.request.onreadystatechange=reqReadyStateChange;
			}

	HttpRequest.prototype.send=function(){
		this.request.send(null);
	}

	function pageComposing(responseText)
	{
		var response=JSON.parse(responseText);

        console.log(response)

		window.maxPage=response.maxpage;

		len = response.results.length;

		results=response.results

		for (i=0;i< len;i++)
		{
			appendItem(results[i].id,results[i].name,results[i].price,results[i].pic);
		}

		changeNav(window.currentPage);
	}

	function changeNav(page)
	{
		var paginator= document.getElementById('mainpaginator')
		var maximum=window.maxPage;
		var list=[document.getElementById("p1"),document.getElementById("p2"),document.getElementById("p3"),document.getElementById("p4"),document.getElementById("p5")]

		if (page<=maximum)
		{
			if(page<=3){
				document.getElementById("pf").className="disabled";

				if (maximum>=6){
					document.getElementById("pa").className="";
					document.getElementById("pa").innerHTML="<a href='javascript:gettingResult(6)'>&raquo;</a>";
				}else{
					document.getElementById("pa").className="disabled";}

				for(i=0;i<5;i++){
					if(i<=maximum-1){
						list[i].innerHTML="<a href='javascript:gettingResult("+parseInt(i+1)+")'>"+parseInt(i+1)+"</a>";
						list[i].className="";
					}else{
						list[i].innerHTML="";
						list[i].className="disabled";
					}
				}
				list[page-1].className="active";
			}else{
				document.getElementById("pf").className="";
				document.getElementById("pf").innerHTML="<a href='javascript:gettingResult("+parseInt(-3+page)+")'>&laquo;</a>";

				if (2+page>=maximum){document.getElementById("pa").className="disabled"}
				else{document.getElementById("pa").className=""}
				document.getElementById("pa").innerHTML="<a href='javascript:gettingResult("+parseInt(3+page)+")'>&raquo;</a>";

				for(i=0;i<5;i++){
					if ((i-2+page)<=maximum){
						list[i].innerHTML="<a href='javascript:gettingResult("+parseInt(i-2+page)+")'>"+parseInt(i-2+page)+"</a>";
						list[i].className="";
					}else{
						list[i].innerHTML="";
						list[i].className="disabled";
					}


				}
				list[2].className="active"
			}

		}
	}

	function gettingResult(page)
	{
		window.currentPage=page;

		document.getElementById("itemContainer").innerHTML="";
		var request =new HttpRequest("search?keyword="+(encodeURI(encodeURI(document.getElementById("keyword").value)))+"&forbidden="+(document.getElementById("forbidden").value)+"&page="+page,pageComposing);

		request.send();


	}

	gettingResult(1);

	<!--AJAX-->

</script>
</body>
</html>