.class public final enum Lcom/apk/rv;
.super Ljava/lang/Enum;
.source "PopupType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/apk/rv;",
        ">;"
    }
.end annotation


# static fields
.field public static final synthetic case:[Lcom/apk/rv;

.field public static final enum do:Lcom/apk/rv;

.field public static final enum for:Lcom/apk/rv;

.field public static final enum if:Lcom/apk/rv;

.field public static final enum new:Lcom/apk/rv;

.field public static final enum try:Lcom/apk/rv;


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lcom/apk/rv;

    const-string v1, "Center"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/apk/rv;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/apk/rv;->do:Lcom/apk/rv;

    .line 2
    new-instance v0, Lcom/apk/rv;

    const-string v1, "Bottom"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/apk/rv;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/apk/rv;->if:Lcom/apk/rv;

    .line 3
    new-instance v0, Lcom/apk/rv;

    const-string v1, "AttachView"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/apk/rv;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/apk/rv;->for:Lcom/apk/rv;

    .line 4
    new-instance v0, Lcom/apk/rv;

    const-string v1, "ImageViewer"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/apk/rv;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/apk/rv;->new:Lcom/apk/rv;

    .line 5
    new-instance v0, Lcom/apk/rv;

    const-string v1, "Position"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/apk/rv;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/apk/rv;->try:Lcom/apk/rv;

    const/4 v1, 0x5

    new-array v1, v1, [Lcom/apk/rv;

    .line 6
    sget-object v7, Lcom/apk/rv;->do:Lcom/apk/rv;

    aput-object v7, v1, v2

    sget-object v2, Lcom/apk/rv;->if:Lcom/apk/rv;

    aput-object v2, v1, v3

    sget-object v2, Lcom/apk/rv;->for:Lcom/apk/rv;

    aput-object v2, v1, v4

    sget-object v2, Lcom/apk/rv;->new:Lcom/apk/rv;

    aput-object v2, v1, v5

    aput-object v0, v1, v6

    sput-object v1, Lcom/apk/rv;->case:[Lcom/apk/rv;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/apk/rv;
    .locals 1

    .line 1
    const-class v0, Lcom/apk/rv;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/apk/rv;

    return-object p0
.end method

.method public static values()[Lcom/apk/rv;
    .locals 1

    .line 1
    sget-object v0, Lcom/apk/rv;->case:[Lcom/apk/rv;

    invoke-virtual {v0}, [Lcom/apk/rv;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/apk/rv;

    return-object v0
.end method
