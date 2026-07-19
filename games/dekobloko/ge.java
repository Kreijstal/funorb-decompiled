/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ge {
    static int field_e;
    static s field_f;
    static String field_d;
    static boolean field_j;
    static ck field_h;
    static ij field_g;
    static int field_b;
    static volatile int field_a;
    static volatile boolean field_i;
    static boolean field_c;

    final static int a(lk param0, int param1) {
        int discarded$2 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        lk var7 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var6 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                var2_int = 0;
                var3 = 10000 / param0.field_O;
                if (param1 > 14) {
                  break L1;
                } else {
                  var7 = (lk) null;
                  discarded$2 = ge.a((lk) null, 96);
                  break L1;
                }
              }
              var4 = param0.field_z;
              L2: while (true) {
                L3: {
                  L4: {
                    if (param0.field_a <= var4) {
                      break L4;
                    } else {
                      stackOut_8_0 = 0;
                      stackIn_18_0 = stackOut_8_0;
                      stackIn_9_0 = stackOut_8_0;
                      if (var6 != 0) {
                        break L3;
                      } else {
                        var5 = stackIn_9_0;
                        L5: while (true) {
                          L6: {
                            L7: {
                              if (param0.field_O <= var5) {
                                break L7;
                              } else {
                                stackOut_11_0 = -1;
                                stackOut_11_1 = param0.field_P[var4 * param0.field_O - -var5] ^ -1;
                                stackIn_16_0 = stackOut_11_0;
                                stackIn_16_1 = stackOut_11_1;
                                stackIn_12_0 = stackOut_11_0;
                                stackIn_12_1 = stackOut_11_1;
                                if (var6 != 0) {
                                  break L6;
                                } else {
                                  L8: {
                                    if (stackIn_12_0 == stackIn_12_1) {
                                      break L8;
                                    } else {
                                      var2_int = var2_int + var3;
                                      break L8;
                                    }
                                  }
                                  var5++;
                                  if (var6 == 0) {
                                    continue L5;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                            stackOut_15_0 = var3 * 3;
                            stackOut_15_1 = 4;
                            stackIn_16_0 = stackOut_15_0;
                            stackIn_16_1 = stackOut_15_1;
                            break L6;
                          }
                          var3 = stackIn_16_0 / stackIn_16_1;
                          var4++;
                          if (var6 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  var2_int = var2_int + var3 * param0.field_O;
                  var4 = 0;
                  stackOut_17_0 = -5001;
                  stackIn_18_0 = stackOut_17_0;
                  break L3;
                }
                L9: {
                  if (stackIn_18_0 < (var2_int ^ -1)) {
                    break L9;
                  } else {
                    var4 = 1;
                    break L9;
                  }
                }
                L10: {
                  if (-20001 < (var2_int ^ -1)) {
                    break L10;
                  } else {
                    var4 = 2;
                    break L10;
                  }
                }
                stackOut_22_0 = var4;
                stackIn_23_0 = stackOut_22_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var2);
            stackOut_24_1 = new StringBuilder().append("ge.E(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L11;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L11;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_23_0;
        }
    }

    final static jg b(byte param0) {
        String var1 = null;
        L0: {
          var1 = aa.a(param0 + 35);
          if (var1 == null) {
            break L0;
          } else {
            if (-1 < (var1.indexOf('@') ^ -1)) {
              break L0;
            } else {
              var1 = "";
              break L0;
            }
          }
        }
        if (param0 != -89) {
          field_b = 0;
          return new jg(aa.a(-65), uk.c((byte) -17));
        } else {
          return new jg(aa.a(-65), uk.c((byte) -17));
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        if (!param0) {
            return;
        }
        field_f = null;
        field_h = null;
        field_g = null;
    }

    final static ni a(byte param0, int param1, int param2, pi[] param3, byte[] param4, int param5) {
        byte[] array$2 = null;
        int incrementValue$3 = 0;
        RuntimeException var6 = null;
        int[] var6_array = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        byte[][] var12 = null;
        int var14 = 0;
        int var15 = 0;
        int var17_int = 0;
        ni var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var28 = 0;
        int[] var29 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        byte[][] var35 = null;
        int[] var38 = null;
        int[] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        byte[][] var42 = null;
        int[] var46 = null;
        int[] var47 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        byte stackIn_13_1 = 0;
        int stackIn_18_0 = 0;
        ni stackIn_29_0 = null;
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
        int stackOut_4_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_12_0 = 0;
        byte stackOut_12_1 = 0;
        int stackOut_25_0 = 0;
        ni stackOut_28_0 = null;
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
        var28 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (256 == param3.length) {
              var40 = new int[256];
              var33 = var40;
              var29 = var33;
              var6_array = var29;
              var41 = new int[256];
              var34 = var41;
              var7 = var34;
              var38 = new int[256];
              var31 = var38;
              var8 = var31;
              var39 = new int[256];
              var32 = var39;
              var9 = var32;
              var11 = -2 / ((48 - param0) / 43);
              var10 = new int[]{0, param1, param5};
              var42 = new byte[256][];
              var35 = var42;
              var12 = var35;
              var47 = hk.field_l;
              var14 = hk.field_j;
              var15 = hk.field_i;
              var46 = new int[4];
              hk.b(var46);
              var17_int = 0;
              L1: while (true) {
                stackOut_4_0 = -257;
                stackIn_5_0 = stackOut_4_0;
                L2: while (true) {
                  L3: {
                    if (stackIn_5_0 >= (var17_int ^ -1)) {
                      break L3;
                    } else {
                      var29[var17_int] = param3[var17_int].field_d + -param2;
                      var7[var17_int] = param3[var17_int].field_c + -param2;
                      var8[var17_int] = (param2 << 435946913) + param3[var17_int].field_b;
                      var9[var17_int] = param3[var17_int].field_i + (param2 << -894393727);
                      array$2 = new byte[var38[var17_int] * var39[var17_int]];
                      var12[var17_int] = array$2;
                      var18 = array$2;
                      var19 = param3[var17_int].field_k;
                      var20 = param3[var17_int].field_b;
                      var21 = param3[var17_int].field_i;
                      var22 = var38[var17_int];
                      var23 = var22 + -var20;
                      hk.a(new int[var39[var17_int] * var38[var17_int]], var38[var17_int], var39[var17_int]);
                      var24 = 0;
                      var25 = 0;
                      L4: while (true) {
                        stackOut_7_0 = var25;
                        stackOut_7_1 = var21;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        L5: while (true) {
                          L6: {
                            if (stackIn_8_0 >= stackIn_8_1) {
                              var24 = 0;
                              stackOut_17_0 = 0;
                              stackIn_18_0 = stackOut_17_0;
                              break L6;
                            } else {
                              stackOut_9_0 = 0;
                              stackIn_18_0 = stackOut_9_0;
                              stackIn_10_0 = stackOut_9_0;
                              if (var28 != 0) {
                                break L6;
                              } else {
                                var26 = stackIn_10_0;
                                L7: while (true) {
                                  if (var20 <= var26) {
                                    var25++;
                                    continue L4;
                                  } else {
                                    incrementValue$3 = var24;
                                    var24++;
                                    stackOut_12_0 = 0;
                                    stackOut_12_1 = var19[incrementValue$3];
                                    stackIn_8_0 = stackOut_12_0;
                                    stackIn_8_1 = stackOut_12_1;
                                    stackIn_13_0 = stackOut_12_0;
                                    stackIn_13_1 = stackOut_12_1;
                                    if (var28 != 0) {
                                      continue L5;
                                    } else {
                                      L8: {
                                        if (stackIn_13_0 == stackIn_13_1) {
                                          break L8;
                                        } else {
                                          hk.a(var26, var25, (param2 << 1731923329) + 1, (param2 << -1375208415) + 1, 2);
                                          break L8;
                                        }
                                      }
                                      var26++;
                                      continue L7;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var25 = stackIn_18_0;
                          L9: while (true) {
                            L10: {
                              L11: {
                                if (var18.length <= var25) {
                                  break L11;
                                } else {
                                  var18[var25] = (byte)hk.field_l[var25];
                                  var25++;
                                  if (var28 != 0) {
                                    break L10;
                                  } else {
                                    if (var28 == 0) {
                                      continue L9;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                              }
                              var25 = (1 + var38[var17_int]) * param2;
                              break L10;
                            }
                            var26 = 0;
                            if (var26 >= var21) {
                              var17_int++;
                              if (var28 == 0) {
                                continue L1;
                              } else {
                                break L3;
                              }
                            } else {
                              stackOut_25_0 = 0;
                              stackIn_5_0 = stackOut_25_0;
                              continue L2;
                            }
                          }
                        }
                      }
                    }
                  }
                  var17 = new ni(param4, var40, var41, var38, var39, var10, var42);
                  var17.field_C = var17.field_C - param2;
                  var17.field_K = var17.field_K - param2;
                  var17.field_R = var17.field_R - param2;
                  hk.a(var47, var14, var15);
                  hk.a(var46);
                  stackOut_28_0 = (ni) (var17);
                  stackIn_29_0 = stackOut_28_0;
                  break L0;
                }
              }
            } else {
              throw new IllegalArgumentException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var6 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) (var6);
            stackOut_30_1 = new StringBuilder().append("ge.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param3 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L12;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L12;
            }
          }
          L13: {
            stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
            stackOut_33_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param4 == null) {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L13;
            } else {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L13;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ',' + param5 + ')');
        }
        return stackIn_29_0;
    }

    final static void a(int param0, int param1, byte param2, ud param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ai.a(80, 0, param3, param0, param1);
              if (param2 == 127) {
                break L1;
              } else {
                ge.a((byte) 73);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("ge.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param3 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final static void a(byte param0) {
        pn.field_bb = new String[qb.field_u];
        pn.field_bb[18] = gg.field_E;
        pn.field_bb[17] = ue.field_d;
        pn.field_bb[5] = cc.field_b;
        pn.field_bb[4] = im.field_d;
        pn.field_bb[9] = gb.field_Tb;
        pn.field_bb[15] = ml.field_d;
        pn.field_bb[21] = cb.field_d;
        pn.field_bb[11] = km.field_y;
        pn.field_bb[7] = gh.field_d;
        pn.field_bb[20] = hd.field_v;
        pn.field_bb[19] = wk.field_k;
        pn.field_bb[6] = jd.field_Zb;
        pn.field_bb[13] = vh.field_c;
        if (param0 != 123) {
          field_e = 114;
          pn.field_bb[16] = uj.field_e;
          return;
        } else {
          pn.field_bb[16] = uj.field_e;
          return;
        }
    }

    final static void a(byte param0, jk param1) {
        ni discarded$0 = null;
        try {
            if (param0 > -65) {
                byte[] var3 = (byte[]) null;
                discarded$0 = ge.a((byte) -116, -89, -66, (pi[]) null, (byte[]) null, 119);
            }
            me.field_z = param1;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "ge.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_j = false;
        field_d = "Invalid name";
        field_g = new ij("usename");
        field_a = 0;
        field_i = true;
    }
}
