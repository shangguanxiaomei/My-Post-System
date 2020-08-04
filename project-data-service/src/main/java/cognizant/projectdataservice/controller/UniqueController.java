package cognizant.projectdataservice.controller;

import cognizant.projectdataservice.domain.Comment;
import cognizant.projectdataservice.domain.Post;
import cognizant.projectdataservice.service.CommentService;
import cognizant.projectdataservice.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UniqueController {

    private PostService postService;
    private CommentService commentService;

    @Autowired
    public UniqueController(PostService postService, CommentService commentService){
        this.postService = postService;
        this.commentService = commentService;
    }

    @RequestMapping("/post")
    public Iterable<Post> post(){
        return postService.list();
    }

    @RequestMapping("/comments/{id}")
    public Iterable<Comment> comments(@PathVariable int id){
        return commentService.listBypostId(id);
    }

}
