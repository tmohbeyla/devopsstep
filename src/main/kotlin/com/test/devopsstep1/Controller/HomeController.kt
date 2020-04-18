package com.test.devopsstep1.Controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {

    @GetMapping("hello")
    fun helloworld():String{
        return "Bonjour AB futur devops"
    }
}