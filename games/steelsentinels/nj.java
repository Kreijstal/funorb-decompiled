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
        int var2 = -26;
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
        RuntimeException var3_ref = null;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 300) {
                break L1;
              } else {
                field_X = null;
                break L1;
              }
            }
            L2: {
              var3 = ri.a(param1 ^ -301, param2);
              if (param0.indexOf(param2) != -1) {
                break L2;
              } else {
                if (-1 != param0.indexOf(var3)) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      if (param0.startsWith(param2)) {
                        break L4;
                      } else {
                        if (param0.startsWith(var3)) {
                          break L4;
                        } else {
                          if (param0.endsWith(param2)) {
                            break L4;
                          } else {
                            if (!param0.endsWith(var3)) {
                              stackOut_13_0 = 0;
                              stackIn_14_0 = stackOut_13_0;
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    stackOut_12_0 = 1;
                    stackIn_14_0 = stackOut_12_0;
                    break L3;
                  }
                  break L0;
                }
              }
            }
            stackOut_5_0 = 1;
            stackIn_6_0 = stackOut_5_0;
            return stackIn_6_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3_ref;
            stackOut_15_1 = new StringBuilder().append("nj.Q(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44).append(param1).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
        return stackIn_14_0 != 0;
    }

    final static void a(boolean param0, int param1) {
        ok.a(param0, false, 119);
    }

    nj(fg param0) {
        super(0, 0, 288, 0, (qk) null);
        RuntimeException var2 = null;
        int var3 = 0;
        cn var4 = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            ((nj) this).field_R = param0;
            ((nj) this).field_W = new oa(ah.field_Sb, (tn) null);
            ((nj) this).field_W.field_p = (qk) (Object) new kh();
            var7 = db.a(si.field_w, -39, new String[2]);
            var3 = 20;
            var4 = new cn(tj.field_e, 0, 0, 0, 0, 16777215, -1, 3, 0, tj.field_e.field_G, -1, 2147483647, true);
            ((nj) this).field_Z = new ma(var7, (qk) (Object) var4);
            ((nj) this).field_Z.field_v = "";
            ((nj) this).field_Z.a(ph.field_b, 0, -53);
            ((nj) this).field_Z.a(ph.field_b, 1, -65);
            ((nj) this).field_Z.field_x = ((nj) this).field_x - 40;
            ((nj) this).field_Z.field_A = (tn) this;
            ((nj) this).field_Z.a(26, var3, ((nj) this).field_x + -40, -1);
            var3 = var3 + (((nj) this).field_Z.field_E + 15);
            ((nj) this).a((lh) (Object) ((nj) this).field_Z, -128);
            var5 = 4;
            var6 = 200;
            ((nj) this).field_W.a(300 - var6 >> 1, (byte) -121, var3, var6, 40);
            ((nj) this).field_W.field_A = (tn) this;
            ((nj) this).a((lh) (Object) ((nj) this).field_W, -110);
            ((nj) this).a(0, (byte) -87, 0, 300, var5 + 55 + var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var2;
            stackOut_3_1 = new StringBuilder().append("nj.<init>(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final static void a(boolean param0, boolean param1) {
        fg.field_Tb = param0 ? new uf(nb.field_x, wl.field_J) : new uf(bk.field_P, m.field_i);
        ql.field_ec = new gh(0L, (gh) null);
        ql.field_ec.a((gh) (Object) fg.field_Tb.field_d, 126);
        ql.field_ec.a(mn.field_E, 127);
        fb.field_r = new gh(0L, an.field_a);
        nd.field_a = new gh(0L, (gh) null);
        fb.field_r.a(tf.field_a, 121);
        fb.field_r.a(nd.field_a, 119);
        nd.field_a.a(fl.field_c, 120);
        nd.field_a.a(ta.field_i, 118);
        ef.a(1, param0);
    }

    final boolean a(int param0, int param1, char param2, lh param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_8_0 = false;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        boolean stackOut_7_0 = false;
        boolean stackOut_4_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              if (param1 != 98) {
                if (param1 != 99) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  stackOut_7_0 = ((nj) this).b(param0 ^ -22560, param3);
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              } else {
                stackOut_4_0 = ((nj) this).b(param3, 121);
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("nj.R(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0 != 0;
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
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param3 > 124) {
                break L1;
              } else {
                gh discarded$2 = nj.a((byte) 18);
                break L1;
              }
            }
            if (param1 != 0) {
              if (param1 != 1) {
                if (param1 != 2) {
                  break L0;
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("nj.A(").append(param0).append(44).append(param1).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param3 + 41);
        }
    }

    public final void a(int param0, byte param1, int param2, oa param3, int param4) {
        try {
            if (!(param3 != ((nj) this).field_W)) {
                lc.a(0);
                ((nj) this).field_R.m(126);
            }
            int var6_int = 92 % ((-85 - param1) / 36);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "nj.BA(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 41);
        }
    }

    final static void h(byte param0) {
        da.field_b = new vi();
        ci.field_a.c((lh) (Object) da.field_b, -22908735);
    }

    private final String i(int param0) {
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
