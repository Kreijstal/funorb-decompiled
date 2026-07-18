/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm {
    static String field_c;
    static long field_b;
    static hj field_d;
    static int field_a;

    final static boolean a(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -2043140287) {
            break L0;
          } else {
            boolean discarded$2 = cm.a(-80);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == lk.field_h) {
              break L2;
            } else {
              if (!d.field_f.a(-1)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static int a(byte param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_6_0 = 0;
        var8 = HoldTheLine.field_D;
        try {
          L0: {
            var3_int = 0;
            var4 = ie.field_j;
            L1: while (true) {
              if (var3_int >= ii.field_b.length) {
                stackOut_10_0 = -1;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                L2: {
                  var5 = cd.field_f[var3_int];
                  if (var5 >= 0) {
                    var6 = h.a(ii.field_b[var3_int], (byte) -113, true);
                    var7 = -(var6 >> 1) + mk.field_i;
                    var4 = var4 + dc.field_bb;
                    if (!mo.a((vf.field_w << 1) + w.field_b, param2, var6 - -(pg.field_G << 1), param1, 27, -pg.field_G + var7, var4)) {
                      var4 = var4 + ((vf.field_w << 1) + dc.field_bb - -w.field_b);
                      break L2;
                    } else {
                      stackOut_6_0 = var5;
                      stackIn_7_0 = stackOut_6_0;
                      return stackIn_7_0;
                    }
                  } else {
                    var4 = var4 + hn.field_M;
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
          throw kk.a((Throwable) (Object) var3, "cm.C(" + 110 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_11_0;
    }

    public static void a(byte param0) {
        field_d = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Email (Login):";
    }
}
