/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class oo {
    static int[] field_w;
    static int field_I;
    cg field_n;
    int field_F;
    int field_q;
    static int field_k;
    int field_u;
    int field_G;
    String field_l;
    double field_p;
    boolean field_h;
    private nb field_r;
    int field_d;
    private p[] field_y;
    private int[][] field_a;
    int field_v;
    jk field_A;
    int field_m;
    double field_j;
    float field_z;
    int field_e;
    int field_x;
    int field_C;
    private eg[][] field_f;
    static String field_c;
    cg field_i;
    static dd field_D;
    double field_E;
    private int[][] field_g;
    int field_H;
    cg field_b;
    private p[][] field_o;
    dd field_B;
    private int field_t;
    private eg field_s;

    void d(boolean param0) {
        if (!param0) {
            oo.l(-87);
        }
        ((oo) this).field_s = null;
        ((oo) this).field_g = null;
        ((oo) this).field_a = null;
        ((oo) this).field_o = null;
        ((oo) this).field_f = null;
        ((oo) this).field_y = null;
    }

    void d(int param0) {
        if (param0 != 16) {
            ((oo) this).b(3, 108);
        }
    }

    final fa b(int[] param0, eg param1, int param2) {
        RuntimeException var4 = null;
        Object var5 = null;
        fa stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        fa stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == -25431) {
                break L1;
              } else {
                var5 = null;
                ((oo) this).a(-49, (di) null);
                break L1;
              }
            }
            stackOut_2_0 = param1.a(((oo) this).field_d, ((oo) this).field_t, ((oo) this).field_q, ((oo) this).field_e, ((oo) this).field_u, param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("oo.FC(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    void a(byte param0, int[] param1) {
        try {
            int var3_int = -56 % ((-64 - param0) / 52);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "oo.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final int e(int param0) {
        return ((oo) this).h(684);
    }

    final void a(int[] param0, int param1, int param2, int[] param3) {
        ma.a(2, param3, param0);
        if (param2 > -74) {
            return;
        }
        try {
            ((oo) this).a(param1, mn.field_g, (byte) -118, br.field_I);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "oo.NB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(dl param0, int param1, uf param2, int param3) {
        RuntimeException var5 = null;
        long var6 = 0L;
        long var8 = 0L;
        long var10 = 0L;
        int var12 = 0;
        pq var13 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            var13 = param2.field_I.field_l[param3];
            var6 = (long)(-param0.field_g + var13.field_g);
            var8 = (long)(var13.field_k - param0.field_f);
            var10 = bm.a(-126, od.a(var6, var6, false) - -od.a(var8, var8, false));
            var13.b(true);
            if (var13.field_j <= 4194304) {
              L1: {
                if (var13.field_j < 0) {
                  var12 = 1179648 + -rf.a(4194304 + -(var13.field_j * var13.field_j >> 16), -125);
                  break L1;
                } else {
                  var12 = 655360;
                  break L1;
                }
              }
              L2: {
                if (var10 <= (long)var12) {
                  break L2;
                } else {
                  var8 = (long)var12 * var8 / var10;
                  var6 = var6 * (long)var12 / var10;
                  break L2;
                }
              }
              L3: {
                var13.field_k = (int)var8 + param0.field_f;
                var13.field_p = true;
                var13.field_I = var13.field_I * 63 >> 6;
                var13.field_g = (int)var6 + param0.field_g;
                var13.field_t = 63 * var13.field_t >> 6;
                if (var13.field_j > 2359296) {
                  var13.field_j = 2359296;
                  break L3;
                } else {
                  break L3;
                }
              }
              var13.field_n = 15 * var13.field_n / 16;
              var13.field_b = 15 * var13.field_b / 16;
              var13.field_K = 15 * var13.field_K / 16;
              var13.field_e = var13.field_e + 131072;
              break L0;
            } else {
              param2.a(0, param3);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5;
            stackOut_13_1 = new StringBuilder().append("oo.FB(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(24657).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param3 + ')');
        }
    }

    void b(boolean param0) {
        if (param0) {
            ((oo) this).field_g = null;
        }
        ((oo) this).a(10, 256, (byte) 62, 128);
    }

    private final void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        int var16 = 0;
        int var17 = 0;
        eg var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var7 = -param0 + param3;
        var7 = var7 * var7;
        int var8 = -param2 + param1;
        var8 = var8 * var8;
        double var9 = Math.sqrt((double)(var8 + (var7 + 256)));
        int var11 = (int)Math.ceil(var9 / (double)nc.field_Y.length);
        eg[] var12 = new eg[var11];
        p[] var13 = new p[var11];
        int var14 = param3 + -param0;
        int var15 = -param2 + param1;
        for (var16 = 0; var12.length > var16; var16++) {
            var17 = 1 + var16;
            var18 = new eg(4, 4, 1);
            var19 = var14 * var16 / var11 + param0;
            var20 = var17 * var14 / var11 + param0;
            var21 = param2 + var16 * var15 / var11;
            var22 = param2 - -(var17 * var15 / var11);
            var23 = (var20 + var19) / 2;
            var24 = (var22 + var21) / 2;
            var25 = var18.a(var19 + -var23, var21 - var24, 0);
            var26 = var18.a(-var23 + var20, -var24 + var22, 0);
            var27 = var18.a(var19 - var23, var21 + -var24, sb.a(-16.0f, true));
            var28 = var18.a(var20 - var23, var22 - var24, sb.a(-16.0f, true));
            int discarded$0 = var18.a(var25, var27, var26, (byte) 1, hh.a((byte) -123, this.e(31761)), this.c(99));
            int discarded$1 = var18.a(var28, var26, var27, (byte) 1, hh.a((byte) 94, this.e(31761)), this.c(97));
            int discarded$2 = var18.a(var25, var26, var27, (byte) 1, hh.a((byte) 93, this.e(31761)), this.c(100));
            int discarded$3 = var18.a(var28, var27, var26, (byte) 1, hh.a((byte) 42, this.e(31761)), this.c(95));
            var12[var16] = var18;
            var13[var16] = new p((nc) (Object) var12[var16].a(((oo) this).field_C, ((oo) this).field_x, ((oo) this).field_q, ((oo) this).field_e, ((oo) this).field_u), new int[3]);
        }
        ((oo) this).field_f[param5] = var12;
        ((oo) this).field_o[param5] = var13;
    }

    private final void k(int param0) {
        hh.field_c = true;
        id.field_c.field_g = true;
        if (null != ba.field_ub) {
            ba.field_ub.K(0);
        }
        if (null != am.field_e) {
            am.field_e.K(0);
        }
    }

    final void a(int[] param0, pq param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var46 = 0;
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        int var57 = 0;
        int var58 = 0;
        int var59 = 0;
        int var60 = 0;
        if (param1.field_j <= -524288) {
          L0: {
            if (dq.field_a.field_g) {
              var3 = ((oo) this).field_q + (param1.field_g >> 13);
              var4 = ((oo) this).field_e + (param1.field_k >> 13);
              var5 = ((oo) this).field_u + (param1.field_j >> 13);
              break L0;
            } else {
              var3 = ((oo) this).field_q + 2304;
              var4 = ((oo) this).field_e + 1152;
              var5 = ((oo) this).field_u;
              break L0;
            }
          }
          L1: {
            var6 = (param1.field_g >> 13) - var3;
            var7 = (param1.field_k >> 13) - var4;
            var8 = (param1.field_j >> 13) - var5;
            var9 = var7;
            var10 = -var6;
            var11 = var9 * var9 + var10 * var10;
            if (var11 <= 0) {
              break L1;
            } else {
              var11 = rf.a(var11, -121) >> 8;
              var9 = (var9 << 8) / var11;
              var10 = (var10 << 8) / var11;
              break L1;
            }
          }
          L2: {
            var11 = -var8 * var10 >> 8;
            var12 = var8 * var9 >> 8;
            var13 = var6 * var10 - var7 * var9 >> 8;
            var14 = var11 * var11 + var12 * var12 + var13 * var13;
            if (var14 <= 0) {
              break L2;
            } else {
              var14 = rf.a(var14, -125) >> 8;
              var11 = (var11 << 8) / var14;
              var12 = (var12 << 8) / var14;
              var13 = (var13 << 8) / var14;
              break L2;
            }
          }
          var14 = (param1.field_g >> 8) + 8 * var9;
          var15 = (param1.field_k >> 8) + 8 * var10;
          var16 = (param1.field_g >> 8) - 8 * var9;
          var17 = (param1.field_k >> 8) - 8 * var10;
          var18 = (param1.field_g >> 8) + 8 * var11;
          var19 = (param1.field_k >> 8) + 8 * var12;
          var20 = (param1.field_j >> 8) + 8 * var13;
          var21 = (param1.field_g >> 8) - 8 * var11;
          var22 = (param1.field_k >> 8) - 8 * var12;
          var23 = (param1.field_j >> 8) - 8 * var13;
          var24 = -2048 - (var5 << 5);
          if (var24 != 0) {
            var14 = var14 + (param1.field_j >> 8) * -(var14 - (var3 << 5)) / var24;
            var15 = var15 + (param1.field_j >> 8) * -(var15 - (var4 << 5)) / var24;
            var24 = -2048 - (var5 << 5);
            if (var24 != 0) {
              var16 = var16 + (param1.field_j >> 8) * -(var16 - (var3 << 5)) / var24;
              var17 = var17 + (param1.field_j >> 8) * -(var17 - (var4 << 5)) / var24;
              var24 = var23 - (var5 << 5);
              if (var24 != 0) {
                var21 = var21 + var23 * -(var21 - (var3 << 5)) / var24;
                var22 = var22 + var23 * -(var22 - (var4 << 5)) / var24;
                var24 = var20 - (var5 << 5);
                if (var24 != 0) {
                  L3: {
                    var18 = var18 + var20 * -(var18 - (var3 << 5)) / var24;
                    var19 = var19 + var20 * -(var19 - (var4 << 5)) / var24;
                    var24 = -param0[2];
                    var25 = 0;
                    var14 = (var14 >> 5) - param0[0];
                    var15 = (var15 >> 5) - param0[1];
                    var26 = param0[3] * var14 + param0[4] * var15 + param0[5] * var24 >> 3;
                    var27 = param0[6] * var14 + param0[7] * var15 + param0[8] * var24 >> 3;
                    var28 = param0[9] * var14 + param0[10] * var15 + param0[11] * var24 >> 16;
                    if (var28 != 0) {
                      break L3;
                    } else {
                      var28 = 1;
                      break L3;
                    }
                  }
                  L4: {
                    if (var28 >= 0) {
                      break L4;
                    } else {
                      var25++;
                      break L4;
                    }
                  }
                  L5: {
                    var14 = 5120 + var26 / var28;
                    var15 = 3840 + var27 / var28;
                    var16 = (var16 >> 5) - param0[0];
                    var17 = (var17 >> 5) - param0[1];
                    var26 = param0[3] * var16 + param0[4] * var17 + param0[5] * var24 >> 3;
                    var27 = param0[6] * var16 + param0[7] * var17 + param0[8] * var24 >> 3;
                    var28 = param0[9] * var16 + param0[10] * var17 + param0[11] * var24 >> 16;
                    if (var28 != 0) {
                      break L5;
                    } else {
                      var28 = 1;
                      break L5;
                    }
                  }
                  L6: {
                    if (var28 >= 0) {
                      break L6;
                    } else {
                      var25++;
                      break L6;
                    }
                  }
                  L7: {
                    var16 = 5120 + var26 / var28;
                    var17 = 3840 + var27 / var28;
                    var21 = (var21 >> 5) - param0[0];
                    var22 = (var22 >> 5) - param0[1];
                    var26 = param0[3] * var21 + param0[4] * var22 + param0[5] * var24 >> 3;
                    var27 = param0[6] * var21 + param0[7] * var22 + param0[8] * var24 >> 3;
                    var28 = param0[9] * var21 + param0[10] * var22 + param0[11] * var24 >> 16;
                    if (var28 != 0) {
                      break L7;
                    } else {
                      var28 = 1;
                      break L7;
                    }
                  }
                  L8: {
                    if (var28 >= 0) {
                      break L8;
                    } else {
                      var25++;
                      break L8;
                    }
                  }
                  L9: {
                    var21 = 5120 + var26 / var28;
                    var22 = 3840 + var27 / var28;
                    var18 = (var18 >> 5) - param0[0];
                    var19 = (var19 >> 5) - param0[1];
                    var26 = param0[3] * var18 + param0[4] * var19 + param0[5] * var24 >> 3;
                    var27 = param0[6] * var18 + param0[7] * var19 + param0[8] * var24 >> 3;
                    var28 = param0[9] * var18 + param0[10] * var19 + param0[11] * var24 >> 16;
                    if (var28 != 0) {
                      break L9;
                    } else {
                      var28 = 1;
                      break L9;
                    }
                  }
                  L10: {
                    if (var28 >= 0) {
                      break L10;
                    } else {
                      var25++;
                      break L10;
                    }
                  }
                  var18 = 5120 + var26 / var28;
                  var19 = 3840 + var27 / var28;
                  if (var25 <= 1) {
                    L11: {
                      if (var18 >> 4 >= qh.field_b) {
                        break L11;
                      } else {
                        if (var21 >> 4 >= qh.field_b) {
                          break L11;
                        } else {
                          if (var16 >> 4 >= qh.field_b) {
                            break L11;
                          } else {
                            if (var14 >> 4 >= qh.field_b) {
                              break L11;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                    }
                    L12: {
                      if (var19 >> 4 >= qh.field_c) {
                        break L12;
                      } else {
                        if (var22 >> 4 >= qh.field_c) {
                          break L12;
                        } else {
                          if (var17 >> 4 >= qh.field_c) {
                            break L12;
                          } else {
                            if (var15 >> 4 >= qh.field_c) {
                              break L12;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                    }
                    L13: {
                      if (var18 >> 4 < qh.field_j) {
                        break L13;
                      } else {
                        if (var21 >> 4 < qh.field_j) {
                          break L13;
                        } else {
                          if (var16 >> 4 < qh.field_j) {
                            break L13;
                          } else {
                            if (var14 >> 4 < qh.field_j) {
                              break L13;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                    }
                    L14: {
                      if (var19 >> 4 < qh.field_g) {
                        break L14;
                      } else {
                        if (var22 >> 4 < qh.field_g) {
                          break L14;
                        } else {
                          if (var17 >> 4 < qh.field_g) {
                            break L14;
                          } else {
                            if (var15 >> 4 < qh.field_g) {
                              break L14;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                    }
                    L15: {
                      L16: {
                        L17: {
                          if (var18 > 16384) {
                            break L17;
                          } else {
                            if (var18 >= -16384) {
                              break L16;
                            } else {
                              break L17;
                            }
                          }
                        }
                        L18: {
                          if (var21 > 16384) {
                            break L18;
                          } else {
                            if (var21 >= -16384) {
                              break L16;
                            } else {
                              break L18;
                            }
                          }
                        }
                        L19: {
                          if (var14 > 16384) {
                            break L19;
                          } else {
                            if (var14 >= -16384) {
                              break L16;
                            } else {
                              break L19;
                            }
                          }
                        }
                        if (var16 > 16384) {
                          return;
                        } else {
                          if (var16 < -16384) {
                            break L15;
                          } else {
                            break L16;
                          }
                        }
                      }
                      L20: {
                        L21: {
                          if (var19 > 16384) {
                            break L21;
                          } else {
                            if (var19 >= -16384) {
                              break L20;
                            } else {
                              break L21;
                            }
                          }
                        }
                        L22: {
                          if (var22 > 16384) {
                            break L22;
                          } else {
                            if (var22 >= -16384) {
                              break L20;
                            } else {
                              break L22;
                            }
                          }
                        }
                        L23: {
                          if (var15 > 16384) {
                            break L23;
                          } else {
                            if (var15 >= -16384) {
                              break L20;
                            } else {
                              break L23;
                            }
                          }
                        }
                        if (var17 > 16384) {
                          break L15;
                        } else {
                          if (var17 >= -16384) {
                            break L20;
                          } else {
                            break L15;
                          }
                        }
                      }
                      var26 = var18 + var21 + var16 + var14 >> 2;
                      var27 = var19 + var22 + var17 + var15 >> 2;
                      var28 = var14 - var16;
                      var29 = var15 - var17;
                      var30 = var18 - var21;
                      var31 = var19 - var22;
                      var32 = var29;
                      var33 = -var28;
                      var34 = var31;
                      var35 = -var30;
                      var36 = var30 * var30 + var31 * var31;
                      var37 = ke.a(false, var36) << 2;
                      var38 = var28 * var28 + var29 * var29;
                      if (var38 != 0) {
                        L24: {
                          var39 = ke.a(false, var38) << 2;
                          var32 = (var32 << 12) / var39;
                          var33 = (var33 << 12) / var39;
                          var34 = (var34 << 12) / var37;
                          var35 = (var35 << 12) / var37;
                          var40 = var30 * var32 + var31 * var33;
                          var41 = var28 * var34 + var29 * var35;
                          var42 = var26 >> 4;
                          var43 = var26 >> 4;
                          var44 = var27 >> 4;
                          var45 = var27 >> 4;
                          var46 = var18 + var28 / 2 >> 4;
                          if (var46 >= var42) {
                            if (var46 <= var43) {
                              break L24;
                            } else {
                              var43 = var46;
                              break L24;
                            }
                          } else {
                            var42 = var46;
                            break L24;
                          }
                        }
                        L25: {
                          var47 = var19 + var29 / 2 >> 4;
                          if (var47 >= var44) {
                            if (var47 <= var45) {
                              break L25;
                            } else {
                              var45 = var47;
                              break L25;
                            }
                          } else {
                            var44 = var47;
                            break L25;
                          }
                        }
                        L26: {
                          var46 = var18 - var28 / 2 >> 4;
                          if (var46 >= var42) {
                            if (var46 <= var43) {
                              break L26;
                            } else {
                              var43 = var46;
                              break L26;
                            }
                          } else {
                            var42 = var46;
                            break L26;
                          }
                        }
                        L27: {
                          var47 = var19 - var29 / 2 >> 4;
                          if (var47 >= var44) {
                            if (var47 <= var45) {
                              break L27;
                            } else {
                              var45 = var47;
                              break L27;
                            }
                          } else {
                            var44 = var47;
                            break L27;
                          }
                        }
                        L28: {
                          var46 = var21 + var28 / 2 >> 4;
                          if (var46 >= var42) {
                            if (var46 <= var43) {
                              break L28;
                            } else {
                              var43 = var46;
                              break L28;
                            }
                          } else {
                            var42 = var46;
                            break L28;
                          }
                        }
                        L29: {
                          var47 = var22 + var29 / 2 >> 4;
                          if (var47 >= var44) {
                            if (var47 <= var45) {
                              break L29;
                            } else {
                              var45 = var47;
                              break L29;
                            }
                          } else {
                            var44 = var47;
                            break L29;
                          }
                        }
                        L30: {
                          var46 = var21 - var28 / 2 >> 4;
                          if (var46 >= var42) {
                            if (var46 <= var43) {
                              break L30;
                            } else {
                              var43 = var46;
                              break L30;
                            }
                          } else {
                            var42 = var46;
                            break L30;
                          }
                        }
                        L31: {
                          var47 = var22 - var29 / 2 >> 4;
                          if (var47 >= var44) {
                            if (var47 <= var45) {
                              break L31;
                            } else {
                              var45 = var47;
                              break L31;
                            }
                          } else {
                            var44 = var47;
                            break L31;
                          }
                        }
                        L32: {
                          if (var42 >= qh.field_b) {
                            break L32;
                          } else {
                            var42 = qh.field_b;
                            break L32;
                          }
                        }
                        L33: {
                          if (var43 <= qh.field_j) {
                            break L33;
                          } else {
                            var43 = qh.field_j;
                            break L33;
                          }
                        }
                        L34: {
                          if (var44 >= qh.field_c) {
                            break L34;
                          } else {
                            var44 = qh.field_c;
                            break L34;
                          }
                        }
                        L35: {
                          if (var45 <= qh.field_g) {
                            break L35;
                          } else {
                            var45 = qh.field_g;
                            break L35;
                          }
                        }
                        var46 = var44;
                        L36: while (true) {
                          if (var46 >= var45) {
                            return;
                          } else {
                            var47 = (var46 << 4) - var22;
                            var48 = (var46 << 4) - var17;
                            var49 = var47 * var33;
                            var50 = var48 * var35;
                            var51 = var46 * 640;
                            var52 = var42;
                            L37: while (true) {
                              if (var52 >= var43) {
                                var46++;
                                continue L36;
                              } else {
                                var53 = (var52 << 4) - var21;
                                var54 = (var52 << 4) - var16;
                                var55 = (var53 * var32 + var49 << 8) / var40 - 128;
                                var56 = (var54 * var34 + var50 << 8) / var41 - 128;
                                var57 = var55 * var55 + var56 * var56;
                                if (var57 < 16384) {
                                  L38: {
                                    if (var55 >= 0) {
                                      break L38;
                                    } else {
                                      var55 = var55 >> 1;
                                      var57 = var55 * var55 + var56 * var56;
                                      break L38;
                                    }
                                  }
                                  L39: {
                                    var58 = (((oo) this).field_C << 1) + (var57 * ((oo) this).field_x >> 13);
                                    if (var58 >= 0) {
                                      break L39;
                                    } else {
                                      var58 = 0;
                                      break L39;
                                    }
                                  }
                                  if (var58 < 256) {
                                    var59 = qh.field_d[var51 + var52];
                                    var60 = (var59 & 65280) * var58 >> 8 & 65280;
                                    var59 = (var59 & 16711935) * var58 >> 8 & 16711935;
                                    qh.field_d[var51 + var52] = var59 | var60;
                                    var52++;
                                    continue L37;
                                  } else {
                                    var52++;
                                    continue L37;
                                  }
                                } else {
                                  var52++;
                                  continue L37;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        return;
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final fa a(int[] param0, byte param1, eg param2) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        fa stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        fa stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
            if (param1 == 103) {
              stackOut_3_0 = param2.a(((oo) this).field_d, ((oo) this).field_t, -param0[0] + (2304 + ((oo) this).field_q), 1152 + (((oo) this).field_e + -param0[1]), ((oo) this).field_u - param0[2], param0);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (fa) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("oo.DC(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');
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
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_4_0;
    }

    final void a(int param0, cf param1, di param2) {
        RuntimeException var4 = null;
        Object var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
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
              if (param0 == 3) {
                break L1;
              } else {
                var5 = null;
                ((oo) this).a(-23, -100, (byte) -87, (jg[]) null, (kf[]) null);
                break L1;
              }
            }
            L2: {
              if (((oo) this).field_b != null) {
                boolean discarded$2 = tl.field_N.a(param1, param2, ((oo) this).field_b, param0 ^ 79, 0);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("oo.VB(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
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
          throw wm.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    public static void l(int param0) {
        if (param0 != -15631) {
            return;
        }
        field_c = null;
        field_w = null;
        field_D = null;
    }

    void a(int param0, di param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                byte discarded$2 = ((oo) this).g(67);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("oo.Q(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    private final byte c(int param0) {
        if (param0 <= 94) {
            return (byte) -18;
        }
        return ((oo) this).g(-112);
    }

    final String c(byte param0) {
        if (param0 != 32) {
            Object var3 = null;
            ((oo) this).a(-106, (int[]) null, 4, (int[]) null, 62);
        }
        return "lighting amb=" + ((oo) this).field_d + ", cont=" + ((oo) this).field_m;
    }

    final fa a(int[] param0, eg param1, int param2) {
        RuntimeException var4 = null;
        Object var5 = null;
        fa stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        fa stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param2 <= -52) {
                break L1;
              } else {
                var5 = null;
                ((oo) this).a(true, (int[]) null, (pq[]) null);
                break L1;
              }
            }
            stackOut_2_0 = param1.a(((oo) this).field_C, ((oo) this).field_F, ((oo) this).field_q, ((oo) this).field_e, ((oo) this).field_u, param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("oo.RB(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    void i(int param0) {
        if (param0 != 25879) {
            ((oo) this).field_G = -36;
        }
    }

    void c(boolean param0) {
        if (!param0) {
            ((oo) this).field_z = -0.5056021213531494f;
        }
    }

    final boolean a(int param0) {
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var2 = 31 % ((-8 - param0) / 41);
            if (null == ((oo) this).field_r) {
              break L1;
            } else {
              if (((oo) this).field_r.i()) {
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_4_0 != 0;
    }

    private final void a(dl[] param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        nc var3_ref = null;
        double var4_double = 0.0;
        int var4 = 0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        nc var12 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            d.field_b = new eg(17, 16, 1);
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= 16) {
                var12 = (nc) (Object) ((oo) this).a(-113, d.field_b);
                var3_ref = var12;
                v.field_g = new p[param0.length];
                if (param1 < -16) {
                  var4 = 0;
                  L2: while (true) {
                    if (v.field_g.length <= var4) {
                      break L0;
                    } else {
                      v.field_g[var4] = new p(var12, new int[3]);
                      var4++;
                      continue L2;
                    }
                  }
                } else {
                  return;
                }
              } else {
                var4_double = Math.sin(2.0 * (3.141592653589793 * (double)var3_int) / 16.0);
                var6 = Math.cos(3.141592653589793 * (double)var3_int * 2.0 / 16.0);
                var8 = Math.sin(2.0 * (3.141592653589793 * (double)(var3_int + 1)) / 16.0);
                var10 = Math.cos(3.141592653589793 * (double)(var3_int - -1) * 2.0 / 16.0);
                int discarded$1 = d.field_b.a(d.field_b.a(0, 0, 0), d.field_b.a(cr.a(4885, 18.0 * var10), cr.a(4885, var8 * 18.0), 0), d.field_b.a(cr.a(4885, 18.0 * var6), cr.a(4885, 18.0 * var4_double), 0), (byte) 1, (short) 127, (byte) 127);
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("oo.CB(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
    }

    private final void a(byte param0, bf[] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            ((oo) this).field_f = new eg[param1.length][];
            ((oo) this).field_o = new p[param1.length][];
            if (param0 == -92) {
              var3_int = 0;
              L1: while (true) {
                if (var3_int >= ((oo) this).field_f.length) {
                  break L0;
                } else {
                  this.a(param1[var3_int].field_a >> 13, param1[var3_int].field_l >> 13, param1[var3_int].field_j >> 13, param1[var3_int].field_f >> 13, (byte) -57, var3_int);
                  var3_int++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("oo.GC(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    void a(di param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -43) {
                break L1;
              } else {
                ((oo) this).field_e = 4;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("oo.KA(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    void a(cf param0, int param1) {
        try {
            int var3_int = 55 % ((39 - param1) / 38);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "oo.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    byte g(int param0) {
        int var2 = -110 / ((param0 - 9) / 63);
        return (byte) 0;
    }

    final void a(int param0, int param1) {
        if (param0 < 52) {
            return;
        }
        ((oo) this).a((byte) 120);
        ap.field_D = new kf[param1];
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = Pool.field_O;
        if (param0 >= 87) {
          L0: {
            if (ap.field_D == null) {
              break L0;
            } else {
              var2 = 0;
              L1: while (true) {
                if (var2 >= ap.field_D.length) {
                  break L0;
                } else {
                  if (null != ap.field_D[var2]) {
                    if (!ap.field_D[var2].field_o.i()) {
                      ap.field_D[var2].field_o.c(441);
                      var2++;
                      continue L1;
                    } else {
                      var2++;
                      continue L1;
                    }
                  } else {
                    var2++;
                    continue L1;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, byte param2, jg[] param3, kf[] param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var10 = Pool.field_O;
        try {
          L0: {
            var6_int = 6114 * param0 >> 7;
            var7 = 0;
            L1: while (true) {
              if (var7 >= 2) {
                var7 = -14 % ((-11 - param2) / 44);
                break L0;
              } else {
                L2: {
                  L3: {
                    if (null == param4[var7]) {
                      break L3;
                    } else {
                      if (param4[var7].field_o.i()) {
                        break L3;
                      } else {
                        L4: {
                          var8 = param4[var7].field_n;
                          var9 = -32;
                          if (var8 > var6_int) {
                            var9 = var6_int - var8;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        param4[var7].a(var9 + ga.a(64, true, ea.field_r) + var8, 441, 128);
                        break L2;
                      }
                    }
                  }
                  if (param4[var7] == null) {
                    if (ga.a(param1, true, ea.field_r) == 0) {
                      param4[var7] = mn.a(-24296, nb.c(param3[ga.a(param3.length, true, ea.field_r)], 100, var6_int, 8192 * var7 + 4096));
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    L5: {
                      if (!param4[var7].field_o.i()) {
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var7++;
                    continue L1;
                  }
                }
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var6;
            stackOut_19_1 = new StringBuilder().append("oo.GB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          L7: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param4 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
        }
    }

    void a(al param0, int param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              this.f(2);
              this.a(param0.field_w, -33);
              this.a((byte) -92, param0.field_c);
              this.a(param0.field_c, 16);
              this.k(0);
              if (param1 != 21894) {
                var4 = null;
                this.a((byte) 111, (bf[]) null);
                ((oo) this).b(120);
                break L1;
              } else {
                ((oo) this).b(120);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("oo.B(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
    }

    final fa a(int param0, eg param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        fa stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        fa stackOut_0_0 = null;
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
            var3_int = -19 / ((param0 - 57) / 45);
            stackOut_0_0 = param1.a(((oo) this).field_C, ((oo) this).field_F, ((oo) this).field_q, ((oo) this).field_e, ((oo) this).field_u);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("oo.BC(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
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
          throw wm.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    abstract void a(byte param0, uf param1);

    void j(int param0) {
        if (param0 != 2) {
            ((oo) this).field_g = null;
        }
    }

    final void a(int param0, int[] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var4 = Pool.field_O;
        try {
          L0: {
            L1: {
              var3_int = 0;
              if (param0 > 26) {
                break L1;
              } else {
                ((oo) this).field_b = null;
                break L1;
              }
            }
            L2: while (true) {
              if (var3_int >= ((oo) this).field_y.length) {
                break L0;
              } else {
                ((oo) this).field_y[var3_int].c(6710886, param1);
                var3_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("oo.BB(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    final void a(int param0, int[] param1, int param2, int[] param3, int param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              ma.a(param0 + -1336449638, param3, param1);
              ((oo) this).a(param4, mn.field_g * param2 >> 8, (byte) -111, br.field_I);
              if (param0 == 1336449640) {
                break L1;
              } else {
                ((oo) this).field_j = 1.1224327362689441;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("oo.QB(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param4 + ')');
        }
    }

    final void a(int[] param0, byte param1, boolean param2, pq[] param3, boolean param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        pq var8 = null;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            L1: {
              if (param1 >= 63) {
                break L1;
              } else {
                ((oo) this).field_t = 44;
                break L1;
              }
            }
            var6_int = wh.field_g + (param3.length - 1);
            L2: while (true) {
              if (var6_int < 0) {
                break L0;
              } else {
                var7 = pd.field_f[var6_int];
                if (var7 >= param3.length) {
                  L3: {
                    if (param4) {
                      w.field_a[var7].a(param0, -32215);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var6_int--;
                  continue L2;
                } else {
                  L4: {
                    L5: {
                      var8 = param3[var7];
                      if (var8.field_s) {
                        break L5;
                      } else {
                        if (var8.field_j < 0) {
                          break L5;
                        } else {
                          stackOut_7_0 = 1;
                          stackIn_9_0 = stackOut_7_0;
                          break L4;
                        }
                      }
                    }
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L4;
                  }
                  L6: {
                    if (stackIn_9_0 == (param2 ? 1 : 0)) {
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  var6_int--;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var6;
            stackOut_17_1 = new StringBuilder().append("oo.LB(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L7;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L7;
            }
          }
          L8: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param4 + ')');
        }
    }

    final void a(boolean param0, int[] param1, pq[] param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = Pool.field_O;
        try {
            if (param0) {
                ((oo) this).field_C = 46;
            }
            for (var4_int = 0; var4_int < param2.length; var4_int++) {
                if (param2[var4_int].field_p) {
                    param2[var4_int].i(2);
                    dq.field_a.a(false, param2[var4_int].field_G, var4_int);
                }
                w.field_a[var4_int] = (eb) (Object) k.field_O[var4_int];
                pd.field_f[var4_int] = var4_int;
                tc.field_d[var4_int] = w.field_a[var4_int].b(param1, -111);
            }
            for (var5 = 0; var5 < wh.field_g; var5++) {
                w.field_a[var4_int] = (eb) (Object) rb.field_e[var5];
                pd.field_f[var4_int] = var4_int;
                tc.field_d[var4_int] = w.field_a[var4_int].b(param1, -114);
                var4_int++;
            }
            th.a(0, -30916, tc.field_d, pd.field_f, param2.length - (-wh.field_g + 1));
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "oo.HB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final String b(byte param0) {
        if (param0 != 123) {
            return null;
        }
        return "lighting amb=" + ((oo) this).field_C + ", cont=" + ((oo) this).field_x + ", ang=[" + (int)(((oo) this).field_j * 180.0 / 3.141592653589793) + ", " + (int)(((oo) this).field_p * 180.0 / 3.141592653589793) + "], dist=" + (int)((oo) this).field_E + " => pos=[" + ((oo) this).field_q + "," + ((oo) this).field_e + "," + ((oo) this).field_u + "], gamma=" + ((oo) this).field_z;
    }

    void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        L0: {
          var5 = -95 % ((-44 - param2) / 56);
          var6 = param0;
          if (var6 != 15) {
            if (var6 != 16) {
              if (var6 != 10) {
                L1: {
                  if (var6 != 17) {
                    if (var6 != 18) {
                      break L0;
                    } else {
                      if (null != ((oo) this).field_n) {
                        ac.a(256, false, false, ((oo) this).field_n);
                        break L1;
                      } else {
                        if (null == ((oo) this).field_i) {
                          break L1;
                        } else {
                          ac.a(256, false, false, ((oo) this).field_i);
                          break L0;
                        }
                      }
                    }
                  } else {
                    if (((oo) this).field_i == null) {
                      break L1;
                    } else {
                      ac.a(256, false, false, ((oo) this).field_i);
                      break L0;
                    }
                  }
                }
                break L0;
              } else {
                ac.a(256, true, true, ((oo) this).field_b);
                break L0;
              }
            } else {
              ((oo) this).a(3, param1, (byte) -117, param3);
              break L0;
            }
          } else {
            ((oo) this).a(2, param1, (byte) -105, param3);
            break L0;
          }
        }
    }

    void a(boolean param0) {
        if (param0) {
            Object var3 = null;
            this.a((dl[]) null, 70);
        }
    }

    void c(int param0, di param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -23569) {
                break L1;
              } else {
                oo.l(-78);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("oo.OA(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final void b(al param0, int param1) {
        int var3_int = 0;
        try {
            k.field_O = new ec[param0.field_l.length];
            w.field_a = new eb[rb.field_e.length + param0.field_l.length];
            var3_int = param1;
            for (var3_int = 0; var3_int < param0.field_l.length; var3_int++) {
                k.field_O[var3_int] = new ec(var3_int, param0);
            }
            tc.field_d = new int[w.field_a.length];
            pd.field_f = new int[w.field_a.length];
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "oo.OB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void b(int param0, int param1) {
        int var3 = -12 / ((11 - param0) / 52);
    }

    final void b(int param0) {
        L0: while (true) {
          if (((oo) this).field_j >= 0.0) {
            L1: {
              if (16.0 > ((oo) this).field_E) {
                ((oo) this).field_E = 16.0;
                break L1;
              } else {
                if (16384.0 >= ((oo) this).field_E) {
                  break L1;
                } else {
                  ((oo) this).field_E = 16384.0;
                  break L1;
                }
              }
            }
            L2: while (true) {
              if (((oo) this).field_j < 6.283185307179586) {
                L3: {
                  if (0.0 <= ((oo) this).field_p) {
                    if (1.5707963267948966 >= ((oo) this).field_p) {
                      break L3;
                    } else {
                      ((oo) this).field_p = 1.5707963267948966;
                      break L3;
                    }
                  } else {
                    ((oo) this).field_p = 0.0;
                    break L3;
                  }
                }
                ((oo) this).field_q = (int)(((oo) this).field_E * Math.cos(((oo) this).field_j) * Math.cos(((oo) this).field_p));
                if (param0 >= 109) {
                  L4: {
                    ((oo) this).field_e = (int)(((oo) this).field_E * Math.sin(((oo) this).field_j) * Math.cos(((oo) this).field_p));
                    ((oo) this).field_u = -(int)(((oo) this).field_E * Math.sin(((oo) this).field_p));
                    if (-1 > ((oo) this).field_x) {
                      break L4;
                    } else {
                      ((oo) this).field_x = 1;
                      break L4;
                    }
                  }
                  L5: {
                    ((oo) this).field_F = 132072 / (((oo) this).field_x * 3);
                    if (-1 < ((oo) this).field_m) {
                      break L5;
                    } else {
                      ((oo) this).field_m = 1;
                      break L5;
                    }
                  }
                  fb.field_p = ((oo) this).field_z;
                  ((oo) this).field_t = 132072 / (3 * ((oo) this).field_m);
                  fb.b(((oo) this).field_z);
                  return;
                } else {
                  return;
                }
              } else {
                ((oo) this).field_j = ((oo) this).field_j - 6.283185307179586;
                continue L2;
              }
            }
          } else {
            ((oo) this).field_j = ((oo) this).field_j + 6.283185307179586;
            continue L0;
          }
        }
    }

    private final void a(bf[] param0, int param1) {
        long var3_long = 0L;
        RuntimeException var3 = null;
        int[][] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        long var9_long = 0L;
        long var10 = 0L;
        long var11 = 0L;
        long var13 = 0L;
        int var15 = 0;
        int[][] var16 = null;
        int[][] var17 = null;
        int[][] var18 = null;
        int[][] var19 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            var3_long = -1L;
            var19 = new int[16][];
            var18 = var19;
            var17 = var18;
            var16 = var17;
            var5 = var16;
            var6 = 0;
            var7 = 0;
            L1: while (true) {
              if (param0.length <= var7) {
                ((oo) this).field_a = new int[var6][2];
                ((oo) this).field_g = new int[var6][2];
                var15 = 0;
                var7 = var15;
                L2: while (true) {
                  if (var15 >= ((oo) this).field_a.length) {
                    break L0;
                  } else {
                    L3: {
                      var8 = param0[var19[var15][1]].a(123) + -param0[var19[var15][0]].a(109);
                      var9 = param0[var19[var15][1]].a((byte) -127) - param0[var19[var15][0]].a((byte) -127);
                      ((oo) this).field_a[var15][0] = -var9 >> 13;
                      ((oo) this).field_a[var15][1] = var8 >> 13;
                      var10 = bm.a(-111, od.a((long)var8, (long)var8, false) - -od.a((long)var9, (long)var9, false));
                      if (var10 > 2147483647L) {
                        break L3;
                      } else {
                        if (var10 >= -2147483648L) {
                          ((oo) this).field_a[var15][0] = lh.a((int)var10, (byte) -74, (long)((oo) this).field_a[var15][0]);
                          ((oo) this).field_a[var15][1] = lh.a((int)var10, (byte) -95, (long)((oo) this).field_a[var15][1]);
                          ((oo) this).field_g[var15][0] = var19[var15][0];
                          ((oo) this).field_g[var15][1] = var19[var15][1];
                          var15++;
                          continue L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    throw new IllegalStateException("norm out of range: " + var10);
                  }
                }
              } else {
                var8 = 1 + var7;
                L4: while (true) {
                  if (param0.length <= var8) {
                    var7++;
                    continue L1;
                  } else {
                    var9_long = (long)(param0[var7].a(99) + -param0[var8].a(117));
                    var11 = (long)(param0[var7].a((byte) -127) - param0[var8].a((byte) -127));
                    var13 = od.a(var9_long, var9_long, false) + od.a(var11, var11, false);
                    if (var3_long < var13) {
                      var3_long = var13;
                      var6 = 0;
                      int incrementValue$1 = var6;
                      var6++;
                      var5[incrementValue$1] = new int[2];
                      var8++;
                      continue L4;
                    } else {
                      L5: {
                        if (~var3_long != ~var13) {
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var8++;
                      continue L4;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3;
            stackOut_18_1 = new StringBuilder().append("oo.PB(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + 16 + ')');
        }
    }

    void a(boolean param0, mm param1) {
        RuntimeException var3 = null;
        double var3_double = 0.0;
        Object var5 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (param1.field_m >= 0.0) {
                if (param1.field_m > 288.0) {
                  param1.field_m = 288.0;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                param1.field_m = 0.0;
                break L1;
              }
            }
            L2: {
              if (param1.field_f < 0.0) {
                param1.field_f = 0.0;
                break L2;
              } else {
                if (param1.field_f <= 576.0) {
                  break L2;
                } else {
                  param1.field_f = 576.0;
                  break L2;
                }
              }
            }
            L3: {
              if (!param0) {
                break L3;
              } else {
                var5 = null;
                ((oo) this).a((int[]) null, (byte) -29, true, (pq[]) null, false);
                break L3;
              }
            }
            L4: {
              var3_double = param1.d(8);
              if (var3_double > 768.0) {
                param1.field_a = 768.0 * (-param1.field_m + param1.field_a) / var3_double + param1.field_m;
                param1.field_h = (param1.field_h - param1.field_k) * 768.0 / var3_double + param1.field_k;
                param1.field_d = param1.field_f + (param1.field_d - param1.field_f) * 768.0 / var3_double;
                break L4;
              } else {
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("oo.VA(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
    }

    private final void f(int param0) {
        int var16 = 0;
        int var19 = 0;
        float var2 = (float)cr.a(4885, Math.sqrt(414720.0));
        int var3 = (int)Math.ceil((double)(var2 / (float)nc.field_Y.length));
        int var4 = (int)Math.ceil((double)(var2 / (float)nc.field_Y.length));
        ((oo) this).field_y = new p[var3 * var4];
        double var5 = 576.0 / (double)var3;
        double var7 = 288.0 / (double)var4;
        int var9 = (cr.a(4885, var5) >> 1) * 16 / 16;
        int var10 = (cr.a(4885, var7) >> 1) * 16 / 16;
        ((oo) this).field_s = new eg(4, 2, 1);
        int var11 = ((oo) this).field_s.a(-var9, -var10, 0);
        int var12 = ((oo) this).field_s.a(var9, -var10, 0);
        int var13 = ((oo) this).field_s.a(-var9, var10, 0);
        int var14 = ((oo) this).field_s.a(var9, var10, 0);
        int discarded$0 = ((oo) this).field_s.a(var11, var13, var12, (byte) 1, hh.a((byte) -105, ((oo) this).h(684)), ((oo) this).g(-56));
        int discarded$1 = ((oo) this).field_s.a(var14, var12, var13, (byte) 1, hh.a((byte) -127, ((oo) this).h(684)), ((oo) this).g(91));
        nc var15 = (nc) (Object) ((oo) this).a(103, ((oo) this).field_s);
        for (var16 = 0; var16 < var4; var16++) {
            double var17 = var7 * (double)(1 + 2 * var16) / 2.0;
            for (var19 = 0; var3 > var19; var19++) {
                double var20 = var5 * (double)(1 + var19 * 2) / 2.0;
                ((oo) this).field_y[var16 * var3 - -var19] = new p(var15, ib.a(new double[3], -30100));
            }
        }
    }

    void b(int param0, di param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 5) {
                break L1;
              } else {
                ((oo) this).field_b = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("oo.JA(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    void a(byte param0, boolean param1, int param2) {
        int var4 = 30 / ((param0 - -47) / 45);
    }

    int h(int param0) {
        if (param0 != 684) {
            ((oo) this).field_g = null;
        }
        return 6723942;
    }

    oo() {
        ((oo) this).field_q = -1024;
        ((oo) this).field_u = -10240;
        ((oo) this).field_p = 0.7853981633974483;
        ((oo) this).field_z = 1.0f;
        ((oo) this).field_G = 0;
        ((oo) this).field_x = 32;
        ((oo) this).field_F = 1031;
        ((oo) this).field_C = 96;
        ((oo) this).field_d = 96;
        ((oo) this).field_m = 32;
        ((oo) this).field_E = 1024.0;
        ((oo) this).field_H = 0;
        ((oo) this).field_h = false;
        ((oo) this).field_e = -1024;
        ((oo) this).field_j = 0.7853981633974483;
        ((oo) this).field_t = 1031;
        ((oo) this).b(115);
    }

    void a(int param0, uf param1) {
        dl[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        tc var5 = null;
        int var6 = 0;
        int var7 = 0;
        pq var8 = null;
        int var9 = 0;
        dl[] var10 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var9 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (param0 == 10) {
                break L1;
              } else {
                ((oo) this).field_f = null;
                break L1;
              }
            }
            L2: {
              if (null == ((oo) this).field_r) {
                break L2;
              } else {
                if (((oo) this).field_r.i()) {
                  ((oo) this).field_r = null;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            var10 = param1.field_I.field_w;
            var3 = var10;
            var4 = 0;
            L3: while (true) {
              if (var4 >= var10.length) {
                break L0;
              } else {
                L4: {
                  var5 = var10[var4].field_c;
                  if (var5 == null) {
                    break L4;
                  } else {
                    var6 = 0;
                    L5: while (true) {
                      if (var6 >= var5.a((byte) 127)) {
                        break L4;
                      } else {
                        var7 = var5.a(var6, 2229);
                        var8 = param1.field_I.field_l[var7];
                        if (var8.field_s) {
                          throw new IllegalStateException("Ball in play cannot be potted!");
                        } else {
                          L6: {
                            if (!var8.field_o) {
                              kh.field_gc.a(var10[var4], 24657, param1, var7);
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          var6++;
                          continue L5;
                        }
                      }
                    }
                  }
                }
                var4++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3_ref = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var3_ref;
            stackOut_21_1 = new StringBuilder().append("oo.T(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Time trial";
    }
}
