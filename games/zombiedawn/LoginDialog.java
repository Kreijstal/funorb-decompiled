/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class LoginDialog extends ContentTransitionDialog {
    static AudioOutput field_fb;
    static Vector field_eb;

    final void transitionToContent(int param0, UiWidget param1) {
        try {
          super.transitionToContent(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "cf.DB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_eb = null;
        if (param0 != 18072) {
          field_fb = (AudioOutput) null;
          field_fb = null;
          return;
        }
        field_fb = null;
    }

    LoginDialog(DialogLayer param0, UiWidget param1) {
        super(param0, param1, 33, 20, 30);
    }

    static {
    }
}
