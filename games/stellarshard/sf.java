/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sf {
    static cg field_a;
    static int field_b;
    static int[] field_d;
    static String field_e;
    static pg field_f;
    static be field_c;

    public static void a(boolean param0) {
        field_c = null;
        field_f = null;
        field_d = null;
        field_e = null;
        field_a = null;
    }

    final static void a(String param0, int param1) {
        try {
            kl.field_o = param0;
            rh.a(param1, (byte) -72);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "sf.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static boolean b(boolean param0) {
        if (dg.field_z == null) {
            return false;
        }
        if (null == dg.field_z.d((byte) -92)) {
            return false;
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new cg();
        field_e = "OK";
        field_d = new int[128];
        field_c = new be();
    }
}
