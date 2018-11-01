package test.handle;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * 基本配置文件
 */
@Data
@Configuration
public class BaseProperties {

    /**
     * 冒号后面可以加入默认项
     */
    @Value("${config:ddfdf}")
    private String config;

}
