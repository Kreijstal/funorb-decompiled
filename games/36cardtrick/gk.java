/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gk {
    static int field_a;
    static qk field_d;
    static String field_e;
    static String field_c;
    static volatile int field_b;

    public static void c(int param0) {
        field_e = null;
        field_d = null;
        if (param0 != 0) {
            field_a = -93;
            field_c = null;
            return;
        }
        field_c = null;
    }

    abstract long a(int param0);

    final int a(long param0, int param1) {
        long var4 = 0L;
        if (param1 > -124) {
          L0: {
            gk.c(25);
            var4 = ((gk) this).a(0);
            if (var4 > 0L) {
              wk.a((byte) -104, var4);
              break L0;
            } else {
              break L0;
            }
          }
          return ((gk) this).a(param0, false);
        } else {
          L1: {
            var4 = ((gk) this).a(0);
            if (var4 > 0L) {
              wk.a((byte) -104, var4);
              break L1;
            } else {
              break L1;
            }
          }
          return ((gk) this).a(param0, false);
        }
    }

    abstract int a(long param0, boolean param1);

    abstract void b(int param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_c = "Loading...";
        field_b = 0;
    }
}
