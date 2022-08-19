package CustomAnnotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @Author: Lulu
 * @Description: TODO
 * @DateTime: 2022/8/18 21:01
 **/
@Retention(RetentionPolicy.RUNTIME)
public @interface RetryCountIfFailed {
    int value() default 0;
}
