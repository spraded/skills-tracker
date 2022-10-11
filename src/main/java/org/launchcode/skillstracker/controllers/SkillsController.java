package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String skills(){
        return ("<h1>Skills Tracker</h1>" +
                "<h2>Here are some skills you can learn!</h2>" +
                "<ol><li>JavaScript</li><li>Java</li><li>Python</li></ol>");
    }

    @GetMapping("form")
    @ResponseBody
    public String chooseSkills(){
        return ("<form method='post'> + " +
                "Name: <input type ='text' name = 'name'><br>" +
                "<br><label for = 'favorite'>My favorite language is: </label><select name='favorite'> <option value='javascript'>JavaScript</option> <option value='java'>Java</option><option value='python'>Python</option></select><br>" +
                "<label for = 'secondFavorite'>My second favorite language is: </label><select name='secondFavorite'> <option value='javascript'>JavaScript</option> <option value='java'>Java</option><option value='python'>Python</option></select><br>" +
                "<label for = 'thirdFavorite'>My third favorite language is: </label><select name='thirdFavorite'> <option value='javascript'>JavaScript</option> <option value='java'>Java</option><option value='python'>Python</option></select><br>" +
                "<input type = 'submit' value = 'Submit'/></form>");
    }

    @PostMapping(value="form")
    @ResponseBody
    public String skillsResults(@RequestParam String name, @RequestParam String favorite, @RequestParam String secondFavorite, @RequestParam String thirdFavorite){
        String html = "<h1>" + name + "</h1>"+
                "<ol>" +
                "<li>" + favorite + "</li>" +
                "<li>" + secondFavorite + "</li>" +
                "<li>" + thirdFavorite + "</li>" +
                "</ol>";
        return html;
    }
}
