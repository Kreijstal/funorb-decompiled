/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ir {
    private int field_b;
    private int field_n;
    static v field_d;
    private int field_a;
    static String field_j;
    static kl field_f;
    private int field_e;
    private int field_c;
    static String field_l;
    private ne[] field_m;
    static ka field_h;
    static String field_k;
    private int field_g;
    private int[] field_i;

    final void a(float[] param0, boolean param1, float param2, int param3, byte param4, int param5, int param6, int param7) {
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var14 = 0;
        int var15 = 0;
        float var16 = 0.0f;
        int var17 = 0;
        jd var18 = null;
        jd var19 = null;
        var17 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          if (param4 != -4) {
            this.field_b = 94;
          }
          var18 = wg.field_b[param3];
          var19 = var18;
          var19.field_J = param7;
          var19.field_w = param6;
          this.a(var19, 120);
          var10 = 3 * bw.field_m[var18.field_N][3];
          for (var12 = this.field_b; var12 <= this.field_n; var12++) {
            var11 = this.field_e + this.field_a * var12;
            for (var13 = this.field_e; var13 <= this.field_c; var13++) {
              var14 = this.field_i[var11];
              var15 = (65535 & var14) + (var14 >> 16) * var10;
              var16 = 10.0f * param2 / (float)(1 + var15);
              if (param1) {
                var16 = var16 / (float)(1 + var15);
              }
              param0[var11] = param0[var11] + var16;
              var11++;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_14_0 = var9;
          stackIn_14_1 = new StringBuilder().append("ir.A(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, bv param6) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var7_intLifetime1;
        int var7_intLifetime2;
        int var7_intLifetime3;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          if (param5 != 0) {
            var7_int = 1 << -1 + param5;
            if (-1 + var7_int >= param2 &&
              param2 >= -var7_int) {
              param6.a(-16807, 2, 0);
              param6.a(param4 - 16808, param5, param2);
              stackIn_9_0 = param5 + 2;
              return stackIn_9_0;
            }
            if (0 >= param2) {
              param2 = param2 + var7_int;
            } else {
              param2 = param2 - var7_int;
            }
          } else {
            if (0 == param2) {
              param6.a(param4 - 16808, 2, 0);
              stackIn_5_0 = 2;
              return stackIn_5_0;
            }
          }
          var7_intLifetime1 = 1 << -1 + param0;
          if (param2 <= var7_intLifetime1 - param4 &&
            param2 >= -var7_intLifetime1) {
            param6.a(-16807, 2, 1);
            param6.a(param4 ^ -16808, param0, param2);
            stackIn_16_0 = param0 + 2;
            return stackIn_16_0;
          }
          if (param2 <= 0) {
            param2 = param2 + var7_intLifetime1;
          } else {
            param2 = param2 - var7_intLifetime1;
          }
          var7_intLifetime2 = 1 << -1 + param1;
          if (param2 <= var7_intLifetime2 - 1 &&
            param2 >= -var7_intLifetime2) {
            param6.a(-16807, 2, 2);
            param6.a(-16807, param1, param2);
            stackIn_27_0 = 2 + param1;
            return stackIn_27_0;
          }
          if (param2 <= 0) {
            param2 = param2 + var7_intLifetime2;
          } else {
            param2 = param2 - var7_intLifetime2;
          }
          var7_intLifetime3 = 1 << param3 - 1;
          if (param2 <= -1 + var7_intLifetime3 &&
            param2 >= -var7_intLifetime3) {
            param6.a(-16807, 2, 3);
            param6.a(-16807, param3, param2);
            stackIn_31_0 = 2 + param3;
            return stackIn_31_0;
          }
          if (param2 <= 0) {
            param2 = param2 + var7_intLifetime3;
          } else {
            param2 = param2 - var7_intLifetime3;
          }
          throw new IllegalArgumentException("out of range " + param2);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_38_0 = var7;
          stackIn_38_1 = new StringBuilder().append("ir.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_l = null;
        field_d = null;
        field_f = null;
        int var1 = 59 % ((param0 + 1) / 41);
        field_h = null;
        field_k = null;
        field_j = null;
    }

    final static String a(int param0, int param1) {
        if (param0 != 10602) {
          bv var3 = (bv) null;
          ir.a(12, 72, -87, -119, -83, -86, (bv) null);
        }
        return Integer.toString(param1);
    }

    final void a(float[][] param0, int param1, int param2, jd param3) {
        int var9 = 0;
        int var10 = 0;
        float[] dupTemp$0 = null;
        float[] dupTemp$1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var7Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        var15 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          if (param3.field_S) {
            return;
          }
          var5_int = param3.g(param2 ^ param2);
          var6 = param3.i(-21428) ? 1 : 0;
          this.a(param3, 124);
          var7 = 0;
          var8 = bw.field_m[param3.field_N][7];
          this.field_n = Math.min(this.field_n + var8, this.field_g - 1);
          this.field_c = Math.min(var8 + this.field_c, this.field_a - 1);
          this.field_b = Math.max(-var8 + this.field_b, 0);
          this.field_e = Math.max(-var8 + this.field_e, 0);
          for (var9 = this.field_b; this.field_n >= var9; var9++) {
            var16 = this.field_a * var9 + this.field_e;
            var7Lifetime1 = var16;
            for (var10 = this.field_e; var10 <= this.field_c; var10++) {
              var11 = this.a(this.field_i, param3, var10, var9, (byte) 5);
              if (var11 != 1000000) {
                var12 = this.field_i[var11];
                var13 = var12 >> 16;
                var14 = var13 + 1;
                var14 = var14 * var14;
                dupTemp$0 = param0[var5_int];
                dupTemp$0[var16] = dupTemp$0[var16] + (float)(param1 * param3.g((byte) 122)) / (float)var14;
              }
              if (var6 != 0) {
                var12Lifetime1 = this.field_i[var16];
                var13Lifetime1 = var12Lifetime1 >> 16;
                var14Lifetime1 = var13Lifetime1 + 1;
                var14Lifetime1 = var14Lifetime1 * var14Lifetime1;
                dupTemp$1 = param0[8];
                dupTemp$1[var16] = dupTemp$1[var16] + (float)(param1 * param3.g((byte) 122)) / (float)var14Lifetime1;
              }
              var16++;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("ir.G(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, float param2, int param3, float[][][] param4, boolean param5, int param6, boolean param7) {
        try {
          if (!param7) {
            this.field_a = -97;
          }
          this.a(param4[param0][param6], param5, param2, param0, (byte) -4, param6, param3, param1);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "ir.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void a(int[] param0, byte param1, vh param2, int[] param3) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          if (param1 != 100) {
            field_l = (String) null;
          }
          for (var4_int = 0; 6 > var4_int; var4_int++) {
            param2.b(param1 - 99, param0[var4_int]);
            param2.b(1, param3[var4_int]);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("ir.K(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final void a(jd param0, int param1) {
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_61_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var3_intLifetime1;
        int var6Lifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          for (var3_int = 0; this.field_i.length > var3_int; var3_int++) {
            this.field_i[var3_int] = 268435455;
          }
          this.field_b = param0.field_w;
          this.field_c = param0.field_J;
          this.field_n = param0.field_w;
          this.field_e = param0.field_J;
          this.field_c = Math.min(this.field_c + 1, -1 + this.field_a);
          this.field_n = Math.min(1 + this.field_n, this.field_g - 1);
          this.field_e = Math.max(-1 + this.field_e, 0);
          this.field_b = Math.max(-1 + this.field_b, 0);
          this.field_i[param0.field_J + param0.field_w * this.field_a] = 0;
          if (param1 < 118) {
            this.field_e = -1;
          }
          var3_intLifetime1 = 3 * bw.field_m[param0.field_N][3];
          var4 = 0;
          while (500 > var4) {
            var5 = 0;
            var6 = 0;
            for (var7 = this.field_b; this.field_n >= var7; var7++) {
              var12 = this.field_e + var7 * this.field_a;
              var6Lifetime1 = var12;
              for (var8 = this.field_e; this.field_c >= var8; var8++) {
                var9 = 2147483647;
                if (var8 > 0) {
                  var10 = this.field_i[-1 + var12] + pj.a(this.field_a, this.field_m, false, var12, param0.field_O, this.field_g, -1, param0, var12 - 1, false, true);
                  if (var3_intLifetime1 < (65535 & var10)) {
                    var10 = -var3_intLifetime1 + (((var10 >> 16) + 1 << 16) + (65535 & var10));
                  }
                  if (var9 > var10) {
                    var9 = var10;
                  }
                }
                if (var7 > 0) {
                  var10Lifetime1 = this.field_i[var12 - this.field_a] + pj.a(this.field_a, this.field_m, false, var12, param0.field_O, this.field_g, -1, param0, var12 - this.field_a, false, true);
                  if (var3_intLifetime1 < (var10Lifetime1 & 65535)) {
                    var10Lifetime1 = (65535 & var10Lifetime1) + ((1 + (var10Lifetime1 >> 16) << 16) - var3_intLifetime1);
                  }
                  if (var9 > var10Lifetime1) {
                    var9 = var10Lifetime1;
                  }
                }
                if (-1 + this.field_a > var8) {
                  var10Lifetime2 = this.field_i[1 + var12] + pj.a(this.field_a, this.field_m, false, var12, param0.field_O, this.field_g, -1, param0, var12 + 1, false, true);
                  if ((var10Lifetime2 & 65535) > var3_intLifetime1) {
                    var10Lifetime2 = (1 + (var10Lifetime2 >> 16) << 16) + (var10Lifetime2 & 65535) - var3_intLifetime1;
                  }
                  if (var10Lifetime2 < var9) {
                    var9 = var10Lifetime2;
                  }
                }
                if (-1 + this.field_g > var7) {
                  var10Lifetime3 = this.field_i[this.field_a + var12] + pj.a(this.field_a, this.field_m, false, var12, param0.field_O, this.field_g, -1, param0, var12 + this.field_a, false, true);
                  if ((var10Lifetime3 & 65535) > var3_intLifetime1) {
                    var10Lifetime3 = -var3_intLifetime1 + ((var10Lifetime3 >> 16) + 1 << 16) + (65535 & var10Lifetime3);
                  }
                  if (var9 > var10Lifetime3) {
                    var9 = var10Lifetime3;
                  }
                }
                if (var9 < this.field_i[var12] &&
                  6 >= var9 >> 16) {
                  this.field_i[var12] = var9;
                  if (this.field_n <= var7) {
                    this.field_n = Math.min(var7 + 1, this.field_g - 1);
                  }
                  if (this.field_c <= var8) {
                    this.field_c = Math.min(1 + var8, this.field_a - 1);
                  }
                  if (this.field_b >= var7) {
                    this.field_b = Math.max(-1 + var7, 0);
                  }
                  if (var8 <= this.field_e) {
                    this.field_e = Math.max(-1 + var8, 0);
                  }
                  if (var5 < var9) {
                    var5 = var9;
                  }
                }
                var12++;
              }
            }
            if (var5 == 0) {
              return;
            }
            var4++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_60_0 = var3;
          stackIn_60_1 = new StringBuilder().append("ir.B(");
          if (param0 == null) {
            stackIn_61_2 = "null";
          } else {
            stackIn_61_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_60_0), ((StringBuilder) (Object) stackIn_60_1).append(stackIn_61_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        int stackIn_13_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_61_0 = 0;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var7Lifetime1Lifetime1;
        int var8Lifetime1Lifetime1;
        int var9Lifetime1Lifetime1;
        int var9Lifetime1Lifetime1Lifetime1;
        var12 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 + param3 >= 0 &&
          param3 + param0 < this.field_a &&
          param5 + param4 >= 0 &&
          this.field_g > param4 + param5) {
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted0 = true;
          if (param3 != 0) {
            if (param3 == 0) {
              stackIn_28_0 = (param4 > 0) ? 1 : -1;
              var7 = stackIn_28_0;
              param4 = param4 * var7;
              var8 = 1;
              boolean decompiledNaturalLoopExit0 = false;
              while (!(decompiledNaturalLoopExit0 = (var8 >= param4))) {
                var9 = param0 + (var8 * var7 + param5) * this.field_a;
                if ((param2 ||
                  2 != this.field_m[var9].field_h) && this.field_m[var9].field_h != 3) {
                  var8++;
                  continue;
                }
                break;
              }
              if (decompiledNaturalLoopExit0) {
                decompiledFrameCompleted0 = false;
              }
              if (decompiledFrameCompleted0) {
                return false;
              }
            }
          } else {
            if (0 == param4) {
              return true;
            }
            if (param3 == 0) {
              stackIn_13_0 = (param4 > 0) ? 1 : -1;
              var7 = stackIn_13_0;
              param4 = param4 * var7;
              for (var8 = 1; var8 < param4; var8++) {
                var9 = param0 + (var8 * var7 + param5) * this.field_a;
                if (!param2 &&
                  2 == this.field_m[var9].field_h) {
                  return false;
                }
                if (this.field_m[var9].field_h == 3) {
                  return false;
                }
              }
              decompiledFrameRemainder0 = false;
            }
          }
          if ((decompiledFrameRemainder0) &&
            (decompiledFrameCompleted0)) {
            if (param1 >= -23) {
              field_f = (kl) null;
            }
            if (param4 == 0) {
              stackIn_45_0 = (param3 <= 0) ? -1 : 1;
              var7Lifetime1 = stackIn_45_0;
              param3 = param3 * var7Lifetime1;
              var8Lifetime1 = 1;
              while (true) {
                if (var8Lifetime1 >= param3) {
                  return true;
                }
                var9Lifetime1 = param5 * this.field_a + var7Lifetime1 * var8Lifetime1 + param0;
                if ((param2 ||
                  this.field_m[var9Lifetime1].field_h != 2) && this.field_m[var9Lifetime1].field_h != 3) {
                  var8Lifetime1++;
                  continue;
                }
                break;
              }
              return false;
            }
            stackIn_58_0 = (0 < param3) ? 1 : -1;
            var7Lifetime1Lifetime1 = stackIn_58_0;
            stackIn_61_0 = (0 >= param4) ? -1 : 1;
            boolean decompiledFrameCompleted1 = true;
            var8Lifetime1Lifetime1 = stackIn_61_0;
            param3 = param3 * var7Lifetime1Lifetime1;
            param4 = param4 * var8Lifetime1Lifetime1;
            if (param3 > param4) {
              var9Lifetime1Lifetime1 = 1;
              while (true) {
                if (var9Lifetime1Lifetime1 >= param3) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
                var10 = var9Lifetime1Lifetime1 * param4 / param3;
                var11 = (var10 * var8Lifetime1Lifetime1 + param5) * this.field_a + var9Lifetime1Lifetime1 * var7Lifetime1Lifetime1 + param0;
                if ((param2 ||
                  this.field_m[var11].field_h != 2) && this.field_m[var11].field_h != 3) {
                  var9Lifetime1Lifetime1++;
                  continue;
                }
                break;
              }
              if (decompiledFrameCompleted1) {
                return false;
              }
            }
            if (decompiledFrameCompleted1) {
              var9Lifetime1Lifetime1Lifetime1 = 1;
              while (param4 > var9Lifetime1Lifetime1Lifetime1) {
                var10Lifetime1 = param3 * var9Lifetime1Lifetime1Lifetime1 / param4;
                var11Lifetime1 = (var9Lifetime1Lifetime1Lifetime1 * var8Lifetime1Lifetime1 + param5) * this.field_a + var7Lifetime1Lifetime1 * var10Lifetime1 + param0;
                if ((param2 ||
                  2 != this.field_m[var11Lifetime1].field_h) && this.field_m[var11Lifetime1].field_h != 3) {
                  var9Lifetime1Lifetime1Lifetime1++;
                  continue;
                }
                return false;
              }
            }
            return true;
          }
          return true;
        }
        return false;
    }

    private final int a(int[] param0, jd param1, int param2, int param3, byte param4) {
        int var11 = 0;
        int var12 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var13 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        var17 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          var6_int = 1000000;
          var7 = 1000000;
          if (param4 != 5) {
            stackIn_3_0 = 115;
            return stackIn_3_0;
          }
          stackIn_7_0 = (bw.field_m[param1.field_N][0] != 4) ? 0 : 1;
          var8 = stackIn_7_0;
          var9 = bw.field_m[param1.field_N][6];
          var10 = bw.field_m[param1.field_N][7];
          for (var11 = -var10; var11 <= var10; var11++) {
            for (var12 = -var10; var10 >= var12; var12++) {
              var13 = Math.abs(var11) + Math.abs(var12);
              if (var9 <= var13 &&
                var13 <= var10 &&
                this.a(param2, -117, var8 != 0, var12, var11, param3)) {
                var15 = (param3 + var11) * this.field_a + param2 + var12;
                var16 = param0[var15];
                if (var7 > var16) {
                  var6_int = var15;
                  var7 = var16;
                }
              }
            }
          }
          stackIn_27_0 = var6_int;
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_30_0 = var6;
          stackIn_30_1 = new StringBuilder().append("ir.C(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0, int param1, float param2, int param3, int param4, float[][][] param5, int param6) {
        try {
          if (param0 >= -18) {
            jd var9 = (jd) null;
            this.a((jd) null, 43);
          }
          this.a(param3, param6, param2, param1, param5, false, param4, true);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "ir.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ')');
        }
    }

    ir(ne[] param0, int param1, int param2) {
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        int var5Lifetime1;
        try {
          this.field_a = param1;
          this.field_g = param2;
          this.field_m = param0;
          this.field_i = new int[this.field_m.length];
          if (null == wg.field_b) {
            wg.field_b = new jd[8];
            var12 = new int[wg.field_b.length];
            var11 = var12;
            var9 = var11;
            var4 = var9;
            for (var5 = 0; 75 > var5; var5++) {
              var6 = bw.field_m[var5][0];
              var7 = bw.field_m[var5][3];
              if (var12[var6] == 0 ||
                !(bw.field_m[var12[var6]][3] >= var7)) {
                var12[var6] = var5;
              }
            }
            var10 = 0;
            var5Lifetime1 = var10;
            while (wg.field_b.length > var10) {
              wg.field_b[var10] = new jd(0, 0, var12[var10]);
              var10++;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_14_0 = var4_ref;
          stackIn_14_1 = new StringBuilder().append("ir.<init>(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        String[][] dupTemp$0 = null;
        int[][] dupTemp$1 = null;
        nt stackIn_37_0 = null;
        boolean stackIn_38_1 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        nt var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        bv var14 = null;
        int var6_intLifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        var12 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          var14 = mg.field_e;
          var2 = var14.k(0);
          var3 = (nt) (s.field_a.e((byte) 120));
          while (var3 != null) {
            if (var2 != var3.field_o) {
              var3 = (nt) (s.field_a.a((byte) 123));
              continue;
            }
            break;
          }
          if (var3 == null) {
            dj.a((byte) -127);
            return;
          }
          var4 = var14.k(0);
          if (var4 != 0) {
            var5 = var3.field_q;
            gm.field_a[0] = mv.field_d;
            for (var6_int = 1; var6_int < var4; var6_int++) {
              gm.field_a[var6_int] = var14.g(1);
            }
            qu.a(2, var5, var4);
            for (var6_intLifetime1 = 0; var6_intLifetime1 < var4; var6_intLifetime1++) {
              jp.a(var14, -83);
              if (0 == var6_intLifetime1) {
                var3.field_r = rt.field_D;
                var3.field_s = ov.field_e;
                var3.field_k = la.field_d;
                var3.field_m = nk.field_m;
                ut.a(rt.field_D, nk.field_m, ov.field_e, la.field_d, (byte) 127, var6_intLifetime1);
              } else {
                ut.a(rt.field_D, nk.field_m, ov.field_e, la.field_d, (byte) 125, var6_intLifetime1);
              }
            }
            jm.a(var5, 0);
            dupTemp$0 = new String[2][var5];
            var3.field_t = dupTemp$0;
            var6 = dupTemp$0;
            dupTemp$1 = new int[2][var5 * 4];
            var3.field_n = dupTemp$1;
            var7 = dupTemp$1;
            var8 = kt.field_p;
            var9 = 0;
            var10 = 0;
            while (var8 > var9) {
              var11 = vt.field_m[var9];
              var6[0][var10] = gm.field_a[var11];
              var7[0][var10 * 4] = no.field_U[var11];
              var7[0][1 + 4 * var10] = wp.field_w[var11];
              var7[0][var10 * 4 + 2] = ci.field_c[var11];
              var7[0][3 + var10 * 4] = pe.field_s[var11];
              if (gt.a(gm.field_a[var11], (byte) 121) &&
                0 == ci.field_c[var11] + wp.field_w[var11] + pe.field_s[var11]) {
                var6[0][var10] = null;
                var10--;
              }
              var9++;
              var10++;
            }
            var9Lifetime1 = 0;
            var13 = 0;
            var10Lifetime1 = var13;
            while (var8 > var9Lifetime1) {
              var11Lifetime1 = vt.field_m[var5 + var9Lifetime1];
              var6[1][var13] = gm.field_a[var11Lifetime1];
              var7[1][4 * var13] = no.field_U[var11Lifetime1];
              var7[1][var13 * 4 + 1] = wp.field_w[var11Lifetime1];
              var7[1][var13 * 4 + 2] = ci.field_c[var11Lifetime1];
              var7[1][var13 * 4 + 3] = pe.field_s[var11Lifetime1];
              if (gt.a(gm.field_a[var11Lifetime1], (byte) 109) &&
                pe.field_s[var11Lifetime1] + (wp.field_w[var11Lifetime1] + ci.field_c[var11Lifetime1]) == 0) {
                var6[1][var13] = null;
                var13--;
              }
              var9Lifetime1++;
              var13++;
            }
          }
          stackIn_37_0 = var3;
          stackIn_38_1 = (param0);
          stackIn_37_0.field_l = stackIn_38_1;
          var3.d(50);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1), "ir.J(" + param0 + ')');
        }
    }

    static {
        field_l = "Prayers to increase your favour.";
        field_j = "RuneScape clan";
        field_k = "Screen Size";
    }
}
