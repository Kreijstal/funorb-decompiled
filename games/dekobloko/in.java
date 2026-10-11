/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class in extends bh {
    boolean field_p;
    static String field_u;
    static w field_o;
    private ck field_t;
    static String field_s;
    int field_r;
    private int[] field_q;
    static lm field_n;

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, boolean param14, boolean param15) {
        int var43 = 0;
        Object stackIn_74_0 = null;
        int stackIn_75_1 = 0;
        Object stackIn_81_0;
        Object stackIn_81_1;
        int stackIn_81_2;
        int stackIn_81_3;
        int stackIn_81_4;
        int stackIn_81_5;
        int stackIn_81_6;
        int stackIn_81_7;
        boolean stackIn_82_8;
        int var17;
        int var18;
        int var19;
        int var20;
        Object var21;
        Object var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var27;
        int var28;
        int var29;
        int var30;
        int var31;
        int var32;
        int var33;
        int var34;
        int var35;
        int var36;
        int var37;
        int var38;
        int var39;
        int var40;
        int var41;
        int var42;
        int var44;
        int var45;
        int var46;
        int var47;
        int var48;
        int var49;
        int var50;
        int var51;
        int var52;
        int var53;
        int var54;
        int var55;
        int var56;
        int var57;
        int var58;
        Object var59;
        int var60;
        int var32Lifetime1;
        var17 = param9;
        var18 = -param7;
        var19 = this.field_t.field_D[param11 * this.field_t.field_K + param10];
        var20 = (var19 & 24) >> 3;
        var21 = null;
        var22 = null;
        var23 = 0;
        var24 = 2;
        var25 = Math.abs(param9);
        if (var20 == 1) {
          boolean decompiledFrameRemainder0 = true;
          if (param10 > 0) {
            if (((this.field_t.field_D[param11 * this.field_t.field_K + (param10 - 1)] ^ var19) & 31) == 0) {
              var23++;
              if (param10 >= this.field_t.field_K - 1) {
                if ((!(param11 <= 0)) &&
                  ((((this.field_t.field_D[(param11 - 1) * this.field_t.field_K + param10] ^ var19) & 31) == 0))) {
                  var23 += 4;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (((this.field_t.field_D[param11 * this.field_t.field_K + (param10 + 1)] ^ var19) & 31) != 0) {
                  if ((!(param11 <= 0)) &&
                    ((((this.field_t.field_D[(param11 - 1) * this.field_t.field_K + param10] ^ var19) & 31) == 0))) {
                    var23 += 4;
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  var23 += 2;
                }
              }
            } else {
              if (param10 >= this.field_t.field_K - 1) {
                if ((!(param11 <= 0)) &&
                  ((((this.field_t.field_D[(param11 - 1) * this.field_t.field_K + param10] ^ var19) & 31) == 0))) {
                  var23 += 4;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (((this.field_t.field_D[param11 * this.field_t.field_K + (param10 + 1)] ^ var19) & 31) != 0) {
                  if ((!(param11 <= 0)) &&
                    ((((this.field_t.field_D[(param11 - 1) * this.field_t.field_K + param10] ^ var19) & 31) == 0))) {
                    var23 += 4;
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  var23 += 2;
                }
              }
            }
          } else {
            if (param10 >= this.field_t.field_K - 1) {
              if ((!(param11 <= 0)) &&
                ((((this.field_t.field_D[(param11 - 1) * this.field_t.field_K + param10] ^ var19) & 31) == 0))) {
                var23 += 4;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (((this.field_t.field_D[param11 * this.field_t.field_K + (param10 + 1)] ^ var19) & 31) != 0) {
                if ((!(param11 <= 0)) &&
                  ((((this.field_t.field_D[(param11 - 1) * this.field_t.field_K + param10] ^ var19) & 31) == 0))) {
                  var23 += 4;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                var23 += 2;
              }
            }
          }
          if ((decompiledFrameRemainder0) && (param11 > 0 &&
            ((this.field_t.field_D[(param11 - 1) * this.field_t.field_K + param10] ^ var19) & 31) == 0)) {
            var23 += 4;
          }
          if (param11 < this.field_t.field_C - 1 &&
            ((this.field_t.field_D[(param11 + 1) * this.field_t.field_K + param10] ^ var19) & 31) == 0) {
            var23 += 8;
          }
          var21 = ob.field_j[param0][var19 & 7];
          var22 = gf.field_f[var23];
        }
        var26 = this.field_q[param11 * this.field_t.field_K + param10];
        var27 = (byte)var26;
        var28 = (byte)(var26 >> 8);
        var29 = var26 >> 16 & 255;
        var30 = var26 >> 24;
        var31 = (param13 + var30 - 60) * 1000 / 60;
        if (param14) {
          var32 = (int)(333.0 * Math.sin((double)(uf.field_A + var30) * 0.045));
          if (var31 > var32) {
            var31 = var32;
          }
        }
        var31 = var31 * var31 / 1000;
        var32Lifetime1 = (param13 + var30 / 2 - 60) * 2000 / 60;
        if (param14 &&
          var32Lifetime1 > 0) {
          var32Lifetime1 = 0;
        } else {
          var32Lifetime1 = var32Lifetime1 * var32Lifetime1 / 2000;
          var32Lifetime1 = var32Lifetime1 * var32Lifetime1 / 2000;
          var32Lifetime1 = var32Lifetime1 * var32Lifetime1 / 2000;
        }
        var33 = var29 * (var31 + var32Lifetime1) / 10;
        var34 = var33 * var27 / ((this.field_t.field_K + this.field_t.field_C) * 4);
        var35 = var33 * var28 / ((this.field_t.field_K + this.field_t.field_C) * 4) + (int)(100.0 * Math.sin((double)(uf.field_A + var30 * 4) * 0.07));
        var36 = 4000000 / param3;
        var37 = (var34 * param7 + var33 * param9) / (var36 * 2);
        var38 = (var34 * param9 - var33 * param7) / (var36 * 2);
        param4 = param4 + var37;
        param5 = param5 + var35;
        param6 = param6 + var38;
        if (var21 == null) {
          return;
        }
        if (var25 < param7 * 2) {
          var24 = 1 + ((var24 - 1) * var25 + param7 / 2) / param7;
        }
        var39 = 2147483647;
        var40 = -2147483648;
        var41 = 2147483647;
        var42 = -2147483648;
        for (var43 = -var24; var43 <= var24; var43 += 2) {
          var44 = var43;
          var45 = var43;
          var46 = this.field_t.field_K * var24 * 2;
          var47 = param4 + (param10 * param7 * var24 * 2 + var17 * var44) / var46;
          var48 = param4 + ((param10 + 1) * param7 * var24 * 2 + var17 * var45) / var46;
          var49 = param5 + param11 * param8 / this.field_t.field_C;
          var50 = param5 + (param11 + 1) * param8 / this.field_t.field_C;
          var51 = param6 + (param10 * param9 * var24 * 2 + var18 * var44) / var46;
          var52 = param6 + ((param10 + 1) * param9 * var24 * 2 + var18 * var45) / var46;
          if (var51 >= 500 &&
            var52 >= 500) {
            var53 = param1 + var47 * param3 / var51;
            var54 = param1 + var48 * param3 / var52;
            var55 = param2 + var49 * param3 / var51;
            var56 = param2 + var49 * param3 / var52;
            var57 = param2 + var50 * param3 / var51;
            var58 = param2 + var50 * param3 / var52;
            if (!param15) {
              stackIn_74_0 = var21;
              if (var43 != var24) {
                stackIn_75_1 = var23 & 12;
              } else {
                stackIn_75_1 = var23;
              }
              var59 = ((Object[]) (stackIn_74_0))[stackIn_75_1];
              var60 = 0;
              if (param10 < param12) {
                var60 = (var24 - var43) * ((ck) (var59)).field_K / (var24 * 2);
              }
              if (param10 > param12) {
                var60 = (var24 + var43) * ((ck) (var59)).field_K / (var24 * 2);
              }
              stackIn_81_0 = var59;
              stackIn_81_1 = var22;
              stackIn_81_2 = var53;
              stackIn_81_3 = var54;
              stackIn_81_4 = var55;
              stackIn_81_5 = var56;
              stackIn_81_6 = var57;
              stackIn_81_7 = var58;
              stackIn_82_8 = !(var43 >= var24);
              cg.a((ck) (stackIn_81_0), (pi) (stackIn_81_1), stackIn_81_2, stackIn_81_3, stackIn_81_4, stackIn_81_5, stackIn_81_6, stackIn_81_7, stackIn_82_8, false, var60, -1);
            } else {
              if (var53 < var39) {
                var39 = var53;
              }
              if (var54 > var40) {
                var40 = var54;
              }
              if (var55 < var41) {
                var41 = var55;
              }
              if (var56 < var41) {
                var41 = var56;
              }
              if (var57 > var42) {
                var42 = var57;
              }
              if (var58 > var42) {
                var42 = var58;
              }
            }
          }
        }
        if (var39 != 2147483647) {
          hk.c(var39 - 2, var41 - 2, var40 - var39 + 4, var42 - var41 + 4, 2, 0);
        }
        return;
    }

    in(String param0, int param1, boolean param2) {
        int var10 = 0;
        int var11 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int var25 = 0;
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
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
        int var26 = 0;
        int[] var29 = null;
        int[] var31 = null;
        int[] var33 = null;
        int var19Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var22Lifetime1;
        this.field_r = 0;
        try {
          stackIn_4_1 = (param2);
          this.field_p = stackIn_4_1;
          var4_int = field_n.b(param0, 2147483647);
          var5 = field_n.b(param0, 2147483647, 8);
          var4_int--;
          this.field_t = new ck(var4_int, var5);
          var33 = hk.field_l;
          var7 = hk.field_j;
          var8 = hk.field_i;
          this.field_t.a();
          field_n.a(param0, 0, 0, 1 + var4_int, var5, param1, -1, 1, 1, 8);
          hk.a(var33, var7, var8);
          this.field_q = new int[var4_int * var5];
          var31 = new int[var5 * var4_int];
          var29 = var31;
          var9 = var29;
          for (var10 = 0; var10 < var5; var10++) {
            for (var11 = 0; var4_int > var11; var11++) {
              if (this.field_q[var10 * var4_int + var11] == 0) {
                var12 = this.field_t.field_D[var4_int * var10 + var11];
                if ((24 & var12) != 0) {
                  var13 = var11;
                  var14 = var11;
                  var15 = var10;
                  var16 = var10;
                  var17 = 0;
                  var18 = 1;
                  var9[0] = var10 * var4_int + var11;
                  this.field_t.field_D[var4_int * var10 + var11] = this.field_t.field_D[var4_int * var10 + var11] + -2147483648;
                  if ((24 & var12) == 8) {
                    var19 = 31 & var12;
                    while (var17 < var18) {
                      var20 = var9[var17++];
                      var21 = var20 % var4_int;
                      if (var21 < var13) {
                        var13 = var21;
                      }
                      if (var14 < var21) {
                        var14 = var21;
                      }
                      var22 = var20 / var4_int;
                      if (var16 < var22) {
                        var16 = var22;
                      }
                      if (var15 > var22) {
                        var15 = var22;
                      }
                      if (0 < var21 &&
                        (-2147483617 & this.field_t.field_D[var20 - 1]) == var19) {
                        incrementValue$1 = var18;
                        var18++;
                        var9[incrementValue$1] = -1 + var20;
                        this.field_t.field_D[-1 + var20] = this.field_t.field_D[-1 + var20] + -2147483648;
                      }
                      if (-1 + var4_int > var21 &&
                        (this.field_t.field_D[1 + var20] & -2147483617) == var19) {
                        incrementValue$2 = var18;
                        var18++;
                        var9[incrementValue$2] = 1 + var20;
                        this.field_t.field_D[var20 + 1] = this.field_t.field_D[var20 + 1] + -2147483648;
                      }
                      if (var22 > 0 &&
                        (this.field_t.field_D[-var4_int + var20] & -2147483617) == var19) {
                        incrementValue$3 = var18;
                        var18++;
                        var9[incrementValue$3] = var20 - var4_int;
                        this.field_t.field_D[-var4_int + var20] = this.field_t.field_D[-var4_int + var20] + -2147483648;
                      }
                      if (var22 >= var5 - 1) {
                        continue;
                      }
                      if (var19 != (this.field_t.field_D[var20 + var4_int] & -2147483617)) {
                        continue;
                      }
                      incrementValue$4 = var18;
                      var18++;
                      var9[incrementValue$4] = var20 + var4_int;
                      this.field_t.field_D[var20 + var4_int] = this.field_t.field_D[var20 + var4_int] + -2147483648;
                    }
                  }
                  var19Lifetime1 = -var4_int + (var13 + var14 + 1);
                  var20Lifetime1 = 1 + var16 + var15 - var5;
                  var21Lifetime1 = 150 + ka.a((byte) 116, 51, tf.field_cb);
                  var22Lifetime1 = var21Lifetime1;
                  var23 = -8 + ka.a((byte) 50, 17, tf.field_cb);
                  var24 = (var23 << 24) + (var22Lifetime1 << 16) + ((var20Lifetime1 << 8 & 65280) + (255 & var19Lifetime1));
                  for (var25 = 0; var25 < var18; var25++) {
                    var26 = var31[var25];
                    this.field_t.field_D[var26] = this.field_t.field_D[var26] - -2147483648;
                    this.field_q[var26] = var24;
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_41_0 = var4;
          stackIn_41_1 = new StringBuilder().append("in.<init>(");
          if (param0 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, byte param5, boolean param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var17Lifetime1;
        int var17Lifetime2;
        int var18Lifetime1;
        int var18Lifetime2;
        int var18Lifetime1Lifetime1;
        int var18Lifetime2Lifetime1;
        var19 = client.field_A ? 1 : 0;
        param10 = param10 - param0;
        param8 = param8 - param12;
        param4 = param4 - param3;
        var14 = vl.a(23841, param4 * param4 + param8 * param8, this.field_t.field_K * -(param4 * param3 + param12 * param8));
        var15 = vl.a(23841, param10, this.field_t.field_C * -param0);
        var16 = var14;
        if (var15 >= 0) {
          if (this.field_t.field_C < var15) {
            var15 = this.field_t.field_C;
          }
        } else {
          var15 = 0;
        }
        if (var14 >= 0) {
          if (this.field_t.field_K < var14) {
            var14 = this.field_t.field_K;
          }
        } else {
          var14 = 0;
        }
        if (param5 != 72) {
          return;
        }
        for (var17 = 0; var17 < this.field_t.field_K; var17++) {
          for (var18 = 0; this.field_t.field_C > var18; var18++) {
            this.a(param9, param11, param1, param7, param3, param0, param12, param4, param10, param8, var17, var18, var16, param2, param6, true);
          }
        }
        for (var17Lifetime1 = 0; var14 > var17Lifetime1; var17Lifetime1++) {
          for (var18Lifetime1 = 0; var18Lifetime1 < var15; var18Lifetime1++) {
            this.a(param9, param11, param1, param7, param3, param0, param12, param4, param10, param8, var17Lifetime1, var18Lifetime1, var16, param2, param6, false);
          }
          for (var18Lifetime1Lifetime1 = this.field_t.field_C - 1; var15 <= var18Lifetime1Lifetime1; var18Lifetime1Lifetime1--) {
            this.a(param9, param11, param1, param7, param3, param0, param12, param4, param10, param8, var17Lifetime1, var18Lifetime1Lifetime1, var16, param2, param6, false);
          }
        }
        for (var17Lifetime2 = this.field_t.field_K - 1; var17Lifetime2 >= var14; var17Lifetime2--) {
          for (var18Lifetime2 = 0; var18Lifetime2 < var15; var18Lifetime2++) {
            this.a(param9, param11, param1, param7, param3, param0, param12, param4, param10, param8, var17Lifetime2, var18Lifetime2, var16, param2, param6, false);
          }
          for (var18Lifetime2Lifetime1 = this.field_t.field_C - 1; var15 <= var18Lifetime2Lifetime1; var18Lifetime2Lifetime1--) {
            this.a(param9, param11, param1, param7, param3, param0, param12, param4, param10, param8, var17Lifetime2, var18Lifetime2Lifetime1, var16, param2, param6, false);
          }
        }
        return;
    }

    public static void a(int param0) {
        field_s = null;
        field_n = null;
        field_u = null;
        if (param0 < 121) {
          return;
        }
        field_o = null;
    }

    final static void c(byte param0) {
        db.a(param0 - 76, te.field_q, ve.field_Gc, true);
        dc.field_d = true;
        if (param0 != -51) {
          ug var2 = (ug) null;
          in.a((ug) null, (byte) 121, -105);
        }
    }

    final void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        int var8 = 2000;
        int var9 = 1500;
        if (param4) {
          var9 = 600;
        }
        if (param1 != 1) {
          return;
        }
        if (var9 * this.field_t.field_K <= this.field_t.field_C * var8) {
          var8 = var9 * this.field_t.field_K / this.field_t.field_C;
        } else {
          var9 = this.field_t.field_C * var8 / this.field_t.field_K;
        }
        int var10 = !!param4 ? 5 * this.field_r : 0;
        this.a(-var9 - var10, param2, param6, -var8, var8, (byte) 72, param4, param0, 10000, param5, -var10 + var9, param3, 10000);
    }

    final static void a(ug param0, byte param1, int param2) {
        uf var3 = null;
        try {
          var3 = we.field_b;
          var3.f(param2, param1 ^ 70);
          if (param1 != -70) {
            ug var4 = (ug) null;
            in.a((ug) null, (byte) -31, 108);
          }
          var3.a(true, param0.field_o);
          var3.d(-1, param0.field_p);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "in.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_u = "All games";
        field_s = "<%0> is not a member, and cannot play with the current options.";
    }
}
