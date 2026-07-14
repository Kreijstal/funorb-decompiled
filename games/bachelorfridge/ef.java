/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef extends k {
    private int field_n;
    static String field_m;
    private int field_p;
    static int field_l;
    static int field_k;
    private int field_o;

    final int[][] a(boolean param0, int param1) {
        int[][] var29 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = BachelorFridge.field_y;
        int[][] var30 = ((ef) this).field_h.a(param1, -858);
        int[][] var25 = var30;
        int[][] var20 = var25;
        int[][] var15 = var20;
        int[][] var13 = var15;
        int[][] var3 = var13;
        if (param0) {
            field_k = -38;
        }
        if (((ef) this).field_h.field_b) {
            var29 = ((ef) this).a((byte) -101, 0, param1);
            var31 = var29[0];
            var32 = var29[1];
            var33 = var29[2];
            var8 = var30[0];
            var9 = var30[1];
            var10 = var30[2];
            for (var11 = 0; hh.field_d > var11; var11++) {
                var8[var11] = (((ef) this).field_n * var31[var11] >> 423023660) + ((ef) this).field_o;
                var9[var11] = ((ef) this).field_o - -(((ef) this).field_n * var32[var11] >> -1615748148);
                var10[var11] = ((ef) this).field_o - -(var33[var11] * ((ef) this).field_n >> 101794540);
            }
        }
        return var13;
    }

    public static void b(boolean param0) {
        field_m = null;
        if (param0) {
            ef.b(true);
        }
    }

    final void d(byte param0) {
        ((ef) this).field_n = ((ef) this).field_p - ((ef) this).field_o;
        if (param0 != -68) {
            field_k = 76;
        }
    }

    public ef() {
        super(1, false);
        ((ef) this).field_n = 2048;
        ((ef) this).field_p = 3072;
        ((ef) this).field_o = 1024;
    }

    final void a(byte param0, lu param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        L0: {
          var5 = BachelorFridge.field_y;
          var4 = param2;
          if (0 == var4) {
            ((ef) this).field_o = param1.e((byte) 98);
            break L0;
          } else {
            if (-2 != (var4 ^ -1)) {
              if (2 != var4) {
                break L0;
              } else {
                L1: {
                  stackOut_7_0 = this;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_8_0 = stackOut_7_0;
                  if (param1.b(16711935) != 1) {
                    stackOut_9_0 = this;
                    stackOut_9_1 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    break L1;
                  } else {
                    stackOut_8_0 = this;
                    stackOut_8_1 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    break L1;
                  }
                }
                ((ef) this).field_f = stackIn_10_1 != 0;
                break L0;
              }
            } else {
              ((ef) this).field_p = param1.e((byte) 45);
              break L0;
            }
          }
        }
        L2: {
          if (param0 == -71) {
            break L2;
          } else {
            field_l = -88;
            break L2;
          }
        }
    }

    final int[] a(int param0, int param1) {
        int[] var4 = null;
        int var5 = 0;
        int var6 = BachelorFridge.field_y;
        if (param1 != 0) {
            ((ef) this).field_o = 69;
        }
        int[] var7 = ((ef) this).field_j.a(param0, -1);
        int[] var3 = var7;
        if (!(!((ef) this).field_j.field_m)) {
            var4 = ((ef) this).a(0, param0, (byte) 122);
            for (var5 = 0; var5 < hh.field_d; var5++) {
                var7[var5] = (var4[var5] * ((ef) this).field_n >> 912441388) + ((ef) this).field_o;
            }
        }
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "<%0> might change the options - wait and see.";
        field_l = -1;
    }
}
