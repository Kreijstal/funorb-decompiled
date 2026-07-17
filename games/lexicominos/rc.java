/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc {
    int field_d;
    byte[] field_c;
    int field_e;
    int field_b;
    static sc field_a;
    int field_l;
    int field_h;
    int field_k;
    byte[] field_g;
    static int field_i;
    int field_j;
    static long field_f;

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_10_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_9_0 = 0;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = 0;
              if (param1 == 29532) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            var4 = rf.field_c;
            L2: while (true) {
              if (ee.field_g.length <= var3_int) {
                stackOut_16_0 = -1;
                stackIn_17_0 = stackOut_16_0;
                break L0;
              } else {
                L3: {
                  var5 = ni.field_a[var3_int];
                  if (var5 >= 0) {
                    var6 = ii.a(ee.field_g[var3_int], true, 0);
                    var4 = var4 + we.field_l;
                    var7 = -(var6 >> 1) + uh.field_D;
                    if (sj.a(param2, (oh.field_b << 1) + fb.field_g, var4, var6 + (jh.field_e << 1), param0, true, -jh.field_e + var7)) {
                      stackOut_9_0 = var5;
                      stackIn_10_0 = stackOut_9_0;
                      return stackIn_10_0;
                    } else {
                      var4 = var4 + (fb.field_g + (oh.field_b << 1) + we.field_l);
                      var3_int++;
                      break L3;
                    }
                  } else {
                    var4 = var4 + hc.field_fb;
                    var3_int++;
                    break L3;
                  }
                }
                var3_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var3, "rc.B(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_17_0;
    }

    public static void a(int param0) {
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new sc();
    }
}
