/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de extends mb {
    static String field_sb;
    static ck field_ob;
    static String[] field_pb;
    static String[] field_rb;
    static String field_qb;

    public static void g(boolean param0) {
        field_qb = null;
        field_ob = null;
        field_pb = null;
        field_sb = null;
        field_rb = null;
    }

    final void b(fi param0, byte param1) {
        try {
            super.b(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "de.S(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    de(je param0, fi param1) {
        super(param0, param1, 33, 20, 30);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_qb = "Age:";
    }
}
