package com.se.bb.system.api.user.feign;

import com.se.bb.system.api.user.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(name = "se-bb-system")
public interface UserFeignClient {
  @RequestMapping(value = "/user/getById/{id}", method = RequestMethod.GET)
  public User findById(@PathVariable("id") Long id);
}
