/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class li {
    int field_b;
    int field_d;
    static char[] field_c;
    int field_h;
    int field_g;
    static int[][] field_e;
    int field_a;
    int field_f;
    private static String field_z;

    abstract void a(int param0, int param1);

    public static void a(int param0) {
        field_e = null;
        if (param0 < 66) {
            li.a(78);
            field_c = null;
            return;
        }
        field_c = null;
    }

    abstract void a(int param0, int param1, int param2);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "li.E(";
        field_c = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    }
}
