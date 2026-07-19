/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti {
    static int field_e;
    static String field_a;
    static nc field_b;
    static String field_d;
    static ff field_c;
    static String[] field_g;
    static e field_f;

    final static int a(qc param0, int param1, sd param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var8 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == null) {
                break L1;
              } else {
                if (null == param2.field_i) {
                  break L1;
                } else {
                  if (param0 == null) {
                    break L1;
                  } else {
                    if (param0.field_m == param2.field_o) {
                      var4_int = param0.field_r.length;
                      var5 = param2.field_i[param1].length / var4_int;
                      var6 = param3;
                      L2: while (true) {
                        L3: {
                          if (var5 <= var6) {
                            stackOut_22_0 = -1;
                            stackIn_23_0 = stackOut_22_0;
                            break L3;
                          } else {
                            stackOut_10_0 = ((param0.field_n ^ -1L) < (param2.field_m[param1][var6] ^ -1L) ? -1 : ((param0.field_n ^ -1L) == (param2.field_m[param1][var6] ^ -1L) ? 0 : 1));
                            stackIn_23_0 = stackOut_10_0;
                            stackIn_11_0 = stackOut_10_0;
                            if (var8 != 0) {
                              break L3;
                            } else {
                              L4: {
                                if (stackIn_11_0 != 0) {
                                  break L4;
                                } else {
                                  if (!kj.a(param2.field_n[param1][var6], (byte) -109)) {
                                    break L4;
                                  } else {
                                    var7 = 0;
                                    L5: while (true) {
                                      L6: {
                                        if (var7 >= var4_int) {
                                          stackOut_19_0 = var6;
                                          stackIn_20_0 = stackOut_19_0;
                                          break L6;
                                        } else {
                                          stackOut_15_0 = param0.field_r[var7] ^ -1;
                                          stackIn_20_0 = stackOut_15_0;
                                          stackIn_16_0 = stackOut_15_0;
                                          if (var8 != 0) {
                                            break L6;
                                          } else {
                                            if (stackIn_16_0 != (param2.field_i[param1][var7 + var4_int * var6] ^ -1)) {
                                              break L4;
                                            } else {
                                              var7++;
                                              continue L5;
                                            }
                                          }
                                        }
                                      }
                                      decompiledRegionSelector0 = 2;
                                      break L0;
                                    }
                                  }
                                }
                              }
                              var6++;
                              continue L2;
                            }
                          }
                        }
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            stackOut_6_0 = -1;
            stackIn_7_0 = stackOut_6_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var4);
            stackOut_24_1 = new StringBuilder().append("ti.C(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          L8: {
            stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param1).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L8;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_23_0;
          } else {
            return stackIn_20_0;
          }
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_d = null;
        field_c = null;
        int var1 = -55 % ((param0 - 62) / 40);
        field_a = null;
        field_b = null;
        field_g = null;
    }

    final static long a(CharSequence param0, byte param1) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_6_0 = 0;
        int stackIn_20_0 = 0;
        long stackIn_22_0 = 0L;
        long stackIn_25_0 = 0L;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        long stackOut_21_0 = 0L;
        int stackOut_19_0 = 0;
        long stackOut_24_0 = 0L;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_long = 0L;
              if (param1 == 44) {
                break L1;
              } else {
                ti.a((byte) 25);
                break L1;
              }
            }
            var4 = param0.length();
            var5 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  L5: {
                    if (var4 <= var5) {
                      break L5;
                    } else {
                      var2_long = var2_long * 37L;
                      var6 = param0.charAt(var5);
                      stackOut_5_0 = var6;
                      stackIn_20_0 = stackOut_5_0;
                      stackIn_6_0 = stackOut_5_0;
                      if (var7 != 0) {
                        L6: while (true) {
                          if (stackIn_20_0 != 0) {
                            break L4;
                          } else {
                            stackOut_21_0 = 0L;
                            stackIn_25_0 = stackOut_21_0;
                            stackIn_22_0 = stackOut_21_0;
                            if (var7 != 0) {
                              break L3;
                            } else {
                              if (stackIn_22_0 == var2_long) {
                                break L4;
                              } else {
                                var2_long = var2_long / 37L;
                                if (var7 == 0) {
                                  stackOut_19_0 = (var2_long % 37L < 0L ? -1 : (var2_long % 37L == 0L ? 0 : 1));
                                  stackIn_20_0 = stackOut_19_0;
                                  continue L6;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        L7: {
                          L8: {
                            if (stackIn_6_0 < 65) {
                              break L8;
                            } else {
                              if (var6 > 90) {
                                break L8;
                              } else {
                                var2_long = var2_long + (long)(1 - (-var6 + 65));
                                if (var7 == 0) {
                                  break L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                          L9: {
                            if (var6 < 97) {
                              break L9;
                            } else {
                              if (var6 > 122) {
                                break L9;
                              } else {
                                var2_long = var2_long + (long)(-97 + (var6 + 1));
                                if (var7 == 0) {
                                  break L7;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                          if (var6 < 48) {
                            break L7;
                          } else {
                            if (57 >= var6) {
                              var2_long = var2_long + (long)(27 - (-var6 - -48));
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                        }
                        if ((var2_long ^ -1L) <= -177917621779460414L) {
                          break L5;
                        } else {
                          var5++;
                          continue L2;
                        }
                      }
                    }
                  }
                  L10: while (true) {
                    stackOut_19_0 = (var2_long % 37L < 0L ? -1 : (var2_long % 37L == 0L ? 0 : 1));
                    stackIn_20_0 = stackOut_19_0;
                    if (stackIn_20_0 != 0) {
                      break L4;
                    } else {
                      stackOut_21_0 = 0L;
                      stackIn_25_0 = stackOut_21_0;
                      stackIn_22_0 = stackOut_21_0;
                      if (var7 != 0) {
                        break L3;
                      } else {
                        if (stackIn_22_0 == var2_long) {
                          break L4;
                        } else {
                          var2_long = var2_long / 37L;
                          if (var7 == 0) {
                            continue L10;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_24_0 = var2_long;
                stackIn_25_0 = stackOut_24_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) (var2);
            stackOut_26_1 = new StringBuilder().append("ti.B(");
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L11;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L11;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param1 + ')');
        }
        return stackIn_25_0;
    }

    final static void a(byte param0) {
        il.field_c.field_l = 0;
        int var1 = -8 / ((param0 - -58) / 63);
        il.field_c.field_c = 0;
    }

    static {
        field_a = "CONGRATULATIONS!";
        field_d = "Highscores";
        field_b = new nc();
        field_c = new ff(4, 1, 1, 1);
        field_g = new String[]{"By rating", "By win percentage"};
    }
}
