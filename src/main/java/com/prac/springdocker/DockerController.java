package com.prac.springdocker;

import lombok.Getter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName    : com.prac.springdocker
 * fileName       : DockerController
 * author         : MinKyu Park
 * date           : 2023-06-12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-12        MinKyu Park       최초 생성
 */
@RestController
public class DockerController {

  @GetMapping("/")
  public ResponseEntity<String> hello() {
    return ResponseEntity.ok("Hello-Docker Spring World");
  }
}
