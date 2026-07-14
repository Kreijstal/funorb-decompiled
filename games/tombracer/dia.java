/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dia extends ela {
    static gq field_o;
    static float[] field_p;
    static char field_q;
    static float[] field_r;

    public static void a(boolean param0) {
        field_o = null;
        if (!param0) {
            field_r = null;
            field_p = null;
            field_r = null;
            return;
        }
        field_p = null;
        field_r = null;
    }

    final static ka a(boolean param0, int param1, boolean param2, byte param3) {
        if (param0) {
            return ola.field_Ib[param1];
        }
        if (param3 < 119) {
            field_q = 'ﾶ';
            if (!(!param2)) {
                return mma.field_b[param1];
            }
            return jma.field_a[param1];
        }
        if (!(!param2)) {
            return mma.field_b[param1];
        }
        return jma.field_a[param1];
    }

    final bfa a(bfa[] param0, int param1) {
        if (param1 != 0) {
            return null;
        }
        return new bfa((Object) (Object) sj.a((byte) 120));
    }

    dia(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new float[2];
        field_r = new float[4];
        field_q = ',';
    }
}
