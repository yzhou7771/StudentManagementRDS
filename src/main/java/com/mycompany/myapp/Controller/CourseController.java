package com.mycompany.myapp.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mycompany.myapp.service.UserService;

@RestController
@RequestMapping

public class CourseController {

    @Autowired  // IOC 控制反转
    UserService userService;

}
