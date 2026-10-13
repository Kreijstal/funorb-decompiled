/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh {
    static String field_a;
    static int[] field_f;
    static String field_c;
    static int canvasRefreshCounter;
    static String field_b;
    static int[][] field_e;

    public static void a(int param0) {
        field_c = null;
        if (param0 == 20043) {
          field_a = null;
          field_b = null;
          field_f = null;
          field_e = (int[][]) null;
          return;
        }
        String var2 = (String) null;
        uh.a(-68, true, (int[]) null, (int[]) null, (String) null, false, 51);
        field_a = null;
        field_b = null;
        field_f = null;
        field_e = (int[][]) null;
    }

    final static void a(int[] param0, int param1) {
        try {
          ProgressMessageDialog.field_lb = param0;
          int var2_int = 102 % ((69 - param1) / 54);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "uh.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, boolean param1, int[] param2, int[] param3, String param4, boolean param5, int param6) {
        try {
          NumericDateInputWidget.field_P.pixelWidth = SoftwareRaster.width;
          NumericDateInputWidget.field_P.pixelHeight = SoftwareRaster.height;
          NumericDateInputWidget.field_P.pixels = SoftwareRaster.pixels;
          DropTargetWidgetContainer.field_J.b();
          SoftwareRaster.b();
          MatchSetupPanel.a(-1, -1, param2, -1, param5, param3, -1, false, 0, false, 0, param4);
          NumericDateInputWidget.field_P.b();
          DropTargetWidgetContainer.field_J.g(param6, param0);
          if (!param1) {
            int[] var8 = (int[]) null;
            uh.a((int[]) null, -31);
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "uh.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_f = new int[8192];
        field_a = "Rated games are available to members only. To become a member, please visit the 'Account' section of the website.";
        canvasRefreshCounter = 500;
        field_c = "Score: <%0>";
        field_b = "Medium";
        field_e = new int[][]{new int[]{128, 144}, new int[]{80, 224}, new int[]{80, 224}, new int[]{224, 48}, new int[]{160, 80}, new int[]{96, 112}};
    }
}
