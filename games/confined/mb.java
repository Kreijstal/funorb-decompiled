/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.net.URL;
import java.lang.String;

final class mb extends ka {
    private double field_R;
    static String field_H;
    private double field_Q;

    final static boolean a(boolean param0, byte param1) {
        try {
            IOException iOException = null;
            hb var2 = null;
            RuntimeException var2_ref = null;
            int stackIn_2_0 = 0;
            int stackIn_10_0 = 0;
            int stackIn_19_0 = 0;
            int stackIn_23_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_9_0 = 0;
            int stackOut_18_0 = 0;
            int stackOut_16_0 = 0;
            int stackOut_22_0 = 0;
            int stackOut_1_0 = 0;
            try {
              L0: {
                if (param1 == 17) {
                  L1: {
                    if (null != mg.field_a) {
                      break L1;
                    } else {
                      mg.field_a = ld.field_k.a(nd.field_s, -90, af.field_ab);
                      break L1;
                    }
                  }
                  if (mg.field_a.field_g == 0) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0 != 0;
                  } else {
                    L2: {
                      L3: {
                        long dupTemp$2 = ri.a(param1 + -20);
                        pc.field_a = dupTemp$2;
                        m.field_b = dupTemp$2;
                        if (mg.field_a.field_g == 1) {
                          break L3;
                        } else {
                          lk.field_d = i.field_q;
                          if (!Confined.field_J) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      try {
                        L4: {
                          L5: {
                            kl.field_G = new vd((java.net.Socket) mg.field_a.field_f, ld.field_k);
                            var2 = e.field_c;
                            vh.field_a.field_n = 0;
                            if (param0) {
                              stackOut_18_0 = -2;
                              stackIn_19_0 = stackOut_18_0;
                              break L5;
                            } else {
                              stackOut_16_0 = -1;
                              stackIn_19_0 = stackOut_16_0;
                              break L5;
                            }
                          }
                          kk.field_c = stackIn_19_0;
                          pk.field_c = stackIn_19_0;
                          qm.field_y = stackIn_19_0;
                          lk.field_d = si.field_g;
                          var2.field_n = 0;
                          ql.a(kk.field_b, (kg) (Object) vh.field_a, rg.field_M, (byte) 40, qa.field_c);
                          tb.a(-1, 116);
                          break L4;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L6: {
                          iOException = (IOException) (Object) decompiledCaughtException;
                          lk.field_d = i.field_q;
                          break L6;
                        }
                      }
                      break L2;
                    }
                    mg.field_a = null;
                    stackOut_22_0 = 1;
                    stackIn_23_0 = stackOut_22_0;
                    break L0;
                  }
                } else {
                  stackOut_1_0 = 0;
                  stackIn_2_0 = stackOut_1_0;
                  return stackIn_2_0 != 0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw sd.a((Throwable) (Object) var2_ref, "mb.B(" + param0 + ',' + param1 + ')');
            }
            return stackIn_23_0 != 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(String param0, boolean param1, Throwable param2) {
        try {
            Exception var3 = null;
            String var3_ref = null;
            bc var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            df stackIn_17_0 = null;
            int stackIn_17_1 = 0;
            java.net.URL stackIn_17_2 = null;
            java.net.URL stackIn_17_3 = null;
            java.net.URL stackIn_17_4 = null;
            StringBuilder stackIn_17_5 = null;
            df stackIn_19_0 = null;
            int stackIn_19_1 = 0;
            java.net.URL stackIn_19_2 = null;
            java.net.URL stackIn_19_3 = null;
            java.net.URL stackIn_19_4 = null;
            StringBuilder stackIn_19_5 = null;
            df stackIn_20_0 = null;
            int stackIn_20_1 = 0;
            java.net.URL stackIn_20_2 = null;
            java.net.URL stackIn_20_3 = null;
            java.net.URL stackIn_20_4 = null;
            StringBuilder stackIn_20_5 = null;
            String stackIn_20_6 = null;
            Throwable decompiledCaughtException = null;
            df stackOut_16_0 = null;
            int stackOut_16_1 = 0;
            java.net.URL stackOut_16_2 = null;
            java.net.URL stackOut_16_3 = null;
            java.net.URL stackOut_16_4 = null;
            StringBuilder stackOut_16_5 = null;
            df stackOut_19_0 = null;
            int stackOut_19_1 = 0;
            java.net.URL stackOut_19_2 = null;
            java.net.URL stackOut_19_3 = null;
            java.net.URL stackOut_19_4 = null;
            StringBuilder stackOut_19_5 = null;
            String stackOut_19_6 = null;
            df stackOut_17_0 = null;
            int stackOut_17_1 = 0;
            java.net.URL stackOut_17_2 = null;
            java.net.URL stackOut_17_3 = null;
            java.net.URL stackOut_17_4 = null;
            StringBuilder stackOut_17_5 = null;
            String stackOut_17_6 = null;
            var6 = Confined.field_J ? 1 : 0;
            try {
              L0: {
                L1: {
                  var3_ref = "";
                  if (param2 == null) {
                    break L1;
                  } else {
                    var3_ref = ag.a(-19080, param2);
                    break L1;
                  }
                }
                L2: {
                  if (null == param0) {
                    break L2;
                  } else {
                    L3: {
                      if (null == param2) {
                        break L3;
                      } else {
                        var3_ref = var3_ref + " | ";
                        break L3;
                      }
                    }
                    var3_ref = var3_ref + param0;
                    break L2;
                  }
                }
                L4: {
                  ej.a(0, var3_ref);
                  var3_ref = pi.a(":", "%3a", 22232, var3_ref);
                  var3_ref = pi.a("@", "%40", 22232, var3_ref);
                  var3_ref = pi.a("&", "%26", 22232, var3_ref);
                  var3_ref = pi.a("#", "%23", 22232, var3_ref);
                  if (param1) {
                    break L4;
                  } else {
                    mb.a((Object) null, 13, (df) null);
                    break L4;
                  }
                }
                if (kc.field_k == null) {
                  return;
                } else {
                  L5: {
                    stackOut_16_0 = hh.field_c;
                    stackOut_16_1 = 0;
                    stackOut_16_2 = null;
                    stackOut_16_3 = null;
                    stackOut_16_4 = kc.field_k.getCodeBase();
                    stackOut_16_5 = new StringBuilder().append("clienterror.ws?c=").append(uh.field_f).append("&u=");
                    stackIn_19_0 = stackOut_16_0;
                    stackIn_19_1 = stackOut_16_1;
                    stackIn_19_2 = stackOut_16_2;
                    stackIn_19_3 = stackOut_16_3;
                    stackIn_19_4 = stackOut_16_4;
                    stackIn_19_5 = stackOut_16_5;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    stackIn_17_2 = stackOut_16_2;
                    stackIn_17_3 = stackOut_16_3;
                    stackIn_17_4 = stackOut_16_4;
                    stackIn_17_5 = stackOut_16_5;
                    if (kc.field_f == null) {
                      stackOut_19_0 = (df) (Object) stackIn_19_0;
                      stackOut_19_1 = stackIn_19_1;
                      stackOut_19_2 = null;
                      stackOut_19_3 = null;
                      stackOut_19_4 = (java.net.URL) (Object) stackIn_19_4;
                      stackOut_19_5 = (StringBuilder) (Object) stackIn_19_5;
                      stackOut_19_6 = "" + i.field_p;
                      stackIn_20_0 = stackOut_19_0;
                      stackIn_20_1 = stackOut_19_1;
                      stackIn_20_2 = stackOut_19_2;
                      stackIn_20_3 = stackOut_19_3;
                      stackIn_20_4 = stackOut_19_4;
                      stackIn_20_5 = stackOut_19_5;
                      stackIn_20_6 = stackOut_19_6;
                      break L5;
                    } else {
                      stackOut_17_0 = (df) (Object) stackIn_17_0;
                      stackOut_17_1 = stackIn_17_1;
                      stackOut_17_2 = null;
                      stackOut_17_3 = null;
                      stackOut_17_4 = (java.net.URL) (Object) stackIn_17_4;
                      stackOut_17_5 = (StringBuilder) (Object) stackIn_17_5;
                      stackOut_17_6 = kc.field_f;
                      stackIn_20_0 = stackOut_17_0;
                      stackIn_20_1 = stackOut_17_1;
                      stackIn_20_2 = stackOut_17_2;
                      stackIn_20_3 = stackOut_17_3;
                      stackIn_20_4 = stackOut_17_4;
                      stackIn_20_5 = stackOut_17_5;
                      stackIn_20_6 = stackOut_17_6;
                      break L5;
                    }
                  }
                  var4 = ((df) (Object) stackIn_20_0).a(stackIn_20_1, new java.net.URL(stackIn_20_4, stackIn_20_6 + "&v1=" + df.field_b + "&v2=" + df.field_s + "&e=" + var3_ref));
                  L6: while (true) {
                    L7: {
                      L8: {
                        if (var4.field_g != 0) {
                          break L8;
                        } else {
                          jd.a(1, 1L);
                          if (var6 != 0) {
                            break L7;
                          } else {
                            if (var6 == 0) {
                              continue L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                      if (var4.field_g != 1) {
                        break L7;
                      } else {
                        var5 = (DataInputStream) var4.field_f;
                        int discarded$1 = var5.read();
                        var5.close();
                        break L7;
                      }
                    }
                    break L0;
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L9: {
                var3 = (Exception) (Object) decompiledCaughtException;
                break L9;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, ah param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            ((mb) this).a(true, (ee) (Object) param1);
            var3_int = -24 / ((14 - param0) / 53);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("mb.C(").append(param0).append(',');
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    mb(pm param0, double param1, double param2, double param3, bi param4) {
        super(param0, param1, param4);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            ((mb) this).field_Q = param2 * ((mb) this).field_C;
            ((mb) this).field_R = ((mb) this).field_C * param3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("mb.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param4 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    final void a(pm param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              param0.a(-23154, (mb) this);
              if (param1 < -81) {
                break L1;
              } else {
                field_H = null;
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
            stackOut_3_1 = new StringBuilder().append("mb.D(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
    }

    final static void a(Object param0, int param1, df param2) {
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var3_int = 0;
        int var4 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_16_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        Object stackOut_6_0 = null;
        Object stackOut_14_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Confined.field_J ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (null == param2.field_k) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        var3_int = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var3_int >= 50) {
                            statePc = 13;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = null;
                        stackIn_16_0 = stackOut_6_0;
                        stackIn_7_0 = stackOut_6_0;
                        if (var4 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (stackIn_7_0 == (Object) (Object) param2.field_k.peekEvent()) {
                            statePc = 13;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        jd.a(1, 1L);
                        var3_int++;
                        if (var4 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (param1 == 1001) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = ((Object) stateCaught_13 instanceof Exception ? 21 : 23);
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = null;
                        stackIn_16_0 = stackOut_14_0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = ((Object) stateCaught_14 instanceof Exception ? 21 : 23);
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        field_H = (String) (Object) stackIn_16_0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = ((Object) stateCaught_16 instanceof Exception ? 21 : 23);
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (param0 == null) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = ((Object) stateCaught_17 instanceof Exception ? 21 : 23);
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        param2.field_k.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param0, 1001, "dummy"));
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = ((Object) stateCaught_18 instanceof Exception ? 21 : 23);
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 23: {
                    var3_ref = (RuntimeException) (Object) caughtException;
                    stackOut_23_0 = (RuntimeException) var3_ref;
                    stackOut_23_1 = new StringBuilder().append("mb.H(");
                    stackIn_26_0 = stackOut_23_0;
                    stackIn_26_1 = stackOut_23_1;
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    if (param0 == null) {
                        statePc = 26;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
                    stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
                    stackOut_24_2 = "{...}";
                    stackIn_27_0 = stackOut_24_0;
                    stackIn_27_1 = stackOut_24_1;
                    stackIn_27_2 = stackOut_24_2;
                    statePc = 27;
                    continue stateLoop;
                }
                case 26: {
                    stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
                    stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
                    stackOut_26_2 = "null";
                    stackIn_27_0 = stackOut_26_0;
                    stackIn_27_1 = stackOut_26_1;
                    stackIn_27_2 = stackOut_26_2;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
                    stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param1).append(',');
                    stackIn_30_0 = stackOut_27_0;
                    stackIn_30_1 = stackOut_27_1;
                    stackIn_28_0 = stackOut_27_0;
                    stackIn_28_1 = stackOut_27_1;
                    if (param2 == null) {
                        statePc = 30;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
                    stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
                    stackOut_28_2 = "{...}";
                    stackIn_31_0 = stackOut_28_0;
                    stackIn_31_1 = stackOut_28_1;
                    stackIn_31_2 = stackOut_28_2;
                    statePc = 31;
                    continue stateLoop;
                }
                case 30: {
                    stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
                    stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
                    stackOut_30_2 = "null";
                    stackIn_31_0 = stackOut_30_0;
                    stackIn_31_1 = stackOut_30_1;
                    stackIn_31_2 = stackOut_30_2;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    throw sd.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ')');
                }
                case 32: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, hf param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((mb) this).a(true, (ee) (Object) param1);
              if (param0 <= -29) {
                break L1;
              } else {
                ((mb) this).a(true, (il) null);
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
            stackOut_3_1 = new StringBuilder().append("mb.A(").append(param0).append(',');
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    final void a(int param0, mb param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -23154) {
                break L1;
              } else {
                ((mb) this).a(false, (il) null);
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
            stackOut_3_1 = new StringBuilder().append("mb.F(").append(param0).append(',');
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    final void a(boolean param0, ee param1) {
        double var3_double = 0.0;
        RuntimeException var3 = null;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double stackIn_9_0 = 0.0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        double stackOut_8_0 = 0.0;
        double stackOut_6_0 = 0.0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              var3_double = -((mb) this).field_E + param1.field_E;
              var5 = -((mb) this).field_t + param1.field_t;
              var7 = -((mb) this).field_D + param1.field_D;
              if (param0) {
                break L1;
              } else {
                ((mb) this).a(true, (il) null);
                break L1;
              }
            }
            L2: {
              var9 = Math.sqrt(var7 * var7 + (var5 * var5 + var3_double * var3_double));
              var11 = -var9 + (((mb) this).field_C + param1.field_C);
              var13 = (1.0 - ((mb) this).field_K / (double)uc.field_db.length) * ((mb) this).field_Q;
              if (param1.field_C <= var11) {
                break L2;
              } else {
                var13 = var13 * (var11 / param1.field_C);
                break L2;
              }
            }
            L3: {
              if (var9 < 0.001) {
                stackOut_8_0 = 1000.0;
                stackIn_9_0 = stackOut_8_0;
                break L3;
              } else {
                stackOut_6_0 = 1.0 / var9;
                stackIn_9_0 = stackOut_6_0;
                break L3;
              }
            }
            var15 = stackIn_9_0;
            var3_double = var3_double * var15;
            var7 = var7 * var15;
            var11 = var11 * (((mb) this).field_R / param1.field_M);
            var5 = var5 * var15;
            param1.field_L = param1.field_L + var7 * var11;
            param1.field_K = param1.field_K + var3_double * var11;
            param1.field_G = param1.field_G + var5 * var11;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("mb.E(").append(param0).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L4;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    final void a(byte param0, sa param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param0 == 9) {
              ((mb) this).a(true, (ee) (Object) param1);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("mb.M(").append(param0).append(',');
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    public static void m(int param0) {
        try {
            field_H = null;
            if (param0 != 1072) {
                mb.a((String) null, true, (Throwable) null);
            }
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "mb.J(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6, int param7, byte param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        int stackIn_73_0 = 0;
        int stackIn_73_1 = 0;
        RuntimeException stackIn_129_0 = null;
        StringBuilder stackIn_129_1 = null;
        RuntimeException stackIn_131_0 = null;
        StringBuilder stackIn_131_1 = null;
        RuntimeException stackIn_132_0 = null;
        StringBuilder stackIn_132_1 = null;
        String stackIn_132_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_43_0 = 0;
        int stackOut_43_1 = 0;
        int stackOut_72_0 = 0;
        int stackOut_72_1 = 0;
        RuntimeException stackOut_128_0 = null;
        StringBuilder stackOut_128_1 = null;
        RuntimeException stackOut_131_0 = null;
        StringBuilder stackOut_131_1 = null;
        String stackOut_131_2 = null;
        RuntimeException stackOut_129_0 = null;
        StringBuilder stackOut_129_1 = null;
        String stackOut_129_2 = null;
        var19 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param8 == 112) {
                break L1;
              } else {
                field_H = null;
                break L1;
              }
            }
            L2: {
              if (0 > param0) {
                break L2;
              } else {
                if (ti.field_g <= param3) {
                  break L2;
                } else {
                  L3: {
                    if (param4 >= 0) {
                      break L3;
                    } else {
                      if (0 <= param7) {
                        break L3;
                      } else {
                        if (param6 < 0) {
                          return;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L4: {
                    if (param4 < ti.field_e) {
                      break L4;
                    } else {
                      if (ti.field_e > param7) {
                        break L4;
                      } else {
                        if (~param6 <= ~ti.field_e) {
                          return;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  L5: {
                    L6: {
                      var14 = -param3 + param0;
                      if (~param3 == ~param2) {
                        break L6;
                      } else {
                        L7: {
                          L8: {
                            var10 = param4 << -2035249872;
                            var9_int = param4 << -2035249872;
                            var15 = param2 + -param3;
                            var12 = (param6 - param4 << -56263472) / var14;
                            var11 = (-param4 + param7 << 1370294576) / var15;
                            if (~var12 >= ~var11) {
                              break L8;
                            } else {
                              var13 = 0;
                              if (var19 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          var13 = 1;
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
                          break L7;
                        }
                        L9: {
                          L10: {
                            L11: {
                              if (param3 >= 0) {
                                break L11;
                              } else {
                                L12: {
                                  if (param2 < 0) {
                                    break L12;
                                  } else {
                                    param3 = -param3;
                                    var9_int = var9_int + var11 * param3;
                                    var10 = var10 + param3 * var12;
                                    param3 = 0;
                                    if (var19 == 0) {
                                      break L11;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                                param3 = param2 + -param3;
                                var9_int = var9_int + param3 * var11;
                                var10 = var10 + param3 * var12;
                                param3 = param2;
                                if (var19 == 0) {
                                  break L10;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            var16 = ti.field_l[param3];
                            L13: while (true) {
                              if (param3 >= param2) {
                                break L10;
                              } else {
                                var17 = var9_int >> 941504016;
                                stackOut_43_0 = var17;
                                stackOut_43_1 = ti.field_e;
                                stackIn_73_0 = stackOut_43_0;
                                stackIn_73_1 = stackOut_43_1;
                                stackIn_44_0 = stackOut_43_0;
                                stackIn_44_1 = stackOut_43_1;
                                if (var19 != 0) {
                                  break L9;
                                } else {
                                  L14: {
                                    if (stackIn_44_0 >= stackIn_44_1) {
                                      break L14;
                                    } else {
                                      L15: {
                                        var18 = (var10 >> -490799408) - (var9_int >> 882978128);
                                        if (var18 == 0) {
                                          break L15;
                                        } else {
                                          L16: {
                                            if (var17 + var18 >= ti.field_e) {
                                              var18 = ti.field_e - (var17 + 1);
                                              break L16;
                                            } else {
                                              break L16;
                                            }
                                          }
                                          L17: {
                                            if (0 > var17) {
                                              break L17;
                                            } else {
                                              sm.a(param5, param1, var17 - -var16, var18, 87);
                                              if (var19 == 0) {
                                                break L14;
                                              } else {
                                                break L17;
                                              }
                                            }
                                          }
                                          sm.a(param5, param1, var16, var18 + var17, 87);
                                          if (var19 == 0) {
                                            break L14;
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                      if (var17 < 0) {
                                        break L14;
                                      } else {
                                        if (~var17 <= ~ti.field_e) {
                                          break L14;
                                        } else {
                                          sm.a(param5, param1, var16 + var17, var18, 87);
                                          break L14;
                                        }
                                      }
                                    }
                                  }
                                  param3++;
                                  if (~ti.field_g < ~param3) {
                                    var16 = var16 + fn.field_g;
                                    var10 = var10 + var12;
                                    var9_int = var9_int + var11;
                                    if (var19 == 0) {
                                      continue L13;
                                    } else {
                                      break L10;
                                    }
                                  } else {
                                    return;
                                  }
                                }
                              }
                            }
                          }
                          var16 = -param2 + param0;
                          stackOut_72_0 = ~var16;
                          stackOut_72_1 = -1;
                          stackIn_73_0 = stackOut_72_0;
                          stackIn_73_1 = stackOut_72_1;
                          break L9;
                        }
                        L18: {
                          L19: {
                            if (stackIn_73_0 != stackIn_73_1) {
                              break L19;
                            } else {
                              var12 = 0;
                              var11 = 0;
                              if (var19 == 0) {
                                break L18;
                              } else {
                                break L19;
                              }
                            }
                          }
                          L20: {
                            L21: {
                              var17 = param6 << -540023408;
                              if (var13 != 0) {
                                break L21;
                              } else {
                                var9_int = param7 << 111756336;
                                if (var19 == 0) {
                                  break L20;
                                } else {
                                  break L21;
                                }
                              }
                            }
                            var10 = param7 << 1291341584;
                            break L20;
                          }
                          var11 = (var17 - var9_int) / var16;
                          var12 = (var17 + -var10) / var16;
                          break L18;
                        }
                        if (var19 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L22: {
                      L23: {
                        if (~param3 == ~param0) {
                          break L23;
                        } else {
                          L24: {
                            L25: {
                              var15 = -param2 + param0;
                              if (~param7 < ~param4) {
                                break L25;
                              } else {
                                var10 = param4 << -344652336;
                                var12 = (param6 + -param4 << 1369427664) / var14;
                                var11 = (param6 + -param7 << 1034916336) / var15;
                                var9_int = param7 << -1554678064;
                                if (var19 == 0) {
                                  break L24;
                                } else {
                                  break L25;
                                }
                              }
                            }
                            var12 = (param6 - param7 << 1808336208) / var15;
                            var10 = param7 << -1629485552;
                            var9_int = param4 << 745981552;
                            var11 = (-param4 + param6 << 1641842160) / var14;
                            break L24;
                          }
                          if (var19 == 0) {
                            break L22;
                          } else {
                            break L23;
                          }
                        }
                      }
                      var12 = 0;
                      var9_int = param4 << 2024436112;
                      var11 = 0;
                      var10 = param7 << 1478089136;
                      break L22;
                    }
                    var13 = 0;
                    if (param3 >= 0) {
                      break L5;
                    } else {
                      param3 = Math.min(-param3, param2 + -param3);
                      var9_int = var9_int + param3 * var11;
                      var10 = var10 + var12 * param3;
                      param3 = 0;
                      break L5;
                    }
                  }
                  L26: {
                    if (0 > param3) {
                      param3 = -param3;
                      var10 = var10 + param3 * var12;
                      var9_int = var9_int + var11 * param3;
                      param3 = 0;
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                  var15 = ti.field_l[param3];
                  L27: while (true) {
                    L28: {
                      L29: {
                        if (~param0 >= ~param3) {
                          break L29;
                        } else {
                          var16 = var9_int >> -1855143088;
                          if (var19 != 0) {
                            break L28;
                          } else {
                            L30: {
                              if (var16 < ti.field_e) {
                                L31: {
                                  var17 = (var10 >> -424644816) - (var9_int >> -237114160);
                                  if (0 == var17) {
                                    break L31;
                                  } else {
                                    L32: {
                                      if (~ti.field_e >= ~(var17 + var16)) {
                                        var17 = ti.field_e - var16 - 1;
                                        break L32;
                                      } else {
                                        break L32;
                                      }
                                    }
                                    L33: {
                                      if (var16 < 0) {
                                        break L33;
                                      } else {
                                        sm.a(param5, param1, var16 - -var15, var17, param8 + -25);
                                        if (var19 == 0) {
                                          break L30;
                                        } else {
                                          break L33;
                                        }
                                      }
                                    }
                                    sm.a(param5, param1, var15, var17 - -var16, 87);
                                    if (var19 == 0) {
                                      break L30;
                                    } else {
                                      break L31;
                                    }
                                  }
                                }
                                if (0 > var16) {
                                  break L30;
                                } else {
                                  if (~ti.field_e >= ~var16) {
                                    break L30;
                                  } else {
                                    sm.a(param5, param1, var15 + var16, var17, 87);
                                    break L30;
                                  }
                                }
                              } else {
                                break L30;
                              }
                            }
                            param3++;
                            if (~param3 > ~ti.field_g) {
                              var15 = var15 + fn.field_g;
                              var10 = var10 + var12;
                              var9_int = var9_int + var11;
                              if (var19 == 0) {
                                continue L27;
                              } else {
                                break L29;
                              }
                            } else {
                              return;
                            }
                          }
                        }
                      }
                      break L28;
                    }
                    break L0;
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L34: {
            var9 = decompiledCaughtException;
            stackOut_128_0 = (RuntimeException) var9;
            stackOut_128_1 = new StringBuilder().append("mb.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_131_0 = stackOut_128_0;
            stackIn_131_1 = stackOut_128_1;
            stackIn_129_0 = stackOut_128_0;
            stackIn_129_1 = stackOut_128_1;
            if (param5 == null) {
              stackOut_131_0 = (RuntimeException) (Object) stackIn_131_0;
              stackOut_131_1 = (StringBuilder) (Object) stackIn_131_1;
              stackOut_131_2 = "null";
              stackIn_132_0 = stackOut_131_0;
              stackIn_132_1 = stackOut_131_1;
              stackIn_132_2 = stackOut_131_2;
              break L34;
            } else {
              stackOut_129_0 = (RuntimeException) (Object) stackIn_129_0;
              stackOut_129_1 = (StringBuilder) (Object) stackIn_129_1;
              stackOut_129_2 = "{...}";
              stackIn_132_0 = stackOut_129_0;
              stackIn_132_1 = stackOut_129_1;
              stackIn_132_2 = stackOut_129_2;
              break L34;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_132_0, stackIn_132_2 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void a(cl param0, byte param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            ((mb) this).a(true, (ee) (Object) param0);
            var3_int = 66 % ((-35 - param1) / 60);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("mb.I(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final boolean g(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 > 64) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "mb.G(" + param0 + ')');
        }
        return stackIn_4_0 != 0;
    }

    final void a(boolean param0, il param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                ((mb) this).field_R = 0.5049676490090665;
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
            stackOut_3_1 = new StringBuilder().append("mb.L(").append(param0).append(',');
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "<col=FFFFFF>Shield:</col> this indispensable item creates a powerful defensive force field around your ship. Look out for these when your shield is low or lost. Without your shield, it only takes one hit to kill you!";
    }
}
