package cognizant.projectdataservice.service;

import cognizant.projectdataservice.domain.Comment;
import cognizant.projectdataservice.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    private CommentRepository commentRepository;

    @Autowired
    public CommentService(CommentRepository commentRepository){
        this.commentRepository = commentRepository;
    }

    public Iterable<Comment> listBypostId(int id) {
        return commentRepository.findByPostId(id);
    }
}
