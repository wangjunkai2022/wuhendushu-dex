.class public Lbykvm_19do/bykvm_19do/bykvm_new1/bykvm_19do/bykvm_case1/c;
.super Ljava/lang/Object;
.source "Device.java"


# static fields
.field public static a:Z


# direct methods
.method public static a()Ljava/lang/String;
    .locals 1

    const-string v0, "ro.build.version.emui"

    .line 1
    invoke-static {v0}, Lbykvm_19do/bykvm_19do/bykvm_new1/bykvm_19do/bykvm_case1/c;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getprop "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    move-result-object p0

    .line 3
    new-instance v1, Ljava/io/BufferedReader;

    new-instance v2, Ljava/io/InputStreamReader;

    .line 4
    invoke-virtual {p0}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object p0

    invoke-direct {v2, p0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    const/16 p0, 0x400

    invoke-direct {v1, v2, p0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5
    :try_start_1
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 6
    :try_start_2
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 7
    invoke-static {v1}, Lbykvm_19do/bykvm_19do/bykvm_new1/bykvm_19do/bykvm_case1/f;->a(Ljava/io/Closeable;)V

    return-object p0

    :catchall_0
    move-object v0, p0

    goto :goto_0

    :catchall_1
    move-object v1, v0

    :catchall_2
    :goto_0
    invoke-static {v1}, Lbykvm_19do/bykvm_19do/bykvm_new1/bykvm_19do/bykvm_case1/f;->a(Ljava/io/Closeable;)V

    return-object v0
.end method

.method public static b()Z
    .locals 2

    .line 6
    sget-object v0, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    const-string v1, "Flyme"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Landroid/os/Build;->USER:Ljava/lang/String;

    const-string v1, "flyme"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public static b(Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lbykvm_19do/bykvm_19do/bykvm_new1/bykvm_19do/bykvm_case1/c;->a()Ljava/lang/String;

    move-result-object p0

    .line 3
    :cond_0
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 4
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "emotionui"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    return p0

    .line 5
    :cond_1
    invoke-static {}, Lbykvm_19do/bykvm_19do/bykvm_new1/bykvm_19do/bykvm_case1/c;->c()Z

    move-result p0

    return p0
.end method

.method public static c()Z
    .locals 4

    const/4 v0, 0x0

    .line 1
    :try_start_0
    sget-object v1, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v2, "huawei"

    if-nez v1, :cond_0

    :try_start_1
    sget-object v1, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 2
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 3
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 4
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_2

    :cond_1
    const/4 v0, 0x1

    :catchall_0
    :cond_2
    return v0
.end method

.method public static d()Z
    .locals 2

    .line 1
    sget-boolean v0, Lbykvm_19do/bykvm_19do/bykvm_new1/bykvm_19do/bykvm_case1/c;->a:Z

    if-nez v0, :cond_0

    const-string v0, "miui.os.Build"

    const/4 v1, 0x1

    .line 2
    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 3
    sput-boolean v1, Lbykvm_19do/bykvm_19do/bykvm_new1/bykvm_19do/bykvm_byte12b/b;->a:Z

    .line 4
    sput-boolean v1, Lbykvm_19do/bykvm_19do/bykvm_new1/bykvm_19do/bykvm_case1/c;->a:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    .line 5
    :catch_0
    sput-boolean v1, Lbykvm_19do/bykvm_19do/bykvm_new1/bykvm_19do/bykvm_case1/c;->a:Z

    .line 6
    :cond_0
    sget-boolean v0, Lbykvm_19do/bykvm_19do/bykvm_new1/bykvm_19do/bykvm_byte12b/b;->a:Z

    return v0
.end method
