package com.youlai.admin.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.youlai.admin.pojo.entity.SysDictItem;
import com.youlai.admin.pojo.form.DictItemForm;
import com.youlai.admin.pojo.query.DictItemPageQuery;
import com.youlai.admin.pojo.vo.dict.DictItemPageVO;


/**
 * 字典数据项业务实现类
 *
 * @author haoxr
 * @date 2022/6/9
 */
public interface SysDictItemService extends IService<SysDictItem> {

    /**
     * 字典数据项分页列表
     *
     * @param queryParams
     * @return
     */
    Page<DictItemPageVO> listPageDictItems(DictItemPageQuery queryParams);

    /**
     * 字典数据项表单详情
     *
     * @param id 字典数据项ID
     * @return
     */
    DictItemForm getDictItemFormDetail(Long id);

    /**
     * 新增字典数据项
     *
     * @param dictItemForm 字典数据项表单
     * @return
     */
    boolean saveDictItem(DictItemForm dictItemForm);

    /**
     * 修改字典数据项
     *
     * @param id 字典数据项ID
     * @param dictItemForm 字典数据项表单
     * @return
     */
    boolean updateDictItem(Long id, DictItemForm dictItemForm);

    /**
     * 删除字典数据项
     *
     * @param ids 字典数据项ID，多个以英文逗号(,)分割
     * @return
     */
    boolean deleteDictItems(String ids);
}
