package xyz.xufanchn.dao;

import org.apache.ibatis.annotations.Param;
import xyz.xufanchn.entity.Seckill;

import java.util.Date;
import java.util.List;

/**
 * 秒杀数据访问
 */
public interface SeckillDao {

    /**
     * 根据id减库存
     *
     * @param seckillId
     * @param killTime
     * @return 如果影响行数>1，表示更新的记录行数
     */
    int reduceNumber(@Param("seckillId") long seckillId, @Param("killTime") Date killTime);

    /**
     * 根据id查询秒杀库存
     *
     * @param seckillId
     * @return
     */
    Seckill queryById(long seckillId);

    /**
     * 根据偏移量查询秒杀商品列表
     *
     * @param offet 偏移量
     * @param limit 偏移量后取值
     * @return
     */
    List<Seckill> queryAll(@Param("offet") int offet, @Param("limit") int limit);

}
