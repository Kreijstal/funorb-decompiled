/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg extends o {
    int field_r;
    static rk[] field_v;
    int field_q;
    static int field_s;
    String[][] field_t;
    static um field_o;
    int field_k;
    int[][] field_j;
    int field_m;
    boolean field_l;
    int field_u;
    int field_p;
    static String field_n;

    public static void c(byte param0) {
        field_o = null;
        field_n = null;
        field_v = null;
        int var1 = -24 % ((-47 - param0) / 56);
    }

    final static void a(byte param0, di param1) {
        if (!(param1 != null)) {
            return;
        }
        tl.field_Fb = param1;
        rh.field_c.field_I.e(param0 ^ 31039);
        rh.field_c.a((byte) 126, tl.field_Fb);
        if (param0 != -18) {
            return;
        }
        try {
            an.field_c = true;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "pg.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static vg a(int param0) {
        if (param0 != -12316) {
            return (vg) null;
        }
        return new vg(jb.f(param0 ^ -12410), kb.j(param0 + 12205));
    }

    pg() {
    }

    static {
        field_n = "Concluded";
    }
}
