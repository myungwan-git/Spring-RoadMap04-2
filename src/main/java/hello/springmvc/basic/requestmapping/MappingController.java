package hello.springmvc.basic.requestmapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MappingController {
  private Logger log = LoggerFactory.getLogger(getClass());

  @RequestMapping("/hello-basic")
  public String helloBasic() {
    log.info("hello Basic HI@@@");
    return "ok";
  }

  @GetMapping(value = "/mapping-get-v2")
  public String mappingGetV2() {
    log.info("getMapping ~~~");
    return "get OK";
  }

  @GetMapping("/mapping/{userId}")
  public String mappingPath(@PathVariable("userId") String data) {
    log.info("mapping path userId = {}", data);
    return "path OK";
  }
}
