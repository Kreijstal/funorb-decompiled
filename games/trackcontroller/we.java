/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class we {
    static String field_a;
    static long field_c;
    static String field_b;

    final static void a(int param0, java.applet.Applet param1) {
        kc.a(param1, param0 ^ 1263, "");
        if (param0 != 0) {
          we.a((byte) 108);
          q.a(param1, param0 + -1);
          return;
        } else {
          q.a(param1, param0 + -1);
          return;
        }
    }

    final static void a(int param0, int param1, int param2, na param3) {
        if (param1 <= 64) {
            Object var5 = null;
            we.a(-85, 1, -73, (na) null);
        }
    }

    final static void a(int param0, aj param1, byte param2) {
        int var6 = 0;
        int var7 = TrackController.field_F ? 1 : 0;
        la var8 = ra.field_C;
        la var9 = var8;
        var9.c(param0, 7);
        var9.field_k = var9.field_k + 1;
        int var4 = var9.field_k;
        var9.a(1, (byte) -119);
        var9.b(param1.field_q, (byte) -127);
        var9.b(param1.field_p, (byte) -120);
        var9.b(param1.field_n, (byte) -119);
        var9.b(false, param1.field_r);
        var9.b(false, param1.field_k);
        var9.b(false, param1.field_l);
        var9.b(false, param1.field_i);
        var9.a(param1.field_o.length, (byte) -75);
        int var5 = 18 % ((param2 - 54) / 62);
        for (var6 = 0; param1.field_o.length > var6; var6++) {
            var8.b(false, param1.field_o[var6]);
        }
        int discarded$0 = var9.a(var4, false);
        var9.a(true, var9.field_k - var4);
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        if (param0 < 15) {
            field_a = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_b = "Email (Login):";
    }
}
