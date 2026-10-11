/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class to extends tf {
    static qb field_q;
    static String field_n;
    static int[] field_r;
    static hf field_s;
    static String field_o;
    static int field_p;
    static int field_m;

    public static void c(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0) {
            to.d(true);
          }
          field_s = null;
          field_o = null;
          field_n = null;
          field_q = null;
          field_r = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "to.NA(" + param0 + ')');
        }
    }

    final static void a(boolean param0, byte param1) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (pn.a((byte) 111)) {
            param0 = false;
          }
          ej.a(-11837, param0);
          var2_int = 125 / ((25 - param1) / 59);
          if (ua.field_J) {
            de.b(tn.field_Ob.field_c.field_T, tn.field_Ob.field_c.field_db, tn.field_Ob.field_c.field_x, tn.field_Ob.field_c.field_I);
            tn.field_Ob.field_c.a(param0, true);
          }
          bg.a(param0, (byte) -73);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) runtimeException), "to.LA(" + param0 + ',' + param1 + ')');
        }
    }

    to() {
    }

    final static void a(byte[] param0, boolean param1, int[] param2, int param3, int param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        byte dupTemp$2 = 0;
        int dupTemp$3 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var5_int = 0;
          L0: while (true) {
            if (kl.field_B.length > var5_int) {
              param3 = kl.field_B[var5_int];
              stackIn_13_0 = var5_int << 4;
              if (var7 != 0) {
                break L0;
              }
              var6 = stackIn_13_0;
              while (true) {
                incrementValue$0 = param3;
                param3--;
                if (incrementValue$0 != 0) {
                  incrementValue$1 = var6;
                  var6++;
                  param4 = w.field_Lb[incrementValue$1];
                  dupTemp$2 = param0[param4];
                  dupTemp$3 = param2[dupTemp$2];
                  param2[dupTemp$2] = dupTemp$3 + 1;
                  w.field_Lb[dupTemp$3] = param4;
                  continue;
                }
                break;
              }
              var5_int++;
              continue L0;
            }
            stackIn_13_0 = param1 ? 1 : 0;
            break;
          }
          if (stackIn_13_0 != 0) {
            field_p = 100;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("to.OA(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static int d(boolean param0) {
        try {
          int stackIn_5_0 = 0;
          int stackIn_8_0 = 0;
          int stackIn_10_0 = 0;
          int stackIn_23_0 = 0;
          int stackIn_39_0 = 0;
          int stackIn_47_0 = 0;
          int stackIn_50_0 = 0;
          int stackIn_52_0 = 0;
          int stackIn_54_0 = 0;
          Throwable decompiledCaughtException = null;
          wk var1 = null;
          int var1_int = 0;
          IOException var1_ref = null;
          RuntimeException var1_ref2 = null;
          try {
            if (4 <= jl.field_c.field_i) {
              if (jl.field_c.field_o == -1) {
                stackIn_5_0 = 3;
                return stackIn_5_0;
              }
              if (jl.field_c.field_o != -2) {
                stackIn_10_0 = 1;
                return stackIn_10_0;
              }
              stackIn_8_0 = 4;
              return stackIn_8_0;
            }
            if (!param0) {
              to.a((byte[]) null, false, (int[]) null, -92, -42);
            }
            try {
              if (0 == uh.field_m) {
                hg.field_a = ri.field_g.a(ed.field_Hb, true, jd.field_g);
                uh.field_m = uh.field_m + 1;
              }
              if (uh.field_m == 1) {
                if (hg.field_a.field_e == 2) {
                  stackIn_23_0 = hg.a((byte) 110, -1);
                  return stackIn_23_0;
                }
                if (hg.field_a.field_e == 1) {
                  uh.field_m = uh.field_m + 1;
                }
              }
              if (uh.field_m == 2) {
                td.field_E = new k((java.net.Socket) (hg.field_a.field_g), ri.field_g);
                var1 = new wk(13);
                jb.a(var1, ne.field_b, ib.field_u, ce.field_o, 123);
                var1.f(15, (byte) -28);
                var1.a(hd.field_a, (byte) -101);
                td.field_E.a(13, 0, (byte) 126, var1.field_j);
                uh.field_m = uh.field_m + 1;
                ud.field_E = qj.b(-26572) + 30000L;
              }
              boolean decompiledFrameRemainder0 = true;
              if (3 == uh.field_m) {
                if (td.field_E.b(0) > 0) {
                  var1_int = td.field_E.a((byte) 120);
                  if (var1_int != 0) {
                    stackIn_39_0 = hg.a((byte) 110, var1_int);
                    return stackIn_39_0;
                  }
                  uh.field_m = uh.field_m + 1;
                  decompiledFrameRemainder0 = !(!ArcanistsMulti.field_G);
                }
                if ((decompiledFrameRemainder0) &&
                  (qj.b(-26572) > ud.field_E)) {
                  stackIn_47_0 = hg.a((byte) 110, -2);
                  return stackIn_47_0;
                }
              }
              if (uh.field_m != 4) {
                stackIn_52_0 = -1;
                return stackIn_52_0;
              }
              jl.field_c.a(ab.field_n, true, td.field_E);
              hg.field_a = null;
              td.field_E = null;
              uh.field_m = 0;
              stackIn_50_0 = 0;
              return stackIn_50_0;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1_ref = (IOException) (Object) decompiledCaughtException;
              stackIn_54_0 = hg.a((byte) 110, -3);
              return stackIn_54_0;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var1_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            throw aa.a((Throwable) ((Object) var1_ref2), "to.MA(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0, int[] param1, int[] param2, boolean param3, vg param4, boolean param5, boolean param6) {
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
        int var15Lifetime1;
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
        var31 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var7_int = 2147483647;
          var8 = -2147483648;
          var15 = 33 / ((param0 - 23) / 38);
          var22 = param1[3] >> 2;
          var23 = param1[4] >> 2;
          var24 = param1[5] >> 2;
          var25 = param1[6] >> 2;
          var26 = param1[7] >> 2;
          var27 = param1[8] >> 2;
          var28 = param1[9] >> 2;
          var29 = param1[10] >> 2;
          var30 = param1[11] >> 2;
          var12 = param2[5] * var24 + (param2[4] * var23 + param2[3] * var22) >> 14;
          var13 = var25 * param2[3] + (var26 * param2[4] + var27 * param2[5]) >> 14;
          var14 = var28 * param2[3] + var29 * param2[4] + param2[5] * var30 >> 14;
          var16 = var24 * param2[8] + var22 * param2[6] + var23 * param2[7] >> 14;
          var17 = var26 * param2[7] + (var25 * param2[6] + var27 * param2[8]) >> 14;
          var21 = var29 * param2[10] + (var28 * param2[9] + var30 * param2[11]) >> 14;
          var20 = param2[9] * var25 + (var26 * param2[10] + var27 * param2[11]) >> 14;
          var18 = param2[8] * var30 + param2[6] * var28 + var29 * param2[7] >> 14;
          var19 = var23 * param2[10] + param2[9] * var22 + var24 * param2[11] >> 14;
          var22Lifetime1 = -param1[0] + param2[0];
          var23Lifetime1 = param2[1] - param1[1];
          var24Lifetime1 = -param1[2] + param2[2];
          var9 = var24Lifetime1 * param1[5] + (param1[3] * var22Lifetime1 + param1[4] * var23Lifetime1) >> 16 - tj.field_C;
          var10 = var24Lifetime1 * param1[8] + (param1[7] * var23Lifetime1 + var22Lifetime1 * param1[6]) >> 16 - tj.field_C;
          var11 = var24Lifetime1 * param1[11] + (var23Lifetime1 * param1[10] + param1[9] * var22Lifetime1) >> 16;
          var22Lifetime2 = id.field_i;
          var23Lifetime2 = id.field_g;
          var24Lifetime2 = 0;
          L2: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (var24Lifetime2 < param4.field_f) {
              var25Lifetime1 = param4.field_b[var24Lifetime2];
              var26Lifetime1 = param4.field_B[var24Lifetime2];
              var27Lifetime1 = param4.field_L[var24Lifetime2];
              var28Lifetime1 = var9 + (var25Lifetime1 * var12 - (-(var26Lifetime1 * var16) - var27Lifetime1 * var19) >> -tj.field_C + 16);
              var29Lifetime1 = (var20 * var27Lifetime1 + var17 * var26Lifetime1 + var13 * var25Lifetime1 >> 16 - tj.field_C) + var10;
              var30Lifetime1 = var11 + (var27Lifetime1 * var21 + var14 * var25Lifetime1 + var18 * var26Lifetime1 >> 16);
              stackIn_57_0 = 50;
              stackIn_57_1 = var30Lifetime1;
              if (var31 != 0) {
                if (stackIn_57_0 < stackIn_57_1) {
                  stackIn_66_0 = ~var18;
                  break L2;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (stackIn_57_0 <= stackIn_57_1) {
                  ud.field_p[var24Lifetime2] = var28Lifetime1 / var30Lifetime1 + var22Lifetime2;
                  v.field_g[var24Lifetime2] = var29Lifetime1 / var30Lifetime1 + var23Lifetime2;
                  if (var30Lifetime1 > var8) {
                    var8 = var30Lifetime1;
                  }
                  eg.field_a[var24Lifetime2] = var30Lifetime1;
                  if (var30Lifetime1 < var7_int) {
                    var7_int = var30Lifetime1;
                  }
                } else {
                  eg.field_a[var24Lifetime2] = -2147483648;
                }
                if (param6) {
                  ba.field_k[var24Lifetime2] = var28Lifetime1 >> tj.field_C;
                  vf.field_v[var24Lifetime2] = var29Lifetime1 >> tj.field_C;
                  gm.field_g[var24Lifetime2] = var30Lifetime1;
                }
                var24Lifetime2++;
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              if (null != param4.field_y &&
                param4.field_g != null &&
                param4.field_x != null &&
                null != param4.field_J &&
                param4.field_a != null &&
                param4.field_j != null &&
                param4.field_o != null &&
                param4.field_E != null &&
                param4.field_p != null) {
                var24Lifetime2 = 0;
                while (!(param4.field_G <= var24Lifetime2)) {
                  var25Lifetime1Lifetime1 = param4.field_y[var24Lifetime2];
                  var26Lifetime1Lifetime1 = param4.field_g[var24Lifetime2];
                  var27Lifetime1Lifetime1 = param4.field_x[var24Lifetime2];
                  sl.field_V[var24Lifetime2] = (var16 * var26Lifetime1Lifetime1 + (var25Lifetime1Lifetime1 * var12 + var19 * var27Lifetime1Lifetime1) >> 16) + var9;
                  k.field_m[var24Lifetime2] = var10 + (var27Lifetime1Lifetime1 * var20 + var26Lifetime1Lifetime1 * var17 + var25Lifetime1Lifetime1 * var13 >> 16);
                  kc.field_N[var24Lifetime2] = (var21 * var27Lifetime1Lifetime1 + var18 * var26Lifetime1Lifetime1 + var25Lifetime1Lifetime1 * var14 >> 16) + var11;
                  var25Lifetime1Lifetime1 = param4.field_J[var24Lifetime2];
                  var26Lifetime1Lifetime1 = param4.field_a[var24Lifetime2];
                  var27Lifetime1Lifetime1 = param4.field_j[var24Lifetime2];
                  cn.field_M[var24Lifetime2] = var9 + (var27Lifetime1Lifetime1 * var19 + (var16 * var26Lifetime1Lifetime1 + var12 * var25Lifetime1Lifetime1) >> 16);
                  q.field_E[var24Lifetime2] = (var25Lifetime1Lifetime1 * var13 + var26Lifetime1Lifetime1 * var17 + var27Lifetime1Lifetime1 * var20 >> 16) + var10;
                  dh.field_Db[var24Lifetime2] = (var26Lifetime1Lifetime1 * var18 + var25Lifetime1Lifetime1 * var14 + var27Lifetime1Lifetime1 * var21 >> 16) + var11;
                  var25Lifetime1Lifetime1 = param4.field_o[var24Lifetime2];
                  var26Lifetime1Lifetime1 = param4.field_E[var24Lifetime2];
                  var27Lifetime1Lifetime1 = param4.field_p[var24Lifetime2];
                  ik.field_d[var24Lifetime2] = (var19 * var27Lifetime1Lifetime1 + var12 * var25Lifetime1Lifetime1 + var26Lifetime1Lifetime1 * var16 >> 16) + var9;
                  be.field_m[var24Lifetime2] = (var27Lifetime1Lifetime1 * var20 + (var13 * var25Lifetime1Lifetime1 + var17 * var26Lifetime1Lifetime1) >> 16) + var10;
                  lm.field_b[var24Lifetime2] = var11 + (var21 * var27Lifetime1Lifetime1 + (var26Lifetime1Lifetime1 * var18 + var25Lifetime1Lifetime1 * var14) >> 16);
                  var24Lifetime2++;
                  if (var31 != 0) {
                    return;
                  }
                }
              }
              if (param3) {
                var9 = param2[3];
                var10 = param2[4];
                var11 = param2[5];
                var12 = param2[6];
                var13 = param2[7];
                var14 = param2[8];
                var15Lifetime1 = param2[9];
                var16 = param2[10];
                var17 = param2[11];
                var18 = 0;
                while (true) {
                  stackIn_57_0Lifetime1 = ~param4.field_A;
                  stackIn_57_1Lifetime1 = ~var18;
                  if (stackIn_57_0Lifetime1 >= stackIn_57_1Lifetime1) {
                    break;
                  }
                  stackIn_66_0 = ~var18;
                  if (var31 != 0) {
                    break L2;
                  }
                  if (stackIn_66_0 <= ~dc.field_k.length) {
                    break;
                  }
                  var19 = param4.field_r[var18];
                  var20 = param4.field_e[var18];
                  var21 = param4.field_S[var18];
                  dc.field_k[var18] = var9 * var19 - (-(var12 * var20) - var21 * var15Lifetime1) >> 16;
                  nf.field_Lb[var18] = var16 * var21 + var13 * var20 + var10 * var19 >> 16;
                  mf.field_b[var18] = var21 * var17 + var19 * var11 + var20 * var14 >> 16;
                  var18++;
                }
              }
            }
            stackIn_66_0 = param5 ? 1 : 0;
            break;
          }
          ig.a(stackIn_66_0 != 0, param4, var8, (byte) -79, var7_int);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_71_0 = var7;
          stackIn_71_1 = new StringBuilder().append("to.KA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          stackIn_75_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',');
          if (param2 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          stackIn_79_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    static {
        field_n = "You need a rating of <%1> to play with the current options.";
        field_o = "If you run out of Imps, just summon some more. Move an Imp to a target and blow it up!";
        field_r = new int[228];
    }
}
