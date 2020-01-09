/* Copyright (C) Alphalion Group, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * This file is part of pt-spring
 * Create by: jerrywang
 * Date:    2020-01-09
 * Time:    15:38
 */
package club.leopardtech.spring.core.minimal;


import club.leopardtech.spring.core.minimal.controller.HomeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Import;

@EnableAutoConfiguration
@SpringBootConfiguration
@Import(HomeController.class)
public class MinimalApplication {

    public static void main(String[] args) {
        SpringApplication.run(MinimalApplication.class);
    }
}
