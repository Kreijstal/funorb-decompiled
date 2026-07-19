/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rl extends jl {
    boolean field_t;
    static long field_x;
    static int[] field_u;
    boolean field_w;
    static String field_s;
    volatile boolean field_v;
    private static String field_z;

    abstract int f(byte param0);

    abstract byte[] e(byte param0);

    public static void c(int param0) {
        field_u = null;
        if (param0 > -90) {
            rl.c(69);
            field_s = null;
            return;
        }
        field_s = null;
    }

    rl() {
        this.field_v = true;
    }

    static {
        field_z = "rl.C(";
        field_s = null;
        field_u = new int[]{0, 0, 0, -65536, 0, 0, 0, 65536, 0, 0, 0, -65536};
    }
}
