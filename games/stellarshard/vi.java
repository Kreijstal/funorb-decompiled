/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vi {
    java.awt.Image field_b;
    static int[] field_c;
    int[] field_e;
    static int field_d;
    int field_g;
    int field_f;
    static int field_a;

    final static void a(n param0, byte param1, int[] param2, boolean param3, boolean param4, int[] param5, boolean param6) {
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        int stackIn_69_0 = 0;
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
        int var22Lifetime1;
        int var22Lifetime2;
        int var23Lifetime1;
        int var23Lifetime2;
        int var24Lifetime1;
        int var24Lifetime2;
        int var25Lifetime1;
        int var26Lifetime1;
        int var27Lifetime1;
        int var28Lifetime1;
        int var29Lifetime1;
        int var30Lifetime1;
        int var25Lifetime1Lifetime1;
        int var26Lifetime1Lifetime1;
        int var27Lifetime1Lifetime1;
        var31 = stellarshard.field_B;
        try {
          var7_int = 2147483647;
          var9 = -47 % ((param1 + 36) / 57);
          var8 = -2147483648;
          var22 = param5[3] >> 2;
          var23 = param5[4] >> 2;
          var24 = param5[5] >> 2;
          var25 = param5[6] >> 2;
          var26 = param5[7] >> 2;
          var27 = param5[8] >> 2;
          var28 = param5[9] >> 2;
          var29 = param5[10] >> 2;
          var30 = param5[11] >> 2;
          var14 = var26 * param2[4] + (var25 * param2[3] + var27 * param2[5]) >> 14;
          var13 = param2[5] * var24 + (param2[4] * var23 + param2[3] * var22) >> 14;
          var17 = var25 * param2[6] - (-(var26 * param2[7]) - param2[8] * var27) >> 14;
          var19 = var24 * param2[11] + var22 * param2[9] + param2[10] * var23 >> 14;
          var18 = param2[8] * var30 + (var29 * param2[7] + var28 * param2[6]) >> 14;
          var20 = param2[10] * var26 + (var25 * param2[9] + var27 * param2[11]) >> 14;
          var21 = var30 * param2[11] + var28 * param2[9] + param2[10] * var29 >> 14;
          var16 = param2[8] * var24 + param2[6] * var22 + param2[7] * var23 >> 14;
          var15 = var28 * param2[3] + param2[4] * var29 + var30 * param2[5] >> 14;
          var22Lifetime1 = param2[0] - param5[0];
          var23Lifetime1 = -param5[1] + param2[1];
          var24Lifetime1 = param2[2] - param5[2];
          var10 = param5[3] * var22Lifetime1 + (param5[4] * var23Lifetime1 + param5[5] * var24Lifetime1) >> 16 - fc.field_e;
          var12 = var23Lifetime1 * param5[10] + (param5[9] * var22Lifetime1 + var24Lifetime1 * param5[11]) >> 16;
          var11 = param5[8] * var24Lifetime1 + param5[7] * var23Lifetime1 + param5[6] * var22Lifetime1 >> 16 - fc.field_e;
          var22Lifetime2 = cc.field_n;
          var23Lifetime2 = cc.field_p;
          var24Lifetime2 = 0;
          L1: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (var24Lifetime2 < param0.field_n) {
              var25Lifetime1 = param0.field_f[var24Lifetime2];
              var26Lifetime1 = param0.field_b[var24Lifetime2];
              var27Lifetime1 = param0.field_a[var24Lifetime2];
              var28Lifetime1 = (var27Lifetime1 * var19 + var26Lifetime1 * var16 + var25Lifetime1 * var13 >> 16 - fc.field_e) + var10;
              var29Lifetime1 = var11 + (var27Lifetime1 * var20 + var14 * var25Lifetime1 + var17 * var26Lifetime1 >> 16 - fc.field_e);
              var30Lifetime1 = (var21 * var27Lifetime1 + var18 * var26Lifetime1 + var25Lifetime1 * var15 >> 16) + var12;
              stackIn_60_0 = 50;
              stackIn_60_1 = var30Lifetime1;
              if (var31 != 0) {
                if (stackIn_60_0 < stackIn_60_1) {
                  stackIn_69_0 = ~hc.field_f.length;
                  break L1;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (stackIn_60_0 > stackIn_60_1) {
                  wl.field_P[var24Lifetime2] = -2147483648;
                } else {
                  nh.field_d[var24Lifetime2] = var22Lifetime2 + var28Lifetime1 / var30Lifetime1;
                  od.field_s[var24Lifetime2] = var23Lifetime2 + var29Lifetime1 / var30Lifetime1;
                  if (var7_int > var30Lifetime1) {
                    var7_int = var30Lifetime1;
                  }
                  if (var8 < var30Lifetime1) {
                    var8 = var30Lifetime1;
                  }
                  wl.field_P[var24Lifetime2] = var30Lifetime1;
                }
                if (param4) {
                  aa.field_c[var24Lifetime2] = var28Lifetime1 >> fc.field_e;
                  kf.field_b[var24Lifetime2] = var29Lifetime1 >> fc.field_e;
                  be.field_b[var24Lifetime2] = var30Lifetime1;
                }
                var24Lifetime2++;
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              boolean decompiledFrameCompleted0 = true;
              if (null != param0.field_O &&
                null != param0.field_B &&
                null != param0.field_w &&
                param0.field_A != null &&
                param0.field_y != null &&
                null != param0.field_j &&
                param0.field_o != null &&
                param0.field_J != null &&
                null != param0.field_q) {
                var24Lifetime2 = 0;
                while (!(param0.field_C <= var24Lifetime2)) {
                  var25Lifetime1Lifetime1 = param0.field_O[var24Lifetime2];
                  var26Lifetime1Lifetime1 = param0.field_B[var24Lifetime2];
                  var27Lifetime1Lifetime1 = param0.field_w[var24Lifetime2];
                  ih.field_e[var24Lifetime2] = (var19 * var27Lifetime1Lifetime1 + var13 * var25Lifetime1Lifetime1 + var16 * var26Lifetime1Lifetime1 >> 16) + var10;
                  ma.field_k[var24Lifetime2] = (var27Lifetime1Lifetime1 * var20 + (var17 * var26Lifetime1Lifetime1 + var25Lifetime1Lifetime1 * var14) >> 16) + var11;
                  wb.field_g[var24Lifetime2] = (var27Lifetime1Lifetime1 * var21 + (var25Lifetime1Lifetime1 * var15 + var26Lifetime1Lifetime1 * var18) >> 16) + var12;
                  var25Lifetime1Lifetime1 = param0.field_A[var24Lifetime2];
                  var26Lifetime1Lifetime1 = param0.field_y[var24Lifetime2];
                  var27Lifetime1Lifetime1 = param0.field_j[var24Lifetime2];
                  jf.field_k[var24Lifetime2] = (var27Lifetime1Lifetime1 * var19 + var26Lifetime1Lifetime1 * var16 + var25Lifetime1Lifetime1 * var13 >> 16) + var10;
                  se.field_C[var24Lifetime2] = var11 + (var27Lifetime1Lifetime1 * var20 + var25Lifetime1Lifetime1 * var14 + var26Lifetime1Lifetime1 * var17 >> 16);
                  pl.field_S[var24Lifetime2] = var12 + (var27Lifetime1Lifetime1 * var21 + (var25Lifetime1Lifetime1 * var15 + var26Lifetime1Lifetime1 * var18) >> 16);
                  var25Lifetime1Lifetime1 = param0.field_o[var24Lifetime2];
                  var26Lifetime1Lifetime1 = param0.field_J[var24Lifetime2];
                  var27Lifetime1Lifetime1 = param0.field_q[var24Lifetime2];
                  ua.field_e[var24Lifetime2] = (var25Lifetime1Lifetime1 * var13 + var16 * var26Lifetime1Lifetime1 + var19 * var27Lifetime1Lifetime1 >> 16) + var10;
                  nk.field_a[var24Lifetime2] = var11 + (var20 * var27Lifetime1Lifetime1 + var14 * var25Lifetime1Lifetime1 + var26Lifetime1Lifetime1 * var17 >> 16);
                  eb.field_b[var24Lifetime2] = var12 + (var25Lifetime1Lifetime1 * var15 - (-(var26Lifetime1Lifetime1 * var18) - var27Lifetime1Lifetime1 * var21) >> 16);
                  var24Lifetime2++;
                  if (var31 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
              }
              if ((decompiledFrameCompleted0) &&
                (decompiledFrameRemainder0 = (param3))) {
                var10 = param2[3];
                var11 = param2[4];
                var12 = param2[5];
                var13 = param2[6];
                var14 = param2[7];
                var15 = param2[8];
                var16 = param2[9];
                var17 = param2[10];
                var18 = param2[11];
              }
              if (decompiledFrameRemainder0) {
                var19 = 0;
                while (true) {
                  stackIn_60_0Lifetime1 = var19;
                  stackIn_60_1Lifetime1 = param0.field_D;
                  if (stackIn_60_0Lifetime1 >= stackIn_60_1Lifetime1) {
                    break;
                  }
                  stackIn_69_0 = ~hc.field_f.length;
                  if (var31 != 0) {
                    break L1;
                  }
                  if (stackIn_69_0 >= ~var19) {
                    break;
                  }
                  var20 = param0.field_r[var19];
                  var21 = param0.field_e[var19];
                  var22Lifetime2 = param0.field_K[var19];
                  hc.field_f[var19] = var13 * var21 + var20 * var10 + var16 * var22Lifetime2 >> 16;
                  le.field_m[var19] = var17 * var22Lifetime2 + (var14 * var21 + var20 * var11) >> 16;
                  fl.field_d[var19] = var20 * var12 - (-(var15 * var21) - var18 * var22Lifetime2) >> 16;
                  var19++;
                }
              }
            }
            stackIn_69_0 = param6 ? 1 : 0;
            break;
          }
          rh.a(stackIn_69_0 != 0, param0, (byte) -115, var7_int, var8);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_74_0 = var7;
          stackIn_74_1 = new StringBuilder().append("vi.E(");
          if (param0 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          stackIn_78_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_79_2 = "null";
          } else {
            stackIn_79_2 = "{...}";
          }
          stackIn_82_1 = ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_83_2 = "null";
          } else {
            stackIn_83_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_74_0), ((StringBuilder) (Object) stackIn_82_1).append(stackIn_83_2).append(',').append(param6).append(')').toString());
        }
    }

    abstract void a(java.awt.Component param0, int param1, int param2, byte param3);

    final void a(byte param0) {
        try {
          ti.a(this.field_e, this.field_g, this.field_f);
          if (param0 != -107) {
            this.a((java.awt.Component) null, 82, 120, (byte) 92);
          }
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "vi.F(" + param0 + ')');
        }
    }

    abstract void a(int param0, java.awt.Graphics param1, int param2, int param3);

    final static void a(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (!param0) {
            field_a = 90;
          }
          if (null != na.field_d) {
            na.field_d.i(-21535);
          }
          if (null != qf.field_d) {
            qf.field_d.k(29960);
          }
          ld.e((byte) -111);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "vi.A(" + param0 + ')');
        }
    }

    public static void b(byte param0) {
        try {
          field_c = null;
          if (param0 <= 79) {
            vi.a(true);
          }
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "vi.B(" + param0 + ')');
        }
    }

    static {
    }
}
