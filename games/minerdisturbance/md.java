/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md {
    static String field_a;

    final static int a(CharSequence param0, boolean param1) {
        if (!param1) {
            return -9;
        }
        return pd.a(param0, true, true, 10);
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 <= 27) {
            field_a = null;
        }
    }

    final static ea[] a(String param0, bj param1, int param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        if (param2 != 10) {
          return null;
        } else {
          var4 = param1.a(126, param3);
          var5 = param1.a(param0, var4, param2 + -107);
          return ck.a(var5, param2 + 54, var4, param1);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Super Volcano Expansion";
    }
}
