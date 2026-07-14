/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg implements cg {
    private rf field_d;
    static int field_i;
    private int field_c;
    private int field_l;
    private int field_h;
    static int[] field_a;
    static boolean field_g;
    private int field_e;
    private int field_b;
    private int field_j;
    static int field_f;
    private int field_k;

    public static void a(byte param0) {
        if (param0 > -84) {
            field_i = 80;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(int param0) {
        int var2 = 0;
        var2 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (fa.d(0)) {
          boolean discarded$12 = hg.field_S.a(jd.field_P, fl.field_f, true, 0);
          hg.field_S.b(false);
          L0: while (true) {
            if (!th.a(-109)) {
              if (param0 != 2) {
                field_f = -12;
                return;
              } else {
                return;
              }
            } else {
              boolean discarded$13 = hg.field_S.a(di.field_c, sj.field_g, 121);
              continue L0;
            }
          }
        } else {
          if (null != df.field_l) {
            if (!df.field_l.field_h) {
              return;
            } else {
              af.b(6);
              hg.field_S.a((byte) -115, (vg) (Object) new ae(hg.field_S, uf.field_a));
              return;
            }
          } else {
            return;
          }
        }
    }

    final static int a(int param0, int param1) {
        param1--;
        param1 = param1 | param1 >>> 1192215969;
        param1 = param1 | param1 >>> 1463303266;
        if (param0 != 2) {
          return -71;
        } else {
          param1 = param1 | param1 >>> 743783812;
          param1 = param1 | param1 >>> -350083224;
          param1 = param1 | param1 >>> 605771888;
          return 1 + param1;
        }
    }

    public final void a(boolean param0, int param1, vg param2, int param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        nd var14 = null;
        vg stackIn_3_0 = null;
        vg stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          if (param2 instanceof nd) {
            stackOut_2_0 = (vg) param2;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (vg) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var14 = (nd) (Object) stackIn_3_0;
          if (var14 != null) {
            break L1;
          } else {
            break L1;
          }
        }
        wj.f(param4 - -param2.field_o, param3 - -param2.field_m, param2.field_w, param2.field_k, ((lg) this).field_e);
        var7 = var14.field_O + (param4 - -param2.field_o);
        var8 = var14.field_S + param3 - -param2.field_m;
        wj.b(var7, var8, var14.field_J, ((lg) this).field_k);
        if (param1 < 94) {
          return;
        } else {
          L2: {
            if (var14.field_I != -1) {
              var9 = 3.141592653589793 * (double)var14.field_I * 2.0 / (double)var14.field_T;
              var11 = (int)(-Math.sin(var9) * (double)var14.field_J);
              var12 = (int)(Math.cos(var9) * (double)var14.field_J);
              wj.b(var7 + var11, var12 + var8, 1, ((lg) this).field_c);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            wj.b(var7, var8, 2, 1);
            var9 = 3.141592653589793 * (double)var14.field_N * 2.0 / (double)var14.field_T;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_J);
            var12 = (int)(Math.cos(var9) * (double)var14.field_J);
            wj.g(var7, var8, var7 - -var11, var8 + var12, 1);
            if (null != ((lg) this).field_d) {
              var13 = var14.field_J + (var14.field_O - -((lg) this).field_j);
              int discarded$1 = ((lg) this).field_d.a(param2.field_p, var13 + param2.field_o + param4, ((lg) this).field_l + (param3 + param2.field_m), param2.field_w - ((lg) this).field_j - var13, -(((lg) this).field_j << -785132607) + param2.field_k, ((lg) this).field_b, ((lg) this).field_h, 1, 1, 0);
              break L3;
            } else {
              break L3;
            }
          }
          return;
        }
    }

    lg(rf param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((lg) this).field_e = param7;
        ((lg) this).field_h = param4;
        ((lg) this).field_j = param1;
        ((lg) this).field_l = param2;
        ((lg) this).field_k = param5;
        ((lg) this).field_b = param3;
        ((lg) this).field_c = param6;
        ((lg) this).field_d = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = false;
    }
}
