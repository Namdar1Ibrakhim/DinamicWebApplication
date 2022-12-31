package com.example.web1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

 @RequestMapping("/home") //С помощью аннотации @RequestMapping мы привязываем действие к пути HTTP-запроса
    public String home(Model page){ //В Model где хранятся данные, которые контроллер будет передавать в представление. В экземпляр Model мы добавим значения, которые также должны отправиться в представление
     page.addAttribute("username", "Katy"); //Ключ - значение
     page.addAttribute("color", "red"); // эти данные отправляются в представление
        return "home.html"; //Действие контроллера возвращает представление, которое затем будет преобразовано в HTTP-ответ
    }
}
