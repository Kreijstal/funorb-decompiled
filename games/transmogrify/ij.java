/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij implements ui {
    private int field_e;
    private int field_b;
    private int field_c;
    private int field_g;
    static wk field_d;
    static int field_a;
    private int field_j;
    static ti field_h;
    private kg field_i;
    private int field_f;

    public final void a(int param0, int param1, boolean param2, byte param3, qg param4) {
        qg stackIn_4_0 = null;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        fk var13 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!(param4 instanceof fk)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_4_0 = (qg) (param4);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_4_0 = null;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var13 = (fk) ((Object) stackIn_4_0);
                        sb.a(param4.field_p + param0, param1 - -param4.field_n, param4.field_l, param4.field_h, this.field_c);
                        if (var13 != null) {
                            statePc = 5;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var7 = param4.field_l + -(2 * var13.field_B);
                        var8 = var13.field_B + param4.field_p + param0;
                        var9 = var13.field_G + (param4.field_n + param1);
                        sb.e(var8, var9, var7 + var8, var9, this.field_j);
                        var10 = -1 + var13.h(-1);
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
                        if (0 > var10) {
                            statePc = 10;
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
                        stackIn_11_0 = var7 * var13.b((byte) 117, var10) / var13.i(-24733) + var8;
                        stackIn_8_0 = stackIn_11_0;
                        stackIn_11_1 = var9;
                        stackIn_8_1 = stackIn_11_1;
                        stackIn_11_2 = this.field_e;
                        stackIn_8_2 = stackIn_11_2;
                        if (var12 != 0) {
                            statePc = 11;
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
                        sb.c(stackIn_8_0, stackIn_8_1, stackIn_8_2, this.field_f);
                        var10--;
                        if (var12 == 0) {
                            statePc = 6;
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
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_11_0 = -49;
                        stackIn_11_1 = 51 - param3;
                        stackIn_11_2 = 47;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var11 = stackIn_11_0 % (stackIn_11_1 / stackIn_11_2);
                        if (this.field_i == null) {
                            statePc = 18;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        this.field_i.c(var13.field_k, var8 + var7 / 2, var9 - (-this.field_i.field_C - var13.field_G), this.field_g, this.field_b);
                        return;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    var6 = (RuntimeException) ((Object) caughtException);
                    stackIn_16_0 = (RuntimeException) (var6);
                    stackIn_15_0 = stackIn_16_0;
                    stackIn_16_1 = new StringBuilder().append("ij.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
                    stackIn_15_1 = stackIn_16_1;
                    if (param4 == null) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    stackIn_17_0 = (RuntimeException) ((Object) stackIn_15_0);
                    stackIn_17_1 = (StringBuilder) ((Object) stackIn_15_1);
                    stackIn_17_2 = "{...}";
                    statePc = 17;
                    continue stateLoop;
                }
                case 16: {
                    stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                    stackIn_17_2 = "null";
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    throw ch.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
                }
                case 18: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static String a(String param0, String[] param1, byte param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_10_0 = false;
        String stackIn_23_0 = null;
        int stackIn_26_0 = 0;
        boolean stackIn_33_0 = false;
        String stackIn_44_0 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        StringBuilder stackIn_50_1 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_9_0;
        boolean stackOut_32_0;
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
        var11 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var3_int = param0.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6_int = param0.indexOf("<%", var5);
              stackIn_3_0 = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    L5: {
                      if (stackIn_3_0 <= var6_int) {
                        break L5;
                      } else {
                        if (var11 != 0) {
                          break L4;
                        } else {
                          if (var11 == 0) {
                            break L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    var5 = 2 + var6_int;
                    break L4;
                  }
                  L6: while (true) {
                    L7: {
                      if (var3_int <= var5) {
                        break L7;
                      } else {
                        stackOut_9_0 = dj.a(param0.charAt(var5), true);
                        stackIn_3_0 = stackOut_9_0 ? 1 : 0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var11 != 0) {
                          continue L2;
                        } else {
                          if (!stackIn_10_0) {
                            break L7;
                          } else {
                            var5++;
                            if (var11 == 0) {
                              continue L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                    }
                    L8: {
                      var7_ref_String = param0.substring(var6_int - -2, var5);
                      if (qj.a((CharSequence) ((Object) var7_ref_String), 38)) {
                        break L8;
                      } else {
                        if (var11 == 0) {
                          continue L1;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (var3_int <= var5) {
                        break L9;
                      } else {
                        if (param0.charAt(var5) == 62) {
                          var5++;
                          var8 = aa.a(55, (CharSequence) ((Object) var7_ref_String));
                          var4 = var4 + (-var5 - -var6_int + param1[var8].length());
                          break L9;
                        } else {
                          break L9;
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
                if (param2 < -25) {
                  var6 = new StringBuilder(var4);
                  var5 = 0;
                  var7 = 0;
                  L10: while (true) {
                    var8 = param0.indexOf("<%", var5);
                    stackIn_26_0 = -1;
                    L11: while (true) {
                      L12: {
                        L13: {
                          L14: {
                            if (stackIn_26_0 >= (var8 ^ -1)) {
                              break L14;
                            } else {
                              if (var11 != 0) {
                                break L13;
                              } else {
                                if (var11 == 0) {
                                  break L12;
                                } else {
                                  break L14;
                                }
                              }
                            }
                          }
                          var5 = 2 + var8;
                          break L13;
                        }
                        L15: while (true) {
                          L16: {
                            if (var5 >= var3_int) {
                              break L16;
                            } else {
                              stackOut_32_0 = dj.a(param0.charAt(var5), true);
                              stackIn_26_0 = stackOut_32_0 ? 1 : 0;
                              stackIn_33_0 = stackOut_32_0;
                              if (var11 != 0) {
                                continue L11;
                              } else {
                                if (!stackIn_33_0) {
                                  break L16;
                                } else {
                                  var5++;
                                  if (var11 == 0) {
                                    continue L15;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                            }
                          }
                          L17: {
                            var9 = param0.substring(2 + var8, var5);
                            if (qj.a((CharSequence) ((Object) var9), 49)) {
                              break L17;
                            } else {
                              if (var11 == 0) {
                                continue L10;
                              } else {
                                break L17;
                              }
                            }
                          }
                          L18: {
                            if (var5 >= var3_int) {
                              break L18;
                            } else {
                              if (param0.charAt(var5) != 62) {
                                break L18;
                              } else {
                                var5++;
                                var10 = aa.a(66, (CharSequence) ((Object) var9));
                                discarded$0 = var6.append(param0.substring(var7, var8));
                                discarded$1 = var6.append(param1[var10]);
                                var7 = var5;
                                break L18;
                              }
                            }
                          }
                          if (var11 == 0) {
                            continue L10;
                          } else {
                            break L12;
                          }
                        }
                      }
                      discarded$2 = var6.append(param0.substring(var7));
                      stackIn_44_0 = var6.toString();
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                } else {
                  stackIn_23_0 = (String) null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var3 = decompiledCaughtException;
            stackIn_47_0 = (RuntimeException) (var3);

            stackIn_47_1 = new StringBuilder().append("ij.A(");

            if (param0 == null) {
              stackIn_48_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackIn_48_2 = "null";
              break L19;
            } else {
              stackIn_48_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackIn_48_2 = "{...}";
              break L19;
            }
          }
          L20: {


            stackIn_50_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(',');

            if (param1 == null) {
              stackIn_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "null";
              break L20;
            } else {
              stackIn_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "{...}";
              break L20;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_48_0), stackIn_51_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_23_0;
        } else {
          return stackIn_44_0;
        }
    }

    ij(kg param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            this.field_c = param4;
            this.field_i = param0;
            this.field_b = param2;
            this.field_f = param6;
            this.field_e = param5;
            this.field_g = param1;
            this.field_j = param3;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "ij.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public static void a(int param0) {
        field_h = null;
        if (param0 != 2) {
            return;
        }
        field_d = null;
    }

    static {
        field_d = new wk();
    }
}
