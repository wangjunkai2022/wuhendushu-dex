.class public Lorg/junit/runner/notification/RunListener;
.super Ljava/lang/Object;
.source "RunListener.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public testAssumptionFailure(Lorg/junit/runner/notification/Failure;)V
    .locals 0
    .param p1, "failure"    # Lorg/junit/runner/notification/Failure;

    .prologue
    .line 87
    return-void
.end method

.method public testFailure(Lorg/junit/runner/notification/Failure;)V
    .locals 0
    .param p1, "failure"    # Lorg/junit/runner/notification/Failure;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 77
    return-void
.end method

.method public testFinished(Lorg/junit/runner/Description;)V
    .locals 0
    .param p1, "description"    # Lorg/junit/runner/Description;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 69
    return-void
.end method

.method public testIgnored(Lorg/junit/runner/Description;)V
    .locals 0
    .param p1, "description"    # Lorg/junit/runner/Description;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 96
    return-void
.end method

.method public testRunFinished(Lorg/junit/runner/Result;)V
    .locals 0
    .param p1, "result"    # Lorg/junit/runner/Result;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 52
    return-void
.end method

.method public testRunStarted(Lorg/junit/runner/Description;)V
    .locals 0
    .param p1, "description"    # Lorg/junit/runner/Description;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 44
    return-void
.end method

.method public testStarted(Lorg/junit/runner/Description;)V
    .locals 0
    .param p1, "description"    # Lorg/junit/runner/Description;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 61
    return-void
.end method
