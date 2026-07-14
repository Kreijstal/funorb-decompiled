/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re extends pe implements ng, qd {
    private pl field_H;
    private kk field_F;
    private ff field_J;
    static wk field_I;
    static va field_G;
    static String field_E;

    private final String a(int param0) {
        if (param0 != 0) {
            return null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    public final void a(int param0, pl param1, int param2, int param3, int param4) {
        L0: {
          if (((re) this).field_H == param1) {
            hc.f(92682);
            ((re) this).field_F.l(param0 + -8792);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != -18905) {
          field_G = null;
          return;
        } else {
          return;
        }
    }

    private final String h(byte param0) {
        if (param0 > -5) {
            return null;
        }
        return "</col></u>";
    }

    final boolean a(char param0, int param1, byte param2, ub param3) {
        if (param2 < -96) {
          if (super.a(param0, param1, (byte) -104, param3)) {
            return true;
          } else {
            if (98 == param1) {
              return ((re) this).a((byte) -117, param3);
            } else {
              if (param1 != 99) {
                return false;
              } else {
                return ((re) this).b(param3, 1);
              }
            }
          }
        } else {
          return true;
        }
    }

    re(kk param0) {
        super(0, 0, 288, 0, (bf) null);
        ((re) this).field_F = param0;
        ((re) this).field_H = new pl(e.field_e, (ce) null);
        ((re) this).field_H.field_w = (bf) (Object) new jl();
        String var7 = di.a(new String[2], (byte) 79, t.field_b);
        int var3 = 20;
        ll var4 = new ll(gh.field_b, 0, 0, 0, 0, 16777215, -1, 3, 0, gh.field_b.field_M, -1, 2147483647, true);
        ((re) this).field_J = new ff(var7, (bf) (Object) var4);
        ((re) this).field_J.field_p = "";
        ((re) this).field_J.a(1, nk.field_R, 0);
        ((re) this).field_J.a(1, nk.field_R, 1);
        ((re) this).field_J.field_s = (ce) this;
        ((re) this).field_J.field_r = -40 + ((re) this).field_r;
        ((re) this).field_J.a(var3, (byte) 61, ((re) this).field_r + -40, 26);
        var3 = var3 + (((re) this).field_J.field_n + 15);
        ((re) this).a((ub) (Object) ((re) this).field_J, (byte) 83);
        int var5 = 4;
        int var6 = 200;
        ((re) this).field_H.a(127, var3, 40, var6, 300 + -var6 >> 1135754337);
        ((re) this).field_H.field_s = (ce) this;
        ((re) this).a((ub) (Object) ((re) this).field_H, (byte) 126);
        ((re) this).a(127, 0, var5 + var3 - -55, 300, 0);
    }

    public static void g(byte param0) {
        field_E = null;
        field_G = null;
        field_I = null;
        if (param0 != -55) {
            Object var2 = null;
            db[] discarded$0 = re.a((kl) null, (String) null, (String) null, -82);
        }
    }

    final static db[] a(kl param0, String param1, String param2, int param3) {
        int var6 = -86 / ((18 - param3) / 59);
        int var4 = param0.b(-1, param1);
        int var5 = param0.a(var4, param2, -11986);
        return ml.a(param0, var5, -26955, var4);
    }

    public final void a(int param0, ff param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        var6 = wizardrun.field_H;
        if (-1 != (param0 ^ -1)) {
          if (1 != param0) {
            if (param0 != 2) {
              var5 = -13 / ((36 - param3) / 53);
              return;
            } else {
              fa.a("conduct.ws", 12);
              var5 = -13 / ((36 - param3) / 53);
              return;
            }
          } else {
            fa.a("privacy.ws", 12);
            var5 = -13 / ((36 - param3) / 53);
            return;
          }
        } else {
          fa.a("terms.ws", 12);
          var5 = -13 / ((36 - param3) / 53);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = new wk();
        field_G = new va(256);
        field_E = "Player Name: ";
    }
}
