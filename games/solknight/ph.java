/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ph {
    int field_a;
    static int field_c;
    static qf field_g;
    int field_b;
    static int[] field_h;
    int field_l;
    int field_d;
    int field_j;
    static aj field_f;
    int field_i;
    static String field_e;
    static int field_k;

    abstract void a(int param0, int param1);

    abstract void a(int param0, int param1, int param2);

    public static void a() {
        field_e = null;
        field_g = null;
        field_h = null;
        field_f = null;
    }

    final static void a(int param0, boolean param1) {
        nh.a((byte) -72, true, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new qf();
        field_e = "Quit to website";
    }
}
