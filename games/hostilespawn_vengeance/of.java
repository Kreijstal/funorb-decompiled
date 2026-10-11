/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of {
    static bd[][] field_c;
    static String field_b;
    static re field_h;
    static int[] field_g;
    static nc field_e;
    static bd[] field_d;
    static int field_a;
    static int[][] field_f;

    final static int a(byte param0, int param1) {
        param1 = param1 & 8191;
        int var2 = -46 / ((-47 - param0) / 34);
        if (4096 > param1) {
          return param1 < 2048 ? vd.field_B[-param1 + 2048] : -vd.field_B[param1 - 2048];
        }
        return param1 < 6144 ? -vd.field_B[-param1 + 6144] : vd.field_B[-6144 + param1];
    }

    public static void a(boolean param0) {
        field_f = (int[][]) null;
        if (!param0) {
          of.a(true);
        }
        field_d = null;
        field_c = (bd[][]) null;
        field_e = null;
        field_b = null;
        field_g = null;
        field_h = null;
    }

    static {
        int var1 = 0;
        int var2 = 0;
        int var0;
        field_g = new int[256];
        field_b = "The direction towards your current objective. You can view your objectives on the pause console.";
        field_a = 0;
        field_d = null;
        for (var1 = 0; var1 < 256; var1++) {
          var0 = var1;
          for (var2 = 0; var2 < 8; var2++) {
            if ((var0 & 1) == 1) {
              var0 = var0 >>> 1 ^ -306674912;
            } else {
              var0 = var0 >>> 1;
            }
          }
          field_g[var1] = var0;
        }
    }
}
