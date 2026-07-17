/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa extends jk {
    static pj field_J;
    static String field_E;
    static int field_G;
    static ai[] field_D;
    static int field_H;
    static String field_F;
    static boolean field_I;

    public static void a() {
        field_J = null;
        field_E = null;
        field_D = null;
        field_F = null;
    }

    private oa(int param0, int param1, int param2, int param3, ml param4, of param5, we param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            ((oa) this).field_v = param6;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "oa.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 44 + (param6 != null ? "{...}" : "null") + 41);
        }
    }

    final static boolean a(byte param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var2_ref2 = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_4_0 = 0;
            int stackIn_11_0 = 0;
            int stackIn_20_0 = 0;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            String stackIn_24_2 = null;
            int stackOut_3_0 = 0;
            int stackOut_10_0 = 0;
            int stackOut_18_0 = 0;
            int stackOut_19_0 = 0;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            RuntimeException stackOut_22_0 = null;
            StringBuilder stackOut_22_1 = null;
            String stackOut_22_2 = null;
            RuntimeException stackOut_23_0 = null;
            StringBuilder stackOut_23_1 = null;
            String stackOut_23_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (field_I) {
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
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            stackOut_3_0 = 1;
                            stackIn_4_0 = stackOut_3_0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        return stackIn_4_0 != 0;
                    }
                    case 5: {
                        try {
                            var2_ref2 = "tuhstatbut";
                            var3 = (String) mf.a(-26159, "getcookies", param1);
                            var4 = ma.a(126, ';', var3);
                            var5 = 0;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (var4.length <= var5) {
                                statePc = 15;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            if (var6 < 0) {
                                statePc = 12;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (var4[var5].substring(0, var6).trim().equals((Object) (Object) var2_ref2)) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            stackOut_10_0 = 1;
                            stackIn_11_0 = stackOut_10_0;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        return stackIn_11_0 != 0;
                    }
                    case 12: {
                        try {
                            var5++;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            var2 = caughtException;
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
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (null == param1.getParameter("tuhstatbut")) {
                                statePc = 19;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            stackOut_18_0 = 1;
                            stackIn_20_0 = stackOut_18_0;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            stackOut_19_0 = 0;
                            stackIn_20_0 = stackOut_19_0;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        return stackIn_20_0 != 0;
                    }
                    case 21: {
                        var2_ref = (RuntimeException) (Object) caughtException;
                        stackOut_21_0 = (RuntimeException) var2_ref;
                        stackOut_21_1 = new StringBuilder().append("oa.B(").append(-127).append(44);
                        stackIn_23_0 = stackOut_21_0;
                        stackIn_23_1 = stackOut_21_1;
                        stackIn_22_0 = stackOut_21_0;
                        stackIn_22_1 = stackOut_21_1;
                        if (param1 == null) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
                        stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
                        stackOut_22_2 = "{...}";
                        stackIn_24_0 = stackOut_22_0;
                        stackIn_24_1 = stackOut_22_1;
                        stackIn_24_2 = stackOut_22_2;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 23: {
                        stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
                        stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
                        stackOut_23_2 = "null";
                        stackIn_24_0 = stackOut_23_0;
                        stackIn_24_1 = stackOut_23_1;
                        stackIn_24_2 = stackOut_23_2;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 24: {
                        throw la.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 41);
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

    final void a(int param0, int param1, we param2, int param3, int param4, int param5) {
        ee var7 = null;
        RuntimeException var7_ref = null;
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
              super.a(param0, param1, param2, param3, param4 ^ param4, param5);
              var7 = od.field_n;
              if (var7 == null) {
                break L1;
              } else {
                if (!((oa) this).a(param1, param0, param5, param3, (byte) 45)) {
                  break L1;
                } else {
                  if (((oa) this).field_o instanceof tc) {
                    ((tc) (Object) ((oa) this).field_o).a((oa) this, (byte) -27, var7);
                    od.field_n = null;
                    break L1;
                  } else {
                    if (!(var7.field_o instanceof tc)) {
                      break L1;
                    } else {
                      ((tc) (Object) var7.field_o).a((oa) this, (byte) -27, var7);
                      od.field_n = null;
                      break L1;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var7_ref;
            stackOut_7_1 = new StringBuilder().append("oa.I(").append(param0).append(44).append(param1).append(44);
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
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final static void a(float param0, float[] param1, int param2) {
        try {
            param1[1] = param1[1] * param0;
            if (param2 <= 104) {
                field_F = null;
            }
            param1[0] = param1[0] * param0;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "oa.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final static void j() {
        RuntimeException var1 = null;
        int var1_int = 0;
        Object var2 = null;
        ki var2_ref = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        il var7 = null;
        int stackIn_21_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_65_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        var2 = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            var2_ref = (ki) (Object) ok.field_a.a((byte) -117);
            L1: while (true) {
              if (var2_ref == null) {
                var2_int = 0;
                L2: while (true) {
                  if (var2_int >= 3) {
                    var2_ref = (ki) (Object) ok.field_a.a((byte) -117);
                    L3: while (true) {
                      if (var2_ref == null) {
                        var2_ref = (ki) (Object) ok.field_a.a((byte) -117);
                        L4: while (true) {
                          if (var2_ref == null) {
                            vl.field_j = var1_int != 0;
                            break L0;
                          } else {
                            L5: {
                              var2_ref.f(-7);
                              if (var2_ref.field_q - (float)var2_ref.field_y > (float)(hf.field_f.field_k + -90)) {
                                L6: {
                                  if (vl.field_j) {
                                    hf.field_f.d(-115);
                                    vl.field_j = false;
                                    break L6;
                                  } else {
                                    break L6;
                                  }
                                }
                                var1_int = 1;
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            L7: {
                              L8: {
                                if (var2_ref.field_w == 1) {
                                  break L8;
                                } else {
                                  if (6 == var2_ref.field_w) {
                                    break L8;
                                  } else {
                                    if (var2_ref.field_w == 5) {
                                      break L8;
                                    } else {
                                      if (var2_ref.field_w != 0) {
                                        break L7;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                }
                              }
                              if (!pa.a(var2_ref.field_I, (int)(var2_ref.field_B + (float)var2_ref.field_G), (int)var2_ref.field_q + var2_ref.field_y, sb.field_m, 80, 0)) {
                                break L7;
                              } else {
                                L9: {
                                  if (!jj.a(-32680, var2_ref, -80 + (var2_ref.field_G + (int)var2_ref.field_B), var2_ref.field_y + (int)var2_ref.field_q)) {
                                    stackOut_65_0 = 0;
                                    stackIn_66_0 = stackOut_65_0;
                                    break L9;
                                  } else {
                                    stackOut_64_0 = 1;
                                    stackIn_66_0 = stackOut_64_0;
                                    break L9;
                                  }
                                }
                                var3 = stackIn_66_0;
                                var2_ref.field_x = var2_ref.field_x | var3 != 0;
                                var2_ref.c((byte) -114);
                                var2_ref = (ki) (Object) ok.field_a.d((byte) 63);
                                continue L4;
                              }
                            }
                            if (var2_ref.field_w != 3) {
                              var2_ref.c((byte) -114);
                              var2_ref = (ki) (Object) ok.field_a.d((byte) 63);
                              continue L4;
                            } else {
                              if (var2_ref.field_n != 1) {
                                var2_ref.c((byte) -114);
                                var2_ref = (ki) (Object) ok.field_a.d((byte) 63);
                                continue L4;
                              } else {
                                if (var2_ref.field_C <= 4) {
                                  var2_ref.c((byte) -114);
                                  var2_ref = (ki) (Object) ok.field_a.d((byte) 63);
                                  continue L4;
                                } else {
                                  var2_ref.field_t = ri.field_b;
                                  var2_ref.c((byte) -114);
                                  var2_ref = (ki) (Object) ok.field_a.d((byte) 63);
                                  continue L4;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        var2_ref.d((byte) 116);
                        var2_ref = (ki) (Object) ok.field_a.d((byte) 63);
                        continue L3;
                      }
                    }
                  } else {
                    var7 = (il) (Object) rf.field_a.a((byte) -117);
                    L10: while (true) {
                      if (var7 == null) {
                        var2_int++;
                        var2_int++;
                        continue L2;
                      } else {
                        var7.e(5);
                        var7 = (il) (Object) rf.field_a.d((byte) 63);
                        continue L10;
                      }
                    }
                  }
                }
              } else {
                L11: {
                  if (qb.field_b) {
                    if (2 != var2_ref.field_w) {
                      if (var2_ref.field_w == 3) {
                        h.a(4, true);
                        break L11;
                      } else {
                        if (var2_ref.field_w != 5) {
                          if (6 != var2_ref.field_w) {
                            break L11;
                          } else {
                            h.a(1, true);
                            break L11;
                          }
                        } else {
                          h.a(2, true);
                          break L11;
                        }
                      }
                    } else {
                      h.a(3, true);
                      break L11;
                    }
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (var2_ref.field_w == 6) {
                    if (!var2_ref.field_j) {
                      if (!var2_ref.field_x) {
                        stackOut_19_0 = 1;
                        stackIn_21_0 = stackOut_19_0;
                        break L12;
                      } else {
                        stackOut_18_0 = 0;
                        stackIn_21_0 = stackOut_18_0;
                        break L12;
                      }
                    } else {
                      stackOut_16_0 = 0;
                      stackIn_21_0 = stackOut_16_0;
                      break L12;
                    }
                  } else {
                    stackOut_14_0 = 0;
                    stackIn_21_0 = stackOut_14_0;
                    break L12;
                  }
                }
                L13: {
                  L14: {
                    var3 = stackIn_21_0;
                    var2_ref.g(122);
                    if (var3 == 0) {
                      break L14;
                    } else {
                      if (var2_ref.field_j) {
                        break L14;
                      } else {
                        if (-1 <= var2_ref.field_m) {
                          break L14;
                        } else {
                          var4 = 0;
                          var5 = 0;
                          L15: while (true) {
                            L16: {
                              if (var2_ref.field_m <= var5) {
                                break L16;
                              } else {
                                if (-5 == var2_ref.field_o[var5].field_w) {
                                  var5++;
                                  continue L15;
                                } else {
                                  var4 = 1;
                                  break L16;
                                }
                              }
                            }
                            if (var4 != 0) {
                              var2_ref.field_q = var2_ref.field_q + 2.0f;
                              break L13;
                            } else {
                              var2_ref.field_t = hd.field_u;
                              break L13;
                            }
                          }
                        }
                      }
                    }
                  }
                  if (!var2_ref.field_x) {
                    break L13;
                  } else {
                    if (var2_ref.field_w != 6) {
                      break L13;
                    } else {
                      if (var2_ref.field_m == 0) {
                        var2_ref.field_t = hd.field_u;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                }
                var2_ref = (ki) (Object) ok.field_a.d((byte) 63);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var1, "oa.D(" + -118 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = new pj();
        field_G = -1;
        field_E = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_F = "Please try again in a few minutes.";
    }
}
