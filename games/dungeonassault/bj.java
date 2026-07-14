/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj extends da {
    static String field_J;
    static boolean field_G;
    static String[] field_H;
    static String field_I;
    static ef field_K;
    static cn field_F;

    final static String a(int param0, int param1) {
        if (param1 <= 29) {
          bj.i(58);
          return 1 + param0 + "/" + en.field_a.length;
        } else {
          return 1 + param0 + "/" + en.field_a.length;
        }
    }

    private bj(int param0, int param1, int param2, int param3, ca param4, pg param5, lm param6) {
        super(param0, param1, param2, param3, param4, param5);
        ((bj) this).field_D = param6;
    }

    final void a(int param0, boolean param1, int param2, lm param3, int param4, int param5) {
        oi var7 = null;
        oi var8 = null;
        super.a(param0, param1, param2, param3, param4, param5);
        var8 = ah.field_b;
        var7 = var8;
        if (var8 != null) {
          if (((bj) this).a(param5, param4, param0, -1, param2)) {
            if (!(((bj) this).field_n instanceof qo)) {
              if (!(var8.field_n instanceof qo)) {
                return;
              } else {
                ((qo) (Object) var8.field_n).a((bj) this, var8, false);
                ah.field_b = null;
                return;
              }
            } else {
              ((qo) (Object) ((bj) this).field_n).a((bj) this, var8, false);
              ah.field_b = null;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void i(int param0) {
        if (!tl.field_l) {
          throw new IllegalStateException();
        } else {
          oj.field_b = true;
          t.a(true, 0);
          if (param0 <= 71) {
            bj.h(-16);
            kh.field_n = 0;
            return;
          } else {
            kh.field_n = 0;
            return;
          }
        }
    }

    public static void h(int param0) {
        field_J = null;
        if (param0 != 31029) {
          bj.i(54);
          field_K = null;
          field_H = null;
          field_I = null;
          field_F = null;
          return;
        } else {
          field_K = null;
          field_H = null;
          field_I = null;
          field_F = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "Raiders cost you 5 Treasure less to recruit.";
        field_I = "Waiting for game to start. Select an entrance or use special abilities.";
        field_H = new String[]{"Retreat", "Automatically retreat. (Single use)"};
        field_K = new ef();
    }
}
