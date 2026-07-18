/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab {
    static fi field_b;
    static int field_a;

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_6_0 = 0;
        var8 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var4 = uh.field_c;
            L1: while (true) {
              if (var3_int >= dl.field_c.length) {
                stackOut_11_0 = -1;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                L2: {
                  var5 = la.field_T[var3_int];
                  if (var5 < 0) {
                    var4 = var4 + wm.field_bb;
                    break L2;
                  } else {
                    var6 = cl.a(-3, dl.field_c[var3_int], true);
                    var4 = var4 + kb.field_b;
                    var7 = ef.field_vb - (var6 >> 1);
                    if (qd.a(param1, var4, (jd.field_g << 1) + var6, param2, true, -jd.field_g + var7, (n.field_d << 1) + af.field_Z)) {
                      stackOut_6_0 = var5;
                      stackIn_7_0 = stackOut_6_0;
                      return stackIn_7_0;
                    } else {
                      var4 = var4 + (kb.field_b + (n.field_d << 1) + af.field_Z);
                      break L2;
                    }
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
          throw sd.a((Throwable) (Object) var3, "ab.B(" + 0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_12_0;
    }

    final static void b(byte param0) {
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var5 = vb.field_e;
            var1 = var5;
            var2 = 0;
            var3 = var5.length;
            L1: while (true) {
              if (var3 <= var2) {
                break L0;
              } else {
                int incrementValue$40 = var2;
                var2++;
                var5[incrementValue$40] = 0;
                int incrementValue$41 = var2;
                var2++;
                var5[incrementValue$41] = 0;
                int incrementValue$42 = var2;
                var2++;
                var5[incrementValue$42] = 0;
                int incrementValue$43 = var2;
                var2++;
                var5[incrementValue$43] = 0;
                int incrementValue$44 = var2;
                var2++;
                var5[incrementValue$44] = 0;
                int incrementValue$45 = var2;
                var2++;
                var5[incrementValue$45] = 0;
                int incrementValue$46 = var2;
                var2++;
                var5[incrementValue$46] = 0;
                int incrementValue$47 = var2;
                var2++;
                var5[incrementValue$47] = 0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var1_ref, "ab.A(" + 110 + ')');
        }
    }

    final static void a(int param0) {
        cb.field_a.a(gj.field_d, 100, fa.field_S * 48 >> 7);
        if (param0 != 2026) {
            field_b = null;
        }
    }

    public static void a(byte param0) {
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_b = new fi();
    }
}
