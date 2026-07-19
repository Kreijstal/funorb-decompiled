/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi {
    static String field_c;
    int field_a;
    boolean field_g;
    ed field_e;
    int field_b;
    static java.awt.Color field_f;
    static int[] field_h;
    static long[] field_d;
    static String field_i;

    wi(int param0, int param1, int param2, int param3) {
        this.field_e = new ed(param0, param1);
        this.field_b = param2;
        this.field_a = param3;
        this.field_g = true;
    }

    public static void a(int param0) {
        field_c = null;
        field_h = null;
        if (param0 != 64) {
          wi.a(66);
          field_i = null;
          field_f = null;
          field_d = null;
          return;
        } else {
          field_i = null;
          field_f = null;
          field_d = null;
          return;
        }
    }

    static {
        field_c = "Username: ";
        field_h = new int[]{64, 40, 48, 64, 64};
        field_f = new java.awt.Color(10040319);
        field_d = new long[32];
    }
}
