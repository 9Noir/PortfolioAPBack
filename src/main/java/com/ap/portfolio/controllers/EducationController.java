package com.ap.portfolio.controllers;

import com.ap.portfolio.entities.Education;
import com.ap.portfolio.services.EducationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/education")
public class EducationController extends BaseControllerImpl<Education,EducationService>{
}
