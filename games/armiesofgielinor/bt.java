/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bt {
    static String[] field_c;
    static int field_f;
    static String field_b;
    static int field_g;
    static String field_a;
    static kl field_e;
    static String field_d;

    final static void b(int param0) {
        if (param0 != 0) {
          bt.c(83);
          wb.a(true, (byte) 32, cd.field_e, qk.field_b);
          se.field_f = true;
          return;
        } else {
          wb.a(true, (byte) 32, cd.field_e, qk.field_b);
          se.field_f = true;
          return;
        }
    }

    public static void c(int param0) {
        field_c = null;
        field_e = null;
        field_d = null;
        field_a = null;
        field_b = null;
        if (param0 != 0) {
            bt.b(3);
        }
    }

    final static void a(int param0) {
        ft var1 = null;
        ft var2 = null;
        int var3 = 0;
        int var4 = 0;
        kr.field_E = new dm();
        kr.field_E.i(1);
        var1 = kr.field_E.b((byte) -72);
        if (var1 == null) {
          return;
        } else {
          var2 = kr.field_E.h((byte) 94);
          if (var2 != null) {
            var3 = 9 % ((param0 - -41) / 55);
            var4 = kr.field_E.h(-10754);
            if ((var4 ^ -1) > -1) {
              return;
            } else {
              if (null != kr.field_E.field_N) {
                if (kr.field_E.field_N.length == 0) {
                  return;
                } else {
                  gb.a(var4, 5, var1.field_k, var2.field_k, var1.field_n, var2.field_n, kr.field_E.field_N, -52);
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
        field_b = "<%0> rune";
        field_a = "You need to play 1 more rated game to unlock this option.";
        field_d = "MP";
    }
}
