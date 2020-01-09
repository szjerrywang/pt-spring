/* Copyright (C) Alphalion Group, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * This file is part of pt-spring
 * Create by: jerrywang
 * Date:    2020-01-09
 * Time:    15:44
 */
package club.leopardtech.spring.core.minimal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Hello, world!";
    }
}
