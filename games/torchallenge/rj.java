/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rj {
    static ka field_a;
    static int field_g;
    static ka[] field_b;
    static int field_c;
    static lj field_f;
    static String field_d;
    static int[] field_e;
    static char[] field_h;

    final static ka[] a(int param0, int param1) {
        ka[] var2 = null;
        RuntimeException var2_ref = null;
        ka[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 19) {
            rj.a((byte) -37, false, (int[]) null, (vg) null, false, true, (int[]) null);
          }
          var2 = new ka[9];
          var2[4] = e.a(param1, 64, (byte) -95);
          stackIn_4_0 = var2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2_ref), "rj.A(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, boolean param1, int[] param2, vg param3, boolean param4, boolean param5, int[] param6) {
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        int stackIn_74_0 = 0;
        int stackIn_74_1 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_84_2 = null;
        StringBuilder stackIn_87_1 = null;
        String stackIn_88_2 = null;
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
        int stackIn_65_0Lifetime1;
        int stackIn_65_1Lifetime1;
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
        var30 = TorChallenge.field_F ? 1 : 0;
        try {
          var7_int = 2147483647;
          var8 = -2147483648;
          var21 = param6[3] >> 2;
          var22 = param6[4] >> 2;
          var23 = param6[5] >> 2;
          var24 = param6[6] >> 2;
          var25 = param6[7] >> 2;
          var26 = param6[8] >> 2;
          var27 = param6[9] >> 2;
          var28 = param6[10] >> 2;
          var12 = param2[4] * var22 + param2[3] * var21 + param2[5] * var23 >> 14;
          if (param0 >= -20) {
            rj.a((byte) -82, false, (int[]) null, (vg) null, true, true, (int[]) null);
          }
          var29 = param6[11] >> 2;
          var13 = var26 * param2[5] + (param2[4] * var25 + param2[3] * var24) >> 14;
          var18 = var22 * param2[10] + param2[9] * var21 + var23 * param2[11] >> 14;
          var14 = param2[5] * var29 + (param2[3] * var27 + param2[4] * var28) >> 14;
          var19 = var26 * param2[11] + param2[10] * var25 + param2[9] * var24 >> 14;
          var16 = param2[6] * var24 + (param2[7] * var25 + var26 * param2[8]) >> 14;
          var20 = param2[9] * var27 + param2[10] * var28 + var29 * param2[11] >> 14;
          var15 = param2[7] * var22 + (var21 * param2[6] + var23 * param2[8]) >> 14;
          var17 = var29 * param2[8] + var28 * param2[7] + param2[6] * var27 >> 14;
          var21Lifetime1 = -param6[0] + param2[0];
          var22Lifetime1 = param2[1] - param6[1];
          var23Lifetime1 = -param6[2] + param2[2];
          var9 = param6[4] * var22Lifetime1 + param6[3] * var21Lifetime1 + var23Lifetime1 * param6[5] >> -fd.field_g + 16;
          var10 = param6[8] * var23Lifetime1 + (param6[6] * var21Lifetime1 + param6[7] * var22Lifetime1) >> 16 - fd.field_g;
          var11 = var23Lifetime1 * param6[11] + var21Lifetime1 * param6[9] + param6[10] * var22Lifetime1 >> 16;
          var21Lifetime2 = oc.field_i;
          var22Lifetime2 = oc.field_c;
          var23Lifetime2 = 0;
          L2: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (var23Lifetime2 < param3.field_d) {
              var24Lifetime1 = param3.field_g[var23Lifetime2];
              var25Lifetime1 = param3.field_t[var23Lifetime2];
              var26Lifetime1 = param3.field_q[var23Lifetime2];
              var27Lifetime1 = (var18 * var26Lifetime1 + (var12 * var24Lifetime1 + var15 * var25Lifetime1) >> 16 - fd.field_g) + var9;
              var28Lifetime1 = (var25Lifetime1 * var16 + var13 * var24Lifetime1 + var26Lifetime1 * var19 >> 16 - fd.field_g) + var10;
              var29Lifetime1 = var11 + (var20 * var26Lifetime1 + (var14 * var24Lifetime1 + var25Lifetime1 * var17) >> 16);
              stackIn_65_0 = 50;
              stackIn_65_1 = var29Lifetime1;
              if (var30 != 0) {
                if (stackIn_65_0 > stackIn_65_1) {
                  stackIn_74_0 = var18;
                  stackIn_74_1 = sj.field_S.length;
                  break L2;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (stackIn_65_0 <= stackIn_65_1) {
                  tj.field_a[var23Lifetime2] = var27Lifetime1 / var29Lifetime1 + var21Lifetime2;
                  si.field_K[var23Lifetime2] = var28Lifetime1 / var29Lifetime1 + var22Lifetime2;
                  if (var8 < var29Lifetime1) {
                    var8 = var29Lifetime1;
                  }
                  if (var7_int > var29Lifetime1) {
                    var7_int = var29Lifetime1;
                  }
                  bg.field_O[var23Lifetime2] = var29Lifetime1;
                } else {
                  bg.field_O[var23Lifetime2] = -2147483648;
                }
                if (param1) {
                  bk.field_q[var23Lifetime2] = var27Lifetime1 >> fd.field_g;
                  ad.field_h[var23Lifetime2] = var28Lifetime1 >> fd.field_g;
                  ek.field_K[var23Lifetime2] = var29Lifetime1;
                }
                var23Lifetime2++;
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              boolean decompiledFrameCompleted0 = true;
              if (null != param3.field_u &&
                null != param3.field_y &&
                param3.field_J != null &&
                param3.field_E != null &&
                null != param3.field_l &&
                null != param3.field_C &&
                param3.field_A != null &&
                null != param3.field_o &&
                param3.field_a != null) {
                var23Lifetime2 = 0;
                while (!(var23Lifetime2 >= param3.field_x)) {
                  var24Lifetime1Lifetime1 = param3.field_u[var23Lifetime2];
                  var25Lifetime1Lifetime1 = param3.field_y[var23Lifetime2];
                  var26Lifetime1Lifetime1 = param3.field_J[var23Lifetime2];
                  ba.field_h[var23Lifetime2] = var9 + (var24Lifetime1Lifetime1 * var12 + var15 * var25Lifetime1Lifetime1 + var18 * var26Lifetime1Lifetime1 >> 16);
                  ib.field_O[var23Lifetime2] = (var24Lifetime1Lifetime1 * var13 + (var25Lifetime1Lifetime1 * var16 + var26Lifetime1Lifetime1 * var19) >> 16) + var10;
                  ih.field_O[var23Lifetime2] = (var24Lifetime1Lifetime1 * var14 + var25Lifetime1Lifetime1 * var17 + var26Lifetime1Lifetime1 * var20 >> 16) + var11;
                  var24Lifetime1Lifetime1 = param3.field_E[var23Lifetime2];
                  var25Lifetime1Lifetime1 = param3.field_l[var23Lifetime2];
                  var26Lifetime1Lifetime1 = param3.field_C[var23Lifetime2];
                  il.field_r[var23Lifetime2] = (var25Lifetime1Lifetime1 * var15 + var24Lifetime1Lifetime1 * var12 + var18 * var26Lifetime1Lifetime1 >> 16) + var9;
                  tf.field_u[var23Lifetime2] = (var25Lifetime1Lifetime1 * var16 + (var24Lifetime1Lifetime1 * var13 + var19 * var26Lifetime1Lifetime1) >> 16) + var10;
                  ef.field_d[var23Lifetime2] = (var24Lifetime1Lifetime1 * var14 - (-(var25Lifetime1Lifetime1 * var17) - var20 * var26Lifetime1Lifetime1) >> 16) + var11;
                  var24Lifetime1Lifetime1 = param3.field_A[var23Lifetime2];
                  var25Lifetime1Lifetime1 = param3.field_o[var23Lifetime2];
                  var26Lifetime1Lifetime1 = param3.field_a[var23Lifetime2];
                  fa.field_h[var23Lifetime2] = var9 + (var18 * var26Lifetime1Lifetime1 + var24Lifetime1Lifetime1 * var12 + var15 * var25Lifetime1Lifetime1 >> 16);
                  qi.field_h[var23Lifetime2] = var10 + (var19 * var26Lifetime1Lifetime1 + var16 * var25Lifetime1Lifetime1 + var24Lifetime1Lifetime1 * var13 >> 16);
                  kc.field_m[var23Lifetime2] = var11 + (var20 * var26Lifetime1Lifetime1 + (var14 * var24Lifetime1Lifetime1 + var17 * var25Lifetime1Lifetime1) >> 16);
                  var23Lifetime2++;
                  if (var30 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
              }
              if ((decompiledFrameCompleted0) &&
                (decompiledFrameRemainder0 = (param4))) {
                var9 = param2[3];
                var10 = param2[4];
                var11 = param2[5];
                var12 = param2[6];
                var13 = param2[7];
                var14 = param2[8];
                var15 = param2[9];
                var16 = param2[10];
                var17 = param2[11];
              }
              if (decompiledFrameRemainder0) {
                var18 = 0;
                while (true) {
                  stackIn_65_0Lifetime1 = param3.field_c;
                  stackIn_65_1Lifetime1 = var18;
                  if (stackIn_65_0Lifetime1 <= stackIn_65_1Lifetime1) {
                    break;
                  }
                  stackIn_74_0 = var18;
                  stackIn_74_1 = sj.field_S.length;
                  if (var30 != 0) {
                    break L2;
                  }
                  if (stackIn_74_0 >= stackIn_74_1) {
                    break;
                  }
                  var19 = param3.field_L[var18];
                  var20 = param3.field_r[var18];
                  var21Lifetime2 = param3.field_D[var18];
                  sj.field_S[var18] = var12 * var20 + (var19 * var9 + var15 * var21Lifetime2) >> 16;
                  kl.field_b[var18] = var16 * var21Lifetime2 + var10 * var19 + var13 * var20 >> 16;
                  kd.field_o[var18] = var21Lifetime2 * var17 + var11 * var19 + var14 * var20 >> 16;
                  var18++;
                }
              }
            }
            stackIn_74_0 = -2;
            stackIn_74_1 = param5 ? 1 : 0;
            break;
          }
          md.a(stackIn_74_0, stackIn_74_1 != 0, var7_int, var8, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_79_0 = var7;
          stackIn_79_1 = new StringBuilder().append("rj.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          stackIn_83_1 = ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',');
          if (param3 == null) {
            stackIn_84_2 = "null";
          } else {
            stackIn_84_2 = "{...}";
          }
          stackIn_87_1 = ((StringBuilder) (Object) stackIn_83_1).append(stackIn_84_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_88_2 = "null";
          } else {
            stackIn_88_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_79_0), ((StringBuilder) (Object) stackIn_87_1).append(stackIn_88_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, boolean param4, int param5, int param6, int param7, String param8, int param9, long param10, boolean param11, int param12, uj param13) {
        try {
          RuntimeException stackIn_13_0 = null;
          StringBuilder stackIn_13_1 = null;
          String stackIn_14_2 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          IOException var15 = null;
          RuntimeException var15_ref = null;
          try {
            id.field_b = new pa(param5);
            dk.field_s = new pa(param1);
            vl.field_a = param13;
            fg.field_S = param2;
            wh.field_c = param10;
            ll.field_f = param8;
            ed.field_e = param4;
            mh.field_a = param7;
            ae.field_x = param3;
            na.field_c = param0;
            db.field_y = param12;
            ph.field_e = param9;
            sd.field_h = param6;
            if (param11) {
              field_g = 2;
            }
            if (null != vl.field_a.field_d) {
              try {
                cf.field_d = new rk(vl.field_a.field_d, 64, 0);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var15 = (IOException) (Object) decompiledCaughtException;
                throw new RuntimeException(var15.toString());
              }
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var15_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_13_0 = var15_ref;
            stackIn_13_1 = new StringBuilder().append("rj.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            if (param8 == null) {
              stackIn_14_2 = "null";
            } else {
              stackIn_14_2 = "{...}";
            }
            stackIn_17_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',');
            if (param13 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw oj.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
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
          throw oj.a((Throwable) ((Object) var1), "rj.toString()");
        }
    }

    static long a(long param0, long param1) {
        long stackIn_1_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          stackIn_1_0 = param0 | param1;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var4), "rj.D(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        try {
          field_f = null;
          field_h = null;
          field_b = null;
          field_e = null;
          field_d = null;
          field_a = null;
          if (param0 != 10) {
            field_f = (lj) null;
          }
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "rj.E(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, ka[] param3, int param4) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = lg.field_d[param1][9];
          var6 = lg.field_d[param1][10];
          var7 = lg.field_d[param1][11];
          var8 = lg.field_d[param1][12];
          var9 = lg.field_d[param1][13];
          var10 = lg.field_d[param1][14];
          var11 = lg.field_d[param1][15];
          var12 = lg.field_d[param1][16];
          ne.a(param4, var8, var10, var9, param2, param4 - 2 * var5_int, var6, var5_int, param3, -(param0 * var9) + param4, -var11 + param2 - var10, var12, -var7 - var6 + param2, 128);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("rj.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_g = 0;
        field_e = new int[]{60, 60, 60};
        field_d = null;
        field_b = new ka[2];
        field_h = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    }
}
