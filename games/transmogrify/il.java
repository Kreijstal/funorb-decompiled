/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il {
    static int[][] field_c;
    static String field_a;
    static String field_b;

    final static int b(byte param0) {
        if (param0 != -20) {
            int discarded$0 = il.b((byte) 61);
            return vd.field_a;
        }
        return vd.field_a;
    }

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        if (param0 != -24) {
            il.a((byte) -33);
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Okay";
        field_b = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
    }
}
