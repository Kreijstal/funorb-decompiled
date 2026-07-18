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
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        float var16 = 0.0f;
        int var17 = 0;
        jd var18 = null;
        jd var19 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var17 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 == -4) {
                break L1;
              } else {
                ((ir) this).field_b = 94;
                break L1;
              }
            }
            var18 = wg.field_b[param3];
            var19 = var18;
            var19.field_J = param7;
            var19.field_w = param6;
            this.a(var19, 120);
            var10 = 3 * bw.field_m[var18.field_N][3];
            var12 = ((ir) this).field_b;
            L2: while (true) {
              if (var12 > ((ir) this).field_n) {
                break L0;
              } else {
                var11 = ((ir) this).field_e - -(((ir) this).field_a * var12);
                var13 = ((ir) this).field_e;
                L3: while (true) {
                  if (var13 > ((ir) this).field_c) {
                    var12++;
                    continue L2;
                  } else {
                    L4: {
                      var14 = ((ir) this).field_i[var11];
                      var15 = (65535 & var14) + (var14 >> 16) * var10;
                      var16 = 10.0f * param2 / (float)(1 + var15);
                      if (!param1) {
                        break L4;
                      } else {
                        var16 = var16 / (float)(1 + var15);
                        break L4;
                      }
                    }
                    param0[var11] = param0[var11] + var16;
                    var11++;
                    var13++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var9 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var9;
            stackOut_12_1 = new StringBuilder().append("ir.A(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, bv param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int stackIn_9_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_30_0 = 0;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var7_int = 8;
            if (-1 + var7_int < param2) {
              break L0;
            } else {
              if (param2 < -var7_int) {
                break L0;
              } else {
                param6.a(-16807, 2, 0);
                param6.a(-16807, 4, param2);
                stackOut_8_0 = 6;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              }
            }
          }
          L1: {
            if (0 >= param2) {
              param2 = param2 + var7_int;
              break L1;
            } else {
              param2 = param2 - var7_int;
              break L1;
            }
          }
          L2: {
            var7_int = 8192;
            if (param2 > var7_int - 1) {
              break L2;
            } else {
              if (param2 < -var7_int) {
                break L2;
              } else {
                param6.a(-16807, 2, 1);
                param6.a(-16807, 14, param2);
                stackOut_15_0 = 16;
                stackIn_16_0 = stackOut_15_0;
                return stackIn_16_0;
              }
            }
          }
          L3: {
            if (param2 <= 0) {
              param2 = param2 + var7_int;
              break L3;
            } else {
              param2 = param2 - var7_int;
              break L3;
            }
          }
          L4: {
            var7_int = 524288;
            if (param2 > var7_int - 1) {
              break L4;
            } else {
              if (param2 >= -var7_int) {
                param6.a(-16807, 2, 2);
                param6.a(-16807, 20, param2);
                stackOut_26_0 = 22;
                stackIn_27_0 = stackOut_26_0;
                return stackIn_27_0;
              } else {
                break L4;
              }
            }
          }
          L5: {
            if (param2 <= 0) {
              param2 = param2 + var7_int;
              break L5;
            } else {
              param2 = param2 - var7_int;
              break L5;
            }
          }
          L6: {
            var7_int = 536870912;
            if (param2 > -1 + var7_int) {
              break L6;
            } else {
              if (param2 < -var7_int) {
                break L6;
              } else {
                param6.a(-16807, 2, 3);
                param6.a(-16807, 30, param2);
                stackOut_30_0 = 32;
                stackIn_31_0 = stackOut_30_0;
                return stackIn_31_0;
              }
            }
          }
          L7: {
            if (param2 <= 0) {
              param2 = param2 + var7_int;
              break L7;
            } else {
              param2 = param2 - var7_int;
              break L7;
            }
          }
          throw new IllegalArgumentException("out of range " + param2);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var7;
            stackOut_36_1 = new StringBuilder().append("ir.L(").append(14).append(',').append(20).append(',').append(param2).append(',').append(30).append(',').append(1).append(',').append(4).append(',');
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param6 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L8;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L8;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + ')');
        }
    }

    public static void a(int param0) {
        field_l = null;
        field_d = null;
        field_f = null;
        int var1 = 0;
        field_h = null;
        field_k = null;
        field_j = null;
    }

    final static String a(int param0, int param1) {
        return Integer.toString(param1);
    }

    final void a(float[][] param0, int param1, int param2, jd param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var15 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param3.field_S) {
              return;
            } else {
              var5_int = param3.g(param2 ^ param2);
              var6 = param3.i(-21428) ? 1 : 0;
              this.a(param3, 124);
              var7 = 0;
              var8 = bw.field_m[param3.field_N][7];
              ((ir) this).field_n = Math.min(((ir) this).field_n + var8, ((ir) this).field_g - 1);
              ((ir) this).field_c = Math.min(var8 + ((ir) this).field_c, ((ir) this).field_a + -1);
              ((ir) this).field_b = Math.max(-var8 + ((ir) this).field_b, 0);
              ((ir) this).field_e = Math.max(-var8 + ((ir) this).field_e, 0);
              var9 = ((ir) this).field_b;
              L1: while (true) {
                if (((ir) this).field_n < var9) {
                  break L0;
                } else {
                  var16 = ((ir) this).field_a * var9 + ((ir) this).field_e;
                  var7 = var16;
                  var10 = ((ir) this).field_e;
                  L2: while (true) {
                    if (var10 > ((ir) this).field_c) {
                      var9++;
                      continue L1;
                    } else {
                      L3: {
                        var11 = this.a(((ir) this).field_i, param3, var10, var9, (byte) 5);
                        if (var11 == 1000000) {
                          break L3;
                        } else {
                          var12 = ((ir) this).field_i[var11];
                          var13 = var12 >> 16;
                          var14 = var13 + 1;
                          var14 = var14 * var14;
                          param0[var5_int][var16] = param0[var5_int][var16] + (float)(param1 * param3.g((byte) 122)) / (float)var14;
                          break L3;
                        }
                      }
                      L4: {
                        if (var6 != 0) {
                          var12 = ((ir) this).field_i[var16];
                          var13 = var12 >> 16;
                          var14 = var13 + 1;
                          var14 = var14 * var14;
                          param0[8][var16] = param0[8][var16] + (float)(param1 * param3.g((byte) 122)) / (float)var14;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var16++;
                      var10++;
                      continue L2;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var5;
            stackOut_16_1 = new StringBuilder().append("ir.G(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          L6: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
    }

    private final void a(int param0, int param1, float param2, int param3, float[][][] param4, boolean param5, int param6, boolean param7) {
        try {
            ((ir) this).a(param4[param0][param6], false, param2, param0, (byte) -4, param6, param3, param1);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ir.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + false + ',' + param6 + ',' + true + ')');
        }
    }

    final static void a(int[] param0, byte param1, vh param2, int[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var4_int = 0;
            L1: while (true) {
              if (6 <= var4_int) {
                break L0;
              } else {
                param2.b(1, param0[var4_int]);
                param2.b(1, param3[var4_int]);
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("ir.K(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(100).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
    }

    private final void a(jd param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (((ir) this).field_i.length <= var3_int) {
                L2: {
                  ((ir) this).field_b = param0.field_w;
                  ((ir) this).field_c = param0.field_J;
                  ((ir) this).field_n = param0.field_w;
                  ((ir) this).field_e = param0.field_J;
                  ((ir) this).field_c = Math.min(((ir) this).field_c - -1, -1 + ((ir) this).field_a);
                  ((ir) this).field_n = Math.min(1 + ((ir) this).field_n, ((ir) this).field_g - 1);
                  ((ir) this).field_e = Math.max(-1 + ((ir) this).field_e, 0);
                  ((ir) this).field_b = Math.max(-1 + ((ir) this).field_b, 0);
                  ((ir) this).field_i[param0.field_J + param0.field_w * ((ir) this).field_a] = 0;
                  if (param1 >= 118) {
                    break L2;
                  } else {
                    ((ir) this).field_e = -1;
                    break L2;
                  }
                }
                var3_int = 3 * bw.field_m[param0.field_N][3];
                var4 = 0;
                L3: while (true) {
                  L4: {
                    if (500 <= var4) {
                      break L4;
                    } else {
                      var5 = 0;
                      var6 = 0;
                      var7 = ((ir) this).field_b;
                      L5: while (true) {
                        if (((ir) this).field_n < var7) {
                          if (var5 == 0) {
                            break L4;
                          } else {
                            var4++;
                            continue L3;
                          }
                        } else {
                          var12 = ((ir) this).field_e - -(var7 * ((ir) this).field_a);
                          var6 = var12;
                          var8 = ((ir) this).field_e;
                          L6: while (true) {
                            if (((ir) this).field_c < var8) {
                              var7++;
                              continue L5;
                            } else {
                              L7: {
                                var9 = 2147483647;
                                if (var8 > 0) {
                                  L8: {
                                    var10 = ((ir) this).field_i[-1 + var12] - -pj.a(((ir) this).field_a, ((ir) this).field_m, false, var12, param0.field_O, ((ir) this).field_g, -1, param0, var12 - 1, false, true);
                                    if (var3_int >= (65535 & var10)) {
                                      break L8;
                                    } else {
                                      var10 = -var3_int + (((var10 >> 16) - -1 << 16) + (65535 & var10));
                                      break L8;
                                    }
                                  }
                                  if (var9 <= var10) {
                                    break L7;
                                  } else {
                                    var9 = var10;
                                    break L7;
                                  }
                                } else {
                                  break L7;
                                }
                              }
                              L9: {
                                if (var7 <= 0) {
                                  break L9;
                                } else {
                                  L10: {
                                    var10 = ((ir) this).field_i[var12 - ((ir) this).field_a] - -pj.a(((ir) this).field_a, ((ir) this).field_m, false, var12, param0.field_O, ((ir) this).field_g, -1, param0, var12 - ((ir) this).field_a, false, true);
                                    if (var3_int < (var10 & 65535)) {
                                      var10 = (65535 & var10) + ((1 + (var10 >> 16) << 16) + -var3_int);
                                      break L10;
                                    } else {
                                      break L10;
                                    }
                                  }
                                  if (var9 <= var10) {
                                    break L9;
                                  } else {
                                    var9 = var10;
                                    break L9;
                                  }
                                }
                              }
                              L11: {
                                if (-1 + ((ir) this).field_a <= var8) {
                                  break L11;
                                } else {
                                  L12: {
                                    var10 = ((ir) this).field_i[1 + var12] - -pj.a(((ir) this).field_a, ((ir) this).field_m, false, var12, param0.field_O, ((ir) this).field_g, -1, param0, var12 - -1, false, true);
                                    if ((var10 & 65535) > var3_int) {
                                      var10 = (1 + (var10 >> 16) << 16) - -(var10 & 65535) + -var3_int;
                                      break L12;
                                    } else {
                                      break L12;
                                    }
                                  }
                                  if (var10 >= var9) {
                                    break L11;
                                  } else {
                                    var9 = var10;
                                    break L11;
                                  }
                                }
                              }
                              L13: {
                                if (-1 + ((ir) this).field_g <= var7) {
                                  break L13;
                                } else {
                                  L14: {
                                    var10 = ((ir) this).field_i[((ir) this).field_a + var12] - -pj.a(((ir) this).field_a, ((ir) this).field_m, false, var12, param0.field_O, ((ir) this).field_g, -1, param0, var12 - -((ir) this).field_a, false, true);
                                    if ((var10 & 65535) <= var3_int) {
                                      break L14;
                                    } else {
                                      var10 = -var3_int + ((var10 >> 16) - -1 << 16) + (65535 & var10);
                                      break L14;
                                    }
                                  }
                                  if (var9 > var10) {
                                    var9 = var10;
                                    break L13;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              L15: {
                                if (var9 >= ((ir) this).field_i[var12]) {
                                  break L15;
                                } else {
                                  break L15;
                                }
                              }
                              var12++;
                              var8++;
                              continue L6;
                            }
                          }
                        }
                      }
                    }
                  }
                  break L0;
                }
              } else {
                ((ir) this).field_i[var3_int] = 268435455;
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var3 = decompiledCaughtException;
            stackOut_60_0 = (RuntimeException) var3;
            stackOut_60_1 = new StringBuilder().append("ir.B(");
            stackIn_62_0 = stackOut_60_0;
            stackIn_62_1 = stackOut_60_1;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            if (param0 == null) {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L16;
            } else {
              stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
              stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
              stackOut_61_2 = "{...}";
              stackIn_63_0 = stackOut_61_0;
              stackIn_63_1 = stackOut_61_1;
              stackIn_63_2 = stackOut_61_2;
              break L16;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_13_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_61_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_59_0 = 0;
        L0: {
          var12 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 - -param3 < 0) {
            break L0;
          } else {
            if (~(param3 + param0) <= ~((ir) this).field_a) {
              break L0;
            } else {
              if (param5 + param4 < 0) {
                break L0;
              } else {
                if (~((ir) this).field_g >= ~(param4 + param5)) {
                  break L0;
                } else {
                  L1: {
                    L2: {
                      if (param3 != 0) {
                        if (param3 == 0) {
                          L3: {
                            if (param4 > 0) {
                              stackOut_27_0 = 1;
                              stackIn_28_0 = stackOut_27_0;
                              break L3;
                            } else {
                              stackOut_26_0 = -1;
                              stackIn_28_0 = stackOut_26_0;
                              break L3;
                            }
                          }
                          var7 = stackIn_28_0;
                          param4 = param4 * var7;
                          var8 = 1;
                          L4: while (true) {
                            if (~var8 <= ~param4) {
                              break L1;
                            } else {
                              L5: {
                                L6: {
                                  var9 = param0 + (var8 * var7 + param5) * ((ir) this).field_a;
                                  if (param2) {
                                    break L6;
                                  } else {
                                    if (2 == ((ir) this).field_m[var9].field_h) {
                                      break L5;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                                if (((ir) this).field_m[var9].field_h != 3) {
                                  var8++;
                                  continue L4;
                                } else {
                                  break L5;
                                }
                              }
                              return false;
                            }
                          }
                        } else {
                          break L2;
                        }
                      } else {
                        if (0 == param4) {
                          return true;
                        } else {
                          if (param3 == 0) {
                            L7: {
                              if (param4 > 0) {
                                stackOut_12_0 = 1;
                                stackIn_13_0 = stackOut_12_0;
                                break L7;
                              } else {
                                stackOut_11_0 = -1;
                                stackIn_13_0 = stackOut_11_0;
                                break L7;
                              }
                            }
                            var7 = stackIn_13_0;
                            param4 = param4 * var7;
                            var8 = 1;
                            L8: while (true) {
                              if (~var8 <= ~param4) {
                                break L1;
                              } else {
                                L9: {
                                  var9 = param0 + (var8 * var7 + param5) * ((ir) this).field_a;
                                  if (param2) {
                                    break L9;
                                  } else {
                                    if (2 == ((ir) this).field_m[var9].field_h) {
                                      return false;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                if (((ir) this).field_m[var9].field_h != 3) {
                                  var8++;
                                  continue L8;
                                } else {
                                  return false;
                                }
                              }
                            }
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                    L10: {
                      if (param1 < -23) {
                        break L10;
                      } else {
                        field_f = null;
                        break L10;
                      }
                    }
                    if (param4 == 0) {
                      L11: {
                        if (param3 <= 0) {
                          stackOut_44_0 = -1;
                          stackIn_45_0 = stackOut_44_0;
                          break L11;
                        } else {
                          stackOut_43_0 = 1;
                          stackIn_45_0 = stackOut_43_0;
                          break L11;
                        }
                      }
                      var7 = stackIn_45_0;
                      param3 = param3 * var7;
                      var8 = 1;
                      L12: while (true) {
                        if (~var8 <= ~param3) {
                          return true;
                        } else {
                          L13: {
                            L14: {
                              var9 = param5 * ((ir) this).field_a + var7 * var8 + param0;
                              if (param2) {
                                break L14;
                              } else {
                                if (((ir) this).field_m[var9].field_h == 2) {
                                  break L13;
                                } else {
                                  break L14;
                                }
                              }
                            }
                            if (((ir) this).field_m[var9].field_h == 3) {
                              break L13;
                            } else {
                              var8++;
                              continue L12;
                            }
                          }
                          return false;
                        }
                      }
                    } else {
                      L15: {
                        if (0 < param3) {
                          stackOut_57_0 = 1;
                          stackIn_58_0 = stackOut_57_0;
                          break L15;
                        } else {
                          stackOut_56_0 = -1;
                          stackIn_58_0 = stackOut_56_0;
                          break L15;
                        }
                      }
                      L16: {
                        var7 = stackIn_58_0;
                        if (0 >= param4) {
                          stackOut_60_0 = -1;
                          stackIn_61_0 = stackOut_60_0;
                          break L16;
                        } else {
                          stackOut_59_0 = 1;
                          stackIn_61_0 = stackOut_59_0;
                          break L16;
                        }
                      }
                      L17: {
                        var8 = stackIn_61_0;
                        param3 = param3 * var7;
                        param4 = param4 * var8;
                        if (~param3 < ~param4) {
                          var9 = 1;
                          L18: while (true) {
                            if (var9 >= param3) {
                              break L17;
                            } else {
                              L19: {
                                L20: {
                                  var10 = var9 * param4 / param3;
                                  var11 = (var10 * var8 + param5) * ((ir) this).field_a + var9 * var7 + param0;
                                  if (param2) {
                                    break L20;
                                  } else {
                                    if (((ir) this).field_m[var11].field_h == 2) {
                                      break L19;
                                    } else {
                                      break L20;
                                    }
                                  }
                                }
                                if (((ir) this).field_m[var11].field_h == 3) {
                                  break L19;
                                } else {
                                  var9++;
                                  continue L18;
                                }
                              }
                              return false;
                            }
                          }
                        } else {
                          var9 = 1;
                          L21: while (true) {
                            if (~param4 >= ~var9) {
                              break L17;
                            } else {
                              L22: {
                                L23: {
                                  var10 = param3 * var9 / param4;
                                  var11 = (var9 * var8 + param5) * ((ir) this).field_a + var7 * var10 + param0;
                                  if (param2) {
                                    break L23;
                                  } else {
                                    if (2 == ((ir) this).field_m[var11].field_h) {
                                      break L22;
                                    } else {
                                      break L23;
                                    }
                                  }
                                }
                                if (((ir) this).field_m[var11].field_h != 3) {
                                  var9++;
                                  continue L21;
                                } else {
                                  break L22;
                                }
                              }
                              return false;
                            }
                          }
                        }
                      }
                      return true;
                    }
                  }
                  return true;
                }
              }
            }
          }
        }
        return false;
    }

    private final int a(int[] param0, jd param1, int param2, int param3, byte param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var17 = 0;
        int stackIn_6_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_28_0 = 0;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var17 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var6_int = 1000000;
            var7 = 1000000;
            L1: {
              if (bw.field_m[param1.field_N][0] != 4) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
            var8 = stackIn_6_0;
            var9 = bw.field_m[param1.field_N][6];
            var10 = bw.field_m[param1.field_N][7];
            var11 = -var10;
            L2: while (true) {
              if (var11 > var10) {
                stackOut_28_0 = var6_int;
                stackIn_29_0 = stackOut_28_0;
                break L0;
              } else {
                var12 = -var10;
                L3: while (true) {
                  if (var10 < var12) {
                    var11++;
                    continue L2;
                  } else {
                    L4: {
                      var13 = Math.abs(var11) + Math.abs(var12);
                      if (var9 > var13) {
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var12++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var6;
            stackOut_30_1 = new StringBuilder().append("ir.C(");
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L5;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L5;
            }
          }
          L6: {
            stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
            stackOut_33_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param1 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L6;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L6;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ',' + param2 + ',' + param3 + ',' + 5 + ')');
        }
        return stackIn_29_0;
    }

    final void a(int param0, int param1, float param2, int param3, int param4, float[][][] param5, int param6) {
        try {
            if (param0 >= -18) {
                Object var9 = null;
                this.a((jd) null, 43);
            }
            this.a(param3, param6, param2, param1, param5, false, param4, true);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ir.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ')');
        }
    }

    ir(ne[] param0, int param1, int param2) {
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              ((ir) this).field_a = param1;
              ((ir) this).field_g = param2;
              ((ir) this).field_m = param0;
              ((ir) this).field_i = new int[((ir) this).field_m.length];
              if (null != wg.field_b) {
                break L1;
              } else {
                wg.field_b = new jd[8];
                var14 = new int[wg.field_b.length];
                var13 = var14;
                var12 = var13;
                var11 = var12;
                var9 = var11;
                var4 = var9;
                var5 = 0;
                L2: while (true) {
                  if (75 <= var5) {
                    var10 = 0;
                    var5 = var10;
                    L3: while (true) {
                      if (wg.field_b.length <= var10) {
                        break L1;
                      } else {
                        wg.field_b[var10] = new jd(0, 0, var14[var10]);
                        var10++;
                        continue L3;
                      }
                    }
                  } else {
                    L4: {
                      L5: {
                        var6 = bw.field_m[var5][0];
                        var7 = bw.field_m[var5][3];
                        if (var14[var6] == 0) {
                          break L5;
                        } else {
                          if (bw.field_m[var14[var6]][3] >= var7) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var14[var6] = var5;
                      break L4;
                    }
                    var5++;
                    continue L2;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4_ref;
            stackOut_12_1 = new StringBuilder().append("ir.<init>(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L6;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L6;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(boolean param0) {
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
        RuntimeException decompiledCaughtException = null;
        var12 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var14 = mg.field_e;
            var2 = var14.k(0);
            var3 = (nt) (Object) s.field_a.e((byte) 120);
            L1: while (true) {
              L2: {
                if (var3 == null) {
                  break L2;
                } else {
                  if (var2 != var3.field_o) {
                    var3 = (nt) (Object) s.field_a.a((byte) 123);
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (var3 == null) {
                dj.a((byte) -127);
                return;
              } else {
                L3: {
                  var4 = var14.k(0);
                  if (var4 == 0) {
                    break L3;
                  } else {
                    var5 = var3.field_q;
                    gm.field_a[0] = mv.field_d;
                    var6_int = 1;
                    L4: while (true) {
                      if (var6_int >= var4) {
                        qu.a(2, var5, var4);
                        var6_int = 0;
                        L5: while (true) {
                          if (var6_int >= var4) {
                            jm.a(var5, 0);
                            String[][] dupTemp$2 = new String[2][var5];
                            var3.field_t = dupTemp$2;
                            var6 = dupTemp$2;
                            int[][] dupTemp$3 = new int[2][var5 * 4];
                            var3.field_n = dupTemp$3;
                            var7 = dupTemp$3;
                            var8 = kt.field_p;
                            var9 = 0;
                            var10 = 0;
                            L6: while (true) {
                              if (var8 <= var9) {
                                var9 = 0;
                                var13 = 0;
                                var10 = var13;
                                L7: while (true) {
                                  if (var8 <= var9) {
                                    break L3;
                                  } else {
                                    L8: {
                                      var11 = vt.field_m[var5 - -var9];
                                      var6[1][var13] = gm.field_a[var11];
                                      var7[1][4 * var13] = no.field_U[var11];
                                      var7[1][var13 * 4 - -1] = wp.field_w[var11];
                                      var7[1][var13 * 4 + 2] = ci.field_c[var11];
                                      var7[1][var13 * 4 - -3] = pe.field_s[var11];
                                      if (!gt.a(gm.field_a[var11], (byte) 109)) {
                                        break L8;
                                      } else {
                                        if (pe.field_s[var11] + (wp.field_w[var11] - -ci.field_c[var11]) != 0) {
                                          break L8;
                                        } else {
                                          var6[1][var13] = null;
                                          var13--;
                                          break L8;
                                        }
                                      }
                                    }
                                    var9++;
                                    var13++;
                                    continue L7;
                                  }
                                }
                              } else {
                                L9: {
                                  var11 = vt.field_m[var9];
                                  var6[0][var10] = gm.field_a[var11];
                                  var7[0][var10 * 4] = no.field_U[var11];
                                  var7[0][1 + 4 * var10] = wp.field_w[var11];
                                  var7[0][var10 * 4 + 2] = ci.field_c[var11];
                                  var7[0][3 + var10 * 4] = pe.field_s[var11];
                                  if (!gt.a(gm.field_a[var11], (byte) 121)) {
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                                var9++;
                                var10++;
                                continue L6;
                              }
                            }
                          } else {
                            L10: {
                              jp.a((vh) (Object) var14, -83);
                              if (0 == var6_int) {
                                var3.field_r = rt.field_D;
                                var3.field_s = ov.field_e;
                                var3.field_k = la.field_d;
                                var3.field_m = nk.field_m;
                                ut.a(rt.field_D, nk.field_m, ov.field_e, la.field_d, (byte) 127, var6_int);
                                break L10;
                              } else {
                                ut.a(rt.field_D, nk.field_m, ov.field_e, la.field_d, (byte) 125, var6_int);
                                break L10;
                              }
                            }
                            var6_int++;
                            continue L5;
                          }
                        }
                      } else {
                        gm.field_a[var6_int] = var14.g(1);
                        var6_int++;
                        continue L4;
                      }
                    }
                  }
                }
                var3.field_l = true;
                var3.d(50);
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "ir.J(" + true + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Prayers to increase your favour.";
        field_j = "RuneScape clan";
        field_k = "Screen Size";
    }
}
