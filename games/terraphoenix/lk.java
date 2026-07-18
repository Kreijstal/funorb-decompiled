/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk {
    static String field_b;
    static String field_c;
    static String field_e;
    static int[] field_a;
    static jb field_d;

    public static void a(int param0) {
        field_c = null;
        field_e = null;
        field_b = null;
        field_a = null;
        field_d = null;
    }

    final static void b(int param0) {
        ia.e((byte) 113);
    }

    final static String c(int param0) {
        String var1 = "";
        if (mb.field_s != null) {
            var1 = mb.field_s.d(false);
        }
        if (var1.length() == 0) {
            var1 = ej.g((byte) 123);
        }
        if (!(var1.length() != 0)) {
            var1 = hd.field_k;
        }
        return var1;
    }

    final static void d(int param0) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Name is available";
        field_c = "Begin Mission";
        field_b = "ACT III, Retaliation";
    }
}
