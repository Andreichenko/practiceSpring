package ru.alexfrei.springboot.practice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.alexfrei.springboot.models.StackoverWebsite;
import ru.alexfrei.springboot.service.StackService;

import java.util.List;

@RestController
@RequestMapping("/stack")
public class StackController {


    private StackService stackService;

    @RequestMapping
    public List<StackoverWebsite> getListOverflow(){
        return stackService.findAll();
    }


}
