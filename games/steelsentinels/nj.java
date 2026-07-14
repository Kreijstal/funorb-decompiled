/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj extends dl implements cg, ae {
    static String field_T;
    static byte[] field_Y;
    static int field_V;
    static String field_X;
    static ml field_ab;
    static int field_Q;
    static int field_S;
    static int[] field_U;
    private oa field_W;
    private ma field_Z;
    private fg field_R;
    static String field_P;

    private final String j(int param0) {
        int var2 = 52 / ((param0 - 16) / 60);
        return "</col></u>";
    }

    final static gh a(byte param0) {
        if (param0 >= -81) {
            return null;
        }
        return fk.b((byte) 111);
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        String var4 = null;
        String var5 = null;
        int stackIn_12_0 = 0;
        int stackIn_28_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_10_0 = 0;
        if (param1 == 300) {
          var5 = ri.a(param1 ^ -301, param2);
          if ((param0.indexOf(param2) ^ -1) == 0) {
            if (-1 == param0.indexOf(var5)) {
              if (!param0.startsWith(param2)) {
                if (!param0.startsWith(var5)) {
                  if (!param0.endsWith(param2)) {
                    if (param0.endsWith(var5)) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    stackOut_26_0 = 1;
                    stackIn_28_0 = stackOut_26_0;
                    return stackIn_28_0 != 0;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          field_X = null;
          var4 = ri.a(param1 ^ -301, param2);
          var3 = var4;
          if ((param0.indexOf(param2) ^ -1) == 0) {
            if (-1 == param0.indexOf(var4)) {
              if (!param0.startsWith(param2)) {
                if (!param0.startsWith(var4)) {
                  if (!param0.endsWith(param2)) {
                    if (param0.endsWith(var4)) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    return stackIn_12_0 != 0;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    final static void a(boolean param0, int param1) {
        if (param1 != 40) {
          nj.a(true);
          ok.a(param0, false, param1 ^ 95);
          return;
        } else {
          ok.a(param0, false, param1 ^ 95);
          return;
        }
    }

    nj(fg param0) {
        super(0, 0, 288, 0, (qk) null);
        ((nj) this).field_R = param0;
        ((nj) this).field_W = new oa(ah.field_Sb, (tn) null);
        ((nj) this).field_W.field_p = (qk) (Object) new kh();
        String var7 = db.a(si.field_w, -39, new String[2]);
        int var3 = 20;
        cn var4 = new cn(tj.field_e, 0, 0, 0, 0, 16777215, -1, 3, 0, tj.field_e.field_G, -1, 2147483647, true);
        ((nj) this).field_Z = new ma(var7, (qk) (Object) var4);
        ((nj) this).field_Z.field_v = "";
        ((nj) this).field_Z.a(ph.field_b, 0, -53);
        ((nj) this).field_Z.a(ph.field_b, 1, -65);
        ((nj) this).field_Z.field_x = ((nj) this).field_x - 40;
        ((nj) this).field_Z.field_A = (tn) this;
        ((nj) this).field_Z.a(26, var3, ((nj) this).field_x + -40, -1);
        var3 = var3 + (((nj) this).field_Z.field_E + 15);
        ((nj) this).a((lh) (Object) ((nj) this).field_Z, -128);
        int var5 = 4;
        int var6 = 200;
        ((nj) this).field_W.a(300 - var6 >> -2070218399, (byte) -121, var3, var6, 40);
        ((nj) this).field_W.field_A = (tn) this;
        ((nj) this).a((lh) (Object) ((nj) this).field_W, -110);
        ((nj) this).a(0, (byte) -87, 0, 300, var5 + 55 + var3);
    }

    final static void a(boolean param0, boolean param1) {
        uf stackIn_3_0 = null;
        uf stackOut_2_0 = null;
        uf stackOut_1_0 = null;
        L0: {
          if (!param0) {
            stackOut_2_0 = new uf(bk.field_P, m.field_i);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = new uf(nb.field_x, wl.field_J);
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        fg.field_Tb = stackIn_3_0;
        ql.field_ec = new gh(0L, (gh) null);
        ql.field_ec.a((gh) (Object) fg.field_Tb.field_d, 126);
        ql.field_ec.a(mn.field_E, 127);
        fb.field_r = new gh(0L, an.field_a);
        nd.field_a = new gh(0L, (gh) null);
        if (!param1) {
          return;
        } else {
          fb.field_r.a(tf.field_a, 121);
          fb.field_r.a(nd.field_a, 119);
          nd.field_a.a(fl.field_c, 120);
          nd.field_a.a(ta.field_i, 118);
          ef.a(1, param0);
          return;
        }
    }

    final boolean a(int param0, int param1, char param2, lh param3) {
        if (!super.a(param0, param1, param2, param3)) {
          if (-99 != param1) {
            if (-100 == param1) {
              return ((nj) this).b(param0 ^ -22560, param3);
            } else {
              return false;
            }
          } else {
            return ((nj) this).b(param3, 121);
          }
        } else {
          return true;
        }
    }

    public static void a(boolean param0) {
        field_T = null;
        field_U = null;
        if (param0) {
            return;
        }
        field_P = null;
        field_ab = null;
        field_X = null;
        field_Y = null;
    }

    public final void a(int param0, int param1, ma param2, int param3) {
        int var6 = 0;
        var6 = SteelSentinels.field_G;
        if (param3 > 124) {
          if (param1 != 0) {
            if ((param1 ^ -1) != -2) {
              if (param1 == 2) {
                mj.b("conduct.ws", (byte) -83);
                return;
              } else {
                return;
              }
            } else {
              mj.b("privacy.ws", (byte) 50);
              return;
            }
          } else {
            mj.b("terms.ws", (byte) 65);
            return;
          }
        } else {
          gh discarded$5 = nj.a((byte) 18);
          if (param1 != 0) {
            if ((param1 ^ -1) != -2) {
              if (param1 != 2) {
                return;
              } else {
                mj.b("conduct.ws", (byte) -83);
                return;
              }
            } else {
              mj.b("privacy.ws", (byte) 50);
              return;
            }
          } else {
            mj.b("terms.ws", (byte) 65);
            return;
          }
        }
    }

    public final void a(int param0, byte param1, int param2, oa param3, int param4) {
        if (!(param3 != ((nj) this).field_W)) {
            lc.a(0);
            ((nj) this).field_R.m(126);
        }
        int var6 = 92 % ((-85 - param1) / 36);
    }

    final static void h(byte param0) {
        da.field_b = new vi();
        if (param0 != 45) {
          field_P = null;
          ci.field_a.c((lh) (Object) da.field_b, -22908735);
          return;
        } else {
          ci.field_a.c((lh) (Object) da.field_b, -22908735);
          return;
        }
    }

    private final String i(int param0) {
        if (param0 != 0) {
            return null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_T = "Default arm for the <%0>-class sentinel.";
        field_V = 500;
        field_X = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
        field_ab = new ml();
        field_P = "Waiting for music";
    }
}
