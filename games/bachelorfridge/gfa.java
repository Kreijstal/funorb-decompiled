/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gfa {
    static String field_g;
    static int field_c;
    static boolean field_i;
    int field_l;
    int field_e;
    int field_h;
    int field_j;
    static String field_k;
    int field_d;
    static wca[] field_a;
    static sna field_f;
    static String field_b;

    final static void a(boolean param0, int param1, int param2, int param3, boolean param4, int param5, boolean param6, boolean param7, int param8, boolean param9, int param10, int param11) {
        oa.a(16777215, param7, 11, 15, param0, param5, 14, param4, 0, 16777215, param6, 13, false, true);
    }

    gfa(int param0, int param1) {
        ((gfa) this).field_h = param0;
        ((gfa) this).field_l = param1;
    }

    public static void a(int param0) {
        field_a = null;
        field_f = null;
        field_k = null;
        field_g = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_k = "Players: ";
        field_a = new wca[50];
        field_g = "Unable to connect to the data server. Please check any firewall you are using.";
        field_b = "Players: <%0>/<%1>";
    }
}
