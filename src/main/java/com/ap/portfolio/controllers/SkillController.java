package com.ap.portfolio.controllers;


import com.ap.portfolio.entities.Skill;
import com.ap.portfolio.services.SkillService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/skill")
public class SkillController extends BaseControllerImpl<Skill, SkillService> {
}
