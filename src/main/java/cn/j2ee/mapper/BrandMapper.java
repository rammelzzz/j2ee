package cn.j2ee.mapper;

import cn.j2ee.entity.Brand;

import java.util.List;

/**
 * Created by rammel on 2017/12/4.
 */
public interface BrandMapper {


    /**
     * 添加一条咨询
     * @param brand
     */
    public void addBrand(Brand brand);

    /**
     * 列出所有的咨询
     * @return
     */
    public List<Brand> brandList();
}
