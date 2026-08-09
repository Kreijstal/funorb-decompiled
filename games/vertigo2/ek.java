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
        this.field_A = 4096;
        this.field_z = 4096;
        this.field_D = 4096;
    }

    final void a(byte param0, int param1, ed param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param1;
              if (-1 != (var4_int ^ -1)) {
                if (-2 != (var4_int ^ -1)) {
                  if (2 != var4_int) {
                    break L1;
                  } else {
                    this.field_A = param2.a((byte) -11);
                    break L1;
                  }
                } else {
                  this.field_z = param2.a((byte) -11);
                  break L1;
                }
              } else {
                this.field_D = param2.a((byte) -11);
                break L1;
              }
            }
            if (param0 == 110) {
              break L0;
            } else {
              this.field_A = -105;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("ek.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
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
        int[][] var3;
        int[] var8;
        int[] var9;
        int[] var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int[][] var16;
        int[][] var18;
        int[][] var23;
        int[][] var31;
        int[] var32;
        int[] var33;
        int[] var34;
        var15 = Vertigo2.field_L ? 1 : 0;
        if (param0 == -3780) {
          var23 = this.field_v.a(param1, -2);
          var18 = var23;
          var16 = var18;
          var3 = var16;
          if (!this.field_v.field_c) {
            return var3;
          } else {
            var31 = this.c(0, 3, param1);
            var32 = var31[0];
            var34 = var31[1];
            var33 = var31[2];
            var8 = var23[0];
            var9 = var23[1];
            var10 = var23[2];
            var11 = 0;
            L0: while (true) {
              if (we.field_M <= var11) {
                return var3;
              } else {
                L1: {
                  var12 = var32[var11];
                  var13 = var33[var11];
                  var14 = var34[var11];
                  if (var13 != var12) {
                    break L1;
                  } else {
                    if (var13 != var14) {
                      break L1;
                    } else {
                      var8[var11] = this.field_D * var12 >> 958971180;
                      var9[var11] = this.field_z * var13 >> -922777748;
                      var10[var11] = var14 * this.field_A >> -666316340;
                      var11++;
                      continue L0;
                    }
                  }
                }
                var8[var11] = this.field_D;
                var9[var11] = this.field_z;
                var10[var11] = this.field_A;
                var11++;
                continue L0;
              }
            }
          }
        } else {
          return (int[][]) null;
        }
    }

    static {
        field_E = -1;
        field_C = "Time Attack";
        field_y = new int[8192];
    }
}
