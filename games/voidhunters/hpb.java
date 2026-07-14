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
        if (param0 != -6200) {
            field_k = -61L;
        }
    }

    final void a(int param0, int param1, ds param2) {
        if (-1 == param0) {
            ((hpb) this).field_g = -2 == param2.e((byte) -97) ? true : false;
        }
        if (param1 > -60) {
            int[][] discarded$0 = ((hpb) this).a(-4, 51);
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
