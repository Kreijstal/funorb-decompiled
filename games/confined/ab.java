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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var3_int = param0;
            var4 = uh.field_c;
            L1: while (true) {
              if (var3_int >= dl.field_c.length) {
                stackIn_12_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L2: {
                  var5 = la.field_T[var3_int];
                  if (var5 < 0) {
                    var4 = var4 + wm.field_bb;
                    break L2;
                  } else {
                    var6 = cl.a(param0 ^ -3, dl.field_c[var3_int], true);
                    var4 = var4 + kb.field_b;
                    var7 = ef.field_vb - (var6 >> -1278915999);
                    if (qd.a(param1, var4, (jd.field_g << -673564831) + var6, param2, true, -jd.field_g + var7, (n.field_d << -60228671) + af.field_Z)) {
                      stackIn_7_0 = var5;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var4 = var4 + (kb.field_b + (n.field_d << 208100289) + af.field_Z);
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
          throw sd.a((Throwable) ((Object) var3), "ab.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return stackIn_12_0;
        }
    }

    final static void b(byte param0) {
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var5 = vb.field_e;
              var1 = var5;
              if (param0 >= 98) {
                break L1;
              } else {
                ab.a((byte) -5);
                break L1;
              }
            }
            var2 = 0;
            var3 = var5.length;
            L2: while (true) {
              if (var3 <= var2) {
                break L0;
              } else {
                incrementValue$16 = var2;
                var2++;
                var5[incrementValue$16] = 0;
                incrementValue$17 = var2;
                var2++;
                var5[incrementValue$17] = 0;
                incrementValue$18 = var2;
                var2++;
                var5[incrementValue$18] = 0;
                incrementValue$19 = var2;
                var2++;
                var5[incrementValue$19] = 0;
                incrementValue$20 = var2;
                var2++;
                var5[incrementValue$20] = 0;
                incrementValue$21 = var2;
                var2++;
                var5[incrementValue$21] = 0;
                incrementValue$22 = var2;
                var2++;
                var5[incrementValue$22] = 0;
                incrementValue$23 = var2;
                var2++;
                var5[incrementValue$23] = 0;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1_ref), "ab.A(" + param0 + ')');
        }
    }

    final static void a(int param0) {
        cb.field_a.a(gj.field_d, 100, fa.field_S * 48 >> 2080736903);
        if (param0 != 2026) {
            field_b = (fi) null;
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 > -26) {
            field_a = -36;
        }
    }

    static {
        field_a = 0;
        field_b = new fi();
    }
}
