package butterknife;

import androidx.annotation.BoolRes;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes8.dex */
public @interface BindBool {
    @BoolRes
    int value();
}
