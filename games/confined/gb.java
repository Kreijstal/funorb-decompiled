/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb {
    static String field_b;
    static int field_d;
    static int[] field_a;
    static String field_c;

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 < 44) {
            field_d = -70;
        }
    }

    final static void a(pm param0, pm param1, byte param2) {
        double var3 = param1.field_E - param0.field_E;
        double var5 = -param0.field_t + param1.field_t;
        int var7 = 50 / ((param2 - 6) / 56);
        double var8 = -param0.field_D + param1.field_D;
        double var10 = var5 * var5 + var3 * var3 + var8 * var8;
        if (!((param1.field_C + param0.field_C) * (param1.field_C + param0.field_C) <= var10)) {
            param0.a(param1, -88);
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        jc.field_g = true;
        var2 = "tuhstatbut";
        var3 = "rvnadlm";
        var4 = -1L;
        if (param0 != -94) {
          field_a = null;
          kn.a(124, param1, var4, var3, var2);
          return;
        } else {
          kn.a(124, param1, var4, var3, var2);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Wing pod";
        field_a = new int[10];
        field_d = 5;
        field_c = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
    }
}
