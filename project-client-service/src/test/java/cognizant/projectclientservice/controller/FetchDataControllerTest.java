package cognizant.projectclientservice.controller;
import cognizant.projectclientservice.domain.Comment;
import cognizant.projectclientservice.domain.Post;
import cognizant.projectclientservice.feignproxy.DateServiceProxy;
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
public class FetchDataControllerTest {

    @Mock
    private DateServiceProxy dateServiceProxy;

    @InjectMocks
    private FetchDataController fetchDataController;

    @Test
    public void testPost(){
        Iterable<Post> post = new ArrayList<Post>();
        given(dateServiceProxy.post()).willReturn(post);
        Iterable<Post> expectPosts = fetchDataController.post();
        Assert.assertEquals(expectPosts, post);
    }

    @Test
    public void testComments() {
        Iterable<Comment> comment = new ArrayList<Comment>();
        given(dateServiceProxy.comments(0)).willReturn(comment);
        Iterable<Comment> expectComments = fetchDataController.comments(0);
        Assert.assertEquals(expectComments, comment);
    }
}
