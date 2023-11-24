package study.developia.redis.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import study.developia.redis.service.CacheService;

@RequiredArgsConstructor
@RestController
public class CacheController {
    private final CacheService cacheService;
    @GetMapping
    public void cache() {
        cacheService.setCache();
    }
}
