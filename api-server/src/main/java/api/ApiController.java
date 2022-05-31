package api;

import member.Member;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("")
    public String test() {
        Member member = new Member();
        member.setAge(10);
        member.setName("example name");
        return member.toString();
    }
}
