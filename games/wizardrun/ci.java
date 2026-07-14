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
        if (param0) {
            ci.a((byte) 31);
        }
    }

    final static void a(int param0, va param1) {
        int var2 = 0;
        if (param0 != 2026380485) {
          ci.a(false);
          ki.field_M = param1.j(-14477) << 2026380485;
          var2 = param1.f(255);
          ki.field_M = ki.field_M + (var2 >> 508716803);
          lj.field_a = 1835008 & var2 << -1329807918;
          lj.field_a = lj.field_a + (param1.j(-14477) << -1794847134);
          var2 = param1.f(255);
          lj.field_a = lj.field_a + (var2 >> 1484079942);
          bi.field_a = (var2 & 63) << -367736145;
          bi.field_a = bi.field_a + (param1.f(255) << -1586968409);
          var2 = param1.f(param0 ^ 2026380346);
          ia.field_j = var2 << -1915604368 & 65536;
          bi.field_a = bi.field_a + (var2 >> 966965537);
          ia.field_j = ia.field_j + param1.j(-14477);
          return;
        } else {
          ki.field_M = param1.j(-14477) << 2026380485;
          var2 = param1.f(255);
          ki.field_M = ki.field_M + (var2 >> 508716803);
          lj.field_a = 1835008 & var2 << -1329807918;
          lj.field_a = lj.field_a + (param1.j(-14477) << -1794847134);
          var2 = param1.f(255);
          lj.field_a = lj.field_a + (var2 >> 1484079942);
          bi.field_a = (var2 & 63) << -367736145;
          bi.field_a = bi.field_a + (param1.f(255) << -1586968409);
          var2 = param1.f(param0 ^ 2026380346);
          ia.field_j = var2 << -1915604368 & 65536;
          bi.field_a = bi.field_a + (var2 >> 966965537);
          ia.field_j = ia.field_j + param1.j(-14477);
          return;
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
