BookNewController.java<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>      
    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>bookBest</title>
<!-- <link rel="stylesheet" href="css/style.css" /> -->

<script src="/jquery-3.7.1.min.js"></script>   
<script>
$(document).ready(function(){
	
});
</script>
</head>
<body>
<header class="screen-header">
        <span><a href="index.html">READING LOG</a></span>
        <div class="screen-header__search">
            <input type="text" id="searchInput" placeholder="검색어 입력" onkeydown="handleSearch(event)">
            <i onclick="searchBooks()" class="fa-solid fa-magnifying-glass fa-lg"></i>

        </div>

        <div class="screen-header__user">
            <a href="bookLogIn.html">Log In</a>
            <a href="bookSignIn.html">Sign In</a>
        </div>
    </header>
    <nav class="header-nav">
        <ul class="header-nav__lists">
            <li><a href="bookBest.html">Best</a></li>
            <li><a href="bookNew.html">New</a></li>
            <li><a href="bookBoard.html">Community</a></li>
        </ul>
    </nav>

    <main class="best-book">
        <h1>일간 베스트 상품 - ${bestbookdto[0].title } ${bestbookdto[1].title } ${bestbookdto[2].title }</h1>
        <div class="best-box">
		<c:forEach var="bestbook" items="${bestbookdto }" >
	            <div class="best-box__books">
	                <%-- <span>BEST ${book_index + 1 }</span> --%>
	                <h1>${bestbook.order_book_title }</h1>
	                <div class="card"> 
	                    <div class="image-box">
	                        <img src="${bestbook.book_image_url }" alt="${bestbook.order_book_title }">
	                    </div>
	                    <div class="content">
	                        <h2>${book.book_author }</h2>
	                        <p>${bestbook.book_content }</p>
	                    </div>
	                </div>
	            </div>
            </c:forEach>
        </div>
    </main>
    
    <script src="https://code.jquery.com/jquery-3.7.0.js"
        integrity="sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM=" crossorigin="anonymous"></script>
    <!-- <script src="bookMain.js"></script> -->
    <script src="https://kit.fontawesome.com/5c3afda2cc.js" crossorigin="anonymous"></script>  
    
</body>
</html>