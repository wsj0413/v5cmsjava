package cn.v5cn.v5cms.dao;

import cn.v5cn.v5cms.entity.Site;
import com.google.common.base.Optional;

/**
 * Created by ZYW on 2014/6/30.
 */
public interface SiteDao {
    Optional<Site> findSite();
}