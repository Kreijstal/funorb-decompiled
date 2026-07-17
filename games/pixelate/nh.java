/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh {
    static String field_d;
    static String field_c;
    static int[] field_a;
    static int field_b;

    final static ae c(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        ae var5 = null;
        int var6 = 0;
        var6 = Pixelate.field_H ? 1 : 0;
        var3 = -63;
        L0: while (true) {
          L1: {
            var1 = od.a((byte) 41, 65536, -65536);
            var2 = od.a((byte) 41, 65536, -65536);
            var4 = od.a((byte) 41, 65536, -65536);
            if (0 != var1) {
              break L1;
            } else {
              if (0 != var2) {
                break L1;
              } else {
                if (var4 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
          }
          var5 = new ae(var1, var2, var4);
          var5.a((byte) -7);
          return var5;
        }
    }

    public static void b(byte param0) {
        field_a = null;
        field_d = null;
        field_c = null;
        if (param0 <= 61) {
            nh.b((byte) -92);
        }
    }

    final static void a(byte param0) {
        int var1 = rk.field_e.g(16711680);
        int var2 = rk.field_e.g(16777215);
        int var3 = rk.field_e.field_R[0].length;
        rk.field_e.field_R = new int[4][];
        rk.field_e.field_R[0] = new int[var3];
        rk.field_e.field_R[0][var1] = 65793;
        rk.field_e.field_R[0][var2] = 16777215;
        rk.field_e.field_R[1] = new int[var3];
        rk.field_e.field_R[1][var1] = 65793;
        rk.field_e.field_R[1][var2] = 16711680;
        rk.field_e.field_R[2] = new int[var3];
        rk.field_e.field_R[2][var1] = 65793;
        rk.field_e.field_R[2][var2] = 11184810;
        rk.field_e.field_R[3] = new int[var3];
        rk.field_e.field_R[3][var1] = 65793;
        rk.field_e.field_R[3][var2] = 4473924;
    }

    final static long a(CharSequence param0, int param1) {
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        long stackIn_23_0 = 0L;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        long stackOut_22_0 = 0L;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var2_long = 0L;
            var4 = param0.length();
            var5 = 0;
            L1: while (true) {
              L2: {
                if (var5 >= var4) {
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
                          var2_long = var2_long + (long)(-65 + var6 + 1);
                          break L3;
                        }
                      }
                    }
                    L5: {
                      if (var6 < 97) {
                        break L5;
                      } else {
                        if (var6 <= 122) {
                          var2_long = var2_long + (long)(-97 + var6 + 1);
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (48 > var6) {
                      break L3;
                    } else {
                      if (57 >= var6) {
                        var2_long = var2_long + (long)(-48 + var6 + 27);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (var2_long < 177917621779460413L) {
                    var5++;
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              L6: while (true) {
                L7: {
                  if (0L != var2_long % 37L) {
                    break L7;
                  } else {
                    if (0L == var2_long) {
                      break L7;
                    } else {
                      var2_long = var2_long / 37L;
                      continue L6;
                    }
                  }
                }
                stackOut_22_0 = var2_long;
                stackIn_23_0 = stackOut_22_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var2;
            stackOut_24_1 = new StringBuilder().append("nh.A(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + -29667 + 41);
        }
        return stackIn_23_0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var12 = 0;
        RuntimeException decompiledCaughtException = null;
        var12 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 >= 99) {
                break L1;
              } else {
                field_d = null;
                break L1;
              }
            }
            L2: {
              if (param2 < t.field_e) {
                param5 = param5 - (t.field_e + -param2);
                param2 = t.field_e;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param5 + param2 > t.field_h) {
                param5 = -param2 + t.field_h;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (t.field_f > param3) {
                param0 = param0 - (-param3 + t.field_f);
                param3 = t.field_f;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (param0 + param3 <= t.field_a) {
                break L5;
              } else {
                param0 = t.field_a - param3;
                break L5;
              }
            }
            L6: {
              if (0 >= param5) {
                break L6;
              } else {
                if (param0 > 0) {
                  var6_int = param2 - -(param3 * t.field_j);
                  var7 = -param5 + t.field_j;
                  param3 = -param0;
                  L7: while (true) {
                    if (param3 >= 0) {
                      break L0;
                    } else {
                      param2 = -param5;
                      L8: while (true) {
                        if (param2 >= 0) {
                          var6_int = var6_int + var7;
                          param3++;
                          continue L7;
                        } else {
                          L9: {
                            var8 = t.field_k[var6_int];
                            if ((var8 & 65280) >> 8 <= param1) {
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var6_int++;
                          param2++;
                          continue L8;
                        }
                      }
                    }
                  }
                } else {
                  break L6;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var6, "nh.B(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "This game is full.";
        field_a = new int[4];
        field_d = "Mute this player for 48 hours";
    }
}
