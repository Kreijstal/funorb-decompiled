/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hd {
    int field_k;
    static bg field_i;
    int field_a;
    int field_f;
    int field_j;
    int field_b;
    static int field_l;
    static ea[] field_d;
    static String field_c;
    static java.awt.Frame field_h;
    static vf field_g;
    int field_e;

    abstract void a(int param0, int param1);

    final static void a(int param0) {
        on.field_t = new ta();
        if (param0 >= -35) {
            field_l = -104;
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_i = null;
        field_h = null;
        if (param0 <= 7) {
          field_h = (java.awt.Frame) null;
          field_d = null;
          field_g = null;
          return;
        } else {
          field_d = null;
          field_g = null;
          return;
        }
    }

    abstract void a(int param0, int param1, int param2);

    static {
        field_l = 34;
        field_i = new bg(13, 0, 1, 0);
        field_c = "New ore to mine";
    }
}
