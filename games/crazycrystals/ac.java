/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac extends nf {
    private int field_h;
    static dl field_j;
    private int field_i;
    static String field_k;

    final f a(boolean param0, int param1, int param2, int param3, ta param4) {
        ((ac) this).field_i = ((ac) this).field_i + param3;
        if (param0) {
            return null;
        }
        ((ac) this).field_h = ((ac) this).field_h + 1;
        return (f) (!q.field_a[ma.field_n[param1]].a((byte) 105, param2) ? new gh(bm.field_g, 0, 0) : new cd(bm.field_g, 0, 0, 0, 0));
    }

    final static byte[] a(byte[] param0, int param1, int param2, byte param3) {
        byte[] var8 = null;
        int var5_int = 0;
        byte[] var4 = null;
        int var7 = CrazyCrystals.field_B;
        if (-1 <= (param1 ^ -1)) {
            var4 = param0;
        } else {
            var8 = new byte[param2];
            var4 = var8;
            for (var5_int = 0; var5_int < param2; var5_int++) {
                var8[var5_int] = param0[param1 + var5_int];
            }
        }
        ah var5 = new ah();
        var5.b((byte) 117);
        var5.a((byte) -82, (long)(8 * param2), var4);
        if (param3 != -127) {
            return null;
        }
        byte[] var6 = new byte[64];
        var5.a(var6, true, 0);
        return var6;
    }

    final pb b(byte param0) {
        if (param0 >= -127) {
            return null;
        }
        return (pb) (Object) new fg();
    }

    public static void d(byte param0) {
        if (param0 != 23) {
            return;
        }
        field_j = null;
        field_k = null;
    }

    final static String c(int param0) {
        if (lc.field_c == l.field_b) {
            return dg.field_a;
        }
        int var1 = 17 % ((param0 - -79) / 38);
        if (!(gk.field_e.b(-67))) {
            return gk.field_e.a(120);
        }
        if (!(sg.field_b != l.field_b)) {
            return gk.field_e.a(124);
        }
        return jd.field_G;
    }

    final void a(byte param0) {
        tb.field_d.a(lp.field_b, 100, ((ac) this).field_h * 48 * gi.field_m, ((ac) this).field_i / ((ac) this).field_h);
        ((ac) this).field_i = 0;
        ((ac) this).field_h = 0;
        int var2 = -33 % ((29 - param0) / 42);
    }

    ac() {
        ((ac) this).field_i = 0;
        ((ac) this).field_h = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Enter the name you'd prefer. This is the name displayed to other players.";
    }
}
