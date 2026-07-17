/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    ui field_d;
    private int field_k;
    ui field_q;
    int field_c;
    int field_l;
    int field_e;
    int field_g;
    ui field_o;
    ui field_f;
    kg field_m;
    ui field_b;
    static volatile int field_a;
    int field_i;
    int field_j;
    int field_n;
    private boolean field_p;
    static kg field_h;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, e param6, int param7) {
        RuntimeException var8 = null;
        int[] var8_array = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        Object var21 = null;
        oe var21_ref = null;
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
        int var44 = 0;
        e var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        int[] var60 = null;
        byte[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int[] var66 = null;
        int[] var67 = null;
        int stackIn_16_0 = 0;
        int[] stackIn_17_0 = null;
        int[] stackIn_18_0 = null;
        int[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        oe stackIn_39_0 = null;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        short stackOut_23_0 = 0;
        short stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        short stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        oe stackOut_38_0 = null;
        Object stackOut_37_0 = null;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int[] stackOut_16_0 = null;
        int[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        var40 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 <= -58) {
                break L1;
              } else {
                field_a = 15;
                break L1;
              }
            }
            L2: {
              L3: {
                var45 = param6;
                if (var45.field_y == null) {
                  break L3;
                } else {
                  if (var45.field_w <= 1) {
                    break L3;
                  } else {
                    var62 = var45.field_y;
                    vj.a(ca.field_c, var62, (byte) -69, 0, 0);
                    break L2;
                  }
                }
              }
              qa.c(1702);
              break L2;
            }
            var66 = new int[param6.field_l];
            var60 = var66;
            var55 = var60;
            var50 = var55;
            var41 = var50;
            var8_array = var41;
            var67 = new int[param6.field_l];
            var64 = mk.field_w;
            var65 = nh.field_j;
            var63 = d.field_b;
            var13 = 0;
            L4: while (true) {
              if (var13 >= param6.field_l) {
                var44 = 0;
                var13 = var44;
                L5: while (true) {
                  if (var44 >= ug.field_h) {
                    break L0;
                  } else {
                    L6: {
                      var14 = i.field_b[var44];
                      var15 = param6.field_o[var14];
                      var16 = param6.field_s[var14];
                      var17 = param6.field_G[var14];
                      if (mk.field_w.length <= param6.field_b[var14]) {
                        stackOut_24_0 = -1;
                        stackIn_25_0 = stackOut_24_0;
                        break L6;
                      } else {
                        stackOut_23_0 = param6.field_b[var14];
                        stackIn_25_0 = stackOut_23_0;
                        break L6;
                      }
                    }
                    L7: {
                      var18 = stackIn_25_0;
                      if (mk.field_w.length > param6.field_n[var14]) {
                        stackOut_27_0 = param6.field_n[var14];
                        stackIn_28_0 = stackOut_27_0;
                        break L7;
                      } else {
                        stackOut_26_0 = -1;
                        stackIn_28_0 = stackOut_26_0;
                        break L7;
                      }
                    }
                    L8: {
                      var19 = stackIn_28_0;
                      if (param6.field_J[var14] < mk.field_w.length) {
                        stackOut_30_0 = param6.field_J[var14];
                        stackIn_31_0 = stackOut_30_0;
                        break L8;
                      } else {
                        stackOut_29_0 = -1;
                        stackIn_31_0 = stackOut_29_0;
                        break L8;
                      }
                    }
                    L9: {
                      L10: {
                        var20 = stackIn_31_0;
                        if (rg.field_L == null) {
                          break L10;
                        } else {
                          if (param6.field_f == null) {
                            break L10;
                          } else {
                            if (var14 >= param6.field_f.length) {
                              break L10;
                            } else {
                              if (-1 == param6.field_f[var14]) {
                                break L10;
                              } else {
                                if (rg.field_L.length > param6.field_f[var14]) {
                                  stackOut_38_0 = rg.field_L[param6.field_f[var14]];
                                  stackIn_39_0 = stackOut_38_0;
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_37_0 = null;
                      stackIn_39_0 = (oe) (Object) stackOut_37_0;
                      break L9;
                    }
                    L11: {
                      L12: {
                        var21_ref = stackIn_39_0;
                        var22 = sg.field_a[var15];
                        var23 = d.field_a[var15];
                        var24 = sg.field_a[var16];
                        var25 = d.field_a[var16];
                        var26 = sg.field_a[var17];
                        var27 = d.field_a[var17];
                        if (var18 != var19) {
                          break L12;
                        } else {
                          if (var20 != var19) {
                            break L12;
                          } else {
                            L13: {
                              var28 = var66[var18];
                              var29 = var67[var18];
                              if (var21_ref == null) {
                                stackOut_43_0 = 8355711;
                                stackIn_44_0 = stackOut_43_0;
                                break L13;
                              } else {
                                stackOut_42_0 = var21_ref.field_b;
                                stackIn_44_0 = stackOut_42_0;
                                break L13;
                              }
                            }
                            var30 = stackIn_44_0;
                            var31 = 16711935 & var30;
                            var32 = var30 & 65280;
                            var33 = (16711908 & var32 * var28) >>> 8 | (-16711885 & var28 * var31) >>> 8;
                            var33 = var33 + var29 * 65793;
                            ri.a(var22, (var33 & 16711422) >> 1, var26, var27, (byte) -127, var23, var25, var24);
                            break L11;
                          }
                        }
                      }
                      L14: {
                        var28 = var66[var18];
                        var29 = var66[var19];
                        var30 = var66[var20];
                        var31 = var67[var18];
                        var32 = var67[var19];
                        var33 = var67[var20];
                        if (var21_ref != null) {
                          stackOut_47_0 = var21_ref.field_b;
                          stackIn_48_0 = stackOut_47_0;
                          break L14;
                        } else {
                          stackOut_46_0 = 8355711;
                          stackIn_48_0 = stackOut_46_0;
                          break L14;
                        }
                      }
                      var34 = stackIn_48_0;
                      var35 = 16711935 & var34;
                      var36 = 65280 & var34;
                      var37 = (var35 * var28 & -16711934) >>> 8 | (16711865 & var36 * var28) >>> 8;
                      var38 = (var29 * var36 & 16711799) >>> 8 | (var29 * var35 & -16711820) >>> 8;
                      var38 = var38 + var32 * 65793;
                      var39 = (16711897 & var30 * var36) >>> 8 | (-16711842 & var30 * var35) >>> 8;
                      var37 = var37 + 65793 * var31;
                      var39 = var39 + var33 * 65793;
                      kl.a(var38 >> 16, var23, (var39 & 65521) >> 8, var27, var24, var25, var39 & 255, var37 >> 16, (65468 & var37) >> 8, (byte) 44, var26, var38 & 255, 255 & var38 >> 8, var22, var39 >> 16, 255 & var37);
                      break L11;
                    }
                    var44++;
                    continue L5;
                  }
                }
              } else {
                L15: {
                  var14 = var63[var13] * param7 + (param2 * var64[var13] + param3 * var65[var13]) >> 8;
                  if (var14 >= 0) {
                    break L15;
                  } else {
                    var14 = -var14;
                    break L15;
                  }
                }
                L16: {
                  if (0 <= var14) {
                    if (var14 < 128) {
                      stackOut_15_0 = 128 + var14;
                      stackIn_16_0 = stackOut_15_0;
                      break L16;
                    } else {
                      stackOut_14_0 = 256;
                      stackIn_16_0 = stackOut_14_0;
                      break L16;
                    }
                  } else {
                    stackOut_12_0 = 128;
                    stackIn_16_0 = stackOut_12_0;
                    break L16;
                  }
                }
                L17: {
                  var14 = stackIn_16_0;
                  var15 = param1 * var63[var13] + (var65[var13] * param5 + var64[var13] * param0) >> 8;
                  stackOut_16_0 = ug.field_c;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_17_0 = stackOut_16_0;
                  if (var15 < 0) {
                    stackOut_18_0 = (int[]) (Object) stackIn_18_0;
                    stackOut_18_1 = -var15;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    break L17;
                  } else {
                    stackOut_17_0 = (int[]) (Object) stackIn_17_0;
                    stackOut_17_1 = var15;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    break L17;
                  }
                }
                var15 = stackIn_19_0[stackIn_19_1];
                var14 = var14 * (-var15 + 256) >>> 8;
                var66[var13] = var14;
                var67[var13] = var15;
                var13++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var8 = decompiledCaughtException;
            stackOut_51_0 = (RuntimeException) var8;
            stackOut_51_1 = new StringBuilder().append("vd.G(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param6 == null) {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L18;
            } else {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "{...}";
              stackIn_54_0 = stackOut_52_0;
              stackIn_54_1 = stackOut_52_1;
              stackIn_54_2 = stackOut_52_2;
              break L18;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + 44 + param7 + 41);
        }
    }

    final static int a(String[] args, int param1, String param2, kg param3, byte param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        int stackIn_5_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var14 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param3.a(param2);
              if (param1 < var5_int) {
                break L1;
              } else {
                if (-1 == param2.indexOf("<br>")) {
                  args[0] = (String) (Object) args;
                  stackOut_4_0 = 1;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0;
                } else {
                  break L1;
                }
              }
            }
            var6 = (-1 + (var5_int + param1)) / param1;
            param1 = var5_int / var6;
            var6 = 0;
            var8 = 22 % ((5 - param4) / 58);
            var7 = 0;
            var9 = param2.length();
            var10 = 0;
            L2: while (true) {
              if (var10 >= var9) {
                L3: {
                  if (var7 < var9) {
                    int incrementValue$2 = var6;
                    var6++;
                    args[incrementValue$2] = param2.substring(var7, var9).trim();
                    break L3;
                  } else {
                    break L3;
                  }
                }
                stackOut_19_0 = var6;
                stackIn_20_0 = stackOut_19_0;
                break L0;
              } else {
                L4: {
                  L5: {
                    var11 = param2.charAt(var10);
                    if (var11 == 32) {
                      break L5;
                    } else {
                      if (var11 != 45) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var12 = param2.substring(var7, 1 + var10).trim();
                  var13 = param3.a(var12);
                  if (param1 > var13) {
                    break L4;
                  } else {
                    int incrementValue$3 = var6;
                    var6++;
                    args[incrementValue$3] = var12;
                    var7 = var10 - -1;
                    break L4;
                  }
                }
                L6: {
                  if (62 != var11) {
                    break L6;
                  } else {
                    break L6;
                  }
                }
                var10++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var5;
            stackOut_21_1 = new StringBuilder().append("vd.D(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (args == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          L8: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(44).append(param1).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          L9: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param3 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L9;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L9;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + param4 + 41);
        }
        return stackIn_20_0;
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        o var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        am var6_ref_am = null;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        Object var27 = null;
        hj var28 = null;
        RuntimeException decompiledCaughtException = null;
        var26 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var28 = nf.field_l;
              var2 = var28.d((byte) 114);
              if (var2 == 0) {
                var3 = var28.a((byte) -97);
                var4 = (o) (Object) mh.field_a.a((byte) -95);
                L2: while (true) {
                  L3: {
                    if (var4 == null) {
                      break L3;
                    } else {
                      if (var3 != var4.field_j) {
                        var4 = (o) (Object) mh.field_a.a(true);
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (var4 != null) {
                    L4: {
                      var5 = var28.d((byte) 53);
                      if (0 == var5) {
                        break L4;
                      } else {
                        var6 = var4.field_h;
                        od.field_l[0].field_a = null;
                        od.field_l[0].field_e = w.field_a;
                        od.field_l[0].field_c = false;
                        var7 = var4.field_n;
                        var8_int = 1;
                        L5: while (true) {
                          if (var5 <= var8_int) {
                            String[][] dupTemp$7 = new String[3][var6];
                            var4.field_m = dupTemp$7;
                            var8 = dupTemp$7;
                            var9 = new String[3][var6];
                            long[][] dupTemp$8 = new long[3][var6];
                            var4.field_g = dupTemp$8;
                            var10 = dupTemp$8;
                            int[][] dupTemp$9 = new int[3][var6 * var7];
                            var4.field_l = dupTemp$9;
                            var11 = dupTemp$9;
                            var12 = 0;
                            var13 = 0;
                            var14 = 0;
                            var15 = 0;
                            var16 = 0;
                            var17 = 0;
                            var18 = var28.d((byte) 41);
                            if (var18 <= 0) {
                              break L4;
                            } else {
                              var19 = 0;
                              L6: while (true) {
                                if (var19 >= var18) {
                                  break L4;
                                } else {
                                  L7: {
                                    var20 = var28.d((byte) 102);
                                    var21 = od.field_l[var20].field_e;
                                    var22 = var28.e((byte) 115);
                                    var24 = var28.field_h;
                                    if (var6 > var19) {
                                      var8[0][var12] = var21;
                                      var9[0][var12] = od.field_l[var20].field_a;
                                      var10[0][var12] = var22;
                                      var12++;
                                      var25 = 0;
                                      L8: while (true) {
                                        if (var7 <= var25) {
                                          break L7;
                                        } else {
                                          int incrementValue$10 = var15;
                                          var15++;
                                          var11[0][incrementValue$10] = var28.c((byte) -126);
                                          var25++;
                                          continue L8;
                                        }
                                      }
                                    } else {
                                      break L7;
                                    }
                                  }
                                  L9: {
                                    if (var21 == null) {
                                      break L9;
                                    } else {
                                      if (!qg.a(var21, (byte) 78)) {
                                        break L9;
                                      } else {
                                        var8[1][var13] = w.field_a;
                                        var9[1][var13] = null;
                                        var10[1][var13] = var22;
                                        var13++;
                                        var28.field_h = var24;
                                        var25 = 0;
                                        L10: while (true) {
                                          if (var25 >= var7) {
                                            break L9;
                                          } else {
                                            int incrementValue$11 = var16;
                                            var16++;
                                            var11[1][incrementValue$11] = var28.c((byte) -115);
                                            var25++;
                                            continue L10;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L11: {
                                    if (var6 <= var14) {
                                      break L11;
                                    } else {
                                      if (od.field_l[var20].field_c) {
                                        break L11;
                                      } else {
                                        od.field_l[var20].field_c = true;
                                        var8[2][var14] = var21;
                                        var9[2][var14] = od.field_l[var20].field_a;
                                        var10[2][var14] = var22;
                                        var14++;
                                        var28.field_h = var24;
                                        var25 = 0;
                                        L12: while (true) {
                                          if (var25 >= var7) {
                                            break L11;
                                          } else {
                                            int incrementValue$12 = var17;
                                            var17++;
                                            var11[2][incrementValue$12] = var28.c((byte) -110);
                                            var25++;
                                            continue L12;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var19++;
                                  continue L6;
                                }
                              }
                            }
                          } else {
                            L13: {
                              od.field_l[var8_int].field_e = var28.g(12248);
                              od.field_l[var8_int].field_c = false;
                              if (var28.d((byte) 72) == 1) {
                                od.field_l[var8_int].field_a = var28.g(12248);
                                break L13;
                              } else {
                                od.field_l[var8_int].field_a = null;
                                break L13;
                              }
                            }
                            var8_int++;
                            continue L5;
                          }
                        }
                      }
                    }
                    var4.field_k = true;
                    var4.c(5);
                    break L1;
                  } else {
                    pc.a(param0 ^ 17);
                    return;
                  }
                }
              } else {
                if (var2 == 1) {
                  var3 = var28.a((byte) -96);
                  var4_long = var28.e((byte) 110);
                  var6_ref_am = (am) (Object) ec.field_b.a((byte) -95);
                  L14: while (true) {
                    L15: {
                      if (var6_ref_am == null) {
                        break L15;
                      } else {
                        if (var3 == var6_ref_am.field_p) {
                          break L15;
                        } else {
                          var6_ref_am = (am) (Object) ec.field_b.a(true);
                          continue L14;
                        }
                      }
                    }
                    if (var6_ref_am != null) {
                      var6_ref_am.field_o = var4_long;
                      var6_ref_am.c(param0 + -11);
                      break L1;
                    } else {
                      pc.a(1);
                      return;
                    }
                  }
                } else {
                  d.a((Throwable) null, 94, "HS1: " + ik.q(48));
                  pc.a(1);
                  break L1;
                }
              }
            }
            L16: {
              if (param0 == 16) {
                break L16;
              } else {
                var27 = null;
                int discarded$13 = vd.a((String[]) null, 74, (String) null, (kg) null, (byte) 117);
                break L16;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var1, "vd.J(" + param0 + 41);
        }
    }

    public static void a(byte param0) {
        if (param0 >= -111) {
            field_h = null;
        }
        field_h = null;
    }

    final void a(int param0, kg param1) {
        RuntimeException var3 = null;
        ki var4 = null;
        ti[] var5 = null;
        ki var6 = null;
        int var7_int = 0;
        ki var7 = null;
        ki var8 = null;
        ti[] var9 = null;
        ti[] var10 = null;
        ki var11 = null;
        ki var12 = null;
        ti var13 = null;
        ki var14 = null;
        int var15 = 0;
        jf var16 = null;
        h var17 = null;
        jf var18 = null;
        ki var19 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var15 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var17 = new h(param1, 2, 2, 2236962, 1, 1, 1, 2 + (param1.field_t + param1.field_y));
            ((vd) this).field_q = (ui) (Object) var17;
            var17.field_f = 16777215;
            var4 = new ki();
            var17.a((byte) -106, (h) (Object) var4);
            ((vd) this).field_g = 15658734;
            var4.field_n = 15658734;
            ((vd) this).field_l = 3;
            ((vd) this).field_j = -1;
            ((vd) this).field_c = 3;
            ((vd) this).field_e = 3;
            ((vd) this).field_n = 5592405;
            ((vd) this).field_k = 15658734;
            var4.field_g = 11711154;
            ((vd) this).field_m = param1;
            ((vd) this).field_i = 3;
            ab discarded$10 = var4.a((byte) -21, 0).a(-108, 15658734).a(we.a(8947848, 124, 7829367, 10066329), (byte) 32);
            ab discarded$11 = var4.a((byte) -21, 1).a(we.a(11184810, 117, 13421772, 10066329), (byte) 32);
            ab discarded$12 = var4.a((byte) -21, 3).a(we.a(8947848, 112, 10066329, 7829367), (byte) 32).a(1, (byte) 112).a(1, false);
            var5 = new ti[9];
            if (param0 < -12) {
              var16 = new jf(32, 32);
              var18 = var16;
              var7_int = 0;
              L1: while (true) {
                if (var18.field_w.length <= var7_int) {
                  var5[4] = (ti) (Object) var18;
                  ab discarded$13 = var4.a((byte) -21, 4).a(true, 256).a(var5, (byte) 32);
                  ab discarded$14 = var4.a((byte) -21, 5).a(bh.a(65793, -118, 0, 0, 0), (byte) 32).a(true, 256).a(-116, -1);
                  ((vd) this).field_d = (ui) (Object) var4;
                  var6 = new ki(var4, true);
                  var6.field_b = 0;
                  var7 = new ki(var4, true);
                  var7.field_b = 0;
                  var7.a(qa.a(68, 8947848), -114);
                  ab discarded$15 = var7.a((byte) -21, 1).a(qa.a(64, 11184810), (byte) 32).a(-81, 2236962);
                  ((vd) this).field_b = (ui) (Object) new wi(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924);
                  pa discarded$16 = new pa(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
                  ij discarded$17 = new ij(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
                  var8 = new ki();
                  var17.a((byte) -106, (h) (Object) var8);
                  ab discarded$18 = var8.a((byte) -21, 0).a(we.a(15658734, 116, 10066329, 7829367), (byte) 32).a(-62, 1118481).b(-1, (byte) -102);
                  ab discarded$19 = var8.a((byte) -21, 4).a(true, 256).a(var5, (byte) 32);
                  ((vd) this).field_f = (ui) (Object) var8;
                  var9 = new ti[9];
                  var10 = new ti[9];
                  var9[4] = new ti(2, 1);
                  var10[4] = new ti(1, 2);
                  var9[4].field_w = new int[]{6710886, 7829367};
                  var10[4].field_w = new int[]{6710886, 7829367};
                  var11 = new ki();
                  var12 = new ki();
                  var11.a(0, -19106, var9);
                  var12.a(0, -19106, var10);
                  var13 = new ti(7, 4);
                  var13.field_w = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
                  var14 = new ki(var4, true);
                  var14.a(var13.a(), 1);
                  var13.f();
                  var14 = new ki(var4, true);
                  var14.a(var13.a(), 1);
                  var13.f();
                  var14 = new ki(var4, true);
                  var14.a(var13.a(), 1);
                  var13.f();
                  var19 = new ki(var4, true);
                  var19.a(var13, 1);
                  break L0;
                } else {
                  var16.field_w[var7_int] = 1077952576;
                  var7_int++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("vd.I(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    final void a(int param0, int param1, String param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (!((vd) this).field_p) {
                this.a((byte) 89, param3, param2, param0);
                break L1;
              } else {
                this.a(param0, (byte) 125, param3, param2);
                break L1;
              }
            }
            L2: {
              if (param1 >= 6) {
                break L2;
              } else {
                ((vd) this).field_f = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("vd.C(").append(param0).append(44).append(param1).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param3 + 41);
        }
    }

    private final void a(int param0, byte param1, int param2, String param3) {
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
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var15 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = ((vd) this).field_c - -((vd) this).field_i;
              var6 = ((vd) this).field_e + ((vd) this).field_l;
              var7 = ((vd) this).field_j;
              if (var7 == -1) {
                var7 = ((vd) this).field_m.field_t + ((vd) this).field_m.field_y;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 > 119) {
                break L2;
              } else {
                vd.a(-109);
                break L2;
              }
            }
            L3: {
              L4: {
                var8 = sb.field_c >> 2;
                var9 = ((vd) this).field_m.a(param3);
                var10 = ((vd) this).field_m.field_t + ((vd) this).field_m.field_y;
                var11 = 1;
                if (var9 > var8) {
                  break L4;
                } else {
                  if (param3.indexOf("<br>") != -1) {
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              L5: {
                if (oi.field_l == null) {
                  oi.field_l = new String[16];
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (var8 >= var9) {
                  var12 = var8;
                  break L6;
                } else {
                  var13 = var9 / var8;
                  var12 = 2 * ((var9 % var8 - -var13 - 1) / var13) + var8;
                  break L6;
                }
              }
              var11 = ((vd) this).field_m.a(param3, new int[1], oi.field_l);
              var10 = var10 + (-1 + var11) * var7;
              var9 = 0;
              var13 = 0;
              L7: while (true) {
                if (var11 <= var13) {
                  break L3;
                } else {
                  L8: {
                    var14 = ((vd) this).field_m.a(oi.field_l[var13]);
                    if (var9 >= var14) {
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  var13++;
                  continue L7;
                }
              }
            }
            L9: {
              var12 = param2;
              if (var5_int + var12 - -var9 > sb.field_c) {
                var12 = sb.field_c + -var9 - var5_int;
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              var13 = 32 + (-((vd) this).field_m.field_D + param0);
              if (var13 - -var10 + var6 <= sb.field_g) {
                break L10;
              } else {
                var13 = param0 + -var10 - var6;
                break L10;
              }
            }
            sb.d(var12, var13, var9 - -var5_int, var6 + var10, ((vd) this).field_g);
            sb.a(1 + var12, var13 + 1, var9 - (-var5_int + 2), var10 - -var6 + -2, ((vd) this).field_n);
            int discarded$1 = ((vd) this).field_m.a(param3, var12 - -((vd) this).field_c, ((vd) this).field_l + var13, var9, var10, ((vd) this).field_k, -1, 0, 0, var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var5 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var5;
            stackOut_27_1 = new StringBuilder().append("vd.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param3 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L11;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L11;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 41);
        }
    }

    private final void a(byte param0, int param1, String param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              var5_int = ((vd) this).field_m.a(param2);
              var6 = ((vd) this).field_m.field_D + ((vd) this).field_m.field_t;
              var7 = param1;
              if (var5_int + (var7 + 6) <= sb.field_c) {
                break L1;
              } else {
                var7 = sb.field_c - var5_int + -6;
                break L1;
              }
            }
            L2: {
              var8 = 32 + -((vd) this).field_m.field_D + param3;
              if (var8 - (-var6 + -6) <= sb.field_g) {
                break L2;
              } else {
                var8 = -6 + -var6 + sb.field_g;
                break L2;
              }
            }
            L3: {
              sb.d(var7, var8, var5_int - -6, var6 - -6, ((vd) this).field_k);
              sb.a(1 + var7, var8 + 1, 4 + var5_int, 4 + var6, ((vd) this).field_n);
              if (param0 == 89) {
                break L3;
              } else {
                vd.a((byte) -12);
                break L3;
              }
            }
            ((vd) this).field_m.b(param2, var7 - -3, ((vd) this).field_m.field_D + 3 + var8, ((vd) this).field_k, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("vd.B(").append(param0).append(44).append(param1).append(44);
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
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param3 + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, byte param5) {
        if (param5 != 119) {
            ((vd) this).field_l = -85;
        }
        sb.e(param0, param3, param4, param2, param1);
    }

    public vd() {
        ((vd) this).field_p = true;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param6 != 4) {
            ((vd) this).field_g = 23;
        }
        sb.c(param3, param1, param2, param5, param4, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
    }
}
