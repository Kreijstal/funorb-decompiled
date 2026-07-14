/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fob implements dja {
    static int field_c;
    static int field_a;
    static String field_d;
    static String field_b;

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            field_c = -32;
            return (tv[]) (Object) new eka[param1];
        }
        return (tv[]) (Object) new eka[param1];
    }

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        if (param0 < 49) {
            fob.a(-57);
        }
    }

    public final tv a(byte param0) {
        int var2 = 73 % ((-64 - param0) / 50);
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 20;
        field_d = "Please enter a year between <%0> and <%1>";
        field_b = "Toggle shields";
        field_a = 640;
    }
}
