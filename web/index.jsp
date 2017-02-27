<%--
  Created by IntelliJ IDEA.
  User: fyyzyh
  Date: 2017/2/23
  Time: 21:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Home</title>
    <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="js/jquery.min.js"></script>
    <!-- Custom Theme files -->
    <!--theme-style-->
    <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
    <!--//theme-style-->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="Sport Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,
  Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <!--fonts-->
    <link href='http://fonts.useso.com/css?family=Open+Sans:400,300,600,700,800' rel='stylesheet' type='text/css'>
    <!--//fonts-->

  </head>
  <body>
  <!--header-->
  <div class="line">

  </div>
  <div class="header">
    <div class="logo">
      <a href="index.html"><img src="images/logo.png" alt="" ></a>
    </div>
    <div  class="header-top">
      <div class="header-grid">
        <ul class="header-in">
          <li ><a href="account.html">我的账户   </a> </li>
        </ul>
        <div class="search-box">
          <div id="sb-search" class="sb-search">
            <form>
              <input class="sb-search-input" placeholder="Enter your search term..." type="search" name="search" id="search">
              <input class="sb-search-submit" type="submit" value="" method="PUT" action="/search/">
              <span class="sb-icon-search"> </span>
            </form>
          </div>
        </div>
        <!-- search-scripts -->
        <script src="js/classie.js"></script>
        <script src="js/uisearch.js"></script>
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
                <li><a href="register.html">注册</a></li>
              </ul>
            </li>
          </ul>
          <script type="text/javascript" src="js/nav.js"></script>
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
  <div class="banner">
    <div class="container">

      <div class="content-bottom">
        <div class="col-md-8 bottom-content">
          <script src="js/responsiveslides.min.js"></script>
          <script>
            $(function () {
              $("#slider").responsiveSlides({
                auto: true,
                speed: 500,
                namespace: "callbacks",
                pager: false,
                nav:true,
              });
            });
          </script>
          <div class="slider">
            <div class="callbacks_container">
              <ul class="rslides" id="slider">
                <li>
                  <a herf='index.html'><img src="images/vi.jpg" alt=""></a>

                </li>
                <li>
                  <a herf='index.html'><img src="images/v2.jpg" alt=""></a>

                </li>
                <li>
                  <a herf='index.html'><img src="images/vi.jpg" alt=""></a>

                </li>
              </ul>
            </div>
            <!-->
            <div class="london">
              <h5>每日推荐</h5>
              <p>2017/2/22</p>
            </div><!/-->
          </div>

        </div>
        <div class="col-md-4 bottom-grid">
          <h4>最新文章</h4>
          <div class="news">
            <span>17/2/22</span>
            <p><a herf="index.html" >雨水节气来临 </a></p>
            <div class="foot">
              <label></label>
              <ul class="eye ">
                <li><span><i> </i>315</span></li>
                <li><a href="#"><i class="comment"> </i> 3</a></li>
              </ul>
              <div class="clearfix"> </div>
            </div>
          </div>
          <div class="news">
            <span>17/2/21</span>
            <p><a herf='index.html' >春天要吃柠檬！ </a></p>
            <div class="foot">
              <label></label>
              <ul class="eye ">
                <li><span><i> </i>315</span></li>
                <li><a href="#"><i class="comment"> </i> 3</a></li>
              </ul>
              <div class="clearfix"> </div>
            </div>
          </div>
          <div class="news">
            <span>17/2/19</span>
            <a herf='index.html'><p>养生讲座！ </p></a>
            <div class="foot">
              <label></label>
              <ul class="eye ">
                <li><span><i> </i>315</span></li>
                <li><a href="#"><i class="comment"> </i> 3</a></li>
              </ul>
              <div class="clearfix"> </div>
            </div>
          </div>
          <a href="#" class="view">查看所有文章</a>
        </div>
        <div class="clearfix"> </div>
      </div>
    </div>
  </div>
  <!---->
  <div class="content">
    <div class="sport-your">
      <!-- requried-jsfiles-for owl -->
      <link href="css/owl.carousel.css" rel="stylesheet">
      <script src="js/owl.carousel.js"></script>
      <script>
        $(document).ready(function() {
          $("#owl-demo").owlCarousel({
            items : 5,
            lazyLoad : true,
            autoPlay : true,
            navigation : true,
            navigationText :  true,
            pagination : false,
          });
        });
      </script>
      <!-- //requried-jsfiles-for owl -->

      <!-- start content_slider -->
      <div class="copyrights"></div>
      <div class="line1">

      </div>
      <div id="example1">
        <div id="owl-demo" class="owl-carousel text-center">
          <div class="item">
            <a href="single.html" title="image" rel="title1">
              <img class="img-responsive " src="images/pic.jpg" alt="">
              <div class="run">
                <i> </i>
                <p>药物查询</p>
              </div>
            </a>
          </div>
          <div class="item">
            <a href="single.html" title="image" rel="title1">
              <img class="img-responsive " src="images/pic1.jpg" alt="">
              <div class="run">
                <i class="foot-in"> </i>
                <p>预约出诊</p>
              </div>
            </a>
          </div>
          <div class="item">
            <a href="single.html" title="image" rel="title1">
              <img class="img-responsive " src="images/pic.jpg" alt="">
              <div class="run">
                <i> </i>
                <p>药物查询</p>
              </div>
            </a>
          </div>
          <div class="item">
            <a href="single.html" title="image" rel="title1">
              <img class="img-responsive " src="images/pic1.jpg" alt="">
              <div class="run">
                <i class="foot-in"> </i>
                <p>预约出诊</p>
              </div>
            </a>
          </div>
          <div class="item">
            <a href="single.html" title="image" rel="title1">
              <img class="img-responsive " src="images/pic.jpg" alt="">
              <div class="run">
                <i> </i>
                <p>药物查询</p>
              </div>
            </a>
          </div>
          <div class="item">
            <a href="single.html" title="image" rel="title1">
              <img class="img-responsive " src="images/pic1.jpg" alt="">
              <div class="run">
                <i class="foot-in"> </i>
                <p>预约出诊</p>
              </div>
            </a>
          </div>
          <div class="item">
            <a href="single.html" title="image" rel="title1">
              <img class="img-responsive " src="images/pic.jpg" alt="">
              <div class="run">
                <i> </i>
                <p>药物查询</p>
              </div>
            </a>
          </div>
          <div class="item">
            <a href="single.html" title="image" rel="title1">
              <img class="img-responsive " src="images/pic1.jpg" alt="">
              <div class="run">
                <i class="foot-in"> </i>
                <p>预约出诊</p>
              </div>
            </a>
          </div>

        </div>
      </div>
      <h6 class="your-in">OPTIONS</h6>
      <div class="line2">

      </div>
    </div>
    <!--//sreen-gallery-cursual---->
    <div class="content-grids">

      <div class="col-md-4 content-grid">
        <a href="single.html" class="lot"><img class="img-responsive " src="images/sh.png" alt=""></a>
        <div class="shoe">
          <p>药品1</p>
          <label>$67.99</label>
          <a href="single.html" class=view >购买</a>
        </div>
        <div class="clearfix"> </div>
        <b class="plus-in">+</b>
      </div>
      <div class="col-md-4 content-grid">
        <a href="single.html" class="lot"><img class="img-responsive " src="images/sh1.png" alt=""></a>
        <div class="shoe">
          <p>药品2</p>
          <label>$67.99</label>
          <a href="single.html" class=view >购买</a>
        </div>
        <div class="clearfix"> </div>
        <b class="plus-in">+</b>
      </div>
      <div class="col-md-4 content-grid">
        <a href="single.html" class="lot"><img class="img-responsive " src="images/sh2.png" alt=""></a>
        <div class="shoe">
          <p>药品3</p>
          <label>$67.99</label>
          <a href="single.html" class=view >购买</a>
        </div>

        <div class="clearfix"> </div>
        <b class="plus-in">+</b>
      </div>

      <div class="clearfix"> </div>
    </div>
    <!---->

  </div>
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
  </body>
</html>
