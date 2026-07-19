/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vv extends am {
    boolean field_q;
    static hd field_o;
    boolean field_n;
    static int field_r;
    volatile boolean field_p;
    static String field_s;
    private static String field_z;

    abstract byte[] b(int param0);

    public static void g(byte param0) {
        field_s = null;
        field_o = null;
        if (param0 != 18) {
            vv.g((byte) 127);
        }
    }

    abstract int a(int param0);

    vv() {
        this.field_p = true;
    }

    static {
        field_z = "vv.H(";
        field_s = "Suggest muting this player";
    }
}
