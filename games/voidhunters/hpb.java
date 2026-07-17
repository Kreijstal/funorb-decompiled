/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hpb extends le {
    static String field_j;
    static boolean field_i;
    static volatile long field_k;

    final int[][] a(int param0, int param1) {
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int[][] var8 = null;
        int var9 = VoidHunters.field_G;
        if (param0 != 255) {
            int[] discarded$0 = ((hpb) this).a(-39, false);
        }
        int[][] var10 = ((hpb) this).field_d.a(param1, (byte) -126);
        int[][] var3 = var10;
        if (((hpb) this).field_d.field_g) {
            var4 = var10[0];
            var5 = var10[1];
            var6 = var10[2];
            for (var7 = 0; var7 < hob.field_d; var7++) {
                this.c(-117, var7, param1);
                var8 = ((hpb) this).a((byte) 95, 0, cg.field_q);
                var4[var7] = var8[0][rab.field_n];
                var5[var7] = var8[1][rab.field_n];
                var6[var7] = var8[2][rab.field_n];
            }
        }
        return var10;
    }

    public static void d(int param0) {
        field_j = null;
    }

    final void a(int param0, int param1, ds param2) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param0 != 0) {
                break L1;
              } else {
                L2: {
                  stackOut_1_0 = this;
                  stackIn_3_0 = stackOut_1_0;
                  stackIn_2_0 = stackOut_1_0;
                  if (param2.e((byte) -97) != 1) {
                    stackOut_3_0 = this;
                    stackOut_3_1 = 0;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    break L2;
                  } else {
                    stackOut_2_0 = this;
                    stackOut_2_1 = 1;
                    stackIn_4_0 = stackOut_2_0;
                    stackIn_4_1 = stackOut_2_1;
                    break L2;
                  }
                }
                ((hpb) this).field_g = stackIn_4_1 != 0;
                break L1;
              }
            }
            L3: {
              if (param1 <= -60) {
                break L3;
              } else {
                int[][] discarded$2 = ((hpb) this).a(-4, 51);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("hpb.F(").append(param0).append(44).append(param1).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    final int[] a(int param0, boolean param1) {
        int var4 = 0;
        int[] var5 = null;
        int var6 = VoidHunters.field_G;
        int[] var7 = ((hpb) this).field_f.a((byte) -44, param0);
        int[] var3 = var7;
        if (!param1) {
            field_j = null;
        }
        if (((hpb) this).field_f.field_e) {
            for (var4 = 0; hob.field_d > var4; var4++) {
                this.c(-95, var4, param0);
                var5 = ((hpb) this).a(0, cg.field_q, 255);
                var7[var4] = var5[rab.field_n];
            }
        }
        return var3;
    }

    private final void c(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        float var6 = 0.0f;
        int var7 = 0;
        L0: {
          var7 = VoidHunters.field_G;
          var4 = grb.field_l[param1];
          if (param0 <= -54) {
            break L0;
          } else {
            int[] discarded$1 = ((hpb) this).a(-48, true);
            break L0;
          }
        }
        L1: {
          L2: {
            var5 = sj.field_p[param2];
            var6 = (float)Math.atan2((double)(var4 + -2048), (double)(var5 + -2048));
            if (-3.141592653589793 > (double)var6) {
              break L2;
            } else {
              if (-2.356194490192345 < (double)var6) {
                break L2;
              } else {
                cg.field_q = param2;
                rab.field_n = param1;
                break L1;
              }
            }
          }
          L3: {
            if (-1.5707963267948966 < (double)var6) {
              break L3;
            } else {
              if (-2.356194490192345 <= (double)var6) {
                rab.field_n = param2;
                cg.field_q = param1;
                break L1;
              } else {
                break L3;
              }
            }
          }
          L4: {
            if (-0.7853981633974483 < (double)var6) {
              break L4;
            } else {
              if (-1.5707963267948966 <= (double)var6) {
                cg.field_q = param1;
                rab.field_n = hob.field_d - param2;
                break L1;
              } else {
                break L4;
              }
            }
          }
          L5: {
            if (var6 > 0.0f) {
              break L5;
            } else {
              if ((double)var6 >= -0.7853981633974483) {
                rab.field_n = param1;
                cg.field_q = -param2 + noa.field_o;
                break L1;
              } else {
                break L5;
              }
            }
          }
          L6: {
            if (0.0f > var6) {
              break L6;
            } else {
              if ((double)var6 <= 0.7853981633974483) {
                cg.field_q = noa.field_o - param2;
                rab.field_n = -param1 + hob.field_d;
                break L1;
              } else {
                break L6;
              }
            }
          }
          L7: {
            if (0.7853981633974483 > (double)var6) {
              break L7;
            } else {
              if (1.5707963267948966 < (double)var6) {
                break L7;
              } else {
                cg.field_q = noa.field_o - param1;
                rab.field_n = hob.field_d + -param2;
                break L1;
              }
            }
          }
          L8: {
            if (1.5707963267948966 > (double)var6) {
              break L8;
            } else {
              if (2.356194490192345 >= (double)var6) {
                cg.field_q = -param1 + noa.field_o;
                rab.field_n = param2;
                break L1;
              } else {
                break L8;
              }
            }
          }
          if ((double)var6 < 2.356194490192345) {
            break L1;
          } else {
            if (3.141592653589793 < (double)var6) {
              break L1;
            } else {
              cg.field_q = param2;
              rab.field_n = hob.field_d + -param1;
              break L1;
            }
          }
        }
        cg.field_q = cg.field_q & wf.field_d;
        rab.field_n = rab.field_n & gbb.field_q;
    }

    public hpb() {
        super(1, false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Report abuse";
        field_k = 0L;
    }
}
