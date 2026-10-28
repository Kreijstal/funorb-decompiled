/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginDialog extends ContentTransitionDialog {
    static int field_ob;
    static int field_pb;
    static PcmSample field_mb;
    static String field_lb;
    static int field_nb;

    LoginDialog(ModalStack param0, UiComponent param1) {
        super(param0, param1, 33, 20, 30);
    }

    final void transitionToContent(UiComponent content, int guard) {
        try {
          super.transitionToContent(content, guard);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "ng.D(" + (content != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    public static void releaseStatics(byte guard) {
        field_mb = null;
        field_lb = null;
        if (guard != 124) {
          LoginDialog.releaseStatics((byte) -12);
        }
    }

    static {
        field_ob = 0;
        field_lb = "Normal";
    }
}
