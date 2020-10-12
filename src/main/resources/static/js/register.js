/**
 * Created by dell on 2020/9/12.
 */
document.querySelector(".denglu").onclick = function(){
        var tel = document.querySelector(".sr").value;
        var pwd = document.querySelector(".password").value;
        console.log("用户手机号："+tel)
        console.log("用户密码："+pwd)

}

$(".sr").blur(checkUserTel);
function checkUserTel(){
    var usertel = $(".sr").val();
    if(usertel == "" || usertel ==null ){
        $(".sr").next(".tip").text("手机号不能为空");
    }else{
        $(".sr").next(".tip").text("");
    }

}

$(".password").blur(checkUserpwd);
function checkUserpwd(){
    var userpwd = $(".password").val();
    if(userpwd == "" || userpwd ==null ){
        $(".password").next(".tip2").text("密码不能为空");
    }else{
        $(".password").next(".tip2").text("");
    }

}

$(".denglu").click(checkUserpwd2);
function checkUserpwd2(){
    var userpwd = $(".password").val();
    var userpwd2 = $(".password_agin").val();
    if(userpwd2 != userpwd  ){
        $(".password_agin").next(".tip3").text("密码不同");
    }else{
        $(".password_agin").next(".tip3").text("");
    }

}
