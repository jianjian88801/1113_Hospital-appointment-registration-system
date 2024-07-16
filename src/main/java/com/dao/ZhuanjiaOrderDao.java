package com.dao;

import com.entity.ZhuanjiaOrderEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuanjiaOrderView;

/**
 * 专家挂号订单 Dao 接口
 *
 * @author 
 */
public interface ZhuanjiaOrderDao extends BaseMapper<ZhuanjiaOrderEntity> {

   List<ZhuanjiaOrderView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
