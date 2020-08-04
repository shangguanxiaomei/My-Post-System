package cognizant.projectdataservice.service;

import cognizant.projectdataservice.domain.Comment;
import cognizant.projectdataservice.domain.Post;
import cognizant.projectdataservice.repository.CommentRepository;
import cognizant.projectdataservice.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class DataLoader {

    private PostRepository postRepository;
    private CommentRepository commentRepository;

    @Autowired
    public DataLoader(PostRepository postRepository, CommentRepository commentRepository){
        this.postRepository = postRepository;
        this.commentRepository = commentRepository;
    }

    @PostConstruct
    private void loadData(){
        String text0 = "Mario (Japanese: マリオ, Hepburn: Mario, pronounced [maɾi.o]; English: /ˈmɑːrioʊ, " +
                "ˈmær-/, Italian: [ˈmaːrjo]) is a fictional character in the Mario video game franchise, " +
                "owned by Nintendo and created by Japanese video game designer Shigeru Miyamoto. Acting as " +
                "the company's mascot, as well as being the eponymous protagonist of the series, Mario has " +
                "appeared in over 200 video games since his creation. Depicted as a short, pudgy, Italian " +
                "plumber who resides in the Mushroom Kingdom, his adventures generally center upon rescuing " +
                "Princess Peach from the Koopa villain Bowser. His fraternal twin brother and sidekick is Luigi.";
        Post post0 = new Post();
        post0.setUser("Princess Peach");
        post0.setTitle("Nintendo Mario");
        post0.setLink("https://upload.wikimedia.org/wikipedia/en/a/a9/MarioNSMBUDeluxe.png");
        post0.setLikeCount(15);
        post0.setCommentCount(13);
        post0.setDetail(text0);
        post0.setId(0L);
        postRepository.save(post0);

        String text1 = "New York City (NYC), often called the City of New York or simply New York (NY), " +
                "is the most populous city in the United States. With an estimated 2018 population of 8,398,748 " +
                "distributed over about 302.6 square miles (784 km2), New York is also the most densely " +
                "populated major city in the United States. Located at the southern tip of the U.S. " +
                "state of New York, the city is the center of the New York metropolitan area, the largest " +
                "metropolitan area in the world by urban landmass. With almost 20 million people in its " +
                "metropolitan statistical area and approximately 23 million in its combined statistical area, " +
                "it is one of the world's most populous megacities. New York City has been described as the " +
                "cultural, financial, and media capital of the world, significantly influencing commerce, " +
                "entertainment, research, technology, education, politics, tourism, art, fashion, and sports. " +
                "Home to the headquarters of the United Nations, New York is an important center for " +
                "international diplomacy.";
        Post post1 = new Post();
        post1.setUser("USA");
        post1.setTitle("New York City");
        post1.setLink("https://upload.wikimedia.org/wikipedia/commons/f/f7/Lower_Manhattan_skyline_-_June_2017.jpg");
        post1.setLikeCount(5);
        post1.setCommentCount(2);
        post1.setDetail(text1);
        post1.setId(1L);
        postRepository.save(post1);

        Comment comment0 = new Comment();
        comment0.setId(0L);
        comment0.setPostId(0);
        comment0.setName("User1");
        comment0.setDetail("I Love Mario!");
        commentRepository.save(comment0);

        Comment comment1 = new Comment();
        comment1.setId(1L);
        comment1.setPostId(0);
        comment1.setName("User2");
        comment1.setDetail("Okey Dokey!");
        commentRepository.save(comment1);

        Comment comment2 = new Comment();
        comment2.setId(2L);
        comment2.setPostId(0);
        comment2.setName("User3");
        comment2.setDetail("My Favorite!");
        commentRepository.save(comment2);

        Comment comment3 = new Comment();
        comment3.setId(3L);
        comment3.setPostId(0);
        comment3.setName("User4");
        comment3.setDetail("Mario was first seen in the video game Donkey Kong," +
                " but he was called \"Jumpman.\" He was also a carpenter then, not a plumber.");
        commentRepository.save(comment3);

        Comment comment4 = new Comment();
        comment4.setId(4L);
        comment4.setPostId(0);
        comment4.setName("User5");
        comment4.setDetail("Mario was named after Mario Segale, the landlord of Nintendo of " +
                "America's office, who barged in on a company meeting demanding an overdue rent.");
        commentRepository.save(comment4);

        Comment comment5 = new Comment();
        comment5.setId(5L);
        comment5.setPostId(0);
        comment5.setName("User6");
        comment5.setDetail("Shigeru Miyamoto drew Mario as wearing a cap because he found drawing hair" +
                " difficult. He also drew in the moustache, because it was easier to see " +
                "than a mouth in the crude video game screen resolution back then.");
        commentRepository.save(comment5);

        Comment comment6 = new Comment();
        comment6.setId(6L);
        comment6.setPostId(0);
        comment6.setName("User7");
        comment6.setDetail("Mario and his younger brother Luigi are known as the \"Mario Brothers.\" This" +
                " means that Mario's last name is also Mario, so his full name is Mario Mario.");
        commentRepository.save(comment6);

        Comment comment7 = new Comment();
        comment7.setId(7L);
        comment7.setPostId(0);
        comment7.setName("User8");
        comment7.setDetail("Mario is voice-acted by Charles Martinet, who crashed" +
                " the audition for \"an Italian plumber from Brooklyn\" character.");
        commentRepository.save(comment7);

        Comment comment8 = new Comment();
        comment8.setId(8L);
        comment8.setPostId(0);
        comment8.setName("User9");
        comment8.setDetail("Mario's nemesis is Wario (a combination of \"warui\", the Japanese word" +
                " for bad, and Mario). Similarly, Luigi's rival is Waluigi. Both" +
                " are also voiced by Charles Martinet");
        commentRepository.save(comment8);

        Comment comment9 = new Comment();
        comment9.setId(9L);
        comment9.setPostId(0);
        comment9.setName("User10");
        comment9.setDetail("Mario has appeared in over 200 video games so far, has sold over 193 million" +
                " units of games (all of the Mario series) and even has his own TV cartoon show. " +
                "Super Mario Bros. 3 alone grossed over $500 million in USA.");
        commentRepository.save(comment9);

        Comment comment10 = new Comment();
        comment10.setId(10L);
        comment10.setPostId(0);
        comment10.setName("User11");
        comment10.setDetail("TV Schmeve, you're nothing till there's an opera done " +
                "on you. In 2003, Jonathan Mann of California Institute of Arts created The Mario Opera.");
        commentRepository.save(comment10);

        Comment comment11 = new Comment();
        comment11.setId(11L);
        comment11.setPostId(0);
        comment11.setName("User12");
        comment11.setDetail("Super Mario Bros. theme music, written by Koji Kondo, is known worldwide. It has" +
                " inspired countless fan-renditions, including one played by Zack Kim on two guitars" +
                "(viewed over 4 million times on YouTube!), played by Jean Baudin on 11 string bass, " +
                "beatboxed by Greg Patillo on the flute, and played by the Oregon Pro Arte Chamber" +
                " Orchestra on the trombones");
        commentRepository.save(comment11);

        Comment comment12 = new Comment();
        comment12.setId(12L);
        comment12.setPostId(0);
        comment12.setName("User13");
        comment12.setDetail("Mario is the most famous character in the history of video games, and " +
                "perhaps is the most famous character ever. In a 1990 poll by Marketing Evaluations, " +
                "Mario was found to be more popular (and recognizable) among children than Mickey Mouse.");
        commentRepository.save(comment12);

        Comment comment13 = new Comment();
        comment13.setId(13L);
        comment13.setPostId(1);
        comment13.setName("Statue of Liberty");
        comment13.setDetail("I love new york");
        commentRepository.save(comment13);

        Comment comment14 = new Comment();
        comment14.setId(14L);
        comment14.setPostId(1);
        comment14.setName("Joey");
        comment14.setDetail("How You Doin\\'..?");
        commentRepository.save(comment14);

    }
}
