package todo.todospring.todoController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import todo.todospring.todoModel.listInfo;
import todo.todospring.todoModel.writeInfo;

import java.time.LocalDate;

@Controller
public class todoController {
    @RequestMapping(value="todo/list",method = RequestMethod.GET)
    @ResponseBody
    public listInfo list(listInfo Test){
        return Test;
    }
    @RequestMapping(value="todo/write",method = RequestMethod.POST)
    @ResponseBody
    public writeInfo write_list(writeInfo Test){
        return Test;
    }
    @RequestMapping(value="todo/write/{num}",method = RequestMethod.GET)
    @ResponseBody
    public writeInfo get_write(writeInfo Test){
        return Test;
    }
    @RequestMapping(value="todo/write/{num}",method = RequestMethod.DELETE)
    @ResponseBody
    public writeInfo delete_write(writeInfo Test){
        return Test;
    }
}


