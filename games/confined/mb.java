/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mb extends ka {
    private double field_R;
    static String field_H;
    private double field_Q;

    final static boolean a(boolean param0, byte param1) {
        try {
            hb var4 = null;
            hb var5 = null;
            if (param1 != 17) {
                return false;
            }
            if (null == mg.field_a) {
                mg.field_a = ld.field_k.a(nd.field_s, -90, af.field_ab);
            }
            if (!(-1 != mg.field_a.field_g)) {
                return false;
            }
            pc.field_a = ri.a(param1 + -20);
            m.field_b = ri.a(param1 + -20);
            if (-2 != mg.field_a.field_g) {
                lk.field_d = i.field_q;
            } else {
                try {
                    kl.field_G = new vd((java.net.Socket) mg.field_a.field_f, ld.field_k);
                    var4 = e.field_c;
                    var5 = var4;
                    vh.field_a.field_n = 0;
                    kk.field_c = !param0 ? -1 : -2;
                    pk.field_c = !param0 ? -1 : -2;
                    qm.field_y = !param0 ? -1 : -2;
                    lk.field_d = si.field_g;
                    var5.field_n = 0;
                    ql.a(kk.field_b, (kg) (Object) vh.field_a, rg.field_M, (byte) 40, qa.field_c);
                    tb.a(-1, 116);
                } catch (IOException iOException) {
                    lk.field_d = i.field_q;
                }
            }
            mg.field_a = null;
            return true;
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
            Object var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            String var11 = null;
            df stackIn_13_0 = null;
            int stackIn_13_1 = 0;
            java.net.URL stackIn_13_2 = null;
            java.net.URL stackIn_13_3 = null;
            java.net.URL stackIn_13_4 = null;
            StringBuilder stackIn_13_5 = null;
            df stackIn_14_0 = null;
            int stackIn_14_1 = 0;
            java.net.URL stackIn_14_2 = null;
            java.net.URL stackIn_14_3 = null;
            java.net.URL stackIn_14_4 = null;
            StringBuilder stackIn_14_5 = null;
            df stackIn_15_0 = null;
            int stackIn_15_1 = 0;
            java.net.URL stackIn_15_2 = null;
            java.net.URL stackIn_15_3 = null;
            java.net.URL stackIn_15_4 = null;
            StringBuilder stackIn_15_5 = null;
            String stackIn_15_6 = null;
            df stackOut_12_0 = null;
            int stackOut_12_1 = 0;
            java.net.URL stackOut_12_2 = null;
            java.net.URL stackOut_12_3 = null;
            java.net.URL stackOut_12_4 = null;
            StringBuilder stackOut_12_5 = null;
            df stackOut_13_0 = null;
            int stackOut_13_1 = 0;
            java.net.URL stackOut_13_2 = null;
            java.net.URL stackOut_13_3 = null;
            java.net.URL stackOut_13_4 = null;
            StringBuilder stackOut_13_5 = null;
            String stackOut_13_6 = null;
            df stackOut_14_0 = null;
            int stackOut_14_1 = 0;
            java.net.URL stackOut_14_2 = null;
            java.net.URL stackOut_14_3 = null;
            java.net.URL stackOut_14_4 = null;
            StringBuilder stackOut_14_5 = null;
            String stackOut_14_6 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = Confined.field_J ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3_ref = "";
                            if (param2 == null) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var3_ref = ag.a(-19080, param2);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (param0 == null) {
                                statePc = 7;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (param2 == null) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var3_ref = var3_ref + " | ";
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var3_ref = var3_ref + param0;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            ej.a(0, var3_ref);
                            var8 = pi.a(":", "%3a", 22232, var3_ref);
                            var9 = pi.a("@", "%40", 22232, var8);
                            var10 = pi.a("&", "%26", 22232, var9);
                            var11 = pi.a("#", "%23", 22232, var10);
                            if (param1) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var7 = null;
                            mb.a((Object) null, 13, (df) null);
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (kc.field_k == null) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        return;
                    }
                    case 12: {
                        try {
                            stackOut_12_0 = hh.field_c;
                            stackOut_12_1 = 0;
                            stackOut_12_2 = null;
                            stackOut_12_3 = null;
                            stackOut_12_4 = kc.field_k.getCodeBase();
                            stackOut_12_5 = new StringBuilder().append("clienterror.ws?c=").append(uh.field_f).append("&u=");
                            stackIn_14_0 = stackOut_12_0;
                            stackIn_14_1 = stackOut_12_1;
                            stackIn_14_2 = stackOut_12_2;
                            stackIn_14_3 = stackOut_12_3;
                            stackIn_14_4 = stackOut_12_4;
                            stackIn_14_5 = stackOut_12_5;
                            stackIn_13_0 = stackOut_12_0;
                            stackIn_13_1 = stackOut_12_1;
                            stackIn_13_2 = stackOut_12_2;
                            stackIn_13_3 = stackOut_12_3;
                            stackIn_13_4 = stackOut_12_4;
                            stackIn_13_5 = stackOut_12_5;
                            if (kc.field_f == null) {
                                statePc = 14;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            stackOut_13_0 = (df) (Object) stackIn_13_0;
                            stackOut_13_1 = stackIn_13_1;
                            stackOut_13_2 = null;
                            stackOut_13_3 = null;
                            stackOut_13_4 = (java.net.URL) (Object) stackIn_13_4;
                            stackOut_13_5 = (StringBuilder) (Object) stackIn_13_5;
                            stackOut_13_6 = kc.field_f;
                            stackIn_15_0 = stackOut_13_0;
                            stackIn_15_1 = stackOut_13_1;
                            stackIn_15_2 = stackOut_13_2;
                            stackIn_15_3 = stackOut_13_3;
                            stackIn_15_4 = stackOut_13_4;
                            stackIn_15_5 = stackOut_13_5;
                            stackIn_15_6 = stackOut_13_6;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            stackOut_14_0 = (df) (Object) stackIn_14_0;
                            stackOut_14_1 = stackIn_14_1;
                            stackOut_14_2 = null;
                            stackOut_14_3 = null;
                            stackOut_14_4 = (java.net.URL) (Object) stackIn_14_4;
                            stackOut_14_5 = (StringBuilder) (Object) stackIn_14_5;
                            stackOut_14_6 = "" + i.field_p;
                            stackIn_15_0 = stackOut_14_0;
                            stackIn_15_1 = stackOut_14_1;
                            stackIn_15_2 = stackOut_14_2;
                            stackIn_15_3 = stackOut_14_3;
                            stackIn_15_4 = stackOut_14_4;
                            stackIn_15_5 = stackOut_14_5;
                            stackIn_15_6 = stackOut_14_6;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            new java.net.URL(stackIn_15_4, stackIn_15_6 + "&v1=" + df.field_b + "&v2=" + df.field_s + "&e=" + var11);
                            var4 = ((df) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_15_2);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (var4.field_g != 0) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            jd.a(1, 1L);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (var4.field_g != 1) {
                                statePc = 22;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var5 = (DataInputStream) var4.field_f;
                            int discarded$1 = var5.read();
                            var5.close();
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 22: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, ah param1) {
        ((mb) this).a(true, (ee) (Object) param1);
        int var3 = -24 / ((14 - param0) / 53);
    }

    mb(pm param0, double param1, double param2, double param3, bi param4) {
        super(param0, param1, param4);
        ((mb) this).field_Q = param2 * ((mb) this).field_C;
        ((mb) this).field_R = ((mb) this).field_C * param3;
    }

    final void a(pm param0, int param1) {
        param0.a(-23154, (mb) this);
        if (param1 >= -81) {
            field_H = null;
        }
    }

    final static void a(Object param0, int param1, df param2) {
        Exception var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Confined.field_J ? 1 : 0;
                    if (null == param2.field_k) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return;
                }
                case 3: {
                    var3_int = 0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if ((var3_int ^ -1) <= -51) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (null == param2.field_k.peekEvent()) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    jd.a(1, 1L);
                    var3_int++;
                    statePc = 4;
                    continue stateLoop;
                }
                case 7: {
                    try {
                        if (param1 == 1001) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        field_H = null;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (param0 == null) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        param2.field_k.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param0, 1001, "dummy"));
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    var3 = (Exception) (Object) caughtException;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, hf param1) {
        ((mb) this).a(true, (ee) (Object) param1);
        if (param0 > -29) {
            Object var4 = null;
            ((mb) this).a(true, (il) null);
        }
    }

    final void a(int param0, mb param1) {
        if (param0 != -23154) {
            Object var4 = null;
            ((mb) this).a(false, (il) null);
        }
    }

    final void a(boolean param0, ee param1) {
        double var3 = -((mb) this).field_E + param1.field_E;
        double var5 = -((mb) this).field_t + param1.field_t;
        double var7 = -((mb) this).field_D + param1.field_D;
        if (!param0) {
            Object var17 = null;
            ((mb) this).a(true, (il) null);
        }
        double var9 = Math.sqrt(var7 * var7 + (var5 * var5 + var3 * var3));
        double var11 = -var9 + (((mb) this).field_C + param1.field_C);
        double var13 = (1.0 - ((mb) this).field_K / (double)uc.field_db.length) * ((mb) this).field_Q;
        if (param1.field_C > var11) {
            var13 = var13 * (var11 / param1.field_C);
        }
        double var15 = var9 >= 0.001 ? 1.0 / var9 : 1000.0;
        var3 = var3 * var15;
        var7 = var7 * var15;
        var11 = var11 * (((mb) this).field_R / param1.field_M);
        var5 = var5 * var15;
        param1.field_L = param1.field_L + var7 * var11;
        param1.field_K = param1.field_K + var3 * var11;
        param1.field_G = param1.field_G + var5 * var11;
    }

    final void a(byte param0, sa param1) {
        if (param0 != 9) {
            return;
        }
        ((mb) this).a(true, (ee) (Object) param1);
    }

    public static void m(int param0) {
        field_H = null;
        if (param0 != 1072) {
            Object var2 = null;
            mb.a((String) null, true, (Throwable) null);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6, int param7, byte param8) {
        int var9 = 0;
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
        L0: {
          var19 = Confined.field_J ? 1 : 0;
          if (param8 == 112) {
            break L0;
          } else {
            field_H = null;
            break L0;
          }
        }
        L1: {
          if (0 > param0) {
            break L1;
          } else {
            if (ti.field_g <= param3) {
              break L1;
            } else {
              L2: {
                if (param4 >= 0) {
                  break L2;
                } else {
                  if (0 <= param7) {
                    break L2;
                  } else {
                    if (param6 < 0) {
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L3: {
                if (param4 < ti.field_e) {
                  break L3;
                } else {
                  if (ti.field_e > param7) {
                    break L3;
                  } else {
                    if (param6 >= ti.field_e) {
                      return;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              L4: {
                L5: {
                  var14 = -param3 + param0;
                  if (param3 == param2) {
                    break L5;
                  } else {
                    L6: {
                      L7: {
                        var10 = param4 << -2035249872;
                        var9 = param4 << -2035249872;
                        var15 = param2 + -param3;
                        var12 = (param6 - param4 << -56263472) / var14;
                        var11 = (-param4 + param7 << 1370294576) / var15;
                        if (var12 <= var11) {
                          break L7;
                        } else {
                          var13 = 0;
                          if (0 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var13 = 1;
                      var16 = var11;
                      var11 = var12;
                      var12 = var16;
                      break L6;
                    }
                    L8: {
                      L9: {
                        if (param3 >= 0) {
                          break L9;
                        } else {
                          L10: {
                            if (param2 < 0) {
                              break L10;
                            } else {
                              param3 = -param3;
                              var9 = var9 + var11 * param3;
                              var10 = var10 + param3 * var12;
                              param3 = 0;
                              if (0 == 0) {
                                break L9;
                              } else {
                                break L10;
                              }
                            }
                          }
                          param3 = param2 + -param3;
                          var9 = var9 + param3 * var11;
                          var10 = var10 + param3 * var12;
                          param3 = param2;
                          if (0 == 0) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                      var16 = ti.field_l[param3];
                      L11: while (true) {
                        if (param3 >= param2) {
                          break L8;
                        } else {
                          L12: {
                            var17 = var9 >> 941504016;
                            if (var17 >= ti.field_e) {
                              break L12;
                            } else {
                              L13: {
                                var18 = (var10 >> -490799408) - (var9 >> 882978128);
                                if (var18 == 0) {
                                  break L13;
                                } else {
                                  L14: {
                                    if (var17 + var18 >= ti.field_e) {
                                      var18 = ti.field_e - (var17 + 1);
                                      break L14;
                                    } else {
                                      break L14;
                                    }
                                  }
                                  L15: {
                                    if (0 > var17) {
                                      break L15;
                                    } else {
                                      sm.a(param5, param1, var17 - -var16, var18, 87);
                                      if (0 == 0) {
                                        break L12;
                                      } else {
                                        break L15;
                                      }
                                    }
                                  }
                                  sm.a(param5, param1, var16, var18 + var17, 87);
                                  if (0 == 0) {
                                    break L12;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              if (var17 < 0) {
                                break L12;
                              } else {
                                if (var17 >= ti.field_e) {
                                  break L12;
                                } else {
                                  sm.a(param5, param1, var16 + var17, var18, 87);
                                  break L12;
                                }
                              }
                            }
                          }
                          param3++;
                          if (ti.field_g > param3) {
                            var16 = var16 + fn.field_g;
                            var10 = var10 + var12;
                            var9 = var9 + var11;
                            if (0 == 0) {
                              continue L11;
                            } else {
                              break L8;
                            }
                          } else {
                            return;
                          }
                        }
                      }
                    }
                    L16: {
                      L17: {
                        var16 = -param2 + param0;
                        if (var16 != 0) {
                          break L17;
                        } else {
                          var12 = 0;
                          var11 = 0;
                          if (0 == 0) {
                            break L16;
                          } else {
                            break L17;
                          }
                        }
                      }
                      L18: {
                        L19: {
                          var17 = param6 << -540023408;
                          if (var13 != 0) {
                            break L19;
                          } else {
                            var9 = param7 << 111756336;
                            if (0 == 0) {
                              break L18;
                            } else {
                              break L19;
                            }
                          }
                        }
                        var10 = param7 << 1291341584;
                        break L18;
                      }
                      var11 = (var17 - var9) / var16;
                      var12 = (var17 + -var10) / var16;
                      break L16;
                    }
                    if (0 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                L20: {
                  L21: {
                    if (param3 == param0) {
                      break L21;
                    } else {
                      L22: {
                        L23: {
                          var15 = -param2 + param0;
                          if (param7 > param4) {
                            break L23;
                          } else {
                            var10 = param4 << -344652336;
                            var12 = (param6 + -param4 << 1369427664) / var14;
                            var11 = (param6 + -param7 << 1034916336) / var15;
                            var9 = param7 << -1554678064;
                            if (0 == 0) {
                              break L22;
                            } else {
                              break L23;
                            }
                          }
                        }
                        var12 = (param6 - param7 << 1808336208) / var15;
                        var10 = param7 << -1629485552;
                        var9 = param4 << 745981552;
                        var11 = (-param4 + param6 << 1641842160) / var14;
                        break L22;
                      }
                      if (0 == 0) {
                        break L20;
                      } else {
                        break L21;
                      }
                    }
                  }
                  var12 = 0;
                  var9 = param4 << 2024436112;
                  var11 = 0;
                  var10 = param7 << 1478089136;
                  break L20;
                }
                var13 = 0;
                if (param3 >= 0) {
                  break L4;
                } else {
                  param3 = Math.min(-param3, param2 + -param3);
                  var9 = var9 + param3 * var11;
                  var10 = var10 + var12 * param3;
                  param3 = 0;
                  break L4;
                }
              }
              L24: {
                if (0 > param3) {
                  param3 = -param3;
                  var10 = var10 + param3 * var12;
                  var9 = var9 + var11 * param3;
                  param3 = 0;
                  break L24;
                } else {
                  break L24;
                }
              }
              L25: {
                var15 = ti.field_l[param3];
                if (param0 <= param3) {
                  break L25;
                } else {
                  L26: {
                    var16 = var9 >> -1855143088;
                    if (var16 < ti.field_e) {
                      L27: {
                        var17 = (var10 >> -424644816) - (var9 >> -237114160);
                        if (0 == var17) {
                          break L27;
                        } else {
                          L28: {
                            if (ti.field_e <= var17 + var16) {
                              var17 = ti.field_e - var16 - 1;
                              break L28;
                            } else {
                              break L28;
                            }
                          }
                          L29: {
                            if (var16 < 0) {
                              break L29;
                            } else {
                              sm.a(param5, param1, var16 - -var15, var17, param8 + -25);
                              if (0 == 0) {
                                break L26;
                              } else {
                                break L29;
                              }
                            }
                          }
                          sm.a(param5, param1, var15, var17 - -var16, 87);
                          if (0 == 0) {
                            break L26;
                          } else {
                            break L27;
                          }
                        }
                      }
                      if (0 > var16) {
                        break L26;
                      } else {
                        if (ti.field_e <= var16) {
                          break L26;
                        } else {
                          sm.a(param5, param1, var15 + var16, var17, 87);
                          break L26;
                        }
                      }
                    } else {
                      break L26;
                    }
                  }
                  param3++;
                  if (param3 < ti.field_g) {
                    var15 = var15 + fn.field_g;
                    var10 = var10 + var12;
                    var9 = var9 + var11;
                    break L25;
                  } else {
                    return;
                  }
                }
              }
              return;
            }
          }
        }
    }

    final void a(cl param0, byte param1) {
        ((mb) this).a(true, (ee) (Object) param0);
        int var3 = 66 % ((-35 - param1) / 60);
    }

    final boolean g(byte param0) {
        if (param0 <= 64) {
            return true;
        }
        return true;
    }

    final void a(boolean param0, il param1) {
        if (param0) {
            ((mb) this).field_R = 0.5049676490090665;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "<col=FFFFFF>Shield:</col> this indispensable item creates a powerful defensive force field around your ship. Look out for these when your shield is low or lost. Without your shield, it only takes one hit to kill you!";
    }
}
