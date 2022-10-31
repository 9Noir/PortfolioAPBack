package com.ap.portfolio.controllers;

import com.ap.portfolio.entities.Project;
import com.ap.portfolio.services.ProjectService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/project")
public class ProjectController extends BaseControllerImpl<Project,ProjectService>{ }
