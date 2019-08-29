package xyz.xufanchn.dto;

/**
 * 封装json结果
 *
 * @param <T>
 */
public class SeckillResult<T> {
    private boolean success;

    private T data;

    private String error;

    /**
     * 秒杀成功返回状态和信息
     *
     * @param success
     * @param data
     */
    public SeckillResult(boolean success, T data) {
        this.success = success;
        this.data = data;
    }

    /**
     * 秒杀失败返回状态和错误信息
     * @param success
     * @param error
     */
    public SeckillResult(boolean success, String error) {
        this.success = success;
        this.error = error;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
