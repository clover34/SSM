package com.etc.delightstouring.mapper;

import com.etc.delightstouring.domain.Province;

import java.util.List;

/**
 * @interface ProvinceMapper
 * @Description TODO
 * @Author Administrator
 * @Date 20/10/26 18:50
 * @Version 1.0
 **/
public interface ProvinceMapper {
    /**
     * 增：新增一条省份信息
     * @param province
     * @return
     */
    int addProvince(Province province);

    /**
     * 删：根据编号删除省份信息
     * @param pid
     * @return
     */
    int delProvinceById(Integer pid);

    /**
     * 改：根据编号修改省份信息
     * @param province
     * @return
     */
    int updateProvinceById(Province province);

    /**
     * 查：查询表的总记录数
     * @return
     */
    int findRecordCount();

    /**
     * 查：根据名称查询省份信息
     * @param name
     * @return
     */
    Province findProvinceByName(String name);
    /**
     * 查：根据编号查询省份信息
     * @param pid
     * @return
     */
    Province findProvinceById(Integer pid);

    /**
     * 查：查询所有省份信息
     * @return
     */
    List<Province> findAllProvince();

}
