/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class qm extends ng {
    boolean field_H;
    static int field_F;
    private boolean field_K;
    static java.applet.Applet field_L;
    private boolean field_I;
    boolean field_M;
    static byte[] field_J;
    static String field_G;

    boolean a(byte param0, ng param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -58) {
            field_J = (byte[]) null;
          }
          if (this.field_H &&
            this.a(102, param5, param3, param6, param4)) {
            this.a(param1, 27);
            this.field_k = param2;
            if (this.field_n != null &&
              this.field_n instanceof b) {
              ((b) (this.field_n)).a(param4, 118, param3, param2, this, param5, param6);
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_22_0 = var8;
          stackIn_22_1 = new StringBuilder().append("qm.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    boolean a(ng param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_H &&
            this.field_I) {
            param0.h(2);
            this.field_K = true;
            if (param1 != 27) {
              qm.a(-64, (sb) null, 111, 79, (sb) null, 120, -16, 109, (sb) null, 39, -126, (jl) null, 33, -16, (jl) null, -57, -112, -56, 119, 16);
            }
            if (null != this.field_n &&
              this.field_n instanceof cc) {
              ((cc) (this.field_n)).a((ng) (this), param1 ^ 44, this.field_K);
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("qm.HA(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    void a(boolean param0, int param1, int param2, int param3) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (!param0) {
            this.field_H = true;
          }
          if (this.field_n != null &&
            this.field_n instanceof vo) {
            ((vo) (this.field_n)).a(this, param1, 11, param2, param3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var5), "qm.NA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final StringBuilder a(StringBuilder param0, boolean param1, int param2, Hashtable param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_13_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            this.field_K = false;
          }
          if (this.a(-89, param2, param0, param3)) {
            this.a(param2, (byte) -2, param3, param0);
            if (this.field_M) {
              discarded$2 = param0.append(" active");
            }
            if (!this.field_H) {
              discarded$3 = param0.append(" disabled");
            }
          }
          stackIn_13_0 = (StringBuilder) (param0);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("qm.AA(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, ng param3) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.a(param0, param1, param2, param3);
          if (this.field_k != 0 &&
            this.field_k != ef.field_b) {
            if (this.a(78, param2, param1, bg.field_k, uf.field_d) &&
              ef.field_b == 0) {
              this.a(true, -param1 + bg.field_k, this.field_k, -param2 + uf.field_d);
            }
            this.a(bg.field_k, param2, param3, 0, param1, uf.field_d);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("qm.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, ng param2, int param3, int param4, int param5) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (null != this.field_n &&
            this.field_n instanceof b) {
            ((b) (this.field_n)).a(param4, (byte) 71, param0, param5, this, param1);
          }
          this.field_k = param3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_11_0 = var7;
          stackIn_11_1 = new StringBuilder().append("qm.EA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    qm(String param0, fn param1) {
        this(param0, h.field_X.field_r, param1);
    }

    final static void a(rl param0, int[] param1, boolean param2, int[] param3, byte param4, boolean param5, boolean param6) {
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        int stackIn_76_0 = 0;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_82_2 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_86_2 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_90_2 = null;
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
        int stackIn_67_0Lifetime1;
        int stackIn_67_1Lifetime1;
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
        var30 = Pixelate.field_H ? 1 : 0;
        try {
          var7_int = 2147483647;
          var8 = -2147483648;
          var21 = param1[3] >> 2;
          var22 = param1[4] >> 2;
          var23 = param1[5] >> 2;
          var24 = param1[6] >> 2;
          var25 = param1[7] >> 2;
          var26 = param1[8] >> 2;
          var27 = param1[9] >> 2;
          var28 = param1[10] >> 2;
          var29 = param1[11] >> 2;
          var13 = var25 * param3[4] + var24 * param3[3] + param3[5] * var26 >> 14;
          var12 = param3[5] * var23 + (param3[3] * var21 + param3[4] * var22) >> 14;
          var14 = var29 * param3[5] + (var28 * param3[4] + param3[3] * var27) >> 14;
          var20 = param3[11] * var29 + (var27 * param3[9] + param3[10] * var28) >> 14;
          var19 = param3[10] * var25 + var24 * param3[9] + param3[11] * var26 >> 14;
          var17 = param3[8] * var29 + var28 * param3[7] + param3[6] * var27 >> 14;
          var16 = var26 * param3[8] + var24 * param3[6] + var25 * param3[7] >> 14;
          var15 = var21 * param3[6] + param3[7] * var22 + var23 * param3[8] >> 14;
          var18 = param3[11] * var23 + param3[10] * var22 + param3[9] * var21 >> 14;
          var21Lifetime1 = param3[0] - param1[0];
          var22Lifetime1 = param3[1] - param1[1];
          var23Lifetime1 = -param1[2] + param3[2];
          if (param4 < 3) {
            qm.a(112, (sb) null, 29, 72, (sb) null, 76, -127, -121, (sb) null, -76, 4, (jl) null, -119, 13, (jl) null, 46, -72, 8, -22, -67);
          }
          var9 = var21Lifetime1 * param1[3] + param1[4] * var22Lifetime1 + var23Lifetime1 * param1[5] >> -ai.field_x + 16;
          var10 = var23Lifetime1 * param1[8] + (param1[7] * var22Lifetime1 + param1[6] * var21Lifetime1) >> 16 - ai.field_x;
          var11 = param1[11] * var23Lifetime1 + param1[9] * var21Lifetime1 + param1[10] * var22Lifetime1 >> 16;
          var21Lifetime2 = ja.field_b;
          var22Lifetime2 = ja.field_i;
          var23Lifetime2 = 0;
          L2: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (var23Lifetime2 < param0.field_A) {
              var24Lifetime1 = param0.field_k[var23Lifetime2];
              var25Lifetime1 = param0.field_N[var23Lifetime2];
              var26Lifetime1 = param0.field_E[var23Lifetime2];
              var27Lifetime1 = (var18 * var26Lifetime1 + var24Lifetime1 * var12 + var25Lifetime1 * var15 >> -ai.field_x + 16) + var9;
              var28Lifetime1 = var10 + (var26Lifetime1 * var19 + var13 * var24Lifetime1 + var25Lifetime1 * var16 >> 16 - ai.field_x);
              var29Lifetime1 = var11 + (var25Lifetime1 * var17 + var24Lifetime1 * var14 + var26Lifetime1 * var20 >> 16);
              stackIn_67_0 = -51;
              stackIn_67_1 = ~var29Lifetime1;
              if (var30 != 0) {
                if (stackIn_67_0 < stackIn_67_1) {
                  stackIn_76_0 = var18;
                  break L2;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (stackIn_67_0 < stackIn_67_1) {
                  qe.field_v[var23Lifetime2] = -2147483648;
                } else {
                  jp.field_a[var23Lifetime2] = var21Lifetime2 + var27Lifetime1 / var29Lifetime1;
                  al.field_m[var23Lifetime2] = var22Lifetime2 + var28Lifetime1 / var29Lifetime1;
                  qe.field_v[var23Lifetime2] = var29Lifetime1;
                  if (var29Lifetime1 < var7_int) {
                    var7_int = var29Lifetime1;
                  }
                  if (var8 < var29Lifetime1) {
                    var8 = var29Lifetime1;
                  }
                }
                if (param6) {
                  ih.field_c[var23Lifetime2] = var27Lifetime1 >> ai.field_x;
                  qo.field_w[var23Lifetime2] = var28Lifetime1 >> ai.field_x;
                  ai.field_e[var23Lifetime2] = var29Lifetime1;
                }
                var23Lifetime2++;
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              boolean decompiledFrameCompleted0 = true;
              if (param0.field_w != null &&
                param0.field_H != null &&
                param0.field_C != null &&
                param0.field_v != null &&
                null != param0.field_P &&
                param0.field_u != null &&
                param0.field_M != null &&
                param0.field_y != null &&
                null != param0.field_R) {
                var23Lifetime2 = 0;
                while (!(param0.field_j <= var23Lifetime2)) {
                  var24Lifetime1Lifetime1 = param0.field_w[var23Lifetime2];
                  var25Lifetime1Lifetime1 = param0.field_H[var23Lifetime2];
                  var26Lifetime1Lifetime1 = param0.field_C[var23Lifetime2];
                  h.field_Y[var23Lifetime2] = (var26Lifetime1Lifetime1 * var18 + (var12 * var24Lifetime1Lifetime1 + var15 * var25Lifetime1Lifetime1) >> 16) + var9;
                  vk.field_ub[var23Lifetime2] = (var26Lifetime1Lifetime1 * var19 + (var24Lifetime1Lifetime1 * var13 + var25Lifetime1Lifetime1 * var16) >> 16) + var10;
                  gh.field_r[var23Lifetime2] = var11 + (var26Lifetime1Lifetime1 * var20 + (var14 * var24Lifetime1Lifetime1 + var25Lifetime1Lifetime1 * var17) >> 16);
                  var24Lifetime1Lifetime1 = param0.field_v[var23Lifetime2];
                  var25Lifetime1Lifetime1 = param0.field_P[var23Lifetime2];
                  var26Lifetime1Lifetime1 = param0.field_u[var23Lifetime2];
                  eg.field_l[var23Lifetime2] = var9 + (var18 * var26Lifetime1Lifetime1 + (var12 * var24Lifetime1Lifetime1 + var25Lifetime1Lifetime1 * var15) >> 16);
                  dj.field_b[var23Lifetime2] = var10 + (var16 * var25Lifetime1Lifetime1 + var24Lifetime1Lifetime1 * var13 + var19 * var26Lifetime1Lifetime1 >> 16);
                  kh.field_c[var23Lifetime2] = (var20 * var26Lifetime1Lifetime1 + var14 * var24Lifetime1Lifetime1 + var25Lifetime1Lifetime1 * var17 >> 16) + var11;
                  var24Lifetime1Lifetime1 = param0.field_M[var23Lifetime2];
                  var25Lifetime1Lifetime1 = param0.field_y[var23Lifetime2];
                  var26Lifetime1Lifetime1 = param0.field_R[var23Lifetime2];
                  eg.field_h[var23Lifetime2] = (var24Lifetime1Lifetime1 * var12 - (-(var15 * var25Lifetime1Lifetime1) - var26Lifetime1Lifetime1 * var18) >> 16) + var9;
                  ip.field_x[var23Lifetime2] = var10 + (var24Lifetime1Lifetime1 * var13 - (-(var16 * var25Lifetime1Lifetime1) - var26Lifetime1Lifetime1 * var19) >> 16);
                  le.field_b[var23Lifetime2] = (var14 * var24Lifetime1Lifetime1 - (-(var25Lifetime1Lifetime1 * var17) - var26Lifetime1Lifetime1 * var20) >> 16) + var11;
                  var23Lifetime2++;
                  if (var30 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
              }
              if ((decompiledFrameCompleted0) &&
                (decompiledFrameRemainder0 = (param5))) {
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
                  stackIn_67_0Lifetime1 = ~param0.field_a;
                  stackIn_67_1Lifetime1 = ~var18;
                  if (stackIn_67_0Lifetime1 >= stackIn_67_1Lifetime1) {
                    break;
                  }
                  stackIn_76_0 = var18;
                  if (var30 != 0) {
                    break L2;
                  }
                  if (stackIn_76_0 >= wd.field_i.length) {
                    break;
                  }
                  var19 = param0.field_K[var18];
                  var20 = param0.field_q[var18];
                  var21Lifetime2 = param0.field_p[var18];
                  wd.field_i[var18] = var12 * var20 + (var9 * var19 + var15 * var21Lifetime2) >> 16;
                  lo.field_Ib[var18] = var16 * var21Lifetime2 + var20 * var13 + var19 * var10 >> 16;
                  wn.field_q[var18] = var17 * var21Lifetime2 + var11 * var19 + var14 * var20 >> 16;
                  var18++;
                }
              }
            }
            stackIn_76_0 = var8;
            break;
          }
          ca.a(stackIn_76_0, param0, false, var7_int, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_81_0 = var7;
          stackIn_81_1 = new StringBuilder().append("qm.UA(");
          if (param0 == null) {
            stackIn_82_2 = "null";
          } else {
            stackIn_82_2 = "{...}";
          }
          stackIn_85_1 = ((StringBuilder) (Object) stackIn_81_1).append(stackIn_82_2).append(',');
          if (param1 == null) {
            stackIn_86_2 = "null";
          } else {
            stackIn_86_2 = "{...}";
          }
          stackIn_89_1 = ((StringBuilder) (Object) stackIn_85_1).append(stackIn_86_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_90_2 = "null";
          } else {
            stackIn_90_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_81_0), ((StringBuilder) (Object) stackIn_89_1).append(stackIn_90_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean b(boolean param0) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            this.a((StringBuilder) null, false, 27, (Hashtable) null);
          }
          stackIn_4_0 = this.field_K;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "qm.JA(" + param0 + ')');
        }
    }

    final static void a(int param0, sb param1, int param2, int param3, sb param4, int param5, int param6, int param7, sb param8, int param9, int param10, jl param11, int param12, int param13, jl param14, int param15, int param16, int param17, int param18, int param19) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var20 = null;
        try {
          ie.field_G = param11;
          lm.field_o = param14;
          el.a(param10, param13, param9, 93, param3);
          nb.a(param5, param6, 7, param1);
          mj.a(param2, param4, param0, 300, param12, param8);
          ug.a(param15, param19, -26104);
          k.a(param7, param18, -14129, param16);
          if (param17 < 105) {
            field_L = (java.applet.Applet) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var20 = decompiledCaughtException;
          stackIn_6_0 = var20;
          stackIn_6_1 = new StringBuilder().append("qm.SA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param9).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param12).append(',').append(param13).append(',');
          if (param14 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',').append(param18).append(',').append(param19).append(')').toString());
        }
    }

    qm(String param0, eb param1, fn param2) {
        super(param0, param1, param2);
        this.field_K = false;
        this.field_H = true;
        this.field_I = true;
    }

    final void h(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (this.field_K) {
            this.field_K = false;
            if (this.field_n != null &&
              this.field_n instanceof cc) {
              ((cc) (this.field_n)).a((ng) (this), param0 ^ 58, this.field_K);
            }
          }
          if (param0 != 2) {
            field_L = (java.applet.Applet) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "qm.OA(" + param0 + ')');
        }
    }

    boolean a(int param0, int param1, ng param2, char param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 3) {
            return false;
          }
          if (this.b(true) && (84 == param0 ||
            83 == param0)) {
            this.a(true, -1, 1, -1);
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("qm.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(')').toString());
        }
    }

    final static int[] a(int param0, int param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 7) {
            field_F = 18;
          }
          var3_int = mi.d(-4096, param1);
          var4 = th.a(param1, 8191);
          var5 = mi.d(-4096, param0);
          var6 = th.a(param0, 8191);
          var7 = (int)((long)var3_int * (long)var5 >> 16);
          var8 = (int)((long)var3_int * (long)var6 >> 16);
          var9 = (int)((long)var5 * (long)var4 >> 16);
          var10 = (int)((long)var6 * (long)var4 >> 16);
          stackIn_4_0 = new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3_int, var10};
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "qm.TA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void j(int param0) {
        try {
          field_J = null;
          field_G = null;
          field_L = null;
          if (param0 < 62) {
            qm.a(8, (sb) null, 42, -55, (sb) null, 28, 88, -93, (sb) null, 77, 108, (jl) null, 5, -44, (jl) null, -125, -73, 115, -35, -117);
          }
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "qm.RA(" + param0 + ')');
        }
    }

    protected qm() {
        this.field_K = false;
        this.field_H = true;
        this.field_I = true;
        try {
          this.field_y = h.field_X.field_s;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "qm.<init>()");
        }
    }

    static {
        field_G = "<%0> wins!";
    }
}
