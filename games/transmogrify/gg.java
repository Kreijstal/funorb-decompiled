/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg {
    String field_a;
    private int field_g;
    private int field_e;
    private int field_d;
    private qk[] field_b;
    float field_c;
    static hi field_f;

    final boolean a(int param0) {
        boolean stackIn_6_0 = false;
        boolean stackIn_40_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0;
        qk var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        var3 = Transmogrify.field_A ? 1 : 0;
        try {
          if (param0 != 5) {
            gg.c(-8);
          }
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (this.field_g >= this.field_e))) {
            var2 = this.field_b[this.field_g];
            stackOut_5_0 = var2.field_a.a((byte) -121);
            stackIn_40_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (var3 == 0) {
              if (!stackIn_6_0) {
                this.a((byte) -128, var2, 0);
                return false;
              }
              if (var2.field_f >= 0 &&
                !var2.field_a.a((byte) -18, var2.field_f)) {
                this.a((byte) -111, var2, var2.field_a.a(true, var2.field_f));
                return false;
              }
              if (var2.field_g != null &&
                !var2.field_a.a((byte) -1, var2.field_g)) {
                this.a((byte) -128, var2, var2.field_a.a(param0 - 5, var2.field_g));
                return false;
              }
              if (0 > var2.field_f &&
                var2.field_g == null &&
                null != var2.field_d &&
                !var2.field_a.c(32031)) {
                this.a((byte) -117, var2, var2.field_a.b(-22884));
                return false;
              }
              this.field_g = this.field_g + 1;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_40_0 = true;
          }
          return stackIn_40_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var2_ref), "gg.C(" + param0 + ')');
        }
    }

    public static void c(int param0) {
        try {
          field_f = null;
          int var1_int = 83 % ((27 - param0) / 58);
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "gg.A(" + param0 + ')');
        }
    }

    final static void a(byte param0, int[] param1, boolean param2, boolean param3, e param4, boolean param5, int[] param6) {
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_85_2 = null;
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
        int stackIn_62_0Lifetime1;
        int stackIn_62_1Lifetime1;
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
        var30 = Transmogrify.field_A ? 1 : 0;
        try {
          var7_int = 2147483647;
          var8 = -2147483648;
          if (param0 < 72) {
            gg.b(-92);
          }
          var21 = param1[3] >> 2;
          var22 = param1[4] >> 2;
          var23 = param1[5] >> 2;
          var24 = param1[6] >> 2;
          var25 = param1[7] >> 2;
          var26 = param1[8] >> 2;
          var27 = param1[9] >> 2;
          var28 = param1[10] >> 2;
          var29 = param1[11] >> 2;
          var13 = param6[3] * var24 + param6[4] * var25 + param6[5] * var26 >> 14;
          var12 = param6[5] * var23 + var21 * param6[3] + var22 * param6[4] >> 14;
          var15 = param6[8] * var23 + (var21 * param6[6] + var22 * param6[7]) >> 14;
          var16 = param6[7] * var25 + param6[6] * var24 + param6[8] * var26 >> 14;
          var20 = var28 * param6[10] + var27 * param6[9] + var29 * param6[11] >> 14;
          var14 = param6[5] * var29 + (var28 * param6[4] + var27 * param6[3]) >> 14;
          var17 = param6[7] * var28 + (param6[6] * var27 + var29 * param6[8]) >> 14;
          var18 = param6[11] * var23 + var21 * param6[9] + param6[10] * var22 >> 14;
          var19 = var24 * param6[9] - (-(param6[10] * var25) - var26 * param6[11]) >> 14;
          var21Lifetime1 = -param1[0] + param6[0];
          var22Lifetime1 = -param1[1] + param6[1];
          var23Lifetime1 = -param1[2] + param6[2];
          var9 = var23Lifetime1 * param1[5] + param1[3] * var21Lifetime1 + param1[4] * var22Lifetime1 >> 16 - nd.field_m;
          var10 = var23Lifetime1 * param1[8] + var21Lifetime1 * param1[6] + var22Lifetime1 * param1[7] >> -nd.field_m + 16;
          var11 = var22Lifetime1 * param1[10] + var21Lifetime1 * param1[9] + var23Lifetime1 * param1[11] >> 16;
          var21Lifetime2 = ka.field_f;
          var22Lifetime2 = ka.field_g;
          var23Lifetime2 = 0;
          L2: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (param4.field_M > var23Lifetime2) {
              var24Lifetime1 = param4.field_v[var23Lifetime2];
              var25Lifetime1 = param4.field_d[var23Lifetime2];
              var26Lifetime1 = param4.field_B[var23Lifetime2];
              var27Lifetime1 = var9 + (var25Lifetime1 * var15 + var12 * var24Lifetime1 + var26Lifetime1 * var18 >> 16 - nd.field_m);
              var28Lifetime1 = (var25Lifetime1 * var16 + (var24Lifetime1 * var13 + var26Lifetime1 * var19) >> -nd.field_m + 16) + var10;
              var29Lifetime1 = var11 + (var20 * var26Lifetime1 + var14 * var24Lifetime1 + var17 * var25Lifetime1 >> 16);
              stackIn_62_0 = ~var29Lifetime1;
              stackIn_62_1 = -51;
              if (var30 != 0) {
                if (stackIn_62_0 < stackIn_62_1) {
                  stackIn_71_0 = ~var18;
                  stackIn_71_1 = ~mk.field_w.length;
                  break L2;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (stackIn_62_0 > stackIn_62_1) {
                  nd.field_l[var23Lifetime2] = -2147483648;
                } else {
                  sg.field_a[var23Lifetime2] = var27Lifetime1 / var29Lifetime1 + var21Lifetime2;
                  d.field_a[var23Lifetime2] = var22Lifetime2 + var28Lifetime1 / var29Lifetime1;
                  if (var7_int > var29Lifetime1) {
                    var7_int = var29Lifetime1;
                  }
                  nd.field_l[var23Lifetime2] = var29Lifetime1;
                  if (var8 < var29Lifetime1) {
                    var8 = var29Lifetime1;
                  }
                }
                if (param5) {
                  el.field_m[var23Lifetime2] = var27Lifetime1 >> nd.field_m;
                  hi.field_h[var23Lifetime2] = var28Lifetime1 >> nd.field_m;
                  rk.field_q[var23Lifetime2] = var29Lifetime1;
                }
                var23Lifetime2++;
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              boolean decompiledFrameCompleted0 = true;
              if (param4.field_j != null &&
                param4.field_a != null &&
                null != param4.field_c &&
                null != param4.field_g &&
                null != param4.field_Q &&
                param4.field_p != null &&
                param4.field_D != null &&
                null != param4.field_E &&
                null != param4.field_m) {
                var23Lifetime2 = 0;
                while (!(param4.field_C <= var23Lifetime2)) {
                  var24Lifetime1Lifetime1 = param4.field_j[var23Lifetime2];
                  var25Lifetime1Lifetime1 = param4.field_a[var23Lifetime2];
                  var26Lifetime1Lifetime1 = param4.field_c[var23Lifetime2];
                  db.field_e[var23Lifetime2] = var9 + (var18 * var26Lifetime1Lifetime1 + (var24Lifetime1Lifetime1 * var12 + var15 * var25Lifetime1Lifetime1) >> 16);
                  me.field_i[var23Lifetime2] = var10 + (var13 * var24Lifetime1Lifetime1 - (-(var16 * var25Lifetime1Lifetime1) - var26Lifetime1Lifetime1 * var19) >> 16);
                  ec.field_c[var23Lifetime2] = (var14 * var24Lifetime1Lifetime1 + (var17 * var25Lifetime1Lifetime1 + var20 * var26Lifetime1Lifetime1) >> 16) + var11;
                  var24Lifetime1Lifetime1 = param4.field_g[var23Lifetime2];
                  var25Lifetime1Lifetime1 = param4.field_Q[var23Lifetime2];
                  var26Lifetime1Lifetime1 = param4.field_p[var23Lifetime2];
                  nk.field_e[var23Lifetime2] = (var18 * var26Lifetime1Lifetime1 + var24Lifetime1Lifetime1 * var12 + var15 * var25Lifetime1Lifetime1 >> 16) + var9;
                  qe.field_z[var23Lifetime2] = var10 + (var26Lifetime1Lifetime1 * var19 + var16 * var25Lifetime1Lifetime1 + var13 * var24Lifetime1Lifetime1 >> 16);
                  wi.field_d[var23Lifetime2] = (var25Lifetime1Lifetime1 * var17 + var14 * var24Lifetime1Lifetime1 + var26Lifetime1Lifetime1 * var20 >> 16) + var11;
                  var24Lifetime1Lifetime1 = param4.field_D[var23Lifetime2];
                  var25Lifetime1Lifetime1 = param4.field_E[var23Lifetime2];
                  var26Lifetime1Lifetime1 = param4.field_m[var23Lifetime2];
                  bl.field_d[var23Lifetime2] = (var15 * var25Lifetime1Lifetime1 + var12 * var24Lifetime1Lifetime1 + var18 * var26Lifetime1Lifetime1 >> 16) + var9;
                  rl.field_d[var23Lifetime2] = var10 + (var19 * var26Lifetime1Lifetime1 + (var25Lifetime1Lifetime1 * var16 + var13 * var24Lifetime1Lifetime1) >> 16);
                  kf.field_g[var23Lifetime2] = (var14 * var24Lifetime1Lifetime1 + var17 * var25Lifetime1Lifetime1 + var26Lifetime1Lifetime1 * var20 >> 16) + var11;
                  var23Lifetime2++;
                  if (var30 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
              }
              if ((decompiledFrameCompleted0) &&
                (decompiledFrameRemainder0 = (param2))) {
                var9 = param6[3];
                var10 = param6[4];
                var11 = param6[5];
                var12 = param6[6];
                var13 = param6[7];
                var14 = param6[8];
                var15 = param6[9];
                var16 = param6[10];
                var17 = param6[11];
              }
              if (decompiledFrameRemainder0) {
                var18 = 0;
                while (true) {
                  stackIn_62_0Lifetime1 = var18;
                  stackIn_62_1Lifetime1 = param4.field_l;
                  if (stackIn_62_0Lifetime1 >= stackIn_62_1Lifetime1) {
                    break;
                  }
                  stackIn_71_0 = ~var18;
                  stackIn_71_1 = ~mk.field_w.length;
                  if (var30 != 0) {
                    break L2;
                  }
                  if (stackIn_71_0 <= stackIn_71_1) {
                    break;
                  }
                  var19 = param4.field_e[var18];
                  var20 = param4.field_F[var18];
                  var21Lifetime2 = param4.field_L[var18];
                  mk.field_w[var18] = var15 * var21Lifetime2 + (var9 * var19 + var12 * var20) >> 16;
                  nh.field_j[var18] = var19 * var10 + (var20 * var13 + var21Lifetime2 * var16) >> 16;
                  d.field_b[var18] = var21Lifetime2 * var17 + (var14 * var20 + var19 * var11) >> 16;
                  var18++;
                }
              }
            }
            stackIn_71_0 = var8;
            stackIn_71_1 = -128;
            break;
          }
          ej.$cfr$intArgs$a$ff69b800fca9(stackIn_71_0, stackIn_71_1, param4, param3, var7_int);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_76_0 = var7;
          stackIn_76_1 = new StringBuilder().append("gg.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          stackIn_80_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          stackIn_84_1 = ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_85_2 = "null";
          } else {
            stackIn_85_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_76_0), ((StringBuilder) (Object) stackIn_84_1).append(stackIn_85_2).append(')').toString());
        }
    }

    final static void b(int param0) {
        try {
          dg.b(-81);
          ba.a(119, param0);
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "gg.D(" + param0 + ')');
        }
    }

    private gg() throws Throwable {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          throw new Error();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1), "gg.<init>()");
        }
    }

    private final void a(byte param0, qk param1, int param2) {
        float var4_float = 0.0f;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param0 > -107) {
            field_f = (hi) null;
          }
          var4_float = (float)(1 + this.field_g) + (float)param2 / 100.0f;
          if (param2 == 0) {
            this.field_a = param1.field_b;
          }
          if (param2 != 0 ||
            Transmogrify.field_A) {
            this.field_a = param1.field_d + " - " + param2 + "%";
          }
          this.field_c = (float)this.field_d * var4_float / (float)(1 + this.field_e);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("gg.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_f = new hi();
    }
}
