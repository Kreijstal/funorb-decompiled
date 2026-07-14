/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nk extends ta {
    static int[] field_s;
    boolean field_w;
    boolean field_v;
    static String field_q;
    static vh field_u;
    static boolean field_t;
    volatile boolean field_r;
    private static String field_z;

    abstract byte[] c(byte param0);

    abstract int b(int param0);

    public static void a(int param0) {
        field_q = null;
        field_s = null;
        field_u = null;
        if (param0 != 256) {
            nk.a(41);
        }
    }

    nk() {
        ((nk) this).field_r = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "nk.B(";
        field_q = "You have 1 unread message!";
        field_t = false;
        field_s = new int[256];
    }
}
