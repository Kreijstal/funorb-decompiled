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
            field_c = null;
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
        int var12_int = 0;
        double var12 = 0.0;
        double[] var13 = null;
        int var14 = 0;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        double var21 = 0.0;
        double var23 = 0.0;
        int var25 = 0;
        double stackIn_19_0 = 0.0;
        double stackIn_20_0 = 0.0;
        double stackIn_21_0 = 0.0;
        double stackIn_21_1 = 0.0;
        double stackOut_18_0 = 0.0;
        double stackOut_20_0 = 0.0;
        double stackOut_20_1 = 0.0;
        double stackOut_19_0 = 0.0;
        double stackOut_19_1 = 0.0;
        var25 = Torquing.field_u;
        var12_int = 0;
        L0: while (true) {
          L1: {
            if (-4 >= (var12_int ^ -1)) {
              break L1;
            } else {
              var13 = param3;
              param1[var12_int] = 0.0;
              var14 = var12_int;
              var13[var14] = 0.0;
              var12_int++;
              if (0 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            L3: {
              var12 = param6[3];
              if (0.0001 <= Math.abs(var12 - param5)) {
                break L3;
              } else {
                L4: {
                  L5: {
                    var15 = ap.a(param6, 6, param0, 3);
                    if (1e-10 > Math.abs(var15)) {
                      break L5;
                    } else {
                      if (var15 <= 0.0) {
                        var14 = 1;
                        if (0 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      } else {
                        return 0;
                      }
                    }
                  }
                  var14 = 2;
                  break L4;
                }
                if (0 == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            L6: {
              if (Math.abs(var12) > param5) {
                break L6;
              } else {
                var14 = 1;
                if (0 == 0) {
                  break L2;
                } else {
                  break L6;
                }
              }
            }
            return 0;
          }
          L7: {
            L8: {
              bf.field_b[2] = re.field_d[2] + param8[2];
              bf.field_b[1] = re.field_d[1] + param8[1];
              bf.field_b[0] = re.field_d[0] + param8[param2];
              var15 = 0.4 * param5 * param5;
              var17 = -ap.a(bf.field_b, 0, param6, 6);
              var19 = param6[5] * var17;
              ap.a(param0, 10, param6, 6, b.field_t, 0);
              if (var14 != 1) {
                break L8;
              } else {
                L9: {
                  if (nl.field_y[param9]) {
                    var19 = 0.0;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  var21 = ap.a(param6, 6, param0, 3);
                  b.field_t[1] = param0[4] - var21 * param6[7] - param5 * b.field_t[1];
                  stackOut_18_0 = var21;
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_19_0 = stackOut_18_0;
                  if (-3.0 <= var21 * param6[4]) {
                    stackOut_20_0 = stackIn_20_0;
                    stackOut_20_1 = 0.0;
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    break L10;
                  } else {
                    stackOut_19_0 = stackIn_19_0;
                    stackOut_19_1 = param6[4];
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_21_1 = stackOut_19_1;
                    break L10;
                  }
                }
                L11: {
                  var23 = stackIn_21_0 * -(stackIn_21_1 + 1.0) / param4;
                  b.field_t[0] = -(b.field_t[0] * param5) + (-(param6[6] * var21) + param0[3]);
                  b.field_t[2] = -(b.field_t[2] * param5) + (-(param6[8] * var21) + param0[5]);
                  if (0.0 > var19) {
                    var19 = -var19;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (ap.a(b.field_t, 0, b.field_t, 0) < 1e-14) {
                    b.field_t[1] = bf.field_b[1] + var17 * param6[7];
                    b.field_t[0] = param6[6] * var17 + bf.field_b[0];
                    b.field_t[2] = param6[8] * var17 + bf.field_b[2];
                    if (1e-14 > ap.a(b.field_t, 0, b.field_t, 0)) {
                      var19 = 0.0;
                      b.field_t[0] = 1.0;
                      break L12;
                    } else {
                      break L12;
                    }
                  } else {
                    break L12;
                  }
                }
                var17 = var17 + var23;
                if (0 == 0) {
                  break L7;
                } else {
                  break L8;
                }
              }
            }
            L13: {
              b.field_t[0] = param0[3] - param5 * b.field_t[0];
              b.field_t[2] = param0[5] - param5 * b.field_t[2];
              if (var19 >= 0.0) {
                break L13;
              } else {
                var19 = 0.0;
                break L13;
              }
            }
            L14: {
              L15: {
                b.field_t[1] = -(b.field_t[1] * param5) + param0[4];
                if (ap.a(b.field_t, 0, b.field_t, 0) >= 1e-14) {
                  break L15;
                } else {
                  b.field_t[0] = 1.0;
                  var19 = 0.0;
                  if (0 == 0) {
                    break L14;
                  } else {
                    break L15;
                  }
                }
              }
              var21 = ap.a(b.field_t, 0, b.field_t, 0);
              var23 = 3.5 * (var19 * param4);
              if (var21 >= var23 * var23) {
                break L14;
              } else {
                var19 = var19 * (Math.sqrt(var21) / var23);
                break L14;
              }
            }
            if (param7) {
              var17 = var17 + 2400.0;
              var14 = 3;
              break L7;
            } else {
              break L7;
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
          return var14;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_b = false;
    }
}
