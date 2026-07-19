/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og {
    static String field_d;
    static int field_f;
    static String field_i;
    static int[][] field_j;
    static String field_k;
    static boolean field_b;
    static wb field_a;
    static int[] field_g;
    static String field_e;
    static int field_c;
    static String[] field_h;

    final static void a(byte param0) {
        if (param0 != -97) {
            return;
        }
        ph.field_h = null;
        uj.field_b = null;
        ig.field_H = null;
        sa.field_l = null;
        jc.field_c = (byte[][]) null;
        qf.field_d = null;
    }

    public static void a(int param0) {
        field_i = null;
        field_a = null;
        field_h = null;
        field_d = null;
        field_e = null;
        field_j = (int[][]) null;
        field_g = null;
        field_k = null;
        if (param0 <= 31) {
            og.a(18);
        }
    }

    static {
        $cfr$clinit: {
            int var0 = 0;
            int var1 = 0;
            int var2 = 0;
            field_f = 640;
            field_i = "Mega Power: <%0>";
            field_k = "No highscores";
            field_d = "Fullscreen";
            field_a = new wb(0);
            field_e = "FULL ACCESS";
            field_g = new int[256];
            var1 = 0;
            L0: while (true) {
              if ((var1 ^ -1) <= -257) {
                field_h = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
                break $cfr$clinit;
              } else {
                var0 = var1;
                var2 = 0;
                L1: while (true) {
                  if (-9 >= (var2 ^ -1)) {
                    field_g[var1] = var0;
                    var1++;
                    continue L0;
                  } else {
                    if ((1 & var0) == 1) {
                      var0 = var0 >>> -640092223 ^ -306674912;
                      var2++;
                      continue L1;
                    } else {
                      var0 = var0 >>> 1;
                      var2++;
                      continue L1;
                    }
                  }
                }
              }
            }
        }
    }
}
