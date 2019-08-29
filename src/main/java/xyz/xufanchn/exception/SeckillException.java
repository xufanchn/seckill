package xyz.xufanchn.exception;

import xyz.xufanchn.enums.SeckillStateEnum;

/**
 * 秒杀相关业务异常
 */
public class SeckillException extends RuntimeException {
    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }

    public SeckillException(Long seckillId, SeckillStateEnum repeatKill) {
    }
}
