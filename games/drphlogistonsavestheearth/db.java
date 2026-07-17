/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db {
    static sa field_d;
    static String field_g;
    static he[] field_b;
    int field_c;
    static nh field_e;
    static int field_a;
    static String field_f;

    public final String toString() {
        throw new IllegalStateException();
    }

    db(int param0) {
        ((db) this).field_c = param0;
    }

    public static void a(byte param0) {
        field_d = null;
        field_e = null;
        field_f = null;
        field_g = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Next";
        field_a = 0;
        field_f = "Unable to connect to the data server. Please check any firewall you are using.";
        field_d = new sa(8, 0, 4, 1);
    }
}
