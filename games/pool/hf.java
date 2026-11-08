/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf {
    static int field_c;
    static long field_e;
    static String multiconstSimilarRating;
    static int[] field_d;
    static int field_a;

    final static void a(String[][] param0, String[] param1, byte param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = Pool.field_O;
        try {
          LoginPayload.field_e = param1;
          lb.field_P = param0;
          for (var3_int = 0; var3_int < lb.field_P.length; var3_int++) {
            for (var4 = 0; var4 < lb.field_P[var3_int].length; var4++) {
              if (lb.field_P[var3_int][var4] != null) {
                lb.field_P[var3_int][var4] = lb.field_P[var3_int][var4].toLowerCase();
              }
            }
          }
          if (param2 != -96) {
            multiconstSimilarRating = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "hf.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static int[] a(int param0, byte param1) {
        int var2;
        int var2Lifetime1;
        var2 = param0;
        if (var2 == -1) {
          return jc.field_i;
        }
        if (var2 == 0) {
          return LimitedRandomAccessFile.field_a;
        }
        if (1 == var2) {
          return dq.field_i;
        }
        if (var2 == 2) {
          return FontPaletteSupport.field_c;
        }
        var2Lifetime1 = -97 % ((14 - param1) / 35);
        return null;
    }

    public static void releaseStatics(int param0) {
        if (param0 != 0) {
          field_d = (int[]) null;
        }
        field_d = null;
        multiconstSimilarRating = null;
    }

    static {
        multiconstSimilarRating = "Similar rating";
        field_a = 4800;
    }
}
