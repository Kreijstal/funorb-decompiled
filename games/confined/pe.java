/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe extends rk {
    static va field_p;
    static volatile int field_n;
    static bi field_o;
    static int field_q;
    static int field_m;

    final static void a(ok param0, sd param1, String param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var9 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = -1;
            var7 = 1;
            L1: while (true) {
              if (param2.length() <= var7) {
                break L0;
              } else {
                L2: {
                  var8 = param2.charAt(var7);
                  if (var8 != 60) {
                    break L2;
                  } else {
                    var6 = param1.field_e[0] + ((var5_int >> 8) - -param0.c(param2.substring(0, var7)));
                    break L2;
                  }
                }
                L3: {
                  if (var6 == -1) {
                    L4: {
                      if (var8 != 32) {
                        break L4;
                      } else {
                        var5_int = var5_int + param3;
                        break L4;
                      }
                    }
                    param1.field_e[var7] = param1.field_e[0] + (var5_int >> 8) + (param0.c(param2.substring(0, var7 + 1)) - param0.a((char) var8));
                    break L3;
                  } else {
                    param1.field_e[var7] = var6;
                    break L3;
                  }
                }
                L5: {
                  if (var8 != 62) {
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("pe.B(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          L7: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L7;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L7;
            }
          }
          L8: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param3 + 44 + 3694 + 41);
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var2 = new java.net.URL(param1.getCodeBase(), "tosupport.ws");
                      if (param0 <= -47) {
                        break L2;
                      } else {
                        pe.b(106);
                        break L2;
                      }
                    }
                    param1.getAppletContext().showDocument(pn.a(var2, (byte) -33, param1), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var2_ref2;
                stackOut_6_1 = new StringBuilder().append("pe.C(").append(param0).append(44);
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param1 == null) {
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
              throw sd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        if (param0 <= 24) {
            Object var2 = null;
            pe.a((java.applet.Applet) null, (byte) -46);
        }
        field_o = null;
        field_p = null;
    }

    final static void a(java.applet.Applet param0, byte param1) {
        RuntimeException runtimeException = null;
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
            L1: {
              ci.a(param0, "", -81);
              me.a((byte) 74, param0);
              if (param1 == 11) {
                break L1;
              } else {
                field_o = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("pe.A(");
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
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    private pe() throws Throwable {
        throw new Error();
    }

    final static boolean a(int[] param0, int param1) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        hc var4_ref_hc = null;
        int var4 = 0;
        int var5_int = 0;
        hc var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_37_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var7 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            if (wd.field_f == lk.field_d) {
              L1: {
                L2: {
                  var2_long = ri.a(-3);
                  if (tk.field_b == 0) {
                    break L2;
                  } else {
                    if (tg.field_S >= 0) {
                      break L2;
                    } else {
                      L3: {
                        var4_ref_hc = (hc) (Object) qh.field_w.a(-121);
                        if (var4_ref_hc == null) {
                          break L3;
                        } else {
                          if (~var4_ref_hc.field_r <= ~var2_long) {
                            break L3;
                          } else {
                            var4_ref_hc.a(true);
                            ai.field_i = var4_ref_hc.field_q.length;
                            e.field_c.field_n = 0;
                            var5_int = 0;
                            L4: while (true) {
                              if (var5_int >= ai.field_i) {
                                kk.field_c = pk.field_c;
                                pk.field_c = qm.field_y;
                                qm.field_y = Confined.field_F;
                                Confined.field_F = var4_ref_hc.field_o;
                                stackOut_11_0 = 1;
                                stackIn_12_0 = stackOut_11_0;
                                return stackIn_12_0 != 0;
                              } else {
                                e.field_c.field_m[var5_int] = var4_ref_hc.field_q[var5_int];
                                var5_int++;
                                continue L4;
                              }
                            }
                          }
                        }
                      }
                      stackOut_14_0 = tg.field_S;
                      stackIn_16_0 = stackOut_14_0;
                      break L1;
                    }
                  }
                }
                stackOut_13_0 = tg.field_S;
                stackIn_16_0 = stackOut_13_0;
                break L1;
              }
              L5: while (true) {
                L6: {
                  if (stackIn_16_0 < 0) {
                    e.field_c.field_n = 0;
                    if (!jj.a(1, (byte) -113)) {
                      stackOut_20_0 = 0;
                      stackIn_21_0 = stackOut_20_0;
                      return stackIn_21_0 != 0;
                    } else {
                      tg.field_S = e.field_c.h(-1);
                      e.field_c.field_n = 0;
                      ai.field_i = param0[tg.field_S];
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
                if (jc.a(-111)) {
                  if (tk.field_b == 0) {
                    kk.field_c = pk.field_c;
                    pk.field_c = qm.field_y;
                    qm.field_y = Confined.field_F;
                    Confined.field_F = tg.field_S;
                    tg.field_S = -1;
                    stackOut_36_0 = 1;
                    stackIn_37_0 = stackOut_36_0;
                    break L0;
                  } else {
                    L7: {
                      var4 = tk.field_b;
                      if (0.0 != gl.field_i) {
                        var4 = (int)((double)var4 + hj.field_h.nextGaussian() * gl.field_i);
                        if (var4 < 0) {
                          var4 = 0;
                          break L7;
                        } else {
                          break L7;
                        }
                      } else {
                        break L7;
                      }
                    }
                    var5 = new hc((long)var4 + var2_long, tg.field_S, new byte[ai.field_i]);
                    var6 = 0;
                    L8: while (true) {
                      if (~var6 <= ~ai.field_i) {
                        qh.field_w.a((rk) (Object) var5, (byte) -93);
                        tg.field_S = -1;
                        stackOut_15_0 = tg.field_S;
                        stackIn_16_0 = stackOut_15_0;
                        continue L5;
                      } else {
                        var5.field_q[var6] = e.field_c.field_m[var6];
                        var6++;
                        continue L8;
                      }
                    }
                  }
                } else {
                  stackOut_24_0 = 0;
                  stackIn_25_0 = stackOut_24_0;
                  return stackIn_25_0 != 0;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var2;
            stackOut_38_1 = new StringBuilder().append("pe.D(");
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param0 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L9;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L9;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + 44 + -69 + 41);
        }
        return stackIn_37_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = 0;
        field_p = new va();
    }
}
