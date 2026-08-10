/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg {
    static boolean field_d;
    static int[] field_b;
    static oc field_a;
    static int field_c;

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9;
        var9 = Lexicominos.field_L ? 1 : 0;
        if (param5 < -25) {
          if (param2 > param7) {
            if (param2 >= param4) {
              if (param7 < param4) {
                oe.a((byte) 106, param3, lf.field_b, param0, param6, param7, param2, param1, param4);
                return;
              } else {
                oe.a((byte) 106, param3, lf.field_b, param0, param1, param4, param2, param6, param7);
                return;
              }
            } else {
              oe.a((byte) 113, param6, lf.field_b, param0, param3, param7, param4, param1, param2);
              return;
            }
          } else {
            if (param4 <= param7) {
              if (param4 <= param2) {
                oe.a((byte) 91, param1, lf.field_b, param0, param3, param4, param7, param6, param2);
                return;
              } else {
                oe.a((byte) 113, param1, lf.field_b, param0, param6, param2, param7, param3, param4);
                return;
              }
            } else {
              oe.a((byte) 74, param6, lf.field_b, param0, param1, param2, param4, param3, param7);
              return;
            }
          }
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        if (param0 != 105) {
            field_d = true;
        }
    }

    final static String a(byte param0, sh param1, String param2, int param3, String param4) {
        RuntimeException var5 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 100) {
                break L1;
              } else {
                field_a = (oc) null;
                break L1;
              }
            }
            if (!param1.c(127)) {
              stackIn_5_0 = (String) (param4);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              stackIn_7_0 = param2 + " - " + param1.b((byte) -102, param3) + "%";
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("qg.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_11_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    static {
        field_d = true;
        field_b = new int[1024];
        field_a = new oc();
    }
}
