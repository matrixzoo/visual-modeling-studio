package org.matrixzoo.bigdata.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    final private Logger LOG = LoggerFactory.getLogger(UserController.class);

    @PostMapping("login")
    public void login() {
        LOG.debug("login!");
    }
}
