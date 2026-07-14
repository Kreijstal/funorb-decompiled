/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi extends kd {
    int field_i;
    static boolean field_j;
    static tf field_l;
    boolean field_h;
    int[] field_k;

    final static void a(byte param0) {
        ni.a(75, 17);
        if (param0 < 62) {
            Object var2 = null;
            vi.a(-73, (vb) null, 90);
        }
    }

    final static db[] b(int param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = Lexicominos.field_L ? 1 : 0;
        db[] var1 = new db[th.field_t];
        for (var2 = 0; var2 < th.field_t; var2++) {
            var3 = pb.field_h[var2] * bd.field_m[var2];
            var4 = be.field_f[var2];
            var5 = new int[var3];
            for (var6 = 0; var6 < var3; var6++) {
                var5[var6] = ci.field_b[vg.a((int) var4[var6], 255)];
            }
            var1[var2] = new db(uc.field_fb, eh.field_b, mg.field_x[var2], rg.field_c[var2], pb.field_h[var2], bd.field_m[var2], var5);
        }
        gk.a(param0 ^ 27773);
        if (param0 != 23793) {
            return null;
        }
        return var1;
    }

    final static void a(int param0, vb param1, int param2) {
        th var5 = ed.field_q;
        var5.h(param0, 0);
        var5.field_h = var5.field_h + 1;
        int var4 = var5.field_h;
        var5.c(param2, param2 + -2);
        var5.c(param1.field_n, -1);
        var5.c(param1.field_p, -1);
        var5.f(param1.field_j, -32287);
        var5.f(param1.field_q, -32287);
        var5.f(param1.field_h, -32287);
        var5.f(param1.field_o, -32287);
        int discarded$0 = var5.a(var4, (byte) 119);
        var5.d(-var4 + var5.field_h, (byte) -122);
    }

    public static void a(int param0) {
        int var1 = 12 % ((-66 - param0) / 59);
        field_l = null;
    }

    final static cd a(byte[] param0, byte param1) {
        if (param0 == null) {
            return null;
        }
        if (param1 < 100) {
            return null;
        }
        cd var2 = new cd(param0, mg.field_x, rg.field_c, pb.field_h, bd.field_m, be.field_f);
        gk.a(12428);
        return var2;
    }

    vi() {
        ((vi) this).field_h = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new tf();
    }
}
