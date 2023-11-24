package study.developia.redis.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Setter
@Getter
@Component
@ConfigurationProperties(prefix = "app.datasource.redis")
public class RedisSentinelProperty {
    private Sentinel sentinel;

    @Getter
    @Setter
    public static class Sentinel {
        private List<Node> nodes;
        private String password;
        private String master;

        @Getter
        @Setter
        public static class Node {
            private String host;
            private Integer port;
        }
    }
}
