/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk {
    static oh field_c;
    static int[] field_b;
    static ba field_a;

    final static void a(String param0, java.applet.Applet param1, int param2) {
        try {
            java.net.URL var3 = null;
            Exception var3_ref = null;
            RuntimeException var3_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var3 = new java.net.URL(param1.getCodeBase(), param0);
                    var3 = of.a(param1, var3, false);
                    ib.a(true, var3.toString(), param1, (byte) -25);
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var3_ref = (Exception) (Object) decompiledCaughtException;
                    var3_ref.printStackTrace();
                    break L2;
                  }
                }
                L3: {
                  if (param2 <= -103) {
                    break L3;
                  } else {
                    field_a = null;
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var3_ref2;
                stackOut_6_1 = new StringBuilder().append("gk.B(");
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0 == null) {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L4;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L4;
                }
              }
              L5: {
                stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param1 == null) {
                  stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                  stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                  stackOut_11_2 = "null";
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L5;
                } else {
                  stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                  stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                  stackOut_10_2 = "{...}";
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L5;
                }
              }
              throw sl.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 < 67) {
            Object var2 = null;
            gk.a((String[]) null, (byte) 65);
        }
        field_a = null;
        field_b = null;
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        jf var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        la var15 = null;
        int[][] var19 = null;
        RuntimeException decompiledCaughtException = null;
        var12 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var15 = ne.field_a;
            var2 = var15.h(16383);
            var3 = (jf) (Object) ei.field_m.b(2);
            L1: while (true) {
              L2: {
                if (var3 == null) {
                  break L2;
                } else {
                  if (var3.field_m == var2) {
                    break L2;
                  } else {
                    var3 = (jf) (Object) ei.field_m.a(10);
                    continue L1;
                  }
                }
              }
              if (var3 == null) {
                lj.a((byte) 116);
                return;
              } else {
                L3: {
                  var4 = var15.h(16383);
                  if (var4 != 0) {
                    pf.field_C[0] = ue.field_a;
                    var5 = var3.field_k;
                    var6_int = 1;
                    L4: while (true) {
                      if (var6_int >= var4) {
                        tk.a(var4, -14032, var5);
                        var6_int = 0;
                        L5: while (true) {
                          if (var6_int >= var4) {
                            bj.a(0, var5);
                            var6 = new String[2][var5];
                            var19 = new int[2][4 * var5];
                            var8 = oe.field_c;
                            var9 = 0;
                            var10 = 0;
                            L6: while (true) {
                              if (var8 <= var9) {
                                var13 = 0;
                                var9 = var13;
                                var14 = 0;
                                var10 = var14;
                                L7: while (true) {
                                  if (var8 > var13) {
                                    L8: {
                                      var11 = lf.field_Y[var13 + var5];
                                      var6[1][var14] = pf.field_C[var11];
                                      var19[1][4 * var14] = g.field_u[var11];
                                      var19[1][var14 * 4 + 1] = ii.field_q[var11];
                                      var19[1][2 + var14 * 4] = qf.field_a[var11];
                                      var19[1][var14 * 4 + 3] = qi.field_b[var11];
                                      if (!rb.a(false, pf.field_C[var11])) {
                                        break L8;
                                      } else {
                                        break L8;
                                      }
                                    }
                                    var14++;
                                    var13++;
                                    continue L7;
                                  } else {
                                    var3.a(-61);
                                    break L3;
                                  }
                                }
                              } else {
                                L9: {
                                  var11 = lf.field_Y[var9];
                                  var6[0][var10] = pf.field_C[var11];
                                  var19[0][var10 * 4] = g.field_u[var11];
                                  var19[0][1 + 4 * var10] = ii.field_q[var11];
                                  var19[0][4 * var10 - -2] = qf.field_a[var11];
                                  var19[0][3 + var10 * 4] = qi.field_b[var11];
                                  if (!rb.a(false, pf.field_C[var11])) {
                                    break L9;
                                  } else {
                                    if (qf.field_a[var11] + ii.field_q[var11] + qi.field_b[var11] != 0) {
                                      break L9;
                                    } else {
                                      var6[0][var10] = null;
                                      var10--;
                                      break L9;
                                    }
                                  }
                                }
                                var9++;
                                var10++;
                                continue L6;
                              }
                            }
                          } else {
                            L10: {
                              mf.a(14, (be) (Object) var15);
                              if (var6_int == 0) {
                                sg.a(kf.field_c, var6_int, ai.field_d, fe.field_Q, nh.field_a, -733);
                                break L10;
                              } else {
                                sg.a(kf.field_c, var6_int, ai.field_d, fe.field_Q, nh.field_a, -733);
                                break L10;
                              }
                            }
                            var6_int++;
                            continue L5;
                          }
                        }
                      } else {
                        pf.field_C[var6_int] = var15.g(0);
                        var6_int++;
                        continue L4;
                      }
                    }
                  } else {
                    var3.a(-61);
                    break L3;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var1, "gk.C(" + -126 + ')');
        }
    }

    final static void a(String[] args, byte param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (null != mc.field_H) {
                mc.field_H.field_N.a(args, (byte) -58);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 < -24) {
                break L2;
              } else {
                gk.a(117);
                break L2;
              }
            }
            L3: {
              if (null != ne.field_d) {
                ne.field_d.field_I.a(args, (byte) -58);
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2;
            stackOut_9_1 = new StringBuilder().append("gk.D(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (args == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[16384];
        field_a = new ba();
    }
}
