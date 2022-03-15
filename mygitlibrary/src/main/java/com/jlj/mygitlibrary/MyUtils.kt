package com.jlj.mygitlibrary

import android.content.Context
import android.widget.Toast

/**
 *
 * @Description: java类作用描述
 * @Author: Mark Guo
 * @CreateDate: 2022/3/15 14:48
 * @UpdateUser:
 * @UpdateDate: 2022/3/15 14:48
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
object MyUtils {
    
    fun showToast(context: Context){
        Toast.makeText(context, "asd", Toast.LENGTH_SHORT).show()
    }
    
}