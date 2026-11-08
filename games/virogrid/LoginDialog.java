/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginDialog extends ContentTransitionDialog {
    static String field_sb;
    static AccountRequestReply field_ob;
    static String[] field_pb;
    static String[] field_rb;
    static String field_qb;

    public static void releaseStatics(boolean param0) {
        field_qb = null;
        field_ob = null;
        field_pb = null;
        field_sb = null;
        if (!param0) {
          field_rb = null;
          return;
        }
        field_sb = (String) null;
        field_rb = null;
    }

    final void transitionToContent(UiWidget param0, byte param1) {
        try {
          super.transitionToContent(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "de.S(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    LoginDialog(WidgetLayerStack param0, UiWidget param1) {
        super(param0, param1, 33, 20, 30);
    }

    static {
        field_qb = "Age:";
    }
}
