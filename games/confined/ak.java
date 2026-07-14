/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak extends ga implements el {
    private String[] field_H;
    private rg[] field_Q;
    static String field_P;
    static String[] field_L;
    static String field_O;
    private pg field_R;

    public final void a(int param0, int param1, int param2, rg param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        var7 = Confined.field_J ? 1 : 0;
        if (param0 > 68) {
          var6 = 0;
          L0: while (true) {
            if (((ak) this).field_H.length <= var6) {
              if (((ak) this).field_Q[((ak) this).field_H.length] == param3) {
                ((ak) this).field_R.a((byte) -120);
                return;
              } else {
                return;
              }
            } else {
              if (((ak) this).field_Q[var6] == param3) {
                ((ak) this).field_R.a(11579568, ((ak) this).field_H[var6]);
                var6++;
                var6++;
                continue L0;
              } else {
                var6++;
                var6++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(byte param0, String[] param1) {
        int var3 = 0;
        int var4_int = 0;
        hk var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = Confined.field_J ? 1 : 0;
        ((ak) this).field_N.e(31);
        if (param1 != null) {
          if (param1.length != 0) {
            var3 = param1.length;
            ((ak) this).field_H = new String[var3];
            var4_int = 0;
            L0: while (true) {
              if (var3 <= var4_int) {
                var4 = new hk(gm.field_cb, 0, 1);
                ((ak) this).field_Q = new rg[var3 - -1];
                var5 = 0;
                L1: while (true) {
                  if (var3 <= var5) {
                    ((ak) this).field_Q[var3] = new rg(eh.field_A, (uk) this);
                    ((ak) this).field_Q[var3].field_n = (fe) (Object) var4;
                    if (param0 > -126) {
                      field_L = null;
                      ((ak) this).field_Q[var3].a(-114, 100, 20 + (var3 - -1) * 16, 15, 0);
                      ((ak) this).b((fj) (Object) ((ak) this).field_Q[var3], 10);
                      return;
                    } else {
                      ((ak) this).field_Q[var3].a(-114, 100, 20 + (var3 - -1) * 16, 15, 0);
                      ((ak) this).b((fj) (Object) ((ak) this).field_Q[var3], 10);
                      return;
                    }
                  } else {
                    ((ak) this).field_Q[var5] = new rg(((ak) this).field_H[var5], (uk) this);
                    ((ak) this).field_Q[var5].field_n = (fe) (Object) var4;
                    ((ak) this).field_Q[var5].field_C = field_O;
                    ((ak) this).field_Q[var5].a(-125, 80, 20 + 16 * var5, 15, 0);
                    ((ak) this).b((fj) (Object) ((ak) this).field_Q[var5], 10);
                    var5++;
                    continue L1;
                  }
                }
              } else {
                ((ak) this).field_H[var4_int] = am.a(72, (CharSequence) (Object) param1[var4_int]).replace(' ', ' ');
                var4_int++;
                continue L0;
              }
            }
          } else {
            ((ak) this).field_H = null;
            return;
          }
        } else {
          ((ak) this).field_H = null;
          return;
        }
    }

    final boolean a(fj param0, byte param1, int param2, char param3) {
        int var5 = 0;
        var5 = -101 / ((47 - param1) / 43);
        if (!super.a(param0, (byte) 99, param2, param3)) {
          if ((param2 ^ -1) == -99) {
            return ((ak) this).c(param0, 32);
          } else {
            if (99 == param2) {
              return ((ak) this).a(17731, param0);
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    public static void j(int param0) {
        int var1 = -100 / ((param0 - -50) / 48);
        field_L = null;
        field_P = null;
        field_O = null;
    }

    ak(pg param0) {
        super(0, 0, 0, 0, (fe) null);
        ((ak) this).field_R = param0;
    }

    final static void a(double param0, double[] param1, dj param2, int param3, oi param4, mn param5) {
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        Object var15 = null;
        if (param3 != 4825) {
          var15 = null;
          ak.a(1.1248923326487368, (double[]) null, (dj) null, -35, (oi) null, (mn) null);
          var7 = param2.field_E + param2.field_C * param1[9];
          var9 = param2.field_C * param1[10] + param2.field_t;
          var11 = param2.field_D + param2.field_C * param1[11];
          param4.field_p = var11;
          var13 = param0 * 0.4;
          param4.field_o = var9;
          param4.field_t = var7;
          param4.field_u = var13 * 25.0;
          param5.a((rk) (Object) param4, (byte) -65);
          return;
        } else {
          var7 = param2.field_E + param2.field_C * param1[9];
          var9 = param2.field_C * param1[10] + param2.field_t;
          var11 = param2.field_D + param2.field_C * param1[11];
          param4.field_p = var11;
          var13 = param0 * 0.4;
          param4.field_o = var9;
          param4.field_t = var7;
          param4.field_u = var13 * 25.0;
          param5.a((rk) (Object) param4, (byte) -65);
          return;
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        ok var5 = null;
        super.a(param0, param1, (byte) 97, param3);
        if (param2 >= 36) {
          if (param1 != 0) {
            return;
          } else {
            L0: {
              var5 = gm.field_cb;
              if (((ak) this).field_H != null) {
                int discarded$2 = var5.a(qd.field_a, ((ak) this).field_q + param3, ((ak) this).field_m + param0, ((ak) this).field_F, 20, 16777215, -1, 0, 0, var5.field_C + var5.field_D);
                break L0;
              } else {
                break L0;
              }
            }
            return;
          }
        } else {
          field_O = null;
          if (param1 != 0) {
            return;
          } else {
            L1: {
              var5 = gm.field_cb;
              if (((ak) this).field_H != null) {
                int discarded$3 = var5.a(qd.field_a, ((ak) this).field_q + param3, ((ak) this).field_m + param0, ((ak) this).field_F, 20, 16777215, -1, 0, 0, var5.field_C + var5.field_D);
                break L1;
              } else {
                break L1;
              }
            }
            return;
          }
        }
    }

    final static void a(int param0, java.awt.Component param1) {
        param1.removeMouseListener((java.awt.event.MouseListener) (Object) tf.field_a);
        param1.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) tf.field_a);
        param1.removeFocusListener((java.awt.event.FocusListener) (Object) tf.field_a);
        pe.field_n = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = "Loading models";
        field_L = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_O = "Use this alternative as your account name";
    }
}
