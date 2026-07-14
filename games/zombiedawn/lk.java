/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk extends pm {
    private fj field_h;
    static String field_j;
    static String field_k;
    static int field_f;
    private boolean field_i;
    private String field_g;

    final static void a(boolean param0, int param1) {
        if (param1 < 61) {
            field_f = 84;
            pn.a(false, (byte) -55, param0);
            return;
        }
        pn.a(false, (byte) -55, param0);
    }

    final static ln e(int param0) {
        if (param0 != 16516) {
            return null;
        }
        return (ln) (Object) new ab();
    }

    public static void d(int param0) {
        field_k = null;
        field_j = null;
        if (param0 != 1029) {
            ln discarded$0 = lk.e(-104);
        }
    }

    final rh a(String param0, int param1) {
        if (((lk) this).field_h.a(param0, param1) == uc.field_b) {
            return uc.field_b;
        }
        if (param0.equals((Object) (Object) ((lk) this).field_g)) {
            return !((lk) this).field_i ? uc.field_b : mc.field_g;
        }
        tk var3 = um.a((byte) 110, param0);
        if (!(var3.a(36))) {
            return gj.field_v;
        }
        ((lk) this).field_g = param0;
        ((lk) this).field_i = var3.a(false);
        return !((lk) this).field_i ? uc.field_b : mc.field_g;
    }

    lk(tb param0, tb param1) {
        super(param0);
        ((lk) this).field_i = false;
        ((lk) this).field_g = "";
        ((lk) this).field_h = new fj(param0, param1);
    }

    final String a(String param0, byte param1) {
        if (param1 > -94) {
            field_k = null;
            if (((lk) this).field_h.a(param0, 2) == uc.field_b) {
                return ((lk) this).field_h.a(param0, (byte) -119);
            }
            if (!(((lk) this).a(param0, 2) != uc.field_b)) {
                return ng.field_d;
            }
            return sd.field_c;
        }
        if (((lk) this).field_h.a(param0, 2) == uc.field_b) {
            return ((lk) this).field_h.a(param0, (byte) -119);
        }
        if (!(((lk) this).a(param0, 2) != uc.field_b)) {
            return ng.field_d;
        }
        return sd.field_c;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Back";
    }
}
