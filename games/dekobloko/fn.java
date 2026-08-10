/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fn extends mk {
    static String field_f;
    static w field_g;
    private java.nio.ByteBuffer field_h;

    final byte[] a(int param0) {
        if (param0 != 256) {
            return (byte[]) null;
        }
        byte[] var3 = new byte[this.field_h.capacity()];
        byte[] var2 = var3;
        this.field_h.position(0);
        this.field_h.get(var3);
        return var3;
    }

    final static void a(ji param0, ji param1, ji param2, int param3) {
        ck var17 = null;
        pi[] var5 = null;
        pi[][] var6 = null;
        int[][] var19 = null;
        int[][] var16 = null;
        int[][] var7 = null;
        pi[] var14 = null;
        int var11_int = 0;
        ck var15 = null;
        ck var18 = null;
        ck var11 = null;
        ck var12 = null;
        int var8 = 0;
        int var9 = 0;
        int var13 = client.field_A ? 1 : 0;
        try {
            c.field_m = bj.a(112, param0, "commonui", "frame_top");
            g.field_O = bj.a(112, param0, "commonui", "frame_bottom");
            jm.field_q = id.a(param0, "jagex_logo_grey", "commonui", 8192);
            rm.field_a = bj.a(112, param0, "commonui", "button");
            tl.field_u = ac.a(0, "commonui", "validation", param0);
            bj.field_f = (mm) ((Object) vi.a(param2, param0, "commonui", (byte) 110, "arezzo12"));
            hh.field_e = (mm) ((Object) vi.a(param2, param0, "commonui", (byte) 93, "arezzo14"));
            ec.field_p = (mm) ((Object) vi.a(param2, param0, "commonui", (byte) -121, "arezzo14bold"));
            var17 = new ck(param1.a(0, "", "button.gif"), (java.awt.Component) ((Object) jh.field_b));
            hn.a("dropdown", param0, "commonui", (byte) 73);
            var5 = t.a("screen_options", param0, false, "commonui");
            df.field_Y = new pi[4];
            jj.field_e = new pi[4];
            aa.field_c = new pi[4];
            var6 = new pi[][]{df.field_Y, jj.field_e, aa.field_c};
            var19 = new int[4][];
            var16 = var19;
            var7 = var16;
            var7[0] = var5[0].field_l;
            for (var8 = 1; var8 < var19.length; var8++) {
                var7[var8] = (int[]) ((Object) var19[0].clone());
            }
            var8 = var5[0].field_k[0];
            var19[2][var8] = 16777215;
            var19[1][var8] = 2394342;
            var19[3][var8] = 4767999;
            for (var9 = 0; (var9 ^ -1) > -4; var9++) {
                var14 = var6[var9];
                pi[] var10 = var14;
                for (var11_int = 0; var14.length > var11_int; var11_int++) {
                    var14[var11_int] = hc.a(0, var19[var11_int], var5[var9]);
                }
            }
            var9 = var17.field_H;
            uh.a(-9074);
            var17.a();
            hk.c(0, 0, hk.field_j, hk.field_i);
            var15 = new ck(var9, var9);
            var18 = var15;
            var18.a();
            var17.e(0, param3);
            var11 = new ck(var9, var9);
            var11.a();
            var17.e(var9 - var17.field_I, 0);
            var12 = new ck(var17.field_I - 2 * var9, var9);
            var12.a();
            var17.e(-var9, 0);
            mk.a((byte) -5);
            rm.field_a = new ck[]{var15, var12, var11};
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "fn.F(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    fn() {
    }

    public static void b(int param0) {
        if (param0 != 0) {
            ji var2 = (ji) null;
            fn.a((ji) null, (ji) null, (ji) null, 51);
        }
        field_g = null;
        field_f = null;
    }

    final void a(byte[] param0, boolean param1) {
        this.field_h = java.nio.ByteBuffer.allocateDirect(param0.length);
        this.field_h.position(0);
        if (!param1) {
            return;
        }
        try {
            this.field_h.put(param0);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "fn.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_f = "Invite more players, or alternatively try changing the '<%0>' setting.";
    }
}
