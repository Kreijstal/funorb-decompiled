/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sh extends fh {
    static String field_s;
    static boolean field_t;

    sh(int param0) {
        this(nb.field_c, param0);
    }

    private sh(qe param0, int param1) {
        super(param0, param1);
    }

    public static void b(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != 4) {
            field_t = false;
          }
          field_s = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1), "sh.CA(" + param0 + ')');
        }
    }

    final static void a(boolean param0, boolean param1, int param2, int[] param3, lb param4, int[] param5, boolean param6) {
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_79_2 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_83_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
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
        int stackIn_60_0Lifetime1;
        int stackIn_60_1Lifetime1;
        int var21Lifetime1;
        int var21Lifetime2;
        int var22Lifetime1;
        int var22Lifetime2;
        int var23Lifetime1;
        int var23Lifetime2;
        int var24Lifetime1;
        int var25Lifetime1;
        int var26Lifetime1;
        int var27Lifetime1;
        int var28Lifetime1;
        int var29Lifetime1;
        int var24Lifetime1Lifetime1;
        int var25Lifetime1Lifetime1;
        int var26Lifetime1Lifetime1;
        var31 = StarCannon.field_A;
        try {
          var7_int = 2147483647;
          var8 = -2147483648;
          var21 = param5[3] >> 2;
          var22 = param5[4] >> 2;
          var23 = param5[5] >> 2;
          var24 = param5[6] >> 2;
          var25 = param5[7] >> 2;
          var26 = param5[8] >> 2;
          var27 = param5[9] >> 2;
          var28 = param5[10] >> 2;
          var12 = param3[3] * var21 + (param3[4] * var22 + var23 * param3[5]) >> 14;
          var29 = param5[11] >> 2;
          var13 = var26 * param3[5] + (var24 * param3[3] + var25 * param3[4]) >> 14;
          var19 = param3[10] * var25 + param3[9] * var24 + var26 * param3[11] >> 14;
          var14 = param3[5] * var29 + (var27 * param3[3] + param3[4] * var28) >> 14;
          var20 = var29 * param3[11] + var28 * param3[10] + param3[9] * var27 >> 14;
          var18 = var22 * param3[10] + (param3[9] * var21 + var23 * param3[11]) >> 14;
          var15 = param3[6] * var21 + (param3[7] * var22 + param3[8] * var23) >> 14;
          var16 = param3[8] * var26 + var25 * param3[7] + var24 * param3[6] >> 14;
          var17 = param3[8] * var29 + var27 * param3[6] + param3[7] * var28 >> 14;
          var30 = -71 / ((-53 - param2) / 35);
          var21Lifetime1 = param3[0] - param5[0];
          var22Lifetime1 = param3[1] - param5[1];
          var23Lifetime1 = param3[2] - param5[2];
          var9 = var21Lifetime1 * param5[3] + (param5[4] * var22Lifetime1 + var23Lifetime1 * param5[5]) >> 16 - fb.field_r;
          var11 = var23Lifetime1 * param5[11] + var22Lifetime1 * param5[10] + var21Lifetime1 * param5[9] >> 16;
          var10 = var23Lifetime1 * param5[8] + param5[6] * var21Lifetime1 + param5[7] * var22Lifetime1 >> -fb.field_r + 16;
          var21Lifetime2 = gl.field_e;
          var22Lifetime2 = gl.field_i;
          var23Lifetime2 = 0;
          L1: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (var23Lifetime2 < param4.field_R) {
              var24Lifetime1 = param4.field_J[var23Lifetime2];
              var25Lifetime1 = param4.field_x[var23Lifetime2];
              var26Lifetime1 = param4.field_q[var23Lifetime2];
              var27Lifetime1 = var9 + (var26Lifetime1 * var18 + var24Lifetime1 * var12 + var15 * var25Lifetime1 >> 16 - fb.field_r);
              var28Lifetime1 = (var26Lifetime1 * var19 + var24Lifetime1 * var13 + var16 * var25Lifetime1 >> 16 - fb.field_r) + var10;
              var29Lifetime1 = (var17 * var25Lifetime1 + (var24Lifetime1 * var14 + var20 * var26Lifetime1) >> 16) + var11;
              stackIn_60_0 = var29Lifetime1;
              stackIn_60_1 = 50;
              if (var31 != 0) {
                if (stackIn_60_0 < stackIn_60_1) {
                  stackIn_69_0 = var18;
                  stackIn_69_1 = rc.field_a.length;
                  break L1;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (stackIn_60_0 >= stackIn_60_1) {
                  bh.field_c[var23Lifetime2] = var27Lifetime1 / var29Lifetime1 + var21Lifetime2;
                  ri.field_a[var23Lifetime2] = var22Lifetime2 + var28Lifetime1 / var29Lifetime1;
                  sc.field_d[var23Lifetime2] = var29Lifetime1;
                  if (var29Lifetime1 < var7_int) {
                    var7_int = var29Lifetime1;
                  }
                  if (var8 < var29Lifetime1) {
                    var8 = var29Lifetime1;
                  }
                } else {
                  sc.field_d[var23Lifetime2] = -2147483648;
                }
                if (param0) {
                  bj.field_a[var23Lifetime2] = var27Lifetime1 >> fb.field_r;
                  lj.field_g[var23Lifetime2] = var28Lifetime1 >> fb.field_r;
                  ej.field_s[var23Lifetime2] = var29Lifetime1;
                }
                var23Lifetime2++;
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              boolean decompiledFrameCompleted0 = true;
              if (param4.field_i != null &&
                null != param4.field_j &&
                null != param4.field_f &&
                null != param4.field_E &&
                param4.field_h != null &&
                null != param4.field_C &&
                param4.field_n != null &&
                param4.field_g != null &&
                null != param4.field_r) {
                var23Lifetime2 = 0;
                while (!(var23Lifetime2 >= param4.field_P)) {
                  var24Lifetime1Lifetime1 = param4.field_i[var23Lifetime2];
                  var25Lifetime1Lifetime1 = param4.field_j[var23Lifetime2];
                  var26Lifetime1Lifetime1 = param4.field_f[var23Lifetime2];
                  ae.field_b[var23Lifetime2] = (var25Lifetime1Lifetime1 * var15 + (var24Lifetime1Lifetime1 * var12 + var18 * var26Lifetime1Lifetime1) >> 16) + var9;
                  cd.field_b[var23Lifetime2] = (var16 * var25Lifetime1Lifetime1 + var13 * var24Lifetime1Lifetime1 + var26Lifetime1Lifetime1 * var19 >> 16) + var10;
                  kl.field_c[var23Lifetime2] = var11 + (var25Lifetime1Lifetime1 * var17 + (var24Lifetime1Lifetime1 * var14 + var20 * var26Lifetime1Lifetime1) >> 16);
                  var24Lifetime1Lifetime1 = param4.field_E[var23Lifetime2];
                  var25Lifetime1Lifetime1 = param4.field_h[var23Lifetime2];
                  var26Lifetime1Lifetime1 = param4.field_C[var23Lifetime2];
                  ad.field_D[var23Lifetime2] = (var24Lifetime1Lifetime1 * var12 - (-(var15 * var25Lifetime1Lifetime1) - var18 * var26Lifetime1Lifetime1) >> 16) + var9;
                  hi.field_d[var23Lifetime2] = (var26Lifetime1Lifetime1 * var19 + var13 * var24Lifetime1Lifetime1 + var16 * var25Lifetime1Lifetime1 >> 16) + var10;
                  StarCannon.field_y[var23Lifetime2] = (var20 * var26Lifetime1Lifetime1 + (var14 * var24Lifetime1Lifetime1 + var17 * var25Lifetime1Lifetime1) >> 16) + var11;
                  var24Lifetime1Lifetime1 = param4.field_n[var23Lifetime2];
                  var25Lifetime1Lifetime1 = param4.field_g[var23Lifetime2];
                  var26Lifetime1Lifetime1 = param4.field_r[var23Lifetime2];
                  pd.field_d[var23Lifetime2] = (var18 * var26Lifetime1Lifetime1 + var25Lifetime1Lifetime1 * var15 + var12 * var24Lifetime1Lifetime1 >> 16) + var9;
                  ob.field_c[var23Lifetime2] = var10 + (var25Lifetime1Lifetime1 * var16 + (var13 * var24Lifetime1Lifetime1 + var19 * var26Lifetime1Lifetime1) >> 16);
                  ih.field_g[var23Lifetime2] = var11 + (var26Lifetime1Lifetime1 * var20 + (var14 * var24Lifetime1Lifetime1 + var17 * var25Lifetime1Lifetime1) >> 16);
                  var23Lifetime2++;
                  if (var31 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
              }
              if ((decompiledFrameCompleted0) &&
                (decompiledFrameRemainder0 = (param6))) {
                var9 = param3[3];
                var10 = param3[4];
                var11 = param3[5];
                var12 = param3[6];
                var13 = param3[7];
                var14 = param3[8];
                var15 = param3[9];
                var16 = param3[10];
                var17 = param3[11];
              }
              if (decompiledFrameRemainder0) {
                var18 = 0;
                while (true) {
                  stackIn_60_0Lifetime1 = ~param4.field_s;
                  stackIn_60_1Lifetime1 = ~var18;
                  if (stackIn_60_0Lifetime1 >= stackIn_60_1Lifetime1) {
                    break;
                  }
                  stackIn_69_0 = var18;
                  stackIn_69_1 = rc.field_a.length;
                  if (var31 != 0) {
                    break L1;
                  }
                  if (stackIn_69_0 >= stackIn_69_1) {
                    break;
                  }
                  var19 = param4.field_N[var18];
                  var20 = param4.field_a[var18];
                  var21Lifetime2 = param4.field_o[var18];
                  rc.field_a[var18] = var21Lifetime2 * var15 + var20 * var12 + var9 * var19 >> 16;
                  fb.field_m[var18] = var20 * var13 + (var10 * var19 + var21Lifetime2 * var16) >> 16;
                  p.field_f[var18] = var17 * var21Lifetime2 + var19 * var11 + var20 * var14 >> 16;
                  var18++;
                }
              }
            }
            stackIn_69_0 = var7_int;
            stackIn_69_1 = param1 ? 1 : 0;
            break;
          }
          vh.a(stackIn_69_0, stackIn_69_1 != 0, param4, -6787, var8);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_74_0 = var7;
          stackIn_74_1 = new StringBuilder().append("sh.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          stackIn_78_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',');
          if (param4 == null) {
            stackIn_79_2 = "null";
          } else {
            stackIn_79_2 = "{...}";
          }
          stackIn_82_1 = ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).append(',');
          if (param5 == null) {
            stackIn_83_2 = "null";
          } else {
            stackIn_83_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_74_0), ((StringBuilder) (Object) stackIn_82_1).append(stackIn_83_2).append(',').append(param6).append(')').toString());
        }
    }

    final String a(uj param0, boolean param1) {
        RuntimeException var3 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            sh.b(-96);
          }
          stackIn_4_0 = uh.a(param0.field_k.length(), 0, '*');
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("sh.R(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int b(int param0, int param1) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          var2_int = -20 / ((param0 + 78) / 48);
          stackIn_1_0 = eh.a(2, nc.field_c, param1);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "sh.AA(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_s = "to return to the normal view.";
    }
}
