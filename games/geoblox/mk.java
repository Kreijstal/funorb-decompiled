/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk extends q {
    private String field_j;
    static wg field_n;
    static int field_l;
    private boolean field_i;
    private n field_m;
    static int[] field_k;

    mk(dj param0, dj param1) {
        super(param0);
        ((mk) this).field_j = "";
        ((mk) this).field_i = false;
        ((mk) this).field_m = new n(param0, param1);
    }

    final static void a(int param0, boolean param1) {
        if (param0 >= 0) {
            mk.a(83, true);
            ih.field_c.a((byte) -110, param1);
            return;
        }
        ih.field_c.a((byte) -110, param1);
    }

    final lh a(int param0, String param1) {
        h var3 = null;
        if (((mk) this).field_m.a(param0, param1) == si.field_m) {
            return si.field_m;
        }
        if (!(param1.equals((Object) (Object) ((mk) this).field_j))) {
            var3 = ci.a(-1, param1);
            if (!(var3.a(-76))) {
                return si.field_n;
            }
            ((mk) this).field_j = param1;
            ((mk) this).field_i = var3.a((byte) -52);
        }
        return ((mk) this).field_i ? kk.field_w : si.field_m;
    }

    final String b(int param0, String param1) {
        if (param0 != 422) {
            mk.c((byte) -50);
            if (!(((mk) this).field_m.a(-257, param1) != si.field_m)) {
                return ((mk) this).field_m.b(422, param1);
            }
            if (!(((mk) this).a(-257, param1) != si.field_m)) {
                return g.field_m;
            }
            return da.field_e;
        }
        if (!(((mk) this).field_m.a(-257, param1) != si.field_m)) {
            return ((mk) this).field_m.b(422, param1);
        }
        if (!(((mk) this).a(-257, param1) != si.field_m)) {
            return g.field_m;
        }
        return da.field_e;
    }

    public static void c(byte param0) {
        field_k = null;
        field_n = null;
        if (param0 != -9) {
            field_k = null;
        }
    }

    final static jg a(int param0, String param1, int param2) {
        int var3 = 111 % ((param0 - 9) / 38);
        cd var4 = new cd();
        ((jg) (Object) var4).field_b = param2;
        ((jg) (Object) var4).field_e = param1;
        return (jg) (Object) var4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new int[]{16407324, 16429852, 11199532, 9487646, 15149096};
    }
}
