package com.apk;

import com.apk.ij;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.FileInputStream;
import java.io.IOException;

/* compiled from: ImageHeaderParserUtils.java */
/* loaded from: classes8.dex */
public class jj implements ij.Ctry {

    /* renamed from: do  reason: not valid java name */
    public final /* synthetic */ dk f2353do;

    /* renamed from: if  reason: not valid java name */
    public final /* synthetic */ nl f2354if;

    public jj(dk dkVar, nl nlVar) {
        this.f2353do = dkVar;
        this.f2354if = nlVar;
    }

    @Override // com.apk.ij.Ctry
    /* renamed from: do */
    public int mo1229do(ImageHeaderParser imageHeaderParser) throws IOException {
        oo ooVar;
        oo ooVar2 = null;
        try {
            ooVar = new oo(new FileInputStream(this.f2353do.mo193do().getFileDescriptor()), this.f2354if);
        } catch (Throwable th) {
            th = th;
        }
        try {
            int mo237do = imageHeaderParser.mo237do(ooVar, this.f2354if);
            try {
                ooVar.close();
            } catch (IOException unused) {
            }
            this.f2353do.mo193do();
            return mo237do;
        } catch (Throwable th2) {
            th = th2;
            ooVar2 = ooVar;
            if (ooVar2 != null) {
                try {
                    ooVar2.close();
                } catch (IOException unused2) {
                }
            }
            this.f2353do.mo193do();
            throw th;
        }
    }
}