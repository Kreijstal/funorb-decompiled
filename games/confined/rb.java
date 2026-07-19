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

    public static void b(byte param0) {
        field_i = null;
        field_d = null;
        field_g = null;
        if (param0 != -90) {
          field_g = (String) null;
          field_h = null;
          field_a = null;
          return;
        } else {
          field_h = null;
          field_a = null;
          return;
        }
    }

    final void a(byte param0) {
        if (param0 <= 100) {
            return;
        }
        fn.a(this.field_f, this.field_b, this.field_c);
    }

    static {
        field_i = "Good #luck.";
        field_g = "V";
        field_a = new boolean[64];
        field_h = "Sound: ";
        field_d = "Cancel";
    }
}
