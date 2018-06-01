package org.launchcode.controllers;

import org.launchcode.models.JobData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by LaunchCode
 */
@Controller
@RequestMapping("search")
    //this request mapping means that all request mappings under this controller will be at [site]/search/[page].
    //example: localhost:8080/search/[directory]
public class SearchController {

    @RequestMapping(value = "")
    public String search(Model model) {
        model.addAttribute("columns", ListController.columnChoices);
        return "search";
    }

    // TODO #1 - Create handler to process search request and display results
    //
    // REFER TO CLASS 3 PREP WORK - CONTROLLERS AND ROUTES
    // Video 2 covers passing parameters.

    @RequestMapping(value="search")
    public String search(Model model, @RequestParam String paramType, @RequestParam String paramTerm) {
        model.addAttribute("columns", ListController.columnChoices);

        if (paramType.equals("all")) {
            ArrayList<HashMap<String, String>> jobs = JobData.findByValue(paramType);
            model.addAttribute("jobs", jobs);
            return "search";

        } else {
            ArrayList<HashMap<String, String>> jobs = JobData.findByColumnAndValue(paramType, paramTerm);
            model.addAttribute("jobs", jobs);
            return "search";
        }
    }

}
