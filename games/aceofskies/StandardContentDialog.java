/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StandardContentDialog extends ContentTransitionDialog {
    static boolean[] field_T;
    static String field_V;
    static int field_U;

    final void replaceContent(UiWidget param0, int param1) {
        try {
          super.replaceContent(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) runtimeException), "ad.CA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    StandardContentDialog(ModalDialogHost param0, UiWidget param1) {
        super(param0, param1, 33, 20, 30);
    }

    public static void resetStaticState(boolean param0) {
        if (param0) {
          field_U = -104;
          field_V = null;
          field_T = null;
          return;
        }
        field_V = null;
        field_T = null;
    }

    static {
        field_V = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_U = 200;
        field_T = new boolean[]{true, true, false, true, false};
    }
}
