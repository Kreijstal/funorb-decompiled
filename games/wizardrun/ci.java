/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci {
    static int[] field_b;
    static int[] field_a;
    static String field_c;

    public static void a(boolean param0) {
        field_c = null;
        field_a = null;
        field_b = null;
    }

    final static void a(int param0, va param1) {
        int var2_int = 0;
        try {
            if (param0 != 2026380485) {
                ci.a(false);
            }
            ki.field_M = param1.j(-14477) << 5;
            var2_int = param1.f(255);
            ki.field_M = ki.field_M + (var2_int >> 3);
            lj.field_a = 1835008 & var2_int << 18;
            lj.field_a = lj.field_a + (param1.j(-14477) << 2);
            var2_int = param1.f(255);
            lj.field_a = lj.field_a + (var2_int >> 6);
            bi.field_a = (var2_int & 63) << 15;
            bi.field_a = bi.field_a + (param1.f(255) << 7);
            var2_int = param1.f(param0 ^ 2026380346);
            ia.field_j = var2_int << 16 & 65536;
            bi.field_a = bi.field_a + (var2_int >> 1);
            ia.field_j = ia.field_j + param1.j(-14477);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "ci.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(byte param0) {
        if (10 == ml.field_t) {
          ik.g(5);
          ml.field_t = 11;
          if (param0 < -123) {
            cb.field_c = true;
            return;
          } else {
            field_b = null;
            cb.field_c = true;
            return;
          }
        } else {
          if (!hd.g((byte) 100)) {
            ik.g(5);
            ml.field_t = 11;
            if (param0 >= -123) {
              field_b = null;
              cb.field_c = true;
              return;
            } else {
              cb.field_c = true;
              return;
            }
          } else {
            if (param0 < -123) {
              cb.field_c = true;
              return;
            } else {
              field_b = null;
              cb.field_c = true;
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[8192];
        field_a = new int[12];
        field_c = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
    }
}
