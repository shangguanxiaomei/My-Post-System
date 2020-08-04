package cognizant.projectdataservice.repository;

import cognizant.projectdataservice.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    Iterable<Comment> findByPostId(int postId);
}
