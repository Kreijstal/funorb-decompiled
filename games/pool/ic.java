/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ic {
    static he field_c;
    static int field_a;
    static String field_b;

    final static void a() {
        hj.field_g = 133;
        hj.field_f = 21845;
        hj.field_l = 33;
        int var2 = -59;
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
    }

    final static byte a(int[] param0, int param1, int[] param2, int[] param3, int[] param4, int param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
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
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int stackIn_3_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_62_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_48_0 = 0;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        try {
          L0: {
            L1: {
              var6_int = param2[1 + param1] + -param2[param1];
              var7 = -param0[param1] + param0[param1 + 1];
              var8 = -param4[param1] + param4[1 + param1];
              if (param3 == null) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = -param3[param1] + param3[1 + param1];
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var9 = stackIn_3_0;
              var10 = 0;
              var17 = 0;
              var11 = -fb.field_q + qh.field_j;
              var13 = -512;
              var18 = 256;
              var15 = var11;
              var16 = -(512 * var6_int) + var11 * var8;
              if (var16 == 0) {
                break L2;
              } else {
                var19 = (512 * param2[param1] + -(var11 * param4[param1]) << 8) / var16;
                if (var19 <= var17) {
                  break L2;
                } else {
                  if (var18 > var19) {
                    var20 = ((param4[param1] << 8) - -(var8 * var19)) / 512;
                    if (var20 > 0) {
                      if (0 >= var6_int * var13 + var8 * var15) {
                        var18 = var19;
                        var10 = (byte)(var10 | 16);
                        break L2;
                      } else {
                        var17 = var19;
                        var10 = (byte)(var10 | 1);
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
              }
            }
            L3: {
              var13 = 512;
              var11 = qh.field_b - fb.field_q;
              var15 = -var11;
              var16 = var11 * var8 + -(var6_int * 512);
              var14 = -512;
              if (var16 != 0) {
                var19 = (512 * param2[param1] - param4[param1] * var11 << 8) / var16;
                if (var19 <= var17) {
                  break L3;
                } else {
                  if (var18 <= var19) {
                    break L3;
                  } else {
                    var20 = ((param4[param1] << 8) - -(var8 * var19)) / 512;
                    if (var20 > 0) {
                      if (var15 * var8 + var13 * var6_int <= 0) {
                        var18 = var19;
                        var10 = (byte)(var10 | 32);
                        break L3;
                      } else {
                        var10 = (byte)(var10 | 2);
                        var17 = var19;
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
              } else {
                break L3;
              }
            }
            L4: {
              if (param5 == 4) {
                break L4;
              } else {
                field_a = -4;
                break L4;
              }
            }
            L5: {
              var12 = -fb.field_d + qh.field_g;
              var15 = var12;
              var16 = var12 * var8 - var7 * 512;
              if (0 == var16) {
                break L5;
              } else {
                var19 = (-(var12 * param4[param1]) + 512 * param0[param1] << 8) / var16;
                if (var17 >= var19) {
                  break L5;
                } else {
                  if (var19 >= var18) {
                    break L5;
                  } else {
                    var20 = (var8 * var19 + (param4[param1] << 8)) / 512;
                    if (0 < var20) {
                      if (var8 * var15 + var14 * var7 > 0) {
                        var17 = var19;
                        var10 = (byte)(var10 | 4);
                        break L5;
                      } else {
                        var18 = var19;
                        var10 = (byte)(var10 | 64);
                        break L5;
                      }
                    } else {
                      break L5;
                    }
                  }
                }
              }
            }
            L6: {
              var14 = 512;
              var12 = qh.field_c + -fb.field_d;
              var15 = -var12;
              var16 = -(512 * var7) + var12 * var8;
              if (var16 != 0) {
                var19 = (512 * param0[param1] - var12 * param4[param1] << 8) / var16;
                if (var17 >= var19) {
                  break L6;
                } else {
                  if (var19 >= var18) {
                    break L6;
                  } else {
                    var20 = ((param4[param1] << 8) - -(var19 * var8)) / 512;
                    if (var20 <= 0) {
                      break L6;
                    } else {
                      if (var15 * var8 + var14 * var7 > 0) {
                        var17 = var19;
                        var10 = (byte)(var10 | 8);
                        break L6;
                      } else {
                        var18 = var19;
                        var10 = (byte)(var10 | 128);
                        break L6;
                      }
                    }
                  }
                }
              } else {
                break L6;
              }
            }
            L7: {
              if (var17 != 0) {
                param2[param1] = param2[param1] + (var6_int * var17 >> 8);
                param0[param1] = param0[param1] + (var7 * var17 >> 8);
                param4[param1] = param4[param1] + (var17 * var8 >> 8);
                if (param3 == null) {
                  break L7;
                } else {
                  param3[param1] = param3[param1] + (var17 * var9 >> 8);
                  break L7;
                }
              } else {
                break L7;
              }
            }
            L8: {
              if (256 != var18) {
                param2[param1 + 1] = param2[param1 + 1] - (var6_int * (256 + -var18) >> 8);
                param0[param1 - -1] = param0[param1 - -1] - (var7 * (-var18 + 256) >> 8);
                param4[1 + param1] = param4[1 + param1] - ((-var18 + 256) * var8 >> 8);
                if (param3 != null) {
                  param3[1 + param1] = param3[1 + param1] - (var9 * (-var18 + 256) >> 8);
                  break L8;
                } else {
                  break L8;
                }
              } else {
                break L8;
              }
            }
            stackOut_48_0 = var10;
            stackIn_49_0 = stackOut_48_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_50_0 = (RuntimeException) var6;
            stackOut_50_1 = new StringBuilder().append("ic.D(");
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param0 == null) {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L9;
            } else {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L9;
            }
          }
          L10: {
            stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
            stackOut_53_1 = ((StringBuilder) (Object) stackIn_53_1).append(stackIn_53_2).append(',').append(param1).append(',');
            stackIn_55_0 = stackOut_53_0;
            stackIn_55_1 = stackOut_53_1;
            stackIn_54_0 = stackOut_53_0;
            stackIn_54_1 = stackOut_53_1;
            if (param2 == null) {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "null";
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              stackIn_56_2 = stackOut_55_2;
              break L10;
            } else {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "{...}";
              stackIn_56_0 = stackOut_54_0;
              stackIn_56_1 = stackOut_54_1;
              stackIn_56_2 = stackOut_54_2;
              break L10;
            }
          }
          L11: {
            stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
            stackOut_56_1 = ((StringBuilder) (Object) stackIn_56_1).append(stackIn_56_2).append(',');
            stackIn_58_0 = stackOut_56_0;
            stackIn_58_1 = stackOut_56_1;
            stackIn_57_0 = stackOut_56_0;
            stackIn_57_1 = stackOut_56_1;
            if (param3 == null) {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "null";
              stackIn_59_0 = stackOut_58_0;
              stackIn_59_1 = stackOut_58_1;
              stackIn_59_2 = stackOut_58_2;
              break L11;
            } else {
              stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
              stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
              stackOut_57_2 = "{...}";
              stackIn_59_0 = stackOut_57_0;
              stackIn_59_1 = stackOut_57_1;
              stackIn_59_2 = stackOut_57_2;
              break L11;
            }
          }
          L12: {
            stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
            stackOut_59_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_59_2).append(',');
            stackIn_61_0 = stackOut_59_0;
            stackIn_61_1 = stackOut_59_1;
            stackIn_60_0 = stackOut_59_0;
            stackIn_60_1 = stackOut_59_1;
            if (param4 == null) {
              stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
              stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
              stackOut_61_2 = "null";
              stackIn_62_0 = stackOut_61_0;
              stackIn_62_1 = stackOut_61_1;
              stackIn_62_2 = stackOut_61_2;
              break L12;
            } else {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "{...}";
              stackIn_62_0 = stackOut_60_0;
              stackIn_62_1 = stackOut_60_1;
              stackIn_62_2 = stackOut_60_2;
              break L12;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_62_0, stackIn_62_2 + ',' + param5 + ')');
        }
        return (byte) stackIn_49_0;
    }

    final static dd a(int param0, boolean param1, int param2, String param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        dd var7 = null;
        int var10 = 0;
        int var11 = 0;
        dd var12 = null;
        int[] var19 = null;
        int[] var20 = null;
        dd stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        dd stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var5_int = mc.field_e.b(param3, 320);
            var6 = var5_int * mc.field_e.field_G - -mc.field_e.field_w;
            var7 = new dd(324, 4 + var6);
            var7.field_B = -2;
            var7.field_G = -2;
            var19 = new int[4];
            var20 = qh.field_d;
            var10 = qh.field_l;
            var11 = qh.field_f;
            qh.a(var19);
            var7.e();
            int discarded$2 = mc.field_e.a(param3, 2, 2, 320, var6, 4, -1, 1, 0, mc.field_e.field_G * 3 / 4);
            var7.e(4144959);
            var7.e(65793);
            qh.a(var20, var10, var11);
            qh.b(var19);
            var7.b();
            var7.field_y = var7.field_A;
            var7.field_w = var7.field_z;
            var7.field_B = 0;
            var12 = var7;
            var12.field_G = 0;
            stackOut_0_0 = (dd) var7;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var5;
            stackOut_2_1 = new StringBuilder().append("ic.A(").append(1).append(',').append(true).append(',').append(320).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param3 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + 4 + ')');
        }
        return stackIn_1_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new he();
        field_b = "Who can join";
    }
}
