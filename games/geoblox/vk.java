/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vk {
    static int field_a;
    static qi field_b;
    static dm[] field_e;
    static hi field_d;
    static int[] field_c;

    abstract void a(java.awt.Component param0, byte param1);

    abstract void a(int param0, java.awt.Component param1);

    abstract int a(boolean param0);

    final static byte[] a(byte[] param0, pk param1, int param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        byte[] stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = Geoblox.field_C;
        try {
          L0: {
            var4_int = param1.e((byte) -17, param2);
            if (var4_int != 0) {
              L1: {
                L2: {
                  if (param0 == null) {
                    break L2;
                  } else {
                    if (param0.length == var4_int) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                param0 = new byte[var4_int];
                break L1;
              }
              L3: {
                var5 = param1.e((byte) -17, 3);
                var6 = (byte)param1.e((byte) -17, param3);
                if (0 >= var5) {
                  var7 = 0;
                  L4: while (true) {
                    if (var4_int <= var7) {
                      break L3;
                    } else {
                      param0[var7] = (byte)var6;
                      var7++;
                      continue L4;
                    }
                  }
                } else {
                  var7 = 0;
                  L5: while (true) {
                    if (var4_int <= var7) {
                      break L3;
                    } else {
                      param0[var7] = (byte)(param1.e((byte) -17, var5) + var6);
                      var7++;
                      continue L5;
                    }
                  }
                }
              }
              stackIn_16_0 = (byte[]) (param0);
              decompiledRegionSelector0 = 1;
              break L0;
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
            stackIn_19_0 = (RuntimeException) (var4);

            stackIn_19_1 = new StringBuilder().append("vk.E(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_20_0), stackIn_23_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_3_0);
        } else {
          return stackIn_16_0;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_e = null;
        field_b = null;
        if (param0 >= -9) {
            return;
        }
        field_d = null;
    }

    static {
        field_c = new int[8192];
    }
}
