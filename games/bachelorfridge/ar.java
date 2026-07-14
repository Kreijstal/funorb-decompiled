/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ar extends vd implements pc, lja {
    private tea field_F;
    private hf field_E;
    private aha field_D;

    public final void a(int param0, hf param1, int param2, byte param3, int param4) {
        L0: {
          if (param1 == ((ar) this).field_E) {
            tr.a(12);
            ((ar) this).field_F.p(-76);
            break L0;
          } else {
            break L0;
          }
        }
        if (param3 <= 50) {
          ((ar) this).field_D = null;
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, op param4, oo param5) {
        if (param2 < 0) {
            return;
        }
        if (param4.field_z <= param2) {
            return;
        }
        if (param0 < 0) {
            return;
        }
        if (param0 >= param4.field_B) {
            return;
        }
        if (param1 != 31546) {
            return;
        }
        wia var8 = param4.field_a[param2][param0];
        aga var7 = var8.field_l;
        if (!(var7 != null)) {
            return;
        }
        param5.field_o.a((bw) (Object) new iv(new nq(var7), false, 1, 100, 0), true);
    }

    public final void a(int param0, aha param1, int param2, byte param3) {
        int var6 = 0;
        var6 = BachelorFridge.field_y;
        if (param0 == 0) {
          ffa.a("terms.ws", 12);
          if (param3 < 12) {
            ((ar) this).field_F = null;
            return;
          } else {
            return;
          }
        } else {
          if ((param0 ^ -1) == -2) {
            ffa.a("privacy.ws", 12);
            if (param3 >= 12) {
              return;
            } else {
              ((ar) this).field_F = null;
              return;
            }
          } else {
            if (2 != param0) {
              if (param3 < 12) {
                ((ar) this).field_F = null;
                return;
              } else {
                return;
              }
            } else {
              ffa.a("conduct.ws", 12);
              if (param3 >= 12) {
                return;
              } else {
                ((ar) this).field_F = null;
                return;
              }
            }
          }
        }
    }

    private final String a(int param0) {
        if (param0 != -28759) {
            String discarded$0 = this.a(-99);
            return "</col></u>";
        }
        return "</col></u>";
    }

    ar(tea param0) {
        super(0, 0, 288, 0, (qda) null);
        ((ar) this).field_F = param0;
        ((ar) this).field_E = new hf(tj.field_a, (pl) null);
        ((ar) this).field_E.field_f = (qda) (Object) new ff();
        String var7 = lga.a(true, new String[2], aja.field_m);
        int var3 = 20;
        gha var4 = new gha(jca.field_a, 0, 0, 0, 0, 16777215, -1, 3, 0, jca.field_a.field_u, -1, 2147483647, true);
        ((ar) this).field_D = new aha(var7, (qda) (Object) var4);
        ((ar) this).field_D.field_h = "";
        ((ar) this).field_D.a(1, 0, rt.field_b);
        ((ar) this).field_D.a(1, 1, rt.field_b);
        ((ar) this).field_D.field_p = ((ar) this).field_p - 40;
        ((ar) this).field_D.field_k = (pl) this;
        ((ar) this).field_D.a(var3, ((ar) this).field_p + -40, 26, (byte) -50);
        var3 = var3 + (15 + ((ar) this).field_D.field_q);
        ((ar) this).c((wj) (Object) ((ar) this).field_D, -126);
        int var5 = 4;
        int var6 = 200;
        ((ar) this).field_E.a(-var6 + 300 >> 1705577665, 40, (byte) 59, var6, var3);
        ((ar) this).field_E.field_k = (pl) this;
        ((ar) this).c((wj) (Object) ((ar) this).field_E, -127);
        ((ar) this).a(0, var5 + var3 + 55, (byte) 59, 300, 0);
    }

    final boolean a(int param0, int param1, char param2, wj param3) {
        if (this.a(param0, param1, param2, param3)) {
          return true;
        } else {
          if (param1 != -99) {
            if (-100 != param1) {
              return false;
            } else {
              return ((ar) this).b(param3, 1);
            }
          } else {
            return ((ar) this).a(-124, param3);
          }
        }
    }

    private final String d(byte param0) {
        if (param0 > -89) {
            ((ar) this).field_D = null;
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    static {
    }
}
