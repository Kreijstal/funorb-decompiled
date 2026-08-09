/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bk {
    static nj field_a;

    final static int a(int param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = SolKnight.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = param1.length();
                        var3 = 0;
                        var4 = param0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var2_int <= var4) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_6_0 = el.a((byte) 91, param1.charAt(var4)) + (-var3 + (var3 << -1266079899));
                        stackIn_4_0 = stackIn_6_0;
                        if (var5 != 0) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var3 = stackIn_4_0;
                        var4++;
                        if (var5 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_6_0 = var3;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0;
                }
                case 7: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_9_0 = (RuntimeException) (var2);
                    stackIn_8_0 = stackIn_9_0;
                    stackIn_9_1 = new StringBuilder().append("bk.A(").append(param0).append(',');
                    stackIn_8_1 = stackIn_9_1;
                    if (param1 == null) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    stackIn_10_0 = (RuntimeException) ((Object) stackIn_8_0);
                    stackIn_10_1 = (StringBuilder) ((Object) stackIn_8_1);
                    stackIn_10_2 = "{...}";
                    statePc = 10;
                    continue stateLoop;
                }
                case 9: {
                    stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
                    stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                    stackIn_10_2 = "null";
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    throw fc.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int a(int param0, Random param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var3_int = -6 % ((param2 - -2) / 44);
            if (param0 <= 0) {
              throw new IllegalArgumentException();
            } else {
              if (!ri.a(-6873, param0)) {
                var4 = -(int)(4294967296L % (long)param0) + -2147483648;
                L1: while (true) {
                  var5 = param1.nextInt();
                  L2: while (true) {
                    if (var5 >= var4) {
                      continue L1;
                    } else {
                      if (var6 != 0) {
                        continue L2;
                      } else {
                        stackIn_12_0 = te.b(25403, param0, var5);
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                }
              } else {
                stackIn_6_0 = (int)(((long)param1.nextInt() & 4294967295L) * (long)param0 >> -1882241056);
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("bk.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_12_0;
        }
    }

    public static void a(byte param0) {
        int var1 = 82 % ((2 - param0) / 55);
        field_a = null;
    }

    final static int a(byte param0, String param1, mg param2, int param3, String[] param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_5_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var13 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param2.b(param1);
              if (var5_int > param3) {
                break L1;
              } else {
                if (-1 == param1.indexOf("<br>")) {
                  param4[0] = param1;
                  stackIn_5_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var6 = (-1 + (var5_int - -param3)) / param3;
            param3 = var5_int / var6;
            var6 = 0;
            var7 = 0;
            var8 = param1.length();
            var9 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  L5: {
                    if (var8 <= var9) {
                      break L5;
                    } else {
                      var10 = param1.charAt(var9);
                      var15 = var10 ^ -1;
                      var14 = -33;
                      if (var13 != 0) {
                        if (var14 == var15) {
                          break L3;
                        } else {
                          break L4;
                        }
                      } else {
                        L6: {
                          L7: {
                            if (var14 == var15) {
                              break L7;
                            } else {
                              if (45 != var10) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var11 = param1.substring(var7, 1 + var9).trim();
                          var12 = param2.b(var11);
                          if (var12 < param3) {
                            break L6;
                          } else {
                            incrementValue$0 = var6;
                            var6++;
                            param4[incrementValue$0] = var11;
                            var7 = 1 + var9;
                            break L6;
                          }
                        }
                        L8: {
                          if (62 != var10) {
                            break L8;
                          } else {
                            if (param1.regionMatches(var9 - 3, "<br>", 0, 4)) {
                              incrementValue$1 = var6;
                              var6++;
                              param4[incrementValue$1] = param1.substring(var7, var9 - 3).trim();
                              var7 = var9 + 1;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var9++;
                        if (var13 == 0) {
                          continue L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  if (param0 == 3) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
                bk.a((byte) -51);
                break L3;
              }
              L9: {
                if (var7 >= var8) {
                  break L9;
                } else {
                  incrementValue$2 = var6;
                  var6++;
                  param4[incrementValue$2] = param1.substring(var7, var8).trim();
                  break L9;
                }
              }
              stackIn_27_0 = var6;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var5);

            stackIn_30_1 = new StringBuilder().append("bk.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L10;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param2 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L11;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_36_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L12;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L12;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_31_0), stackIn_37_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_27_0;
        }
    }

    final static String a(int param0) {
        if (param0 != 0) {
            field_a = (nj) null;
            return te.field_N.h(param0 + 109);
        }
        return te.field_N.h(param0 + 109);
    }

    static {
    }
}
