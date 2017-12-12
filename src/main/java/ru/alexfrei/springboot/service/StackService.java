package ru.alexfrei.springboot.service;


import org.springframework.stereotype.Service;
import ru.alexfrei.springboot.models.StackoverWebsite;

import java.util.ArrayList;
import java.util.List;

@Service
public class StackService {

    private static List<StackoverWebsite> items = new ArrayList<StackoverWebsite>();

    static {
        items.add(new StackoverWebsite("stackoverflow", "http://stack.com", "http://cdn.static.net/Sites/stackoverflow/img/favicon.ico", "for professional", "Holly shit"));
        items.add(new StackoverWebsite("stackoverflow", "http://stack.com", "http://cdn.static.net/Sites/stackoverflow/img/favicon.ico", "for professional", "Holly shit"));
        items.add(new StackoverWebsite("stackoverflow", "http://stack.com", "http://cdn.static.net/Sites/stackoverflow/img/favicon.ico", "for professional", "Holly shit"));
        items.add(new StackoverWebsite("stackoverflow", "http://stack.com", "http://cdn.static.net/Sites/stackoverflow/img/favicon.ico", "for professional", "Holly shit"));
        items.add(new StackoverWebsite("stackoverflow", "http://stack.com", "http://cdn.static.net/Sites/stackoverflow/img/favicon.ico", "for professional", "Holly shit"));
        items.add(new StackoverWebsite("stackoverflow", "http://stack.com", "http://cdn.static.net/Sites/stackoverflow/img/favicon.ico", "for professional", "Holly shit"));

    }

    public List<StackoverWebsite> findAll() {
        return items;
    }
}
