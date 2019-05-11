package com.taotao.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author WANGZHAO
 */
@RequestMapping("page")
@Controller
public class PageController {

    /**
     * 公用的跳转页面方法
     * @param pageName 前端传入的页面名称
     * @return pageName
     */
    @RequestMapping("{pageName}")
    public String toPage(@PathVariable("pageName") String pageName) {
        return pageName;
    }
}
