package study.developia.redis.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CacheService {
    private final RedisTemplate redisTemplate;
    public void setCache() {
        redisTemplate.opsForValue().append("hello", "world");
    }
}
