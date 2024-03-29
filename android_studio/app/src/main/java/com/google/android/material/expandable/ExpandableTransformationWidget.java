package com.google.android.material.expandable;

import androidx.annotation.IdRes;

/* loaded from: classes8.dex */
public interface ExpandableTransformationWidget extends ExpandableWidget {
    @IdRes
    int getExpandedComponentIdHint();

    void setExpandedComponentIdHint(@IdRes int i);
}
