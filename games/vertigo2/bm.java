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
          return;
        }
    }

    final void a(byte param0, int param1, ed param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param1;
              if (var4_int != 0) {
                if (1 == var4_int) {
                  ((bm) this).field_F = param2.a((byte) -11);
                  break L1;
                } else {
                  if (var4_int == 2) {
                    L2: {
                      stackOut_8_0 = this;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_9_0 = stackOut_8_0;
                      if (param2.h(-11) != 1) {
                        stackOut_10_0 = this;
                        stackOut_10_1 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        break L2;
                      } else {
                        stackOut_9_0 = this;
                        stackOut_9_1 = 1;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        break L2;
                      }
                    }
                    ((bm) this).field_o = stackIn_11_1 != 0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                ((bm) this).field_C = param2.a((byte) -11);
                break L1;
              }
            }
            L3: {
              if (param0 == 110) {
                break L3;
              } else {
                field_H = 55L;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("bm.C(").append(param0).append(44).append(param1).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
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
                var8[var11] = (var31[var11] * ((bm) this).field_z >> 12) + ((bm) this).field_C;
                var9[var11] = (((bm) this).field_z * var32[var11] >> 12) + ((bm) this).field_C;
                var10[var11] = ((bm) this).field_C - -(((bm) this).field_z * var33[var11] >> 12);
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
                var7[var5] = (((bm) this).field_z * var4[var5] >> 12) + ((bm) this).field_C;
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
            int discarded$0 = 0;
            fb.h();
        }
        gr.field_Y = 0;
    }

    final static void a(si param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            int discarded$2 = 256;
            gh.a(param0, (byte) -123, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("bm.F(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 44 + 4 + 41);
        }
    }

    public static void b() {
        field_G = null;
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
