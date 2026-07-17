/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa implements be {
    static int field_e;
    static double field_b;
    static String field_a;
    static km field_c;
    static String field_f;
    static km field_d;

    final static void a() {
        hg var2 = gk.field_g;
        var2.g(11, 8);
        var2.a(1, 99);
        var2.a(3, 125);
    }

    final static void a(byte param0, int param1, byte[] param2, int param3, boolean param4, int param5) {
        hg var6 = null;
        int var8 = 0;
        int var9 = 0;
        try {
            int var7 = 0;
            var6 = gk.field_g;
            var6.g(11, 8);
            var6.field_l = var6.field_l + 1;
            var8 = var6.field_l;
            var6.a(4, -66);
            var6.a(param5, 72);
            var9 = 0;
            var9 += 128;
            var6.a(var9, -95);
            var6.a(param2, param2.length, 0, (byte) 81);
            var6.b(var6.field_l - var8, -1);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "qa.A(" + 78 + 44 + 0 + 44 + (param2 != null ? "{...}" : "null") + 44 + 11 + 44 + 1 + 44 + param5 + 41);
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 8342) {
          qa.a(-64);
          field_d = null;
          field_f = null;
          field_c = null;
          return;
        } else {
          field_d = null;
          field_f = null;
          field_c = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "You do not have a suitable number of players for the current options.";
        field_b = 0.0;
        field_f = "To report a player, click on the most suitable option from the Rules of Conduct. Please do not abuse this form.";
    }
}
