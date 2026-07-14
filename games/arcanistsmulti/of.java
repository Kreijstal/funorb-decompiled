/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of implements pf {
    private int field_g;
    private int field_i;
    private dj field_d;
    private int field_f;
    private int field_h;
    static ql field_n;
    private int field_o;
    static String field_l;
    static long field_j;
    static String field_c;
    static String[] field_e;
    private int field_b;
    static kc field_a;
    private int field_m;
    static String field_k;

    final static void b(int param0, int param1) {
        int var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (param1 != 16) {
            return;
        }
        nk var4 = (nk) (Object) pe.field_Lb.b(12623);
        while (var4 != null) {
            fj.a(-26971, var4, param0);
            var4 = (nk) (Object) pe.field_Lb.a(param1 + -16);
        }
    }

    final static qb[] a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        qb var9 = null;
        qb var10 = null;
        qb var11 = null;
        qb var12 = null;
        qb var13 = null;
        qb var14 = null;
        Object var15 = null;
        int[] var16 = null;
        int[] var18 = null;
        int[] var19 = null;
        qb var20 = null;
        int[] var21 = null;
        qb var22 = null;
        int[] var23 = null;
        var23 = de.field_l;
        var21 = var23;
        var19 = var21;
        var18 = var19;
        var16 = var18;
        var6 = var16;
        var7 = de.field_e;
        var8 = de.field_j;
        var9 = new qb(param0, -(2 * param0) + param1);
        var9.a();
        de.c(0, 0, param0, -(2 * param0) + param1, param4, param5);
        var10 = new qb(param0, param0);
        var10.a();
        de.d(0, 0, param0, param0, param4);
        var11 = new qb(16, param0);
        var11.a();
        de.d(0, 0, 16, param0, param4);
        var12 = new qb(param0, param0);
        var12.a();
        de.d(0, 0, param0, param0, param5);
        var13 = new qb(16, param0);
        var13.a();
        de.d(0, 0, 16, param0, param5);
        var14 = null;
        if (param2 != 1) {
          L0: {
            var15 = null;
            qb[] discarded$1 = of.a(90, (byte) 7, (eg) null, 120);
            if (-1 > (param3 ^ -1)) {
              var20 = new qb(16, 16);
              var14 = var20;
              var20.a();
              de.d(0, 0, 16, 16, param3);
              break L0;
            } else {
              break L0;
            }
          }
          de.a(var23, var7, var8);
          return new qb[]{var10, var11, var10, var9, var14, var9, var12, var13, var12};
        } else {
          L1: {
            if (-1 > (param3 ^ -1)) {
              var22 = new qb(16, 16);
              var14 = var22;
              var22.a();
              de.d(0, 0, 16, 16, param3);
              break L1;
            } else {
              break L1;
            }
          }
          de.a(var23, var7, var8);
          return new qb[]{var10, var11, var10, var9, var14, var9, var12, var13, var12};
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        param1 = param1 & 8191;
        var2 = -32 / ((63 - param0) / 50);
        if (4096 <= param1) {
          L0: {
            if (param1 < 6144) {
              stackOut_7_0 = -ge.field_l[-4096 + param1];
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = -ge.field_l[-param1 + 8192];
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (param1 >= 2048) {
              stackOut_3_0 = ge.field_l[4096 - param1];
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = ge.field_l[param1];
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    final static qb[] a(int param0, byte param1, eg param2, int param3) {
        int var4 = 0;
        var4 = -94 % ((param1 - -80) / 35);
        if (!fc.a(-125, param2, param0, param3)) {
          return null;
        } else {
          return pk.a((byte) -116);
        }
    }

    public final void a(qm param0, int param1, int param2, int param3, boolean param4) {
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        rk var14 = null;
        qm stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        qm stackOut_1_0 = null;
        L0: {
          if (!(param0 instanceof rk)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (qm) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (qm) param0;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var14 = (rk) (Object) stackIn_3_0;
        if (param1 != 5592405) {
          return;
        } else {
          L1: {
            if (var14 != null) {
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            de.d(param2 - -param0.field_n, param3 + param0.field_j, param0.field_v, param0.field_k, ((of) this).field_b);
            var7 = param0.field_n + (param2 + var14.field_T);
            var8 = var14.field_U + (param3 + param0.field_j);
            de.i(var7, var8, var14.field_V, ((of) this).field_m);
            if (var14.field_M != -1) {
              var9 = 3.141592653589793 * (double)var14.field_M * 2.0 / (double)var14.field_P;
              var11 = (int)(-Math.sin(var9) * (double)var14.field_V);
              var12 = (int)(Math.cos(var9) * (double)var14.field_V);
              de.i(var11 + var7, var8 - -var12, 1, ((of) this).field_o);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            de.i(var7, var8, 2, 1);
            var9 = 3.141592653589793 * (double)var14.field_Q * 2.0 / (double)var14.field_P;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_V);
            var12 = (int)(Math.cos(var9) * (double)var14.field_V);
            de.b(var7, var8, var7 + var11, var12 + var8, 1);
            if (null != ((of) this).field_d) {
              var13 = ((of) this).field_g + (var14.field_V + var14.field_T);
              int discarded$1 = ((of) this).field_d.a(param0.field_g, var13 + (param2 - -param0.field_n), ((of) this).field_i + (param3 - -param0.field_j), -var13 - ((of) this).field_g + param0.field_v, -(((of) this).field_g << -1323478399) + param0.field_k, ((of) this).field_h, ((of) this).field_f, 1, 1, 0);
              break L3;
            } else {
              break L3;
            }
          }
          return;
        }
    }

    public static void a(int param0) {
        if (param0 >= -4) {
            return;
        }
        field_k = null;
        field_c = null;
        field_l = null;
        field_n = null;
        field_e = null;
        field_a = null;
    }

    of(dj param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((of) this).field_f = param4;
        ((of) this).field_g = param1;
        ((of) this).field_i = param2;
        ((of) this).field_o = param6;
        ((of) this).field_h = param3;
        ((of) this).field_d = param0;
        ((of) this).field_m = param5;
        ((of) this).field_b = param7;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new ql("usename");
        field_k = "Status";
        field_e = new String[16];
        field_l = "Unfortunately your configuration doesn't support fullscreen mode.";
    }
}
