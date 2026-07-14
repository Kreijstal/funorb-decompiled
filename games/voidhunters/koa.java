/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class koa extends le {
    private int field_l;
    private int field_i;
    private int field_j;
    static String field_k;

    final void a(int param0, int param1, ds param2) {
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackOut_9_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        L0: {
          var5 = VoidHunters.field_G;
          if (param1 < -60) {
            break L0;
          } else {
            var6 = null;
            ((koa) this).a(61, -46, (ds) null);
            break L0;
          }
        }
        L1: {
          var4 = param0;
          if (var4 == 0) {
            ((koa) this).field_l = param2.e(1869);
            break L1;
          } else {
            if (-2 != (var4 ^ -1)) {
              if (var4 != 2) {
                break L1;
              } else {
                L2: {
                  stackOut_9_0 = this;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_10_0 = stackOut_9_0;
                  if (param2.e((byte) -93) != 1) {
                    stackOut_11_0 = this;
                    stackOut_11_1 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    break L2;
                  } else {
                    stackOut_10_0 = this;
                    stackOut_10_1 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    break L2;
                  }
                }
                ((koa) this).field_g = stackIn_12_1 != 0;
                break L1;
              }
            } else {
              ((koa) this).field_j = param2.e(1869);
              break L1;
            }
          }
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
            return null;
        }
        int[] var7 = ((koa) this).field_f.a((byte) 117, param0);
        int[] var3 = var7;
        if (!(!((koa) this).field_f.field_e)) {
            var4 = ((koa) this).a(0, param0, 255);
            for (var5 = 0; var5 < hob.field_d; var5++) {
                var7[var5] = (var4[var5] * ((koa) this).field_i >> 1495760652) + ((koa) this).field_l;
            }
        }
        return var3;
    }

    final int[][] a(int param0, int param1) {
        int[][] var29 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = VoidHunters.field_G;
        if (param0 != 255) {
            ((koa) this).field_l = 63;
        }
        int[][] var30 = ((koa) this).field_d.a(param1, (byte) -126);
        int[][] var25 = var30;
        int[][] var20 = var25;
        int[][] var15 = var20;
        int[][] var13 = var15;
        int[][] var3 = var13;
        if (((koa) this).field_d.field_g) {
            var29 = ((koa) this).a((byte) 65, 0, param1);
            var31 = var29[0];
            var32 = var29[1];
            var33 = var29[2];
            var8 = var30[0];
            var9 = var30[1];
            var10 = var30[2];
            for (var11 = 0; var11 < hob.field_d; var11++) {
                var8[var11] = (var31[var11] * ((koa) this).field_i >> -754609012) + ((koa) this).field_l;
                var9[var11] = (((koa) this).field_i * var32[var11] >> 220652812) + ((koa) this).field_l;
                var10[var11] = (((koa) this).field_i * var33[var11] >> 1547466956) + ((koa) this).field_l;
            }
        }
        return var13;
    }

    public koa() {
        super(1, false);
        ((koa) this).field_j = 3072;
        ((koa) this).field_i = 2048;
        ((koa) this).field_l = 1024;
    }

    final void c(byte param0) {
        ((koa) this).field_i = -((koa) this).field_l + ((koa) this).field_j;
        if (param0 > -35) {
            int[] discarded$0 = ((koa) this).a(3, false);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Waiting for textures";
    }
}
