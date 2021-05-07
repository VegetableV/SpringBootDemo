package com.exampl.controller;

import com.exampl.domain.Guest;
import com.exampl.service.GuestService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class GuestController {

    @Autowired
    private GuestService guestService;


    /**
     * 展示所有的嘉宾
     * @param model  用于存储查找到的嘉宾  展示到页面
     * @return list.html  用于返回页面
     */
    @RequestMapping("/list")
    public String returnList(Model model){
        //全表通查
        List<Guest> guests=guestService.reList();
        model.addAttribute("guests",guests);
        return "list";
    }

    /**
     * 测试页面是否可用
     * @return index.html
     */
    @RequestMapping("/index")
    public String test(){
        return "index";
    }

    /**
     * 用于接受请求  展示添加页面
     * @return add.html
     */
    @RequestMapping("/add")
    public String add(){
        return "add";
    }

    /**
     * 处理添加请求，将接受到的参数传给业务层，让业务层调用方法，将数据存入数据库
     * @param guest
     * @return 重定向到list.html
     */
    @RequestMapping("/addGuest")
    public String addGuest(Guest guest){
        guestService.addGuest(guest);
        return "redirect:list";
    }


    /**
     * 接受请求展示update.html
     * @param model  将参数传入model 展示到页面中
     * @param uname  接受名字，名字不可改，所以直接展示
     * @return update.html
     */
    @RequestMapping("/update")
    public String update(Model model,String uname){
        model.addAttribute("uname",uname);
        return "update";
    }

    /**
     * 接受请求，调用业务层的方法，来修改内容
     * @param guest
     * @return 重定向到list.html
     */
    @RequestMapping("updateGuest")
    public String updateGuest(Guest guest){
        guestService.updateGuest(guest);
        return "redirect:list";
    }

    @RequestMapping("/delete")
    public String delete(String uname){
//        System.out.println(uname);
        guestService.deleteGuest(uname);
        return "redirect:list";
    }




}
