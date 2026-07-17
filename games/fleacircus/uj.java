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

    final static boolean a() {
        return ed.field_b;
    }

    final static int a(boolean param0, int param1, int param2, byte[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var6 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var4_int = -1;
            var5 = param1;
            L1: while (true) {
              if (param2 <= var5) {
                var7 = null;
                var4_int = ~var4_int;
                stackOut_4_0 = var4_int;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var4_int = field_b[255 & (var4_int ^ param3[var5])] ^ var4_int >>> 8;
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("uj.D(").append(0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
        return stackIn_5_0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static String a(char param0, String param1, int param2, String param3) {
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
        String stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var11 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param1.length();
              var5 = param3.length();
              var6 = var4_int;
              var7 = var5 - param2;
              if (var7 != 0) {
                var8_int = 0;
                L2: while (true) {
                  var8_int = param1.indexOf('_', var8_int);
                  if (var8_int >= 0) {
                    var6 = var6 + var7;
                    var8_int++;
                    continue L2;
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            var8 = new StringBuilder(var6);
            var9 = 0;
            L3: while (true) {
              var10 = param1.indexOf('_', var9);
              if (var10 < 0) {
                StringBuilder discarded$3 = var8.append(param1.substring(var9));
                stackOut_10_0 = var8.toString();
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                StringBuilder discarded$4 = var8.append(param1.substring(var9, var10));
                var9 = 1 + var10;
                StringBuilder discarded$5 = var8.append(param3);
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("uj.C(").append(95).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44).append(param2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
        return stackIn_11_0;
    }

    final static long a(CharSequence param0, byte param1) {
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        long stackIn_22_0 = 0L;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        long stackOut_21_0 = 0L;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var7 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 < -94) {
                break L1;
              } else {
                var8 = null;
                break L1;
              }
            }
            var2_long = 0L;
            var4 = param0.length();
            var5 = 0;
            L2: while (true) {
              L3: {
                if (var4 <= var5) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      var2_long = var2_long * 37L;
                      var6 = param0.charAt(var5);
                      if (var6 < 65) {
                        break L5;
                      } else {
                        if (var6 <= 90) {
                          var2_long = var2_long + (long)(var6 + -64);
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var6 < 97) {
                        break L6;
                      } else {
                        if (122 < var6) {
                          break L6;
                        } else {
                          var2_long = var2_long + (long)(-97 + var6 + 1);
                          break L4;
                        }
                      }
                    }
                    if (48 > var6) {
                      break L4;
                    } else {
                      if (var6 > 57) {
                        break L4;
                      } else {
                        var2_long = var2_long + (long)(var6 + -21);
                        break L4;
                      }
                    }
                  }
                  if (177917621779460413L > var2_long) {
                    var5++;
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              L7: while (true) {
                L8: {
                  if (var2_long % 37L != 0L) {
                    break L8;
                  } else {
                    if (0L == var2_long) {
                      break L8;
                    } else {
                      var2_long = var2_long / 37L;
                      continue L7;
                    }
                  }
                }
                stackOut_21_0 = var2_long;
                stackIn_22_0 = stackOut_21_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var2;
            stackOut_23_1 = new StringBuilder().append("uj.A(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L9;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + param1 + 41);
        }
        return stackIn_22_0;
    }

    uj(int param0) {
        ((uj) this).field_c = param0;
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_b = new int[256];
        var1 = 0;
        L0: while (true) {
          if (var1 >= 256) {
            field_f = "Resume Game";
            field_e = "Play free version";
            field_d = "Level failed! Too many fleas died!";
            return;
          } else {
            var0 = var1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 8) {
                field_b[var1] = var0;
                var1++;
                continue L0;
              } else {
                if ((1 & var0) == 1) {
                  var0 = -306674912 ^ var0 >>> 1;
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
