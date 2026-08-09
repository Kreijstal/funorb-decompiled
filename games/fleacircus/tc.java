/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc {
    static String field_g;
    String field_d;
    String field_i;
    String field_c;
    static String[] field_e;
    int field_f;
    static int[] field_b;
    rh field_a;
    static int field_h;

    final static dj a(rh param0, String param1, rh param2, byte param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        dj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 > 88) {
                break L1;
              } else {
                tc.a((byte) 1);
                break L1;
              }
            }
            var5_int = param2.a(param4, (byte) -100);
            var6 = param2.a(param1, (byte) -15, var5_int);
            stackIn_3_0 = ni.a(var6, -2974, param0, param2, var5_int);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("tc.C(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(byte param0) {
        field_e = null;
        field_g = null;
        if (param0 != -75) {
            return;
        }
        field_b = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, si param7) {
        int stackIn_16_0 = 0;
        int[] stackIn_18_0 = null;
        int[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        re stackIn_38_0 = null;
        int stackIn_43_0 = 0;
        int stackIn_47_0 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var8 = null;
        RuntimeException var8_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        re var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        si var44 = null;
        int[] var49 = null;
        int[] var54 = null;
        byte[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        var40 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var44 = param7;
                if (var44.field_J == null) {
                  break L2;
                } else {
                  if (1 >= var44.field_h) {
                    break L2;
                  } else {
                    var60 = var44.field_J;
                    qj.a(0, 0, var60, ge.field_e, 0);
                    break L1;
                  }
                }
              }
              pb.b((byte) 124);
              break L1;
            }
            L3: {
              var54 = new int[param7.field_p];
              var49 = var54;
              var41 = var49;
              var8 = var41;
              var64 = new int[param7.field_p];
              if (param4 == 30675) {
                break L3;
              } else {
                field_b = (int[]) null;
                break L3;
              }
            }
            var62 = field_b;
            var63 = lj.field_j;
            var61 = nb.field_d;
            var13 = 0;
            L4: while (true) {
              if (var13 >= param7.field_p) {
                var13 = 0;
                L5: while (true) {
                  if (var13 >= vc.field_d) {
                    break L0;
                  } else {
                    L6: {
                      var14 = pk.field_J[var13];
                      var15 = param7.field_Q[var14];
                      var16 = param7.field_M[var14];
                      var17 = param7.field_N[var14];
                      if (param7.field_D[var14] >= field_b.length) {
                        stackIn_25_0 = -1;
                        break L6;
                      } else {
                        stackIn_25_0 = param7.field_D[var14];
                        break L6;
                      }
                    }
                    L7: {
                      var18 = stackIn_25_0;
                      if (param7.field_F[var14] < field_b.length) {
                        stackIn_28_0 = param7.field_F[var14];
                        break L7;
                      } else {
                        stackIn_28_0 = -1;
                        break L7;
                      }
                    }
                    L8: {
                      var19 = stackIn_28_0;
                      if (param7.field_u[var14] < field_b.length) {
                        stackIn_31_0 = param7.field_u[var14];
                        break L8;
                      } else {
                        stackIn_31_0 = -1;
                        break L8;
                      }
                    }
                    L9: {
                      L10: {
                        var20 = stackIn_31_0;
                        if (null == fc.field_a) {
                          break L10;
                        } else {
                          if (null == param7.field_s) {
                            break L10;
                          } else {
                            if (var14 >= param7.field_s.length) {
                              break L10;
                            } else {
                              if (param7.field_s[var14] == -1) {
                                break L10;
                              } else {
                                if (param7.field_s[var14] >= fc.field_a.length) {
                                  break L10;
                                } else {
                                  stackIn_38_0 = fc.field_a[param7.field_s[var14]];
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackIn_38_0 = null;
                      break L9;
                    }
                    L11: {
                      L12: {
                        var21 = stackIn_38_0;
                        var22 = kb.field_o[var15];
                        var23 = il.field_c[var15];
                        var24 = kb.field_o[var16];
                        var25 = il.field_c[var16];
                        var26 = kb.field_o[var17];
                        var27 = il.field_c[var17];
                        if (var19 != var18) {
                          break L12;
                        } else {
                          if (var20 != var19) {
                            break L12;
                          } else {
                            L13: {
                              var28 = var54[var18];
                              var29 = var64[var18];
                              if (var21 == null) {
                                stackIn_43_0 = 8355711;
                                break L13;
                              } else {
                                stackIn_43_0 = var21.field_a;
                                break L13;
                              }
                            }
                            var30 = stackIn_43_0;
                            var31 = var30 & 16711935;
                            var32 = var30 & 65280;
                            var33 = var28 * var32 >>> 2087189608 & 1157693184 | -117505793 & var31 * var28 >>> 559768840;
                            var33 = var33 + 65793 * var29;
                            wb.a(var26, var25, var27, (byte) -39, (16711422 & var33) >> 1937374913, var23, var22, var24);
                            break L11;
                          }
                        }
                      }
                      L14: {
                        var28 = var54[var18];
                        var29 = var54[var19];
                        var30 = var54[var20];
                        var31 = var64[var18];
                        var32 = var64[var19];
                        var33 = var64[var20];
                        if (var21 != null) {
                          stackIn_47_0 = var21.field_a;
                          break L14;
                        } else {
                          stackIn_47_0 = 8355711;
                          break L14;
                        }
                      }
                      var34 = stackIn_47_0;
                      var35 = var34 & 16711935;
                      var36 = 65280 & var34;
                      var37 = var35 * var28 >>> -665232408 & 671023359 | (var36 * var28 & 16711700) >>> -890855480;
                      var38 = (var36 * var29 & 16711890) >>> 2066697608 | -654376705 & var29 * var35 >>> -912166008;
                      var38 = var38 + var32 * 65793;
                      var37 = var37 + 65793 * var31;
                      var39 = (var35 * var30 & -16711845) >>> 1591545288 | (16711734 & var36 * var30) >>> -2109765400;
                      var39 = var39 + 65793 * var33;
                      oh.a(var27, 255 & var39, var22, (65365 & var37) >> -1752078744, var26, 0, 255 & var38, var38 >> 1305515184, var23, var37 & 255, var39 >> -811291344, var25, (var38 & 65423) >> 889888520, var37 >> -616283376, var24, 255 & var39 >> 663244424);
                      break L11;
                    }
                    var13++;
                    continue L5;
                  }
                }
              } else {
                L15: {
                  var14 = param1 * var61[var13] + param6 * var62[var13] - -(var63[var13] * param5) >> 27638280;
                  if (0 <= var14) {
                    break L15;
                  } else {
                    var14 = -var14;
                    break L15;
                  }
                }
                L16: {
                  if (0 <= var14) {
                    if (128 > var14) {
                      stackIn_16_0 = var14 + 128;
                      break L16;
                    } else {
                      stackIn_16_0 = 256;
                      break L16;
                    }
                  } else {
                    stackIn_16_0 = 128;
                    break L16;
                  }
                }
                L17: {
                  var14 = stackIn_16_0;
                  var15 = param3 * var61[var13] + (var62[var13] * param0 + param2 * var63[var13]) >> -47248056;
                  stackIn_18_0 = h.field_b;

                  if ((var15 ^ -1) <= -1) {
                    stackIn_19_0 = (int[]) ((Object) stackIn_18_0);
                    stackIn_19_1 = var15;
                    break L17;
                  } else {
                    stackIn_19_0 = (int[]) ((Object) stackIn_18_0);
                    stackIn_19_1 = -var15;
                    break L17;
                  }
                }
                var15 = stackIn_19_0[stackIn_19_1];
                var14 = var14 * (256 + -var15) >>> 1278459016;
                var54[var13] = var14;
                var64[var13] = var15;
                var13++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var8_ref = decompiledCaughtException;
            stackIn_52_0 = (RuntimeException) (var8_ref);

            stackIn_52_1 = new StringBuilder().append("tc.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_53_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "null";
              break L18;
            } else {
              stackIn_53_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "{...}";
              break L18;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_53_0), stackIn_53_2 + ')');
        }
    }

    final static boolean a(byte param0, CharSequence param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (bh.a((byte) 109, param2, param1)) {
              var3_int = 0;
              L1: while (true) {
                if (param1.length() <= var3_int) {
                  if (param0 == 82) {
                    stackIn_14_0 = 1;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    field_g = (String) null;
                    return true;
                  }
                } else {
                  if (!gi.a(45, param1.charAt(var3_int))) {
                    stackIn_9_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var3_int++;
                    continue L1;
                  }
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3);

            stackIn_17_1 = new StringBuilder().append("tc.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_14_0 != 0;
          }
        }
    }

    private tc() throws Throwable {
        throw new Error();
    }

    static {
        field_g = "Just play";
        field_b = new int[8192];
        field_h = 0;
    }
}
