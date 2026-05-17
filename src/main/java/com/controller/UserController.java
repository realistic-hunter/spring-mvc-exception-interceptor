package com.controller;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.po.User;
/**控制器UserController用于处理用户有关的请求，
 * 可以处理3个不同的请求。
 * 注意，仅“/tomain”请求，会被拦截器拦截。
 * */

@Controller
public class UserController {
    @RequestMapping(value="/tologout",method=RequestMethod.GET)
    public String toLogout(HttpSession session) {
        session.invalidate();
        return "login";
    }

    @RequestMapping(value="/userlogin",method=RequestMethod.POST)
    public String userLogin(User user, HttpSession session, Model model) {
        if (user.getUsername() != "" || user.getUsername() != null)
            session.setAttribute("username", user.getUsername());

        return "main";
    }

    @RequestMapping(value="/tomain", method=RequestMethod.GET)
    public String toMain() {
        return "main";
    }

    //制造一个算术异常测试接口
    @RequestMapping(value="/test", method=RequestMethod.GET)
    public String test() {
        int a = 1 / 0;
        return "main";
    }

}

