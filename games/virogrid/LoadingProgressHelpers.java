/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoadingProgressHelpers {
    static byte[][] field_b;
    static volatile int field_a;
    static String textRankingsBywinpercentage;
    static String field_c;

    final static void showLoadingProgress(float param0, boolean param1, boolean param2, String param3) {
        try {
          if (null == IntKeyLookup.field_i) {
            IntKeyLookup.field_i = new LoadingProgressDialog(QueuedListRequest.field_l, ValidatedTextWidget.field_X);
            QueuedListRequest.field_l.pushLayer(0, IntKeyLookup.field_i);
          }
          IntKeyLookup.field_i.setProgress(param0, false, param2, param3);
          Rasterizer.clear();
          PasswordConfirmationValidator.drawDialogStack(param1, -127);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "sm.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != -1) {
          return;
        }
        textRankingsBywinpercentage = null;
        field_b = (byte[][]) null;
        field_c = null;
    }

    static {
        field_b = new byte[250][];
        textRankingsBywinpercentage = "By win %";
        field_a = -1;
        field_c = "Match by...";
    }
}
