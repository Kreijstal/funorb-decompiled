/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qn {
    static java.awt.Canvas field_f;
    static String[] field_b;
    private wb[] field_c;
    static boolean[] field_d;
    static wi field_e;
    static String field_h;
    static boolean field_a;
    static int field_g;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = -18 % ((-62 - param3) / 63);
        kn.a(param1, this.field_c, (byte) -34, param4, param2, param0);
    }

    private qn() throws Throwable {
        throw new Error();
    }

    public static void a(int param0) {
        field_f = null;
        field_b = null;
        field_d = null;
        if (param0 != 0) {
          qn.a(-30);
          field_h = null;
          field_e = null;
          return;
        } else {
          field_h = null;
          field_e = null;
          return;
        }
    }

    static {
        field_d = new boolean[25];
        field_h = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_g = 0;
    }
}
