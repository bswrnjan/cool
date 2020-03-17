package com.vmware.cool.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.vmware.cool.model.Input;
import com.vmware.cool.model.Output;

@RestController
@RequestMapping(path = "/api")
public class CalcController {

  @PostMapping(path = "/add")
  @ResponseBody
  public Output add(@RequestBody Input value) {
    int res = value.getX() + value.getY();
    Output output = new Output();
    output.setResult(res);
    return output;
  }

  @PostMapping(path = "/diff")
  @ResponseBody
  public Output diff(@RequestBody Input value) {
    int res = value.getX() - value.getY();
    Output output = new Output();
    output.setResult(res);
    return output;
  }

}
