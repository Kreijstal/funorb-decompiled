/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te extends vd implements nk, qk {
    static se field_E;
    static bd[] field_G;
    private wg field_H;
    private cj field_L;
    static ij field_M;
    static gb field_J;
    static int field_K;
    private ph field_I;
    static int[] field_F;

    final static void a(java.awt.Component param0, int param1) {
        param0.removeMouseListener((java.awt.event.MouseListener) (Object) jc.field_b);
        param0.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) jc.field_b);
        int var2 = -15 / ((31 - param1) / 48);
        param0.removeFocusListener((java.awt.event.FocusListener) (Object) jc.field_b);
        mk.field_I = 0;
    }

    final static void a(boolean param0) {
        if (!param0) {
            te.j(-69);
            ri.field_p.c(0, 0);
            return;
        }
        ri.field_p.c(0, 0);
    }

    private final String k(int param0) {
        if (param0 != 4897) {
            field_E = null;
            return "</col></u>";
        }
        return "</col></u>";
    }

    public final void a(int param0, int param1, int param2, ph param3, byte param4) {
        int var6 = -3 % ((param4 - -63) / 52);
        if (!(((te) this).field_I != param3)) {
            ul.e((byte) -25);
            ((te) this).field_H.g((byte) -120);
        }
    }

    public static void j(int param0) {
        Object var2 = null;
        field_G = null;
        field_F = null;
        if (param0 != 0) {
          var2 = null;
          te.a((java.awt.Component) null, -11);
          field_M = null;
          field_J = null;
          return;
        } else {
          field_M = null;
          field_J = null;
          return;
        }
    }

    final boolean a(int param0, ag param1, int param2, char param3) {
        if (super.a(param0, param1, param2, param3)) {
          return true;
        } else {
          if (param2 == 98) {
            return ((te) this).a(param1, (byte) -74);
          } else {
            if (99 != param2) {
              return false;
            } else {
              return ((te) this).b((byte) -78, param1);
            }
          }
        }
    }

    public final void a(int param0, int param1, cj param2, int param3) {
        int var6 = 0;
        var6 = HostileSpawn.field_I ? 1 : 0;
        if (param0 == -2) {
          if (param1 != 0) {
            if ((param1 ^ -1) != -2) {
              if ((param1 ^ -1) != -3) {
                return;
              } else {
                l.a("conduct.ws", (byte) -123);
                return;
              }
            } else {
              l.a("privacy.ws", (byte) 114);
              return;
            }
          } else {
            l.a("terms.ws", (byte) 127);
            return;
          }
        } else {
          field_E = null;
          if (param1 != 0) {
            if ((param1 ^ -1) != -2) {
              if ((param1 ^ -1) != -3) {
                return;
              } else {
                l.a("conduct.ws", (byte) -123);
                return;
              }
            } else {
              l.a("privacy.ws", (byte) 114);
              return;
            }
          } else {
            l.a("terms.ws", (byte) 127);
            return;
          }
        }
    }

    te(wg param0) {
        super(0, 0, 288, 0, (nn) null);
        ((te) this).field_H = param0;
        ((te) this).field_I = new ph(jf.field_e, (mh) null);
        ((te) this).field_I.field_h = (nn) (Object) new ke();
        String var7 = vg.a(new String[2], 89, s.field_a);
        int var3 = 20;
        cn var4 = new cn(jd.field_s, 0, 0, 0, 0, 16777215, -1, 3, 0, jd.field_s.field_y, -1, 2147483647, true);
        ((te) this).field_L = new cj(var7, (nn) (Object) var4);
        ((te) this).field_L.field_i = "";
        ((te) this).field_L.a(-1, jg.field_e, 0);
        ((te) this).field_L.a(-1, jg.field_e, 1);
        ((te) this).field_L.field_p = (mh) this;
        ((te) this).field_L.field_s = ((te) this).field_s - 40;
        ((te) this).field_L.a(true, ((te) this).field_s - 40, 26, var3);
        var3 = var3 + (15 + ((te) this).field_L.field_x);
        ((te) this).a(51448, (ag) (Object) ((te) this).field_L);
        int var5 = 4;
        int var6 = 200;
        ((te) this).field_I.a(var6, var3, 0, -var6 + 300 >> 1567048097, 40);
        ((te) this).field_I.field_p = (mh) this;
        ((te) this).a(51448, (ag) (Object) ((te) this).field_I);
        ((te) this).a(300, 0, 0, 0, var3 - (-55 - var5));
    }

    private final String e(byte param0) {
        if (param0 > -24) {
            String discarded$0 = this.e((byte) 48);
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = null;
        field_K = 0;
        field_F = new int[4];
        field_F[2] = 100;
        field_F[1] = 200;
        field_F[0] = 200;
        field_F[3] = 2;
    }
}
