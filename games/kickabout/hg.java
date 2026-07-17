/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg extends i {
    static String field_H;
    static ut field_G;
    static int[] field_I;
    static String field_F;

    hg(int param0) {
        super(10);
        String var6 = Integer.toString(ps.field_d[param0]);
        String var2 = var6;
        String var3 = q.field_h[param0];
        String var4 = vo.a((byte) -18, gd.field_e[10], new String[2]);
        ut var5 = kb.field_E[param0];
        ((hg) this).a(var4, ((hg) this).field_t, var5, -110, ((hg) this).field_u);
        ((hg) this).a(ds.a(((hg) this).field_y, 1), pg.a(false, 10), 1054928844);
    }

    final static void a(int param0, byte param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        hr var4 = null;
        dl var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Kickabout.field_G;
        try {
          L0: {
            var4 = (hr) (Object) ti.field_c.g(24009);
            L1: while (true) {
              if (var4 == null) {
                var5 = (dl) (Object) ru.field_M.g(24009);
                L2: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    pf.a(param0, var5, (byte) -114);
                    var5 = (dl) (Object) ru.field_M.c(33);
                    continue L2;
                  }
                }
              } else {
                rf.a(var4, param0, true);
                var4 = (hr) (Object) ti.field_c.c(33);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "hg.B(" + param0 + 44 + -122 + 41);
        }
    }

    final static int g(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_9_0 = 0;
        var3 = Kickabout.field_G;
        try {
          L0: {
            boolean discarded$4 = wd.field_l.a(cq.field_n, 31947, iw.field_i, true);
            var1_int = -43 % ((param0 - -39) / 43);
            wd.field_l.n(2);
            L1: while (true) {
              if (!nk.b((byte) -59)) {
                if (kt.field_j != -1) {
                  var2 = kt.field_j;
                  qd.b(38, -1);
                  stackOut_6_0 = var2;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                } else {
                  if (!wq.field_g) {
                    if (mj.field_a == nr.field_f) {
                      stackOut_13_0 = 1;
                      stackIn_14_0 = stackOut_13_0;
                      return stackIn_14_0;
                    } else {
                      if (!lc.field_e.a((byte) -80)) {
                        stackOut_17_0 = 1;
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0;
                      } else {
                        if (wk.field_f != nr.field_f) {
                          stackOut_22_0 = -1;
                          stackIn_23_0 = stackOut_22_0;
                          break L0;
                        } else {
                          stackOut_20_0 = 2;
                          stackIn_21_0 = stackOut_20_0;
                          return stackIn_21_0;
                        }
                      }
                    }
                  } else {
                    stackOut_9_0 = 3;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  }
                }
              } else {
                boolean discarded$5 = wd.field_l.a(il.field_c, (byte) -88, cc.field_e);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "hg.A(" + param0 + 41);
        }
        return stackIn_23_0;
    }

    public static void h(int param0) {
        if (param0 != 22100) {
          field_I = null;
          field_F = null;
          field_G = null;
          field_I = null;
          field_H = null;
          return;
        } else {
          field_F = null;
          field_G = null;
          field_I = null;
          field_H = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = new int[8192];
        field_F = "total: <%0> ";
        field_H = "Class: ";
        field_G = new ut(32, 64);
    }
}
