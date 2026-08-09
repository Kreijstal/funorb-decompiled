/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class eh {
    private static long[] field_d;
    static h field_e;
    static ti[] field_c;
    static int field_a;
    static ii[] field_b;

    final static void a(ol param0, byte param1, String param2, kg param3, int param4) {
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = -1;
            var7 = 1;
            L1: while (true) {
              L2: {
                L3: {
                  if ((var7 ^ -1) <= (param2.length() ^ -1)) {
                    break L3;
                  } else {
                    var8 = param2.charAt(var7);
                    stackIn_17_0 = var8;

                    stackIn_17_1 = 60;

                    if (var9 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_17_0 == stackIn_17_1) {
                          var6 = (var5_int >> -1784659160) - -param0.field_g[0] - -param3.a(param2.substring(0, var7));
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        L6: {
                          if (-1 != var6) {
                            break L6;
                          } else {
                            L7: {
                              if (32 != var8) {
                                break L7;
                              } else {
                                var5_int = var5_int + param4;
                                break L7;
                              }
                            }
                            param0.field_g[var7] = param0.field_g[0] + ((var5_int >> 611738184) - (-param3.a(param2.substring(0, var7 + 1)) - -param3.a((char) var8)));
                            if (var9 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        param0.field_g[var7] = var6;
                        break L5;
                      }
                      L8: {
                        if (var8 == 62) {
                          var6 = -1;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      var7++;
                      if (var9 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackIn_17_0 = param1;
                stackIn_17_1 = 79;
                break L2;
              }
              L9: {
                if (stackIn_17_0 == stackIn_17_1) {
                  break L9;
                } else {
                  eh.b((byte) 42);
                  break L9;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var5);

            stackIn_22_1 = new StringBuilder().append("eh.B(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L10;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L11;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');

            if (param3 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L12;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L12;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_23_0), stackIn_29_2 + ',' + param4 + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        int var1 = 104 % ((-37 - param0) / 39);
        field_c = null;
        field_e = null;
    }

    final static void a(sj param0, int param1) {
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        j var3_ref_j = null;
        int var3 = 0;
        j var4 = null;
        int var5 = 0;
        int var6 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 >= 52) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_a = -6;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var2_int = param0.field_t;
                        if (param0.field_k == null) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param0.field_k == od.field_g) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (null != param0.field_k.field_e[param0.field_s]) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        param0.a(param0.field_s, 28, param0.field_k);
                        param0 = null;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param0 == null) {
                            statePc = 26;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (param0.field_h != 0) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var4 = wk.field_a;
                        var3_ref_j = si.field_i;
                        if (var6 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var3_ref_j = wk.field_a;
                        var4 = si.field_i;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var5 = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var3_ref_j.field_e.length <= var5) {
                            statePc = 18;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var6 != 0) {
                            statePc = 26;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (null == var3_ref_j.field_e[var5]) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        param0.a(var5, 28, var3_ref_j);
                        param0 = null;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var5++;
                        if (var6 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (param0 == null) {
                            statePc = 26;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var5 = 0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if ((var5 ^ -1) <= (var4.field_e.length ^ -1)) {
                            statePc = 26;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var4.field_e[var5] == null) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        param0.a(var5, 28, var4);
                        if (var6 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var5++;
                        if (var6 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var3 = 1 + var2_int;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (-13 >= (var3 ^ -1)) {
                            statePc = 39;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var6 != 0) {
                            statePc = 39;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (od.field_g.field_e[var3] != null) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (var6 == 0) {
                            statePc = 39;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        od.field_g.field_e[var3].a(-1 + var3, 28, od.field_g);
                        var3++;
                        if (var6 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 35: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_37_0 = (RuntimeException) (var2);
                    stackIn_36_0 = stackIn_37_0;
                    stackIn_37_1 = new StringBuilder().append("eh.D(");
                    stackIn_36_1 = stackIn_37_1;
                    if (param0 == null) {
                        statePc = 37;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    stackIn_38_0 = (RuntimeException) ((Object) stackIn_36_0);
                    stackIn_38_1 = (StringBuilder) ((Object) stackIn_36_1);
                    stackIn_38_2 = "{...}";
                    statePc = 38;
                    continue stateLoop;
                }
                case 37: {
                    stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
                    stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
                    stackIn_38_2 = "null";
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    throw ch.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ',' + param1 + ')');
                }
                case 39: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void b(byte param0) {
        try {
            IOException iOException = null;
            IOException var2_ref = null;
            int var1_int = 0;
            int var3 = 0;
            kg var4 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException var1 = null;
            var3 = Transmogrify.field_A ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (null != oh.field_h) {
                    oh.field_h.a(-2025316960);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (fd.field_d != null) {
                    fd.field_d.c(-20444);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (kk.field_b != null) {
                    try {
                      L4: {
                        kk.field_b.a((byte) -96);
                        break L4;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        iOException = (IOException) (Object) decompiledCaughtException;
                        break L5;
                      }
                    }
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L6: {
                  L7: {
                    L8: {
                      if (null == oa.field_m) {
                        break L8;
                      } else {
                        var1_int = 0;
                        L9: while (true) {
                          if ((var1_int ^ -1) <= (oa.field_m.length ^ -1)) {
                            break L8;
                          } else {
                            if (var3 != 0) {
                              break L7;
                            } else {
                              L10: {
                                if (oa.field_m[var1_int] != null) {
                                  try {
                                    L11: {
                                      oa.field_m[var1_int].a((byte) -61);
                                      break L11;
                                    }
                                  } catch (java.io.IOException decompiledCaughtParameter1) {
                                    decompiledCaughtException = decompiledCaughtParameter1;
                                    L12: {
                                      var2_ref = (IOException) (Object) decompiledCaughtException;
                                      break L12;
                                    }
                                  }
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              var1_int++;
                              if (var3 == 0) {
                                continue L9;
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                      }
                    }
                    if (param0 >= 97) {
                      break L7;
                    } else {
                      var4 = (kg) null;
                      eh.a((ol) null, (byte) 4, (String) null, (kg) null, -68);
                      break L6;
                    }
                  }
                  break L6;
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (RuntimeException) (Object) decompiledCaughtException;
              throw ch.a((Throwable) ((Object) var1), "eh.E(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static sa a(ii[] param0, int param1, byte[] param2, int param3, int param4) {
        byte[] array$0 = null;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        byte stackIn_13_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        sa stackIn_35_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        byte stackOut_12_1;
        int statePc = 0;
        Throwable caughtException = null;
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        byte[][] var10 = null;
        int var11_int = 0;
        sa var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        byte[] var22 = null;
        int var23 = 0;
        byte[] var24 = null;
        int var25 = 0;
        byte[] var26 = null;
        int var27 = 0;
        int var28 = 0;
        int[] var29 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var28 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (256 != param0.length) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        throw new IllegalArgumentException();
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var29 = new int[256];
                        var5 = var29;
                        var6 = new int[256];
                        var7 = new int[256];
                        var8 = new int[256];
                        var9 = new int[]{0, param3, param4};
                        var10 = new byte[256][];
                        var11_int = param1;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_6_0 = var11_int ^ -1;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (stackIn_6_0 <= -257) {
                            statePc = 34;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var29[var11_int] = param0[var11_int].field_c + -1;
                        var6[var11_int] = -1 + param0[var11_int].field_b;
                        var7[var11_int] = 2 + param0[var11_int].field_f;
                        var8[var11_int] = param0[var11_int].field_g - -2;
                        array$0 = new byte[var7[var11_int] * var8[var11_int]];
                        var10[var11_int] = array$0;
                        var12 = array$0;
                        var13 = param0[var11_int].field_i;
                        var14 = param0[var11_int].field_f;
                        var15 = param0[var11_int].field_g;
                        var16 = var7[var11_int];
                        var17 = var16 - var14;
                        var18 = 0;
                        var19 = 1 + var7[var11_int];
                        var20 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((var15 ^ -1) >= (var20 ^ -1)) {
                            statePc = 19;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_20_0 = 0;
                        stackIn_10_0 = stackIn_20_0;
                        if (var28 != 0) {
                            statePc = 20;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var21 = stackIn_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var14 <= var21) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        incrementValue$1 = var18;
                        var18++;
                        stackIn_18_0 = 0;
                        stackIn_13_0 = stackIn_18_0;
                        stackOut_12_1 = var13[incrementValue$1];
                        stackIn_18_1 = stackOut_12_1;
                        stackIn_13_1 = stackOut_12_1;
                        if (var28 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (stackIn_13_0 != stackIn_13_1) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var22 = var12;
                        var23 = -var16 + var19;
                        var24 = var12;
                        var25 = -1 + var19;
                        var26 = var12;
                        var27 = var19 - -1;
                        var12[var19 + var16] = (byte) 2;
                        var26[var27] = (byte) 2;
                        var24[var25] = (byte) 2;
                        var22[var23] = (byte) 2;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var19++;
                        var21++;
                        if (var28 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_18_0 = var19;
                        stackIn_18_1 = var17;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var19 = stackIn_18_0 + stackIn_18_1;
                        var20++;
                        if (var28 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var19 = var7[var11_int] + 1;
                        var18 = 0;
                        stackIn_20_0 = 0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var20 = stackIn_20_0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var20 >= var15) {
                            statePc = 33;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackIn_6_0 = 0;
                        stackIn_23_0 = stackIn_6_0;
                        if (var28 != 0) {
                            statePc = 6;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var21 = stackIn_23_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var14 <= var21) {
                            statePc = 31;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        incrementValue$2 = var18;
                        var18++;
                        stackIn_32_0 = var13[incrementValue$2] ^ -1;
                        stackIn_26_0 = stackIn_32_0;
                        stackIn_32_1 = -1;
                        stackIn_26_1 = stackIn_32_1;
                        if (var28 != 0) {
                            statePc = 32;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (stackIn_26_0 == stackIn_26_1) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        incrementValue$3 = var19;
                        var19++;
                        var12[incrementValue$3] = (byte) 1;
                        if (var28 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var19++;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var21++;
                        if (var28 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackIn_32_0 = var19;
                        stackIn_32_1 = var17;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var19 = stackIn_32_0 + stackIn_32_1;
                        var20++;
                        if (var28 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var11_int++;
                        if (var28 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var11 = new sa(param2, var29, var6, var7, var8, var9, var10);
                        var11.field_D = var11.field_D - 1;
                        var11.field_t = var11.field_t - 1;
                        var11.field_y = var11.field_y - 1;
                        stackIn_35_0 = (sa) (var11);
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 35: {
                    return stackIn_35_0;
                }
                case 36: {
                    var5_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_38_0 = (RuntimeException) (var5_ref);
                    stackIn_37_0 = stackIn_38_0;
                    stackIn_38_1 = new StringBuilder().append("eh.C(");
                    stackIn_37_1 = stackIn_38_1;
                    if (param0 == null) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    stackIn_39_0 = (RuntimeException) ((Object) stackIn_37_0);
                    stackIn_39_1 = (StringBuilder) ((Object) stackIn_37_1);
                    stackIn_39_2 = "{...}";
                    statePc = 39;
                    continue stateLoop;
                }
                case 38: {
                    stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
                    stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
                    stackIn_39_2 = "null";
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    stackIn_41_0 = (RuntimeException) ((Object) stackIn_39_0);
                    stackIn_40_0 = stackIn_41_0;
                    stackIn_41_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',').append(param1).append(',');
                    stackIn_40_1 = stackIn_41_1;
                    if (param2 == null) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    stackIn_42_0 = (RuntimeException) ((Object) stackIn_40_0);
                    stackIn_42_1 = (StringBuilder) ((Object) stackIn_40_1);
                    stackIn_42_2 = "{...}";
                    statePc = 42;
                    continue stateLoop;
                }
                case 41: {
                    stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
                    stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
                    stackIn_42_2 = "null";
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    throw ch.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ',' + param3 + ',' + param4 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        int var2 = 0;
        long var0 = 0L;
        int var3 = 0;
        field_d = new long[256];
        for (var2 = 0; var2 < 256; var2++) {
            var0 = (long)var2;
            for (var3 = 0; (var3 ^ -1) > -9; var3++) {
                if (-2L != (1L & var0 ^ -1L)) {
                    var0 = var0 >>> 1;
                } else {
                    var0 = -3932672073523589310L ^ var0 >>> -410537919;
                }
            }
            field_d[var2] = var0;
        }
        field_a = 0;
    }
}
