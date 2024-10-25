package com.example.Crud.Controller;

import com.example.Crud.Model.Task;
import com.example.Crud.Repositary.TaskRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class TaskController {

    @Autowired
    private TaskRepositary taskRepositary;

    @GetMapping("/task")
    public String dummy(){
        System.out.println("hsdfdgdfg");
        return "Helloworld";
    }
    @PostMapping("/api/post")
    public  Task creattask(@RequestBody Task task){
        System.out.println(task);
        Task savetask= taskRepositary.save(task);
        System.out.println("Saved task: " + savetask);
        return savetask;
    }
    @GetMapping("product/Allproducts")
    public List<Task>getAllPoducts(){
        return taskRepositary.findAll();
    }

    @PutMapping("/api/update/{id}")

    public Task Updatetask(@PathVariable Long id,@RequestBody Task task){
        task.setId(id);
        System.out.println(task);
        return taskRepositary.save(task);

    }

    @DeleteMapping("/delete/{id}")
    public void Deletetask (@PathVariable Long id){
        taskRepositary.deleteById(id);
    }


//    public List<String> creat(){
//        List<String> user=new ArrayList<>();
//        user.add("kirubesh");
//        user.add("thennarasu");
//        user.add("Sri");
//        user.add("Gowtham");
//        return user;
//    }

}


