/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ksb extends le {
    final int[][] a(int param0, int param1) {
        int[][] var19 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = VoidHunters.field_G;
        if (param0 != 255) {
            ksb.b(-104, -124);
        }
        int[][] var20 = this.field_d.a(param1, (byte) -97);
        int[][] var15 = var20;
        int[][] var13 = var15;
        int[][] var3 = var13;
        if (this.field_d.field_g) {
            var19 = this.a((byte) 76, 0, param1);
            var21 = var19[0];
            var22 = var19[1];
            var23 = var19[2];
            var8 = var20[0];
            var9 = var20[1];
            var10 = var20[2];
            for (var11 = 0; var11 < hob.field_d; var11++) {
                var8[var11] = 4096 - var21[var11];
                var9[var11] = -var22[var11] + 4096;
                var10[var11] = -var23[var11] + 4096;
            }
        }
        return var13;
    }

    final void a(int param0, int param1, ds param2) {
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            if (param1 <= -60) {
              L1: {
                if (param0 == 0) {
                  L2: {
                    stackIn_6_0 = this;

                    if (-2 != (param2.e((byte) -95) ^ -1)) {
                      stackIn_7_0 = this;
                      stackIn_7_1 = 0;
                      break L2;
                    } else {
                      stackIn_7_0 = this;
                      stackIn_7_1 = 1;
                      break L2;
                    }
                  }
                  ((ksb) (this)).field_g = stackIn_7_1 != 0;
                  break L1;
                } else {
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("ksb.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int[] a(int param0, boolean param1) {
        int[] var4 = null;
        int var5 = 0;
        int var6 = VoidHunters.field_G;
        if (!param1) {
            return (int[]) null;
        }
        int[] var7 = this.field_f.a((byte) 4, param0);
        int[] var3 = var7;
        if (this.field_f.field_e) {
            var4 = this.a(0, param0, 255);
            for (var5 = 0; hob.field_d > var5; var5++) {
                var7[var5] = 4096 + -var4[var5];
            }
        }
        return var3;
    }

    public ksb() {
        super(1, false);
    }

    final static boolean b(int param0, int param1) {
        if (param0 > -75) {
            return true;
        }
        return param1 == 3 ? true : false;
    }

    static {
    }
}
