package controllers;

import models.Clean;
import play.api.templates.Html;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
    private int age;

    public static Result main(Html content){
        return ok(main.render(content));
    }

    public static Result index() {
        return main(manu.render());
    }

    public  static Result home(){
        return main(home.render());
    }

    public  static  Result headder(){
        return main(headder.render());
    }



    public static Result showclean(){
        Clean water = new Clean();
        water.setId("CF001");
        water.setName("น้ำผลไม้สกัด");
        water.setBrand("BrunchBow");
        water.setPrice(70);
        water.setAmount(10);
        water.setSize(350);

        Clean food = new Clean();
        food.setId("CF002");
        food.setName("ข้าวปลาทู");
        food.setBrand("under360");
        food.setPrice(70);
        food.setAmount(5);
        food.setSize(25);

        Clean a1 = new Clean();
        a1.setId("CF003");
        a1.setName("ข้าวอกไก่");
        a1.setBrand("ครัวลิงน้อย");
        a1.setPrice(60);
        a1.setAmount(7);
        a1.setSize(25);

        Clean a2 = new Clean();
        a2.setId("CF004");
        a2.setName("ช้าวผัดเผ็ดหมู");
        a2.setBrand("EzyDiet");
        a2.setPrice(100);
        a2.setAmount(10);
        a2.setSize(25);

        Clean a3 = new Clean();
        a3.setId("CF005");
        a3.setName("หมึกไข่เค้ม");
        a3.setBrand("HappyBox");
        a3.setPrice(195);
        a3.setAmount(5);
        a3.setSize(25);

        Clean a4 = new Clean();
        a4.setId("CF006");
        a4.setName("สเต็กอกไก้");
        a4.setBrand("Polpa");
        a4.setPrice(100);
        a4.setAmount(5);
        a4.setSize(25);



        return main(showclean.render(water,food,a1,a2,a3,a4));
    }


}
