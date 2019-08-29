package xyz.xufanchn.dto;

import xyz.xufanchn.entity.SuccessKilled;
import xyz.xufanchn.enums.SeckillStateEnum;

/**
 * 封装秒杀执行后的结果
 */
public class SeckillExecution {

    private long seckillId;

    //秒杀执行结果状态
    private int state;

    //状态表示信息
    private String stateInfo;

    //秒杀成功对象
    private SuccessKilled successKilled;

    /**
     * 秒杀成功返回所有信息
     *
     * @param seckillId
     * @param stateEnum
     * @param successKilled
     */
    public SeckillExecution(long seckillId, SeckillStateEnum stateEnum, SuccessKilled successKilled) {
        this.seckillId = seckillId;
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getInfo();
        this.successKilled = successKilled;
    }

    /**
     * 秒杀失败
     *
     * @param seckillId
     * @param stateEnum
     */
    public SeckillExecution(long seckillId, SeckillStateEnum stateEnum) {
        this.seckillId = seckillId;
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getInfo();
    }

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public SuccessKilled getSuccessKilled() {
        return successKilled;
    }

    public void setSuccessKilled(SuccessKilled successKilled) {
        this.successKilled = successKilled;
    }
}
