/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti {
    static String field_a;
    static ve field_b;

    final static void b(int param0) {
        int var1_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != 10) {
            field_a = (String) null;
          }
          if (tg.field_e < 224) {
            var1_int = tg.field_e % 32;
            pk.b(param0 + 104, 32 + tg.field_e - var1_int);
            if (!Vertigo2.field_L) {
              return;
            }
          }
          pk.b(param0 + 95, 256);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var1), "ti.G(" + param0 + ')');
        }
    }

    final static void a(boolean param0, r param1, int param2, r param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          fm.a(lk.field_a, fm.field_e, ca.field_f, ol.field_H, 12895, kb.field_c, rq.field_t, param0, ee.field_b, ja.field_e, ip.field_a, pn.field_N);
          kb.field_d = gk.a(param1, "lobby", "chatfilter", true);
          ba.field_f[1] = uo.field_j;
          ba.field_f[2] = vg.field_a;
          if (param2 != 4) {
            field_b = (ve) null;
          }
          ba.field_f[0] = lo.field_g;
          rq.a(li.field_e, param2 - 2, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("ti.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static String a(byte param0) {
        RuntimeException var1 = null;
        String stackIn_13_0 = null;
        Object stackIn_15_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -33) {
            ti.a((byte) -39);
          }
          if (!gl.field_o &&
            qf.field_b >= aj.field_h &&
            (ea.field_g + aj.field_h) > qf.field_b) {
            stackIn_13_0 = as.field_a;
            return stackIn_13_0;
          }
          stackIn_15_0 = null;
          return (String) (stackIn_15_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var1), "ti.D(" + param0 + ')');
        }
    }

    final static void c(int param0) {
        try {
          kk.b((byte) 112);
          if (param0 > -83) {
            field_b = (ve) null;
          }
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "ti.F(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 24260) {
          return;
        }
        try {
          field_b = null;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "ti.B(" + param0 + ')');
        }
    }

    final static boolean a(int param0, boolean param1) {
        RuntimeException var2 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_18_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 0) {
            stackIn_7_0 = ((1 + param0) % 4 == 0);
            return stackIn_7_0;
          }
          if (param1) {
            return true;
          }
          if (param0 < 1582) {
            stackIn_18_0 = (param0 % 4 == 0);
            return stackIn_18_0;
          }
          if (param0 % 4 != 0) {
            return false;
          }
          if (param0 % 100 != 0) {
            return true;
          }
          if (param0 % 400 == 0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2), "ti.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int[] param0, byte param1, boolean param2, boolean param3, boolean param4, int[] param5, jp param6) {
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
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
        var30 = Vertigo2.field_L ? 1 : 0;
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
          var13 = param0[5] * var26 + (var25 * param0[4] + var24 * param0[3]) >> 14;
          var29 = param5[11] >> 2;
          var12 = param0[5] * var23 + (param0[4] * var22 + param0[3] * var21) >> 14;
          var14 = var29 * param0[5] + var28 * param0[4] + param0[3] * var27 >> 14;
          var18 = param0[11] * var23 + (param0[9] * var21 + var22 * param0[10]) >> 14;
          var16 = var26 * param0[8] + param0[7] * var25 + param0[6] * var24 >> 14;
          var15 = param0[7] * var22 + param0[6] * var21 + var23 * param0[8] >> 14;
          var19 = param0[11] * var26 + (param0[10] * var25 + param0[9] * var24) >> 14;
          var17 = param0[6] * var27 - (-(param0[7] * var28) - param0[8] * var29) >> 14;
          var20 = var28 * param0[10] + (param0[9] * var27 + var29 * param0[11]) >> 14;
          var21 = param0[0] - param5[0];
          var22 = param0[1] - param5[1];
          var23 = -param5[2] + param0[2];
          var9 = var23 * param5[5] + param5[3] * var21 + var22 * param5[4] >> -hi.field_j + 16;
          var10 = param5[8] * var23 + (param5[6] * var21 + var22 * param5[7]) >> -hi.field_j + 16;
          var11 = param5[11] * var23 + param5[9] * var21 + var22 * param5[10] >> 16;
          var21 = oo.field_l;
          if (param1 != -53) {
            return;
          }
          var22 = oo.field_e;
          var23 = 0;
          L1: while (true) {
            if (var23 < param6.field_F) {
              var24 = param6.field_I[var23];
              var25 = param6.field_r[var23];
              var26 = param6.field_m[var23];
              var27 = (var26 * var18 + var15 * var25 + var12 * var24 >> 16 - hi.field_j) + var9;
              var28 = var10 + (var13 * var24 + var25 * var16 + var19 * var26 >> 16 - hi.field_j);
              var29 = var11 + (var20 * var26 + var25 * var17 + var14 * var24 >> 16);
              stackIn_62_0 = 50;
              stackIn_62_1 = var29;
              if (var30 != 0) {
                if (stackIn_62_0 < stackIn_62_1) {
                  if (var18 >= pk.field_w.length) {
                    break L1;
                  }
                  var19 = param6.field_h[var18];
                  var20 = param6.field_O[var18];
                  var21 = param6.field_a[var18];
                  pk.field_w[var18] = var21 * var15 + var20 * var12 + var19 * var9 >> 16;
                  dp.field_A[var18] = var13 * var20 + var19 * var10 + var21 * var16 >> 16;
                  dh.field_d[var18] = var17 * var21 + var14 * var20 + var11 * var19 >> 16;
                  var18++;
                  break L1;
                }
                break L1;
              }
              if (stackIn_62_0 <= stackIn_62_1) {
                nj.field_a[var23] = var27 / var29 + var21;
                ml.field_t[var23] = var22 + var28 / var29;
                pk.field_v[var23] = var29;
                if (var8 < var29) {
                  var8 = var29;
                }
                if (var29 < var7_int) {
                  var7_int = var29;
                }
              } else {
                pk.field_v[var23] = -2147483648;
              }
              if (param3) {
                te.field_F[var23] = var27 >> hi.field_j;
                fa.field_u[var23] = var28 >> hi.field_j;
                ea.field_h[var23] = var29;
              }
              var23++;
              continue;
            }
            boolean decompiledFrameCompleted0 = true;
            if (param6.field_A != null &&
              null != param6.field_z &&
              null != param6.field_y &&
              param6.field_s != null &&
              null != param6.field_l &&
              param6.field_v != null &&
              param6.field_f != null &&
              null != param6.field_b &&
              param6.field_M != null) {
              var23 = 0;
              while (!(var23 >= param6.field_w)) {
                var24 = param6.field_A[var23];
                var25 = param6.field_z[var23];
                var26 = param6.field_y[var23];
                fq.field_b[var23] = var9 + (var26 * var18 + var24 * var12 + var25 * var15 >> 16);
                fd.field_t[var23] = var10 + (var16 * var25 + (var24 * var13 + var19 * var26) >> 16);
                wq.field_G[var23] = var11 + (var26 * var20 + var25 * var17 + var24 * var14 >> 16);
                var24 = param6.field_s[var23];
                var25 = param6.field_l[var23];
                var26 = param6.field_v[var23];
                jb.field_H[var23] = var9 + (var26 * var18 + (var12 * var24 + var25 * var15) >> 16);
                fh.field_u[var23] = var10 + (var24 * var13 - (-(var25 * var16) - var26 * var19) >> 16);
                ek.field_y[var23] = (var20 * var26 + (var17 * var25 + var14 * var24) >> 16) + var11;
                var24 = param6.field_f[var23];
                var25 = param6.field_b[var23];
                var26 = param6.field_M[var23];
                ne.field_O[var23] = var9 + (var18 * var26 + var12 * var24 + var15 * var25 >> 16);
                mg.field_J[var23] = var10 + (var13 * var24 + (var16 * var25 + var19 * var26) >> 16);
                nf.field_u[var23] = (var26 * var20 + var14 * var24 + var25 * var17 >> 16) + var11;
                var23++;
                if (var30 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
            }
            if (decompiledFrameCompleted0) {
              if (!param4) {
                break L1;
              }
              var9 = param0[3];
              var10 = param0[4];
              var11 = param0[5];
              var12 = param0[6];
              var13 = param0[7];
              var14 = param0[8];
              var15 = param0[9];
              var16 = param0[10];
              var17 = param0[11];
            }
            var18 = 0;
            do {
              stackIn_62_0 = ~param6.field_K;
              stackIn_62_1 = ~var18;
              if (stackIn_62_0 >= stackIn_62_1) {
                break;
              }
              if (var18 >= pk.field_w.length) {
                break;
              }
              var19 = param6.field_h[var18];
              var20 = param6.field_O[var18];
              var21 = param6.field_a[var18];
              pk.field_w[var18] = var21 * var15 + var20 * var12 + var19 * var9 >> 16;
              dp.field_A[var18] = var13 * var20 + var19 * var10 + var21 * var16 >> 16;
              dh.field_d[var18] = var17 * var21 + var14 * var20 + var11 * var19 >> 16;
              var18++;
            } while (var30 == 0);
            break;
          }
          wl.a(param6, param2, var7_int, 112, var8);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_72_0 = var7;
          stackIn_72_1 = new StringBuilder().append("ti.A(");
          if (param0 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_76_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          stackIn_80_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',');
          if (param6 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(')').toString());
        }
    }

    static {
        field_a = "Invite";
        field_b = new ve(4, 1, 1, 1);
    }
}
