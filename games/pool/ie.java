/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie {
    static String field_c;
    static int[] field_d;
    static int field_g;
    static String field_i;
    static String field_e;
    static String field_b;
    static int field_h;
    static int[][] field_a;
    static jg field_f;

    final static void a(boolean param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        dd var6 = null;
        aa var7 = null;
        lk var8 = null;
        lk stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        lk stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        lk stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        RuntimeException decompiledCaughtException = null;
        lk stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        lk stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        lk stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        try {
          L0: {
            if (!ne.field_r.c(0)) {
              L1: {
                var3_int = 0;
                var4 = 0;
                var5 = 0;
                var6 = ((lk) (Object) ne.field_r.c((byte) 63)).field_n;
                if (var6 == null) {
                  break L1;
                } else {
                  L2: {
                    param1 = param1 - (var6.field_A >> 1);
                    if (gg.field_f < param1) {
                      break L2;
                    } else {
                      if (wn.field_i < 300) {
                        break L2;
                      } else {
                        if (530 < wn.field_i) {
                          break L2;
                        } else {
                          if (gg.field_f <= param1 - -var6.field_A) {
                            L3: {
                              if (eq.field_W != -1) {
                                var5 = -wn.field_i + eq.field_W;
                                break L3;
                              } else {
                                break L3;
                              }
                            }
                            eq.field_W = wn.field_i;
                            var3_int = 1;
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                  eq.field_W = -1;
                  break L1;
                }
              }
              var7 = new aa(ne.field_r);
              var8 = (lk) (Object) var7.b((byte) -92);
              L4: while (true) {
                L5: {
                  if (var8 == null) {
                    break L5;
                  } else {
                    if (var4 >= 230) {
                      break L5;
                    } else {
                      if (var8.field_n == null) {
                        var8.c(-1);
                        break L5;
                      } else {
                        L6: {
                          stackOut_19_0 = (lk) var8;
                          stackOut_19_1 = var8.field_p;
                          stackIn_21_0 = stackOut_19_0;
                          stackIn_21_1 = stackOut_19_1;
                          stackIn_20_0 = stackOut_19_0;
                          stackIn_20_1 = stackOut_19_1;
                          if (var3_int != 0) {
                            stackOut_21_0 = (lk) (Object) stackIn_21_0;
                            stackOut_21_1 = stackIn_21_1;
                            stackOut_21_2 = var5;
                            stackIn_22_0 = stackOut_21_0;
                            stackIn_22_1 = stackOut_21_1;
                            stackIn_22_2 = stackOut_21_2;
                            break L6;
                          } else {
                            stackOut_20_0 = (lk) (Object) stackIn_20_0;
                            stackOut_20_1 = stackIn_20_1;
                            stackOut_20_2 = var8.field_q;
                            stackIn_22_0 = stackOut_20_0;
                            stackIn_22_1 = stackOut_20_1;
                            stackIn_22_2 = stackOut_20_2;
                            break L6;
                          }
                        }
                        L7: {
                          stackIn_22_0.field_p = stackIn_22_1 - stackIn_22_2;
                          if (var8.field_p >= -var8.field_n.field_z) {
                            break L7;
                          } else {
                            int fieldTemp$1 = var8.field_l - 1;
                            var8.field_l = var8.field_l - 1;
                            if (fieldTemp$1 == 0) {
                              var8.a((byte) -117);
                              break L7;
                            } else {
                              var8.field_p = var8.field_p + (4 + var8.field_n.field_z);
                              break L7;
                            }
                          }
                        }
                        var4 = var8.field_l * (4 + var8.field_n.field_z) + var8.field_p;
                        var8 = (lk) (Object) var7.b(-86);
                        continue L4;
                      }
                    }
                  }
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var3, "ie.F(" + 0 + 44 + param1 + 44 + 300 + 41);
        }
    }

    final static boolean a(byte param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            RuntimeException var2_ref2 = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int stackIn_2_0 = 0;
            int stackIn_8_0 = 0;
            int stackIn_15_0 = 0;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            int stackOut_1_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_13_0 = 0;
            int stackOut_14_0 = 0;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            if (!iq.field_j) {
                                statePc = 3;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            stackOut_1_0 = 1;
                            stackIn_2_0 = stackOut_1_0;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        return stackIn_2_0 != 0;
                    }
                    case 3: {
                        try {
                            var2 = "tuhstatbut";
                            var3 = (String) mo.a((byte) -88, "getcookies", param1);
                            var4 = jc.a(30634, var3, ';');
                            var5 = 0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (var4.length <= var5) {
                                statePc = 12;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            if (var6 < 0) {
                                statePc = 9;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
                                statePc = 9;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            stackOut_7_0 = 1;
                            stackIn_8_0 = stackOut_7_0;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        return stackIn_8_0 != 0;
                    }
                    case 9: {
                        try {
                            var5++;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            var2_ref = caughtException;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if (param1.getParameter("tuhstatbut") == null) {
                                statePc = 14;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            stackOut_13_0 = 1;
                            stackIn_15_0 = stackOut_13_0;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            stackOut_14_0 = 0;
                            stackIn_15_0 = stackOut_14_0;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        return stackIn_15_0 != 0;
                    }
                    case 16: {
                        var2_ref2 = (RuntimeException) (Object) caughtException;
                        stackOut_16_0 = (RuntimeException) var2_ref2;
                        stackOut_16_1 = new StringBuilder().append("ie.C(").append(28).append(44);
                        stackIn_18_0 = stackOut_16_0;
                        stackIn_18_1 = stackOut_16_1;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        if (param1 == null) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                        stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                        stackOut_17_2 = "{...}";
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_19_1 = stackOut_17_1;
                        stackIn_19_2 = stackOut_17_2;
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 18: {
                        stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                        stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                        stackOut_18_2 = "null";
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        stackIn_19_2 = stackOut_18_2;
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 19: {
                        throw wm.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
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

    final static void a(int param0, int[] param1, eg param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
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
            L1: {
              d.a(param2, -23109);
              param1[0] = (int)Math.ceil((double)(param2.field_w + -param2.field_D) / ((double)nc.field_Y.length / 2.5));
              param1[1] = (int)Math.ceil((double)(param2.field_S + -param2.field_y) / ((double)nc.field_Y.length / 2.5));
              param1[2] = (int)Math.ceil((double)(param2.field_x + -param2.field_V) / ((double)nc.field_Y.length / 2.5));
              if (0 == param1[1]) {
                param1[1] = 1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1[2] == 0) {
                param1[2] = 1;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param1[0] == 0) {
                param1[0] = 1;
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
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("ie.E(").append(-2656).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
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
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a() {
        field_i = null;
        field_c = null;
        field_b = null;
        field_a = null;
        field_f = null;
        field_e = null;
        field_d = null;
    }

    final static void a(int param0, boolean param1, int param2) {
        rg.a(tk.field_i, kj.field_j, 180, param1, param2 + 21166, ad.field_x, 320);
        if (param2 != -17156) {
            field_b = null;
        }
    }

    final static void a(boolean param0, boolean param1) {
        vh stackIn_4_0 = null;
        vh stackIn_5_0 = null;
        vh stackIn_6_0 = null;
        vh stackIn_7_0 = null;
        vh stackIn_8_0 = null;
        vh stackIn_9_0 = null;
        vh stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        vh stackIn_11_0 = null;
        vh stackIn_12_0 = null;
        vh stackIn_13_0 = null;
        vh stackIn_14_0 = null;
        vh stackIn_15_0 = null;
        vh stackIn_16_0 = null;
        vh stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        vh stackIn_18_0 = null;
        vh stackIn_19_0 = null;
        vh stackIn_20_0 = null;
        vh stackIn_21_0 = null;
        vh stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        vh stackOut_3_0 = null;
        vh stackOut_4_0 = null;
        vh stackOut_5_0 = null;
        vh stackOut_6_0 = null;
        vh stackOut_7_0 = null;
        vh stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        vh stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        vh stackOut_10_0 = null;
        vh stackOut_11_0 = null;
        vh stackOut_12_0 = null;
        vh stackOut_13_0 = null;
        vh stackOut_14_0 = null;
        vh stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        vh stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        vh stackOut_17_0 = null;
        vh stackOut_18_0 = null;
        vh stackOut_19_0 = null;
        vh stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        vh stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        L0: {
          qi.a((byte) -100);
          if (mg.field_d >= 0) {
            pm.field_m.field_nb = nr.a(new String[1], -1, m.field_a);
            break L0;
          } else {
            pm.field_m.field_nb = null;
            break L0;
          }
        }
        L1: {
          L2: {
            stackOut_3_0 = ir.field_a;
            stackIn_9_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (!param1) {
              break L2;
            } else {
              stackOut_4_0 = (vh) (Object) stackIn_4_0;
              stackIn_9_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (param0) {
                break L2;
              } else {
                stackOut_5_0 = (vh) (Object) stackIn_5_0;
                stackIn_9_0 = stackOut_5_0;
                stackIn_6_0 = stackOut_5_0;
                if (tf.field_d) {
                  break L2;
                } else {
                  stackOut_6_0 = (vh) (Object) stackIn_6_0;
                  stackIn_9_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (em.field_L != null) {
                    break L2;
                  } else {
                    stackOut_7_0 = (vh) (Object) stackIn_7_0;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_8_0 = stackOut_7_0;
                    if (tp.field_e != null) {
                      break L2;
                    } else {
                      stackOut_8_0 = (vh) (Object) stackIn_8_0;
                      stackOut_8_1 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      break L1;
                    }
                  }
                }
              }
            }
          }
          stackOut_9_0 = (vh) (Object) stackIn_9_0;
          stackOut_9_1 = 0;
          stackIn_10_0 = stackOut_9_0;
          stackIn_10_1 = stackOut_9_1;
          break L1;
        }
        L3: {
          L4: {
            ((vh) (Object) stackIn_10_0).a(stackIn_10_1 != 0, false);
            stackOut_10_0 = oi.field_n;
            stackIn_16_0 = stackOut_10_0;
            stackIn_11_0 = stackOut_10_0;
            if (!param1) {
              break L4;
            } else {
              stackOut_11_0 = (vh) (Object) stackIn_11_0;
              stackIn_16_0 = stackOut_11_0;
              stackIn_12_0 = stackOut_11_0;
              if (param0) {
                break L4;
              } else {
                stackOut_12_0 = (vh) (Object) stackIn_12_0;
                stackIn_16_0 = stackOut_12_0;
                stackIn_13_0 = stackOut_12_0;
                if (tf.field_d) {
                  break L4;
                } else {
                  stackOut_13_0 = (vh) (Object) stackIn_13_0;
                  stackIn_16_0 = stackOut_13_0;
                  stackIn_14_0 = stackOut_13_0;
                  if (em.field_L != null) {
                    break L4;
                  } else {
                    stackOut_14_0 = (vh) (Object) stackIn_14_0;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_15_0 = stackOut_14_0;
                    if (null != tp.field_e) {
                      break L4;
                    } else {
                      stackOut_15_0 = (vh) (Object) stackIn_15_0;
                      stackOut_15_1 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_17_1 = stackOut_15_1;
                      break L3;
                    }
                  }
                }
              }
            }
          }
          stackOut_16_0 = (vh) (Object) stackIn_16_0;
          stackOut_16_1 = 0;
          stackIn_17_0 = stackOut_16_0;
          stackIn_17_1 = stackOut_16_1;
          break L3;
        }
        L5: {
          L6: {
            ((vh) (Object) stackIn_17_0).a(stackIn_17_1 != 0, false);
            stackOut_17_0 = ln.field_q;
            stackIn_21_0 = stackOut_17_0;
            stackIn_18_0 = stackOut_17_0;
            if (!param1) {
              break L6;
            } else {
              stackOut_18_0 = (vh) (Object) stackIn_18_0;
              stackIn_21_0 = stackOut_18_0;
              stackIn_19_0 = stackOut_18_0;
              if (param0) {
                break L6;
              } else {
                stackOut_19_0 = (vh) (Object) stackIn_19_0;
                stackIn_21_0 = stackOut_19_0;
                stackIn_20_0 = stackOut_19_0;
                if (!tf.field_d) {
                  break L6;
                } else {
                  stackOut_20_0 = (vh) (Object) stackIn_20_0;
                  stackOut_20_1 = 1;
                  stackIn_22_0 = stackOut_20_0;
                  stackIn_22_1 = stackOut_20_1;
                  break L5;
                }
              }
            }
          }
          stackOut_21_0 = (vh) (Object) stackIn_21_0;
          stackOut_21_1 = 0;
          stackIn_22_0 = stackOut_21_0;
          stackIn_22_1 = stackOut_21_1;
          break L5;
        }
        L7: {
          ((vh) (Object) stackIn_22_0).a(stackIn_22_1 != 0, false);
          kg.field_l.field_i.c(true);
          if (gj.field_K.field_R != 0) {
            jo.field_H = true;
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          if (rn.field_f.field_R == 0) {
            break L8;
          } else {
            L9: {
              if (rg.field_s) {
                break L9;
              } else {
                if (mp.field_V > 0) {
                  break L9;
                } else {
                  L10: {
                    if (hq.field_i < 2) {
                      break L10;
                    } else {
                      if (vj.field_c[12]) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  gn.field_f = true;
                  break L8;
                }
              }
            }
            int discarded$4 = 100;
            int discarded$5 = 11;
            rb.c();
            break L8;
          }
        }
        L11: {
          if (uc.field_b.field_R == 0) {
            break L11;
          } else {
            L12: {
              if (dg.field_T.length != 1) {
                break L12;
              } else {
                if (cr.field_l == dg.field_T[0]) {
                  break L12;
                } else {
                  cr.field_l = dg.field_T[0];
                  break L12;
                }
              }
            }
            int discarded$6 = 0;
            int discarded$7 = 0;
            je.a(11, cr.field_l, true, tq.field_u);
            break L11;
          }
        }
        L13: {
          if (sb.field_a.field_R == 0) {
            break L13;
          } else {
            tf.field_d = false;
            break L13;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "To <u=ffffff>look at</u> a different part of the table: <img=0> <col=99ff99>Click on</col> that <col=99ff99>part of the table</col>, as long as it's not the cue ball.";
        field_d = new int[8192];
        field_h = 0;
        field_c = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_b = "Accept";
    }
}
