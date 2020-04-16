package com.zhihu.matisse.listener;

import java.util.List;

/**
 * @author guoyuan on 2020/4/16.
 * yuan.guo@shijue.me
 */
public interface OnApplyListener {
    /**
     * @param selectedPath 选中图片地址
     * @param onApplyCallback 点击确定回调
     */
    void onApplyListener(List<String> selectedPath, OnApplyCallback onApplyCallback);
}
