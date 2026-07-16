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

    final static void a(int param0, int param1) {
        hg var2 = gk.field_g;
        var2.g(param1, 8);
        var2.a(1, param0 ^ 96);
        var2.a(param0, 125);
    }

    final static void a(byte param0, int param1, byte[] param2, int param3, boolean param4, int param5) {
        int var7 = 12 % ((param0 - -41) / 56);
        hg var6 = gk.field_g;
        var6.g(param3, 8);
        var6.field_l = var6.field_l + 1;
        int var8 = var6.field_l;
        var6.a(4, -66);
        var6.a(param5, 72);
        int var9 = param1;
        if (!(!param4)) {
            var9 += 128;
        }
        var6.a(var9, -95);
        var6.a(param2, param2.length, 0, (byte) 81);
        var6.b(var6.field_l - var8, -1);
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
