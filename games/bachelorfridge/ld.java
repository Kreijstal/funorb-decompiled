/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld extends pu {
    static int field_n;
    static String field_m;
    static int field_p;
    static ai[] field_o;
    static ee[] field_l;
    static int field_q;

    final static void a(kv param0, kv param1, kv param2, ee param3, int param4, kv param5, byte param6) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        int stackIn_26_0 = 0;
        int stackIn_50_0 = 0;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        StringBuilder stackIn_83_1 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_84_2 = null;
        StringBuilder stackIn_86_1 = null;
        StringBuilder stackIn_87_1 = null;
        String stackIn_87_2 = null;
        StringBuilder stackIn_89_1 = null;
        StringBuilder stackIn_90_1 = null;
        String stackIn_90_2 = null;
        StringBuilder stackIn_92_1 = null;
        StringBuilder stackIn_93_1 = null;
        String stackIn_93_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var7 = null;
        RuntimeException var7_ref = null;
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
        int[] var31 = null;
        int[] var32 = null;
        var30 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var32 = nla.field_a;
              var31 = var32;
              var7 = var31;
              var8 = -6;
              var9 = 0;
              if (-41 < (param4 ^ -1)) {
                stackIn_4_0 = param4;
                break L1;
              } else {
                stackIn_4_0 = 40;
                break L1;
              }
            }
            L2: {
              var10 = stackIn_4_0;
              if ((param4 ^ -1) > -256) {
                stackIn_7_0 = param4;
                break L2;
              } else {
                stackIn_7_0 = 255;
                break L2;
              }
            }
            L3: {
              var11 = stackIn_7_0;
              stackIn_12_0 = 255;

              if (param4 < 45) {
                stackIn_13_0 = stackIn_12_0;
                stackIn_13_1 = 0;
                break L3;
              } else {
                L4: {


                  if (param4 <= 445) {

                    stackIn_11_1 = param4 - 45;
                    break L4;
                  } else {

                    stackIn_11_1 = 400;
                    break L4;
                  }
                }
                stackIn_13_0 = stackIn_12_0;
                stackIn_13_1 = stackIn_11_1 * 255 / 400;
                break L3;
              }
            }
            L5: {
              var12 = stackIn_13_0 ^ stackIn_13_1;
              var13 = 0;
              if (param3.field_f >= -var8) {
                break L5;
              } else {
                var13 = -(param3.field_f + var8);
                break L5;
              }
            }
            L6: {
              var14 = var13;
              var15 = var8;
              var16 = var9;
              stackIn_17_0 = param5.field_q * var16;

              if (-1 >= (var15 ^ -1)) {
                stackIn_18_0 = stackIn_17_0;
                stackIn_18_1 = var15;
                break L6;
              } else {
                stackIn_18_0 = stackIn_17_0;
                stackIn_18_1 = 0;
                break L6;
              }
            }
            L7: {
              var17 = stackIn_18_0 + stackIn_18_1;
              stackIn_20_0 = -param3.field_a;

              stackIn_20_1 = param5.field_q;

              if (var15 >= 0) {
                stackIn_21_0 = stackIn_20_0;
                stackIn_21_1 = stackIn_20_1;
                stackIn_21_2 = 0;
                break L7;
              } else {
                stackIn_21_0 = stackIn_20_0;
                stackIn_21_1 = stackIn_20_1;
                stackIn_21_2 = var15;
                break L7;
              }
            }
            var18 = stackIn_21_0 + (stackIn_21_1 + -stackIn_21_2);
            var19 = 0;
            L8: while (true) {
              if (param3.field_b <= var19) {
                L9: {
                  var14 = 0;
                  var16 = param2.field_u + var9;
                  var15 = param2.field_t + var8;
                  if (0 > var15) {
                    var14 = -var15;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  var13 = var14;
                  if (0 > var15) {
                    stackIn_50_0 = 0;
                    break L10;
                  } else {
                    stackIn_50_0 = var15;
                    break L10;
                  }
                }
                var17 = stackIn_50_0 + param2.field_t + (param2.field_u + var16) * param5.field_q;
                var18 = -param2.field_q + param5.field_q - -var13;
                var19 = 0;
                L11: while (true) {
                  if (param2.field_p <= var19) {
                    L12: {
                      var15 = param1.field_t + var8;
                      if (param6 == 27) {
                        break L12;
                      } else {
                        field_m = (String) null;
                        break L12;
                      }
                    }
                    var19 = 0;
                    L13: while (true) {
                      if (var19 >= eq.field_c.length) {
                        break L0;
                      } else {
                        L14: {
                          var16 = var9 - -eq.field_c[var19];
                          var20 = ce.field_u[var19] + -var10;
                          if (-1 < (var20 ^ -1)) {
                            var20 = 0;
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        var18 = -param1.field_q + param5.field_q;
                        var17 = var15 + var16 * param0.field_q;
                        var14 = param1.field_q * (-var9 + eq.field_c[var19] + var20);
                        var21 = 0;
                        L15: while (true) {
                          L16: {
                            if (var21 >= ce.field_u[var19]) {
                              break L16;
                            } else {
                              if (var21 >= var10) {
                                break L16;
                              } else {
                                var22 = 0;
                                L17: while (true) {
                                  if (var22 >= param1.field_q) {
                                    var17 = var17 + var18;
                                    var21++;
                                    continue L15;
                                  } else {
                                    L18: {
                                      incrementValue$0 = var14;
                                      var14++;
                                      var23 = param1.field_v[incrementValue$0];
                                      var24 = param0.field_v[var17];
                                      var25 = var23 >>> 82049528;
                                      if (-1 > (var25 ^ -1)) {
                                        var26 = var25 ^ 255;
                                        param0.field_v[var17] = mp.a(dda.a(16711935, var26 * dda.a(16711935, var24) + dda.a(16711935, var23) * var25 >> 1037699080), dda.a(var25 * dda.a(var23, 65280) + dda.a(65280, var24) * var26 >> 1849117128, 65280));
                                        break L18;
                                      } else {
                                        break L18;
                                      }
                                    }
                                    var17++;
                                    var22++;
                                    continue L17;
                                  }
                                }
                              }
                            }
                          }
                          var19++;
                          continue L13;
                        }
                      }
                    }
                  } else {
                    var20 = var13;
                    L19: while (true) {
                      if (var20 >= param2.field_q) {
                        var14 = var14 + var13;
                        var17 = var17 + var18;
                        var19++;
                        continue L11;
                      } else {
                        L20: {
                          incrementValue$1 = var14;
                          var14++;
                          var21 = param2.field_v[incrementValue$1];
                          var22 = param0.field_v[var17];
                          var23 = var11 * (var21 >>> -123452680) >> 1326666472;
                          if (0 < var23) {
                            var24 = 255 ^ var23;
                            param0.field_v[var17] = mp.a(dda.a(16711935, dda.a(16711935, var22) * var24 + var23 * dda.a(var21, 16711935) >> -954582232), dda.a(dda.a(var21, 65280) * var23 - -(dda.a(65280, var22) * var24) >> 1581236520, 65280));
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                        var17++;
                        var20++;
                        continue L19;
                      }
                    }
                  }
                }
              } else {
                L21: {
                  if (var15 < 0) {
                    stackIn_26_0 = -var15;
                    break L21;
                  } else {
                    stackIn_26_0 = 0;
                    break L21;
                  }
                }
                var20 = stackIn_26_0;
                L22: while (true) {
                  if (param3.field_a <= var20) {
                    var17 = var17 + var18;
                    var14 = var14 + var13;
                    var19++;
                    continue L8;
                  } else {
                    L23: {
                      L24: {
                        if ((var19 ^ -1) > (param3.field_c ^ -1)) {
                          break L24;
                        } else {
                          if (var19 >= param3.field_e + param3.field_c) {
                            break L24;
                          } else {
                            if (var20 < param3.field_f) {
                              break L24;
                            } else {
                              if (var20 < param3.field_d - -param3.field_f) {
                                incrementValue$2 = var14;
                                var14++;
                                var21 = param3.field_g[incrementValue$2];
                                if (-1 > (var21 ^ -1)) {
                                  var21 = 255 & param3.field_h[var21];
                                  if (var12 < var21) {
                                    L25: {
                                      var22 = var32.length * (-var12 + var21) >> -1249564088;
                                      var23 = var32[var22];
                                      var24 = (var23 & 16711680) >> -1167630352;
                                      var25 = var23 >> 1577203912 & 255;
                                      var26 = var23 & 255;
                                      if (var22 < -1 + var32.length) {
                                        var27 = 255 & var32.length * (-var12 + var21);
                                        var28 = var27 ^ 255;
                                        var29 = var7[var22 - -1];
                                        var25 = (var29 >> 672885896 & 255) * var27 + var28 * var25 >> -648672536;
                                        var26 = var27 * (var29 & 255) + var26 * var28 >> 90634024;
                                        var24 = var27 * (var29 >> 1674559088 & 255) + var24 * var28 >> -1025680376;
                                        break L25;
                                      } else {
                                        break L25;
                                      }
                                    }
                                    var25 = (255 & param5.field_v[var17] >> -1603725016) * var25 >> -1789920120;
                                    var26 = var26 * (param5.field_v[var17] & 255) >> 243833192;
                                    var24 = (255 & param5.field_v[var17] >> 2113699728) * var24 >> -681924632;
                                    param0.field_v[var17] = mp.a(mp.a(var24 << -1678496016, var25 << -169407480), var26);
                                    break L23;
                                  } else {
                                    param0.field_v[var17] = param5.field_v[var17];
                                    break L23;
                                  }
                                } else {
                                  param0.field_v[var17] = param5.field_v[var17];
                                  break L23;
                                }
                              } else {
                                break L24;
                              }
                            }
                          }
                        }
                      }
                      param0.field_v[var17] = param5.field_v[var17];
                      break L23;
                    }
                    var17++;
                    var20++;
                    continue L22;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var7_ref = decompiledCaughtException;
            stackIn_80_0 = (RuntimeException) (var7_ref);

            stackIn_80_1 = new StringBuilder().append("ld.C(");

            if (param0 == null) {
              stackIn_81_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackIn_81_2 = "null";
              break L26;
            } else {
              stackIn_81_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackIn_81_2 = "{...}";
              break L26;
            }
          }
          L27: {


            stackIn_83_1 = ((StringBuilder) (Object) stackIn_81_1).append(stackIn_81_2).append(',');

            if (param1 == null) {
              stackIn_81_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackIn_84_1 = (StringBuilder) ((Object) stackIn_83_1);
              stackIn_84_2 = "null";
              break L27;
            } else {
              stackIn_81_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackIn_84_1 = (StringBuilder) ((Object) stackIn_83_1);
              stackIn_84_2 = "{...}";
              break L27;
            }
          }
          L28: {


            stackIn_86_1 = ((StringBuilder) (Object) stackIn_84_1).append(stackIn_84_2).append(',');

            if (param2 == null) {
              stackIn_81_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackIn_87_1 = (StringBuilder) ((Object) stackIn_86_1);
              stackIn_87_2 = "null";
              break L28;
            } else {
              stackIn_81_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackIn_87_1 = (StringBuilder) ((Object) stackIn_86_1);
              stackIn_87_2 = "{...}";
              break L28;
            }
          }
          L29: {


            stackIn_89_1 = ((StringBuilder) (Object) stackIn_87_1).append(stackIn_87_2).append(',');

            if (param3 == null) {
              stackIn_81_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackIn_90_1 = (StringBuilder) ((Object) stackIn_89_1);
              stackIn_90_2 = "null";
              break L29;
            } else {
              stackIn_81_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackIn_90_1 = (StringBuilder) ((Object) stackIn_89_1);
              stackIn_90_2 = "{...}";
              break L29;
            }
          }
          L30: {


            stackIn_92_1 = ((StringBuilder) (Object) stackIn_90_1).append(stackIn_90_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_81_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackIn_93_1 = (StringBuilder) ((Object) stackIn_92_1);
              stackIn_93_2 = "null";
              break L30;
            } else {
              stackIn_81_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackIn_93_1 = (StringBuilder) ((Object) stackIn_92_1);
              stackIn_93_2 = "{...}";
              break L30;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_81_0), stackIn_93_2 + ',' + param6 + ')');
        }
    }

    public static void b(boolean param0) {
        field_o = null;
        if (!param0) {
            field_q = -18;
        }
        field_l = null;
        field_m = null;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        gma.field_e[param1] = new si(param1, param0, param0);
        if (param2 != 45) {
            ld.b(true);
        }
    }

    static {
        field_n = -1;
        field_m = "Select a creature to bring up your actions again.";
    }
}
