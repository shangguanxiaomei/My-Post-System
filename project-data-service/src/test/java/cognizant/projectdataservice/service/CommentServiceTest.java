package cognizant.projectdataservice.service;

import cognizant.projectdataservice.domain.Comment;
import cognizant.projectdataservice.repository.CommentRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.ArrayList;
import static org.mockito.BDDMockito.given;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommentServiceTest {

    @Mock
    private CommentRepository commentRepository;

    @InjectMocks
    private CommentService commentService;

    @Test
    public void testComments() {
        Iterable<Comment> comment = new ArrayList<>();
        given(commentRepository.findByPostId(0)).willReturn(comment);
        Iterable<Comment> expectComments = commentService.listBypostId(0);
        Assert.assertEquals(expectComments, comment);
    }
}
