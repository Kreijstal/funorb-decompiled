/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl {
    static String field_f;
    static boolean field_h;
    static String field_d;
    static String field_b;
    static String field_e;
    static int field_c;
    static int field_a;
    static ri field_g;

    public static void b(int param0) {
        field_e = null;
        field_d = null;
        if (param0 != 0) {
            bl.a(-38);
        }
        field_b = null;
        field_g = null;
        field_f = null;
    }

    final static int c(int param0) {
        if (param0 >= -38) {
            return -76;
        }
        return mc.field_e + -ch.field_i;
    }

    final static ja a(byte param0, int param1, ul param2, int param3) {
        if (!ud.a(param1, param2, param3, (byte) -42)) {
            return null;
        }
        if (param0 != 50) {
            return null;
        }
        return gl.a(15);
    }

    final synchronized static long a(byte param0) {
        long var1 = System.currentTimeMillis();
        if (param0 < 38) {
            return 127L;
        }
        if ((var1 ^ -1L) > (he.field_e ^ -1L)) {
            vn.field_b = vn.field_b + (-var1 + he.field_e);
        }
        he.field_e = var1;
        return vn.field_b + var1;
    }

    final static void a(int param0) {
        int[] var13 = null;
        int[] var11 = null;
        int[] var9 = null;
        int[] var7 = null;
        int[] var4 = null;
        int[] var1 = null;
        int var2 = 0;
        int[] var14 = null;
        int[] var12 = null;
        int[] var10 = null;
        int[] var8 = null;
        int[] var5 = null;
        int var6 = 0;
        int var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (pl.field_I == sp.field_g) {
            return;
        }
        if (!(!lb.a((byte) 53, pl.field_I))) {
            gk.a(2, pl.field_I).b((byte) 69);
        }
        gk.field_b = 0;
        if (param0 != -9) {
            return;
        }
        pl.field_I = sp.field_g;
        if (bi.field_e) {
            wp.field_h = null;
            hh.field_b = false;
            cp.field_K = false;
            df.field_I = false;
            bi.field_e = false;
            af.field_e = null;
            np.field_m = null;
            pp.field_n = false;
        }
        if (cg.field_l) {
            var13 = k.field_n;
            var11 = var13;
            var9 = var11;
            var7 = var9;
            var4 = var7;
            var1 = var4;
            for (var2 = 0; (var2 ^ -1) > -9; var2++) {
                var13[var2] = 0;
            }
            var14 = fc.field_m;
            var12 = var14;
            var10 = var12;
            var8 = var10;
            var5 = var8;
            var1 = var5;
            var6 = 0;
            var2 = var6;
            while (-9 < (var6 ^ -1)) {
                var14[var6] = 0;
                var6++;
            }
            cg.field_l = false;
        }
        if (ch.field_k) {
            ld.j(param0 + 1481707577);
            wc.i(-28264);
            cf.d(-8328);
            ch.field_k = false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = false;
        field_f = "Withdraw invitation to <%0> to join this game";
        field_b = "Unpacking levels";
        field_c = -1;
        field_d = "Your zombie will screech like the devil, making humans tremble with fear and unable to move!";
        field_e = "Rated games are available to members only. To become a member and gain access to all the research, please visit the 'Account' section of the website.";
        field_a = 0;
    }
}
