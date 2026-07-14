/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc {
    static int[] field_a;
    static volatile int field_b;

    public static void a(int param0) {
        field_a = null;
        if (param0 < 84) {
            Object var2 = null;
            tg discarded$0 = nc.a((String) null, (gk) null, (String) null, 120);
        }
    }

    final static tg a(String param0, gk param1, String param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        if (param3 != 0) {
          return null;
        } else {
          var4 = param1.a(param2, false);
          var5 = param1.a(var4, param0, param3 ^ 125);
          return u.a(0, param1, var5, var4);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[8192];
        field_b = 0;
    }
}
