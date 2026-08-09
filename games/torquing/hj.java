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
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        double stackIn_21_0 = 0.0;
        double stackIn_22_0 = 0.0;
        double stackIn_22_1 = 0.0;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        StringBuilder stackIn_47_1 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        StringBuilder stackIn_50_1 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        StringBuilder stackIn_53_1 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        StringBuilder stackIn_56_1 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        double var12_double = 0.0;
        RuntimeException var12 = null;
        double[] var13 = null;
        int var14 = 0;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        double var21 = 0.0;
        double var23 = 0.0;
        int var25 = 0;
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
                      stackIn_14_0 = 0;
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
                        stackIn_8_0 = 0;
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
                      stackIn_21_0 = var21;

                      if (-3.0 <= var21 * param6[4]) {
                        stackIn_22_0 = stackIn_21_0;
                        stackIn_22_1 = 0.0;
                        break L7;
                      } else {
                        stackIn_22_0 = stackIn_21_0;
                        stackIn_22_1 = param6[4];
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
                stackIn_41_0 = var14;
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
            stackIn_44_0 = (RuntimeException) (var12);

            stackIn_44_1 = new StringBuilder().append("hj.B(");

            if (param0 == null) {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "null";
              break L10;
            } else {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_47_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(',');

            if (param1 == null) {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackIn_48_2 = "null";
              break L11;
            } else {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackIn_48_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_50_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "null";
              break L12;
            } else {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_53_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "null";
              break L13;
            } else {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "{...}";
              break L13;
            }
          }
          L14: {


            stackIn_56_1 = ((StringBuilder) (Object) stackIn_54_1).append(stackIn_54_2).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_57_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackIn_57_2 = "null";
              break L14;
            } else {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_57_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackIn_57_2 = "{...}";
              break L14;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_45_0), stackIn_57_2 + ',' + param9 + ')');
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
