package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/batches")
public class RestController {


    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody List<Batch> getBatch() {
    	List<Batch> list = new ArrayList<Batch>(2);
    	list.add(new Batch(15488, Arrays.asList("CRM", "TLR")));
    	list.add(new Batch(15489, Arrays.asList("FUN", "EIP")));
        return list;
    }

}
