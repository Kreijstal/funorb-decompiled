/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd {
    static gf field_d;
    static mh field_c;
    static og field_a;
    static String field_b;

    final static jp a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = BrickABrac.field_J ? 1 : 0;
        if (param2 != -6) {
            jp discarded$0 = hd.a(121, -95, (byte) -105);
        }
        jp var6 = new jp(param1, param1);
        jp var3 = var6;
        for (var4 = 0; var4 < var3.field_G.length; var4++) {
            var6.field_G[var4] = param0;
        }
        return var3;
    }

    final static void a(long param0, int param1, int param2) {
        pi var4 = k.field_h;
        var4.e(-13413, param2);
        var4.field_l = var4.field_l + 1;
        int var5 = var4.field_l;
        var4.a(-115, 6);
        if (param1 <= 35) {
            hd.a(true);
        }
        var4.a(-23054, param0);
        var4.d((byte) 121, -var5 + var4.field_l);
    }

    final static void a(int param0, ta param1, int param2, int param3) {
        try {
            lm.field_c = param1;
            int var4_int = -108 % ((46 - param0) / 37);
            hn.field_a = param2;
            bh.field_vb = param3;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "hd.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 41);
        }
    }

    public static void a() {
        field_a = null;
        field_c = null;
        field_b = null;
        field_d = null;
    }

    final static void a(boolean param0) {
        ga.field_i = 12;
        cm.field_s = true;
        tb.field_eb = null;
        rf.field_f = true;
        pp.field_a = 12;
        kb.field_Sb = true;
        wl.field_N = true;
        wc.field_b = true;
        c.field_i = un.field_e;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Unable to delete name - system busy";
    }
}
