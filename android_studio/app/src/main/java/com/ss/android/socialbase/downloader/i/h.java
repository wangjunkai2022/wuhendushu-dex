package com.ss.android.socialbase.downloader.i;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class h<K, T> extends LinkedHashMap<K, T> {

    /* renamed from: a  reason: collision with root package name */
    public int f11948a;

    public h() {
        this(4, 4);
    }

    public void a(int i) {
        this.f11948a = i;
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<K, T> entry) {
        return size() > this.f11948a;
    }

    public h(int i, int i2) {
        this(i, i2, true);
    }

    public h(int i, int i2, boolean z) {
        super(i, 0.75f, z);
        a(i2);
    }
}
