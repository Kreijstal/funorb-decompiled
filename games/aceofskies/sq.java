/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sq extends mi {
    sq(String param0, no param1, boolean param2) {
        this(param0, param1);
        try {
            ((sq) this).field_s = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "sq.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        ((sq) this).field_s = !((sq) this).field_s ? true : false;
        super.a(param0 ^ param0, param1, param2, param3);
    }

    private sq(String param0, ir param1, no param2) {
        super(param0, param1, param2);
        try {
            ((sq) this).field_e = ag.field_n.field_g;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "sq.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    private sq(String param0, no param1) {
        this(param0, ag.field_n.field_c, param1);
        try {
            ((sq) this).field_e = ag.field_n.field_g;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "sq.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static wp a(int param0) {
        wp var1 = new wp(pu.field_a, cc.field_i, lh.field_a[0], lg.field_j[0], ji.field_b[0], ee.field_e[0], fk.field_a[0], ud.field_e);
        kf.f(1);
        return var1;
    }

    static {
    }
}
