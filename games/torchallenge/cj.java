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
        try {
            ed.field_d = true;
            var2 = "tuhstatbut";
            var3 = "rvnadlm";
            if (param0 <= 114) {
                field_g = 35;
            }
            var4 = -1L;
            oh.a(var4, var3, param1, var2, 0);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "cj.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_2_0 = 0;
        var3 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            if (param0 > 79) {
              var2 = 1;
              L1: while (true) {
                if (6 <= var2) {
                  L2: {
                    if (!bh.field_p) {
                      break L2;
                    } else {
                      if (!aj.field_h) {
                        break L2;
                      } else {
                        pi.field_f = pi.field_f + 128;
                        var1_int = 5;
                        ae.field_z = ae.field_z + 64;
                        break L2;
                      }
                    }
                  }
                  stackOut_16_0 = var1_int;
                  stackIn_17_0 = stackOut_16_0;
                  break L0;
                } else {
                  L3: {
                    if (pa.field_s[ok.field_b][var2]) {
                      var1_int = var2;
                      var2++;
                      break L3;
                    } else {
                      var2++;
                      break L3;
                    }
                  }
                  var2++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = -73;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var1, "cj.B(" + param0 + ')');
        }
        return stackIn_17_0;
    }

    public static void b(int param0) {
        field_l = null;
        field_k = null;
        field_a = null;
        field_c = null;
        field_h = null;
        field_f = null;
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
