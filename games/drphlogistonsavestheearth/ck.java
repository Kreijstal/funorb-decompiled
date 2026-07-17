/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck {
    private double[] field_m;
    static long field_e;
    static int[] field_b;
    private double[] field_h;
    static td[] field_j;
    static boolean[] field_f;
    private double[] field_g;
    static nh field_l;
    static he[] field_k;
    static int field_c;
    private int[] field_a;
    private int[] field_i;
    static he[] field_d;

    final static void d(int param0) {
        if (!sg.field_a) {
            throw new IllegalStateException();
        }
        if (!(ol.field_a == null)) {
            ol.field_a.d(true);
        }
        int discarded$0 = 0;
        String var1 = gk.a();
        pi.field_O = new wa(var1, (String) null, true, false, false);
        if (param0 <= 71) {
            field_d = null;
        }
        ng.field_c.a((byte) -112, (vg) (Object) fb.field_e);
        fb.field_e.a(33, (vg) (Object) pi.field_O);
        fb.field_e.g((byte) -125);
    }

    final static boolean b() {
        lc var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        lc var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_14_0 = 0;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var4 = (lc) (Object) g.field_t.h(-11151);
          var1 = var4;
          if (var1 == null) {
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0 != 0;
          } else {
            var2 = 0;
            L0: while (true) {
              if (var2 >= var1.field_r) {
                return true;
              } else {
                L1: {
                  if (var4.field_n[var2] == null) {
                    break L1;
                  } else {
                    if (var4.field_n[var2].field_b != 0) {
                      break L1;
                    } else {
                      stackOut_9_0 = 0;
                      stackIn_10_0 = stackOut_9_0;
                      return stackIn_10_0 != 0;
                    }
                  }
                }
                L2: {
                  if (var4.field_o[var2] == null) {
                    break L2;
                  } else {
                    if (var4.field_o[var2].field_b == 0) {
                      stackOut_14_0 = 0;
                      stackIn_15_0 = stackOut_14_0;
                      return stackIn_15_0 != 0;
                    } else {
                      break L2;
                    }
                  }
                }
                var2++;
                continue L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var1_ref, "ck.D(" + 99 + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var7 = 98 % ((53 - param3) / 48);
        var8 = 0;
        L0: while (true) {
          if (var8 >= 9) {
            ((ck) this).field_m[9] = (double)param5;
            ((ck) this).field_g[9] = (double)param0;
            ((ck) this).field_i[9] = param2;
            ((ck) this).field_h[9] = (double)param1;
            ((ck) this).field_a[9] = param4;
            return;
          } else {
            ((ck) this).field_h[var8] = ((ck) this).field_h[1 + var8] - (Math.random() + 0.25);
            if (0.0 < ((ck) this).field_h[var8]) {
              ((ck) this).field_m[var8] = ((ck) this).field_m[1 + var8] + (-1.0 + 2.99 * Math.random());
              ((ck) this).field_g[var8] = ((ck) this).field_g[1 + var8] - (-3.0 + 2.0 * (Math.random() + Math.random() + Math.random()));
              ((ck) this).field_i[var8] = ((ck) this).field_i[var8 - -1];
              ((ck) this).field_a[var8] = ((ck) this).field_a[var8 + 1];
              var8++;
              continue L0;
            } else {
              var8++;
              continue L0;
            }
          }
        }
    }

    final static h a(int param0, int param1, int param2, boolean param3) {
        h var4 = new h();
        var4.field_h = 0;
        var4.field_j = new int[1];
        eg.field_c.a((gi) (Object) var4, 255);
        bj.a(5, -59, var4);
        return var4;
    }

    public static void a() {
        field_b = null;
        field_l = null;
        field_k = null;
        field_f = null;
        field_j = null;
        field_d = null;
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (param0 == -1) {
            break L0;
          } else {
            ck.d(-119);
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (var2 >= 10) {
            return;
          } else {
            var4 = ((ck) this).field_i[var2];
            var3 = 0;
            L2: while (true) {
              if (var3 >= 1) {
                if (((ck) this).field_h[var2] >= 0.0) {
                  var5 = ((ck) this).field_a[var2];
                  if (var5 == 0) {
                    wj.c((int)((ck) this).field_m[var2], (int)((ck) this).field_g[var2], (int)((ck) this).field_h[var2], ((ck) this).field_i[var2], 128);
                    var2++;
                    continue L1;
                  } else {
                    if (var5 == 1) {
                      wj.a((int)((ck) this).field_m[var2] << 4, (int)((ck) this).field_g[var2] << 4, (int)((ck) this).field_h[var2] << 4, 0, vd.field_b);
                      var2++;
                      continue L1;
                    } else {
                      var2++;
                      continue L1;
                    }
                  }
                } else {
                  var2++;
                  continue L1;
                }
              } else {
                vd.field_b[var3] = var4;
                var3++;
                continue L2;
              }
            }
          }
        }
    }

    ck() {
        int var1 = 0;
        ((ck) this).field_m = new double[10];
        ((ck) this).field_g = new double[10];
        ((ck) this).field_h = new double[10];
        ((ck) this).field_a = new int[10];
        ((ck) this).field_i = new int[10];
        for (var1 = 0; var1 < 10; var1++) {
            ((ck) this).field_m[var1] = -1.0;
            ((ck) this).field_g[var1] = -1.0;
            ((ck) this).field_h[var1] = -1.0;
            ((ck) this).field_i[var1] = -1;
            ((ck) this).field_a[var1] = -1;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new td[3];
        field_f = new boolean[112];
        field_b = new int[8192];
        field_c = 0;
    }
}
