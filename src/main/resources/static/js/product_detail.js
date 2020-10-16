/**
 * Created by de'l'l on 2020/9/21.
 */
/*document.querySelector(".s22").onclick = function(){

}*/
var s = 0;
$(".s22").click(function(){
    s++;
    if(s == 1) {
        $(".l3").show();
    }
    else{
        s = 0;
        $(".l3").hide();
    }
})



    //选择场次
var b1 =document.querySelector(".changci1").style;
document.querySelector(".changci1").onclick=function(){
    document.querySelector(".changci1").style.color ="#ff1286";
    document.querySelector(".changci1").style.borderColor ="#ff1286";

    document.querySelector(".changci2").style = "b1";
    document.querySelector(".changci3").style = "b1";
    document.querySelector(".changci4").style = "b1";

    var changci1Ele = document.querySelector(".changci1");
    console.log("场次为:" + changci1Ele.innerText);
};
document.querySelector(".changci2").onclick=function(){
    document.querySelector(".changci2").style.color ="#ff1286";
    document.querySelector(".changci2").style.borderColor ="#ff1286";

    document.querySelector(".changci1").style = "b1";
    document.querySelector(".changci3").style = "b1";
    document.querySelector(".changci4").style = "b1";

    var changci2Ele = document.querySelector(".changci2");
    console.log("场次为:" + changci2Ele.innerText);
};
document.querySelector(".changci3").onclick=function(){
    document.querySelector(".changci3").style.color ="#ff1286";
    document.querySelector(".changci3").style.borderColor ="#ff1286";

    document.querySelector(".changci1").style = "b1";
    document.querySelector(".changci2").style = "b1";
    document.querySelector(".changci4").style = "b1";

    var changci3Ele = document.querySelector(".changci3");
    console.log("场次为:" + changci3Ele.innerText);

};
document.querySelector(".changci4").onclick=function(){
    document.querySelector(".changci4").style.color ="#ff1286";
    document.querySelector(".changci4").style.borderColor ="#ff1286";

    document.querySelector(".changci1").style = "b1";
    document.querySelector(".changci2").style = "b1";
    document.querySelector(".changci3").style = "b1";

    var changci4Ele = document.querySelector(".changci4");
    console.log("场次为:" + changci4Ele.innerText);

};




//选择票档
var priceEle = document.querySelector(".s10");
var click = 0;
var b2 =document.querySelector(".g1").style;
document.querySelector(".g1").onclick=function(){
    click = 1;
    document.querySelector(".g1").style.color ="#ff1286";
    document.querySelector(".g1").style.borderColor ="#ff1286";

    document.querySelector(".g2").style = "b2";
    document.querySelector(".g3").style = "b2";
    document.querySelector(".g4").style = "b2";

    var piaodang1Ele = document.querySelector(".g1");
    /* console.log("票档为:" + piaodang1Ele.innerText);*/
    var price1Ele = document.querySelector(".price1");
    /*  var numEle = document.querySelector(".piaoshu")*/
    document.querySelector(".zongji").innerText = price1Ele.innerText;

};
document.querySelector(".g2").onclick=function(){
    document.querySelector(".g2").style.color ="#ff1286";
    document.querySelector(".g2").style.borderColor ="#ff1286";
    click = 2;
    document.querySelector(".g1").style = "b2";
    document.querySelector(".g3").style = "b2";
    document.querySelector(".g4").style = "b2";

    var piaodang2Ele = document.querySelector(".g2");
    var price2Ele = document.querySelector(".price2");
    document.querySelector(".zongji").innerText = price2Ele.innerText;


};
document.querySelector(".g3").onclick=function(){
    document.querySelector(".g3").style.color ="#ff1286";
    document.querySelector(".g3").style.borderColor ="#ff1286";
    click = 3;
    document.querySelector(".g1").style = "b2";
    document.querySelector(".g2").style = "b2";
    document.querySelector(".g4").style = "b2";

    var piaodang3Ele = document.querySelector(".g3");
    var price3Ele = document.querySelector(".price3");
    document.querySelector(".zongji").innerText = price3Ele.innerText;


};
document.querySelector(".g4").onclick=function(){
    document.querySelector(".g4").style.color ="#ff1286";
    document.querySelector(".g4").style.borderColor ="#ff1286";
    click = 4;
    document.querySelector(".g1").style = "b2";
    document.querySelector(".g2").style = "b2";
    document.querySelector(".g3").style = "b2";

    var piaodang4Ele = document.querySelector(".g4");
    var price4Ele = document.querySelector(".price4");
    document.querySelector(".zongji").innerText = price4Ele.innerText;


};


//选择票数
var count = 1;
var b3 = document.querySelector(".a1").style;

var b4 = document.querySelector(".a2").style;
document.querySelector(".a2").onclick = function(){
    count++;

    if(count == 6){
        document.querySelector(".a2").style = "b3";
    }else if(count >= 7){
        count = 6;
        document.querySelector(".a1").style = "b4";
    }
    var numberEle = document.querySelector(".piaoshu");
    numberEle.value = count;
    console.log("数量为：" + numberEle.value);
};
document.querySelector(".a1").onclick = function(){
    count--;

    if(count == 1){
        document.querySelector(".a1").style = "b3";
    }else if(count == 0){
        count = 1;
        document.querySelector(".a2").style = "b4";
    }
    var numberEle = document.querySelector(".piaoshu");
    numberEle.value = count;
    console.log("数量为：" + numberEle.value);
};



//总计价格
var container = document.querySelector(".middle");

container.onclick = function(event){
   zongji();//总计
};



if(element.nodeName == "A" && element.innerHTML == "-") {
    zongji();
    //总计
}


    function zongji(){
    //选择票档

        var originalPrice = 0;
        console.log("click=" + click);
        switch (click) {
            case 1:
                originalPrice = 300;break;
            case 2:
                originalPrice = 380;break;
            case 3:
                originalPrice = 480;break;
            case 4:
                originalPrice = 650;break;
        }
        var totalPrice = originalPrice * count;

        console.log("22222");
        document.querySelector(".zongji").innerText = totalPrice;

    }




/*var btn1 = document.querySelector("#l1").style;
var btn2 = document.querySelector("#l2").style;*/
$("#l1").click(function(){
    $(".tip_2").hide();
    $(".tip_1").show();
    document.querySelector("#l1").style.color = "#000";
    document.querySelector("#l1").style.size = "20px";

    document.querySelector("#l2").style.color = "lightgray";
    document.querySelector("#l2").style.size = "16px";

})
$("#l2").click(function(){
    $(".tip_1").hide();
    $(".tip_2").show();
    document.querySelector("#l2").style.color = "#000";
    document.querySelector("#l2").style.size = "20px";

    document.querySelector("#l1").style.color = "lightgray";
    document.querySelector("#l1").style.size = "16px";
})

















