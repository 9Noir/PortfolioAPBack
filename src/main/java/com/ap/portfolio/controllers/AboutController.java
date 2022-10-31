package com.ap.portfolio.controllers;

import com.ap.portfolio.entities.About;
import com.ap.portfolio.services.AboutService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/about")
public class AboutController extends BaseControllerImpl<About, AboutService> {
}
