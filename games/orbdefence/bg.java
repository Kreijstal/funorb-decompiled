/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg {
    static im field_a;
    static String field_b;
    static String field_d;
    static int field_c;

    final static void a(int param0) {
        try {
          d.b((byte) -102);
          if (param0 != -2027485778) {
            bg.a((byte) -85);
          }
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "bg.B(" + param0 + ')');
        }
    }

    final static hj[] a(int param0, int param1) {
        hj[] stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        hj[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        try {
          var3 = -9 / ((-1 - param0) / 56);
          var2 = new hj[9];
          var2[4] = af.a(64, (byte) -51, param1);
          stackIn_1_0 = var2;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var2_ref), "bg.E(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0) {
        try {
          oe.field_p = param0;
          vh.field_j = false;
          il.a(-1, 0);
          qc.field_g = tl.field_h;
          tg.field_c = tl.field_h;
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "bg.A(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != -107) {
            field_d = (String) null;
          }
          field_a = null;
          field_b = null;
          field_d = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var1), "bg.D(" + param0 + ')');
        }
    }

    final static void a(int[] param0, wd param1, int param2, boolean param3, boolean param4, boolean param5, int[] param6) {
        int stackIn_68_0 = 0;
        int stackIn_68_1 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_82_2 = null;
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
        var30 = OrbDefence.field_D ? 1 : 0;
        try {
          var7_int = 2147483647;
          var8 = -2147483648;
          if (param2 <= 49) {
            bg.a((byte) -95);
          }
          var21 = param6[3] >> 2;
          var22 = param6[4] >> 2;
          var23 = param6[5] >> 2;
          var24 = param6[6] >> 2;
          var25 = param6[7] >> 2;
          var26 = param6[8] >> 2;
          var27 = param6[9] >> 2;
          var28 = param6[10] >> 2;
          var13 = param0[5] * var26 + (var24 * param0[3] + param0[4] * var25) >> 14;
          var29 = param6[11] >> 2;
          var12 = param0[4] * var22 + param0[3] * var21 + var23 * param0[5] >> 14;
          var19 = param0[11] * var26 + (param0[9] * var24 + param0[10] * var25) >> 14;
          var17 = param0[7] * var28 + (var27 * param0[6] + param0[8] * var29) >> 14;
          var18 = var21 * param0[9] + param0[10] * var22 + param0[11] * var23 >> 14;
          var15 = param0[6] * var21 + (var22 * param0[7] + var23 * param0[8]) >> 14;
          var20 = param0[9] * var27 + (var28 * param0[10] + param0[11] * var29) >> 14;
          var16 = param0[7] * var25 + param0[6] * var24 + param0[8] * var26 >> 14;
          var14 = var27 * param0[3] + var28 * param0[4] + var29 * param0[5] >> 14;
          var21Lifetime1 = -param6[0] + param0[0];
          var22Lifetime1 = -param6[1] + param0[1];
          var23Lifetime1 = -param6[2] + param0[2];
          var9 = param6[5] * var23Lifetime1 + var22Lifetime1 * param6[4] + var21Lifetime1 * param6[3] >> -sf.field_O + 16;
          var10 = var23Lifetime1 * param6[8] + (var21Lifetime1 * param6[6] + var22Lifetime1 * param6[7]) >> 16 - sf.field_O;
          var11 = param6[10] * var22Lifetime1 + param6[9] * var21Lifetime1 + var23Lifetime1 * param6[11] >> 16;
          var21Lifetime2 = wi.field_h;
          var22Lifetime2 = wi.field_d;
          var23Lifetime2 = 0;
          L3: while (true) {
            if (var23Lifetime2 < param1.field_c) {
              var24Lifetime1 = param1.field_R[var23Lifetime2];
              var25Lifetime1 = param1.field_x[var23Lifetime2];
              var26Lifetime1 = param1.field_Q[var23Lifetime2];
              var27Lifetime1 = var9 + (var12 * var24Lifetime1 - (-(var15 * var25Lifetime1) - var18 * var26Lifetime1) >> -sf.field_O + 16);
              var28Lifetime1 = (var16 * var25Lifetime1 + var24Lifetime1 * var13 + var26Lifetime1 * var19 >> -sf.field_O + 16) + var10;
              var29Lifetime1 = var11 + (var20 * var26Lifetime1 + (var17 * var25Lifetime1 + var24Lifetime1 * var14) >> 16);
              stackIn_68_0 = var29Lifetime1;
              stackIn_68_1 = 50;
              if (var30 == 0) {
                if (stackIn_68_0 < stackIn_68_1) {
                  dg.field_B[var23Lifetime2] = -2147483648;
                } else {
                  a.field_t[var23Lifetime2] = var21Lifetime2 + var27Lifetime1 / var29Lifetime1;
                  ph.field_x[var23Lifetime2] = var22Lifetime2 + var28Lifetime1 / var29Lifetime1;
                  if (var7_int > var29Lifetime1) {
                    var7_int = var29Lifetime1;
                  }
                  if (var8 < var29Lifetime1) {
                    var8 = var29Lifetime1;
                  }
                  dg.field_B[var23Lifetime2] = var29Lifetime1;
                }
                if (param5) {
                  gi.field_c[var23Lifetime2] = var27Lifetime1 >> sf.field_O;
                  el.field_A[var23Lifetime2] = var28Lifetime1 >> sf.field_O;
                  hi.field_i[var23Lifetime2] = var29Lifetime1;
                }
                var23Lifetime2++;
                continue;
              }
            } else {
              if (param1.field_r != null &&
                null != param1.field_j &&
                null != param1.field_g &&
                null != param1.field_A &&
                param1.field_L != null &&
                null != param1.field_b &&
                param1.field_E != null &&
                null != param1.field_I &&
                param1.field_f != null) {
                var23Lifetime2 = 0;
                while (!(param1.field_u <= var23Lifetime2)) {
                  var24Lifetime1 = param1.field_r[var23Lifetime2];
                  var25Lifetime1 = param1.field_j[var23Lifetime2];
                  var26Lifetime1 = param1.field_g[var23Lifetime2];
                  a.field_s[var23Lifetime2] = var9 + (var24Lifetime1 * var12 - (-(var15 * var25Lifetime1) - var26Lifetime1 * var18) >> 16);
                  cd.field_q[var23Lifetime2] = var10 + (var25Lifetime1 * var16 + var24Lifetime1 * var13 + var19 * var26Lifetime1 >> 16);
                  ia.field_j[var23Lifetime2] = (var17 * var25Lifetime1 + (var14 * var24Lifetime1 + var20 * var26Lifetime1) >> 16) + var11;
                  var24Lifetime1 = param1.field_A[var23Lifetime2];
                  var25Lifetime1 = param1.field_L[var23Lifetime2];
                  var26Lifetime1 = param1.field_b[var23Lifetime2];
                  cc.field_j[var23Lifetime2] = var9 + (var24Lifetime1 * var12 - (-(var25Lifetime1 * var15) - var18 * var26Lifetime1) >> 16);
                  jk.field_t[var23Lifetime2] = var10 + (var19 * var26Lifetime1 + var24Lifetime1 * var13 + var25Lifetime1 * var16 >> 16);
                  ve.field_N[var23Lifetime2] = (var14 * var24Lifetime1 + var25Lifetime1 * var17 + var26Lifetime1 * var20 >> 16) + var11;
                  var24Lifetime1 = param1.field_E[var23Lifetime2];
                  var25Lifetime1 = param1.field_I[var23Lifetime2];
                  var26Lifetime1 = param1.field_f[var23Lifetime2];
                  cf.field_b[var23Lifetime2] = (var25Lifetime1 * var15 + (var24Lifetime1 * var12 + var18 * var26Lifetime1) >> 16) + var9;
                  sd.field_e[var23Lifetime2] = (var13 * var24Lifetime1 - (-(var25Lifetime1 * var16) - var19 * var26Lifetime1) >> 16) + var10;
                  fm.field_d[var23Lifetime2] = var11 + (var26Lifetime1 * var20 + var25Lifetime1 * var17 + var24Lifetime1 * var14 >> 16);
                  var23Lifetime2++;
                  if (var30 != 0) {
                    return;
                  }
                }
              }
              if (param3) {
                var9 = param0[3];
                var10 = param0[4];
                var11 = param0[5];
                var12 = param0[6];
                var13 = param0[7];
                var14 = param0[8];
                var15 = param0[9];
                var16 = param0[10];
                var17 = param0[11];
                var18 = 0;
                while (!(var18 >= param1.field_w)) {
                  stackIn_68_0 = var18;
                  stackIn_68_1 = ee.field_g.length;
                  if (var30 != 0) {
                    break L3;
                  }
                  if (stackIn_68_0 >= stackIn_68_1) {
                    break;
                  }
                  var19 = param1.field_K[var18];
                  var20 = param1.field_H[var18];
                  var21Lifetime2 = param1.field_G[var18];
                  ee.field_g[var18] = var12 * var20 + (var9 * var19 + var21Lifetime2 * var15) >> 16;
                  cf.field_e[var18] = var16 * var21Lifetime2 + (var13 * var20 + var19 * var10) >> 16;
                  ue.field_H[var18] = var19 * var11 + var14 * var20 + var21Lifetime2 * var17 >> 16;
                  var18++;
                }
              }
              stackIn_68_0 = var7_int;
              stackIn_68_1 = -2147483648;
            }
            break;
          }
          mc.a(stackIn_68_0, stackIn_68_1, param1, param4, var8);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_73_0 = var7;
          stackIn_73_1 = new StringBuilder().append("bg.C(");
          if (param0 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          stackIn_77_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',');
          if (param1 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          stackIn_81_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_82_2 = "null";
          } else {
            stackIn_82_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_81_1).append(stackIn_82_2).append(')').toString());
        }
    }

    static {
        field_b = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_c = 0;
        field_d = "Name";
        field_a = null;
    }
}
