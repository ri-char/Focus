package com.ihewro.focus.callback;

import com.ihewro.focus.bean.FeedItem;

import java.util.List;

/**
 * <pre>
 *     author : hewro
 *     e-mail : ihewro@163.com
 *     time   : 2019/04/08
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public interface RequestFeedItemListCallback {
    public void onFinish(List<FeedItem> feedList);
}