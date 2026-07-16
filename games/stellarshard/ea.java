/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea extends lk {
    static int field_p;
    static pb field_m;
    static pb field_l;
    private ae field_q;
    static ua field_o;
    static String field_k;
    static String field_n;

    final static void a(int param0, nf param1, byte param2) {
        int var5 = 0;
        int var6 = stellarshard.field_B;
        ha var7 = pg.field_fb;
        ha var8 = var7;
        var8.f(param0, 950);
        var8.field_k = var8.field_k + 1;
        int var4 = var8.field_k;
        var8.a(false, 1);
        var8.c(param1.field_u, -123);
        var8.c(param1.field_s, -123);
        var8.c(param1.field_q, -118);
        var8.b(0, param1.field_l);
        var8.b(0, param1.field_p);
        var8.b(0, param1.field_t);
        var8.b(0, param1.field_n);
        var8.a(false, param1.field_m.length);
        for (var5 = 0; param1.field_m.length > var5; var5++) {
            var7.b(0, param1.field_m[var5]);
        }
        if (param2 != 80) {
            ea.e((byte) 58);
        }
        int discarded$0 = var8.c(var4, (byte) -3);
        var8.a(-var4 + var8.field_k, (byte) -124);
    }

    final static int f(byte param0) {
        int var1 = -76 % ((param0 - 48) / 43);
        return (int)(1000000000L / ph.field_B);
    }

    final String b(byte param0, String param1) {
        w var3_ref_w = null;
        if (!(!(((ea) this).field_q instanceof je))) {
            var3_ref_w = ((je) (Object) ((ea) this).field_q).a((byte) 54);
            if (!(var3_ref_w == null)) {
                if (var3_ref_w.b(-28036) == lg.field_c) {
                    if (!(param1.equals((Object) (Object) ((ea) this).field_q.field_m))) {
                        return lc.field_o;
                    }
                }
                return var3_ref_w.c(-22773);
            }
        }
        int var3 = -99 / ((20 - param0) / 40);
        if (!(param1.equals((Object) (Object) ((ea) this).field_q.field_m))) {
            return lc.field_o;
        }
        return null;
    }

    public static void g(byte param0) {
        field_n = null;
        field_o = null;
        field_m = null;
        field_k = null;
        if (param0 != 117) {
            int discarded$0 = ea.f((byte) 34);
        }
        field_l = null;
    }

    final static void e(byte param0) {
        int var1 = 0;
        int var2 = stellarshard.field_B;
        qb.field_k = qb.field_k - te.field_c;
        te.field_c = 0;
        if (param0 < 79) {
            ea.g((byte) 66);
        }
        for (var1 = 0; 1000 > var1; var1++) {
            a.field_h[var1] = null;
        }
        for (var1 = 0; (var1 ^ -1) > -3001; var1++) {
            wk.field_b[var1] = null;
        }
        for (var1 = 0; (var1 ^ -1) > -1001; var1++) {
            hf.field_e[var1] = null;
        }
        gh.field_b = 0;
        e.field_e = -1;
        nc.field_H = 0;
        s.field_i = false;
    }

    final cg a(byte param0, String param1) {
        w var3 = null;
        if (((ea) this).field_q instanceof je) {
            var3 = ((je) (Object) ((ea) this).field_q).a((byte) 30);
            if (var3 != null) {
                if (!(var3.b(-28036) == lg.field_c)) {
                    return qj.field_c;
                }
            }
        }
        if (param0 < 10) {
            ea.g((byte) 85);
        }
        return !param1.equals((Object) (Object) ((ea) this).field_q.field_m) ? qj.field_c : lg.field_c;
    }

    ea(ae param0, ae param1) {
        super(param0);
        ((ea) this).field_q = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new ua(2);
        field_k = "Unpacking models";
        field_n = "Data server full or too many connections from your address. Please try again in a few minutes.";
    }
}
