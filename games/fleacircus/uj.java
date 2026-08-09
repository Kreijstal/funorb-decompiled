/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj {
    private static int[] field_b;
    int field_c;
    static String field_f;
    static String field_e;
    static int[] field_a;
    static String field_d;

    final static boolean a(int param0) {
        if (param0 != -2477) {
            field_d = (String) null;
        }
        return ed.field_b;
    }

    final static int a(boolean param0, int param1, int param2, byte[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        CharSequence var7 = null;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4_int = -1;
                        var5 = param1;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param2 <= var5) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var4_int = field_b[255 & (var4_int ^ param3[var5])] ^ var4_int >>> -429782424;
                        var5++;
                        if (var6 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var6 == 0) {
                            statePc = 2;
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
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (!param0) {
                            statePc = 8;
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
                        var7 = (CharSequence) null;
                        uj.a((CharSequence) null, (byte) -55);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var4_int = var4_int ^ -1;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_10_0 = var4_int;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return stackIn_10_0;
                }
                case 11: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_13_0 = (RuntimeException) (var4);
                    stackIn_12_0 = stackIn_13_0;
                    stackIn_13_1 = new StringBuilder().append("uj.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_12_1 = stackIn_13_1;
                    if (param3 == null) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackIn_14_0 = (RuntimeException) ((Object) stackIn_12_0);
                    stackIn_14_1 = (StringBuilder) ((Object) stackIn_12_1);
                    stackIn_14_2 = "{...}";
                    statePc = 14;
                    continue stateLoop;
                }
                case 13: {
                    stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
                    stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                    stackIn_14_2 = "null";
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    throw pf.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static String a(char param0, String param1, int param2, String param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4_int = param1.length();
                        var5 = param3.length();
                        var6 = var4_int;
                        var7 = var5 - param2;
                        if (var7 != 0) {
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
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var8_int = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var8_int = param1.indexOf((int) param0, var8_int);
                        if (-1 >= (var8_int ^ -1)) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var11 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var11 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var6 = var6 + var7;
                        var8_int++;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var11 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var8 = new StringBuilder(var6);
                        var9 = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var10 = param1.indexOf((int) param0, var9);
                        if (-1 < (var10 ^ -1)) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        discarded$3 = var8.append(param1.substring(var9, var10));
                        var9 = 1 + var10;
                        discarded$4 = var8.append(param3);
                        if (var11 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var11 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        discarded$5 = var8.append(param1.substring(var9));
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackIn_17_0 = var8.toString();
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    return stackIn_17_0;
                }
                case 18: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_20_0 = (RuntimeException) (var4);
                    stackIn_19_0 = stackIn_20_0;
                    stackIn_20_1 = new StringBuilder().append("uj.C(").append(param0).append(',');
                    stackIn_19_1 = stackIn_20_1;
                    if (param1 == null) {
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
                    stackIn_23_0 = (RuntimeException) ((Object) stackIn_21_0);
                    stackIn_22_0 = stackIn_23_0;
                    stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param2).append(',');
                    stackIn_22_1 = stackIn_23_1;
                    if (param3 == null) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    stackIn_24_0 = (RuntimeException) ((Object) stackIn_22_0);
                    stackIn_24_1 = (StringBuilder) ((Object) stackIn_22_1);
                    stackIn_24_2 = "{...}";
                    statePc = 24;
                    continue stateLoop;
                }
                case 23: {
                    stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
                    stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
                    stackIn_24_2 = "null";
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    throw pf.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static long a(CharSequence param0, byte param1) {
        int stackIn_23_0 = 0;
        long stackIn_28_0 = 0L;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        CharSequence var8 = null;
        var7 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 < -94) {
                break L1;
              } else {
                var8 = (CharSequence) null;
                uj.a((CharSequence) null, (byte) -74);
                break L1;
              }
            }
            var2_long = 0L;
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
                      stackIn_23_0 = var6;

                      if (var7 != 0) {
                        L6: while (true) {
                          if (stackIn_23_0 != 0) {
                            break L4;
                          } else {
                            stackIn_28_0 = 0L;

                            if (var7 != 0) {
                              break L3;
                            } else {
                              if (stackIn_28_0 == var2_long) {
                                break L4;
                              } else {
                                var2_long = var2_long / 37L;
                                if (var7 == 0) {
                                  stackIn_23_0 = (-1L < (var2_long % 37L ^ -1L) ? -1 : (-1L == (var2_long % 37L ^ -1L) ? 0 : 1));
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
                            L9: {
                              if (stackIn_23_0 < 65) {
                                break L9;
                              } else {
                                if (var6 <= 90) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            L10: {
                              if (var6 < 97) {
                                break L10;
                              } else {
                                if (122 < var6) {
                                  break L10;
                                } else {
                                  var2_long = var2_long + (long)(-97 + var6 + 1);
                                  if (var7 == 0) {
                                    break L7;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                            }
                            if (48 > var6) {
                              break L7;
                            } else {
                              if (var6 > 57) {
                                break L7;
                              } else {
                                var2_long = var2_long + (long)(var6 + -21);
                                if (var7 == 0) {
                                  break L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                          var2_long = var2_long + (long)(var6 + -64);
                          break L7;
                        }
                        L11: {
                          if (177917621779460413L > var2_long) {
                            break L11;
                          } else {
                            if (var7 == 0) {
                              break L5;
                            } else {
                              break L11;
                            }
                          }
                        }
                        var5++;
                        if (var7 == 0) {
                          continue L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  L12: while (true) {
                    stackIn_23_0 = (-1L < (var2_long % 37L ^ -1L) ? -1 : (-1L == (var2_long % 37L ^ -1L) ? 0 : 1));
                    if (stackIn_23_0 != 0) {
                      break L4;
                    } else {
                      stackIn_28_0 = 0L;

                      if (var7 != 0) {
                        break L3;
                      } else {
                        if (stackIn_28_0 == var2_long) {
                          break L4;
                        } else {
                          var2_long = var2_long / 37L;
                          if (var7 == 0) {
                            continue L12;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                }
                stackIn_28_0 = var2_long;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var2 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var2);

            stackIn_31_1 = new StringBuilder().append("uj.A(");

            if (param0 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L13;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L13;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ')');
        }
        return stackIn_28_0;
    }

    uj(int param0) {
        this.field_c = param0;
    }

    public static void a(byte param0) {
        field_d = null;
        field_a = null;
        if (param0 <= 124) {
            uj.a((byte) -12);
        }
        field_f = null;
        field_b = null;
        field_e = null;
    }

    static {
        $cfr$clinit: {
            int var0;
            int var1;
            int var2;
            field_b = new int[256];
            var1 = 0;
            L0: while (true) {
              if (-257 >= (var1 ^ -1)) {
                field_f = "Resume Game";
                field_e = "Play free version";
                field_d = "Level failed! Too many fleas died!";
                break $cfr$clinit;
              } else {
                var0 = var1;
                var2 = 0;
                L1: while (true) {
                  if ((var2 ^ -1) <= -9) {
                    field_b[var1] = var0;
                    var1++;
                    continue L0;
                  } else {
                    if ((1 & var0 ^ -1) == -2) {
                      var0 = -306674912 ^ var0 >>> -26146047;
                      var2++;
                      continue L1;
                    } else {
                      var0 = var0 >>> 1;
                      var2++;
                      continue L1;
                    }
                  }
                }
              }
            }
        }
    }
}
