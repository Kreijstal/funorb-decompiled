/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class o {
    static fd field_f;
    static String field_h;
    static int field_b;
    static w field_a;
    static int[] field_e;
    static int[] field_g;
    static int field_d;
    static String field_c;

    public static void a(boolean param0) {
        field_h = null;
        field_g = null;
        field_e = null;
        field_c = null;
        field_a = null;
        field_f = null;
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (hk.field_i >= param0 + (param3 + param2)) {
          return param3 + param0;
        } else {
          if (-param2 + param3 >= param1) {
            return param3 - param2;
          } else {
            return hk.field_i - param2;
          }
        }
    }

    static {
        field_b = 50;
        field_h = "Add friend";
        field_g = b.h(-123);
        field_c = "Did you know?";
    }
}
