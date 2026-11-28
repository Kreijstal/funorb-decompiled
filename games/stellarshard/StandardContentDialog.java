/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StandardContentDialog extends ContentTransitionDialog {
    static ha field_fb;
    static Sprite[] field_hb;
    static PcmStreamMixer field_cb;
    static volatile int field_gb;
    static String field_eb;
    static ResourceArchive field_db;

    final void replaceContent(UiWidget param0, int param1) {
        try {
          super.replaceContent(param0, param1 ^ 0);
          if (param1 != 23143) {
            StandardContentDialog.clearDeclaredStaticReferences(21);
          }
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "pg.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    StandardContentDialog(ModalDialogHost param0, UiWidget param1) {
        super(param0, param1, 33, 20, 30);
    }

    public static void clearDeclaredStaticReferences(int param0) {
        field_hb = null;
        field_db = null;
        field_eb = null;
        field_fb = null;
        field_cb = null;
        if (param0 != 7694) {
          StandardContentDialog.clearDeclaredStaticReferences(-42);
        }
    }

    static {
        field_gb = -1;
        field_eb = "Unfortunately we are unable to create an account for you at this time.";
    }
}
