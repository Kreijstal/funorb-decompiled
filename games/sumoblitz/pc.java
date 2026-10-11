/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    static ri field_c;
    static String field_a;
    static jn field_d;
    static ri[] field_b;

    public static void a(int param0) {
        field_a = null;
        if (param0 > 1) {
          field_b = null;
          field_d = null;
          field_c = null;
          return;
        }
        field_c = (ri) null;
        field_b = null;
        field_d = null;
        field_c = null;
    }

    final static int a(int param0, byte param1) {
        if (param1 >= -22) {
          return -76;
        }
        if (param0 == 6406) {
          return 1;
        }
        if (6409 == param0) {
          return 1;
        }
        if (param0 == 32841) {
          return 1;
        }
        if (6410 == param0) {
          return 2;
        }
        if (6407 == param0) {
          return 3;
        }
        if (param0 != 6408) {
          throw new IllegalArgumentException("");
        }
        return 4;
    }

    static {
        field_a = "This password contains your email address, and would be easy to guess";
    }
}
