package com.leyou.item.mapper;

import com.leyou.item.pojo.Brand;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

/**
 * < 描述 >
 * <  >
 *
 * @author Aki
 * @create 2018-11-13 15:53
 */
@org.apache.ibatis.annotations.Mapper
public interface BrandMapper extends Mapper<Brand> {

    /**
     * 新增商品分类和品牌中间表数据
     *
     * @param cid 商品分类id
     * @param bid 品牌id
     * @return
     */
    @Insert("INSERT INTO tb_category_brand (category_id, brand_id) VALUES (#{cid},#{bid})")
    void insertCategoryBrand(@Param("cid") Long cid, @Param("bid") Long bid);


    @Delete("DELETE FROM tb_category_brand WHERE brand_id= #{bid}")
    void deleteCategoryBrand(@Param("bid") Long id);
}