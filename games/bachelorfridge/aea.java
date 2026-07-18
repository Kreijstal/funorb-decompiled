/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aea extends k {
    static kv field_k;

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        float var6 = 0.0f;
        int var7 = 0;
        var7 = BachelorFridge.field_y;
        var4 = jq.field_k[param2];
        var5 = tj.field_f[param1];
        if (param0 == 1) {
          L0: {
            L1: {
              var6 = (float)Math.atan2((double)(-2048 + var4), (double)(-2048 + var5));
              if ((double)var6 < -3.141592653589793) {
                break L1;
              } else {
                if ((double)var6 <= -2.356194490192345) {
                  kk.field_s = param1;
                  kb.field_g = param2;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (-1.5707963267948966 < (double)var6) {
                break L2;
              } else {
                if (-2.356194490192345 > (double)var6) {
                  break L2;
                } else {
                  kk.field_s = param2;
                  kb.field_g = param1;
                  break L0;
                }
              }
            }
            L3: {
              if (-0.7853981633974483 < (double)var6) {
                break L3;
              } else {
                if (-1.5707963267948966 <= (double)var6) {
                  kb.field_g = -param1 + hh.field_d;
                  kk.field_s = param2;
                  break L0;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (var6 > 0.0f) {
                break L4;
              } else {
                if ((double)var6 >= -0.7853981633974483) {
                  kb.field_g = param2;
                  kk.field_s = bi.field_g + -param1;
                  break L0;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              if (0.0f > var6) {
                break L5;
              } else {
                if (0.7853981633974483 >= (double)var6) {
                  kk.field_s = bi.field_g + -param1;
                  kb.field_g = -param2 + hh.field_d;
                  break L0;
                } else {
                  break L5;
                }
              }
            }
            L6: {
              if (0.7853981633974483 > (double)var6) {
                break L6;
              } else {
                if ((double)var6 > 1.5707963267948966) {
                  break L6;
                } else {
                  kb.field_g = -param1 + hh.field_d;
                  kk.field_s = -param2 + bi.field_g;
                  break L0;
                }
              }
            }
            L7: {
              if (1.5707963267948966 > (double)var6) {
                break L7;
              } else {
                if ((double)var6 <= 2.356194490192345) {
                  kk.field_s = -param2 + bi.field_g;
                  kb.field_g = param1;
                  break L0;
                } else {
                  break L7;
                }
              }
            }
            if ((double)var6 < 2.356194490192345) {
              break L0;
            } else {
              if ((double)var6 > 3.141592653589793) {
                break L0;
              } else {
                kb.field_g = -param2 + hh.field_d;
                kk.field_s = param1;
                break L0;
              }
            }
          }
          kb.field_g = kb.field_g & wp.field_r;
          kk.field_s = kk.field_s & it.field_r;
          return;
        } else {
          return;
        }
    }

    final int[][] a(boolean param0, int param1) {
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int[][] var14 = null;
        int var9 = BachelorFridge.field_y;
        if (param0) {
            int[][] discarded$0 = ((aea) this).a(false, -63);
        }
        int[][] var13 = ((aea) this).field_h.a(param1, -858);
        int[][] var11 = var13;
        int[][] var10 = var11;
        int[][] var3 = var10;
        if (!(!((aea) this).field_h.field_b)) {
            var4 = var13[0];
            var5 = var13[1];
            var6 = var13[2];
            for (var7 = 0; var7 < hh.field_d; var7++) {
                this.a(1, param1, var7);
                var14 = ((aea) this).a((byte) -91, 0, kk.field_s);
                var4[var7] = var14[0][kb.field_g];
                var5[var7] = var14[1][kb.field_g];
                var6[var7] = var14[2][kb.field_g];
            }
        }
        return var10;
    }

    final int[] a(int param0, int param1) {
        int var4 = 0;
        int[] var5 = null;
        int var6 = BachelorFridge.field_y;
        if (param1 != 0) {
            int[][] discarded$0 = ((aea) this).a(false, 106);
        }
        int[] var7 = ((aea) this).field_j.a(param0, -1);
        int[] var3 = var7;
        if (!(!((aea) this).field_j.field_m)) {
            for (var4 = 0; hh.field_d > var4; var4++) {
                this.a(param1 ^ 1, param0, var4);
                var5 = ((aea) this).a(0, kk.field_s, (byte) 118);
                var7[var4] = var5[kb.field_g];
            }
        }
        return var3;
    }

    public static void d(int param0) {
        field_k = null;
    }

    public aea() {
        super(1, false);
    }

    final void a(byte param0, lu param1, int param2) {
        RuntimeException var4 = null;
        Object var5 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 0) {
                L2: {
                  stackOut_2_0 = this;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_3_0 = stackOut_2_0;
                  if (param1.b(param0 + 16712006) != 1) {
                    stackOut_4_0 = this;
                    stackOut_4_1 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    break L2;
                  } else {
                    stackOut_3_0 = this;
                    stackOut_3_1 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    break L2;
                  }
                }
                ((aea) this).field_f = stackIn_5_1 != 0;
                break L1;
              } else {
                break L1;
              }
            }
            L3: {
              if (param0 == -71) {
                break L3;
              } else {
                var5 = null;
                ((aea) this).a((byte) 63, (lu) null, 61);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("aea.E(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param2 + ')');
        }
    }

    static {
    }
}
