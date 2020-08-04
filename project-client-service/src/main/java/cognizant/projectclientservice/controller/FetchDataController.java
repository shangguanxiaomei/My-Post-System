package cognizant.projectclientservice.controller;


import cognizant.projectclientservice.domain.Comment;
import cognizant.projectclientservice.domain.Post;

import cognizant.projectclientservice.feignproxy.DateServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FetchDataController {

    private DateServiceProxy dateServiceProxy;

    @Autowired
    FetchDataController(DateServiceProxy dateServiceProxy){
        this.dateServiceProxy = dateServiceProxy;
    }

    @RequestMapping("/post")
    public Iterable<Post> post(){
        return dateServiceProxy.post();
    }

    @RequestMapping("/comments/{id}")
    public Iterable<Comment> comments(@PathVariable int id){
        return dateServiceProxy.comments(id);
    }

}
