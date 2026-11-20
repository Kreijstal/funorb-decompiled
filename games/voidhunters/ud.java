/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud extends ContentTransitionDialog {
    static String field_R;

    ud(ModalStack param0, UiComponent param1) {
        super(param0, param1, 33, 20, 30);
    }

    public static void clearSharedReferences(boolean param0) {
        field_R = null;
        if (param0) {
          field_R = (String) null;
        }
    }

    final void transitionToContent(UiComponent param0, int param1) {
        try {
          super.transitionToContent(param0, -57);
          int var3_int = 47 % ((6 - param1) / 46);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ud.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}
