package com.apk;

import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.manhua.data.bean.ComicBean;
import com.manhua.ui.activity.ComicDetailActivity;
import com.manhua.ui.fragment.ComicDetailDataFragment;

/* compiled from: ComicDetailDataFragment.java */
/* loaded from: classes8.dex */
public class m10 implements BaseQuickAdapter.OnItemClickListener {

    /* renamed from: do  reason: not valid java name */
    public final /* synthetic */ ComicDetailDataFragment f2973do;

    public m10(ComicDetailDataFragment comicDetailDataFragment) {
        this.f2973do = comicDetailDataFragment;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
    public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        try {
            ComicBean.SameUserBooksNameBean item = this.f2973do.f9897for.getItem(i);
            if (item != null) {
                ComicBean comicBean = new ComicBean();
                comicBean.setId(item.getId());
                comicBean.setName(item.getName());
                comicBean.setImg(item.getImg());
                comicBean.setLastChapter(item.getLastChapter());
                comicBean.setLastChapterId(item.getLastChapterId());
                ComicDetailActivity.n(this.f2973do.getSupportActivity(), comicBean);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
