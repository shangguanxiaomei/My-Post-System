package cognizant.projectdataservice.controller;
import cognizant.projectdataservice.domain.Comment;
import cognizant.projectdataservice.domain.Post;
import cognizant.projectdataservice.service.CommentService;
import cognizant.projectdataservice.service.PostService;
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
public class UniqueControllerTest {

    @Mock
    private PostService postService;

    @Mock
    private CommentService commentService;

    @InjectMocks
    private UniqueController uniqueController;

    @Test
    public void testPost(){
        Iterable<Post> post = new ArrayList<>();
        given(postService.list()).willReturn(post);
        Iterable<Post> expectPosts = uniqueController.post();
        Assert.assertEquals(expectPosts, post);
    }

    @Test
    public void testComments() {
        Iterable<Comment> comment = new ArrayList<>();
        given(commentService.listBypostId(0)).willReturn(comment);
        Iterable<Comment> expectComments = uniqueController.comments(0);
        Assert.assertEquals(expectComments, comment);
    }
}
