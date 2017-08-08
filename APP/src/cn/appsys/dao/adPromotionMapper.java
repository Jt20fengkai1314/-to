package cn.appsys.dao;

import cn.appsys.pojo.adPromotion;

public abstract interface adPromotionMapper
{
  public abstract int deleteByPrimaryKey(Long paramLong);
  
  public abstract int insert(adPromotion paramadPromotion);
  
  public abstract int insertSelective(adPromotion paramadPromotion);
  
  public abstract adPromotion selectByPrimaryKey(Long paramLong);
  
  public abstract int updateByPrimaryKeySelective(adPromotion paramadPromotion);
  
  public abstract int updateByPrimaryKey(adPromotion paramadPromotion);
}


/* Location:           D:\java\
 * Qualified Name:     cn.appsys.dao.adPromotionMapper
 * JD-Core Version:    0.7.0.1
 */