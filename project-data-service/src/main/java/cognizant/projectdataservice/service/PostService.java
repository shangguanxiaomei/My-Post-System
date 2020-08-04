package cognizant.projectdataservice.service;

import cognizant.projectdataservice.domain.Post;
import cognizant.projectdataservice.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    private PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository){
        this.postRepository = postRepository;
    }

    public Iterable<Post> list() {
        return postRepository.findAll();
    }
}
