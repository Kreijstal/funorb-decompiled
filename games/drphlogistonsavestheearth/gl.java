/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl extends RuntimeException {
    String field_d;
    static int[] field_g;
    static String field_f;
    static nh[] field_e;
    static he[] field_b;
    static int field_c;
    Throwable field_a;

    final static void a(int param0, int param1, byte param2, int param3, int param4, nh param5) {
        try {
            ph.field_e = -2;
            af.field_d = param0;
            hf.field_z = param5;
            ca.field_db = param1;
            ac.field_a = 15;
            fe.field_a = 10;
            ib.field_l = 3072;
            hd.field_B = 30;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "gl.B(" + param0 + 44 + param1 + 44 + -96 + 44 + 15 + 44 + 30 + 44 + (param5 != null ? "{...}" : "null") + 44 + -2 + 44 + 10 + 44 + 3072 + 41);
        }
    }

    public static void a() {
        field_f = null;
        field_e = null;
        field_g = null;
        field_b = null;
    }

    gl(Throwable param0, String param1) {
        ((gl) this).field_d = param1;
        ((gl) this).field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Create a free account to start using this feature";
        field_g = new int[8192];
        field_b = new he[1];
        field_c = -1;
    }
}
