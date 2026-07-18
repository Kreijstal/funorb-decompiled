/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad {
    static boolean field_h;
    static boolean[][] field_d;
    static volatile int field_c;
    static ll field_j;
    static String field_g;
    static int[] field_i;
    static String field_a;
    static boolean field_f;
    static boolean field_e;
    static int field_b;

    final static boolean a(int param0, boolean param1, int[] param2, byte param3, int[] param4, int[] param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int[] var6_array = null;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var15 = null;
        int[] var17 = null;
        int[] var19 = null;
        int[] var20 = null;
        int stackIn_8_0 = 0;
        boolean stackIn_10_0 = false;
        boolean stackIn_12_0 = false;
        int stackIn_25_0 = 0;
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
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        boolean stackOut_11_0 = false;
        int stackOut_28_0 = 0;
        int stackOut_24_0 = 0;
        boolean stackOut_9_0 = false;
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
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var11 = SteelSentinels.field_G;
        try {
          L0: {
            var6_int = param0;
            if (var6_int == 34) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0 != 0;
            } else {
              L1: {
                if (var6_int == 27) {
                  break L1;
                } else {
                  if (var6_int == 33) {
                    break L1;
                  } else {
                    if (var6_int == 32) {
                      break L1;
                    } else {
                      if (var6_int == 24) {
                        stackOut_11_0 = bj.a(param5, 84, param1, (byte) 125);
                        stackIn_12_0 = stackOut_11_0;
                        return stackIn_12_0;
                      } else {
                        L2: {
                          var19 = n.field_z;
                          var17 = var19;
                          var15 = var17;
                          var13 = var15;
                          var12 = var13;
                          var6_array = var12;
                          if (param3 == 84) {
                            break L2;
                          } else {
                            ad.a(-38);
                            break L2;
                          }
                        }
                        var7 = 0;
                        L3: while (true) {
                          if (var7 >= var19.length) {
                            stackOut_28_0 = 0;
                            stackIn_29_0 = stackOut_28_0;
                            break L0;
                          } else {
                            L4: {
                              L5: {
                                var8 = var19[var7];
                                if (t.a(param5, var8, -20370)) {
                                  break L5;
                                } else {
                                  if (!bj.a(param5, var8, param1, (byte) 96)) {
                                    break L4;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              var20 = nl.a(var8, (byte) 123);
                              var10 = var20.length - 8;
                              L6: while (true) {
                                if (var10 >= var20.length) {
                                  break L4;
                                } else {
                                  if (param0 == var20[var10]) {
                                    stackOut_24_0 = 1;
                                    stackIn_25_0 = stackOut_24_0;
                                    return stackIn_25_0 != 0;
                                  } else {
                                    var10++;
                                    continue L6;
                                  }
                                }
                              }
                            }
                            var7++;
                            continue L3;
                          }
                        }
                      }
                    }
                  }
                }
              }
              stackOut_9_0 = bj.a(param5, 62, param1, (byte) 115);
              stackIn_10_0 = stackOut_9_0;
              return stackIn_10_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var6;
            stackOut_30_1 = new StringBuilder().append("ad.C(").append(param0).append(',').append(param1).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param2 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L7;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L7;
            }
          }
          L8: {
            stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
            stackOut_33_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',').append(param3).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param4 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L8;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L8;
            }
          }
          L9: {
            stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
            stackOut_36_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',');
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param5 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L9;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L9;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + ')');
        }
        return stackIn_29_0 != 0;
    }

    final static void a(int param0, int param1) {
        kj var2 = mm.field_g;
        var2.a(param1, (byte) -117);
        var2.field_p = var2.field_p + 1;
        int var3 = var2.field_p;
        var2.a((byte) 126, 5);
        var2.a((byte) 114, nf.field_b.field_Ub);
        int var4 = nf.field_b.field_Nc + (nf.field_b.field_sc << 6);
        var2.a((byte) 127, var4);
        var2.a(nf.field_b.field_Sb.length, (byte) -122, 0, nf.field_b.field_Sb);
        var2.b((byte) -113, var2.field_p - var3);
    }

    final static void a(boolean param0, byte param1) {
        if (qf.field_e != null) {
            if (qf.field_e.b(param0, (byte) -128)) {
                qf.field_e = null;
            }
        }
        if (param1 != -76) {
            field_b = -64;
        }
    }

    final static void a(int param0, nk param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int[] var3_array = null;
        int[] var4_ref_int__ = null;
        int var4 = 0;
        int[] var5 = null;
        int var6_int = 0;
        wk var6 = null;
        int var7 = 0;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        int stackIn_57_2 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int stackOut_56_0 = 0;
        int stackOut_56_1 = 0;
        int stackOut_56_2 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        int stackOut_55_2 = 0;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param0 < 0) {
                break L1;
              } else {
                if (param0 < ue.field_c.length) {
                  L2: {
                    if (param1 != null) {
                      break L2;
                    } else {
                      L3: {
                        if (0 > param0) {
                          break L3;
                        } else {
                          if (ue.field_c.length > param0) {
                            var20 = ue.field_c[param0];
                            var16 = var20;
                            var12 = var16;
                            var8 = var12;
                            var3_array = var8;
                            if (var3_array == null) {
                              ue.field_g[param0] = null;
                              return;
                            } else {
                              var22 = new int[8];
                              var18 = var22;
                              var14 = var18;
                              var10 = var14;
                              var4_ref_int__ = var10;
                              var21 = new int[-8 + var20.length];
                              var17 = var21;
                              var13 = var17;
                              var9 = var13;
                              var5 = var9;
                              ii.a(var3_array, 0, var5, 0, var21.length);
                              ii.a(var3_array, var21.length, var4_ref_int__, 0, var22.length);
                              param1 = ji.a(var21, (byte) 97, var22);
                              break L2;
                            }
                          } else {
                            break L3;
                          }
                        }
                      }
                      return;
                    }
                  }
                  L4: {
                    if (null != ue.field_g[param0]) {
                      ue.field_g[param0].d();
                      pb.a(0, 0, 62, 74, 0);
                      break L4;
                    } else {
                      ue.field_g[param0] = new wk(62, 74);
                      ue.field_g[param0].d();
                      break L4;
                    }
                  }
                  L5: {
                    var3_int = hj.field_w;
                    if (param2 > 23) {
                      break L5;
                    } else {
                      ad.a(true, (byte) -104);
                      break L5;
                    }
                  }
                  L6: {
                    if (param1.field_N == 0) {
                      hj.field_w = 1200;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (55 == param1.field_N) {
                      hj.field_w = 1200;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (param1.field_N == 57) {
                      hj.field_w = 1300;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (param1.field_N == 62) {
                      hj.field_w = 1400;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (param1.field_N != 65) {
                      break L10;
                    } else {
                      hj.field_w = 1000;
                      break L10;
                    }
                  }
                  L11: {
                    if (param1.field_N != 69) {
                      break L11;
                    } else {
                      hj.field_w = 1400;
                      break L11;
                    }
                  }
                  L12: {
                    if (param1.field_N != 72) {
                      break L12;
                    } else {
                      hj.field_w = 1000;
                      break L12;
                    }
                  }
                  L13: {
                    if (param1.field_N != 75) {
                      break L13;
                    } else {
                      hj.field_w = 1000;
                      break L13;
                    }
                  }
                  L14: {
                    if (param1.field_N == 79) {
                      hj.field_w = 1000;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if (param1.field_N != 84) {
                      break L15;
                    } else {
                      hj.field_w = 1000;
                      break L15;
                    }
                  }
                  L16: {
                    if (88 == param1.field_N) {
                      hj.field_w = 1000;
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  L17: {
                    if (param1.field_N != 92) {
                      break L17;
                    } else {
                      hj.field_w = 700;
                      break L17;
                    }
                  }
                  L18: {
                    param1.a(0, false, 31, 74, (byte) 49, 0);
                    hj.field_w = var3_int;
                    if (!nk.f((byte) -19)) {
                      var4 = 0;
                      var23 = ue.field_c[param0];
                      var6_int = 0;
                      L19: while (true) {
                        L20: {
                          if (~var23.length >= ~var6_int) {
                            break L20;
                          } else {
                            L21: {
                              if (var23[var6_int] == -1) {
                                break L21;
                              } else {
                                L22: {
                                  stackOut_54_0 = var23[var6_int];
                                  stackOut_54_1 = -68;
                                  stackIn_56_0 = stackOut_54_0;
                                  stackIn_56_1 = stackOut_54_1;
                                  stackIn_55_0 = stackOut_54_0;
                                  stackIn_55_1 = stackOut_54_1;
                                  if (~(-8 + var23.length) < ~var6_int) {
                                    stackOut_56_0 = stackIn_56_0;
                                    stackOut_56_1 = stackIn_56_1;
                                    stackOut_56_2 = 0;
                                    stackIn_57_0 = stackOut_56_0;
                                    stackIn_57_1 = stackOut_56_1;
                                    stackIn_57_2 = stackOut_56_2;
                                    break L22;
                                  } else {
                                    stackOut_55_0 = stackIn_55_0;
                                    stackOut_55_1 = stackIn_55_1;
                                    stackOut_55_2 = 1;
                                    stackIn_57_0 = stackOut_55_0;
                                    stackIn_57_1 = stackOut_55_1;
                                    stackIn_57_2 = stackOut_55_2;
                                    break L22;
                                  }
                                }
                                if (oc.a(stackIn_57_0, stackIn_57_1, stackIn_57_2 == 0)) {
                                  break L21;
                                } else {
                                  var4 = 1;
                                  break L20;
                                }
                              }
                            }
                            var6_int++;
                            continue L19;
                          }
                        }
                        if (var4 != 0) {
                          pb.c(0, 0, 62, 74, 0, 128);
                          var6 = sj.field_F;
                          var6.a((-var6.field_z + 62) / 2, (-var6.field_B + 74) / 2);
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                    } else {
                      break L18;
                    }
                  }
                  sb.field_bb.b((byte) 123);
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var3 = decompiledCaughtException;
            stackOut_65_0 = (RuntimeException) var3;
            stackOut_65_1 = new StringBuilder().append("ad.D(").append(param0).append(',');
            stackIn_67_0 = stackOut_65_0;
            stackIn_67_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param1 == null) {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "null";
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L23;
            } else {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "{...}";
              stackIn_68_0 = stackOut_66_0;
              stackIn_68_1 = stackOut_66_1;
              stackIn_68_2 = stackOut_66_2;
              break L23;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_68_0, stackIn_68_2 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_j = null;
        field_g = null;
        field_a = null;
        field_d = null;
        if (param0 != 0) {
            return;
        }
        field_i = null;
    }

    final static int a(int param0, int param1, int param2) {
        if (param0 < 103) {
            return 2;
        }
        int var3 = param1 >>> 31;
        return (param1 - -var3) / param2 - var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_g = "Names cannot start or end with space or underscore";
        field_e = true;
        field_a = "Friends";
        field_b = 0;
    }
}
