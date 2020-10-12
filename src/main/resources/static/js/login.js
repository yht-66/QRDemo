/**
 * Created by de'l'l on 2020/9/8.
 */


document.querySelector(".register").onclick = function(){

    var shoujihao = document.querySelector(".telno").value;
    var password = document.querySelector(".userpwd").value;

    console.log("手机号：" + shoujihao);
    console.log("密码：" + password);

};



document.querySelector(".telno").onblur= fun2;

function fun2() {
    var telnoElement = document.querySelector(".telno");
    var telno = telnoElement.value;
    if(telno == null || telno == "") {
        var tipMsg = "手机号不能为空";
        document.querySelector(".telno_tip").innerText = tipMsg;

    }else{
        document.querySelector(".telno_tip").innerText= "";
    }
}

document.querySelector(".userpwd").onblur = fun3;

function fun3() {
    var userpwdElement = document.querySelector(".userpwd");
    var userpwd = userpwdElement.value;
    if(userpwd == null || userpwd == "") {
        var tipMsg2 = "密码不能为空";
        document.querySelector(".password_tip").innerText= tipMsg2;

    }else{
        document.querySelector(".password_tip").innerText= "";
    }
}



