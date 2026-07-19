/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah {
    static byte[] field_c;
    static boolean field_h;
    static ch field_f;
    static ih[] field_a;
    static int field_j;
    static int[] field_i;
    static int field_d;
    static lg[] field_g;
    static vd field_b;
    static volatile long field_e;
    private static String field_z;

    public static void a(int param0) {
        if (param0 != 0) {
            ah.a(-83);
        }
        field_a = null;
        field_g = null;
        field_b = null;
        field_c = null;
        field_f = null;
        field_i = null;
    }

    static {
        int var0 = 0;
        field_z = "ah.A(";
        field_c = new byte[65536];
        gl.a(field_c, 0, 65536, (byte) -128);
        field_g = new lg[4];
        field_d = 0;
        field_h = false;
        field_a = new ih[255];
        field_e = 0L;
        field_i = new int[8192];
        for (var0 = 0; var0 < field_a.length; var0++) {
            field_a[var0] = new ih();
        }
    }
}
