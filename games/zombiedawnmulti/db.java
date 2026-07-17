/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db {
    static th field_a;
    static int field_e;
    static re field_b;
    static int field_c;
    static String field_d;

    public static void a() {
        field_a = null;
        field_b = null;
        field_d = null;
    }

    final static void a(go param0, int param1, java.awt.Component param2, gd param3) {
        try {
            kk.a(22050, true, 22050, (byte) 119, param2, param0, 1024, param3);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "db.A(" + (param0 != null ? "{...}" : "null") + 44 + 22050 + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 44 + 1024 + 44 + 1 + 41);
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
