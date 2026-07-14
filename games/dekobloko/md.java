/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md extends kf implements rl, vn {
    static String field_S;
    static String[] field_U;
    static int field_Z;
    private qi field_T;
    private ek field_V;
    private wj field_W;
    static String field_Y;
    static w field_X;

    public final void a(qi param0, int param1, int param2, int param3) {
        int var6 = 0;
        var6 = client.field_A ? 1 : 0;
        if (param2 < -87) {
          if (0 != param3) {
            if ((param3 ^ -1) != -2) {
              if (param3 != 2) {
                return;
              } else {
                jg.a(true, "conduct.ws");
                return;
              }
            } else {
              jg.a(true, "privacy.ws");
              return;
            }
          } else {
            jg.a(true, "terms.ws");
            return;
          }
        } else {
          return;
        }
    }

    md(wj param0) {
        super(0, 0, 288, 0, (gl) null);
        ((md) this).field_W = param0;
        ((md) this).field_V = new ek(fa.field_o, (kg) null);
        ((md) this).field_V.field_p = (gl) (Object) new fk();
        String var7 = cm.a((byte) 118, i.field_a, new String[2]);
        int var3 = 20;
        a var4 = new a(hh.field_e, 0, 0, 0, 0, 16777215, -1, 3, 0, hh.field_e.field_R, -1, 2147483647, true);
        ((md) this).field_T = new qi(var7, (gl) (Object) var4);
        ((md) this).field_T.field_B = "";
        ((md) this).field_T.a(rb.field_i, 0, 1);
        ((md) this).field_T.a(rb.field_i, 1, 1);
        ((md) this).field_T.field_t = -40 + ((md) this).field_t;
        ((md) this).field_T.field_v = (kg) this;
        ((md) this).field_T.c(15, 26, var3, ((md) this).field_t + -40);
        var3 = var3 + (((md) this).field_T.field_y + 15);
        ((md) this).b((ce) (Object) ((md) this).field_T, (byte) -55);
        int var5 = 4;
        int var6 = 200;
        ((md) this).field_V.b(40, var6, 300 - var6 >> -1381308543, var3, -16555);
        ((md) this).field_V.field_v = (kg) this;
        ((md) this).b((ce) (Object) ((md) this).field_V, (byte) -55);
        ((md) this).b(var5 + 55 + var3, 300, 0, 0, -16555);
    }

    final static String a(int param0, String param1, boolean param2) {
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        wb var8 = null;
        wb var9 = null;
        uf var10 = null;
        CharSequence var11 = null;
        uf stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        uf stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        uf stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        uf stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        uf stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        uf stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        uf stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        uf stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        var6 = client.field_A ? 1 : 0;
        var11 = (CharSequence) (Object) param1;
        if (dc.a(var11, (byte) -70)) {
          if (2 != jj.field_b) {
            return kl.field_x;
          } else {
            var9 = ed.a(param1, (byte) -94);
            if (var9 == null) {
              return cm.a((byte) 94, wc.field_q, new String[1]);
            } else {
              bh discarded$2 = qi.field_S.a(64, (bh) (Object) var9);
              L0: while (true) {
                var8 = (wb) (Object) qi.field_S.d(true);
                if (var8 == null) {
                  var9.b((byte) 119);
                  var9.e((byte) 121);
                  field_Z = field_Z - 1;
                  var10 = we.field_b;
                  var10.f(param0, -4);
                  var10.field_n = var10.field_n + 1;
                  var5 = var10.field_n;
                  var10.a(true, 1);
                  var10.a(0, param1);
                  if (param2) {
                    L1: {
                      var7 = null;
                      String discarded$3 = md.a(-20, (String) null, false);
                      stackOut_15_0 = (uf) var10;
                      stackOut_15_1 = var10.field_n + -var5;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_17_1 = stackOut_15_1;
                      stackIn_16_0 = stackOut_15_0;
                      stackIn_16_1 = stackOut_15_1;
                      if (param2) {
                        stackOut_17_0 = (uf) (Object) stackIn_17_0;
                        stackOut_17_1 = stackIn_17_1;
                        stackOut_17_2 = 0;
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        stackIn_18_2 = stackOut_17_2;
                        break L1;
                      } else {
                        stackOut_16_0 = (uf) (Object) stackIn_16_0;
                        stackOut_16_1 = stackIn_16_1;
                        stackOut_16_2 = 1;
                        stackIn_18_0 = stackOut_16_0;
                        stackIn_18_1 = stackOut_16_1;
                        stackIn_18_2 = stackOut_16_2;
                        break L1;
                      }
                    }
                    ((uf) (Object) stackIn_18_0).b(stackIn_18_1, stackIn_18_2 != 0);
                    return null;
                  } else {
                    stackOut_12_0 = (uf) var10;
                    stackOut_12_1 = var10.field_n + -var5;
                    stackOut_12_2 = 1;
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_14_1 = stackOut_12_1;
                    stackIn_14_2 = stackOut_12_2;
                    ((uf) (Object) stackIn_14_0).b(stackIn_14_1, stackIn_14_2 != 0);
                    return null;
                  }
                } else {
                  var8.field_Xb = var8.field_Xb - 1;
                  continue L0;
                }
              }
            }
          }
        } else {
          return ge.field_d;
        }
    }

    private final String g(byte param0) {
        if (param0 != 57) {
            Object var3 = null;
            ((md) this).a((qi) null, -92, 49, 97);
            return "</col></u>";
        }
        return "</col></u>";
    }

    final boolean a(int param0, int param1, ce param2, char param3) {
        if (!(!super.a(-119, param1, param2, param3))) {
            return true;
        }
        if (!(param1 != -99)) {
            return ((md) this).a(param2, (byte) -57);
        }
        if (!(-100 != param1)) {
            return ((md) this).a(32, param2);
        }
        int var5 = -29 / ((-22 - param0) / 49);
        return false;
    }

    public final void a(byte param0, int param1, ek param2, int param3, int param4) {
        if (param0 != 67) {
          L0: {
            field_S = null;
            if (param2 == ((md) this).field_V) {
              in.c((byte) -51);
              ((md) this).field_W.n(69);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (param2 == ((md) this).field_V) {
              in.c((byte) -51);
              ((md) this).field_W.n(69);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final static void a(int param0, int param1, int param2) {
        uf var3 = we.field_b;
        var3.f(param1, -4);
        var3.a(true, 3);
        var3.a(true, param0);
        var3.d(param0 ^ -10, param2);
    }

    private final String h(byte param0) {
        if (param0 != 60) {
            ((md) this).field_W = null;
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    public static void f(byte param0) {
        if (param0 <= 62) {
          field_S = null;
          field_S = null;
          field_U = null;
          field_X = null;
          field_Y = null;
          return;
        } else {
          field_S = null;
          field_U = null;
          field_X = null;
          field_Y = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_U = new String[8];
        field_S = "<%0> has been removed.";
        field_Y = "Specials enabled:";
    }
}
