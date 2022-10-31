package com.ap.portfolio.controllers;

import com.ap.portfolio.entities.Experience;
import com.ap.portfolio.services.ExperienceService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/experience")
public class ExperienceController extends BaseControllerImpl<Experience,ExperienceService>{
}