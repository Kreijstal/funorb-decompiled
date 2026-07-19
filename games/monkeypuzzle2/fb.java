/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fb extends bf {
    boolean field_m;
    static String field_i;
    static int field_k;
    volatile boolean field_j;
    static long field_n;
    boolean field_l;
    private static String field_z;

    abstract byte[] e(int param0);

    abstract int a(boolean param0);

    public static void a(byte param0) {
        field_i = null;
        if (param0 != -61) {
            fb.a((byte) 7);
        }
    }

    fb() {
        this.field_j = true;
    }

    static {
        field_z = "fb.F(";
        field_i = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
}
