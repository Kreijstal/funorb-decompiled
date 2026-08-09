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
            return (gh) null;
        }
        return fk.b((byte) 111);
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              if (param1 == 300) {
                break L1;
              } else {
                field_X = (String) null;
                break L1;
              }
            }
            L2: {
              var3 = ri.a(param1 ^ -301, param2);
              if ((param0.indexOf(param2) ^ -1) != 0) {
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
                              stackIn_14_0 = 0;
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    stackIn_14_0 = 1;
                    break L3;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            stackIn_6_0 = 1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("nj.Q(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_14_0 != 0;
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
        String var7 = null;
        int var3 = 0;
        cn var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
            this.field_R = param0;
            this.field_W = new oa(ah.field_Sb, (tn) null);
            this.field_W.field_p = (qk) ((Object) new kh());
            var7 = db.a(si.field_w, -39, new String[]{this.i(0), this.j(-114)});
            var3 = 20;
            var4 = new cn(tj.field_e, 0, 0, 0, 0, 16777215, -1, 3, 0, tj.field_e.field_G, -1, 2147483647, true);
            this.field_Z = new ma(var7, var4);
            this.field_Z.field_v = "";
            this.field_Z.a(ph.field_b, 0, -53);
            this.field_Z.a(ph.field_b, 1, -65);
            this.field_Z.field_x = this.field_x - 40;
            this.field_Z.field_A = (tn) (this);
            this.field_Z.a(26, var3, this.field_x + -40, -1);
            var3 = var3 + (this.field_Z.field_E + 15);
            this.a(this.field_Z, -128);
            var5 = 4;
            var6 = 200;
            this.field_W.a(300 - var6 >> -2070218399, (byte) -121, var3, var6, 40);
            this.field_W.field_A = (tn) (this);
            this.a(this.field_W, -110);
            this.a(0, (byte) -87, 0, 300, var5 + 55 + var3);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "nj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, boolean param1) {
        uf stackIn_3_0 = null;
        L0: {
          if (!param0) {
            stackIn_3_0 = new uf(bk.field_P, m.field_i);
            break L0;
          } else {
            stackIn_3_0 = new uf(nb.field_x, wl.field_J);
            break L0;
          }
        }
        fg.field_Tb = stackIn_3_0;
        ql.field_ec = new gh(0L, (gh) null);
        ql.field_ec.a(fg.field_Tb.field_d, 126);
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
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_8_0 = false;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              if (-99 != (param1 ^ -1)) {
                if (-100 != (param1 ^ -1)) {
                  stackIn_10_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_8_0 = this.b(param0 ^ -22560, param3);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = this.b(param3, 121);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("nj.R(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              return stackIn_10_0 != 0;
            }
          }
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
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param3 > 124) {
                break L1;
              } else {
                nj.a((byte) 18);
                break L1;
              }
            }
            if (param1 != 0) {
              if ((param1 ^ -1) != -2) {
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
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("nj.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param3 + ')');
        }
    }

    public final void a(int param0, byte param1, int param2, oa param3, int param4) {
        try {
            if (!(param3 != this.field_W)) {
                lc.a(0);
                this.field_R.m(126);
            }
            int var6_int = 92 % ((-85 - param1) / 36);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "nj.BA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static void h(byte param0) {
        da.field_b = new vi();
        if (param0 != 45) {
          field_P = (String) null;
          ci.field_a.c(da.field_b, -22908735);
          return;
        } else {
          ci.field_a.c(da.field_b, -22908735);
          return;
        }
    }

    private final String i(int param0) {
        if (param0 != 0) {
            return (String) null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    static {
        field_T = "Default arm for the <%0>-class sentinel.";
        field_V = 500;
        field_X = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
        field_ab = new ml();
        field_P = "Waiting for music";
    }
}
