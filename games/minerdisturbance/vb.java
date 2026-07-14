/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vb {
    static int field_b;
    static String field_d;
    static ta field_c;
    static String field_a;

    abstract g a(byte param0);

    public static void a(int param0) {
        field_a = null;
        if (param0 != -7672) {
            vb.a(119);
            field_d = null;
            field_c = null;
            return;
        }
        field_d = null;
        field_c = null;
    }

    abstract byte[] a(int param0, int param1);

    abstract int a(byte param0, int param1);

    final static void a(ea param0, int param1) {
        ti.a((byte) 126);
        eh.a(param0.field_D, param0.field_x, param0.field_A);
        if (param1 < 124) {
            vb.a(-15);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Create a free account to start using this feature";
        field_c = new ta();
        field_a = "Connection lost - attempting to reconnect";
    }
}
