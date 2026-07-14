/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fn extends mk {
    static String field_f;
    static w field_g;
    private java.nio.ByteBuffer field_h;

    final byte[] a(int param0) {
        if (param0 != 256) {
            return null;
        }
        byte[] var3 = new byte[((fn) this).field_h.capacity()];
        byte[] var2 = var3;
        java.nio.Buffer discarded$0 = ((fn) this).field_h.position(0);
        java.nio.ByteBuffer discarded$1 = ((fn) this).field_h.get(var3);
        return var3;
    }

    final static void a(ji param0, ji param1, ji param2, int param3) {
        int var8 = 0;
        int var9 = 0;
        pi[] var14 = null;
        int var11_int = 0;
        int var13 = client.field_A ? 1 : 0;
        c.field_m = bj.a(112, param0, "commonui", "frame_top");
        g.field_O = bj.a(112, param0, "commonui", "frame_bottom");
        jm.field_q = id.a(param0, "jagex_logo_grey", "commonui", 8192);
        rm.field_a = bj.a(112, param0, "commonui", "button");
        tl.field_u = ac.a(0, "commonui", "validation", param0);
        bj.field_f = (mm) (Object) vi.a(param2, param0, "commonui", (byte) 110, "arezzo12");
        hh.field_e = (mm) (Object) vi.a(param2, param0, "commonui", (byte) 93, "arezzo14");
        ec.field_p = (mm) (Object) vi.a(param2, param0, "commonui", (byte) -121, "arezzo14bold");
        ck var17 = new ck(param1.a(0, "", "button.gif"), (java.awt.Component) (Object) jh.field_b);
        pi discarded$0 = hn.a("dropdown", param0, "commonui", (byte) 73);
        pi[] var5 = t.a("screen_options", param0, false, "commonui");
        df.field_Y = new pi[4];
        jj.field_e = new pi[4];
        aa.field_c = new pi[4];
        pi[][] var6 = new pi[][]{df.field_Y, jj.field_e, aa.field_c};
        int[][] var21 = new int[4][];
        int[][] var20 = var21;
        int[][] var19 = var20;
        int[][] var16 = var19;
        int[][] var7 = var16;
        var7[0] = var5[0].field_l;
        for (var8 = 1; var8 < var21.length; var8++) {
            var7[var8] = (int[]) var21[0].clone();
        }
        var8 = var5[0].field_k[0];
        var21[2][var8] = 16777215;
        var21[1][var8] = 2394342;
        var21[3][var8] = 4767999;
        for (var9 = 0; (var9 ^ -1) > -4; var9++) {
            var14 = var6[var9];
            pi[] var10 = var14;
            for (var11_int = 0; var14.length > var11_int; var11_int++) {
                var14[var11_int] = hc.a(0, var21[var11_int], var5[var9]);
            }
        }
        var9 = var17.field_H;
        uh.a(-9074);
        var17.a();
        hk.c(0, 0, hk.field_j, hk.field_i);
        ck var15 = new ck(var9, var9);
        ck var18 = var15;
        var18.a();
        var17.e(0, param3);
        ck var11 = new ck(var9, var9);
        var11.a();
        var17.e(var9 - var17.field_I, 0);
        ck var12 = new ck(var17.field_I - 2 * var9, var9);
        var12.a();
        var17.e(-var9, 0);
        mk.a((byte) -5);
        rm.field_a = new ck[]{var15, var12, var11};
    }

    fn() {
    }

    public static void b(int param0) {
        if (param0 != 0) {
            Object var2 = null;
            fn.a((ji) null, (ji) null, (ji) null, 51);
        }
        field_g = null;
        field_f = null;
    }

    final void a(byte[] param0, boolean param1) {
        ((fn) this).field_h = java.nio.ByteBuffer.allocateDirect(param0.length);
        java.nio.Buffer discarded$6 = ((fn) this).field_h.position(0);
        if (!param1) {
            return;
        }
        java.nio.ByteBuffer discarded$7 = ((fn) this).field_h.put(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Invite more players, or alternatively try changing the '<%0>' setting.";
    }
}
