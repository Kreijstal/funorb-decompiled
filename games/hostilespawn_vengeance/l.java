/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class l {
    static int[] field_c;
    static int field_a;
    static String field_b;
    static int field_d;
    static String field_e;

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = HostileSpawn.field_I ? 1 : 0;
        var2 = param1;
        if (var2 == 3) {
          return 6;
        } else {
          if (var2 != 24) {
            if (var2 == 18) {
              return 7;
            } else {
              if (19 == var2) {
                return 4;
              } else {
                if (var2 != 28) {
                  if (var2 != 225) {
                    if (1 == var2) {
                      return 8;
                    } else {
                      if (var2 == 27) {
                        return 5;
                      } else {
                        if (var2 != 8) {
                          if (var2 != 25) {
                            if (param0 == -28) {
                              return 8;
                            } else {
                              return -56;
                            }
                          } else {
                            return 4;
                          }
                        } else {
                          return 8;
                        }
                      }
                    }
                  } else {
                    return 4;
                  }
                } else {
                  return 4;
                }
              }
            }
          } else {
            return 6;
          }
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        int var1 = -25;
        field_e = null;
    }

    final static void a(String param0, byte param1) {
        try {
            int var2_int = 108 / ((param1 - 44) / 48);
            ad.field_c = param0;
            g.a((byte) -116, 12);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "l.C(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static long a(CharSequence param0, byte param1) {
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        long stackIn_3_0 = 0L;
        long stackIn_21_0 = 0L;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        long stackOut_20_0 = 0L;
        long stackOut_2_0 = 0L;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var7 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var2_long = 0L;
            var4 = param0.length();
            var5 = 0;
            if (param1 > 74) {
              L1: while (true) {
                L2: {
                  if (var4 <= var5) {
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        var2_long = var2_long * 37L;
                        var6 = param0.charAt(var5);
                        if (65 > var6) {
                          break L4;
                        } else {
                          if (var6 > 90) {
                            break L4;
                          } else {
                            var2_long = var2_long + (long)(-64 + var6);
                            break L3;
                          }
                        }
                      }
                      L5: {
                        if (var6 < 97) {
                          break L5;
                        } else {
                          if (var6 > 122) {
                            break L5;
                          } else {
                            var2_long = var2_long + (long)(-97 + var6 + 1);
                            break L3;
                          }
                        }
                      }
                      if (var6 < 48) {
                        break L3;
                      } else {
                        if (var6 > 57) {
                          break L3;
                        } else {
                          var2_long = var2_long + (long)(-48 + (27 + var6));
                          break L3;
                        }
                      }
                    }
                    if (177917621779460413L <= var2_long) {
                      break L2;
                    } else {
                      var5++;
                      continue L1;
                    }
                  }
                }
                L6: while (true) {
                  L7: {
                    if (var2_long % 37L != 0L) {
                      break L7;
                    } else {
                      if (var2_long == 0L) {
                        break L7;
                      } else {
                        var2_long = var2_long / 37L;
                        continue L6;
                      }
                    }
                  }
                  stackOut_20_0 = var2_long;
                  stackIn_21_0 = stackOut_20_0;
                  break L0;
                }
              }
            } else {
              stackOut_2_0 = 5L;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("l.A(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param1 + 41);
        }
        return stackIn_21_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Password is valid";
        field_d = -1;
        field_c = new int[8192];
        field_e = "Loading...";
    }
}
