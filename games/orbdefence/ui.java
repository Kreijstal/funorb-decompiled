/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui extends RuntimeException {
    String field_d;
    static int[][] field_a;
    static pf field_b;
    Throwable field_c;
    static String field_e;
    private static String field_z;

    public static void a(int param0) {
        field_a = null;
        field_e = null;
        field_b = null;
    }

    ui(Throwable param0, String param1) {
        ((ui) this).field_d = param1;
        ((ui) this).field_c = param0;
    }

    final static boolean a(boolean param0) {
        return mg.field_m == tg.field_c;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "ui.B(";
        field_a = new int[][]{new int[5], new int[5], new int[5], new int[5], new int[5], new int[5], new int[5]};
        field_e = "Orb Defence";
    }
}
