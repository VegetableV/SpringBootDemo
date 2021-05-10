package com.hxy.controller;

import com.hxy.domain.Guest;
import com.hxy.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/guest")
public class GuestController {

    @Autowired
    private GuestService guestService;


    /**
     * 展示所有的嘉宾
     * @param model  用于存储查找到的嘉宾  展示到页面
     * @return list.html  用于返回页面
     */
    @GetMapping
    public String returnList(Model model){
        //全表通查
        List<Guest> guests=guestService.reList();
        model.addAttribute("guests",guests);
        return "list";
    }



    /**
     * 用于接受请求  展示添加页面
     * @return add.html
     */
    @GetMapping("/add")
    public String add(){
        return "add";
    }

    /**
     * 处理添加请求，将接受到的参数传给业务层，让业务层调用方法，将数据存入数据库
     * @param guest
     * @return 重定向到list.html
     */
    @PostMapping("/addGuest")
    public String addGuest(Guest guest){
        guest.setId(50000);
        guestService.addGuest(guest);
        return "redirect:/guest";
    }


    /**
     * 接受请求展示update.html
     * @param model  将参数传入model 展示到页面中
     * @param uname  接受名字，名字不可改，所以直接展示
     * @return update.html
     */
    @GetMapping("/update/{name}")
    public String update(Model model,@PathVariable("name") String uname){
        model.addAttribute("uname",uname);
        return "update";
    }

    /**
     * 接受请求，调用业务层的方法，来修改内容
     * @param guest
     * @return 重定向到list.html
     */
    @PutMapping("/updateGuest")
    public String updateGuest(Guest guest){
        guestService.updateGuest(guest);
        return "redirect:/guest";
    }

    @DeleteMapping("/{name}")
    public String delete( @PathVariable("name") String uname){
//        System.out.println(uname);
        guestService.deleteGuest(uname);
        return "redirect:/guest";
    }




}
