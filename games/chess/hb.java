/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb {
    static km[][] field_b;
    static ci field_a;

    final static jd[] a(int param0) {
        RuntimeException var1 = null;
        jd[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 2) {
            field_a = (ci) null;
          }
          stackIn_4_0 = new jd[]{ph.field_g, le.field_g, dn.field_f};
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var1), "hb.B(" + param0 + ')');
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
          return;
        }
        try {
          field_b = (km[][]) null;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "hb.C(" + param0 + ')');
        }
    }

    final static void a(boolean param0, int[] param1, byte param2, int[] param3, boolean param4, em param5, boolean param6) {
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
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
        var30 = Chess.field_G;
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
          var13 = var26 * param3[5] + (param3[3] * var24 + var25 * param3[4]) >> 14;
          var12 = var23 * param3[5] + (param3[4] * var22 + var21 * param3[3]) >> 14;
          var17 = var29 * param3[8] + param3[7] * var28 + param3[6] * var27 >> 14;
          var15 = param3[6] * var21 - (-(param3[7] * var22) - var23 * param3[8]) >> 14;
          var18 = param3[10] * var22 + (var21 * param3[9] + param3[11] * var23) >> 14;
          var19 = param3[11] * var26 + var24 * param3[9] + var25 * param3[10] >> 14;
          var14 = param3[4] * var28 + var27 * param3[3] + param3[5] * var29 >> 14;
          var16 = param3[6] * var24 + param3[7] * var25 + var26 * param3[8] >> 14;
          if (param2 != -98) {
            field_a = (ci) null;
          }
          var20 = var28 * param3[10] + (var27 * param3[9] + param3[11] * var29) >> 14;
          var21 = param3[0] - param1[0];
          var22 = param3[1] - param1[1];
          var23 = -param1[2] + param3[2];
          var9 = var23 * param1[5] + (var22 * param1[4] + param1[3] * var21) >> 16 - pd.field_Tb;
          var10 = param1[6] * var21 - (-(var22 * param1[7]) - var23 * param1[8]) >> 16 - pd.field_Tb;
          var11 = param1[9] * var21 + param1[10] * var22 + var23 * param1[11] >> 16;
          var21 = nh.field_n;
          var22 = nh.field_f;
          var23 = 0;
          L2: while (true) {
            if (var23 < param5.field_d) {
              var24 = param5.field_z[var23];
              var25 = param5.field_a[var23];
              var26 = param5.field_H[var23];
              var27 = (var25 * var15 + (var24 * var12 + var18 * var26) >> 16 - pd.field_Tb) + var9;
              var28 = var10 + (var16 * var25 + (var13 * var24 + var26 * var19) >> -pd.field_Tb + 16);
              var29 = (var26 * var20 + (var24 * var14 + var25 * var17) >> 16) + var11;
              stackIn_63_0 = ~var29;
              stackIn_63_1 = -51;
              if (var30 != 0) {
                if (stackIn_63_0 > stackIn_63_1) {
                  if (lk.field_c.length <= var18) {
                    break L2;
                  }
                  var19 = param5.field_b[var18];
                  var20 = param5.field_f[var18];
                  var21 = param5.field_F[var18];
                  lk.field_c[var18] = var20 * var12 + (var9 * var19 + var15 * var21) >> 16;
                  ab.field_r[var18] = var19 * var10 + var20 * var13 + var16 * var21 >> 16;
                  pa.field_o[var18] = var21 * var17 + var14 * var20 + var19 * var11 >> 16;
                  var18++;
                  break L2;
                }
                break L2;
              }
              if (stackIn_63_0 <= stackIn_63_1) {
                qm.field_c[var23] = var27 / var29 + var21;
                tc.field_w[var23] = var28 / var29 + var22;
                jd.field_i[var23] = var29;
                if (var29 < var7_int) {
                  var7_int = var29;
                }
                if (var29 > var8) {
                  var8 = var29;
                }
              } else {
                jd.field_i[var23] = -2147483648;
              }
              if (param0) {
                ve.field_Gb[var23] = var27 >> pd.field_Tb;
                ob.field_u[var23] = var28 >> pd.field_Tb;
                qi.field_p[var23] = var29;
              }
              var23++;
              continue;
            }
            boolean decompiledFrameCompleted0 = true;
            if (param5.field_q != null &&
              null != param5.field_Q &&
              param5.field_w != null &&
              null != param5.field_h &&
              param5.field_L != null &&
              null != param5.field_u &&
              param5.field_p != null &&
              null != param5.field_D &&
              null != param5.field_s) {
              var23 = 0;
              while (!(var23 >= param5.field_e)) {
                var24 = param5.field_q[var23];
                var25 = param5.field_Q[var23];
                var26 = param5.field_w[var23];
                wj.field_d[var23] = (var25 * var15 + var24 * var12 + var26 * var18 >> 16) + var9;
                he.field_Gb[var23] = (var25 * var16 + (var24 * var13 + var19 * var26) >> 16) + var10;
                qh.field_e[var23] = var11 + (var25 * var17 + var24 * var14 + var20 * var26 >> 16);
                var24 = param5.field_h[var23];
                var25 = param5.field_L[var23];
                var26 = param5.field_u[var23];
                db.field_n[var23] = var9 + (var26 * var18 + (var15 * var25 + var12 * var24) >> 16);
                t.field_M[var23] = var10 + (var26 * var19 + var24 * var13 + var16 * var25 >> 16);
                uc.field_e[var23] = var11 + (var25 * var17 + (var24 * var14 + var26 * var20) >> 16);
                var24 = param5.field_p[var23];
                var25 = param5.field_D[var23];
                var26 = param5.field_s[var23];
                l.field_n[var23] = var9 + (var26 * var18 + (var12 * var24 + var15 * var25) >> 16);
                wk.field_d[var23] = var10 + (var26 * var19 + var13 * var24 + var25 * var16 >> 16);
                ld.field_p[var23] = (var14 * var24 + (var17 * var25 + var20 * var26) >> 16) + var11;
                var23++;
                if (var30 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
            }
            if (decompiledFrameCompleted0) {
              if (!param6) {
                break L2;
              }
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
            var18 = 0;
            do {
              stackIn_63_0 = ~var18;
              stackIn_63_1 = ~param5.field_t;
              if (stackIn_63_0 <= stackIn_63_1) {
                break;
              }
              if (lk.field_c.length <= var18) {
                break;
              }
              var19 = param5.field_b[var18];
              var20 = param5.field_f[var18];
              var21 = param5.field_F[var18];
              lk.field_c[var18] = var20 * var12 + (var9 * var19 + var15 * var21) >> 16;
              ab.field_r[var18] = var19 * var10 + var20 * var13 + var16 * var21 >> 16;
              pa.field_o[var18] = var21 * var17 + var14 * var20 + var19 * var11 >> 16;
              var18++;
            } while (var30 == 0);
            break;
          }
          ja.a(param5, var8, (byte) -100, var7_int, param4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_73_0 = var7;
          stackIn_73_1 = new StringBuilder().append("hb.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          stackIn_77_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          stackIn_81_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_82_2 = "null";
          } else {
            stackIn_82_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_81_1).append(stackIn_82_2).append(',').append(param6).append(')').toString());
        }
    }

    final static void a(String param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -118) {
            return;
          }
          hc.field_b = param0;
          uk.a(false, 12);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("hb.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_b = new km[2][7];
    }
}
