package com.ap.portfolio.controllers;

import com.ap.portfolio.entities.User;
import com.ap.portfolio.services.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController extends BaseControllerImpl<User, UserService> {
}
