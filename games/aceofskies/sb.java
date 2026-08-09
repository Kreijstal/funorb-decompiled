/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb {
    private d field_d;
    private gq field_b;
    static kp field_c;
    private bf field_a;

    final qi a(byte param0, int param1) {
        int stackIn_8_0 = 0;
        bf stackIn_14_0;
        int[] stackIn_14_1;
        int stackIn_14_2;
        int stackIn_14_3;
        bf stackIn_15_0 = null;
        int[] stackIn_15_1 = null;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        int stackIn_15_4 = 0;
        bf stackIn_20_0;
        int[] stackIn_20_1;
        int stackIn_20_2;
        int stackIn_20_3;
        bf stackIn_21_0 = null;
        int[] stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        int stackIn_21_3 = 0;
        int stackIn_21_4 = 0;
        bf stackIn_26_0;
        int[] stackIn_26_1;
        int stackIn_26_2;
        int stackIn_26_3;
        bf stackIn_27_0 = null;
        int[] stackIn_27_1 = null;
        int stackIn_27_2 = 0;
        int stackIn_27_3 = 0;
        int stackIn_27_4 = 0;
        bf stackIn_37_0;
        int[] stackIn_37_1;
        int stackIn_37_2;
        int stackIn_37_3;
        bf stackIn_38_0 = null;
        int[] stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        int stackIn_38_4 = 0;
        bf stackIn_44_0;
        int[] stackIn_44_1;
        int stackIn_44_2;
        int stackIn_44_3;
        bf stackIn_45_0 = null;
        int[] stackIn_45_1 = null;
        int stackIn_45_2 = 0;
        int stackIn_45_3 = 0;
        int stackIn_45_4 = 0;
        bf stackIn_51_0;
        int[] stackIn_51_1;
        int stackIn_51_2;
        int stackIn_51_3;
        bf stackIn_52_0 = null;
        int[] stackIn_52_1 = null;
        int stackIn_52_2 = 0;
        int stackIn_52_3 = 0;
        int stackIn_52_4 = 0;
        bf stackIn_58_0 = null;
        bf stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        Object var3;
        qi var4;
        uh var5;
        int var6;
        float[] var7;
        int[] var7_array;
        int var8;
        byte[] var9;
        float[] var10;
        float[] var11;
        float[] var12;
        qi var13;
        qi var14;
        qi var19;
        qi var20;
        qi var21;
        qi var22;
        var8 = AceOfSkies.field_G ? 1 : 0;
        var3 = this.field_b.a((long)param1, -120);
        if (var3 != null) {
          return (qi) (var3);
        } else {
          if (this.field_d.a(param1, -3804)) {
            L0: {
              var5 = this.field_d.a(false, param1);
              if (!var5.field_o) {
                stackIn_8_0 = this.field_a.field_kc;
                break L0;
              } else {
                stackIn_8_0 = 64;
                break L0;
              }
            }
            var6 = stackIn_8_0;
            if (var5.field_i) {
              if (this.field_a.d()) {
                L1: {
                  var12 = this.field_d.a(var6, false, param1, 0.699999988079071f, var6, true);
                  var11 = var12;
                  var10 = var11;
                  var7 = var10;
                  stackIn_58_0 = this.field_a;

                  if (-1 == (var5.field_k ^ -1)) {
                    stackIn_59_0 = (bf) ((Object) stackIn_58_0);
                    stackIn_59_1 = 0;
                    break L1;
                  } else {
                    stackIn_59_0 = (bf) ((Object) stackIn_58_0);
                    stackIn_59_1 = 1;
                    break L1;
                  }
                }
                var22 = ((bf) (Object) stackIn_59_0).a(stackIn_59_1 != 0, var6, var12, lc.field_g, (byte) 40, var6);
                var22.a(var5.field_l, var5.field_d, (byte) -127);
                this.field_b.a((long)param1, var22, -123);
                if (param0 != -69) {
                  var9 = (byte[]) null;
                  sb.a((byte[][]) null, 68, 35, (int[]) null, (int[]) null, (byte[][]) null, 64, (byte[]) null);
                  return var22;
                } else {
                  return var22;
                }
              } else {
                if (-3 == (var5.field_q ^ -1)) {
                  L2: {
                    var7_array = this.field_d.a(param1, -10805, var6, false, 0.699999988079071f, var6);
                    stackIn_37_0 = this.field_a;

                    stackIn_37_1 = (int[]) (var7_array);

                    stackIn_37_2 = var6;

                    stackIn_37_3 = param0 ^ -69;

                    if (0 == var5.field_k) {
                      stackIn_38_0 = (bf) ((Object) stackIn_37_0);
                      stackIn_38_1 = (int[]) ((Object) stackIn_37_1);
                      stackIn_38_2 = stackIn_37_2;
                      stackIn_38_3 = stackIn_37_3;
                      stackIn_38_4 = 0;
                      break L2;
                    } else {
                      stackIn_38_0 = (bf) ((Object) stackIn_37_0);
                      stackIn_38_1 = (int[]) ((Object) stackIn_37_1);
                      stackIn_38_2 = stackIn_37_2;
                      stackIn_38_3 = stackIn_37_3;
                      stackIn_38_4 = 1;
                      break L2;
                    }
                  }
                  var19 = ((bf) (Object) stackIn_38_0).a(stackIn_38_1, stackIn_38_2, stackIn_38_3, stackIn_38_4 != 0, var6);
                  var4 = var19;
                  var19.a(var5.field_l, var5.field_d, (byte) -127);
                  this.field_b.a((long)param1, var19, -123);
                  if (param0 != -69) {
                    var9 = (byte[]) null;
                    sb.a((byte[][]) null, 68, 35, (int[]) null, (int[]) null, (byte[][]) null, 64, (byte[]) null);
                    return var19;
                  } else {
                    return var19;
                  }
                } else {
                  if (sj.a((int) var5.field_c, (byte) -109)) {
                    L3: {
                      var7_array = this.field_d.a(var6, param1, (byte) -18, true, var6, 0.699999988079071f);
                      stackIn_51_0 = this.field_a;

                      stackIn_51_1 = (int[]) (var7_array);

                      stackIn_51_2 = var6;

                      stackIn_51_3 = param0 ^ -69;

                      if (0 == var5.field_k) {
                        stackIn_52_0 = (bf) ((Object) stackIn_51_0);
                        stackIn_52_1 = (int[]) ((Object) stackIn_51_1);
                        stackIn_52_2 = stackIn_51_2;
                        stackIn_52_3 = stackIn_51_3;
                        stackIn_52_4 = 0;
                        break L3;
                      } else {
                        stackIn_52_0 = (bf) ((Object) stackIn_51_0);
                        stackIn_52_1 = (int[]) ((Object) stackIn_51_1);
                        stackIn_52_2 = stackIn_51_2;
                        stackIn_52_3 = stackIn_51_3;
                        stackIn_52_4 = 1;
                        break L3;
                      }
                    }
                    var21 = ((bf) (Object) stackIn_52_0).a(stackIn_52_1, stackIn_52_2, stackIn_52_3, stackIn_52_4 != 0, var6);
                    var4 = var21;
                    var21.a(var5.field_l, var5.field_d, (byte) -127);
                    this.field_b.a((long)param1, var21, -123);
                    if (param0 != -69) {
                      var9 = (byte[]) null;
                      sb.a((byte[][]) null, 68, 35, (int[]) null, (int[]) null, (byte[][]) null, 64, (byte[]) null);
                      return var21;
                    } else {
                      return var21;
                    }
                  } else {
                    L4: {
                      var7_array = this.field_d.a(param1, -10805, var6, false, 0.699999988079071f, var6);
                      stackIn_44_0 = this.field_a;

                      stackIn_44_1 = (int[]) (var7_array);

                      stackIn_44_2 = var6;

                      stackIn_44_3 = param0 ^ -69;

                      if (0 == var5.field_k) {
                        stackIn_45_0 = (bf) ((Object) stackIn_44_0);
                        stackIn_45_1 = (int[]) ((Object) stackIn_44_1);
                        stackIn_45_2 = stackIn_44_2;
                        stackIn_45_3 = stackIn_44_3;
                        stackIn_45_4 = 0;
                        break L4;
                      } else {
                        stackIn_45_0 = (bf) ((Object) stackIn_44_0);
                        stackIn_45_1 = (int[]) ((Object) stackIn_44_1);
                        stackIn_45_2 = stackIn_44_2;
                        stackIn_45_3 = stackIn_44_3;
                        stackIn_45_4 = 1;
                        break L4;
                      }
                    }
                    var20 = ((bf) (Object) stackIn_45_0).a(stackIn_45_1, stackIn_45_2, stackIn_45_3, stackIn_45_4 != 0, var6);
                    var4 = var20;
                    var20.a(var5.field_l, var5.field_d, (byte) -127);
                    this.field_b.a((long)param1, var20, -123);
                    if (param0 != -69) {
                      var9 = (byte[]) null;
                      sb.a((byte[][]) null, 68, 35, (int[]) null, (int[]) null, (byte[][]) null, 64, (byte[]) null);
                      return var20;
                    } else {
                      return var20;
                    }
                  }
                }
              }
            } else {
              if (-3 == (var5.field_q ^ -1)) {
                L5: {
                  var7_array = this.field_d.a(param1, -10805, var6, false, 0.699999988079071f, var6);
                  stackIn_14_0 = this.field_a;

                  stackIn_14_1 = (int[]) (var7_array);

                  stackIn_14_2 = var6;

                  stackIn_14_3 = param0 ^ -69;

                  if (0 == var5.field_k) {
                    stackIn_15_0 = (bf) ((Object) stackIn_14_0);
                    stackIn_15_1 = (int[]) ((Object) stackIn_14_1);
                    stackIn_15_2 = stackIn_14_2;
                    stackIn_15_3 = stackIn_14_3;
                    stackIn_15_4 = 0;
                    break L5;
                  } else {
                    stackIn_15_0 = (bf) ((Object) stackIn_14_0);
                    stackIn_15_1 = (int[]) ((Object) stackIn_14_1);
                    stackIn_15_2 = stackIn_14_2;
                    stackIn_15_3 = stackIn_14_3;
                    stackIn_15_4 = 1;
                    break L5;
                  }
                }
                L6: {
                  var13 = ((bf) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_15_2, stackIn_15_3, stackIn_15_4 != 0, var6);
                  var13.a(var5.field_l, var5.field_d, (byte) -127);
                  this.field_b.a((long)param1, var13, -123);
                  if (param0 == -69) {
                    break L6;
                  } else {
                    var9 = (byte[]) null;
                    sb.a((byte[][]) null, 68, 35, (int[]) null, (int[]) null, (byte[][]) null, 64, (byte[]) null);
                    break L6;
                  }
                }
                return var13;
              } else {
                if (sj.a((int) var5.field_c, (byte) -109)) {
                  L7: {
                    var7_array = this.field_d.a(var6, param1, (byte) -18, true, var6, 0.699999988079071f);
                    stackIn_26_0 = this.field_a;

                    stackIn_26_1 = (int[]) (var7_array);

                    stackIn_26_2 = var6;

                    stackIn_26_3 = param0 ^ -69;

                    if (0 == var5.field_k) {
                      stackIn_27_0 = (bf) ((Object) stackIn_26_0);
                      stackIn_27_1 = (int[]) ((Object) stackIn_26_1);
                      stackIn_27_2 = stackIn_26_2;
                      stackIn_27_3 = stackIn_26_3;
                      stackIn_27_4 = 0;
                      break L7;
                    } else {
                      stackIn_27_0 = (bf) ((Object) stackIn_26_0);
                      stackIn_27_1 = (int[]) ((Object) stackIn_26_1);
                      stackIn_27_2 = stackIn_26_2;
                      stackIn_27_3 = stackIn_26_3;
                      stackIn_27_4 = 1;
                      break L7;
                    }
                  }
                  var4 = ((bf) (Object) stackIn_27_0).a(stackIn_27_1, stackIn_27_2, stackIn_27_3, stackIn_27_4 != 0, var6);
                  var4.a(var5.field_l, var5.field_d, (byte) -127);
                  this.field_b.a((long)param1, var4, -123);
                  if (param0 != -69) {
                    var9 = (byte[]) null;
                    sb.a((byte[][]) null, 68, 35, (int[]) null, (int[]) null, (byte[][]) null, 64, (byte[]) null);
                    return var4;
                  } else {
                    return var4;
                  }
                } else {
                  L8: {
                    var7_array = this.field_d.a(param1, -10805, var6, false, 0.699999988079071f, var6);
                    stackIn_20_0 = this.field_a;

                    stackIn_20_1 = (int[]) (var7_array);

                    stackIn_20_2 = var6;

                    stackIn_20_3 = param0 ^ -69;

                    if (0 == var5.field_k) {
                      stackIn_21_0 = (bf) ((Object) stackIn_20_0);
                      stackIn_21_1 = (int[]) ((Object) stackIn_20_1);
                      stackIn_21_2 = stackIn_20_2;
                      stackIn_21_3 = stackIn_20_3;
                      stackIn_21_4 = 0;
                      break L8;
                    } else {
                      stackIn_21_0 = (bf) ((Object) stackIn_20_0);
                      stackIn_21_1 = (int[]) ((Object) stackIn_20_1);
                      stackIn_21_2 = stackIn_20_2;
                      stackIn_21_3 = stackIn_20_3;
                      stackIn_21_4 = 1;
                      break L8;
                    }
                  }
                  L9: {
                    var14 = ((bf) (Object) stackIn_21_0).a(stackIn_21_1, stackIn_21_2, stackIn_21_3, stackIn_21_4 != 0, var6);
                    var14.a(var5.field_l, var5.field_d, (byte) -127);
                    this.field_b.a((long)param1, var14, -123);
                    if (param0 == -69) {
                      break L9;
                    } else {
                      var9 = (byte[]) null;
                      sb.a((byte[][]) null, 68, 35, (int[]) null, (int[]) null, (byte[][]) null, 64, (byte[]) null);
                      break L9;
                    }
                  }
                  return var14;
                }
              }
            }
          } else {
            return null;
          }
        }
    }

    final void a(byte param0) {
        if (param0 <= 110) {
            return;
        }
        this.field_b.a((byte) -117, 5);
    }

    final static int a(byte[][] param0, int param1, int param2, int[] param3, int[] param4, byte[][] param5, int param6, byte[] param7) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        byte[] var15 = null;
        byte[] var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        var21 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var8_int = param4[param6];
              var9 = param3[param6] + var8_int;
              var10 = param4[param1];
              var11 = var10 - -param3[param1];
              var12 = var8_int;
              if (var10 <= var8_int) {
                break L1;
              } else {
                var12 = var10;
                break L1;
              }
            }
            L2: {
              var13 = var9;
              if (var11 >= var9) {
                break L2;
              } else {
                var13 = var11;
                break L2;
              }
            }
            L3: {
              var14 = param7[param6] & 255;
              if (var14 > (255 & param7[param1])) {
                var14 = 255 & param7[param1];
                break L3;
              } else {
                break L3;
              }
            }
            var15 = param0[param6];
            var16 = param5[param1];
            var17 = var12 - var8_int;
            var18 = -var10 + var12;
            var19 = var12;
            if (param2 == -1) {
              L4: while (true) {
                if (var13 <= var19) {
                  stackIn_16_0 = -var14;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L5: {
                    incrementValue$0 = var18;
                    var18++;
                    incrementValue$1 = var17;
                    var17++;
                    var20 = var16[incrementValue$0] + var15[incrementValue$1];
                    if (var14 <= var20) {
                      break L5;
                    } else {
                      var14 = var20;
                      break L5;
                    }
                  }
                  var19++;
                  continue L4;
                }
              }
            } else {
              stackIn_10_0 = 5;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var8);

            stackIn_19_1 = new StringBuilder().append("sb.B(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param4 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');

            if (param5 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L9;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L10;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L10;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_20_0), stackIn_32_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          return stackIn_16_0;
        }
    }

    final static double a(int param0, kc param1, kc param2) {
        RuntimeException var3 = null;
        double stackIn_2_0 = 0.0;
        double stackIn_4_0 = 0.0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 > 9) {
              stackIn_4_0 = Math.sqrt(lc.a(param1, false, param2));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0.5045225109294477;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("sb.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 > 117) {
            return;
        }
        kc var2 = (kc) null;
        sb.a(-47, (kc) null, (kc) null);
    }

    sb(bf param0, d param1) {
        this.field_b = new gq(256);
        try {
            this.field_d = param1;
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "sb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = new kp();
    }
}
