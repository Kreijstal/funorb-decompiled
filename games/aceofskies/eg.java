/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg {
    final boolean a(boolean param0) {
        RuntimeException var2 = null;
        boolean stackIn_13_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            this.a(true);
          }
          stackIn_13_0 = (this == he.field_o) || (this == TimedSpriteEffect.field_a) || (wq.field_e == this);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var2), "eg.B(" + param0 + ')');
        }
    }

    public final String toString() {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          throw new IllegalStateException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1), "eg.toString()");
        }
    }

    final static void a(wu param0, int[] param1, int param2, boolean param3, boolean param4, int[] param5, boolean param6) {
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
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
        int stackIn_57_0Lifetime1;
        int stackIn_57_1Lifetime1;
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
        int var25Lifetime1Lifetime1;
        int var26Lifetime1Lifetime1;
        int var27Lifetime1Lifetime1;
        var31 = AceOfSkies.obfuscationControl ? 1 : 0;
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
          var12 = var23 * param5[5] + var21 * param5[3] + param5[4] * var22 >> 14;
          var13 = param5[3] * var24 + (param5[4] * var25 + var26 * param5[5]) >> 14;
          var17 = var27 * param5[6] + param5[7] * var28 + var29 * param5[8] >> 14;
          var14 = var29 * param5[5] + (var28 * param5[4] + var27 * param5[3]) >> 14;
          var15 = var21 * param5[6] + param5[7] * var22 + var23 * param5[8] >> 14;
          var18 = param5[9] * var21 + var22 * param5[10] + param5[11] * var23 >> 14;
          var19 = param5[10] * var25 + var24 * param5[9] + var26 * param5[11] >> 14;
          var16 = var25 * param5[7] + var24 * param5[6] + param5[8] * var26 >> 14;
          var20 = var29 * param5[11] + (param5[10] * var28 + var27 * param5[9]) >> 14;
          var21Lifetime1 = param5[0] - param1[0];
          var22Lifetime1 = -param1[1] + param5[1];
          var23Lifetime1 = -param1[2] + param5[2];
          var9 = param1[4] * var22Lifetime1 + (var21Lifetime1 * param1[3] + var23Lifetime1 * param1[5]) >> -im.field_f + 16;
          var11 = param1[9] * var21Lifetime1 + var22Lifetime1 * param1[10] + var23Lifetime1 * param1[11] >> 16;
          var10 = var23Lifetime1 * param1[8] + var21Lifetime1 * param1[6] + var22Lifetime1 * param1[7] >> -im.field_f + 16;
          var21Lifetime2 = re.field_d;
          var23Lifetime2 = -97 % ((-16 - param2) / 59);
          var22Lifetime2 = re.field_e;
          var24Lifetime1 = 0;
          scanLoop1: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (var24Lifetime1 < param0.field_r) {
              var25Lifetime1 = param0.field_z[var24Lifetime1];
              var26Lifetime1 = param0.field_P[var24Lifetime1];
              var27Lifetime1 = param0.field_F[var24Lifetime1];
              var28Lifetime1 = (var27Lifetime1 * var18 + (var12 * var25Lifetime1 + var26Lifetime1 * var15) >> -im.field_f + 16) + var9;
              var29Lifetime1 = var10 + (var16 * var26Lifetime1 + var25Lifetime1 * var13 + var27Lifetime1 * var19 >> -im.field_f + 16);
              var30 = (var25Lifetime1 * var14 + var17 * var26Lifetime1 + var20 * var27Lifetime1 >> 16) + var11;
              stackIn_57_0 = 50;
              stackIn_57_1 = var30;
              if (var31 != 0) {
                if (stackIn_57_0 > stackIn_57_1) {
                  stackIn_66_0 = ~ArchiveProvider.field_b.length;
                  break scanLoop1;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (stackIn_57_0 <= stackIn_57_1) {
                  qj.field_t[var24Lifetime1] = var28Lifetime1 / var30 + var21Lifetime2;
                  ro.field_t[var24Lifetime1] = var22Lifetime2 + var29Lifetime1 / var30;
                  lp.field_d[var24Lifetime1] = var30;
                  if (var7_int > var30) {
                    var7_int = var30;
                  }
                  if (var8 < var30) {
                    var8 = var30;
                  }
                } else {
                  lp.field_d[var24Lifetime1] = -2147483648;
                }
                if (param4) {
                  wu.field_c[var24Lifetime1] = var28Lifetime1 >> im.field_f;
                  tm.field_l[var24Lifetime1] = var29Lifetime1 >> im.field_f;
                  ur.field_b[var24Lifetime1] = var30;
                }
                var24Lifetime1++;
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              if (null != param0.field_p &&
                param0.field_k != null &&
                param0.field_o != null &&
                null != param0.field_Q &&
                null != param0.field_e &&
                null != param0.field_j &&
                null != param0.field_i &&
                param0.field_M != null &&
                param0.field_a != null) {
                var24Lifetime1 = 0;
                while (!(var24Lifetime1 >= param0.field_K)) {
                  var25Lifetime1Lifetime1 = param0.field_p[var24Lifetime1];
                  var26Lifetime1Lifetime1 = param0.field_k[var24Lifetime1];
                  var27Lifetime1Lifetime1 = param0.field_o[var24Lifetime1];
                  ep.field_u[var24Lifetime1] = var9 + (var18 * var27Lifetime1Lifetime1 + (var26Lifetime1Lifetime1 * var15 + var12 * var25Lifetime1Lifetime1) >> 16);
                  rs.field_B[var24Lifetime1] = var10 + (var19 * var27Lifetime1Lifetime1 + var13 * var25Lifetime1Lifetime1 + var16 * var26Lifetime1Lifetime1 >> 16);
                  pf.field_A[var24Lifetime1] = (var27Lifetime1Lifetime1 * var20 + var25Lifetime1Lifetime1 * var14 + var26Lifetime1Lifetime1 * var17 >> 16) + var11;
                  var25Lifetime1Lifetime1 = param0.field_Q[var24Lifetime1];
                  var26Lifetime1Lifetime1 = param0.field_e[var24Lifetime1];
                  var27Lifetime1Lifetime1 = param0.field_j[var24Lifetime1];
                  ec.field_m[var24Lifetime1] = (var18 * var27Lifetime1Lifetime1 + (var15 * var26Lifetime1Lifetime1 + var25Lifetime1Lifetime1 * var12) >> 16) + var9;
                  dk.field_g[var24Lifetime1] = (var27Lifetime1Lifetime1 * var19 + (var26Lifetime1Lifetime1 * var16 + var25Lifetime1Lifetime1 * var13) >> 16) + var10;
                  vo.field_d[var24Lifetime1] = (var25Lifetime1Lifetime1 * var14 + var17 * var26Lifetime1Lifetime1 + var20 * var27Lifetime1Lifetime1 >> 16) + var11;
                  var25Lifetime1Lifetime1 = param0.field_i[var24Lifetime1];
                  var26Lifetime1Lifetime1 = param0.field_M[var24Lifetime1];
                  var27Lifetime1Lifetime1 = param0.field_a[var24Lifetime1];
                  wc.field_a[var24Lifetime1] = (var18 * var27Lifetime1Lifetime1 + (var26Lifetime1Lifetime1 * var15 + var12 * var25Lifetime1Lifetime1) >> 16) + var9;
                  lp.field_e[var24Lifetime1] = var10 + (var26Lifetime1Lifetime1 * var16 + var13 * var25Lifetime1Lifetime1 + var27Lifetime1Lifetime1 * var19 >> 16);
                  MidiPcmStream.field_i[var24Lifetime1] = (var27Lifetime1Lifetime1 * var20 + var25Lifetime1Lifetime1 * var14 + var26Lifetime1Lifetime1 * var17 >> 16) + var11;
                  var24Lifetime1++;
                  if (var31 != 0) {
                    return;
                  }
                }
              }
              if (param3) {
                var9 = param5[3];
                var10 = param5[4];
                var11 = param5[5];
                var12 = param5[6];
                var13 = param5[7];
                var14 = param5[8];
                var15 = param5[9];
                var16 = param5[10];
                var17 = param5[11];
                var18 = 0;
                while (true) {
                  stackIn_57_0Lifetime1 = param0.field_q;
                  stackIn_57_1Lifetime1 = var18;
                  if (stackIn_57_0Lifetime1 <= stackIn_57_1Lifetime1) {
                    break;
                  }
                  stackIn_66_0 = ~ArchiveProvider.field_b.length;
                  if (var31 != 0) {
                    break scanLoop1;
                  }
                  if (stackIn_66_0 >= ~var18) {
                    break;
                  }
                  var19 = param0.field_H[var18];
                  var20 = param0.field_L[var18];
                  var21Lifetime2 = param0.field_n[var18];
                  ArchiveProvider.field_b[var18] = var12 * var20 + var9 * var19 + var21Lifetime2 * var15 >> 16;
                  ql.field_o[var18] = var21Lifetime2 * var16 + (var19 * var10 + var20 * var13) >> 16;
                  dq.field_c[var18] = var17 * var21Lifetime2 + (var11 * var19 + var20 * var14) >> 16;
                  var18++;
                }
              }
            }
            stackIn_66_0 = var7_int;
            break;
          }
          ed.a(stackIn_66_0, param0, (byte) -69, var8, param6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_71_0 = var7;
          stackIn_71_1 = new StringBuilder().append("eg.A(");
          if (param0 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          stackIn_75_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',');
          if (param1 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          stackIn_79_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',').append(param6).append(')').toString());
        }
    }

    static {
    }
}
