package co.develhope.firstapi4.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetSocketAddress;

@RestController
public class HeaderController {


@GetMapping("/headers")
    public String getHostHeaders (@RequestHeader HttpHeaders headers){
          InetSocketAddress host= headers.getHost();
          return host.getHostName() + host.getPort();
}













}
