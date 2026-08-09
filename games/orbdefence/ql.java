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
                  stackIn_13_0 = var3_int;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_11_0 = param1 * var3_int;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L3: {
                  if ((1 & param2 ^ -1) != -1) {
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
        fb var3 = null;
        int var4 = 0;
        qf var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = 82 % ((-20 - param3) / 32);
            if (param0.b(-1)) {
              stackIn_4_0 = param1 + " - " + param0.a(20147) + "%";
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) (param2);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("ql.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ',' + param3 + ')');
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
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        field_b = new int[128];
        for (var0 = 0; (var0 ^ -1) > -65; var0++) {
            var1 = var0 * var0 * 192 / 4096;
            var2 = var0 * (var0 * (var0 * var0) * 128) / 16777216;
            var3 = var0 * var0 * (var0 * 255) / 262144;
            field_b[var0] = (var2 << 1799206696) + ((var1 << 840283408) + var3);
        }
        for (var0 = 0; 64 > var0; var0++) {
            var1 = 96 * (var0 * var0) / 4096;
            var2 = 32 * (var0 * (var0 * var0)) / 262144;
            var3 = 128 * var0 * var0 / 4096;
            field_b[-var0 + 127] = var3 + ((var2 << 770669352) + (var1 << 994449488));
        }
        var0 = field_b[63] & 16711935;
        var1 = field_b[63] & 65280;
        for (var2 = 0; (var2 ^ -1) > -3; var2++) {
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
        }
        field_a = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_f = "Please wait...";
        field_d = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_e = 0;
    }
}
