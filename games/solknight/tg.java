/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg extends pj {
    static o field_J;
    static o field_I;
    static String field_K;

    public static void a(int param0) {
        field_K = null;
        field_I = null;
        if (param0 != 22722) {
            return;
        }
        field_J = null;
    }

    final static String a(boolean param0, int param1, CharSequence param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = SolKnight.field_L ? 1 : 0;
        var3 = uc.a(param0, param2, 0);
        if (param1 <= -95) {
          if (var3 != null) {
            return var3;
          } else {
            var4 = 0;
            L0: while (true) {
              if (var4 < param2.length()) {
                if (wg.a(param2.charAt(var4), (byte) -127)) {
                  var4++;
                  continue L0;
                } else {
                  return ah.field_b;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          return null;
        }
    }

    final static ce a(String param0, int param1) {
        if (td.field_h.a(false)) {
            if (!param0.equals((Object) (Object) td.field_h.b(28903))) {
                td.field_h = hh.a(param0, false);
            }
        }
        int var2 = -48 / ((44 - param1) / 48);
        return td.field_h;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        ((tg) this).field_F = !((tg) this).field_F ? true : false;
        super.a(param0, param1, param2, param3);
    }

    tg(String param0, dg param1, boolean param2) {
        this(param0, param1);
        ((tg) this).field_F = param2 ? true : false;
    }

    private tg(String param0, dg param1) {
        this(param0, ph.field_f.field_i, param1);
        ((tg) this).field_w = ph.field_f.field_r;
    }

    private tg(String param0, j param1, dg param2) {
        super(param0, param1, param2);
        ((tg) this).field_w = ph.field_f.field_r;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = new o(540, 140);
        field_I = new o(270, 70);
        field_K = "Unfortunately your configuration doesn't support fullscreen mode.";
    }
}
