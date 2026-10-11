/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ck {
    static String field_b;
    static bi field_a;

    final static void a(int param0, double param1, double param2, double param3) {
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        var11 = Confined.field_J ? 1 : 0;
        try {
          if (param0 != -1942300510) {
            field_a = (bi) null;
          }
          var7_int = (int)(325.94932345220167 * param1);
          var8 = (int)(param2 * 325.94932345220167);
          var9 = (int)(param3 * 325.94932345220167);
          var10 = 1;
          while (var10 < 4) {
            bh.field_b[-1 + var10] = ti.field_m[va.a(2047, (var10 * 4 + 3) * var7_int)] >> 2;
            bh.field_b[2 + var10] = ti.field_m[va.a((3 + var10 * 4) * var8, 2047)] >> 2;
            bh.field_b[5 + var10] = ti.field_m[va.a(2047, var9 * (3 + 4 * var10))] >> 2;
            bh.field_b[8 + var10] = ti.field_j[va.a(2047, var7_int * (3 + var10 * 4))] >> 2;
            bh.field_b[var10 + 11] = ti.field_j[va.a(2047, var8 * (var10 * 4 + 3))] >> 2;
            bh.field_b[var10 + 14] = ti.field_j[va.a(var9 * (var10 * 4 + 3), 2047)] >> 2;
            var10++;
            if (var11 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var7), "ck.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int[] param0, int param1, boolean param2, int[] param3, boolean param4, boolean param5, rm param6) {
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
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
        int var31 = 0;
        int stackIn_59_0Lifetime1;
        int stackIn_59_1Lifetime1;
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
        var31 = Confined.field_J ? 1 : 0;
        try {
          var7_int = 2147483647;
          var8 = -2147483648;
          var21 = param0[3] >> 2;
          var22 = param0[4] >> 2;
          var23 = param0[5] >> 2;
          var24 = param0[6] >> 2;
          var25 = param0[7] >> 2;
          var26 = param0[8] >> 2;
          var27 = param0[9] >> 2;
          var28 = param0[10] >> 2;
          var12 = var22 * param3[4] + (var21 * param3[3] + param3[5] * var23) >> 14;
          var13 = param3[5] * var26 + (var25 * param3[4] + param3[3] * var24) >> 14;
          var29 = param0[11] >> 2;
          var14 = param3[3] * var27 + var28 * param3[4] + var29 * param3[5] >> 14;
          var15 = var23 * param3[8] + param3[7] * var22 + var21 * param3[6] >> 14;
          var30 = 34 % ((25 - param1) / 62);
          var20 = var29 * param3[11] + var28 * param3[10] + var27 * param3[9] >> 14;
          var19 = param3[11] * var26 + (param3[10] * var25 + var24 * param3[9]) >> 14;
          var16 = var26 * param3[8] + var24 * param3[6] + var25 * param3[7] >> 14;
          var18 = var22 * param3[10] + var21 * param3[9] + var23 * param3[11] >> 14;
          var17 = var29 * param3[8] + (param3[7] * var28 + var27 * param3[6]) >> 14;
          var21Lifetime1 = param3[0] - param0[0];
          var22Lifetime1 = -param0[1] + param3[1];
          var23Lifetime1 = -param0[2] + param3[2];
          var9 = var22Lifetime1 * param0[4] + var21Lifetime1 * param0[3] + param0[5] * var23Lifetime1 >> 16 - pc.field_h;
          var10 = var23Lifetime1 * param0[8] + var21Lifetime1 * param0[6] + param0[7] * var22Lifetime1 >> -pc.field_h + 16;
          var11 = param0[10] * var22Lifetime1 + (var21Lifetime1 * param0[9] + param0[11] * var23Lifetime1) >> 16;
          var21Lifetime2 = ti.field_k;
          var22Lifetime2 = ti.field_f;
          var23Lifetime2 = 0;
          L1: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (param6.field_b > var23Lifetime2) {
              var24Lifetime1 = param6.field_x[var23Lifetime2];
              var25Lifetime1 = param6.field_v[var23Lifetime2];
              var26Lifetime1 = param6.field_F[var23Lifetime2];
              var27Lifetime1 = (var24Lifetime1 * var12 - (-(var15 * var25Lifetime1) - var26Lifetime1 * var18) >> 16 - pc.field_h) + var9;
              var28Lifetime1 = (var26Lifetime1 * var19 + var16 * var25Lifetime1 + var13 * var24Lifetime1 >> -pc.field_h + 16) + var10;
              var29Lifetime1 = var11 + (var24Lifetime1 * var14 + var25Lifetime1 * var17 + var20 * var26Lifetime1 >> 16);
              stackIn_59_0 = -51;
              stackIn_59_1 = ~var29Lifetime1;
              if (var31 != 0) {
                if (stackIn_59_0 < stackIn_59_1) {
                  stackIn_68_0 = ~var18;
                  stackIn_68_1 = ~tf.field_m.length;
                  break L1;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (stackIn_59_0 >= stackIn_59_1) {
                  qf.field_a[var23Lifetime2] = var27Lifetime1 / var29Lifetime1 + var21Lifetime2;
                  db.field_x[var23Lifetime2] = var22Lifetime2 + var28Lifetime1 / var29Lifetime1;
                  if (var7_int > var29Lifetime1) {
                    var7_int = var29Lifetime1;
                  }
                  if (var8 < var29Lifetime1) {
                    var8 = var29Lifetime1;
                  }
                  cj.field_b[var23Lifetime2] = var29Lifetime1;
                } else {
                  cj.field_b[var23Lifetime2] = -2147483648;
                }
                if (param2) {
                  tg.field_T[var23Lifetime2] = var27Lifetime1 >> pc.field_h;
                  wl.field_d[var23Lifetime2] = var28Lifetime1 >> pc.field_h;
                  nm.field_C[var23Lifetime2] = var29Lifetime1;
                }
                var23Lifetime2++;
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              boolean decompiledFrameCompleted0 = true;
              if (null != param6.field_d &&
                null != param6.field_M &&
                null != param6.field_i &&
                param6.field_H != null &&
                null != param6.field_N &&
                param6.field_Q != null &&
                param6.field_c != null &&
                param6.field_q != null &&
                param6.field_n != null) {
                var23Lifetime2 = 0;
                while (!(var23Lifetime2 >= param6.field_w)) {
                  var24Lifetime1Lifetime1 = param6.field_d[var23Lifetime2];
                  var25Lifetime1Lifetime1 = param6.field_M[var23Lifetime2];
                  var26Lifetime1Lifetime1 = param6.field_i[var23Lifetime2];
                  jd.field_e[var23Lifetime2] = (var18 * var26Lifetime1Lifetime1 + (var25Lifetime1Lifetime1 * var15 + var12 * var24Lifetime1Lifetime1) >> 16) + var9;
                  gm.field_bb[var23Lifetime2] = (var25Lifetime1Lifetime1 * var16 + (var13 * var24Lifetime1Lifetime1 + var26Lifetime1Lifetime1 * var19) >> 16) + var10;
                  mi.field_c[var23Lifetime2] = (var26Lifetime1Lifetime1 * var20 + var17 * var25Lifetime1Lifetime1 + var14 * var24Lifetime1Lifetime1 >> 16) + var11;
                  var24Lifetime1Lifetime1 = param6.field_H[var23Lifetime2];
                  var25Lifetime1Lifetime1 = param6.field_N[var23Lifetime2];
                  var26Lifetime1Lifetime1 = param6.field_Q[var23Lifetime2];
                  lb.field_u[var23Lifetime2] = var9 + (var18 * var26Lifetime1Lifetime1 + var12 * var24Lifetime1Lifetime1 + var25Lifetime1Lifetime1 * var15 >> 16);
                  oh.field_a[var23Lifetime2] = var10 + (var26Lifetime1Lifetime1 * var19 + (var24Lifetime1Lifetime1 * var13 + var16 * var25Lifetime1Lifetime1) >> 16);
                  mf.field_g[var23Lifetime2] = var11 + (var24Lifetime1Lifetime1 * var14 - (-(var17 * var25Lifetime1Lifetime1) - var26Lifetime1Lifetime1 * var20) >> 16);
                  var24Lifetime1Lifetime1 = param6.field_c[var23Lifetime2];
                  var25Lifetime1Lifetime1 = param6.field_q[var23Lifetime2];
                  var26Lifetime1Lifetime1 = param6.field_n[var23Lifetime2];
                  sc.field_i[var23Lifetime2] = var9 + (var18 * var26Lifetime1Lifetime1 + (var12 * var24Lifetime1Lifetime1 + var15 * var25Lifetime1Lifetime1) >> 16);
                  wa.field_d[var23Lifetime2] = (var26Lifetime1Lifetime1 * var19 + var25Lifetime1Lifetime1 * var16 + var24Lifetime1Lifetime1 * var13 >> 16) + var10;
                  ba.field_P[var23Lifetime2] = (var20 * var26Lifetime1Lifetime1 + var25Lifetime1Lifetime1 * var17 + var14 * var24Lifetime1Lifetime1 >> 16) + var11;
                  var23Lifetime2++;
                  if (var31 != 0) {
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
                  stackIn_59_0Lifetime1 = ~param6.field_g;
                  stackIn_59_1Lifetime1 = ~var18;
                  if (stackIn_59_0Lifetime1 >= stackIn_59_1Lifetime1) {
                    break;
                  }
                  stackIn_68_0 = ~var18;
                  stackIn_68_1 = ~tf.field_m.length;
                  if (var31 != 0) {
                    break L1;
                  }
                  if (stackIn_68_0 <= stackIn_68_1) {
                    break;
                  }
                  var19 = param6.field_E[var18];
                  var20 = param6.field_y[var18];
                  var21Lifetime2 = param6.field_r[var18];
                  tf.field_m[var18] = var20 * var12 + var9 * var19 + var21Lifetime2 * var15 >> 16;
                  sd.field_c[var18] = var19 * var10 + (var20 * var13 + var16 * var21Lifetime2) >> 16;
                  w.field_R[var18] = var14 * var20 + (var11 * var19 + var17 * var21Lifetime2) >> 16;
                  var18++;
                }
              }
            }
            stackIn_68_0 = -126;
            stackIn_68_1 = var7_int;
            break;
          }
          rc.$cfr$intArgs$a$c68ae6d2455d(stackIn_68_0, stackIn_68_1, param4, var8, param6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_73_0 = var7;
          stackIn_73_1 = new StringBuilder().append("ck.G(");
          if (param0 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          stackIn_77_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          stackIn_81_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_82_2 = "null";
          } else {
            stackIn_82_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_81_1).append(stackIn_82_2).append(')').toString());
        }
    }

    abstract int a(int param0);

    abstract void a(java.awt.Component param0, int param1);

    final static boolean a(boolean param0, CharSequence param1, boolean param2) {
        int var3_int = 0;
        int var4 = 0;
        boolean stackIn_17_0 = false;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Confined.field_J ? 1 : 0;
        try {
          if (!je.a(0, param0, param1)) {
            return false;
          }
          var3_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var3_int < param1.length())))) {
            stackIn_17_0 = og.a(-96, param1.charAt(var3_int));
            if (var4 == 0) {
              if (!stackIn_17_0) {
                return false;
              }
              var3_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_17_0 = param2;
          }
          if (stackIn_17_0) {
            ck.a((String) null, (byte) -10);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("ck.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(')').toString());
        }
    }

    final static va a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_11_0 = null;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        va stackIn_18_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Confined.field_J ? 1 : 0;
        try {
          var2_int = param0.length();
          var3 = 0;
          L1: while (true) {
            if (var2_int > var3) {
              var4 = param0.charAt(var3);
              stackIn_14_0 = ~var4;
              stackIn_14_1 = -49;
              if (var5 != 0) {
                break L1;
              }
              if (stackIn_14_0 <= stackIn_14_1 &&
                var4 <= 57) {
                var3++;
                continue;
              } else {
                stackIn_11_0 = null;
                return (va) (stackIn_11_0);
              }
            }
            stackIn_14_0 = param1;
            stackIn_14_1 = 126;
            break;
          }
          if (stackIn_14_0 < stackIn_14_1) {
            ck.a(35, (mi) null);
          }
          stackIn_18_0 = ql.field_k;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_22_0 = var2;
          stackIn_22_1 = new StringBuilder().append("ck.E(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    abstract void a(java.awt.Component param0, byte param1);

    public static void a(byte param0) {
        try {
          int var1_int = -88 % ((param0 - 34) / 37);
          field_b = null;
          field_a = null;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ck.H(" + param0 + ')');
        }
    }

    final static void a(int param0, mi param1) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        hb var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        rm var5 = null;
        int[] var6 = null;
        int var7 = 0;
        var7 = Confined.field_J ? 1 : 0;
        try {
          var2 = new hb(param1.a(param0 ^ -26592, "logo.fo3d", ""));
          var3 = var2.c(param0 ^ 26581);
          var2.i(8);
          im.field_a = ul.a(var2, 31662);
          Confined.field_K = new rm[var3];
          in.field_b = new int[var3][];
          var4 = 0;
          do {
            if (var4 >= var3) {
              if (param0 != 26613) {
                field_b = (String) null;
              }
              var2.j(116);
              break;
            }
            Confined.field_K[var4] = kc.a(30035, var2);
            var4++;
          } while (var7 == 0);
          var4 = 0;
          while (var3 > var4) {
            var5 = Confined.field_K[var4];
            var5.a(6, 1, 6, (byte) 56, 6);
            var5.b(27915);
            var6 = new int[]{var5.field_I + var5.field_O >> 1, var5.field_L + var5.field_e >> 1, var5.field_t + var5.field_s >> 1};
            in.field_b[var4] = var6;
            var5.a(-var6[1], -var6[2], 117, -var6[0]);
            var4++;
            if (var7 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_21_0 = var2_ref;
          stackIn_21_1 = new StringBuilder().append("ck.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    static {
        field_b = "Hold <%0> to charge, and release to fire";
    }
}
