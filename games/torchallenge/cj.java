/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj {
    static long[] field_l;
    static boolean field_b;
    static int field_j;
    static ka field_c;
    static String field_k;
    static qe field_f;
    static long field_i;
    static boolean field_d;
    static String field_a;
    static int field_g;
    static fe[] field_h;
    static boolean field_e;

    final static void a(byte param0, java.applet.Applet param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        ed.field_d = true;
        var2 = "tuhstatbut";
        var3 = "rvnadlm";
        if (param0 <= 114) {
          field_g = 35;
          var4 = -1L;
          oh.a(var4, var3, param1, var2, 0);
          return;
        } else {
          var4 = -1L;
          oh.a(var4, var3, param1, var2, 0);
          return;
        }
    }

    final static int a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        var3 = TorChallenge.field_F ? 1 : 0;
        var1 = 0;
        if (param0 <= 79) {
          return -73;
        } else {
          var2 = 1;
          L0: while (true) {
            if (6 <= var2) {
              L1: {
                if (!bh.field_p) {
                  break L1;
                } else {
                  if (!aj.field_h) {
                    break L1;
                  } else {
                    pi.field_f = pi.field_f + 128;
                    var1 = 5;
                    ae.field_z = ae.field_z + 64;
                    break L1;
                  }
                }
              }
              return var1;
            } else {
              if (pa.field_s[ok.field_b][var2]) {
                var1 = var2;
                var2++;
                var2++;
                continue L0;
              } else {
                var2++;
                var2++;
                continue L0;
              }
            }
          }
        }
    }

    public static void b(int param0) {
        field_l = null;
        field_k = null;
        field_a = null;
        field_c = null;
        field_h = null;
        field_f = null;
        if (param0 != 0) {
            field_j = -32;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new long[32];
        field_b = false;
        field_j = 0;
        field_k = "Just play";
        field_a = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_i = 20000000L;
        field_h = new fe[13];
        field_e = true;
    }
}
