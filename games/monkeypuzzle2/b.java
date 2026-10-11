/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class b extends bf {
    static int[][] field_j;
    static java.awt.Frame field_i;
    int field_n;
    static int field_m;
    static volatile int field_k;
    static lg field_l;

    public static void e(int param0) {
        try {
          field_i = null;
          field_j = (int[][]) null;
          field_l = null;
          int var1_int = -21 % ((param0 - 32) / 58);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "b.B(" + param0 + ')');
        }
    }

    final static void a(int[] param0, boolean param1, int[] param2, boolean param3, sj param4, byte param5, boolean param6) {
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
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
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var21Lifetime2;
        int var21Lifetime3;
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
        var30 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var7_int = 2147483647;
          var8 = -2147483648;
          var21 = param2[3] >> 2;
          var22 = param2[4] >> 2;
          var23 = param2[5] >> 2;
          var24 = param2[6] >> 2;
          var25 = param2[7] >> 2;
          var26 = param2[8] >> 2;
          var27 = param2[9] >> 2;
          var28 = param2[10] >> 2;
          var29 = param2[11] >> 2;
          var12 = var23 * param0[5] + param0[3] * var21 + var22 * param0[4] >> 14;
          var13 = var25 * param0[4] + param0[3] * var24 + var26 * param0[5] >> 14;
          var20 = param0[11] * var29 + (param0[9] * var27 + var28 * param0[10]) >> 14;
          var14 = param0[3] * var27 + param0[4] * var28 + var29 * param0[5] >> 14;
          var16 = param0[7] * var25 + var24 * param0[6] + var26 * param0[8] >> 14;
          var17 = var28 * param0[7] + (param0[6] * var27 + var29 * param0[8]) >> 14;
          var19 = var25 * param0[10] + var24 * param0[9] + var26 * param0[11] >> 14;
          var15 = param0[8] * var23 + (var22 * param0[7] + var21 * param0[6]) >> 14;
          var18 = var22 * param0[10] + (param0[9] * var21 + var23 * param0[11]) >> 14;
          var21Lifetime1 = -param2[0] + param0[0];
          var22Lifetime1 = -param2[1] + param0[1];
          var23Lifetime1 = param0[2] - param2[2];
          var9 = param2[3] * var21Lifetime1 + var22Lifetime1 * param2[4] + var23Lifetime1 * param2[5] >> 16 - uc.field_b;
          var10 = param2[8] * var23Lifetime1 + (var22Lifetime1 * param2[7] + param2[6] * var21Lifetime1) >> 16 - uc.field_b;
          var11 = var21Lifetime1 * param2[9] - (-(param2[10] * var22Lifetime1) - var23Lifetime1 * param2[11]) >> 16;
          var21Lifetime2 = ig.field_h;
          var22Lifetime2 = ig.field_f;
          var23Lifetime2 = 0;
          L1: while (true) {
            if (param4.field_e > var23Lifetime2) {
              var24Lifetime1 = param4.field_O[var23Lifetime2];
              var25Lifetime1 = param4.field_M[var23Lifetime2];
              var26Lifetime1 = param4.field_z[var23Lifetime2];
              var27Lifetime1 = (var18 * var26Lifetime1 + var25Lifetime1 * var15 + var12 * var24Lifetime1 >> 16 - uc.field_b) + var9;
              var28Lifetime1 = var10 + (var24Lifetime1 * var13 + var25Lifetime1 * var16 + var26Lifetime1 * var19 >> 16 - uc.field_b);
              var29Lifetime1 = (var20 * var26Lifetime1 + var25Lifetime1 * var17 + var24Lifetime1 * var14 >> 16) + var11;
              stackIn_55_0 = 50;
              stackIn_55_1 = var29Lifetime1;
              if (var30 == 0) {
                if (stackIn_55_0 <= stackIn_55_1) {
                  bg.field_L[var23Lifetime2] = var27Lifetime1 / var29Lifetime1 + var21Lifetime2;
                  sb.field_l[var23Lifetime2] = var28Lifetime1 / var29Lifetime1 + var22Lifetime2;
                  ah.field_i[var23Lifetime2] = var29Lifetime1;
                  if (var7_int > var29Lifetime1) {
                    var7_int = var29Lifetime1;
                  }
                  if (var8 < var29Lifetime1) {
                    var8 = var29Lifetime1;
                  }
                } else {
                  ah.field_i[var23Lifetime2] = -2147483648;
                }
                if (param1) {
                  wf.field_m[var23Lifetime2] = var27Lifetime1 >> uc.field_b;
                  fi.field_c[var23Lifetime2] = var28Lifetime1 >> uc.field_b;
                  jh.field_y[var23Lifetime2] = var29Lifetime1;
                }
                var23Lifetime2++;
                continue;
              }
            } else {
              if (null != param4.field_B &&
                null != param4.field_E &&
                param4.field_s != null &&
                param4.field_F != null &&
                param4.field_v != null &&
                param4.field_o != null &&
                param4.field_w != null &&
                param4.field_H != null &&
                param4.field_J != null) {
                var23Lifetime2 = 0;
                while (!(param4.field_k <= var23Lifetime2)) {
                  var24Lifetime1 = param4.field_B[var23Lifetime2];
                  var25Lifetime1 = param4.field_E[var23Lifetime2];
                  var26Lifetime1 = param4.field_s[var23Lifetime2];
                  ci.field_c[var23Lifetime2] = var9 + (var12 * var24Lifetime1 + var25Lifetime1 * var15 + var26Lifetime1 * var18 >> 16);
                  p.field_d[var23Lifetime2] = var10 + (var25Lifetime1 * var16 + (var24Lifetime1 * var13 + var19 * var26Lifetime1) >> 16);
                  ea.field_d[var23Lifetime2] = (var25Lifetime1 * var17 + (var14 * var24Lifetime1 + var20 * var26Lifetime1) >> 16) + var11;
                  var24Lifetime1 = param4.field_F[var23Lifetime2];
                  var25Lifetime1 = param4.field_v[var23Lifetime2];
                  var26Lifetime1 = param4.field_o[var23Lifetime2];
                  ke.field_b[var23Lifetime2] = var9 + (var18 * var26Lifetime1 + (var15 * var25Lifetime1 + var24Lifetime1 * var12) >> 16);
                  v.field_d[var23Lifetime2] = var10 + (var26Lifetime1 * var19 + var13 * var24Lifetime1 + var16 * var25Lifetime1 >> 16);
                  he.field_g[var23Lifetime2] = var11 + (var17 * var25Lifetime1 + var24Lifetime1 * var14 + var26Lifetime1 * var20 >> 16);
                  var24Lifetime1 = param4.field_w[var23Lifetime2];
                  var25Lifetime1 = param4.field_H[var23Lifetime2];
                  var26Lifetime1 = param4.field_J[var23Lifetime2];
                  me.field_j[var23Lifetime2] = (var12 * var24Lifetime1 + var15 * var25Lifetime1 + var18 * var26Lifetime1 >> 16) + var9;
                  gi.field_j[var23Lifetime2] = (var13 * var24Lifetime1 + (var16 * var25Lifetime1 + var19 * var26Lifetime1) >> 16) + var10;
                  wk.field_e[var23Lifetime2] = (var26Lifetime1 * var20 + (var24Lifetime1 * var14 + var25Lifetime1 * var17) >> 16) + var11;
                  var23Lifetime2++;
                  if (var30 != 0) {
                    break L1;
                  }
                }
              }
              stackIn_55_0 = param5;
              stackIn_55_1 = -19;
            }
            if (stackIn_55_0 > stackIn_55_1) {
              field_l = (lg) null;
            }
            break;
          }
          boolean decompiledFrameCompleted0 = true;
          if (param6) {
            var9Lifetime1 = param0[3];
            var10Lifetime1 = param0[4];
            var11Lifetime1 = param0[5];
            var12Lifetime1 = param0[6];
            var13Lifetime1 = param0[7];
            var14Lifetime1 = param0[8];
            var15Lifetime1 = param0[9];
            var16Lifetime1 = param0[10];
            var17Lifetime1 = param0[11];
            var18Lifetime1 = 0;
            while (!(var18Lifetime1 >= param4.field_r)) {
              stackIn_67_0 = ~gj.field_c.length;
              stackIn_67_1 = ~var18Lifetime1;
              if (var30 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_67_0 >= stackIn_67_1) {
                break;
              }
              var19Lifetime1 = param4.field_y[var18Lifetime1];
              var20Lifetime1 = param4.field_p[var18Lifetime1];
              var21Lifetime3 = param4.field_K[var18Lifetime1];
              gj.field_c[var18Lifetime1] = var12Lifetime1 * var20Lifetime1 + var19Lifetime1 * var9Lifetime1 + var15Lifetime1 * var21Lifetime3 >> 16;
              vd.field_a[var18Lifetime1] = var20Lifetime1 * var13Lifetime1 + (var19Lifetime1 * var10Lifetime1 + var21Lifetime3 * var16Lifetime1) >> 16;
              rc.field_j[var18Lifetime1] = var21Lifetime3 * var17Lifetime1 + (var11Lifetime1 * var19Lifetime1 + var20Lifetime1 * var14Lifetime1) >> 16;
              var18Lifetime1++;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_67_0 = var8;
            stackIn_67_1 = -10;
          }
          rf.a(stackIn_67_0, stackIn_67_1, var7_int, param3, param4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_72_0 = var7;
          stackIn_72_1 = new StringBuilder().append("b.E(");
          if (param0 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_76_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          stackIn_80_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != -21342) {
            field_m = 117;
          }
          ec.a(1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2), "b.D(" + param0 + ',' + param1 + ')');
        }
    }

    abstract Object a(byte param0);

    abstract boolean b(byte param0);

    final static ad a(boolean param0, int param1, boolean param2, int param3, byte param4) {
        ad stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        try {
          var5_int = 99 % ((param4 - 67) / 48);
          stackIn_1_0 = em.a(false, param3, param0, param2, param1, 50);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var5), "b.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    b(int param0) {
        try {
          this.field_n = param0;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "b.<init>(" + param0 + ')');
        }
    }

    final static ai[] a(int param0, int param1, ad param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        ai[] stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!wg.a(param3, param0, param2, -3)) {
            stackIn_2_0 = null;
            return (ai[]) (stackIn_2_0);
          }
          if (param1 != 10) {
            field_l = (lg) null;
          }
          stackIn_7_0 = hk.a((byte) 1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("b.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_j = new int[11][];
        field_k = -1;
    }
}
