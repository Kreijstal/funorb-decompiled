/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga {
    static bd field_a;
    static int field_b;
    static String field_c;

    public static void a(byte param0) {
        if (param0 > -47) {
            ga.a((byte) -107);
        }
        field_a = null;
        field_c = null;
    }

    final static byte[] a(int param0, en param1, byte[] param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        byte[] stackIn_17_0 = null;
        byte[] stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var4_int = param1.a(param3, true);
            if (var4_int != 0) {
              L1: {
                L2: {
                  if (param2 == null) {
                    break L2;
                  } else {
                    if (var4_int == param2.length) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                param2 = new byte[var4_int];
                break L1;
              }
              L3: {
                var5 = param1.a(3, true);
                var6 = (byte)param1.a(8, true);
                if ((var5 ^ -1) < -1) {
                  var7 = 0;
                  L4: while (true) {
                    if (var4_int <= var7) {
                      break L3;
                    } else {
                      param2[var7] = (byte)(var6 + param1.a(var5, true));
                      var7++;
                      continue L4;
                    }
                  }
                } else {
                  var7 = 0;
                  L5: while (true) {
                    if (var7 >= var4_int) {
                      break L3;
                    } else {
                      param2[var7] = (byte)var6;
                      var7++;
                      continue L5;
                    }
                  }
                }
              }
              if (param0 >= 90) {
                stackIn_19_0 = (byte[]) (param2);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_17_0 = (byte[]) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var4);

            stackIn_22_1 = new StringBuilder().append("ga.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param2 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L7;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L7;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_23_0), stackIn_26_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0;
          } else {
            return stackIn_19_0;
          }
        }
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    static {
        field_b = 256;
        field_c = "The marine's current health is shown at the bottom-right of the screen. Killing enough hostiles will provide you with a promotion and a health boost to keep you fighting fit.";
    }
}
