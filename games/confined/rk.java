/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rk {
    rk field_a;
    long field_i;
    static e field_g;
    static int field_j;
    rk field_h;
    static qe field_k;
    static boolean field_f;
    static byte[][] field_c;
    static int field_d;
    static double[] field_l;
    static int field_e;
    static String field_b;

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    final static void d(byte param0) {
        rg.field_K = false;
        if (param0 != -61) {
            return;
        }
        lc.field_J = null;
        ra.field_c = new mn();
        i.field_o = 0;
        oj.field_B = 0;
    }

    final static void a(mi param0, int param1, mi param2, mi param3) {
        nf var5 = null;
        bm[] var6 = null;
        bm[][] var7 = null;
        int[][] var19 = null;
        int[][] var17 = null;
        int[][] var8 = null;
        bm[] var15 = null;
        int var12_int = 0;
        nf var16 = null;
        nf var18 = null;
        nf var12 = null;
        nf var13 = null;
        int var9 = 0;
        int var10 = 0;
        int var14 = Confined.field_J ? 1 : 0;
        try {
            wc.field_nc = nm.a(param3, "frame_top", 1, "commonui");
            fi.field_d = nm.a(param3, "frame_bottom", 1, "commonui");
            rh.field_Z = dh.a(false, "jagex_logo_grey", "commonui", param3);
            em.field_d = nm.a(param3, "button", 1, "commonui");
            gg.field_q = ua.a("commonui", -563, param3, "validation");
            fa.field_Q = (ok) ((Object) ej.a("arezzo12", param3, param2, "commonui", 0));
            gm.field_cb = (ok) ((Object) ej.a("arezzo14", param3, param2, "commonui", 0));
            int var4_int = -4 % ((68 - param1) / 50);
            fd.field_k = (ok) ((Object) ej.a("arezzo14bold", param3, param2, "commonui", 0));
            var5 = new nf(param0.a(110, "button.gif", ""), (java.awt.Component) ((Object) fb.field_b));
            pm.a(param3, "commonui", "dropdown", (byte) 112);
            var6 = ql.a("commonui", (byte) 90, "screen_options", param3);
            qm.field_B = new bm[4];
            jg.field_d = new bm[4];
            qd.field_b = new bm[4];
            var7 = new bm[][]{qd.field_b, qm.field_B, jg.field_d};
            var19 = new int[4][];
            var17 = var19;
            var8 = var17;
            var8[0] = var6[0].field_m;
            for (var9 = 1; var19.length > var9; var9++) {
                var8[var9] = (int[]) ((Object) var19[0].clone());
            }
            var9 = var6[0].field_n[0];
            var19[2][var9] = 16777215;
            var19[1][var9] = 2394342;
            var19[3][var9] = 4767999;
            for (var10 = 0; (var10 ^ -1) > -4; var10++) {
                var15 = var7[var10];
                bm[] var11 = var15;
                for (var12_int = 0; var15.length > var12_int; var12_int++) {
                    var15[var12_int] = jl.a(var19[var12_int], var6[var10], 0);
                }
            }
            var10 = var5.field_w;
            mk.b(128);
            var5.d();
            fn.c(0, 0, fn.field_g, fn.field_l);
            var16 = new nf(var10, var10);
            var18 = var16;
            var18.d();
            var5.c(0, 0);
            var12 = new nf(var10, var10);
            var12.d();
            var5.c(var10 - var5.field_u, 0);
            var13 = new nf(var5.field_u - 2 * var10, var10);
            var13.d();
            var5.c(-var10, 0);
            ib.b(false);
            em.field_d = new nf[]{var16, var13, var12};
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "rk.AD(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_k = null;
        field_g = null;
        field_c = (byte[][]) null;
        if (param0 != 14) {
            rk.b((byte) -93);
        }
        field_l = null;
    }

    final void a(boolean param0) {
        if (!(this.field_a != null)) {
            return;
        }
        this.field_a.field_h = this.field_h;
        this.field_h.field_a = this.field_a;
        this.field_a = null;
        if (!param0) {
            return;
        }
        this.field_h = null;
    }

    final static void b(byte param0) {
        String var2 = (String) null;
        tj.a(-1, "", (String) null);
        int var1 = -49 / ((82 - param0) / 34);
    }

    final boolean c(byte param0) {
        if (!(null != this.field_a)) {
            return false;
        }
        if (param0 < 98) {
            return true;
        }
        return true;
    }

    static {
        field_g = new e(14, 0, 4, 1);
        field_c = new byte[250][];
        field_b = "Setting course for Earth.";
        field_l = new double[]{0.0, 0.0, 0.0, 0.25, 0.45, 0.55, 0.6, 0.65};
    }
}
