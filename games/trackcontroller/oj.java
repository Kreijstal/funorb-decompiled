/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj {
    static java.security.SecureRandom field_b;
    static ja field_d;
    static String field_c;
    static aa field_a;

    final static void a(int param0, boolean param1, boolean param2, pf param3, int[] param4, int[] param5, boolean param6) {
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
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
        var30 = TrackController.field_F ? 1 : 0;
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
          var29 = param5[11] >> 2;
          var13 = param4[4] * var25 + (param4[3] * var24 + var26 * param4[5]) >> 14;
          var12 = param4[3] * var21 + (var22 * param4[4] + var23 * param4[5]) >> 14;
          var17 = param4[6] * var27 + param4[7] * var28 + var29 * param4[8] >> 14;
          var20 = var29 * param4[11] + var27 * param4[param0] + var28 * param4[10] >> 14;
          var15 = var23 * param4[8] + param4[7] * var22 + param4[6] * var21 >> 14;
          var14 = var29 * param4[5] + (param4[4] * var28 + param4[3] * var27) >> 14;
          var16 = param4[7] * var25 + (var24 * param4[6] + var26 * param4[8]) >> 14;
          var19 = param4[9] * var24 + var25 * param4[10] + var26 * param4[11] >> 14;
          var18 = param4[11] * var23 + param4[10] * var22 + var21 * param4[9] >> 14;
          var21Lifetime1 = param4[0] - param5[0];
          var22Lifetime1 = param4[1] - param5[1];
          var23Lifetime1 = param4[2] - param5[2];
          var9 = var21Lifetime1 * param5[3] + (var22Lifetime1 * param5[4] + var23Lifetime1 * param5[5]) >> 16 - wi.field_b;
          var11 = var23Lifetime1 * param5[11] + param5[9] * var21Lifetime1 + param5[10] * var22Lifetime1 >> 16;
          var10 = var21Lifetime1 * param5[6] + (var22Lifetime1 * param5[7] + var23Lifetime1 * param5[8]) >> -wi.field_b + 16;
          var21Lifetime2 = ig.field_h;
          var22Lifetime2 = ig.field_a;
          var23Lifetime2 = 0;
          L2: while (true) {
            if (param3.field_q > var23Lifetime2) {
              var24Lifetime1 = param3.field_y[var23Lifetime2];
              var25Lifetime1 = param3.field_o[var23Lifetime2];
              var26Lifetime1 = param3.field_S[var23Lifetime2];
              var27Lifetime1 = var9 + (var18 * var26Lifetime1 + (var15 * var25Lifetime1 + var24Lifetime1 * var12) >> 16 - wi.field_b);
              var28Lifetime1 = var10 + (var26Lifetime1 * var19 + (var24Lifetime1 * var13 + var16 * var25Lifetime1) >> 16 - wi.field_b);
              var29Lifetime1 = (var20 * var26Lifetime1 + var24Lifetime1 * var14 + var25Lifetime1 * var17 >> 16) + var11;
              stackIn_62_0 = ~var29Lifetime1;
              stackIn_62_1 = -51;
              if (var30 == 0) {
                if (stackIn_62_0 > stackIn_62_1) {
                  od.field_c[var23Lifetime2] = -2147483648;
                } else {
                  qa.field_b[var23Lifetime2] = var21Lifetime2 + var27Lifetime1 / var29Lifetime1;
                  ui.field_r[var23Lifetime2] = var28Lifetime1 / var29Lifetime1 + var22Lifetime2;
                  if (var8 < var29Lifetime1) {
                    var8 = var29Lifetime1;
                  }
                  od.field_c[var23Lifetime2] = var29Lifetime1;
                  if (var7_int > var29Lifetime1) {
                    var7_int = var29Lifetime1;
                  }
                }
                if (param6) {
                  bg.field_a[var23Lifetime2] = var27Lifetime1 >> wi.field_b;
                  pl.field_c[var23Lifetime2] = var28Lifetime1 >> wi.field_b;
                  la.field_p[var23Lifetime2] = var29Lifetime1;
                }
                var23Lifetime2++;
                continue;
              }
            } else {
              if (null != param3.field_L &&
                param3.field_h != null &&
                param3.field_t != null &&
                param3.field_f != null &&
                param3.field_D != null &&
                param3.field_B != null &&
                null != param3.field_v &&
                param3.field_z != null &&
                null != param3.field_s) {
                var23Lifetime2 = 0;
                while (!(param3.field_E <= var23Lifetime2)) {
                  var24Lifetime1 = param3.field_L[var23Lifetime2];
                  var25Lifetime1 = param3.field_h[var23Lifetime2];
                  var26Lifetime1 = param3.field_t[var23Lifetime2];
                  vj.field_c[var23Lifetime2] = (var25Lifetime1 * var15 + var24Lifetime1 * var12 + var26Lifetime1 * var18 >> 16) + var9;
                  id.field_k[var23Lifetime2] = (var25Lifetime1 * var16 + (var24Lifetime1 * var13 + var19 * var26Lifetime1) >> 16) + var10;
                  sd.field_d[var23Lifetime2] = (var14 * var24Lifetime1 - (-(var17 * var25Lifetime1) - var20 * var26Lifetime1) >> 16) + var11;
                  var24Lifetime1 = param3.field_f[var23Lifetime2];
                  var25Lifetime1 = param3.field_D[var23Lifetime2];
                  var26Lifetime1 = param3.field_B[var23Lifetime2];
                  u.field_l[var23Lifetime2] = (var26Lifetime1 * var18 + (var25Lifetime1 * var15 + var24Lifetime1 * var12) >> 16) + var9;
                  rd.field_s[var23Lifetime2] = (var26Lifetime1 * var19 + (var16 * var25Lifetime1 + var13 * var24Lifetime1) >> 16) + var10;
                  lf.field_X[var23Lifetime2] = (var25Lifetime1 * var17 + (var14 * var24Lifetime1 + var26Lifetime1 * var20) >> 16) + var11;
                  var24Lifetime1 = param3.field_v[var23Lifetime2];
                  var25Lifetime1 = param3.field_z[var23Lifetime2];
                  var26Lifetime1 = param3.field_s[var23Lifetime2];
                  nb.field_s[var23Lifetime2] = (var18 * var26Lifetime1 + var12 * var24Lifetime1 + var25Lifetime1 * var15 >> 16) + var9;
                  jb.field_b[var23Lifetime2] = var10 + (var25Lifetime1 * var16 + (var13 * var24Lifetime1 + var26Lifetime1 * var19) >> 16);
                  ri.field_B[var23Lifetime2] = (var26Lifetime1 * var20 + (var17 * var25Lifetime1 + var14 * var24Lifetime1) >> 16) + var11;
                  var23Lifetime2++;
                  if (var30 != 0) {
                    return;
                  }
                }
              }
              if (param1) {
                var9 = param4[3];
                var10 = param4[4];
                var11 = param4[5];
                var12 = param4[6];
                var13 = param4[7];
                var14 = param4[8];
                var15 = param4[9];
                var16 = param4[10];
                var17 = param4[11];
                var18 = 0;
                while (!(var18 >= param3.field_l)) {
                  stackIn_62_0 = wf.field_c.length;
                  stackIn_62_1 = var18;
                  if (var30 != 0) {
                    break L2;
                  }
                  if (stackIn_62_0 <= stackIn_62_1) {
                    break;
                  }
                  var19 = param3.field_j[var18];
                  var20 = param3.field_R[var18];
                  var21Lifetime2 = param3.field_b[var18];
                  wf.field_c[var18] = var15 * var21Lifetime2 + (var9 * var19 + var20 * var12) >> 16;
                  ch.field_y[var18] = var21Lifetime2 * var16 + var10 * var19 + var20 * var13 >> 16;
                  ea.field_w[var18] = var21Lifetime2 * var17 + var20 * var14 + var11 * var19 >> 16;
                  var18++;
                }
              }
              stackIn_62_0 = -106;
              stackIn_62_1 = var7_int;
            }
            break;
          }
          ve.a(stackIn_62_0, stackIn_62_1, var8, param3, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_67_0 = var7;
          stackIn_67_1 = new StringBuilder().append("oj.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          stackIn_71_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',');
          if (param4 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          stackIn_75_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',');
          if (param5 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param6).append(')').toString());
        }
    }

    final static hk a(String param0, int param1, int param2) {
        qc var3 = null;
        RuntimeException var3_ref = null;
        qc stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new qc();
          if (param2 != 0) {
            field_d = (ja) null;
          }
          ((hk) ((Object) var3)).field_b = param0;
          ((hk) ((Object) var3)).field_c = param1;
          stackIn_4_0 = var3;
          return (hk) ((Object) stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("oj.C(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (null == og.field_rb) {
            return;
          }
          r.a(-32652, og.field_rb);
          og.field_rb.a(rg.field_c, 5474);
          og.field_rb = null;
          if (param0 > -74) {
            field_b = (java.security.SecureRandom) null;
          }
          if (tk.field_u != null) {
            tk.field_u.b(6391);
          }
          ki.field_f.requestFocus();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var1), "oj.D(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        try {
          field_c = null;
          field_a = null;
          field_b = null;
          int var1_int = -25 % ((param0 + 56) / 60);
          field_d = null;
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "oj.B(" + param0 + ')');
        }
    }

    static {
        field_c = "Connection lost - attempting to reconnect";
        field_a = new aa(15, 0, 1, 0);
    }
}
