package com.darsh.Joblistings.Controller;

import com.darsh.Joblistings.Model.Post;
import com.darsh.Joblistings.repository.PostRepo;
import com.darsh.Joblistings.repository.SearchRepo;
import io.swagger.v3.oas.annotations.Hidden;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
//import springfox.documentation.annotations.ApiIgnore;

import java.io.IOException;
import java.util.List;

@RestController
public class PostController {
    @Autowired
    PostRepo repo;

    @Autowired
    SearchRepo srepo;
//    @ApiIgnore
    @Hidden
    @RequestMapping(value="/")
        public void  redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }

    @GetMapping("/getposts")
    public List<Post> getallposts(){
        return repo.findAll();
    }
    @GetMapping("/getposts/{text}")
    public List<Post> Search(@PathVariable String text){
        return srepo.findByText(text);
    }

    @PostMapping("/post")
    public Post addpost(@RequestBody Post post){
        return repo.save(post);
    }

}
