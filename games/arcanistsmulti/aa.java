/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aa extends pg {
    static String field_h;
    int[] field_g;
    static String field_j;
    static String field_i;

    final static void a(int param0, eg param1, eg param2, eg param3) {
        int var8 = 0;
        int var9 = 0;
        ll[] var14 = null;
        int var11_int = 0;
        int var13 = ArcanistsMulti.field_G ? 1 : 0;
        fk.field_g = qe.a(param3, "frame_top", "commonui", 87);
        vi.field_E = qe.a(param3, "frame_bottom", "commonui", 118);
        ci.field_e = fj.a("commonui", -22612, param3, "jagex_logo_grey");
        af.field_Jb = qe.a(param3, "button", "commonui", 86);
        qk.field_lb = nl.a((byte) 31, param3, "validation", "commonui");
        vc.field_e = (dj) (Object) rm.a("arezzo12", param1, "commonui", -119, param3);
        ia.field_c = (dj) (Object) rm.a("arezzo14", param1, "commonui", -120, param3);
        go.field_k = (dj) (Object) rm.a("arezzo14bold", param1, "commonui", -123, param3);
        qb var17 = new qb(param2.a("", "button.gif", -1), (java.awt.Component) (Object) on.field_c);
        ll discarded$0 = af.a("dropdown", "commonui", 19412, param3);
        ll[] var5 = pk.a("commonui", 0, "screen_options", param3);
        fg.field_k = new ll[4];
        oa.field_d = new ll[4];
        qj.field_j = new ll[4];
        ll[][] var6 = new ll[][]{oa.field_d, fg.field_k, qj.field_j};
        int[][] var21 = new int[4][];
        int[][] var20 = var21;
        int[][] var19 = var20;
        int[][] var16 = var19;
        int[][] var7 = var16;
        var7[0] = var5[0].field_l;
        for (var8 = 1; var8 < var21.length; var8++) {
            var7[var8] = (int[]) var21[0].clone();
        }
        var8 = var5[0].field_m[0];
        var21[2][var8] = 16777215;
        var21[1][var8] = 2394342;
        var21[3][var8] = 4767999;
        if (param0 < 71) {
            aa.b(false);
        }
        for (var9 = 0; -4 < (var9 ^ -1); var9++) {
            var14 = var6[var9];
            ll[] var10 = var14;
            for (var11_int = 0; var14.length > var11_int; var11_int++) {
                var14[var11_int] = ef.a(var21[var11_int], (byte) -59, var5[var9]);
            }
        }
        var9 = var17.field_y;
        ec.a(65280);
        var17.a();
        de.e(0, 0, de.field_e, de.field_j);
        qb var15 = new qb(var9, var9);
        qb var18 = var15;
        var18.a();
        var17.h(0, 0);
        qb var11 = new qb(var9, var9);
        var11.a();
        var17.h(-var17.field_q + var9, 0);
        qb var12 = new qb(-(var9 * 2) + var17.field_q, var9);
        var12.a();
        var17.h(-var9, 0);
        oo.c(-15405);
        af.field_Jb = new qb[]{var15, var12, var11};
    }

    final static p a(Throwable param0, String param1) {
        p var2_ref = null;
        p var2 = null;
        if (!(param0 instanceof p)) {
            var2 = new p(param0, param1);
        } else {
            var2_ref = (p) (Object) param0;
            var2_ref.field_i = var2_ref.field_i + 32 + param1;
        }
        return var2_ref;
    }

    public static void b(boolean param0) {
        field_j = null;
        if (param0) {
            field_i = null;
        }
        field_i = null;
        field_h = null;
    }

    final static uj[] a(dl param0, byte param1) {
        int var5 = 0;
        uj var6 = null;
        int var7 = ArcanistsMulti.field_G ? 1 : 0;
        if (!(param0.a((byte) 46))) {
            return new uj[]{};
        }
        og var8 = param0.b(-27886);
        while (var8.field_e == -1) {
            ao.a(10L, 1);
        }
        if (-3 == var8.field_e) {
            return new uj[]{};
        }
        int[] var12 = (int[]) var8.field_g;
        int[] var11 = var12;
        int[] var10 = var11;
        int[] var9 = var10;
        int[] var3 = var9;
        if (param1 < 59) {
            return null;
        }
        uj[] var4 = new uj[var12.length >> 860439266];
        for (var5 = 0; var4.length > var5; var5++) {
            var6 = new uj();
            var4[var5] = var6;
            var6.field_g = var3[var5 << 1239147010];
            var6.field_e = var3[1 + (var5 << -2128016542)];
            var6.field_a = var3[(var5 << 1064242338) - -2];
            var6.field_d = var3[(var5 << -1133656958) + 3];
        }
        return var4;
    }

    private aa() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Account created successfully!";
        field_j = "You have no wands available.";
        field_i = "Staff impersonation";
    }
}
