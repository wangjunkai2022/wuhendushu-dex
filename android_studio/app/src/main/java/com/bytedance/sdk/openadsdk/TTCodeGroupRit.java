package com.bytedance.sdk.openadsdk;

/* loaded from: classes8.dex */
public interface TTCodeGroupRit {

    /* loaded from: classes8.dex */
    public interface TTCodeGroupRitListener {
        void onFail(int i, String str);

        void onSuccess(TTCodeGroupRit tTCodeGroupRit);
    }

    String getRit();

    int getSlotType();
}