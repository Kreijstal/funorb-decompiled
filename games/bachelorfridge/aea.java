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
        if (param0 <= 87) {
            return;
        }
        field_k = null;
    }

    public aea() {
        super(1, false);
    }

    final void a(byte param0, lu param1, int param2) {
        if (!(param2 != 0)) {
            ((aea) this).field_f = (param1.b(param0 + 16712006) ^ -1) == -2 ? true : false;
        }
        if (param0 != -71) {
            Object var5 = null;
            ((aea) this).a((byte) 63, (lu) null, 61);
        }
    }

    static {
    }
}
