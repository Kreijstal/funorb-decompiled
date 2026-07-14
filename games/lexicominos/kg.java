/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg extends nb implements ue, jk {
    private u field_F;
    private bc field_B;
    static hk field_G;
    private kf field_E;
    static int field_C;

    public final void a(int param0, int param1, int param2, int param3, kf param4) {
        if (param2 != 215535458) {
          L0: {
            String discarded$4 = this.h(-91);
            if (((kg) this).field_E == param4) {
              jc.a((byte) 95);
              ((kg) this).field_F.g(true);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (((kg) this).field_E == param4) {
              jc.a((byte) 95);
              ((kg) this).field_F.g(true);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    kg(u param0) {
        super(0, 0, 288, 0, (rd) null);
        ((kg) this).field_F = param0;
        ((kg) this).field_E = new kf(n.field_h, (vd) null);
        ((kg) this).field_E.field_i = (rd) (Object) new v();
        String var7 = da.a(new String[2], ol.field_p, false);
        int var3 = 20;
        ik var4 = new ik(ql.field_Q, 0, 0, 0, 0, 16777215, -1, 3, 0, ql.field_Q.field_E, -1, 2147483647, true);
        ((kg) this).field_B = new bc(var7, (rd) (Object) var4);
        ((kg) this).field_B.field_q = "";
        ((kg) this).field_B.a(wc.field_b, 0, -27371);
        ((kg) this).field_B.a(wc.field_b, 1, -27371);
        ((kg) this).field_B.field_j = -40 + ((kg) this).field_j;
        ((kg) this).field_B.field_r = (vd) this;
        ((kg) this).field_B.b(26, var3, -2, ((kg) this).field_j - 40);
        var3 = var3 + (((kg) this).field_B.field_v - -15);
        ((kg) this).b((byte) 87, (w) (Object) ((kg) this).field_B);
        int var5 = 4;
        int var6 = 200;
        ((kg) this).field_E.a(40, var6, true, var3, 300 + -var6 >> -1907982335);
        ((kg) this).field_E.field_r = (vd) this;
        ((kg) this).b((byte) -127, (w) (Object) ((kg) this).field_E);
        ((kg) this).a(var5 + (55 + var3), 300, true, 0, 0);
    }

    private final String h(int param0) {
        if (param0 != -6724) {
            return null;
        }
        return "</col></u>";
    }

    final static String g(int param0) {
        if (param0 != 0) {
            return null;
        }
        return ig.field_a.c(false);
    }

    public final void a(int param0, bc param1, int param2, int param3) {
        int var6 = 0;
        var6 = Lexicominos.field_L ? 1 : 0;
        if (param0 > 50) {
          if (param2 != 0) {
            if (param2 != -2) {
              if (-3 != param2) {
                return;
              } else {
                jl.a("conduct.ws", (byte) 127);
                return;
              }
            } else {
              jl.a("privacy.ws", (byte) 102);
              return;
            }
          } else {
            jl.a("terms.ws", (byte) -95);
            return;
          }
        } else {
          field_C = 110;
          if (param2 != 0) {
            if (param2 != -2) {
              if (-3 != param2) {
                return;
              } else {
                jl.a("conduct.ws", (byte) 127);
                return;
              }
            } else {
              jl.a("privacy.ws", (byte) 102);
              return;
            }
          } else {
            jl.a("terms.ws", (byte) -95);
            return;
          }
        }
    }

    public static void i(int param0) {
        if (param0 != 300) {
            return;
        }
        field_G = null;
    }

    private final String e(boolean param0) {
        if (!param0) {
            return null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    final boolean a(char param0, int param1, w param2, byte param3) {
        int var5 = 0;
        if (super.a(param0, param1, param2, (byte) -87)) {
          return true;
        } else {
          var5 = -81 % ((-13 - param3) / 55);
          if (param1 == 98) {
            return ((kg) this).a(0, param2);
          } else {
            if (99 == param1) {
              return ((kg) this).c((byte) 119, param2);
            } else {
              return false;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = 480;
    }
}
