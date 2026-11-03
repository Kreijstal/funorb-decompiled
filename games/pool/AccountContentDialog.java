/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountContentDialog extends ContentTransitionDialog {
    static int field_wb;
    static PoolMatchController field_ub;
    static int field_tb;
    static UiComponent field_vb;
    static UiComponent field_sb;

    AccountContentDialog(DialogLayer param0, UiWidget param1) {
        super(param0, param1, 33, 20, 30);
    }

    public static void releaseStatics(int param0) {
        field_sb = null;
        if (param0 > -19) {
          field_vb = (UiComponent) null;
          field_vb = null;
          field_ub = null;
          return;
        }
        field_vb = null;
        field_ub = null;
    }

    final void replaceContent(UiWidget param0, int param1) {
        try {
          super.replaceContent(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ba.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}
