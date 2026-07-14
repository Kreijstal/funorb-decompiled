/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm extends ah {
    static int[][] field_bb;
    private pm field_ib;
    private oi field_db;
    static int[][] field_eb;
    static String field_hb;
    static String field_fb;
    static int[] field_cb;
    static int[] field_gb;

    public static void m(int param0) {
        field_fb = null;
        field_bb = null;
        field_cb = null;
        field_eb = null;
        if (param0 != -27552) {
            return;
        }
        field_gb = null;
        field_hb = null;
    }

    final void a(mn param0, byte param1) {
        double[] var13 = new double[12];
        double[] var12 = var13;
        double[] var11 = var12;
        double[] var3 = var11;
        ((mm) this).field_ab.a((byte) 54, var13);
        double var4 = var13[9];
        double var6 = var13[10];
        ((mm) this).field_db.field_t = -(((mm) this).field_C * var4) + ((mm) this).field_E;
        double var8 = var13[11];
        ((mm) this).field_db.field_o = -(var6 * ((mm) this).field_C) + ((mm) this).field_t;
        ((mm) this).field_db.field_u = 10.0;
        int var10 = 25 / ((param1 - -2) / 62);
        ((mm) this).field_db.field_p = ((mm) this).field_D - ((mm) this).field_C * var8;
        ((mm) this).field_db.field_v = -var8;
        ((mm) this).field_db.field_m = -var4;
        ((mm) this).field_db.field_w = true;
        ((mm) this).field_db.field_x = -var6;
        param0.a((rk) (Object) ((mm) this).field_db, (byte) 104);
    }

    mm(hn param0, ee param1, da param2, pm param3) {
        super(param0, 0.2, 0.003, 16.0, param1, pl.field_y);
        double[] var5 = null;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        double var26 = 0.0;
        double var28 = 0.0;
        double var30 = 0.0;
        double var32 = 0.0;
        double var34 = 0.0;
        double[] var37 = null;
        double[] var38 = null;
        double[] var39 = null;
        double[] var40 = null;
        double[] var41 = null;
        L0: {
          ((mm) this).field_db = new oi((pm) this);
          ((mm) this).field_ab = new da(param2);
          var41 = new double[12];
          var40 = var41;
          var39 = var40;
          var38 = var39;
          var37 = var38;
          var5 = var37;
          ((mm) this).field_ab.a((byte) 66, var41);
          var6 = var41[9];
          var8 = var41[10];
          var10 = var41[11];
          if (param3 == null) {
            var16 = -0.999 + 1.998 * Math.random();
            var18 = Math.sqrt(-(var16 * var16) + 1.0);
            var20 = 2.0 * (3.141592653589793 * Math.random());
            var12 = var18 * Math.sin(var20);
            var14 = Math.cos(var20) * var18;
            break L0;
          } else {
            var16 = param3.field_D - ((mm) this).field_D;
            var12 = param3.field_E - ((mm) this).field_E;
            var14 = -((mm) this).field_t + param3.field_t;
            break L0;
          }
        }
        L1: {
          var18 = var10 * var16 + (var6 * var12 + var8 * var14);
          var20 = -(var8 * var16) + var10 * var14;
          var22 = -(var12 * var10) + var16 * var6;
          var24 = var12 * var8 - var6 * var14;
          var26 = Math.sqrt(var20 * var20 + var22 * var22 + var24 * var24);
          if (var26 < 0.0001) {
            var24 = var41[8];
            var22 = var41[7];
            var20 = var41[6];
            break L1;
          } else {
            var24 = var24 / var26;
            var22 = var22 / var26;
            var20 = var20 / var26;
            break L1;
          }
        }
        var28 = Math.atan2(var26, var18);
        hd.field_e.a(-var28, var24, var20, var22, 7);
        ((mm) this).field_ab.a(-43, hd.field_e);
        var24 = -0.999 + Math.random() * 1.998;
        var30 = Math.sqrt(1.0 - var24 * var24);
        var32 = 2.0 * (Math.random() * 3.141592653589793);
        var20 = Math.sin(var32) * var30;
        var22 = Math.cos(var32) * var30;
        hd.field_e.a(0.1 * Math.random(), var24, var20, var22, 7);
        ((mm) this).field_ab.a(-60, hd.field_e);
        ((mm) this).field_ab.a((byte) 30, var41);
        var34 = 0.05 + 0.05 * Math.random();
        ((mm) this).field_L = var34 * var41[11];
        ((mm) this).field_ib = param3;
        ((mm) this).field_G = var34 * var41[10];
        ((mm) this).field_K = var41[9] * var34;
    }

    final void a(mm param0, boolean param1) {
        if (!(((mm) this).field_Y != param0.field_Y)) {
            return;
        }
        ((mm) this).a(105, (ah) (Object) param0);
        if (param1) {
            ((mm) this).field_ib = null;
        }
    }

    final void g(int param0) {
        ka var2 = ((mm) this).a((byte) -126, kj.field_b, 1.5);
        if (param0 != 26402) {
            mm.m(42);
        }
        var2.field_M.field_w = 0.5;
    }

    final void a(mn param0, double param1, int param2, vg param3, oi param4) {
        if (((mm) this).field_N) {
            return;
        }
        double[] var19 = new double[12];
        double[] var18 = var19;
        double[] var17 = var18;
        double[] var16 = var17;
        double[] var15 = var16;
        double[] var7 = var15;
        ((mm) this).field_ab.a((byte) 105, var19);
        double var8 = var19[9];
        double var10 = var19[10];
        double var12 = var19[11];
        int var14 = var8 * param3.field_P + param3.field_H * var10 + param3.field_N * var12 > 0.0 ? 1 : 0;
        if (!(var14 == 0)) {
            ((mm) this).a(tk.field_a, ((mm) this).field_ab, param4, (byte) 64, param1, param0, param3, 512);
        }
        pa.a(((mm) this).field_E - var8 * ((mm) this).field_C, 0.2 * ((mm) this).field_C, (byte) -11, 256, -(var12 * ((mm) this).field_C) + ((mm) this).field_D, ((mm) this).field_t - ((mm) this).field_C * var10, wb.field_a, param1, param3);
        if (var14 == 0) {
            ((mm) this).a(tk.field_a, ((mm) this).field_ab, param4, (byte) 64, param1, param0, param3, 512);
        }
        if (param2 > -5) {
            ((mm) this).field_ib = null;
        }
    }

    final static void a(int param0, int param1, nf[] param2, nf[] param3, nf[] param4, int param5, byte param6, int param7, int param8, int param9, int param10, int param11, ok param12, int param13, ok param14, int param15, int param16, int param17, int param18, int param19, int param20) {
        ai.a(param12, new ji(param3), param15, param9, param5, param17, param8, param0, new ji(param2), param20, param16, param13, -78, new ji(param4), param18, param1, param10, param14, param7, param11, param19);
        int var21 = -122 % ((param6 - -54) / 39);
    }

    final void a(int param0, int param1) {
        double var3 = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        if (((mm) this).field_ib != null) {
            var3 = Math.sqrt(((mm) this).field_G * ((mm) this).field_G + ((mm) this).field_K * ((mm) this).field_K + ((mm) this).field_L * ((mm) this).field_L);
            if (!(0.001 <= var3)) {
                var3 = 0.001;
            }
            var5 = ((mm) this).field_K / var3;
            var7 = ((mm) this).field_G / var3;
            var9 = ((mm) this).field_L / var3;
            if (((mm) this).a(var9, ((mm) this).field_ib, var5, 1, var7)) {
                ((mm) this).field_ib = ((mm) this).a(var5, var7, var9, false);
                // if_acmpeq L142
            }
            ((mm) this).b(((mm) this).field_ib, (byte) 106);
            ((mm) this).a(((mm) this).field_ab, true);
        }
        if (param0 != 11878) {
            mm.m(-44);
        }
        super.a(param0 ^ 0, param1);
    }

    final void a(pm param0, int param1) {
        if (param1 > -81) {
            Object var4 = null;
            ((mm) this).a((mn) null, (byte) 122);
        }
        param0.a((mm) this, false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_eb = new int[][]{new int[28], new int[8], new int[12], new int[26], new int[20], new int[12], new int[26], new int[24], new int[12], new int[14]};
        field_bb = new int[field_eb.length][];
        for (var0 = 0; var0 < field_eb.length; var0++) {
            field_bb[var0] = new int[field_eb[var0].length];
        }
        field_fb = "<col=FFFFFF>Cluster missiles:</col> upon impact, these release five shells that aim for and home in on nearby targets. Tap <col=FFFFFF><%0></col> to fire one; hold <col=FFFFFF><%0></col> to fire many. You get four at once but can only carry 10.";
        field_gb = new int[256];
        field_hb = "Play free version";
        field_cb = new int[256];
        for (var0 = 0; (var0 ^ -1) > -257; var0++) {
            var1 = var0 * var0 >> -573268376;
            var2 = var1 * var1 >> -1077269336;
            field_gb[var0] = nl.a(var1, nl.a(var2 << 1536545488, var0 << 1359907656));
            field_cb[var0] = nl.a(nl.a(var0 << -567676496, var1 << -402739160), var2);
        }
    }
}
