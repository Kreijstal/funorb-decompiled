/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig extends qf {
    static dk field_h;
    private java.nio.ByteBuffer field_i;
    static int[] field_j;

    final byte[] a(int param0) {
        byte[] var4 = new byte[this.field_i.capacity()];
        byte[] var2 = var4;
        int var3 = -11 % ((param0 - 25) / 56);
        this.field_i.position(0);
        this.field_i.get(var4);
        return var4;
    }

    final void a(byte param0, byte[] param1) {
        try {
            this.field_i = java.nio.ByteBuffer.allocateDirect(param1.length);
            int var3_int = 43 % ((-43 - param0) / 42);
            this.field_i.position(0);
            this.field_i.put(param1);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ig.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(mi param0, int param1, byte param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = param0.c(param1, (byte) 72);
            var3 = var4;
            if (var4 == null) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param2 >= 35) {
                  break L1;
                } else {
                  field_h = (dk) null;
                  break L1;
                }
              }
              lc.a(false, var4);
              stackIn_7_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("ig.G(");

            if (param0 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    final static void a(int param0, int param1, byte param2, int param3) {
        int var5 = 125 % ((param2 - 2) / 37);
        int var4 = 88 * param3 >> 217456656;
        int var6 = fn.field_b;
        int var7 = 472 - var4;
        fn.field_b = var7;
        dn.field_c[param0].c(param1, 384);
        fn.field_b = var6;
    }

    public static void c(int param0) {
        if (param0 != -6348) {
            ig.c(78);
            field_j = null;
            field_h = null;
            return;
        }
        field_j = null;
        field_h = null;
    }

    ig() {
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            if (param1 == 0) {
              L1: {
                L2: {
                  param0 = sc.a(param0, '_', "", -78);
                  var3 = pn.a(-1, param0);
                  if (0 != (param2.indexOf(param0) ^ -1)) {
                    break L2;
                  } else {
                    if (0 == (param2.indexOf(var3) ^ -1)) {
                      stackIn_8_0 = 0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackIn_8_0 = 1;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("ig.H(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    static {
        field_j = new int[]{66, 76, 4, 4, 7, 10, 17, 17, 23, 24, 25, 25, 7, 28, 31, 31, 23, 32, 38, 38, 44, 45, 50, 51, 45, 59};
    }
}
