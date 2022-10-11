package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
        return ("<form>Name: <input type ='text'</form><br>" +
                "<label for = 'favorite'>My favorite language is: </label><select name='favorite'> <option value='javascript'>JavaScript</option> <option value='java'>Java</option><option value='python'>Python</option></select><br>" +
                "<label for = 'second-favorite'>My second favorite language is: </label><select name='second-favorite'> <option value='javascript'>JavaScript</option> <option value='java'>Java</option><option value='python'>Python</option></select><br>") +
                "<label for = 'third-favorite'>My third favorite language is: </label><select name='third-favorite'> <option value='javascript'>JavaScript</option> <option value='java'>Java</option><option value='python'>Python</option></select><br>";
    }
}
