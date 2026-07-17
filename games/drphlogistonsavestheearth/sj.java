/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj {
    String field_e;
    boolean field_d;
    static he[] field_f;
    static byte[][] field_c;
    static String field_b;
    static char field_g;
    String field_a;

    public static void a() {
        field_c = null;
        field_f = null;
        field_b = null;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        var3 = param2 >>> 31;
        if (param0 >= -57) {
          field_c = null;
          return -var3 + (var3 + param2) / param1;
        } else {
          return -var3 + (var3 + param2) / param1;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "You have 1 unread message!";
        field_c = new byte[50][];
    }
}
