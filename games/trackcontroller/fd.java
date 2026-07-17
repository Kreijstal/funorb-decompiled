/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fd {
    int field_c;
    int field_j;
    static String field_f;
    static int field_e;
    int field_k;
    int field_b;
    static boolean field_i;
    static le field_h;
    int field_g;
    static qj field_d;
    int field_a;
    private static String field_z;

    public static void a() {
        field_h = null;
        int var1 = 32;
        field_d = null;
        field_f = null;
    }

    abstract void a(int param0, int param1);

    abstract void a(int param0, int param1, int param2);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "fd.B(";
        field_f = "Waiting for fonts";
    }
}
