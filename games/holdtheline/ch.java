/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ch extends hl {
    byte[] field_l;
    int field_j;
    static String[] field_t;
    el[] field_s;
    short[] field_q;
    static tk field_n;
    ik[] field_o;
    static float[] field_r;
    private int[] field_p;
    byte[] field_k;
    static ee field_i;
    static int field_m;
    byte[] field_v;
    static go field_u;

    final static void a(java.applet.Applet param0, byte param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException stackIn_10_0 = null;
          StringBuilder stackIn_10_1 = null;
          String stackIn_11_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              var2 = new java.net.URL(param0.getCodeBase(), "subscribe.ws");
              if (param1 < 8) {
                ch.a((byte) 36);
              }
              param0.getAppletContext().showDocument(ah.a(var2, param0, (byte) 69), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_10_0 = var2_ref2;
            stackIn_10_1 = new StringBuilder().append("ch.E(");
            if (param0 == null) {
              stackIn_11_2 = "null";
            } else {
              stackIn_11_2 = "{...}";
            }
            throw kk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(int param0, int[] param1, byte[] param2, ld param3) {
        int stackIn_23_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = HoldTheLine.field_D;
        try {
          var5_int = 1;
          var6 = 0;
          var8 = 57 / ((param0 + 27) / 58);
          var7 = null;
          var9 = 0;
          while (var9 < 128) {
            if (null == param2 ||
              param2[var9] != 0) {
              var10 = this.field_p[var9];
              if (var10 != 0) {
                if (~var10 != ~var6) {
                  var6 = var10;
                  var10--;
                  if (0 != (var10 & 1)) {
                    var7 = param3.a(param1, var10 >> 2, (byte) 115);
                  }
                  if (0 == (var10 & 1) ||
                    var11 != 0) {
                    var7 = param3.a(var10 >> 2, (byte) 127, param1);
                  }
                  if (null == var7) {
                    var5_int = 0;
                  }
                }
                if (var7 != null) {
                  this.field_s[var9] = (el) (var7);
                  this.field_p[var9] = 0;
                }
              }
            }
            var9++;
            if (var11 == 0) {
              continue;
            }
            break;
          }
          stackIn_23_0 = var5_int;
          return stackIn_23_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_27_0 = var5;
          stackIn_27_1 = new StringBuilder().append("ch.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param3 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    final static fn a(String param0, gn param1, int param2, gn param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        fn stackIn_2_0 = null;
        fn stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param3.c(param0, 3);
          var6 = param3.a(var5_int, param4, false);
          if (param2 == 14819) {
            stackIn_4_0 = fi.a(-17072, param1, param3, var6, var5_int);
            return stackIn_4_0;
          }
          stackIn_2_0 = (fn) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("ch.D(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param4 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 != -6) {
          return;
        }
        try {
          field_n = null;
          field_r = null;
          field_u = null;
          field_t = null;
          field_i = null;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "ch.G(" + param0 + ')');
        }
    }

    final static void a(int param0) {
        try {
          le.field_s = new float[8];
          if (param0 != 9) {
            field_t = (String[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "ch.F(" + param0 + ')');
        }
    }

    final static void a(int[] param0, boolean param1, int[] param2, byte param3, qk param4, boolean param5, boolean param6) {
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        int stackIn_72_0 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_82_2 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_86_2 = null;
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
        int stackIn_63_0Lifetime1;
        int stackIn_63_1Lifetime1;
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
        var30 = HoldTheLine.field_D;
        try {
          var7_int = 2147483647;
          var8 = -2147483648;
          if (param3 < 77) {
            field_u = (go) null;
          }
          var21 = param0[3] >> 2;
          var22 = param0[4] >> 2;
          var23 = param0[5] >> 2;
          var24 = param0[6] >> 2;
          var25 = param0[7] >> 2;
          var26 = param0[8] >> 2;
          var27 = param0[9] >> 2;
          var28 = param0[10] >> 2;
          var13 = param2[5] * var26 + (var24 * param2[3] + param2[4] * var25) >> 14;
          var12 = param2[4] * var22 + (var21 * param2[3] + var23 * param2[5]) >> 14;
          var29 = param0[11] >> 2;
          var20 = param2[11] * var29 + (param2[9] * var27 + var28 * param2[10]) >> 14;
          var16 = var24 * param2[6] + (param2[7] * var25 + param2[8] * var26) >> 14;
          var17 = param2[7] * var28 + param2[6] * var27 + param2[8] * var29 >> 14;
          var19 = var26 * param2[11] + (param2[9] * var24 + param2[10] * var25) >> 14;
          var18 = var23 * param2[11] + var21 * param2[9] + var22 * param2[10] >> 14;
          var14 = var28 * param2[4] + var27 * param2[3] + param2[5] * var29 >> 14;
          var15 = var22 * param2[7] + (var21 * param2[6] + var23 * param2[8]) >> 14;
          var21Lifetime1 = param2[0] - param0[0];
          var22Lifetime1 = param2[1] - param0[1];
          var23Lifetime1 = param2[2] - param0[2];
          var9 = var23Lifetime1 * param0[5] + var22Lifetime1 * param0[4] + var21Lifetime1 * param0[3] >> -il.field_c + 16;
          var10 = param0[8] * var23Lifetime1 + (var21Lifetime1 * param0[6] + param0[7] * var22Lifetime1) >> -il.field_c + 16;
          var11 = param0[11] * var23Lifetime1 + var21Lifetime1 * param0[9] + param0[10] * var22Lifetime1 >> 16;
          var21Lifetime2 = li.field_b;
          var22Lifetime2 = li.field_c;
          var23Lifetime2 = 0;
          L3: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (param4.field_u > var23Lifetime2) {
              var24Lifetime1 = param4.field_m[var23Lifetime2];
              var25Lifetime1 = param4.field_G[var23Lifetime2];
              var26Lifetime1 = param4.field_k[var23Lifetime2];
              var27Lifetime1 = (var18 * var26Lifetime1 + var12 * var24Lifetime1 + var15 * var25Lifetime1 >> -il.field_c + 16) + var9;
              var28Lifetime1 = (var16 * var25Lifetime1 + var13 * var24Lifetime1 + var26Lifetime1 * var19 >> 16 - il.field_c) + var10;
              var29Lifetime1 = (var26Lifetime1 * var20 + var14 * var24Lifetime1 + var17 * var25Lifetime1 >> 16) + var11;
              stackIn_63_0 = var29Lifetime1;
              stackIn_63_1 = 50;
              if (var30 != 0) {
                if (stackIn_63_0 > stackIn_63_1) {
                  stackIn_72_0 = kf.field_T.length;
                  break L3;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (stackIn_63_0 < stackIn_63_1) {
                  ff.field_c[var23Lifetime2] = -2147483648;
                } else {
                  gd.field_d[var23Lifetime2] = var21Lifetime2 + var27Lifetime1 / var29Lifetime1;
                  om.field_p[var23Lifetime2] = var22Lifetime2 + var28Lifetime1 / var29Lifetime1;
                  if (var8 < var29Lifetime1) {
                    var8 = var29Lifetime1;
                  }
                  if (var29Lifetime1 < var7_int) {
                    var7_int = var29Lifetime1;
                  }
                  ff.field_c[var23Lifetime2] = var29Lifetime1;
                }
                if (param6) {
                  uf.field_c[var23Lifetime2] = var27Lifetime1 >> il.field_c;
                  tl.field_z[var23Lifetime2] = var28Lifetime1 >> il.field_c;
                  sd.field_b[var23Lifetime2] = var29Lifetime1;
                }
                var23Lifetime2++;
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              if (null != param4.field_a &&
                param4.field_g != null &&
                null != param4.field_b &&
                null != param4.field_M &&
                null != param4.field_R &&
                param4.field_v != null &&
                param4.field_D != null &&
                null != param4.field_C &&
                param4.field_h != null) {
                var23Lifetime2 = 0;
                while (!(param4.field_J <= var23Lifetime2)) {
                  var24Lifetime1Lifetime1 = param4.field_a[var23Lifetime2];
                  var25Lifetime1Lifetime1 = param4.field_g[var23Lifetime2];
                  var26Lifetime1Lifetime1 = param4.field_b[var23Lifetime2];
                  ae.field_d[var23Lifetime2] = var9 + (var15 * var25Lifetime1Lifetime1 + var24Lifetime1Lifetime1 * var12 + var18 * var26Lifetime1Lifetime1 >> 16);
                  wb.field_e[var23Lifetime2] = (var26Lifetime1Lifetime1 * var19 + (var13 * var24Lifetime1Lifetime1 + var16 * var25Lifetime1Lifetime1) >> 16) + var10;
                  ba.field_a[var23Lifetime2] = var11 + (var26Lifetime1Lifetime1 * var20 + (var25Lifetime1Lifetime1 * var17 + var14 * var24Lifetime1Lifetime1) >> 16);
                  var24Lifetime1Lifetime1 = param4.field_M[var23Lifetime2];
                  var25Lifetime1Lifetime1 = param4.field_R[var23Lifetime2];
                  var26Lifetime1Lifetime1 = param4.field_v[var23Lifetime2];
                  jb.field_Y[var23Lifetime2] = var9 + (var15 * var25Lifetime1Lifetime1 + var12 * var24Lifetime1Lifetime1 + var18 * var26Lifetime1Lifetime1 >> 16);
                  oe.field_h[var23Lifetime2] = (var24Lifetime1Lifetime1 * var13 + var25Lifetime1Lifetime1 * var16 + var19 * var26Lifetime1Lifetime1 >> 16) + var10;
                  u.field_U[var23Lifetime2] = var11 + (var26Lifetime1Lifetime1 * var20 + (var14 * var24Lifetime1Lifetime1 + var17 * var25Lifetime1Lifetime1) >> 16);
                  var24Lifetime1Lifetime1 = param4.field_D[var23Lifetime2];
                  var25Lifetime1Lifetime1 = param4.field_C[var23Lifetime2];
                  var26Lifetime1Lifetime1 = param4.field_h[var23Lifetime2];
                  si.field_ob[var23Lifetime2] = (var26Lifetime1Lifetime1 * var18 + (var25Lifetime1Lifetime1 * var15 + var24Lifetime1Lifetime1 * var12) >> 16) + var9;
                  pe.field_a[var23Lifetime2] = (var19 * var26Lifetime1Lifetime1 + var25Lifetime1Lifetime1 * var16 + var24Lifetime1Lifetime1 * var13 >> 16) + var10;
                  cg.field_j[var23Lifetime2] = (var14 * var24Lifetime1Lifetime1 + (var17 * var25Lifetime1Lifetime1 + var20 * var26Lifetime1Lifetime1) >> 16) + var11;
                  var23Lifetime2++;
                  if (var30 != 0) {
                    return;
                  }
                }
              }
              if (param5) {
                var9 = param2[3];
                var10 = param2[4];
                var11 = param2[5];
                var12 = param2[6];
                var13 = param2[7];
                var14 = param2[8];
                var15 = param2[9];
                var16 = param2[10];
                var17 = param2[11];
                var18 = 0;
                while (true) {
                  stackIn_63_0Lifetime1 = param4.field_o;
                  stackIn_63_1Lifetime1 = var18;
                  if (stackIn_63_0Lifetime1 <= stackIn_63_1Lifetime1) {
                    break;
                  }
                  stackIn_72_0 = kf.field_T.length;
                  if (var30 != 0) {
                    break L3;
                  }
                  if (stackIn_72_0 <= var18) {
                    break;
                  }
                  var19 = param4.field_c[var18];
                  var20 = param4.field_s[var18];
                  var21Lifetime2 = param4.field_A[var18];
                  kf.field_T[var18] = var12 * var20 + var9 * var19 + var15 * var21Lifetime2 >> 16;
                  gb.field_q[var18] = var16 * var21Lifetime2 + (var13 * var20 + var19 * var10) >> 16;
                  u.field_S[var18] = var21Lifetime2 * var17 + var11 * var19 + var14 * var20 >> 16;
                  var18++;
                }
              }
            }
            stackIn_72_0 = var8;
            break;
          }
          pg.a(stackIn_72_0, param4, param1, 3, var7_int);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_77_0 = var7;
          stackIn_77_1 = new StringBuilder().append("ch.A(");
          if (param0 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          stackIn_81_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_82_2 = "null";
          } else {
            stackIn_82_2 = "{...}";
          }
          stackIn_85_1 = ((StringBuilder) (Object) stackIn_81_1).append(stackIn_82_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_86_2 = "null";
          } else {
            stackIn_86_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_77_0), ((StringBuilder) (Object) stackIn_85_1).append(stackIn_86_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    ch(byte[] param0) {
        int incrementValue$0 = 0;
        ik dupTemp$1 = null;
        int incrementValue$3 = 0;
        int incrementValue$5 = 0;
        int stackIn_49_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        byte[] stackIn_67_0 = null;
        byte[] stackIn_71_0 = null;
        int stackIn_109_0 = 0;
        int stackIn_129_0 = 0;
        int stackIn_144_0 = 0;
        int stackIn_161_0 = 0;
        int stackIn_176_0 = 0;
        Object stackIn_199_0 = null;
        byte[] stackIn_199_1 = null;
        Object stackIn_233_0 = null;
        byte[] stackIn_233_1 = null;
        int stackIn_268_0 = 0;
        int stackIn_299_0 = 0;
        int stackIn_299_1 = 0;
        int stackIn_323_0 = 0;
        int stackIn_362_0 = 0;
        int stackIn_362_1 = 0;
        ik stackIn_365_0 = null;
        RuntimeException stackIn_376_0 = null;
        StringBuilder stackIn_376_1 = null;
        String stackIn_377_2 = null;
        RuntimeException decompiledCaughtException = null;
        th var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        byte[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        byte[] var10 = null;
        int var11_int = 0;
        byte[] var11 = null;
        int var12 = 0;
        int var13_int = 0;
        ik[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        ik var15 = null;
        byte[] var15_array = null;
        int var16_int = 0;
        byte[] var16 = null;
        int var17 = 0;
        byte[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25_int = 0;
        Object var25 = null;
        int var26 = 0;
        int var27 = 0;
        ik var28 = null;
        int var28_int = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        Object stackIn_233_0Lifetime1;
        byte[] stackIn_233_1Lifetime1;
        ik stackIn_365_0Lifetime1;
        ik stackIn_365_0Lifetime2;
        int stackIn_299_0Lifetime1;
        int stackIn_299_1Lifetime1;
        int stackIn_362_0Lifetime1;
        int stackIn_362_1Lifetime1;
        int var21Lifetime1;
        int var14Lifetime1;
        int var14Lifetime2;
        int stackIn_299_0Lifetime1Lifetime1;
        int stackIn_299_1Lifetime1Lifetime1;
        var36 = HoldTheLine.field_D;
        try {
          this.field_l = new byte[128];
          this.field_p = new int[128];
          this.field_q = new short[128];
          this.field_v = new byte[128];
          this.field_s = new el[128];
          this.field_o = new ik[128];
          this.field_k = new byte[128];
          var2 = new th(param0);
          var3 = 0;
          while (0 != var2.field_i[var2.field_l + var3]) {
            var3++;
            if (var36 == 0) {
              continue;
            }
            break;
          }
          var4 = new byte[var3];
          var5 = 0;
          do {
            if (var3 <= var5) {
              var3++;
              var2.field_l = var2.field_l + 1;
              var5 = var2.field_l;
              var2.field_l = var2.field_l + var3;
              break;
            }
            var4[var5] = var2.f(0);
            var5++;
          } while (var36 == 0);
          var6 = 0;
          while (var2.field_i[var6 + var2.field_l] != 0) {
            var6++;
            if (var36 == 0) {
              continue;
            }
            break;
          }
          var7 = new byte[var6];
          var8 = 0;
          do {
            if (var8 >= var6) {
              var6++;
              var2.field_l = var2.field_l + 1;
              var8 = var2.field_l;
              var2.field_l = var2.field_l + var6;
              break;
            }
            var7[var8] = var2.f(0);
            var8++;
          } while (var36 == 0);
          var9 = 0;
          while (var2.field_i[var9 + var2.field_l] != 0) {
            var9++;
            if (var36 == 0) {
              continue;
            }
            break;
          }
          var10 = new byte[var9];
          var11_int = 0;
          do {
            if (var9 <= var11_int) {
              var9++;
              var2.field_l = var2.field_l + 1;
              break;
            }
            var10[var11_int] = var2.f(0);
            var11_int++;
          } while (var36 == 0);
          boolean decompiledFrameCompleted4 = true;
          var11 = new byte[var9];
          if (var9 > 1) {
            var11[1] = (byte) 1;
            var12 = 2;
            var13_int = 1;
            var14 = 2;
            while (var9 > var14) {
              var15_int = var2.f((byte) -89);
              stackIn_49_0 = var15_int;
              if (var36 != 0) {
                decompiledFrameCompleted4 = false;
                break;
              }
              if (stackIn_49_0 == 0) {
                incrementValue$0 = var12;
                var12++;
                var13_int = incrementValue$0;
              } else {
                if (var15_int <= var13_int) {
                  var15_int--;
                }
                var13_int = var15_int;
              }
              var11[var14] = (byte)var13_int;
              var14++;
            }
          }
          if (decompiledFrameCompleted4) {
            if (var9 <= 1 ||
              var36 != 0) {
              var12 = var9;
            }
            stackIn_49_0 = var12;
          }
          var13 = new ik[stackIn_49_0];
          var14Lifetime1 = 0;
          L24: while (true) {
            if (var14Lifetime1 < var13.length) {
              dupTemp$1 = new ik();
              var13[var14Lifetime1] = dupTemp$1;
              var15 = dupTemp$1;
              var16_int = var2.f((byte) -60);
              stackIn_65_0 = 0;
              stackIn_65_1 = var16_int;
              if (var36 == 0) {
                if (stackIn_65_0 < stackIn_65_1) {
                  var15.field_l = new byte[2 * var16_int];
                }
                var16_int = var2.f((byte) -44);
                if (var16_int > 0) {
                  var15.field_g = new byte[2 + 2 * var16_int];
                  var15.field_g[1] = (byte) 64;
                }
                var14Lifetime1++;
                continue;
              }
            } else {
              var14Lifetime1 = var2.f((byte) -93);
              if (var14Lifetime1 <= 0) {
                stackIn_67_0 = null;
                break L24;
              }
              stackIn_65_0 = var14Lifetime1;
              stackIn_65_1 = 2;
            }
            stackIn_67_0 = new byte[stackIn_65_0 * stackIn_65_1];
            break;
          }
          var15_array = stackIn_67_0;
          var14Lifetime2 = var2.f((byte) -29);
          if (0 >= var14Lifetime2) {
            stackIn_71_0 = null;
          } else {
            stackIn_71_0 = new byte[var14Lifetime2 * 2];
          }
          var16 = stackIn_71_0;
          var17 = 0;
          while (0 != var2.field_i[var17 + var2.field_l]) {
            var17++;
            if (var36 == 0) {
              continue;
            }
            break;
          }
          var18 = new byte[var17];
          var19 = 0;
          do {
            if (var17 <= var19) {
              var17++;
              var2.field_l = var2.field_l + 1;
              var19 = 0;
              break;
            }
            var18[var19] = var2.f(0);
            var19++;
          } while (var36 == 0);
          var20 = 0;
          do {
            if (var20 >= 128) {
              var19 = 0;
              break;
            }
            var19 = var19 + var2.f((byte) -93);
            this.field_q[var20] = (short)var19;
            var20++;
          } while (var36 == 0);
          var20 = 0;
          do {
            if (var20 >= 128) {
              var20 = 0;
              break;
            }
            var19 = var19 + var2.f((byte) -86);
            this.field_q[var20] = (short)(this.field_q[var20] + (var19 << 8));
            var20++;
          } while (var36 == 0);
          var21 = 0;
          var22 = 0;
          var23 = 0;
          boolean decompiledNaturalLoopExit4 = false;
          while (!(decompiledNaturalLoopExit4 = (128 <= var23))) {
            stackIn_109_0 = ~var20;
            if (var36 == 0) {
              if (stackIn_109_0 == -1) {
                if (var21 >= var18.length) {
                  var20 = -1;
                } else {
                  var20 = var18[var21++];
                }
                var22 = var2.d((byte) -17);
              }
              this.field_q[var23] = (short)(this.field_q[var23] + pk.a(-1 + var22 << 14, 32768));
              var20--;
              this.field_p[var23] = var22;
              var23++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit4) {
            var21 = 0;
            var20 = 0;
            var23 = 0;
            stackIn_109_0 = 0;
          }
          var24 = stackIn_109_0;
          boolean decompiledNaturalLoopExit3 = false;
          while (!(decompiledNaturalLoopExit3 = (var24 >= 128))) {
            stackIn_129_0 = ~this.field_p[var24];
            if (var36 == 0) {
              if (stackIn_129_0 != -1) {
                if (var20 == 0) {
                  incrementValue$3 = var5;
                  var5++;
                  var23 = var2.field_i[incrementValue$3] - 1;
                  if (var4.length > var21) {
                    var20 = var4[var21++];
                  } else {
                    var20 = -1;
                  }
                }
                var20--;
                this.field_v[var24] = (byte)var23;
              }
              var24++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit3) {
            var20 = 0;
            var21 = 0;
            var24 = 0;
            stackIn_129_0 = 0;
          }
          var25_int = stackIn_129_0;
          boolean decompiledNaturalLoopExit2 = false;
          while (!(decompiledNaturalLoopExit2 = (var25_int >= 128))) {
            stackIn_144_0 = ~this.field_p[var25_int];
            if (var36 == 0) {
              if (stackIn_144_0 != -1) {
                if (0 == var20) {
                  incrementValue$5 = var8;
                  var8++;
                  var24 = var2.field_i[incrementValue$5] + 16 << 2;
                  if (var21 >= var7.length) {
                    var20 = -1;
                  } else {
                    var20 = var7[var21++];
                  }
                }
                var20--;
                this.field_l[var25_int] = (byte)var24;
              }
              var25_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit2) {
            var20 = 0;
            stackIn_144_0 = 0;
          }
          var21Lifetime1 = stackIn_144_0;
          var25 = null;
          var26 = 0;
          while (true) {
            if (var26 >= 128) {
              var21Lifetime1 = 0;
              var20 = 0;
              var26 = 0;
              stackIn_161_0 = 0;
              break;
            }
            stackIn_161_0 = this.field_p[var26];
            if (var36 == 0) {
              if (stackIn_161_0 != 0) {
                if (var20 == 0) {
                  var25 = var13[var11[var21Lifetime1]];
                  if (var10.length > var21Lifetime1) {
                    var20 = var10[var21Lifetime1++];
                  } else {
                    var20 = -1;
                  }
                }
                this.field_o[var26] = (ik) (var25);
                var20--;
              }
              var26++;
              continue;
            }
            break;
          }
          var27 = stackIn_161_0;
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (128 <= var27))) {
            stackIn_176_0 = var20;
            if (var36 == 0) {
              if (stackIn_176_0 == 0) {
                if (var21Lifetime1 >= var18.length) {
                  var20 = -1;
                } else {
                  var20 = var18[var21Lifetime1++];
                }
                if (this.field_p[var27] > 0) {
                  var26 = 1 + var2.f((byte) -112);
                }
              }
              this.field_k[var27] = (byte)var26;
              var20--;
              var27++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            this.field_j = 1 + var2.f((byte) -54);
            stackIn_176_0 = 0;
          }
          var27 = stackIn_176_0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var27 >= var12))) {
            var28 = var13[var27];
            stackIn_199_0 = null;
            stackIn_199_1 = var28.field_l;
            if (var36 == 0) {
              if (stackIn_199_0 != stackIn_199_1) {
                var29 = 1;
                while (!(var28.field_l.length <= var29)) {
                  var28.field_l[var29] = var2.f(0);
                  var29 += 2;
                }
              }
              if (null != var28.field_g) {
                var29 = 3;
                while (!((-2 + var28.field_g.length) <= var29)) {
                  var28.field_g[var29] = var2.f(0);
                  var29 += 2;
                }
              }
              var27++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_199_0 = null;
            stackIn_199_1 = var15_array;
          }
          boolean decompiledFrameCompleted2 = true;
          boolean decompiledFrameCompleted3 = true;
          if (stackIn_199_0 != stackIn_199_1) {
            var27 = 1;
            while (var27 < var15_array.length) {
              var15_array[var27] = var2.f(0);
              var27 += 2;
              if (var36 != 0) {
                decompiledFrameCompleted3 = false;
                break;
              }
            }
          }
          if ((decompiledFrameCompleted3) &&
            (var16 != null)) {
            var27 = 1;
            while (var16.length > var27) {
              var16[var27] = var2.f(0);
              var27 += 2;
              if (var36 != 0) {
                decompiledFrameCompleted2 = false;
                break;
              }
            }
          }
          if (decompiledFrameCompleted2) {
            var27 = 0;
          }
          L86: while (true) {
            boolean decompiledFrameCompleted1 = true;
            if (var12 > var27) {
              var28 = var13[var27];
              stackIn_233_0 = null;
              stackIn_233_1 = var28.field_g;
              if (var36 != 0) {
                while (true) {
                  boolean decompiledFrameRemainder0 = true;
                  if (stackIn_233_0 != stackIn_233_1) {
                    var19 = 0;
                    var29 = 2;
                    if (!(var28.field_l.length <= var29)) {
                      var19 = 1 + var19 + var2.f((byte) -34);
                      var28.field_l[var29] = (byte)var19;
                      var29 += 2;
                      decompiledFrameRemainder0 = false;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    var27++;
                  }
                  decompiledFrameCompleted1 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted1) {
                boolean decompiledFrameCompleted0 = true;
                if (stackIn_233_0 != stackIn_233_1) {
                  var19 = 0;
                  var29 = 2;
                  while (!(var28.field_g.length <= var29)) {
                    var19 = 1 + (var19 + var2.f((byte) -36));
                    var28.field_g[var29] = (byte)var19;
                    var29 += 2;
                    if (var36 != 0) {
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                  }
                }
                if (decompiledFrameCompleted0) {
                  var27++;
                }
                if (var36 == 0) {
                  continue;
                }
              }
            }
            if (decompiledFrameCompleted1) {
              var27 = 0;
              while (var27 < var12) {
                var28 = var13[var27];
                if (var36 != 0) {
                  break L86;
                }
                stackIn_233_0Lifetime1 = null;
                stackIn_233_1Lifetime1 = var28.field_l;
                if (stackIn_233_0Lifetime1 != stackIn_233_1Lifetime1) {
                  var19 = 0;
                  var29 = 2;
                  while (!(var28.field_l.length <= var29)) {
                    var19 = 1 + var19 + var2.f((byte) -34);
                    var28.field_l[var29] = (byte)var19;
                    var29 += 2;
                  }
                }
                var27++;
              }
            }
            if (var15_array != null) {
              var19 = var2.f((byte) -25);
              var15_array[0] = (byte)var19;
              var27 = 2;
              do {
                if (var27 >= var15_array.length) {
                  var27 = var15_array[0];
                  break;
                }
                var19 = var2.f((byte) -30) + 1 + var19;
                var15_array[var27] = (byte)var19;
                var27 += 2;
              } while (var36 == 0);
              var28_int = var15_array[1];
              var29 = 0;
              do {
                if (var29 >= var27) {
                  var29 = 2;
                  break;
                }
                this.field_k[var29] = (byte)(32 + var28_int * this.field_k[var29] >> 6);
                var29++;
              } while (var36 == 0);
              L107: while (true) {
                if (var15_array.length > var29) {
                  var30 = var15_array[var29];
                  var31 = var15_array[var29 + 1];
                  var32 = var28_int * (var30 - var27) + (var30 - var27) / 2;
                  stackIn_268_0 = var27;
                  if (var36 != 0) {
                    break L107;
                  }
                  var33 = stackIn_268_0;
                  while (var33 < var30) {
                    var34 = sf.a(var32, -var27 + var30, (byte) -76);
                    var32 = var32 + (var31 - var28_int);
                    this.field_k[var33] = (byte)(var34 * this.field_k[var33] + 32 >> 6);
                    var33++;
                  }
                  var27 = var30;
                  var28_int = var31;
                  var29 += 2;
                  continue;
                }
                stackIn_268_0 = var27;
                break;
              }
              var30 = stackIn_268_0;
              while (var30 < 128) {
                this.field_k[var30] = (byte)(var28_int * this.field_k[var30] + 32 >> 6);
                var30++;
                if (var36 != 0) {
                  break L86;
                }
              }
              var15_array = null;
            }
            break;
          }
          L114: {
            if (var16 != null) {
              var19 = var2.f((byte) -27);
              var16[0] = (byte)var19;
              var27 = 2;
              do {
                if (var27 >= var16.length) {
                  var27 = var16[0];
                  break;
                }
                var19 = var2.f((byte) -110) + (1 + var19);
                var16[var27] = (byte)var19;
                var27 += 2;
              } while (var36 == 0);
              var28_int = var16[1] << 1;
              var29 = 0;
              L120: while (true) {
                if (var29 < var27) {
                  var30 = var28_int + (this.field_l[var29] & 255);
                  stackIn_299_0 = ~var30;
                  stackIn_299_1 = -1;
                  if (var36 != 0) {
                    if (stackIn_299_0 < stackIn_299_1) {
                      var30 = var16[var29];
                      var31 = var16[var29 + 1] << 1;
                      var32 = (var30 - var27) * var28_int + (var30 - var27) / 2;
                      stackIn_323_0 = var27;
                      break L114;
                    }
                    break L120;
                  }
                  if (stackIn_299_0 > stackIn_299_1) {
                    var30 = 0;
                  }
                  if (128 < var30) {
                    var30 = 128;
                  }
                  this.field_l[var29] = (byte)var30;
                  var29++;
                  continue;
                }
                var29 = 2;
                while (true) {
                  stackIn_299_0Lifetime1 = ~var16.length;
                  stackIn_299_1Lifetime1 = ~var29;
                  if (stackIn_299_0Lifetime1 >= stackIn_299_1Lifetime1) {
                    break L120;
                  }
                  var30 = var16[var29];
                  var31 = var16[var29 + 1] << 1;
                  var32 = (var30 - var27) * var28_int + (var30 - var27) / 2;
                  stackIn_323_0 = var27;
                  if (var36 != 0) {
                    break L114;
                  }
                  var33 = stackIn_323_0;
                  while (var33 < var30) {
                    var34 = sf.a(var32, -var27 + var30, (byte) -86);
                    var35 = var34 + (this.field_l[var33] & 255);
                    stackIn_299_0Lifetime1Lifetime1 = 0;
                    stackIn_299_1Lifetime1Lifetime1 = var35;
                    if (stackIn_299_0Lifetime1Lifetime1 > stackIn_299_1Lifetime1Lifetime1) {
                      var35 = 0;
                    }
                    if (var35 > 128) {
                      var35 = 128;
                    }
                    var32 = var32 + (-var28_int + var31);
                    this.field_l[var33] = (byte)var35;
                    var33++;
                  }
                  var29 += 2;
                  var28_int = var31;
                  var27 = var30;
                }

              }
              var16 = null;
              for (var30 = var27; var30 < 128; var30++) {
                var31 = var28_int + (this.field_l[var30] & 255);
                if (var31 < 0) {
                  var31 = 0;
                }
                if (var31 > 128) {
                  var31 = 128;
                }
                this.field_l[var30] = (byte)var31;
              }
            }
            stackIn_323_0 = 0;
          }
          var27 = stackIn_323_0;
          do {
            if (var12 <= var27) {
              var27 = 0;
              break;
            }
            var13[var27].field_b = var2.f((byte) -28);
            var27++;
          } while (var36 == 0);
          while (var12 > var27) {
            var28 = var13[var27];
            stackIn_365_0 = var28;
            if (var36 != 0) {
              while (true) {
                var28 = stackIn_365_0;
                return;
              }
            }
            if (stackIn_365_0.field_l != null) {
              var28.field_d = var2.f((byte) -16);
            }
            if (var28.field_g != null) {
              var28.field_n = var2.f((byte) -120);
            }
            if (var28.field_b > 0) {
              var28.field_c = var2.f((byte) -81);
            }
            var27++;
            if (var36 == 0) {
              continue;
            }
            break;
          }
          var27 = 0;
          do {
            if (var12 <= var27) {
              var27 = 0;
              break;
            }
            var13[var27].field_m = var2.f((byte) -50);
            var27++;
          } while (var36 == 0);
          while (var27 < var12) {
            var28 = var13[var27];
            stackIn_362_0 = 0;
            stackIn_362_1 = var28.field_m;
            if (var36 != 0) {
              if (stackIn_362_0 < stackIn_362_1) {
                stackIn_365_0Lifetime1 = var13[var27];
                var28 = stackIn_365_0Lifetime1;
                return;
              }
              return;
            }
            if (stackIn_362_0 < stackIn_362_1) {
              var28.field_h = var2.f((byte) -50);
            }
            var27++;
          }
          var27 = 0;
          while (true) {
            stackIn_362_0Lifetime1 = ~var12;
            stackIn_362_1Lifetime1 = ~var27;
            if (stackIn_362_0Lifetime1 >= stackIn_362_1Lifetime1) {
              return;
            }
            stackIn_365_0Lifetime2 = var13[var27];
            var28 = stackIn_365_0Lifetime2;
            if (var36 != 0) {
              return;
            }
            if (var28.field_h > 0) {
              var28.field_j = var2.f((byte) -81);
            }
            var27++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_376_0 = var2_ref;
          stackIn_376_1 = new StringBuilder().append("ch.<init>(");
          if (param0 == null) {
            stackIn_377_2 = "null";
          } else {
            stackIn_377_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_376_0), ((StringBuilder) (Object) stackIn_376_1).append(stackIn_377_2).append(')').toString());
        }
    }

    final void e(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != -8346) {
            ch.a(-62, 14, (hj) null, 98, (byte) 42);
          }
          this.field_p = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var2), "ch.H(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, hj param2, int param3, byte param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param2.e(-(param2.field_o / 2) + param3, param1 - param2.field_v / 2, param0);
          if (param4 != 98) {
            field_t = (String[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ch.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static String a(boolean param0) {
        String var1 = null;
        RuntimeException var1_ref = null;
        String stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var1 = "";
          if (null != lh.field_a) {
            var1 = lh.field_a.a(false);
          }
          if (0 == var1.length()) {
            var1 = u.j(21);
          }
          if (0 == var1.length()) {
            var1 = nd.field_k;
          }
          if (param0) {
            ch.a(100);
          }
          stackIn_12_0 = var1;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var1_ref), "ch.C(" + param0 + ')');
        }
    }

    static {
        field_r = new float[]{3.0f, 2.75f, 2.5f, 2.25f, 2.0f};
        field_t = new String[]{"By rating", "By win percentage"};
    }
}
