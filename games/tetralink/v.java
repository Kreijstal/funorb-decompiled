/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v extends mc {
    int field_t;
    int field_s;
    static je field_z;
    boolean field_u;
    static hl field_A;
    static ah field_v;
    int field_q;
    String[][] field_p;
    static String field_w;
    int field_o;
    static rb field_x;
    int field_B;
    static int field_r;
    int[][] field_y;
    int field_n;

    final static void a(int param0) {
        int var1 = -74 / ((param0 + 57) / 45);
        if (32 >= wb.field_c) {
          qn.a(0, 128);
          return;
        }
        int var2 = wb.field_c % 32;
        if (var2 == 0) {
          var2 = 32;
        }
        qn.a(wb.field_c - var2, 128);
    }

    public static void b(byte param0) {
        int var1 = 8 % ((param0 + 24) / 61);
        field_A = null;
        field_x = null;
        field_w = null;
        field_z = null;
        field_v = null;
    }

    v() {
    }

    static {
        field_w = "Loading extra data";
    }
}
