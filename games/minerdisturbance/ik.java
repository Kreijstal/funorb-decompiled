/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik extends kn implements be, sh, f {
    private ke field_P;
    static String field_S;
    private ti field_V;
    private tn field_L;
    ei field_U;
    static String[] field_N;
    private hc field_K;
    private ke field_Q;
    private ke field_O;
    private hc field_R;
    static int field_T;
    private ke field_J;
    private ke field_I;
    private ke field_M;

    public final void a(String param0, int param1) {
        ke var3 = null;
        String var5 = null;
        try {
            int var4 = -26 % ((param1 - 22) / 62);
            var3 = ((ik) this).field_I;
            var5 = param0;
            ((ui) (Object) var3).a(false, false, var5);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "ik.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(byte param0) {
        ((qi) (Object) ((ik) this).field_I.a(35)).b((byte) -78);
        if (param0 != 47) {
            ((ik) this).field_U = null;
        }
    }

    private final int a(int param0, int param1, String param2, fe param3, int param4) {
        am var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var6 = new am(20, param1, param0 + 120, 25, param3, false, 120, 3, bn.field_d, 16777215, param2);
            if (param4 == -2791) {
              ((ik) this).a(param4 + 2790, (fe) (Object) var6);
              stackOut_3_0 = var6.field_q;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = -15;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var6_ref;
            stackOut_5_1 = new StringBuilder().append("ik.Q(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param4 + ')');
        }
        return stackIn_4_0;
    }

    public final void a(tn param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (param2 == 12278) {
                break L1;
              } else {
                ((ik) this).field_V = null;
                break L1;
              }
            }
            L2: {
              if (param3 != 0) {
                if (param3 != 1) {
                  if (param3 == 2) {
                    qd.a(5, "conduct.ws");
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  qd.a(5, "privacy.ws");
                  break L2;
                }
              } else {
                qd.a(5, "terms.ws");
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("ik.I(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final String q(int param0) {
        return "</col></u>";
    }

    public final void a(int param0, byte param1, hc param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 6) {
                break L1;
              } else {
                field_N = null;
                break L1;
              }
            }
            L2: {
              if (((ik) this).field_R == param2) {
                hk.c(-118);
                break L2;
              } else {
                if (((ik) this).field_K != param2) {
                  break L2;
                } else {
                  boolean discarded$2 = this.o(-1);
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var6;
            stackOut_7_1 = new StringBuilder().append("ik.B(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final int a(String param0, fe param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        qn var7 = null;
        int var8 = 0;
        am var9 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var9 = new am(20, param3, 290, 25, param1, false, 120, 3, bn.field_d, 16777215, param0);
            var8 = 0;
            ((ik) this).a(-1, (fe) (Object) var9);
            var7 = new qn(((sg) (Object) param1).a(35));
            ((ik) this).a(-1, (fe) (Object) var7);
            var7.a(15, -107, var9.field_v + (var9.field_u + 3), 15, (-15 + var9.field_q >> 1) + var9.field_t);
            stackOut_0_0 = var9.field_q;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var6;
            stackOut_2_1 = new StringBuilder().append("ik.N(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + 170 + ',' + param3 + ',' + 105 + ')');
        }
        return stackIn_1_0;
    }

    private final String e(byte param0) {
        int var2 = 90;
        return "<u=2164A2><col=2164A2>";
    }

    private final int a(int param0, String param1, String param2, fe param3, int param4, byte param5, int param6) {
        RuntimeException var8 = null;
        w var9 = null;
        Object var10 = null;
        am var11 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var11 = new am(20, param4, 290, 25, param3, false, 120, 3, bn.field_d, 16777215, param1);
              if (param5 <= -53) {
                break L1;
              } else {
                var10 = null;
                int discarded$2 = this.a(-80, -80, (String) null, (fe) null, 39);
                break L1;
              }
            }
            ((ik) this).a(-1, (fe) (Object) var11);
            var9 = new w(((sg) (Object) param3).a(35), param2, 126, var11.field_q + param4, 220, param0);
            var9.field_y = (rm) this;
            ((ik) this).a(-1, (fe) (Object) var9);
            stackOut_2_0 = var11.field_q + var9.field_q;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var8;
            stackOut_4_1 = new StringBuilder().append("ik.G(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param4 + ',' + param5 + ',' + 170 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, int param1, byte param2, fe param3) {
        if (param2 <= 49) {
            return;
        }
        try {
            super.a(param0, param1, (byte) 123, param3);
            ((ik) this).field_K.field_E = this.a(true);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "ik.V(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void p(int param0) {
        field_S = null;
        field_N = null;
    }

    final static ek f(byte param0) {
        return (ek) (Object) new ca();
    }

    final boolean a(char param0, fe param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_6_0 = false;
        int stackOut_11_0 = 0;
        boolean stackOut_9_0 = false;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param3 == 98) {
                stackOut_6_0 = ((ik) this).b(param1, param2 ^ -79);
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (param3 != 99) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  stackOut_9_0 = ((ik) this).a(param1, (byte) 12);
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5;
            stackOut_13_1 = new StringBuilder().append("ik.K(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L1;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_12_0 != 0;
    }

    private final boolean a(int param0, sg param1) {
        jm var3 = null;
        RuntimeException var3_ref = null;
        ag var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            var3 = param1.a(35);
            if (var3 == null) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              ((ik) this).field_M = null;
              var4 = var3.b(24595);
              if (var4 != fg.field_d) {
                if (var4 != nn.field_f) {
                  if (var4 != ke.field_W) {
                    stackOut_13_0 = 1;
                    stackIn_14_0 = stackOut_13_0;
                    break L0;
                  } else {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0 != 0;
                  }
                } else {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0 != 0;
                }
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3_ref;
            stackOut_15_1 = new StringBuilder().append("ik.F(").append(0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L1;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L1;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
        return stackIn_14_0 != 0;
    }

    public ik() {
        super(0, 0, 496, 0, (ad) null);
        ((ik) this).field_I = new ke("", (rm) null, 12);
        ((ik) this).field_P = new ke("", (rm) null, 100);
        ((ik) this).field_M = new ke("", (rm) null, 100);
        ((ik) this).field_J = new ke("", (rm) null, 20);
        ((ik) this).field_O = new ke("", (rm) null, 20);
        ((ik) this).field_Q = new ke("", (rm) null, 3);
        int var1 = 1;
        ((ik) this).field_V = new ti("", (rm) null, var1 != 0);
        ((ik) this).field_K = new hc(cg.field_r, (rm) null);
        ((ik) this).field_R = new hc(hk.field_c, (rm) null);
        ((ik) this).field_I.field_n = vj.field_l;
        ((ik) this).field_P.field_n = fm.field_I;
        ((ik) this).field_M.field_n = lg.field_b;
        ((ik) this).field_J.field_n = fe.field_C;
        ((ik) this).field_O.field_n = sl.field_v;
        ((ik) this).field_Q.field_n = uf.field_t;
        ((ik) this).field_V.field_n = ig.field_a;
        ((ik) this).field_I.a((jm) (Object) new qi((ui) (Object) ((ik) this).field_I), 1048576);
        ((ik) this).field_P.a((jm) (Object) new k((ui) (Object) ((ik) this).field_P), 1048576);
        ((ik) this).field_M.a((jm) (Object) new od((ui) (Object) ((ik) this).field_M, (ui) (Object) ((ik) this).field_P), 1048576);
        ((ik) this).field_J.a((jm) (Object) new e((ui) (Object) ((ik) this).field_J, (ui) (Object) ((ik) this).field_I, (ui) (Object) ((ik) this).field_P), 1048576);
        ((ik) this).field_O.a((jm) (Object) new jg((ui) (Object) ((ik) this).field_O, (ui) (Object) ((ik) this).field_J), 1048576);
        ((ik) this).field_Q.a((jm) (Object) new wj((ui) (Object) ((ik) this).field_Q), 1048576);
        ((ik) this).field_K.field_E = false;
        ((ik) this).field_K.field_A = (ad) (Object) new wi();
        ((ik) this).field_R.field_A = (ad) (Object) new nc();
        ((ik) this).field_I.field_A = (ad) (Object) new gk(10000536);
        gk dupTemp$0 = new gk(10000536);
        ((ik) this).field_M.field_A = (ad) (Object) dupTemp$0;
        ((ik) this).field_P.field_A = (ad) (Object) dupTemp$0;
        ((ik) this).field_Q.field_A = (ad) (Object) new gk(10000536);
        ((ik) this).field_V.field_A = (ad) (Object) new qh();
        mn dupTemp$1 = new mn(10000536);
        ((ik) this).field_O.field_A = (ad) (Object) dupTemp$1;
        ((ik) this).field_J.field_A = (ad) (Object) dupTemp$1;
        String var2 = oa.a((byte) -120, eb.field_g, new String[2]);
        int var3 = 20;
        var3 = var3 + this.a(170, var3, id.field_i, (fe) (Object) ((ik) this).field_P, -2791);
        var3 = var3 + (5 + this.a(20, di.field_cb, "", (fe) (Object) ((ik) this).field_M, var3, (byte) -116, 170));
        var3 = var3 + this.a(170, var3, tk.field_c, (fe) (Object) ((ik) this).field_J, -2791);
        var3 = var3 + (5 + this.a(170, di.field_E, var3, (fe) (Object) ((ik) this).field_O, -100, t.field_d));
        var3 = var3 + (5 + this.a(170, hi.field_w, var3, (fe) (Object) ((ik) this).field_I, -100, wm.field_c));
        var3 = var3 + this.a(oc.field_j, (fe) (Object) ((ik) this).field_Q, 170, var3, 105);
        am var4 = new am(46, var3, ((ik) this).field_v + -90, 25, (fe) (Object) ((ik) this).field_V, true, -120 + ((ik) this).field_v, 5, sl.field_q, 11579568, mc.field_x);
        ((ik) this).a(-1, (fe) (Object) var4);
        var3 = var3 + var4.field_q;
        eg var5 = new eg(bn.field_d, 0, 0, 0, 0, 16777215, -1, 0, 0, bn.field_d.field_I, -1, 2147483647, true);
        ((ik) this).field_L = new tn(var2, (ad) (Object) var5);
        ((ik) this).field_L.field_n = "";
        ((ik) this).field_L.a(-115, 0, wk.field_d);
        ((ik) this).field_L.a(-68, 1, wk.field_d);
        ((ik) this).field_L.field_y = (rm) this;
        ((ik) this).field_L.b(46, -90 + ((ik) this).field_v, 32088, var3);
        var3 = var3 + (15 + ((ik) this).field_L.field_q);
        ((ik) this).a(-1, (fe) (Object) ((ik) this).field_L);
        int var6 = 4;
        int var7 = 200;
        ((ik) this).field_K.a(40, -39, 496 + -var7 >> 1, var7, var3);
        ((ik) this).field_R.a(40, -49, var6 + 3, 60, 15 + var3);
        ((ik) this).field_R.field_y = (rm) this;
        ((ik) this).field_K.field_y = (rm) this;
        ((ik) this).a(-1, (fe) (Object) ((ik) this).field_K);
        ((ik) this).a(-1, (fe) (Object) ((ik) this).field_R);
        ((ik) this).field_U = new ei((f) this);
        ((ik) this).field_U.a(150, -36, 60 + ((ik) this).field_I.field_v + ((ik) this).field_I.field_u, ((ik) this).field_v - (((ik) this).field_I.field_u - (-((ik) this).field_I.field_v + -60)), 20 + ((ik) this).field_I.field_t);
        ((ik) this).a(-1, (fe) (Object) ((ik) this).field_U);
        ((ik) this).a(55 + (var3 - -var6), -45, 0, 496, 0);
    }

    private final boolean a(boolean param0) {
        L0: {
          if (!this.a(0, (sg) (Object) ((ik) this).field_I)) {
            break L0;
          } else {
            if (!this.a(0, (sg) (Object) ((ik) this).field_P)) {
              break L0;
            } else {
              if (!this.a(0, (sg) (Object) ((ik) this).field_M)) {
                break L0;
              } else {
                if (!this.a(0, (sg) (Object) ((ik) this).field_J)) {
                  break L0;
                } else {
                  if (!this.a(0, (sg) (Object) ((ik) this).field_O)) {
                    break L0;
                  } else {
                    if (this.a(0, (sg) (Object) ((ik) this).field_Q)) {
                      return true;
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
          }
        }
        return false;
    }

    private final boolean o(int param0) {
        if (!this.a(true)) {
            return false;
        }
        int var2 = -1;
        try {
            var2 = Integer.parseInt(((ik) this).field_Q.field_s);
        } catch (NumberFormatException numberFormatException) {
        }
        return qi.a(((ik) this).field_I.field_s, var2, (ik) this, ((ik) this).field_V.field_H, -83, ((ik) this).field_J.field_s, ((ik) this).field_P.field_s);
    }

    final static void n(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        ac var9 = null;
        int var10 = 0;
        int stackIn_17_0 = 0;
        String stackIn_23_0 = null;
        int stackIn_27_0 = 0;
        String stackIn_33_0 = null;
        String stackIn_37_0 = null;
        String stackIn_38_0 = null;
        String stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        ac stackIn_43_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        String stackOut_22_0 = null;
        String stackOut_21_0 = null;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        String stackOut_32_0 = null;
        String stackOut_31_0 = null;
        String stackOut_36_0 = null;
        String stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        String stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        ac stackOut_42_0 = null;
        ac stackOut_41_0 = null;
        var10 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              var1_int = lj.field_p;
              var2 = 0;
              if (ti.field_M == 2) {
                var3_long = sf.a((byte) 121) - tl.field_o;
                var2 = (int)((10999L + -var3_long) / 1000L);
                if (0 <= var2) {
                  break L1;
                } else {
                  var2 = 0;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            var3 = 0;
            L2: while (true) {
              if (var3 >= ne.field_K.length) {
                break L0;
              } else {
                L3: {
                  var4 = mf.field_m[var3];
                  if (0 <= var4) {
                    if (~var4 == ~pn.field_a.field_e) {
                      var5 = fg.field_b;
                      break L3;
                    } else {
                      var5 = am.field_J;
                      break L3;
                    }
                  } else {
                    var5 = pb.field_K;
                    break L3;
                  }
                }
                L4: {
                  var6 = ne.field_K[var3];
                  if (ti.field_M != 2) {
                    break L4;
                  } else {
                    if (var2 != 1) {
                      break L4;
                    } else {
                      L5: {
                        if (~oe.field_g.length <= ~ce.field_c.length) {
                          stackOut_16_0 = oe.field_g.length;
                          stackIn_17_0 = stackOut_16_0;
                          break L5;
                        } else {
                          stackOut_15_0 = ce.field_c.length;
                          stackIn_17_0 = stackOut_15_0;
                          break L5;
                        }
                      }
                      L6: {
                        var7 = stackIn_17_0;
                        if (var3 < 6) {
                          break L6;
                        } else {
                          if (var7 + 6 > var3) {
                            L7: {
                              if (-var7 + oe.field_g.length + (var3 - 6) < 0) {
                                stackOut_22_0 = "";
                                stackIn_23_0 = stackOut_22_0;
                                break L7;
                              } else {
                                stackOut_21_0 = oe.field_g[oe.field_g.length + -6 + var3 - var7];
                                stackIn_23_0 = stackOut_21_0;
                                break L7;
                              }
                            }
                            var6 = stackIn_23_0;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L8: {
                        if (~field_N.length >= ~om.field_f.length) {
                          stackOut_26_0 = om.field_f.length;
                          stackIn_27_0 = stackOut_26_0;
                          break L8;
                        } else {
                          stackOut_25_0 = field_N.length;
                          stackIn_27_0 = stackOut_25_0;
                          break L8;
                        }
                      }
                      var8 = stackIn_27_0;
                      if (~var3 > ~(var7 + 7)) {
                        break L4;
                      } else {
                        if (var3 < 7 - (-var7 - var8)) {
                          L9: {
                            if (var3 - (7 - -var7) < om.field_f.length) {
                              stackOut_32_0 = om.field_f[-var7 + (-7 + var3)];
                              stackIn_33_0 = stackOut_32_0;
                              break L9;
                            } else {
                              stackOut_31_0 = "";
                              stackIn_33_0 = stackOut_31_0;
                              break L9;
                            }
                          }
                          var6 = stackIn_33_0;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                L10: {
                  if (var4 != -2) {
                    break L10;
                  } else {
                    var6 = Integer.toString(var2);
                    break L10;
                  }
                }
                L11: {
                  stackOut_36_0 = (String) var6;
                  stackIn_38_0 = stackOut_36_0;
                  stackIn_37_0 = stackOut_36_0;
                  if (0 > var4) {
                    stackOut_38_0 = (String) (Object) stackIn_38_0;
                    stackOut_38_1 = 0;
                    stackIn_39_0 = stackOut_38_0;
                    stackIn_39_1 = stackOut_38_1;
                    break L11;
                  } else {
                    stackOut_37_0 = (String) (Object) stackIn_37_0;
                    stackOut_37_1 = 1;
                    stackIn_39_0 = stackOut_37_0;
                    stackIn_39_1 = stackOut_37_1;
                    break L11;
                  }
                }
                L12: {
                  var7 = hl.a(stackIn_39_0, stackIn_39_1 != 0, -15388);
                  var8 = -(var7 >> 1) + rj.field_e;
                  if (0 > var4) {
                    break L12;
                  } else {
                    L13: {
                      var1_int = var1_int + hi.field_z;
                      if (var4 != pn.field_a.field_e) {
                        stackOut_42_0 = mf.field_j;
                        stackIn_43_0 = stackOut_42_0;
                        break L13;
                      } else {
                        stackOut_41_0 = s.field_O;
                        stackIn_43_0 = stackOut_41_0;
                        break L13;
                      }
                    }
                    L14: {
                      var9 = stackIn_43_0;
                      if (var9 != null) {
                        var9.a(nk.field_u - -(sn.field_d << 1), var1_int, var7 - -(ka.field_a << 1), 26202, var8 - ka.field_a);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    var1_int = var1_int + sn.field_d;
                    break L12;
                  }
                }
                L15: {
                  if (var4 >= 0) {
                    ta.field_b.a(var6, var8, nm.field_e + var1_int, var5, -1);
                    var1_int = var1_int + (hi.field_z + (sn.field_d - -nk.field_u));
                    break L15;
                  } else {
                    gh.field_b.a(var6, var8, var1_int - -he.field_a, var5, -1);
                    var1_int = var1_int + vd.field_z;
                    break L15;
                  }
                }
                var3++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var1, "ik.E(" + -107 + ')');
        }
    }

    private final int a(int param0, String param1, int param2, fe param3, int param4, String param5) {
        RuntimeException var7 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            stackOut_0_0 = this.a(35, param5, param1, param3, param2, (byte) -108, 170);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var7;
            stackOut_2_1 = new StringBuilder().append("ik.D(").append(170).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(-100).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param5 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_1_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_S = "Unpacking music";
        field_T = 0;
    }
}
