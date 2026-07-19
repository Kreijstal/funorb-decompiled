/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql {
    static int[] field_b;
    static String field_a;
    static String field_f;
    static int field_e;
    static String field_d;
    static boolean[] field_c;

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        var4 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 256) {
                break L1;
              } else {
                ql.a(58, (byte) -83);
                break L1;
              }
            }
            var3_int = 1;
            L2: while (true) {
              if (param2 <= 1) {
                if ((param2 ^ -1) != -2) {
                  stackOut_12_0 = var3_int;
                  stackIn_13_0 = stackOut_12_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackOut_10_0 = param1 * var3_int;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L3: {
                  if ((1 & param2) != 0) {
                    var3_int = var3_int * param1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                param2 = param2 >> 1;
                param1 = param1 * param1;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var3), "ql.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0;
        } else {
          return stackIn_13_0;
        }
    }

    final static void a(int param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        fb var3 = null;
        int var4 = 0;
        qf var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var5 = (qf) ((Object) vb.field_h.b((byte) 119));
            L1: while (true) {
              if (var5 == null) {
                var2_int = -104 / ((param1 - -19) / 32);
                var3 = (fb) ((Object) mg.field_l.b((byte) 122));
                L2: while (true) {
                  if (var3 == null) {
                    break L0;
                  } else {
                    ia.a(-86, param0, var3);
                    var3 = (fb) ((Object) mg.field_l.d(853));
                    continue L2;
                  }
                }
              } else {
                ol.a(-30329, var5, param0);
                var5 = (qf) ((Object) vb.field_h.d(853));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var2), "ql.E(" + param0 + ',' + param1 + ')');
        }
    }

    final static String a(ki param0, String param1, String param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            var4_int = 82 % ((-20 - param3) / 32);
            if (param0.b(-1)) {
              stackOut_3_0 = param1 + " - " + param0.a(20147) + "%";
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (String) (param2);
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var4);
            stackOut_5_1 = new StringBuilder().append("ql.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static aa a(int param0) {
        if (param0 != 65280) {
            return (aa) null;
        }
        return (aa) ((Object) new g());
    }

    public static void a(byte param0) {
        if (param0 != 50) {
            return;
        }
        field_b = null;
        field_a = null;
        field_c = null;
        field_f = null;
        field_d = null;
    }

    static {
        $cfr$clinit: {
            int var0 = 0;
            int var1 = 0;
            int var2 = 0;
            int var3 = 0;
            int var4 = 0;
            int var5 = 0;
            int var6 = 0;
            field_b = new int[128];
            var0 = 0;
            L0: while (true) {
              if ((var0 ^ -1) <= -65) {
                var0 = 0;
                L1: while (true) {
                  if (64 <= var0) {
                    var0 = field_b[63] & 16711935;
                    var1 = field_b[63] & 65280;
                    var2 = 0;
                    L2: while (true) {
                      if ((var2 ^ -1) <= -3) {
                        field_a = "Data server full or too many connections from your address. Please try again in a few minutes.";
                        field_f = "Please wait...";
                        field_d = "Warning: if you quit, you will lose any game you are in the middle of!";
                        field_e = 0;
                        break $cfr$clinit;
                      } else {
                        var3 = field_b[64 + var2];
                        var4 = -(var2 * 256 / 2) + 256;
                        var5 = 16711935 & var3;
                        var6 = 65280 & var3;
                        var5 = var5 * (256 + -var4);
                        var5 = var5 + var0 * var4;
                        var6 = var6 * (256 - var4);
                        var6 = var6 + var1 * var4;
                        var3 = (var5 & -16711936 | var6 & 16711680) >>> 1407628424;
                        field_b[64 - -var2] = var3;
                        var2++;
                        continue L2;
                      }
                    }
                  } else {
                    var1 = 96 * (var0 * var0) / 4096;
                    var2 = 32 * (var0 * (var0 * var0)) / 262144;
                    var3 = 128 * var0 * var0 / 4096;
                    field_b[-var0 + 127] = var3 + ((var2 << 770669352) + (var1 << 994449488));
                    var0++;
                    continue L1;
                  }
                }
              } else {
                var1 = var0 * var0 * 192 / 4096;
                var2 = var0 * (var0 * (var0 * var0) * 128) / 16777216;
                var3 = var0 * var0 * (var0 * 255) / 262144;
                field_b[var0] = (var2 << 1799206696) + ((var1 << 840283408) + var3);
                var0++;
                continue L0;
              }
            }
        }
    }
}
