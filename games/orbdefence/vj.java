/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj {
    static hj field_b;
    static e field_c;
    static String field_a;

    final static boolean a(int param0) {
        if (param0 < 38) {
            boolean discarded$6 = vj.a(-16);
            return cc.field_f == null ? true : false;
        }
        return cc.field_f == null ? true : false;
    }

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        field_b = null;
        int var1 = -106 % ((-70 - param0) / 40);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new hj(640, 480);
        field_c = new e();
    }
}
