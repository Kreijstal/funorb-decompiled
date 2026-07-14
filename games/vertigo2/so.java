/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class so extends ji {
    static String field_z;
    static long field_y;
    static int field_B;

    public so() {
        super(1, false);
    }

    final static void a(cr param0, int param1, int param2, int param3, cr param4, byte[] param5, cr param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Vertigo2.field_L ? 1 : 0;
        gr.field_Z = param1;
        kr.field_c = param5;
        ao.field_N = -1L;
        ol.field_A = param5.length;
        gd.field_j = null;
        qc.field_w = new byte[(gr.field_Z + 7) / 8];
        qn.field_q = false;
        sj.field_d = null;
        var10 = 0;
        var11 = 0;
        L0: while (true) {
          if (kr.field_c.length <= var11) {
            if (param8 > 34) {
              L1: {
                var10 = (var10 - -7) / 8;
                dj.field_a = new byte[var10];
                if (null == param6.field_M) {
                  param6.field_M = new nj();
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                mk.field_J = param6.field_M;
                mk.field_J.c(0);
                kd.field_l = new fi(param7);
                br.field_Q = 0;
                rp.field_a = -1;
                kk.field_j = 0;
                qn.field_w = -1;
                if (param4.field_M != null) {
                  break L2;
                } else {
                  param4.field_M = new nj();
                  break L2;
                }
              }
              nr.field_p = param4.field_M;
              nr.field_p.c(0);
              lh.field_b = new fi(param3);
              if (null == param0.field_M) {
                param0.field_M = new nj();
                kq.field_Rb = param0.field_M;
                kq.field_Rb.c(0);
                ck.field_I = new fi(param9);
                lp.field_D = param2;
                r.field_h = 0L;
                return;
              } else {
                kq.field_Rb = param0.field_M;
                kq.field_Rb.c(0);
                ck.field_I = new fi(param9);
                lp.field_D = param2;
                r.field_h = 0L;
                return;
              }
            } else {
              L3: {
                field_z = null;
                var10 = (var10 - -7) / 8;
                dj.field_a = new byte[var10];
                if (null == param6.field_M) {
                  param6.field_M = new nj();
                  break L3;
                } else {
                  break L3;
                }
              }
              mk.field_J = param6.field_M;
              mk.field_J.c(0);
              kd.field_l = new fi(param7);
              br.field_Q = 0;
              rp.field_a = -1;
              kk.field_j = 0;
              qn.field_w = -1;
              if (param4.field_M == null) {
                param4.field_M = new nj();
                nr.field_p = param4.field_M;
                nr.field_p.c(0);
                lh.field_b = new fi(param3);
                if (null != param0.field_M) {
                  kq.field_Rb = param0.field_M;
                  kq.field_Rb.c(0);
                  ck.field_I = new fi(param9);
                  lp.field_D = param2;
                  r.field_h = 0L;
                  return;
                } else {
                  param0.field_M = new nj();
                  kq.field_Rb = param0.field_M;
                  kq.field_Rb.c(0);
                  ck.field_I = new fi(param9);
                  lp.field_D = param2;
                  r.field_h = 0L;
                  return;
                }
              } else {
                nr.field_p = param4.field_M;
                nr.field_p.c(0);
                lh.field_b = new fi(param3);
                if (null == param0.field_M) {
                  param0.field_M = new nj();
                  kq.field_Rb = param0.field_M;
                  kq.field_Rb.c(0);
                  ck.field_I = new fi(param9);
                  lp.field_D = param2;
                  r.field_h = 0L;
                  return;
                } else {
                  kq.field_Rb = param0.field_M;
                  kq.field_Rb.c(0);
                  ck.field_I = new fi(param9);
                  lp.field_D = param2;
                  r.field_h = 0L;
                  return;
                }
              }
            }
          } else {
            var10 = var10 + (255 & kr.field_c[var11]);
            var11++;
            continue L0;
          }
        }
    }

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        var7 = ((so) this).field_x.a(param0, (byte) -113);
        var3 = var7;
        if (((so) this).field_x.field_i) {
          var4 = ((so) this).a(0, -1, param0);
          var5 = 0;
          L0: while (true) {
            if (we.field_M <= var5) {
              if (param1 < 91) {
                return null;
              } else {
                return var3;
              }
            } else {
              var7[var5] = -var4[var5] + 4096;
              var5++;
              continue L0;
            }
          }
        } else {
          if (param1 < 91) {
            return null;
          } else {
            return var3;
          }
        }
    }

    public static void g(int param0) {
        if (param0 != -13533) {
            field_y = 22L;
            field_z = null;
            return;
        }
        field_z = null;
    }

    final void a(byte param0, int param1, ed param2) {
        Object var5 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        L0: {
          if (0 == param1) {
            L1: {
              stackOut_2_0 = this;
              stackIn_4_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if ((param2.h(param0 ^ -101) ^ -1) != -2) {
                stackOut_4_0 = this;
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L1;
              } else {
                stackOut_3_0 = this;
                stackOut_3_1 = 1;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                break L1;
              }
            }
            ((so) this).field_o = stackIn_5_1 != 0;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 110) {
          var5 = null;
          so.a((cr) null, 27, 57, 9, (cr) null, (byte[]) null, (cr) null, 16, -49, -71);
          return;
        } else {
          return;
        }
    }

    final int[][] b(int param0, int param1) {
        int[][] var3 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int[][] var13 = null;
        int[][] var15 = null;
        int[][] var20 = null;
        int[][] var25 = null;
        int[][] var29 = null;
        int[][] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        var12 = Vertigo2.field_L ? 1 : 0;
        var30 = ((so) this).field_v.a(param1, -2);
        var25 = var30;
        var20 = var25;
        var15 = var20;
        var13 = var15;
        var3 = var13;
        if (((so) this).field_v.field_c) {
          var29 = ((so) this).c(0, 3, param1);
          var31 = var29[0];
          var32 = var29[1];
          var33 = var29[2];
          var8 = var30[0];
          var9 = var30[1];
          var10 = var30[2];
          var11 = 0;
          L0: while (true) {
            if (we.field_M > var11) {
              var8[var11] = -var31[var11] + 4096;
              var9[var11] = -var32[var11] + 4096;
              var10[var11] = 4096 + -var33[var11];
              var11++;
              continue L0;
            } else {
              if (param0 != -3780) {
                field_y = 66L;
                return var3;
              } else {
                return var3;
              }
            }
          }
        } else {
          if (param0 != -3780) {
            field_y = 66L;
            return var3;
          } else {
            return var3;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Play free version";
        field_B = 0;
    }
}
