package todo.todospring.controller;

import org.springframework.web.bind.annotation.*;
import todo.todospring.model.ListInfo;
import todo.todospring.model.WriteInfo;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping(value="todo/list",method = RequestMethod.GET)
    @ResponseBody
    public ListInfo list(ListInfo test){
        return test;
    }
    @RequestMapping(value="todo/write",method = RequestMethod.POST)
    @ResponseBody
    public WriteInfo write_list(WriteInfo test){
        return test;
    }
    @RequestMapping(value="todo/write/{num}",method = RequestMethod.GET)
    @ResponseBody
    public WriteInfo get_write(WriteInfo test){
        return test;
    }
    @RequestMapping(value="todo/write/{num}",method = RequestMethod.DELETE)
    @ResponseBody
    public WriteInfo delete_write(WriteInfo test){
        return test;
    }
}


