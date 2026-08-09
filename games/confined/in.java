/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class in {
    static ha[] field_e;
    static boolean field_h;
    int field_g;
    boolean field_a;
    static int[][] field_b;
    String field_f;
    static String field_d;
    String[] field_c;
    boolean field_i;

    final static byte[] a(int param0, byte[] param1, int param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5_int = 0;
        fd var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((param0 ^ -1) < -1) {
                var8 = new byte[param2];
                var4 = var8;
                var5_int = 0;
                L2: while (true) {
                  if (var5_int >= param2) {
                    break L1;
                  } else {
                    var8[var5_int] = param1[param0 + var5_int];
                    var5_int++;
                    continue L2;
                  }
                }
              } else {
                var4 = param1;
                break L1;
              }
            }
            var5 = new fd();
            if (param3 == -26879) {
              var5.b((byte) -78);
              var5.a((long)(param2 * 8), param3 ^ -26871, var4);
              var6 = new byte[64];
              var5.a(var6, 0, (byte) 3);
              stackIn_10_0 = (byte[]) (var6);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_8_0 = (byte[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4_ref);

            stackIn_13_1 = new StringBuilder().append("in.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          return stackIn_10_0;
        }
    }

    final static int a(int param0, byte[] param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 < -80) {
              stackIn_4_0 = ah.a(param1, 0, param0, (byte) -124);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 80;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("in.B(").append(param0).append(',');

            if (param1 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_d = null;
        int var1 = -37 / ((param0 - -64) / 46);
        field_b = (int[][]) null;
    }

    in(boolean param0) {
        this.field_a = param0 ? true : false;
    }

    static {
        int var0 = 0;
        field_e = new ha[255];
        field_h = false;
        for (var0 = 0; var0 < field_e.length; var0++) {
            field_e[var0] = new ha();
        }
        field_d = "Accept";
    }
}
