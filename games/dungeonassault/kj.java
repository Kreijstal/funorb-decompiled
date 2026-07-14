/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj extends ne {
    int[] field_l;
    static ad field_p;
    static int field_n;
    static String field_m;
    int field_j;
    static String field_k;
    static String field_i;
    static wh field_o;

    final static Object a(boolean param0, boolean param1, byte[] param2) {
        ep var3 = null;
        if (param2 == null) {
            return null;
        }
        if (param0) {
            Object var4 = null;
            Object discarded$0 = kj.a(false, true, (byte[]) null);
        }
        if (!(136 >= param2.length)) {
            var3 = new ep();
            ((un) (Object) var3).a(param2, 105);
            return (Object) (Object) var3;
        }
        if (!param1) {
            return (Object) (Object) param2;
        }
        return (Object) (Object) gg.a((byte) 49, param2);
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = DungeonAssault.field_K;
        ii.a(ln.field_d, (byte) 93, ib.field_e, param1, param0, lc.field_d, true);
        for (var2 = 0; var2 < lc.field_d; var2++) {
            ol.field_k[param0 + var2] = var2;
        }
        ii.a(n.field_d, (byte) -65, da.field_B, param0, param0 + param0, lc.field_d - -param0, false);
        if (!(param0 >= lc.field_d)) {
            lc.field_d = param0;
        }
    }

    final static void a(String param0, boolean param1, int param2, float param3) {
        if (!(null != hg.field_r)) {
            hg.field_r = new wi(lg.field_w, ub.field_o);
            lg.field_w.a((lm) (Object) hg.field_r, -1);
        }
        hg.field_r.a(param1, param0, param3, (byte) 45);
        if (param2 != -2958) {
            kj.a(93);
        }
        gf.a();
        un.a(true, (byte) -106);
    }

    public static void a(int param0) {
        field_m = null;
        field_p = null;
        field_o = null;
        if (param0 > -26) {
            field_n = -19;
        }
        field_k = null;
        field_i = null;
    }

    private kj() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = 0;
        field_m = "Loading extra data";
        field_p = new ad(6, 0, 4, 2);
        field_k = "Checking";
        field_i = "A knight in very nasty-looking, black, skeletal armour, holding a shield with a skull on it and a magical sword. Through countless victorious battles, this raider has gained a mastery over death.";
    }
}
