import com.demo.dto.*;
import com.demo.interfaces.*;
import com.demo.services.*;

public class Main {
    public static void main(String[] args) {

        Profile f1= new Profile("f1@gmail.com", "f1", "f1");
        Profile f2= new Profile("f2@gmail.com", "f2", "f2");

        PostService postService= new PostServiceImpl();
        TimelineService timelineService= new TimelineServiceImpl();
        FollowRequestService followRequestService= new FollowRequestServiceImpl();

        try {
            followRequestService.createFollowRequest(f1, f2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Follow Requests for f2: " +  followRequestService.fetchAllRequest(f2));

        followRequestService.acceptFollowRequest(followRequestService.fetchAllRequest(f2).get(0));
        System.out.println(followRequestService.fetchAllRequest(f2));
        System.out.println(f2.getFollowers());
        postService.createPost(f2, "first post");
        System.out.println( "Posts of f2: "  + f2.getPosts());
        System.out.println( "Timeline of f1: " +  timelineService.fetchTimeline(f1));



    }
}