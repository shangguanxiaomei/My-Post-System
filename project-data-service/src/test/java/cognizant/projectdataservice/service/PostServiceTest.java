package cognizant.projectdataservice.service;
import cognizant.projectdataservice.domain.Post;
import cognizant.projectdataservice.repository.PostRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.BDDMockito.given;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostServiceTest {

    @Mock
    private PostRepository postRepository;

    @InjectMocks
    private PostService postService;

    @Test
    public void testComments() {
        List<Post> post = new ArrayList<>();
        given(postRepository.findAll()).willReturn(post);
        Iterable<Post> expectPosts = postService.list();
        Assert.assertEquals(expectPosts, post);
    }
}
