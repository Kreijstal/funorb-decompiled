/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb {
    static String field_c;
    static oj field_b;
    static String field_a;

    final static void a(int param0, byte[] param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        ka var16 = null;
        ka var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        int stackIn_34_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_46_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_45_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        var15 = stellarshard.field_B;
        try {
          L0: {
            var16 = new ka(param1);
            var17 = var16;
            var17.field_k = -2 + param1.length;
            sb.field_b = var17.c((byte) 40);
            ih.field_d = new int[sb.field_b];
            ih.field_b = new byte[sb.field_b][];
            vc.field_b = new int[sb.field_b];
            lj.field_D = new byte[sb.field_b][];
            ak.field_c = new int[sb.field_b];
            sk.field_c = new boolean[sb.field_b];
            vi.field_c = new int[sb.field_b];
            var17.field_k = param1.length + (-7 - sb.field_b * 8);
            nc.field_G = var17.c((byte) 86);
            wd.field_b = var17.c((byte) 39);
            var3 = 1 + (var17.f(4) & 255);
            var4 = 0;
            L1: while (true) {
              if (sb.field_b <= var4) {
                var4 = 0;
                L2: while (true) {
                  if (sb.field_b <= var4) {
                    var4 = 0;
                    L3: while (true) {
                      if (sb.field_b <= var4) {
                        var4 = 0;
                        L4: while (true) {
                          if (var4 >= sb.field_b) {
                            var17.field_k = -(3 * (-1 + var3)) + param1.length + (-7 + -(sb.field_b * 8));
                            gj.field_w = new int[var3];
                            var4 = 1;
                            L5: while (true) {
                              if (var3 <= var4) {
                                var17.field_k = param0;
                                var4 = 0;
                                L6: while (true) {
                                  if (sb.field_b <= var4) {
                                    break L0;
                                  } else {
                                    L7: {
                                      var5 = vc.field_b[var4];
                                      var6 = ih.field_d[var4];
                                      var7 = var6 * var5;
                                      var24 = new byte[var7];
                                      var22 = var24;
                                      var20 = var22;
                                      var18 = var20;
                                      var8 = var18;
                                      ih.field_b[var4] = var24;
                                      var25 = new byte[var7];
                                      var23 = var25;
                                      var21 = var23;
                                      var19 = var21;
                                      var9 = var19;
                                      lj.field_D[var4] = var25;
                                      var10 = 0;
                                      var11 = var17.f(4);
                                      if (0 == (1 & var11)) {
                                        var12 = 0;
                                        L8: while (true) {
                                          if (var12 >= var7) {
                                            if ((2 & var11) != 0) {
                                              var12 = 0;
                                              L9: while (true) {
                                                if (var7 <= var12) {
                                                  break L7;
                                                } else {
                                                  L10: {
                                                    byte dupTemp$2 = var17.g(-81);
                                                    var9[var12] = dupTemp$2;
                                                    var13 = dupTemp$2;
                                                    stackOut_45_0 = var10;
                                                    stackIn_47_0 = stackOut_45_0;
                                                    stackIn_46_0 = stackOut_45_0;
                                                    if (var13 == -1) {
                                                      stackOut_47_0 = stackIn_47_0;
                                                      stackOut_47_1 = 0;
                                                      stackIn_48_0 = stackOut_47_0;
                                                      stackIn_48_1 = stackOut_47_1;
                                                      break L10;
                                                    } else {
                                                      stackOut_46_0 = stackIn_46_0;
                                                      stackOut_46_1 = 1;
                                                      stackIn_48_0 = stackOut_46_0;
                                                      stackIn_48_1 = stackOut_46_1;
                                                      break L10;
                                                    }
                                                  }
                                                  var10 = stackIn_48_0 | stackIn_48_1;
                                                  var12++;
                                                  continue L9;
                                                }
                                              }
                                            } else {
                                              break L7;
                                            }
                                          } else {
                                            var8[var12] = var17.g(110);
                                            var12++;
                                            continue L8;
                                          }
                                        }
                                      } else {
                                        var12 = 0;
                                        L11: while (true) {
                                          if (var5 <= var12) {
                                            if ((2 & var11) != 0) {
                                              var12 = 0;
                                              L12: while (true) {
                                                if (var12 >= var5) {
                                                  break L7;
                                                } else {
                                                  var13 = 0;
                                                  L13: while (true) {
                                                    if (var13 >= var6) {
                                                      var12++;
                                                      continue L12;
                                                    } else {
                                                      L14: {
                                                        byte dupTemp$3 = var17.g(ih.a(param0, 102));
                                                        var9[var12 + var13 * var5] = dupTemp$3;
                                                        var14 = dupTemp$3;
                                                        stackOut_33_0 = var10;
                                                        stackIn_35_0 = stackOut_33_0;
                                                        stackIn_34_0 = stackOut_33_0;
                                                        if (var14 == -1) {
                                                          stackOut_35_0 = stackIn_35_0;
                                                          stackOut_35_1 = 0;
                                                          stackIn_36_0 = stackOut_35_0;
                                                          stackIn_36_1 = stackOut_35_1;
                                                          break L14;
                                                        } else {
                                                          stackOut_34_0 = stackIn_34_0;
                                                          stackOut_34_1 = 1;
                                                          stackIn_36_0 = stackOut_34_0;
                                                          stackIn_36_1 = stackOut_34_1;
                                                          break L14;
                                                        }
                                                      }
                                                      var10 = stackIn_36_0 | stackIn_36_1;
                                                      var13++;
                                                      continue L13;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              break L7;
                                            }
                                          } else {
                                            var13 = 0;
                                            L15: while (true) {
                                              if (var13 >= var6) {
                                                var12++;
                                                continue L11;
                                              } else {
                                                var8[var13 * var5 + var12] = var17.g(-62);
                                                var13++;
                                                continue L15;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    sk.field_c[var4] = var10 != 0;
                                    var4++;
                                    continue L6;
                                  }
                                }
                              } else {
                                L16: {
                                  gj.field_w[var4] = var17.c(true);
                                  if (gj.field_w[var4] != 0) {
                                    break L16;
                                  } else {
                                    gj.field_w[var4] = 1;
                                    break L16;
                                  }
                                }
                                var4++;
                                continue L5;
                              }
                            }
                          } else {
                            ih.field_d[var4] = var17.c((byte) 83);
                            var4++;
                            continue L4;
                          }
                        }
                      } else {
                        vc.field_b[var4] = var17.c((byte) 30);
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    vi.field_c[var4] = var17.c((byte) 95);
                    var4++;
                    continue L2;
                  }
                }
              } else {
                ak.field_c[var4] = var16.c((byte) 30);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var2 = decompiledCaughtException;
            stackOut_51_0 = (RuntimeException) var2;
            stackOut_51_1 = new StringBuilder().append("mb.A(").append(param0).append(44);
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param1 == null) {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L17;
            } else {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "{...}";
              stackIn_54_0 = stackOut_52_0;
              stackIn_54_1 = stackOut_52_1;
              stackIn_54_2 = stackOut_52_2;
              break L17;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + 41);
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        field_a = null;
        field_c = null;
    }

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param1 >= 108) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            L2: {
              L3: {
                param2 = ci.a(param2, '_', "", 2619);
                var3 = la.a(param2, (byte) 79);
                if (param0.indexOf(param2) != -1) {
                  break L3;
                } else {
                  if (-1 == param0.indexOf(var3)) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("mb.C(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
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
          L5: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_7_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Waiting for fonts";
        field_b = new oj();
        field_a = "Account created successfully!";
    }
}
