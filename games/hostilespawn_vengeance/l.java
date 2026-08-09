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
        int var2;
        int var3;
        var3 = HostileSpawn.field_I ? 1 : 0;
        var2 = param1;
        if (-4 != (var2 ^ -1)) {
          if (-25 != (var2 ^ -1)) {
            if ((var2 ^ -1) != -19) {
              if (19 != var2) {
                if (-29 != (var2 ^ -1)) {
                  if (-226 != (var2 ^ -1)) {
                    if (1 != var2) {
                      if ((var2 ^ -1) != -28) {
                        if (-9 != (var2 ^ -1)) {
                          if (var2 != 25) {
                            if (param0 != -28) {
                              return -56;
                            } else {
                              return 8;
                            }
                          } else {
                            return 4;
                          }
                        } else {
                          return 8;
                        }
                      } else {
                        return 5;
                      }
                    } else {
                      return 8;
                    }
                  } else {
                    return 4;
                  }
                } else {
                  return 4;
                }
              } else {
                return 4;
              }
            } else {
              return 7;
            }
          } else {
            return 6;
          }
        } else {
          return 6;
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        int var1 = -25 / ((45 - param0) / 34);
        field_e = null;
    }

    final static void a(String param0, byte param1) {
        try {
            int var2_int = 108 / ((param1 - 44) / 48);
            ad.field_c = param0;
            g.a((byte) -116, 12);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "l.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static long a(CharSequence param0, byte param1) {
        long var2_long = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        long stackIn_3_0 = 0L;
        long stackIn_21_0 = 0L;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
                    if ((var2_long % 37L ^ -1L) != -1L) {
                      break L7;
                    } else {
                      if (-1L == (var2_long ^ -1L)) {
                        break L7;
                      } else {
                        var2_long = var2_long / 37L;
                        continue L6;
                      }
                    }
                  }
                  stackIn_21_0 = var2_long;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              stackIn_3_0 = 5L;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2);

            stackIn_24_1 = new StringBuilder().append("l.A(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_21_0;
        }
    }

    static {
        field_b = "Password is valid";
        field_d = -1;
        field_c = new int[8192];
        field_e = "Loading...";
    }
}
