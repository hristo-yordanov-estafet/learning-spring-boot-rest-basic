package example;

import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/batch")
public class RestController {


    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody Batch getBatch(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
        return new Batch(15488, Arrays.asList("CRM", "TLR"));
    }

}
