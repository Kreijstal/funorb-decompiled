/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub {
    static String field_f;
    static String field_e;
    static int[] field_d;
    static String field_b;
    static int field_a;
    static String field_c;

    final static int a(int param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_8_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_7_0 = 0;
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var4 = fc.field_a;
            L1: while (true) {
              if (rk.field_P.length <= var3_int) {
                stackOut_17_0 = -1;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              } else {
                L2: {
                  var5 = k.field_g[var3_int];
                  if (var5 >= 0) {
                    var6 = si.a(false, rk.field_P[var3_int], true);
                    var7 = qk.field_d - (var6 >> 1);
                    var4 = var4 + qk.field_m;
                    if (gi.a(17, param2, param0, var6 + (mb.field_c << 1), var4, (pa.field_Y << 1) + cc.field_a, var7 - mb.field_c)) {
                      stackOut_7_0 = var5;
                      stackIn_8_0 = stackOut_7_0;
                      return stackIn_8_0;
                    } else {
                      var4 = var4 + (qk.field_m + ((pa.field_Y << 1) - -cc.field_a));
                      var3_int++;
                      break L2;
                    }
                  } else {
                    var4 = var4 + ke.field_d;
                    var3_int++;
                    break L2;
                  }
                }
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var3, "ub.C(" + param0 + 44 + -81 + 44 + param2 + 41);
        }
        return stackIn_18_0;
    }

    final static void a() {
        if (jh.field_h) {
            hk.d(hk.field_c, hk.field_h, hk.field_g + -hk.field_c, hk.field_b - hk.field_h);
            ie.field_c.a(1141039778, false);
            return;
        }
    }

    final static sb a(int param0, int param1, int param2, int param3) {
        sb var4 = new sb();
        var4.field_q = new int[1];
        var4.field_r = 0;
        ef.field_S.a((bh) (Object) var4, 2777);
        oi.a(-102, 5, var4);
        return var4;
    }

    public static void b() {
        field_f = null;
        field_e = null;
        field_c = null;
        field_d = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_e = "Player";
        field_d = new int[36];
        field_a = 0;
        field_b = "Ready...";
    }
}
