package com.balon.clientshop.util

import android.icu.util.Calendar


/**
 * 日期时间工具类
 */
object MyDateUtil {

    /**
     * 获取当前年
     */
    fun currentYear(): Int{
        return Calendar.getInstance().get(Calendar.YEAR)
    }


}