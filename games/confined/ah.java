/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ah extends ee {
    static String field_R;
    ee field_Y;
    static nf[] field_T;
    static int field_Q;
    static int field_U;
    static String field_Z;
    static String field_W;
    double field_X;
    da field_ab;
    int field_S;
    private int field_V;

    ah(hn param0, double param1, double param2, double param3, ee param4, bi param5) {
        super(param0, param4.field_E, param4.field_t, param4.field_D, param1, param2);
        ((ah) this).field_V = 0;
        ((ah) this).field_S = 1;
        ((ah) this).field_Y = param4;
        ((ah) this).field_X = param3;
        new gk((pm) this, param5).field_w = 2.0;
    }

    void a(pm param0, int param1) {
        param0.a(123, (ah) this);
        if (param1 >= -81) {
            Object var4 = null;
            ((ah) this).a((cl) null, (byte) 40);
        }
    }

    final double a(int param0, boolean param1, double param2) {
        if (param0 != 14170) {
            field_W = null;
        }
        param2 = param2 - 4.0;
        return param2 < 0.0 ? 0.0 : param2;
    }

    final boolean c(int param0) {
        if (param0 != 5) {
            return false;
        }
        return true;
    }

    ah(hn param0, ee param1, double param2, double param3, double param4, double[] param5, double param6, double param7, double param8, bi param9) {
        super(param0, param1.field_E, param1.field_t, param1.field_D, param2, param3);
        double var17 = 0.0;
        double var19 = 0.0;
        double var21 = 0.0;
        double var23 = 0.0;
        double var25 = 0.0;
        double var27 = 0.0;
        double var29 = 0.0;
        double var31 = 0.0;
        L0: {
          ((ah) this).field_V = 0;
          ((ah) this).field_S = 1;
          ((ah) this).field_G = param1.field_G;
          ((ah) this).field_t = ((ah) this).field_t + (param5[4] * param6 + param5[7] * param7 + param8 * param5[10]);
          ((ah) this).field_D = ((ah) this).field_D + (param8 * param5[11] + (param6 * param5[5] + param5[8] * param7));
          ((ah) this).field_X = param4;
          ((ah) this).field_E = ((ah) this).field_E + (param6 * param5[3] + param5[6] * param7 + param5[9] * param8);
          ((ah) this).field_K = param1.field_K;
          ((ah) this).field_L = param1.field_L;
          ((ah) this).field_Y = param1;
          ((ah) this).field_ab = new da();
          var17 = -((ah) this).field_E + param0.field_B.field_Lb.field_i;
          var19 = param0.field_B.field_Lb.field_f - ((ah) this).field_t;
          var21 = param0.field_B.field_Lb.field_j - ((ah) this).field_D;
          var23 = -var19;
          var25 = var17;
          var27 = Math.sqrt(var25 * var25 + var23 * var23);
          if (var27 < 0.0001) {
            break L0;
          } else {
            var25 = var25 / var27;
            var23 = var23 / var27;
            var29 = Math.atan2(var27, var21);
            ((ah) this).field_ab.a(var29, 0.0, var23, var25, 7);
            break L0;
          }
        }
        L1: {
          var23 = var17;
          var25 = var19;
          var29 = var21;
          var27 = Math.sqrt(var29 * var29 + (var25 * var25 + var23 * var23));
          if (var27 >= 0.001) {
            break L1;
          } else {
            var27 = 0.001;
            break L1;
          }
        }
        var27 = 1.0 / var27;
        var29 = var29 * var27;
        var25 = var25 * var27;
        var23 = var23 * var27;
        var31 = Math.random() * 6.283185307179586;
        hd.field_e.a(var31, var29, var23, var25, 7);
        ((ah) this).field_ab.a(-57, hd.field_e);
        new gk((pm) this, param9).field_w = 2.0;
    }

    final boolean a(boolean param0, pm param1) {
        if (!param0) {
            e[] discarded$0 = ah.l(-64);
            return false;
        }
        return false;
    }

    void b(boolean param0, ee param1) {
        if (param1 == ((ah) this).field_Y) {
            if (!param1.field_z) {
                // ifle L39
            }
            ((ah) this).field_S = ((ah) this).field_S + 1;
            return;
        }
        ((ah) this).a(param1, 0.0, -85);
        ((ah) this).d(10797);
    }

    final void a(boolean param0, ee param1) {
        ((ah) this).b(!param0 ? true : false, param1);
        if (!param0) {
            ((ah) this).field_X = -0.41923518349279615;
        }
    }

    final boolean a(pm param0, byte param1) {
        if (param1 != 72) {
            return true;
        }
        return false;
    }

    final static int a(byte[] param0, int param1, int param2, byte param3) {
        int var6 = 0;
        int var7 = Confined.field_J ? 1 : 0;
        int var4 = -1;
        int var5 = -74 % ((param3 - -54) / 57);
        for (var6 = param1; var6 < param2; var6++) {
            var4 = ca.field_n[(param0[var6] ^ var4) & 255] ^ var4 >>> -1688420600;
        }
        var4 = var4 ^ -1;
        return var4;
    }

    ah(hn param0, dj param1, double param2, double param3, double param4, bi param5) {
        super(param0, param1.field_E, param1.field_t, param1.field_D, param2, param3);
        ((ah) this).field_V = 0;
        ((ah) this).field_S = 1;
        ((ah) this).field_X = param4;
        ((ah) this).field_Y = (ee) (Object) param1;
        ((ah) this).field_L = param1.field_L;
        ((ah) this).field_K = param1.field_K;
        ((ah) this).field_G = param1.field_G;
        ((ah) this).field_ab = new da(param1.field_jb);
        double[] var15 = new double[12];
        double[] var14 = var15;
        double[] var13 = var14;
        double[] var12 = var13;
        double[] var11 = var12;
        double[] var10 = var11;
        ((ah) this).field_ab.a((byte) 81, var15);
        ((ah) this).field_E = ((ah) this).field_E + var15[9] * param1.field_C;
        ((ah) this).field_t = ((ah) this).field_t + param1.field_C * var15[10];
        ((ah) this).field_D = ((ah) this).field_D + var15[11] * param1.field_C;
        new gk((pm) this, param5).field_w = 2.0;
    }

    final void a(int param0, vg param1) {
        if (param0 != -1) {
            field_R = null;
        }
        param1.a(73, (ah) this);
    }

    final void a(boolean param0, il param1) {
        if (param0) {
            return;
        }
        param1.c((ee) this, -7442);
    }

    final void a(int param0, mb param1) {
        param1.a(113, (ah) this);
        if (param0 != -23154) {
            Object var4 = null;
            ((ah) this).a((pm) null, -105);
        }
    }

    final static String a(boolean param0, boolean param1, int param2, boolean param3) {
        int var4 = 0;
        if (!(!param3)) {
            var4 += 4;
        }
        if (param2 > -105) {
            field_Q = -2;
        }
        if (!(!param1)) {
            var4 += 2;
        }
        if (param0) {
            var4++;
        }
        return ag.field_d[var4];
    }

    final void a(cl param0, byte param1) {
        int var3 = -66 / ((-35 - param1) / 60);
        param0.a(-43, (ah) this);
    }

    public static void h(byte param0) {
        field_R = null;
        field_T = null;
        if (param0 != -128) {
            field_U = -127;
        }
        field_W = null;
        field_Z = null;
    }

    final void a(int param0, double param1, double param2, double param3, double param4, double param5, double param6) {
        double var14 = -((ah) this).field_E + param3;
        if (param0 != 256) {
            field_R = null;
        }
        double var16 = param1 - ((ah) this).field_t;
        double var18 = param5 - ((ah) this).field_D;
        if (!(((ah) this).field_C * ((ah) this).field_C * 0.25 <= var18 * var18 + (var14 * var14 + var16 * var16))) {
            ((ah) this).d(10797);
        }
    }

    final void a(byte param0, sa param1) {
        if (param0 != 9) {
            return;
        }
        param1.a(param0 ^ -53, (ah) this);
    }

    final static e[] l(int param0) {
        if (param0 != 20253) {
            return null;
        }
        return new e[]{qc.field_l, rn.field_a, tl.field_e, mn.field_f, li.field_k, eb.field_o, la.field_N, ch.field_a, ij.field_s, og.field_i, bg.field_g, ei.field_lb, rk.field_g, oe.field_R};
    }

    final boolean f(int param0) {
        if (param0 >= -54) {
            ((ah) this).field_X = -0.13909911227676286;
        }
        return ((ah) this).field_Y.f(-104);
    }

    void a(int param0, int param1) {
        if (0 < ((ah) this).field_S) {
            ((ah) this).field_S = ((ah) this).field_S - 1;
        }
        double[] var8 = new double[12];
        double[] var7 = var8;
        double[] var6 = var7;
        double[] var3 = var6;
        ((ah) this).field_ab.a((byte) 72, var8);
        double var4 = ((ah) this).field_Y.f(-62) ? 0.99 : 0.97;
        ((ah) this).field_G = (((ah) this).field_G + var8[10] * 0.01) * var4;
        ((ah) this).field_L = var4 * (0.01 * var8[11] + ((ah) this).field_L);
        ((ah) this).field_K = (((ah) this).field_K + var8[9] * 0.01) * var4;
        super.a(param0, param1);
        ((ah) this).field_V = ((ah) this).field_V + 1;
        if (!(((ah) this).field_V != 120)) {
            ((ah) this).d(10797);
        }
    }

    final void a(int param0, hf param1) {
        if (!((ah) this).f(-96)) {
            if (!(!param1.f(-110))) {
                param1.b((ee) this, -125);
            }
        }
        if (param0 > -29) {
            field_R = null;
        }
    }

    final void a(int param0, ah param1) {
        if (this == (Object) (Object) param1.field_Y) {
            if (!((ah) this).field_z) {
                // if_icmplt L32
            } else {
                param1.field_S = param1.field_S + 1;
                return;
            }
        }
        ((ah) this).b(false, (ee) (Object) param1);
        param1.d(10797);
        int var3 = -57 % ((14 - param0) / 53);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Z = "Charge cannon";
        field_R = "<%0> concussion missiles";
        field_W = "1 nuclear missile";
        field_Q = -1;
    }
}
