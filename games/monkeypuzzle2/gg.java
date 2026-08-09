/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg {
    static String field_b;
    private le[] field_a;

    final static String a(String[] args, String param1, boolean param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_18_0 = 0;
        boolean stackIn_22_0 = false;
        String stackIn_37_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        StringBuilder stackIn_43_1 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0;
        boolean stackOut_21_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        String var7_ref_String = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        byte[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        var11 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = param1.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6_int = param1.indexOf("<%", var5);
              stackIn_3_0 = var6_int ^ -1;
              L2: while (true) {
                L3: {
                  if (stackIn_3_0 > -1) {
                    break L3;
                  } else {
                    var5 = 2 + var6_int;
                    L4: while (true) {
                      L5: {
                        if (var5 >= var3_int) {
                          break L5;
                        } else {
                          stackOut_6_0 = re.a(-49, param1.charAt(var5));
                          stackIn_3_0 = stackOut_6_0 ? 1 : 0;
                          stackIn_7_0 = stackOut_6_0;
                          if (var11 != 0) {
                            continue L2;
                          } else {
                            if (!stackIn_7_0) {
                              break L5;
                            } else {
                              var5++;
                              if (var11 == 0) {
                                continue L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                      var7_ref_String = param1.substring(var6_int - -2, var5);
                      if (!ra.a((CharSequence) ((Object) var7_ref_String), (byte) 84)) {
                        continue L1;
                      } else {
                        L6: {
                          if (var3_int <= var5) {
                            break L6;
                          } else {
                            if (62 == param1.charAt(var5)) {
                              var5++;
                              var8 = vi.a(61, (CharSequence) ((Object) var7_ref_String));
                              var4 = var4 + (args[var8].length() - -var6_int - var5);
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                        }
                        if (var11 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                var6 = new StringBuilder(var4);
                var7 = 0;
                var5 = 0;
                L7: while (true) {
                  var8 = param1.indexOf("<%", var5);
                  stackIn_18_0 = 0;
                  L8: while (true) {
                    L9: {
                      L10: {
                        L11: {
                          if (stackIn_18_0 > var8) {
                            break L11;
                          } else {
                            var5 = 2 + var8;
                            L12: while (true) {
                              L13: {
                                if (var3_int <= var5) {
                                  break L13;
                                } else {
                                  stackOut_21_0 = re.a(-49, param1.charAt(var5));
                                  stackIn_18_0 = stackOut_21_0 ? 1 : 0;
                                  stackIn_22_0 = stackOut_21_0;
                                  if (var11 != 0) {
                                    continue L8;
                                  } else {
                                    if (!stackIn_22_0) {
                                      break L13;
                                    } else {
                                      var5++;
                                      if (var11 == 0) {
                                        continue L12;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                }
                              }
                              var9 = param1.substring(var8 - -2, var5);
                              if (!ra.a((CharSequence) ((Object) var9), (byte) -128)) {
                                continue L7;
                              } else {
                                var14 = var3_int ^ -1;
                                var13 = var5 ^ -1;
                                if (var11 != 0) {
                                  if (var13 == var14) {
                                    break L9;
                                  } else {
                                    break L10;
                                  }
                                } else {
                                  L14: {
                                    if (var13 <= var14) {
                                      break L14;
                                    } else {
                                      if (param1.charAt(var5) != 62) {
                                        break L14;
                                      } else {
                                        var5++;
                                        var10 = vi.a(43, (CharSequence) ((Object) var9));
                                        discarded$0 = var6.append(param1.substring(var7, var8));
                                        discarded$1 = var6.append(args[var10]);
                                        var7 = var5;
                                        break L14;
                                      }
                                    }
                                  }
                                  if (var11 == 0) {
                                    continue L7;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                            }
                          }
                        }
                        discarded$2 = var6.append(param1.substring(var7));
                        if (param2) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                      var12 = (byte[]) null;
                      gg.a((int[]) null, 25, (byte[]) null, 86, -42);
                      break L9;
                    }
                    stackIn_37_0 = var6.toString();
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var3 = decompiledCaughtException;
            stackIn_40_0 = (RuntimeException) (var3);

            stackIn_40_1 = new StringBuilder().append("gg.F(");

            if (args == null) {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L15;
            } else {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L15;
            }
          }
          L16: {


            stackIn_43_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_41_2).append(',');

            if (param1 == null) {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "null";
              break L16;
            } else {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "{...}";
              break L16;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_41_0), stackIn_44_2 + ',' + param2 + ')');
        }
        return stackIn_37_0;
    }

    final static void a(int[] param0, int param1, byte[] param2, int param3, int param4) {
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        byte dupTemp$6 = 0;
        int dupTemp$7 = 0;
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
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
                        if (param4 > 71) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var8 = (String) null;
                        gg.a((String[]) null, (String) null, false);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var5_int = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var5_int >= hb.field_l.length) {
                            statePc = 22;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        param3 = hb.field_l[var5_int];
                        if (var7 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        return;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var6 = var5_int << 1288141156;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        incrementValue$4 = param3;
                        param3--;
                        if (-1 == (incrementValue$4 ^ -1)) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        incrementValue$5 = var6;
                        var6++;
                        param1 = dj.field_c[incrementValue$5];
                        dupTemp$6 = param2[param1];
                        dupTemp$7 = param0[dupTemp$6];
                        param0[dupTemp$6] = dupTemp$7 + 1;
                        dj.field_c[dupTemp$7] = param1;
                        if (var7 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var7 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var5_int++;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var7 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_17_0 = (RuntimeException) (runtimeException);
                    stackIn_16_0 = stackIn_17_0;
                    stackIn_17_1 = new StringBuilder().append("gg.B(");
                    stackIn_16_1 = stackIn_17_1;
                    if (param0 == null) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_16_1);
                    stackIn_18_2 = "{...}";
                    statePc = 18;
                    continue stateLoop;
                }
                case 17: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_18_2 = "null";
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_20_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_19_0 = stackIn_20_0;
                    stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');
                    stackIn_19_1 = stackIn_20_1;
                    if (param2 == null) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_19_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_19_1);
                    stackIn_21_2 = "{...}";
                    statePc = 21;
                    continue stateLoop;
                }
                case 20: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                    stackIn_21_2 = "null";
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    throw la.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param3 + ',' + param4 + ')');
                }
                case 22: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        if (param0 < 5) {
            field_b = (String) null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4) {
        lb.a(param1, param0, (byte) -123, this.field_a, param3, param4);
        if (param2) {
            this.field_a = (le[]) null;
        }
    }

    final static int c(int param0) {
        if (param0 != 0) {
            field_b = (String) null;
            return (int)(1000000000L / ed.field_d);
        }
        return (int)(1000000000L / ed.field_d);
    }

    final static dk b(int param0) {
        if (param0 == -11451) {
          if (null == ok.field_f) {
            ok.field_f = new dk();
            ok.field_f.a(t.field_z, false);
            ok.field_f.field_m = pf.field_c;
            ok.field_f.field_p = 6;
            ok.field_f.field_f = 4;
            ok.field_f.field_b = 14;
            ok.field_f.field_r = 7697781;
            ok.field_f.field_k = 0;
            ok.field_f.field_n = 5;
            ok.field_f.field_s = 2763306;
            return ok.field_f;
          } else {
            return ok.field_f;
          }
        } else {
          return (dk) null;
        }
    }

    gg(le[] param0) {
        try {
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "gg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Log in / Create account";
    }
}
