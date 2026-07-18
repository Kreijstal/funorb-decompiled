/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la extends ca {
    static bd field_e;
    static String field_i;
    private String field_j;
    static int field_g;
    static bd field_h;
    private String field_f;

    final static void a(int param0, String param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        try {
          L0: {
            L1: {
              rj.field_K = false;
              if (param2 >= 41) {
                break L1;
              } else {
                field_h = null;
                break L1;
              }
            }
            L2: {
              eh.field_e = false;
              if (null == jj.field_d) {
                break L2;
              } else {
                if (jj.field_d.field_F) {
                  L3: {
                    var3_int = 1;
                    if (8 != param0) {
                      break L3;
                    } else {
                      L4: {
                        if (li.field_o) {
                          param1 = ti.field_i;
                          break L4;
                        } else {
                          param1 = de.field_m;
                          break L4;
                        }
                      }
                      param0 = 2;
                      ib.field_e.a(rf.field_e, 10000536);
                      break L3;
                    }
                  }
                  L5: {
                    if (10 == param0) {
                      var3_int = 0;
                      fe.a(true);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (var3_int == 0) {
                      break L6;
                    } else {
                      L7: {
                        if (rj.field_K) {
                          param1 = vg.a(new String[1], 21, ck.field_o);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      L8: {
                        if (md.field_i) {
                          param1 = jm.field_h;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      jj.field_d.a(param0, 17, param1);
                      break L6;
                    }
                  }
                  if (param0 == 256) {
                    break L2;
                  } else {
                    if (param0 == 10) {
                      break L2;
                    } else {
                      if (li.field_o) {
                        break L2;
                      } else {
                        ib.field_e.a(false);
                        return;
                      }
                    }
                  }
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var3;
            stackOut_26_1 = new StringBuilder().append("la.G(").append(param0).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L9;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L9;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param2 + ')');
        }
    }

    final static boolean a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            RuntimeException var2_ref2 = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_4_0 = 0;
            int stackIn_10_0 = 0;
            int stackIn_17_0 = 0;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            String stackIn_21_2 = null;
            int stackOut_3_0 = 0;
            int stackOut_9_0 = 0;
            int stackOut_15_0 = 0;
            int stackOut_16_0 = 0;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            String stackOut_20_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = HostileSpawn.field_I ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (al.field_T) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 18;
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
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        return stackIn_4_0 != 0;
                    }
                    case 5: {
                        try {
                            var2 = "tuhstatbut";
                            var3 = (String) a.a("getcookies", param0, -124);
                            var4 = cj.a(var3, -44, ';');
                            var5 = 0;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (var4.length <= var5) {
                                statePc = 14;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            if (var6 < 0) {
                                statePc = 11;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
                                statePc = 11;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            stackOut_9_0 = 1;
                            stackIn_10_0 = stackOut_9_0;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        return stackIn_10_0 != 0;
                    }
                    case 11: {
                        try {
                            var5++;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            var2_ref = caughtException;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (param0.getParameter("tuhstatbut") == null) {
                                statePc = 16;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            stackOut_15_0 = 1;
                            stackIn_17_0 = stackOut_15_0;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            stackOut_16_0 = 0;
                            stackIn_17_0 = stackOut_16_0;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        return stackIn_17_0 != 0;
                    }
                    case 18: {
                        var2_ref2 = (RuntimeException) (Object) caughtException;
                        stackOut_18_0 = (RuntimeException) var2_ref2;
                        stackOut_18_1 = new StringBuilder().append("la.I(");
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_20_1 = stackOut_18_1;
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        if (param0 == null) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                        stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                        stackOut_19_2 = "{...}";
                        stackIn_21_0 = stackOut_19_0;
                        stackIn_21_1 = stackOut_19_1;
                        stackIn_21_2 = stackOut_19_2;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 20: {
                        stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
                        stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
                        stackOut_20_2 = "null";
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        stackIn_21_2 = stackOut_20_2;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        throw wg.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + 10295 + ')');
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

    final static void b(int param0) {
        if (uj.field_m != null) {
            uj.field_m.h();
            if (eb.field_e == null) {
                return;
            }
            eb.field_e.h();
            return;
        }
        if (eb.field_e != null) {
            eb.field_e.h();
            return;
        }
    }

    final void a(vi param0, int param1) {
        try {
            param0.a(120, ((la) this).field_j);
            if (param1 >= -94) {
                field_g = -36;
            }
            param0.a((byte) -119, ((la) this).field_f);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "la.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1) {
        kb.field_b = de.field_k[param1];
        u.field_j = gg.field_C[param1];
        ad.field_b = gm.field_k[param1];
    }

    final static void a(int param0, int param1, pg param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
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
        int var20 = 0;
        int var21 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var21 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = (param0 - param4 << 8) / param2.field_i;
              var7 = (param4 << 8) - -(var6_int * param2.field_c);
              param5 = param5 + param2.field_b;
              param3 = param3 + param2.field_c;
              var8 = si.field_e * param5 + param3;
              var9 = 0;
              var10 = param2.field_f;
              var11 = param2.field_a;
              var12 = -var11 + si.field_e;
              if (param5 < si.field_j) {
                var14 = si.field_j - param5;
                var10 = var10 - var14;
                var9 = var9 + var14 * var11;
                param5 = si.field_j;
                var8 = var8 + var14 * si.field_e;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var13 = 0;
              if (si.field_a < var10 + param5) {
                var10 = var10 - (-si.field_a + (param5 - -var10));
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param3 < si.field_b) {
                var14 = si.field_b - param3;
                param3 = si.field_b;
                var11 = var11 - var14;
                var12 = var12 + var14;
                var7 = var7 + var14 * var6_int;
                var13 = var13 + var14;
                var9 = var9 + var14;
                var8 = var8 + var14;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (si.field_l < var11 + param3) {
                var14 = -si.field_l + (param3 - -var11);
                var12 = var12 + var14;
                var11 = var11 - var14;
                var13 = var13 + var14;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (0 >= var11) {
                break L5;
              } else {
                if (var10 <= 0) {
                  break L5;
                } else {
                  var14 = 75 / ((45 - param1) / 60);
                  param5 = -var10;
                  L6: while (true) {
                    if (0 <= param5) {
                      break L0;
                    } else {
                      var15 = var7;
                      param3 = -var11;
                      L7: while (true) {
                        if (0 <= param3) {
                          var8 = var8 + var12;
                          var9 = var9 + var13;
                          param5++;
                          continue L6;
                        } else {
                          L8: {
                            var16 = var15 >> 8;
                            var15 = var15 + var6_int;
                            var17 = 256 + -var16;
                            if (var16 < 0) {
                              var9++;
                              var8++;
                              param3++;
                              break L8;
                            } else {
                              L9: {
                                int incrementValue$1 = var9;
                                var9++;
                                var18 = param2.field_k[255 & param2.field_j[incrementValue$1]];
                                if (var18 == 0) {
                                  break L9;
                                } else {
                                  if (var16 > 255) {
                                    si.field_i[var8] = var18;
                                    break L9;
                                  } else {
                                    var19 = si.field_i[var8];
                                    var20 = var16 * (var18 & 16711935) + var17 * (var19 & 16711935) >> 8 & 16711935;
                                    si.field_i[var8] = var20 - -(ua.a(16711749, var16 * ua.a(65280, var18) + ua.a(var19, 65280) * var17) >> 8);
                                    break L9;
                                  }
                                }
                              }
                              var8++;
                              param3++;
                              break L8;
                            }
                          }
                          param3++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var6;
            stackOut_35_1 = new StringBuilder().append("la.B(").append(param0).append(',').append(param1).append(',');
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param2 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L10;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L10;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final bl a(boolean param0) {
        if (param0) {
            field_i = null;
            return uk.field_a;
        }
        return uk.field_a;
    }

    final static int a(int param0, boolean param1) {
        return ge.field_d[2047 & param0];
    }

    final static s b(boolean param0) {
        return new s(jm.a((byte) 93), hm.c(8));
    }

    public static void a(byte param0) {
        field_e = null;
        field_h = null;
        field_i = null;
    }

    la(String param0, String param1) {
        try {
            ((la) this).field_f = param1;
            ((la) this).field_j = param0;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "la.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "If you have an account, log in to start at any level you've reached.";
    }
}
