/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u {
    static qf field_d;
    static ci[] field_e;
    static jj field_c;
    static int field_g;
    static String field_f;
    static ci field_a;
    static String field_b;

    final static void a(String param0) {
        System.out.println("Error: " + qf.a(param0, 0, "%0a", "\n"));
    }

    public static void a() {
        field_f = null;
        field_e = null;
        field_d = null;
        field_b = null;
        field_a = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new qf();
        field_c = new jj();
        field_f = "Unpacking levels";
        field_b = "Shielding: 20";
        field_g = 0;
        field_a = new ci(128, 160);
    }
}
