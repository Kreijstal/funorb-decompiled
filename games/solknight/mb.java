/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb {
    static ff field_b;
    private String field_c;
    private boolean field_a;

    final static sd a(int param0, int param1, byte param2, int param3, int param4) {
        sd var5 = null;
        int var6 = 0;
        sd stackIn_9_0 = null;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        sd stackIn_16_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var6 = SolKnight.field_L ? 1 : 0;
        try {
          var5 = (sd) (r.field_b.a((byte) 51));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var5 == null))) {
            stackIn_12_0 = ~var5.field_o;
            stackIn_12_1 = ~param0;
            if (var6 == 0) {
              if (stackIn_12_0 == stackIn_12_1) {
                stackIn_9_0 = var5;
                return stackIn_9_0;
              }
              var5 = (sd) (r.field_b.b(-123));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            var5 = new sd();
            var5.field_l = param1;
            var5.field_o = param0;
            var5.field_k = param3;
            stackIn_12_0 = param2;
            stackIn_12_1 = 105;
          }
          if (stackIn_12_0 <= stackIn_12_1) {
            field_b = (ff) null;
          }
          r.field_b.a(var5, -7044);
          fi.a(var5, param4, -24045);
          stackIn_16_0 = var5;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var5_ref), "mb.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(boolean param0, int param1, int param2) {
        try {
          ug.a((byte) -76, bf.field_b[param1], qc.field_l[param1] * param2 >> 9);
          if (!param0) {
            field_b = (ff) null;
          }
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "mb.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(uh param0, boolean param1, int[] param2, int[] param3, boolean param4, boolean param5, int param6) {
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_79_2 = null;
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
        int stackIn_56_0Lifetime1;
        int stackIn_56_1Lifetime1;
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
        var30 = SolKnight.field_L ? 1 : 0;
        try {
          var7_int = 2147483647;
          var8 = -2147483648;
          var21 = param2[3] >> 2;
          var22 = param2[4] >> 2;
          var23 = param2[5] >> 2;
          var24 = param2[6] >> 2;
          var25 = param2[7] >> 2;
          var26 = param2[8] >> 2;
          var27 = param2[9] >> 2;
          var28 = param2[10] >> 2;
          var12 = var23 * param3[param6] + param3[3] * var21 + var22 * param3[4] >> 14;
          var29 = param2[11] >> 2;
          var13 = param3[5] * var26 + (param3[4] * var25 + param3[3] * var24) >> 14;
          var17 = var29 * param3[8] + param3[7] * var28 + var27 * param3[6] >> 14;
          var15 = param3[6] * var21 + var22 * param3[7] + param3[8] * var23 >> 14;
          var18 = param3[11] * var23 + param3[10] * var22 + var21 * param3[9] >> 14;
          var20 = param3[11] * var29 + (var28 * param3[10] + var27 * param3[9]) >> 14;
          var19 = param3[11] * var26 + (var25 * param3[10] + param3[9] * var24) >> 14;
          var16 = var26 * param3[8] + (var24 * param3[6] + param3[7] * var25) >> 14;
          var14 = param3[5] * var29 + var27 * param3[3] + var28 * param3[4] >> 14;
          var21Lifetime1 = param3[0] - param2[0];
          var22Lifetime1 = param3[1] - param2[1];
          var23Lifetime1 = -param2[2] + param3[2];
          var9 = var22Lifetime1 * param2[4] + (param2[3] * var21Lifetime1 + var23Lifetime1 * param2[5]) >> -pj.field_H + 16;
          var10 = var23Lifetime1 * param2[8] + param2[6] * var21Lifetime1 + var22Lifetime1 * param2[7] >> -pj.field_H + 16;
          var11 = param2[11] * var23Lifetime1 + var22Lifetime1 * param2[10] + var21Lifetime1 * param2[9] >> 16;
          var21Lifetime2 = hk.field_f;
          var22Lifetime2 = hk.field_e;
          var23Lifetime2 = 0;
          L1: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (var23Lifetime2 < param0.field_y) {
              var24Lifetime1 = param0.field_n[var23Lifetime2];
              var25Lifetime1 = param0.field_q[var23Lifetime2];
              var26Lifetime1 = param0.field_z[var23Lifetime2];
              var27Lifetime1 = var9 + (var24Lifetime1 * var12 - (-(var25Lifetime1 * var15) - var18 * var26Lifetime1) >> -pj.field_H + 16);
              var28Lifetime1 = var10 + (var24Lifetime1 * var13 + var16 * var25Lifetime1 + var19 * var26Lifetime1 >> 16 - pj.field_H);
              var29Lifetime1 = var11 + (var20 * var26Lifetime1 + var25Lifetime1 * var17 + var14 * var24Lifetime1 >> 16);
              stackIn_56_0 = -51;
              stackIn_56_1 = ~var29Lifetime1;
              if (var30 != 0) {
                if (stackIn_56_0 > stackIn_56_1) {
                  stackIn_65_0 = ~var18;
                  stackIn_65_1 = ~mh.field_a.length;
                  break L1;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (stackIn_56_0 >= stackIn_56_1) {
                  qb.field_ab[var23Lifetime2] = var27Lifetime1 / var29Lifetime1 + var21Lifetime2;
                  a.field_d[var23Lifetime2] = var28Lifetime1 / var29Lifetime1 + var22Lifetime2;
                  if (var8 < var29Lifetime1) {
                    var8 = var29Lifetime1;
                  }
                  hl.field_a[var23Lifetime2] = var29Lifetime1;
                  if (var7_int > var29Lifetime1) {
                    var7_int = var29Lifetime1;
                  }
                } else {
                  hl.field_a[var23Lifetime2] = -2147483648;
                }
                if (param1) {
                  ig.field_D[var23Lifetime2] = var27Lifetime1 >> pj.field_H;
                  ob.field_m[var23Lifetime2] = var28Lifetime1 >> pj.field_H;
                  hf.field_b[var23Lifetime2] = var29Lifetime1;
                }
                var23Lifetime2++;
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              boolean decompiledFrameCompleted0 = true;
              if (null != param0.field_p &&
                null != param0.field_x &&
                param0.field_h != null &&
                null != param0.field_i &&
                null != param0.field_O &&
                null != param0.field_I &&
                null != param0.field_L &&
                null != param0.field_M &&
                param0.field_u != null) {
                var23Lifetime2 = 0;
                while (!(var23Lifetime2 >= param0.field_F)) {
                  var24Lifetime1Lifetime1 = param0.field_p[var23Lifetime2];
                  var25Lifetime1Lifetime1 = param0.field_x[var23Lifetime2];
                  var26Lifetime1Lifetime1 = param0.field_h[var23Lifetime2];
                  ng.field_b[var23Lifetime2] = var9 + (var12 * var24Lifetime1Lifetime1 + var15 * var25Lifetime1Lifetime1 + var26Lifetime1Lifetime1 * var18 >> 16);
                  hg.field_B[var23Lifetime2] = (var19 * var26Lifetime1Lifetime1 + (var24Lifetime1Lifetime1 * var13 + var16 * var25Lifetime1Lifetime1) >> 16) + var10;
                  cd.field_b[var23Lifetime2] = (var25Lifetime1Lifetime1 * var17 + (var24Lifetime1Lifetime1 * var14 + var20 * var26Lifetime1Lifetime1) >> 16) + var11;
                  var24Lifetime1Lifetime1 = param0.field_i[var23Lifetime2];
                  var25Lifetime1Lifetime1 = param0.field_O[var23Lifetime2];
                  var26Lifetime1Lifetime1 = param0.field_I[var23Lifetime2];
                  ab.field_A[var23Lifetime2] = var9 + (var26Lifetime1Lifetime1 * var18 + (var15 * var25Lifetime1Lifetime1 + var24Lifetime1Lifetime1 * var12) >> 16);
                  aj.field_o[var23Lifetime2] = (var13 * var24Lifetime1Lifetime1 + (var25Lifetime1Lifetime1 * var16 + var26Lifetime1Lifetime1 * var19) >> 16) + var10;
                  pl.field_c[var23Lifetime2] = var11 + (var24Lifetime1Lifetime1 * var14 - (-(var25Lifetime1Lifetime1 * var17) - var26Lifetime1Lifetime1 * var20) >> 16);
                  var24Lifetime1Lifetime1 = param0.field_L[var23Lifetime2];
                  var25Lifetime1Lifetime1 = param0.field_M[var23Lifetime2];
                  var26Lifetime1Lifetime1 = param0.field_u[var23Lifetime2];
                  fa.field_g[var23Lifetime2] = var9 + (var25Lifetime1Lifetime1 * var15 + (var24Lifetime1Lifetime1 * var12 + var26Lifetime1Lifetime1 * var18) >> 16);
                  ci.field_pb[var23Lifetime2] = (var16 * var25Lifetime1Lifetime1 + (var13 * var24Lifetime1Lifetime1 + var19 * var26Lifetime1Lifetime1) >> 16) + var10;
                  pb.field_a[var23Lifetime2] = (var24Lifetime1Lifetime1 * var14 + (var25Lifetime1Lifetime1 * var17 + var26Lifetime1Lifetime1 * var20) >> 16) + var11;
                  var23Lifetime2++;
                  if (var30 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
              }
              if ((decompiledFrameCompleted0) &&
                (decompiledFrameRemainder0 = (param4))) {
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
                  stackIn_56_0Lifetime1 = param0.field_b;
                  stackIn_56_1Lifetime1 = var18;
                  if (stackIn_56_0Lifetime1 <= stackIn_56_1Lifetime1) {
                    break;
                  }
                  stackIn_65_0 = ~var18;
                  stackIn_65_1 = ~mh.field_a.length;
                  if (var30 != 0) {
                    break L1;
                  }
                  if (stackIn_65_0 <= stackIn_65_1) {
                    break;
                  }
                  var19 = param0.field_B[var18];
                  var20 = param0.field_v[var18];
                  var21Lifetime2 = param0.field_J[var18];
                  mh.field_a[var18] = var12 * var20 + var9 * var19 + var21Lifetime2 * var15 >> 16;
                  fa.field_e[var18] = var21Lifetime2 * var16 + var19 * var10 + var20 * var13 >> 16;
                  tk.field_r[var18] = var21Lifetime2 * var17 + var14 * var20 + var19 * var11 >> 16;
                  var18++;
                }
              }
            }
            stackIn_65_0 = var8;
            stackIn_65_1 = 0;
            break;
          }
          jd.a(stackIn_65_0, stackIn_65_1 != 0, param5, param0, var7_int);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_70_0 = var7;
          stackIn_70_1 = new StringBuilder().append("mb.D(");
          if (param0 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          stackIn_78_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',');
          if (param3 == null) {
            stackIn_79_2 = "null";
          } else {
            stackIn_79_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static o[] a(int param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        o[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 < 4) {
            mb.b(-114);
          }
          stackIn_4_0 = ug.a(param0, -8591, 1, param3, param1);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var4), "mb.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(boolean param0) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            this.field_c = (String) null;
          }
          stackIn_4_0 = this.field_a;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var2), "mb.B(" + param0 + ')');
        }
    }

    final String a(int param0) {
        RuntimeException var2 = null;
        String stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 34) {
            mb.a((uh) null, false, (int[]) null, (int[]) null, false, false, -8);
          }
          stackIn_4_0 = this.field_c;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var2), "mb.C(" + param0 + ')');
        }
    }

    mb(String param0) {
        this(param0, false);
    }

    public static void b(int param0) {
        try {
          field_b = null;
          if (param0 != -694484242) {
            mb.a(-113, -50, (byte) 55, 27, -105);
          }
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "mb.G(" + param0 + ')');
        }
    }

    mb(String param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_c = param0;
          if (this.field_c == null) {
            this.field_c = "";
          }
          this.field_a = param1;
          if (this.field_c.length() == 0) {
            this.field_a = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_12_0 = runtimeException;
          stackIn_12_1 = new StringBuilder().append("mb.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_b = new ff(11, 0, 1, 2);
    }
}
