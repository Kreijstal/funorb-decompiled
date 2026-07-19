/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj {
    static sm field_c;
    static String field_a;
    static boolean field_b;

    public static void a(byte param0) {
        field_a = null;
        if (param0 <= 54) {
            return;
        }
        field_c = null;
    }

    final static void a(boolean param0, int param1) {
        df var2 = wa.field_d;
        var2.f(-40, param1);
        if (param0) {
            field_c = (sm) null;
        }
        var2.b(90, 1);
        var2.b(90, 2);
    }

    final static t a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = Torquing.field_u;
        t var6 = new t(param2, param2);
        t var3 = var6;
        for (var4 = 0; var4 < var3.field_y.length; var4++) {
            var6.field_y[var4] = param1;
        }
        if (param0 >= -85) {
            hj.a((byte) -13);
        }
        return var3;
    }

    final static int a(double[] param0, double[] param1, int param2, double[] param3, double param4, double param5, double[] param6, boolean param7, double[] param8, int param9) {
        RuntimeException var12 = null;
        int var12_int = 0;
        double var12_double = 0.0;
        double[] var13 = null;
        int var14 = 0;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        double var21 = 0.0;
        double var23 = 0.0;
        int var25 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        double stackIn_20_0 = 0.0;
        double stackIn_21_0 = 0.0;
        double stackIn_22_0 = 0.0;
        double stackIn_22_1 = 0.0;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_7_0 = 0;
        double stackOut_19_0 = 0.0;
        double stackOut_21_0 = 0.0;
        double stackOut_21_1 = 0.0;
        double stackOut_20_0 = 0.0;
        double stackOut_20_1 = 0.0;
        int stackOut_40_0 = 0;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        var25 = Torquing.field_u;
        try {
          L0: {
            var12_int = 0;
            L1: while (true) {
              if (-4 >= (var12_int ^ -1)) {
                L2: {
                  var12_double = param6[3];
                  if (0.0001 <= Math.abs(var12_double - param5)) {
                    if (Math.abs(var12_double) > param5) {
                      stackOut_13_0 = 0;
                      stackIn_14_0 = stackOut_13_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var14 = 1;
                      break L2;
                    }
                  } else {
                    var15 = ap.a(param6, 6, param0, 3);
                    if (1e-10 > Math.abs(var15)) {
                      var14 = 2;
                      break L2;
                    } else {
                      if (var15 <= 0.0) {
                        var14 = 1;
                        break L2;
                      } else {
                        stackOut_7_0 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                }
                L3: {
                  bf.field_b[2] = re.field_d[2] + param8[2];
                  bf.field_b[1] = re.field_d[1] + param8[1];
                  bf.field_b[0] = re.field_d[0] + param8[param2];
                  var15 = 0.4 * param5 * param5;
                  var17 = -ap.a(bf.field_b, 0, param6, 6);
                  var19 = param6[5] * var17;
                  ap.a(param0, 10, param6, 6, b.field_t, 0);
                  if (var14 != 1) {
                    L4: {
                      b.field_t[0] = param0[3] - param5 * b.field_t[0];
                      b.field_t[2] = param0[5] - param5 * b.field_t[2];
                      if (var19 >= 0.0) {
                        break L4;
                      } else {
                        var19 = 0.0;
                        break L4;
                      }
                    }
                    L5: {
                      b.field_t[1] = -(b.field_t[1] * param5) + param0[4];
                      if (ap.a(b.field_t, 0, b.field_t, 0) >= 1e-14) {
                        var21 = ap.a(b.field_t, 0, b.field_t, 0);
                        var23 = 3.5 * (var19 * param4);
                        if (var21 >= var23 * var23) {
                          break L5;
                        } else {
                          var19 = var19 * (Math.sqrt(var21) / var23);
                          break L5;
                        }
                      } else {
                        b.field_t[0] = 1.0;
                        var19 = 0.0;
                        break L5;
                      }
                    }
                    if (param7) {
                      var17 = var17 + 2400.0;
                      var14 = 3;
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    L6: {
                      if (nl.field_y[param9]) {
                        var19 = 0.0;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      var21 = ap.a(param6, 6, param0, 3);
                      b.field_t[1] = param0[4] - var21 * param6[7] - param5 * b.field_t[1];
                      stackOut_19_0 = var21;
                      stackIn_21_0 = stackOut_19_0;
                      stackIn_20_0 = stackOut_19_0;
                      if (-3.0 <= var21 * param6[4]) {
                        stackOut_21_0 = stackIn_21_0;
                        stackOut_21_1 = 0.0;
                        stackIn_22_0 = stackOut_21_0;
                        stackIn_22_1 = stackOut_21_1;
                        break L7;
                      } else {
                        stackOut_20_0 = stackIn_20_0;
                        stackOut_20_1 = param6[4];
                        stackIn_22_0 = stackOut_20_0;
                        stackIn_22_1 = stackOut_20_1;
                        break L7;
                      }
                    }
                    L8: {
                      var23 = stackIn_22_0 * -(stackIn_22_1 + 1.0) / param4;
                      b.field_t[0] = -(b.field_t[0] * param5) + (-(param6[6] * var21) + param0[3]);
                      b.field_t[2] = -(b.field_t[2] * param5) + (-(param6[8] * var21) + param0[5]);
                      if (0.0 > var19) {
                        var19 = -var19;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (ap.a(b.field_t, 0, b.field_t, 0) < 1e-14) {
                        b.field_t[1] = bf.field_b[1] + var17 * param6[7];
                        b.field_t[0] = param6[6] * var17 + bf.field_b[0];
                        b.field_t[2] = param6[8] * var17 + bf.field_b[2];
                        if (1e-14 > ap.a(b.field_t, 0, b.field_t, 0)) {
                          var19 = 0.0;
                          b.field_t[0] = 1.0;
                          break L9;
                        } else {
                          break L9;
                        }
                      } else {
                        break L9;
                      }
                    }
                    var17 = var17 + var23;
                    break L3;
                  }
                }
                ap.a(b.field_t, 0);
                b.field_t[2] = b.field_t[2] * -var19;
                b.field_t[0] = b.field_t[0] * -var19;
                b.field_t[1] = b.field_t[1] * -var19;
                param3[1] = b.field_t[1] + param6[7] * var17;
                param3[2] = b.field_t[2] + var17 * param6[8];
                param3[0] = b.field_t[0] + param6[6] * var17;
                ap.a(param6, 6, b.field_t, 0, param1, 0);
                param1[2] = param1[2] * (-param5 / var15);
                param1[0] = param1[0] * (-param5 / var15);
                param1[1] = param1[1] * (-param5 / var15);
                stackOut_40_0 = var14;
                stackIn_41_0 = stackOut_40_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                var13 = param3;
                param1[var12_int] = 0.0;
                var14 = var12_int;
                var13[var14] = 0.0;
                var12_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var12 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) (var12);
            stackOut_42_1 = new StringBuilder().append("hj.B(");
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param0 == null) {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L10;
            } else {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L10;
            }
          }
          L11: {
            stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
            stackOut_45_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(',');
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param1 == null) {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L11;
            } else {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L11;
            }
          }
          L12: {
            stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
            stackOut_48_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(',').append(param2).append(',');
            stackIn_50_0 = stackOut_48_0;
            stackIn_50_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param3 == null) {
              stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L12;
            } else {
              stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackOut_49_2 = "{...}";
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_51_2 = stackOut_49_2;
              break L12;
            }
          }
          L13: {
            stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
            stackOut_51_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param6 == null) {
              stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackOut_53_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L13;
            } else {
              stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackOut_52_2 = "{...}";
              stackIn_54_0 = stackOut_52_0;
              stackIn_54_1 = stackOut_52_1;
              stackIn_54_2 = stackOut_52_2;
              break L13;
            }
          }
          L14: {
            stackOut_54_0 = (RuntimeException) ((Object) stackIn_54_0);
            stackOut_54_1 = ((StringBuilder) (Object) stackIn_54_1).append(stackIn_54_2).append(',').append(param7).append(',');
            stackIn_56_0 = stackOut_54_0;
            stackIn_56_1 = stackOut_54_1;
            stackIn_55_0 = stackOut_54_0;
            stackIn_55_1 = stackOut_54_1;
            if (param8 == null) {
              stackOut_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackOut_56_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackOut_56_2 = "null";
              stackIn_57_0 = stackOut_56_0;
              stackIn_57_1 = stackOut_56_1;
              stackIn_57_2 = stackOut_56_2;
              break L14;
            } else {
              stackOut_55_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackOut_55_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackOut_55_2 = "{...}";
              stackIn_57_0 = stackOut_55_0;
              stackIn_57_1 = stackOut_55_1;
              stackIn_57_2 = stackOut_55_2;
              break L14;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_57_0), stackIn_57_2 + ',' + param9 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0;
          } else {
            return stackIn_41_0;
          }
        }
    }

    static {
        field_a = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_b = false;
    }
}
