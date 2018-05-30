package org.launchcode.controllers;

import org.launchcode.models.JobData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by LaunchCode
 */
@Controller
@RequestMapping("search")
public class SearchController {

    @RequestMapping(value = "")
    public String search(Model model) {
        model.addAttribute("columns", ListController.columnChoices);
        return "search";
    }

    // TODO #1 - Create handler to process search request and display results
    //
    // REFER TO CLASS 3 PREP WORK - CONTROLLERS AND ROUTES
    //
    // This method needs to take in two parameters, what are they?
    //  - search type
    //  - search term
    //
    // How do you pass the parameters properly using Spring?
    //  - maybe by using Thymeleaf

    @RequestMapping(value = "") 
    public string search(Model model) {

    }

}
