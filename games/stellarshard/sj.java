/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj extends g implements md, oi {
    static n[] field_B;
    private rg field_G;
    private ig field_D;
    static double field_I;
    static int field_K;
    static java.awt.Font field_F;
    static int[] field_J;
    static String field_C;
    private jg field_H;
    static String field_E;

    private final String d(boolean param0) {
        if (param0) {
            ((sj) this).field_H = null;
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    public final void a(int param0, int param1, rg param2, int param3) {
        int var6 = 0;
        Object var7 = null;
        var6 = stellarshard.field_B;
        if (0 != param0) {
          if (-2 == (param0 ^ -1)) {
            sf.a("privacy.ws", param1 + 14);
            if (param1 != -2) {
              var7 = null;
              boolean discarded$4 = ((sj) this).a(100, 104, 'ﾇ', (rj) null);
              return;
            } else {
              return;
            }
          } else {
            if ((param0 ^ -1) == -3) {
              sf.a("conduct.ws", 12);
              if (param1 != -2) {
                var7 = null;
                boolean discarded$5 = ((sj) this).a(100, 104, 'ﾇ', (rj) null);
                return;
              } else {
                return;
              }
            } else {
              if (param1 == -2) {
                return;
              } else {
                var7 = null;
                boolean discarded$6 = ((sj) this).a(100, 104, 'ﾇ', (rj) null);
                return;
              }
            }
          }
        } else {
          sf.a("terms.ws", param1 ^ -14);
          if (param1 == -2) {
            return;
          } else {
            var7 = null;
            boolean discarded$7 = ((sj) this).a(100, 104, 'ﾇ', (rj) null);
            return;
          }
        }
    }

    sj(jg param0) {
        super(0, 0, 288, 0, (uk) null);
        ((sj) this).field_H = param0;
        ((sj) this).field_D = new ig(tc.field_q, (lf) null);
        ((sj) this).field_D.field_u = (uk) (Object) new b();
        String var7 = h.a(nj.field_s, 0, new String[2]);
        int var3 = 20;
        id var4 = new id(si.field_V, 0, 0, 0, 0, 16777215, -1, 3, 0, si.field_V.field_N, -1, 2147483647, true);
        ((sj) this).field_G = new rg(var7, (uk) (Object) var4);
        ((sj) this).field_G.field_x = "";
        ((sj) this).field_G.a(ni.field_b, 0, 1);
        ((sj) this).field_G.a(ni.field_b, 1, 1);
        ((sj) this).field_G.field_v = (lf) this;
        ((sj) this).field_G.field_p = -40 + ((sj) this).field_p;
        ((sj) this).field_G.b(-40 + ((sj) this).field_p, (byte) -11, 26, var3);
        var3 = var3 + (((sj) this).field_G.field_t - -15);
        ((sj) this).b(4, (rj) (Object) ((sj) this).field_G);
        int var5 = 4;
        int var6 = 200;
        ((sj) this).field_D.b(var6, 300 + -var6 >> -705686431, var3, 40, 23987);
        ((sj) this).field_D.field_v = (lf) this;
        ((sj) this).b(4, (rj) (Object) ((sj) this).field_D);
        ((sj) this).b(300, 0, 0, 55 + var3 - -var5, 23987);
    }

    public final void a(int param0, int param1, ig param2, boolean param3, int param4) {
        if (!(((sj) this).field_D != param2)) {
            ai.a((byte) 70);
            ((sj) this).field_H.o(3);
        }
        if (param3) {
            field_F = null;
            return;
        }
    }

    private final String a(int param0) {
        if (param0 != 0) {
            field_I = -0.873653220573416;
            return "</col></u>";
        }
        return "</col></u>";
    }

    public static void e(byte param0) {
        field_F = null;
        field_J = null;
        field_E = null;
        field_B = null;
        field_C = null;
        if (param0 != 23) {
            sj.e((byte) 57);
        }
    }

    final boolean a(int param0, int param1, char param2, rj param3) {
        if (super.a(param0 ^ 0, param1, param2, param3)) {
            return true;
        }
        if (param0 != 29657) {
            field_J = null;
            if ((param1 ^ -1) == -99) {
                return ((sj) this).a(param3, -8666);
            }
            if (99 == param1) {
                return ((sj) this).a(param3, (byte) 90);
            }
            return false;
        }
        if ((param1 ^ -1) == -99) {
            return ((sj) this).a(param3, -8666);
        }
        if (!(99 != param1)) {
            return ((sj) this).a(param3, (byte) 90);
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = Math.atan2(1.0, 0.0);
        field_C = "Friends can be added in multiplayer<nbsp>games";
        field_E = "Please try again in a few minutes.";
    }
}
