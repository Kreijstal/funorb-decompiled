/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm extends ji {
    private int field_F;
    private int field_C;
    static tj field_I;
    private int field_z;
    static String field_A;
    static long field_H;
    static String field_D;
    static String field_B;
    static int[][] field_G;
    static int[] field_E;
    static String field_y;

    final void a(int param0) {
        if (param0 >= -98) {
            field_D = null;
        }
        ((bm) this).field_z = ((bm) this).field_F - ((bm) this).field_C;
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        if (param0 == param4) {
          gh.a(param5, param1, param2, 11, param4);
          return;
        } else {
          L0: {
            L1: {
              if (-param4 + param5 < ap.field_e) {
                break L1;
              } else {
                if (ib.field_a < param5 + param4) {
                  break L1;
                } else {
                  if (ua.field_e > param1 + -param0) {
                    break L1;
                  } else {
                    if (param1 + param0 <= cj.field_D) {
                      rc.a(param4, param2, param0, param1, param5, (byte) -126);
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            mq.a(false, param0, param2, param4, param1, param5);
            break L0;
          }
          L2: {
            if (param3 > 85) {
              break L2;
            } else {
              field_y = null;
              break L2;
            }
          }
          return;
        }
    }

    final void a(byte param0, int param1, ed param2) {
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
          var5 = Vertigo2.field_L ? 1 : 0;
          var4 = param1;
          if (-1 != var4) {
            if (1 == var4) {
              ((bm) this).field_F = param2.a((byte) -11);
              break L0;
            } else {
              if (-3 == var4) {
                L1: {
                  stackOut_7_0 = this;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_8_0 = stackOut_7_0;
                  if (param2.h(-11) != 1) {
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
                ((bm) this).field_o = stackIn_10_1 != 0;
                break L0;
              } else {
                break L0;
              }
            }
          } else {
            ((bm) this).field_C = param2.a((byte) -11);
            break L0;
          }
        }
        L2: {
          if (param0 == 110) {
            break L2;
          } else {
            field_H = 55L;
            break L2;
          }
        }
    }

    public bm() {
        super(1, false);
        ((bm) this).field_F = 3072;
        ((bm) this).field_C = 1024;
        ((bm) this).field_z = 2048;
    }

    final int[][] b(int param0, int param1) {
        int[][] var29 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = Vertigo2.field_L ? 1 : 0;
        if (param0 != -3780) {
            return null;
        }
        int[][] var30 = ((bm) this).field_v.a(param1, -2);
        int[][] var25 = var30;
        int[][] var20 = var25;
        int[][] var15 = var20;
        int[][] var13 = var15;
        int[][] var3 = var13;
        if (!(!((bm) this).field_v.field_c)) {
            var29 = ((bm) this).c(0, 3, param1);
            var31 = var29[0];
            var32 = var29[1];
            var33 = var29[2];
            var8 = var30[0];
            var9 = var30[1];
            var10 = var30[2];
            for (var11 = 0; var11 < we.field_M; var11++) {
                var8[var11] = (var31[var11] * ((bm) this).field_z >> 919914348) + ((bm) this).field_C;
                var9[var11] = (((bm) this).field_z * var32[var11] >> -1615332148) + ((bm) this).field_C;
                var10[var11] = ((bm) this).field_C - -(((bm) this).field_z * var33[var11] >> -1379615252);
            }
        }
        return var13;
    }

    final int[] c(int param0, int param1) {
        int[] var4 = null;
        int var5 = 0;
        int var6 = Vertigo2.field_L ? 1 : 0;
        if (param1 < 91) {
            return null;
        }
        int[] var7 = ((bm) this).field_x.a(param0, (byte) 73);
        int[] var3 = var7;
        if (((bm) this).field_x.field_i) {
            var4 = ((bm) this).a(0, -1, param0);
            for (var5 = 0; we.field_M > var5; var5++) {
                var7[var5] = (((bm) this).field_z * var4[var5] >> -851213556) + ((bm) this).field_C;
            }
        }
        return var3;
    }

    final static void g(int param0) {
        pm.field_a = false;
        if (!(null == ji.field_n)) {
            ji.field_n.a((byte) 34);
        }
        if (!(ui.field_g == param0)) {
            fb.h(0);
        }
        gr.field_Y = 0;
    }

    final static void a(si param0, boolean param1, int param2) {
        gh.a(param0, (byte) -123, param1, 256);
        if (param2 != 4) {
            field_B = null;
        }
    }

    public static void b(boolean param0) {
        field_G = null;
        if (!param0) {
            return;
        }
        field_A = null;
        field_D = null;
        field_E = null;
        field_B = null;
        field_y = null;
        field_I = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = new tj();
        field_A = "You are offering a rematch.";
        field_D = "Loading levels";
        field_G = new int[12][65536];
        field_B = "Private";
        field_E = new int[4];
        field_y = "OK";
    }
}
