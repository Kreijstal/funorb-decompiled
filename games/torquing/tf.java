/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf {
    static String field_a;
    static double field_c;
    static String field_b;

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
        fj var16 = null;
        fj var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        int stackIn_31_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_46_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_45_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        var15 = Torquing.field_u;
        try {
          L0: {
            var16 = new fj(param1);
            var17 = var16;
            var17.field_n = -2 + param1.length;
            ti.field_g = var17.i(7088);
            fq.field_G = new byte[ti.field_g][];
            fj.field_o = new int[ti.field_g];
            ij.field_o = new int[ti.field_g];
            pn.field_b = new byte[ti.field_g][];
            na.field_G = new int[ti.field_g];
            lp.field_e = new boolean[ti.field_g];
            vo.field_b = new int[ti.field_g];
            var17.field_n = -(8 * ti.field_g) + -7 + param1.length;
            fm.field_E = var17.i(7088);
            rh.field_d = var17.i(7088);
            var3 = (255 & var17.i((byte) -101)) + 1;
            if (param0 >= 101) {
              var4 = 0;
              L1: while (true) {
                if (ti.field_g <= var4) {
                  var4 = 0;
                  L2: while (true) {
                    if (var4 >= ti.field_g) {
                      var4 = 0;
                      L3: while (true) {
                        if (ti.field_g <= var4) {
                          var4 = 0;
                          L4: while (true) {
                            if (ti.field_g <= var4) {
                              var17.field_n = param1.length - (7 - -(ti.field_g * 8) + 3 * (-1 + var3));
                              cq.field_y = new int[var3];
                              var4 = 1;
                              L5: while (true) {
                                if (var4 >= var3) {
                                  var17.field_n = 0;
                                  var4 = 0;
                                  L6: while (true) {
                                    if (ti.field_g <= var4) {
                                      break L0;
                                    } else {
                                      L7: {
                                        var5 = vo.field_b[var4];
                                        var6 = ij.field_o[var4];
                                        var7 = var6 * var5;
                                        var24 = new byte[var7];
                                        var22 = var24;
                                        var20 = var22;
                                        var18 = var20;
                                        var8 = var18;
                                        pn.field_b[var4] = var24;
                                        var25 = new byte[var7];
                                        var23 = var25;
                                        var21 = var23;
                                        var19 = var21;
                                        var9 = var19;
                                        fq.field_G[var4] = var25;
                                        var10 = 0;
                                        var11 = var17.i((byte) -101);
                                        if ((1 & var11) != 0) {
                                          var12 = 0;
                                          L8: while (true) {
                                            if (var5 <= var12) {
                                              if (0 == (var11 & 2)) {
                                                break L7;
                                              } else {
                                                var12 = 0;
                                                L9: while (true) {
                                                  if (var12 >= var5) {
                                                    break L7;
                                                  } else {
                                                    var13 = 0;
                                                    L10: while (true) {
                                                      if (var6 <= var13) {
                                                        var12++;
                                                        continue L9;
                                                      } else {
                                                        L11: {
                                                          byte dupTemp$2 = var17.f((byte) 61);
                                                          var9[var5 * var13 + var12] = dupTemp$2;
                                                          var14 = dupTemp$2;
                                                          stackOut_45_0 = var10;
                                                          stackIn_47_0 = stackOut_45_0;
                                                          stackIn_46_0 = stackOut_45_0;
                                                          if (var14 == -1) {
                                                            stackOut_47_0 = stackIn_47_0;
                                                            stackOut_47_1 = 0;
                                                            stackIn_48_0 = stackOut_47_0;
                                                            stackIn_48_1 = stackOut_47_1;
                                                            break L11;
                                                          } else {
                                                            stackOut_46_0 = stackIn_46_0;
                                                            stackOut_46_1 = 1;
                                                            stackIn_48_0 = stackOut_46_0;
                                                            stackIn_48_1 = stackOut_46_1;
                                                            break L11;
                                                          }
                                                        }
                                                        var10 = stackIn_48_0 | stackIn_48_1;
                                                        var13++;
                                                        continue L10;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              var13 = 0;
                                              L12: while (true) {
                                                if (var13 >= var6) {
                                                  var12++;
                                                  continue L8;
                                                } else {
                                                  var8[var5 * var13 + var12] = var17.f((byte) 103);
                                                  var13++;
                                                  continue L12;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          var12 = 0;
                                          L13: while (true) {
                                            if (var7 <= var12) {
                                              if ((2 & var11) == 0) {
                                                break L7;
                                              } else {
                                                var12 = 0;
                                                L14: while (true) {
                                                  if (var12 >= var7) {
                                                    break L7;
                                                  } else {
                                                    L15: {
                                                      byte dupTemp$3 = var17.f((byte) 80);
                                                      var9[var12] = dupTemp$3;
                                                      var13 = dupTemp$3;
                                                      stackOut_30_0 = var10;
                                                      stackIn_32_0 = stackOut_30_0;
                                                      stackIn_31_0 = stackOut_30_0;
                                                      if (var13 == -1) {
                                                        stackOut_32_0 = stackIn_32_0;
                                                        stackOut_32_1 = 0;
                                                        stackIn_33_0 = stackOut_32_0;
                                                        stackIn_33_1 = stackOut_32_1;
                                                        break L15;
                                                      } else {
                                                        stackOut_31_0 = stackIn_31_0;
                                                        stackOut_31_1 = 1;
                                                        stackIn_33_0 = stackOut_31_0;
                                                        stackIn_33_1 = stackOut_31_1;
                                                        break L15;
                                                      }
                                                    }
                                                    var10 = stackIn_33_0 | stackIn_33_1;
                                                    var12++;
                                                    continue L14;
                                                  }
                                                }
                                              }
                                            } else {
                                              var8[var12] = var17.f((byte) 88);
                                              var12++;
                                              continue L13;
                                            }
                                          }
                                        }
                                      }
                                      lp.field_e[var4] = var10 != 0;
                                      var4++;
                                      continue L6;
                                    }
                                  }
                                } else {
                                  L16: {
                                    cq.field_y[var4] = var17.e((byte) 62);
                                    if (cq.field_y[var4] == 0) {
                                      cq.field_y[var4] = 1;
                                      break L16;
                                    } else {
                                      break L16;
                                    }
                                  }
                                  var4++;
                                  continue L5;
                                }
                              }
                            } else {
                              ij.field_o[var4] = var17.i(7088);
                              var4++;
                              continue L4;
                            }
                          }
                        } else {
                          vo.field_b[var4] = var17.i(7088);
                          var4++;
                          continue L3;
                        }
                      }
                    } else {
                      na.field_G[var4] = var17.i(7088);
                      var4++;
                      continue L2;
                    }
                  }
                } else {
                  fj.field_o[var4] = var16.i(7088);
                  var4++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var2 = decompiledCaughtException;
            stackOut_52_0 = (RuntimeException) var2;
            stackOut_52_1 = new StringBuilder().append("tf.C(").append(param0).append(44);
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param1 == null) {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L17;
            } else {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L17;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_55_0, stackIn_55_2 + 41);
        }
    }

    final static String a(boolean param0, int param1, boolean param2, boolean param3) {
        int var4 = param1;
        if (!(!param0)) {
            var4 += 2;
        }
        if (param2) {
            var4++;
        }
        return n.field_s[var4];
    }

    final static void a(int param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
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
            if (param0 < -44) {
              L1: {
                og.a((java.awt.Component) (Object) param1, -1);
                qk.a(-90, (java.awt.Component) (Object) param1);
                if (null != wb.field_u) {
                  wb.field_u.a(0, (java.awt.Component) (Object) param1);
                  break L1;
                } else {
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("tf.B(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Waiting for music";
        field_b = "Visit the Account Management section on the main site to view.";
    }
}
