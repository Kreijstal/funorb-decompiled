/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db {
    static th field_a;
    static int field_e;
    static re field_b;
    static int field_c;
    static String field_d;

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        field_d = null;
    }

    final static void a(go param0, int param1, java.awt.Component param2, gd param3, int param4, boolean param5) {
        try {
            kk.a(param1, true, param1, (byte) 119, param2, param0, param4, param3);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "db.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + 1 + 41);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new th();
        field_b = new re();
        field_d = "Sceptic";
        field_c = 256;
    }
}
