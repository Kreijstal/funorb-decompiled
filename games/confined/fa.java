/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa extends rg {
    static int field_P;
    static String field_T;
    static ok field_Q;
    static int field_S;
    static double field_R;
    static nf field_U;

    private fa(String param0, fe param1, uk param2) {
        super(param0, param1, param2);
        try {
            ((fa) this).field_n = bg.field_d.field_j;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "fa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void f(int param0) {
        field_U = null;
        field_T = null;
        field_Q = null;
        if (param0 < 7) {
            nf[] discarded$0 = fa.a(-85, -40, -71, -35, 20, -50, -67, 114, (byte) -55);
        }
    }

    final static void g(int param0) {
        if (0 - mg.field_g != tg.field_H) {
            if (tg.field_H != 250 + -mg.field_g) {
            }
        }
        tg.field_H = tg.field_H + 1;
    }

    fa(String param0, uk param1, boolean param2) {
        this(param0, param1);
        try {
            ((fa) this).field_O = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "fa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static nf[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, byte param8) {
        int var9 = 0;
        nf[] var10 = null;
        nf[] var11_ref_nf__ = null;
        int var11 = 0;
        int var12 = 0;
        nf var13 = null;
        int var14 = 0;
        int var15 = 0;
        var15 = Confined.field_J ? 1 : 0;
        var9 = param1 + param7 - -param5;
        var10 = new nf[]{new nf(var9, var9), new nf(param0, var9), new nf(var9, var9), new nf(var9, param0), new nf(64, 64), new nf(var9, param0), new nf(var9, var9), new nf(param0, var9), new nf(var9, var9)};
        var11_ref_nf__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var12 >= var11_ref_nf__.length) {
            L1: {
              if (param8 < -91) {
                break L1;
              } else {
                field_T = null;
                break L1;
              }
            }
            var11 = 0;
            L2: while (true) {
              if (var11 >= param1) {
                var11 = 0;
                L3: while (true) {
                  if (param1 <= var11) {
                    var11 = 0;
                    L4: while (true) {
                      if (param0 <= var11) {
                        var11 = 0;
                        L5: while (true) {
                          if (var11 >= param0 >> 1) {
                            return var10;
                          } else {
                            var12 = 0;
                            L6: while (true) {
                              if (var12 < param5) {
                                var10[1].field_z[param0 * (-1 + var9 + -var12) - -var11] = param4;
                                var10[3].field_z[-var12 + (-1 + var9) + var11 * var9] = param4;
                                var10[7].field_z[var11 + var12 * param0] = param4;
                                var10[5].field_z[var12 + var11 * var9] = param4;
                                var12++;
                                continue L6;
                              } else {
                                var11++;
                                continue L5;
                              }
                            }
                          }
                        }
                      } else {
                        var12 = 0;
                        L7: while (true) {
                          if (var12 >= param1) {
                            var11++;
                            continue L4;
                          } else {
                            var10[7].field_z[param0 * (var9 - (var12 + 1)) - -var11] = param2;
                            var10[5].field_z[var9 + (-1 + -var12 + var11 * var9)] = param2;
                            var10[1].field_z[var11 + var12 * param0] = param3;
                            var10[3].field_z[var9 * var11 + var12] = param3;
                            var12++;
                            continue L7;
                          }
                        }
                      }
                    }
                  } else {
                    var12 = 0;
                    L8: while (true) {
                      if (var9 <= var12) {
                        var11++;
                        continue L3;
                      } else {
                        var10[0].field_z[var12 + var11 * var9] = param3;
                        var10[0].field_z[var11 + var9 * var12] = param3;
                        if (-var11 + var9 > var12) {
                          var10[2].field_z[var12 + var9 * var11] = param3;
                          var10[6].field_z[var9 * var12 + var11] = param3;
                          var12++;
                          continue L8;
                        } else {
                          var12++;
                          continue L8;
                        }
                      }
                    }
                  }
                }
              } else {
                var12 = 0;
                L9: while (true) {
                  if (var9 > var12) {
                    var10[6].field_z[var12 + (var9 - var11 + -1) * var9] = param2;
                    var10[8].field_z[var12 + var9 * (-1 + var9 - var11)] = param2;
                    var10[2].field_z[var12 * var9 - var11 - (1 + -var9)] = param2;
                    var10[8].field_z[var9 * var12 - var11 - (-var9 + 1)] = param2;
                    var12++;
                    continue L9;
                  } else {
                    var11++;
                    continue L2;
                  }
                }
              }
            }
          } else {
            var13 = var11_ref_nf__[var12];
            var14 = 0;
            L10: while (true) {
              if (var14 >= var13.field_z.length) {
                var12++;
                continue L0;
              } else {
                var13.field_z[var14] = param6;
                var14++;
                continue L10;
              }
            }
          }
        }
    }

    private fa(String param0, uk param1) {
        this(param0, bg.field_d.field_h, param1);
        try {
            ((fa) this).field_n = bg.field_d.field_j;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "fa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(java.awt.Canvas param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var2_int = -20 / ((-7 - param1) / 57);
              dl.a((java.awt.Component) (Object) param0, (byte) -112);
              ak.a(0, (java.awt.Component) (Object) param0);
              if (null != jc.field_c) {
                jc.field_c.a((java.awt.Component) (Object) param0, (byte) -30);
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("fa.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
          throw sd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
    }

    final static boolean a(byte param0) {
        return !fb.field_a.c(17237);
    }

    final static void a(boolean param0, java.awt.Component param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            param1.addMouseListener((java.awt.event.MouseListener) (Object) tf.field_a);
            param1.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) tf.field_a);
            param1.addFocusListener((java.awt.event.FocusListener) (Object) tf.field_a);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("fa.B(").append(false).append(',');
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
          throw sd.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        ((fa) this).field_O = !((fa) this).field_O ? true : false;
        if (param0 != 25124) {
            fa.f(-89);
        }
        super.a(param0, param1, param2, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_S = 128;
        field_T = "Disruption cannon";
    }
}
