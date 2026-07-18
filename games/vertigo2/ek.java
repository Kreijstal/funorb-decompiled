/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek extends ji {
    static int field_E;
    static String field_C;
    static va field_F;
    private int field_A;
    private int field_z;
    private int field_D;
    static int[] field_y;

    public ek() {
        super(1, false);
        ((ek) this).field_A = 4096;
        ((ek) this).field_z = 4096;
        ((ek) this).field_D = 4096;
    }

    final void a(byte param0, int param1, ed param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param1;
              if (var4_int != 0) {
                if (var4_int != 1) {
                  if (2 != var4_int) {
                    break L1;
                  } else {
                    ((ek) this).field_A = param2.a((byte) -11);
                    break L1;
                  }
                } else {
                  ((ek) this).field_z = param2.a((byte) -11);
                  break L1;
                }
              } else {
                ((ek) this).field_D = param2.a((byte) -11);
                break L1;
              }
            }
            if (param0 == 110) {
              break L0;
            } else {
              ((ek) this).field_A = -105;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("ek.C(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    public static void g(int param0) {
        field_y = null;
        field_F = null;
        field_C = null;
        if (param0 > -50) {
            ek.g(43);
        }
    }

    final int[][] b(int param0, int param1) {
        int[][] var3 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[][] var16 = null;
        int[][] var18 = null;
        int[][] var23 = null;
        int[][] var28 = null;
        int[][] var32 = null;
        int[][] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        var15 = Vertigo2.field_L ? 1 : 0;
        if (param0 == -3780) {
          var33 = ((ek) this).field_v.a(param1, -2);
          var28 = var33;
          var23 = var28;
          var18 = var23;
          var16 = var18;
          var3 = var16;
          if (!((ek) this).field_v.field_c) {
            return var3;
          } else {
            var32 = ((ek) this).c(0, 3, param1);
            var34 = var32[0];
            var36 = var32[1];
            var35 = var32[2];
            var8 = var33[0];
            var9 = var33[1];
            var10 = var33[2];
            var11 = 0;
            L0: while (true) {
              if (we.field_M <= var11) {
                return var3;
              } else {
                L1: {
                  var12 = var34[var11];
                  var13 = var35[var11];
                  var14 = var36[var11];
                  if (var13 != var12) {
                    break L1;
                  } else {
                    if (var13 != var14) {
                      break L1;
                    } else {
                      var8[var11] = ((ek) this).field_D * var12 >> 12;
                      var9[var11] = ((ek) this).field_z * var13 >> 12;
                      var10[var11] = var14 * ((ek) this).field_A >> 12;
                      var11++;
                      var11++;
                      var11++;
                      continue L0;
                    }
                  }
                }
                var8[var11] = ((ek) this).field_D;
                var9[var11] = ((ek) this).field_z;
                var10[var11] = ((ek) this).field_A;
                var11++;
                var11++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = -1;
        field_C = "Time Attack";
        field_y = new int[8192];
    }
}
