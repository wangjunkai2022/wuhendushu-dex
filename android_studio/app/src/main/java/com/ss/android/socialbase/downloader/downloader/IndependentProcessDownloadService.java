package com.ss.android.socialbase.downloader.downloader;

import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public class IndependentProcessDownloadService extends DownloadService {
    @Override // com.ss.android.socialbase.downloader.downloader.DownloadService, android.app.Service
    public void onCreate() {
        super.onCreate();
        c.a(this);
        if (c.T() == null) {
            c.a(new v());
        }
        o z = c.z();
        this.f11853a = z;
        z.a(new WeakReference(this));
    }
}