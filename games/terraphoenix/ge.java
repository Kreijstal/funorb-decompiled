/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ge {
    static int field_e;
    static String field_f;
    static oa field_a;
    static String field_c;
    static Boolean field_d;
    static int field_b;

    public static void a(int param0) {
        field_f = null;
        field_d = null;
        field_c = null;
        field_a = null;
        if (param0 <= -102) {
            return;
        }
        field_b = -22;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = Terraphoenix.field_V;
        if (param0 != -1) {
          return -89;
        } else {
          L0: {
            if (param1 <= param2) {
              break L0;
            } else {
              var3 = param2;
              param2 = param1;
              param1 = var3;
              break L0;
            }
          }
          L1: while (true) {
            if (-1 == (param1 ^ -1)) {
              return param2;
            } else {
              var3 = param2 % param1;
              param2 = param1;
              param1 = var3;
              continue L1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_a = new oa();
        field_b = 608;
    }
}
