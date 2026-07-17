/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rb {
    static boolean[] field_a;
    static String field_g;
    java.awt.Image field_e;
    static String field_i;
    int field_b;
    static String field_h;
    int field_c;
    int[] field_f;
    static String field_d;

    abstract void a(byte param0, java.awt.Graphics param1, int param2, int param3);

    abstract void a(java.awt.Component param0, int param1, int param2, int param3);

    public static void b() {
        field_i = null;
        field_d = null;
        field_g = null;
        field_h = null;
        field_a = null;
    }

    final void a(byte param0) {
        if (param0 <= 100) {
            return;
        }
        fn.a(((rb) this).field_f, ((rb) this).field_b, ((rb) this).field_c);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Good #luck.";
        field_g = "V";
        field_a = new boolean[64];
        field_h = "Sound: ";
        field_d = "Cancel";
    }
}
