/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh {
    static String field_a;
    static String field_b;

    final static void a(byte param0, int param1, String param2, String param3, String param4, int param5) {
        pgb var6 = null;
        if (param0 >= -12) {
          field_a = null;
          var6 = new pgb(param5, param3, param1, param2, param4);
          fpb.a(var6, 0);
          return;
        } else {
          var6 = new pgb(param5, param3, param1, param2, param4);
          fpb.a(var6, 0);
          return;
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 15261) {
            field_b = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Spawn Spawnpoint";
        field_a = "<%0> won the match!";
    }
}
