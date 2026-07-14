/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w extends dqa implements ln, oo {
    static int field_y;
    private htb field_w;
    static dja field_v;
    private sn field_z;
    private kja field_x;

    private final String j(byte param0) {
        if (param0 >= -25) {
            ((w) this).field_z = null;
            return "</col></u>";
        }
        return "</col></u>";
    }

    public final void a(int param0, int param1, int param2, kja param3) {
        int var6 = 0;
        var6 = VoidHunters.field_G;
        if (param0 == -1) {
          if (0 != param2) {
            if ((param2 ^ -1) != -2) {
              if (param2 != 2) {
                return;
              } else {
                vba.a(param0 + 13, "conduct.ws");
                return;
              }
            } else {
              vba.a(12, "privacy.ws");
              return;
            }
          } else {
            vba.a(12, "terms.ws");
            return;
          }
        } else {
          ((w) this).field_x = null;
          if (0 != param2) {
            if ((param2 ^ -1) != -2) {
              if (param2 != 2) {
                return;
              } else {
                vba.a(param0 + 13, "conduct.ws");
                return;
              }
            } else {
              vba.a(12, "privacy.ws");
              return;
            }
          } else {
            vba.a(12, "terms.ws");
            return;
          }
        }
    }

    w(sn param0) {
        super(0, 0, 288, 0, (wwa) null);
        ((w) this).field_z = param0;
        ((w) this).field_w = new htb(tn.field_b, (sba) null);
        ((w) this).field_w.field_q = (wwa) (Object) new vva();
        String var7 = isa.a(hm.field_o, new String[2], 81);
        int var3 = 20;
        bob var4 = new bob(loa.field_o, 0, 0, 0, 0, 16777215, -1, 3, 0, loa.field_o.field_k, -1, 2147483647, true);
        ((w) this).field_x = new kja(var7, (wwa) (Object) var4);
        ((w) this).field_x.field_p = "";
        ((w) this).field_x.a(0, -1, pma.field_q);
        ((w) this).field_x.a(1, -1, pma.field_q);
        ((w) this).field_x.field_l = (sba) this;
        ((w) this).field_x.field_h = -40 + ((w) this).field_h;
        ((w) this).field_x.a(-40 + ((w) this).field_h, var3, 26, (byte) -23);
        var3 = var3 + (15 + ((w) this).field_x.field_f);
        ((w) this).b(-18756, (shb) (Object) ((w) this).field_x);
        int var5 = 4;
        int var6 = 200;
        ((w) this).field_w.a(-var6 + 300 >> 1870425441, var6, 40, 1, var3);
        ((w) this).field_w.field_l = (sba) this;
        ((w) this).b(-18756, (shb) (Object) ((w) this).field_w);
        ((w) this).a(0, 300, var3 - (-55 - var5), 1, 0);
    }

    final static void a(int param0, byte param1) {
        faa var2 = dpa.field_p;
        var2.h(24335, param0);
        var2.c(0, 1);
        int var3 = -52 / ((-27 - param1) / 35);
        var2.c(0, 0);
    }

    final boolean a(int param0, int param1, shb param2, char param3) {
        if (super.a(param0, param1, param2, param3)) {
          return true;
        } else {
          if (param1 != -99) {
            if (-100 != param1) {
              return false;
            } else {
              return ((w) this).a(true, param2);
            }
          } else {
            return ((w) this).a(param2, 0);
          }
        }
    }

    public final void a(int param0, int param1, int param2, htb param3, int param4) {
        L0: {
          if (((w) this).field_w == param3) {
            cnb.f((byte) -74);
            ((w) this).field_z.l((byte) -106);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 11) {
          w.a(-96, (byte) -47);
          return;
        } else {
          return;
        }
    }

    public static void i(byte param0) {
        if (param0 != 77) {
            field_y = 91;
            field_v = null;
            return;
        }
        field_v = null;
    }

    private final String c(boolean param0) {
        if (!param0) {
            return null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = (dja) (Object) new bn();
    }
}
