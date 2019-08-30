package xyz.xufanchn.service;

import xyz.xufanchn.dto.Exposer;
import xyz.xufanchn.dto.SeckillExecution;
import xyz.xufanchn.entity.Seckill;
import xyz.xufanchn.exception.RepeatKillException;
import xyz.xufanchn.exception.SeckillCloseException;
import xyz.xufanchn.exception.SeckillException;

import java.util.List;

/**
 * 业务接口：
 * 方法定义粒度明确；参数直接简练；返回类型友好（Return 类型/异常）
 */
public interface SeckillService {
    /**
     * 查询所有秒杀记录
     *
     * @return
     */
    List<Seckill> getSeckillList();

    /**
     * 查询单个秒杀记录
     *
     * @param seckillId
     * @return
     */
    Seckill getById(long seckillId);

    /**
     * 秒杀开始时输出秒杀接口地址，
     * 否则输出系统时间和秒杀时间
     *
     * @param seckillId
     */
    Exposer exportSeckillUrl(long seckillId);

    /**
     * 执行秒杀操作
     *
     * @param seckillId
     * @param userPhone
     * @param md5
     */
    SeckillExecution executeSeckill(long seckillId, long userPhone, String md5)
            throws SeckillException, RepeatKillException, SeckillCloseException;

    /**
     * 执行秒杀操作 by 存储过程
     *
     * @param seckillId
     * @param userPhone
     * @param md5
     */
    SeckillExecution executeSeckillProcedure(long seckillId, long userPhone, String md5)
            throws SeckillException, RepeatKillException, SeckillCloseException;
}
