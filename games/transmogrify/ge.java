/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ge extends aj implements hl, df {
    private le field_z;
    static sh field_A;
    static boolean field_x;
    private lj field_y;
    private sf field_w;

    final boolean a(int param0, qg param1, byte param2, char param3) {
        int var5 = 0;
        if (!super.a(param0, param1, (byte) -60, param3)) {
          var5 = -29 % ((65 - param2) / 55);
          if ((param0 ^ -1) != -99) {
            if (99 != param0) {
              return false;
            } else {
              return ((ge) this).b(param1, 82);
            }
          } else {
            return ((ge) this).a(2, param1);
          }
        } else {
          return true;
        }
    }

    public static void n(int param0) {
        field_A = null;
        if (param0 != 1843) {
            field_x = false;
        }
    }

    public final void a(lj param0, int param1, int param2, int param3, int param4) {
        Object var7 = null;
        if (param0 != ((ge) this).field_y) {
          if (param1 != 17) {
            var7 = null;
            ((ge) this).a(93, -118, 33, (le) null);
            return;
          } else {
            return;
          }
        } else {
          wj.b(480);
          ((ge) this).field_w.r(77);
          if (param1 == 17) {
            return;
          } else {
            var7 = null;
            ((ge) this).a(93, -118, 33, (le) null);
            return;
          }
        }
    }

    private final String m(int param0) {
        if (param0 >= -51) {
            ((ge) this).field_w = null;
            return "</col></u>";
        }
        return "</col></u>";
    }

    private final String l(int param0) {
        if (param0 != 300) {
            field_x = true;
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    ge(sf param0) {
        super(0, 0, 288, 0, (ui) null);
        ((ge) this).field_w = param0;
        ((ge) this).field_y = new lj(qe.field_I, (ma) null);
        ((ge) this).field_y.field_q = (ui) (Object) new qa();
        String var7 = ij.a(ua.field_b, new String[2], (byte) -123);
        int var3 = 20;
        h var4 = new h(vd.field_h, 0, 0, 0, 0, 16777215, -1, 3, 0, vd.field_h.field_y, -1, 2147483647, true);
        ((ge) this).field_z = new le(var7, (ui) (Object) var4);
        ((ge) this).field_z.field_j = "";
        ((ge) this).field_z.a(mk.field_E, 0, 0);
        ((ge) this).field_z.a(mk.field_E, 0, 1);
        ((ge) this).field_z.field_m = (ma) this;
        ((ge) this).field_z.field_l = ((ge) this).field_l - 40;
        ((ge) this).field_z.a(26, ((ge) this).field_l + -40, -1, var3);
        var3 = var3 + (((ge) this).field_z.field_h + 15);
        ((ge) this).a((qg) (Object) ((ge) this).field_z, (byte) -79);
        int var5 = 4;
        int var6 = 200;
        ((ge) this).field_y.a(36, var3, -var6 + 300 >> 863210625, var6, 40);
        ((ge) this).field_y.field_m = (ma) this;
        ((ge) this).a((qg) (Object) ((ge) this).field_y, (byte) -97);
        ((ge) this).a(86, 0, 0, 300, var5 + (var3 - -55));
    }

    public final void a(int param0, int param1, int param2, le param3) {
        int var6 = 0;
        var6 = Transmogrify.field_A ? 1 : 0;
        if (0 == param2) {
          mh.a(param1 ^ 8389, "terms.ws");
          if (param1 != 2818) {
            field_A = null;
            return;
          } else {
            return;
          }
        } else {
          if (-2 != (param2 ^ -1)) {
            if (param2 != 2) {
              if (param1 != 2818) {
                field_A = null;
                return;
              } else {
                return;
              }
            } else {
              mh.a(param1 ^ 8389, "conduct.ws");
              if (param1 == 2818) {
                return;
              } else {
                field_A = null;
                return;
              }
            }
          } else {
            mh.a(11207, "privacy.ws");
            if (param1 == 2818) {
              return;
            } else {
              field_A = null;
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = true;
        field_A = new sh();
    }
}
