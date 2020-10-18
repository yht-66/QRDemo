<%--
  Created by IntelliJ IDEA.
  User: 22522
  Date: 2020/9/29
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<link rel="icon" href="data:image/ico;base64,aWNv">
<link rel="stylesheet" type="text/css" href="css/注册2.css">
<link rel="stylesheet" type="text/css" href="css/verify.css">
<script src="js/jquery.min.js"></script>
<body>


<div class="d1">
    <div class="tel">
        <div class="sjh">
            <span>*</span>手机号：
        </div>
        <div class="duoxuan">
            <select class="select">
                <option>中国大陆 +86</option>
                <option>中国台湾 +886</option>
                <option>中国香港 +852</option>
                <option>中国澳门 +853</option>
            </select>
        </div>
        <div class="shuru" >
            <input type="text" class="sr" placeholder="请输入手机号" name="tel">
            <span class="tip"></span>
        </div>

    </div>

    <div class="psw">
        <div class="srmm">
            <span>*</span>输入密码：
        </div>
        <div class="srmm2">
            <input type="password" placeholder="请输入密码" class="password_one" name="password1">
            <span class="tip2"></span>
        </div>
    </div>
    <div class="psw_agin">
        <div class="srmm_agin">
            <span>*</span>确认密码：
        </div>
        <div class="srmm2_agin">
            <input type="password" placeholder="请再次输入密码" class="password_agin">
            <span class="tip3"></span>
        </div>

        <!--滑块-->
        <div id="mpanel4" >
        </div>

        <script type="text/javascript" src="js/jquery.min.js"></script>
        <script type="text/javascript" src="js/verify.js" ></script>
        <script type="text/javascript">

            $('#mpanel4').slideVerify({
                type : 2,		//类型
                vOffset : 5,	//误差量，根据需求自行调整
                vSpace : 5,	//间隔
                imgName : ['1.jpg', '2.jpg'],
                imgSize : {
                    width: '400px',
                    height: '200px'
                },
                blockSize : {
                    width: '40px',
                    height: '40px'
                },
                barSize : {
                    width : '400px',
                    height : '40px'
                },
                ready : function() {
                },
                success : function() {
                    alert('验证成功');
                    //......后续操作
                },
                error : function() {
//		        	alert('验证失败！');
                }

            });

            function register() {
                var tel = $(".shuru").find("input[name='tel']").val();
                var password = $(".srmm2").find("input[name='password1']").val();

                if (tel === undefined || tel === '') {
                    alert("用户名不允许为空");
                    return;
                }
                if (password === undefined || password === '') {
                    alert("密码不允许为空");
                    return;
                }
                $.ajax({
                    url:"/user/register",
                    method: "POST",
                    data: {
                        tel: tel,
                        password: password
                    },
                    success: function (res) {
                        if (res.status === 0) {
                            alert(res.data.tel + "注册成功");
                            location.reload();
                        } else {
                            alert(res.msg)
                        }
                    }
                })
            }
        </script>




        <div class="xieyi">
            <input type="checkbox"  value="agree">
            <div class="xy">
                <p>我已阅读接受《服务协议》《隐私权政策》《订票服务条款》<br>
                    <span>请同意注册协议</span>
                </p>
            </div>
            <div class="btn">
                <input type="submit" class="denglu" value="同意并登录" onclick="register()">
            </div>
        </div>

    </div>

    <!--    <script src="js/注册2.js"></script>-->
</div>
</body>
</html>
