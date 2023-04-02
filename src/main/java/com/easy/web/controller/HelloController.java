package com.easy.web.controller;

import java.util.Locale;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String hello(Locale locale, Model model) {
		return "hello world";
	}
}
/*
Locale locale表示当前请求的本地化信息，包括语言、国家/地区等。
在处理国际化和本地化的Web应用程序时，
可以使用Locale locale参数获取用户的本地化信息，以便返回适当的内容和消息。

Model model用于向视图中传递数据。在处理Web请求时，控制器通常需要将数据传递给视图，以便在视图中显示。
为此，控制器可以使用Model model参数将数据添加到模型中，模型数据可以在视图中使用。

使用示例：
@GetMapping("/hello")
public String hello(Locale locale, Model model) {
    String greeting = getMessageBasedOnLocale(locale);
    model.addAttribute("greeting", greeting);
    return "hello";
}
*/