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

    final static void a(String param0, int param1) {
        System.out.println("Error: " + qf.a(param0, 0, "%0a", "\n"));
        if (param1 <= 106) {
            u.a(11);
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_e = null;
        field_d = null;
        field_b = null;
        field_a = null;
        if (param0 >= -71) {
            return;
        }
        field_c = null;
    }

    static {
        field_d = new qf();
        field_c = new jj();
        field_f = "Unpacking levels";
        field_b = "Shielding: 20";
        field_g = 0;
        field_a = new ci(128, 160);
    }
}
