/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf {
    static int field_c;
    static String field_a;
    static hj[] field_b;
    static boolean field_d;

    public static void a(int param0) {
        if (param0 < 84) {
          return;
        }
        field_b = null;
        field_a = null;
    }

    final static int a(int param0, int param1) {
        int var2 = 12 / ((-77 - param1) / 45);
        param0 = param0 & 8191;
        if (param0 < 4096) {
          return param0 >= 2048 ? -th.field_c[param0 - 2048] : th.field_c[2048 - param0];
        }
        return param0 < 6144 ? -th.field_c[6144 - param0] : th.field_c[param0 - 6144];
    }

    static {
        field_a = "This password contains your Player Name, and would be easy to guess";
    }
}
