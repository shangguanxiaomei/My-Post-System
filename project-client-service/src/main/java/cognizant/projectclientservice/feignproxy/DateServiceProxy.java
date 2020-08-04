package cognizant.projectclientservice.feignproxy;


import cognizant.projectclientservice.domain.Comment;
import cognizant.projectclientservice.domain.Post;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "project-data-service")
public interface DateServiceProxy {

    @RequestMapping(value="/post",method= RequestMethod.GET)
    Iterable<Post> post();

    @RequestMapping("/comments/{id}")
    Iterable<Comment> comments(@PathVariable int id);

}
