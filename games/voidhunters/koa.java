/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class koa extends le {
    private int field_l;
    private int field_i;
    private int field_j;
    static String field_k;

    final void a(int param0, int param1, ds param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ds var6 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param1 < -60) {
                break L1;
              } else {
                var6 = (ds) null;
                this.a(61, -46, (ds) null);
                break L1;
              }
            }
            L2: {
              var4_int = param0;
              if (var4_int == 0) {
                this.field_l = param2.e(1869);
                break L2;
              } else {
                if (-2 != (var4_int ^ -1)) {
                  if (var4_int != 2) {
                    break L2;
                  } else {
                    L3: {
                      stackOut_10_0 = this;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_11_0 = stackOut_10_0;
                      if (param2.e((byte) -93) != 1) {
                        stackOut_12_0 = this;
                        stackOut_12_1 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        break L3;
                      } else {
                        stackOut_11_0 = this;
                        stackOut_11_1 = 1;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        break L3;
                      }
                    }
                    ((koa) (this)).field_g = stackIn_13_1 != 0;
                    break L2;
                  }
                } else {
                  this.field_j = param2.e(1869);
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var4);
            stackOut_15_1 = new StringBuilder().append("koa.F(").append(param0).append(',').append(param1).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
    }

    public static void d(int param0) {
        if (param0 < 9) {
            koa.d(-110);
        }
        field_k = null;
    }

    final int[] a(int param0, boolean param1) {
        int[] var4 = null;
        int var5 = 0;
        int var6 = VoidHunters.field_G;
        if (!param1) {
            return (int[]) null;
        }
        int[] var7 = this.field_f.a((byte) 117, param0);
        int[] var3 = var7;
        if (!(!this.field_f.field_e)) {
            var4 = this.a(0, param0, 255);
            for (var5 = 0; var5 < hob.field_d; var5++) {
                var7[var5] = (var4[var5] * this.field_i >> 1495760652) + this.field_l;
            }
        }
        return var3;
    }

    final int[][] a(int param0, int param1) {
        int[][] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = VoidHunters.field_G;
        if (param0 != 255) {
            this.field_l = 63;
        }
        int[][] var20 = this.field_d.a(param1, (byte) -126);
        int[][] var15 = var20;
        int[][] var13 = var15;
        int[][] var3 = var13;
        if (this.field_d.field_g) {
            var28 = this.a((byte) 65, 0, param1);
            var29 = var28[0];
            var30 = var28[1];
            var31 = var28[2];
            var8 = var20[0];
            var9 = var20[1];
            var10 = var20[2];
            for (var11 = 0; var11 < hob.field_d; var11++) {
                var8[var11] = (var29[var11] * this.field_i >> -754609012) + this.field_l;
                var9[var11] = (this.field_i * var30[var11] >> 220652812) + this.field_l;
                var10[var11] = (this.field_i * var31[var11] >> 1547466956) + this.field_l;
            }
        }
        return var13;
    }

    public koa() {
        super(1, false);
        this.field_j = 3072;
        this.field_i = 2048;
        this.field_l = 1024;
    }

    final void c(byte param0) {
        int[] discarded$0 = null;
        this.field_i = -this.field_l + this.field_j;
        if (param0 > -35) {
            discarded$0 = this.a(3, false);
        }
    }

    static {
        field_k = "Waiting for textures";
    }
}
