package hello.springmvc.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Controller로 진행을 하면 뷰 이름이 반환 (뷰 리졸브) RestController로 하게 되면 return 했을 때 문자 그대로 한다.
public class LogTestController {
    private final Logger log = LoggerFactory.getLogger(LogTestController.class); // getClass() 도 가능

    @RequestMapping("/log-test")
    public String logTest(){
        String name = "Spring";
        System.out.println("name = " + name);


        log.trace("trace log = {}" ,name);
        log.debug("debug log ={}", name);// 현재 로그는 디버그 할때 보는거다
        log.info("info log = {}", name); // 중요한 정보야
        log.warn("warn log = {}", name); // 위험한거야
        log.error("error log={}",name); // 이건 에러야

        return "ok";

    }
}
