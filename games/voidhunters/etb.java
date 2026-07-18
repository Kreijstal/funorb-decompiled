/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class etb implements dja {
    static String field_a;
    static String field_b;

    public final tv a(byte param0) {
        int var2 = -63 / ((-64 - param0) / 50);
        return (tv) (Object) new aqa();
    }

    final static java.awt.Container b(int param0) {
        if (null != ira.field_c) {
            return (java.awt.Container) (Object) ira.field_c;
        }
        return (java.awt.Container) (Object) vpa.b((byte) -122);
    }

    final static boolean a(int param0) {
        return jpa.field_a;
    }

    public static void b(byte param0) {
        field_a = null;
        int var1 = 0;
        field_b = null;
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            return null;
        }
        return (tv[]) (Object) new aqa[param1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "More power plants";
        jga discarded$0 = new jga();
        field_b = "More sawblades";
    }
}
