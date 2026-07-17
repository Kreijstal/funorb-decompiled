/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fq extends hq {
    static ck field_d;
    hu[] field_g;
    static qc field_f;
    static String field_e;

    final static void a(int param0, int param1) {
        if (param0 != 16440) {
            return;
        }
        lf.a(param1, (byte) -58);
    }

    fq(hu[] param0) {
        try {
            ((fq) this).field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "fq.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_d = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new ck();
        field_f = new qc();
        field_e = "multiplier: ";
    }
}
