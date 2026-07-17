/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg extends ms {
    boolean field_o;
    static an field_l;
    int field_k;
    static String field_n;
    int[] field_m;

    public static void c(boolean param0) {
        field_n = null;
        field_l = null;
        if (param0) {
            field_n = null;
        }
    }

    eg() {
        ((eg) this).field_o = false;
    }

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
        fs var16 = null;
        fs var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_44_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        var15 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var16 = new fs(param1);
            var17 = var16;
            var17.field_p = -2 + param1.length;
            rl.field_n = var17.a(255);
            vg.field_k = new int[rl.field_n];
            we.field_B = new int[rl.field_n];
            og.field_d = new boolean[rl.field_n];
            ag.field_d = new byte[rl.field_n][];
            av.field_C = new int[rl.field_n];
            er.field_h = new int[rl.field_n];
            fl.field_o = new byte[rl.field_n][];
            var17.field_p = -(rl.field_n * 8) + -7 + param1.length;
            vf.field_d = var17.a(param0);
            li.field_u = var17.a(255);
            var3 = 1 + (var17.e(param0 + -31557) & 255);
            var4 = 0;
            L1: while (true) {
              if (var4 >= rl.field_n) {
                var4 = 0;
                L2: while (true) {
                  if (rl.field_n <= var4) {
                    var4 = 0;
                    L3: while (true) {
                      if (rl.field_n <= var4) {
                        var4 = 0;
                        L4: while (true) {
                          if (var4 >= rl.field_n) {
                            var17.field_p = -(8 * rl.field_n) + (-7 + param1.length + -((-1 + var3) * 3));
                            iv.field_l = new int[var3];
                            var4 = 1;
                            L5: while (true) {
                              if (var3 <= var4) {
                                var17.field_p = 0;
                                var4 = 0;
                                L6: while (true) {
                                  if (var4 >= rl.field_n) {
                                    break L0;
                                  } else {
                                    L7: {
                                      var5 = vg.field_k[var4];
                                      var6 = we.field_B[var4];
                                      var7 = var6 * var5;
                                      var24 = new byte[var7];
                                      var22 = var24;
                                      var20 = var22;
                                      var18 = var20;
                                      var8 = var18;
                                      ag.field_d[var4] = var24;
                                      var25 = new byte[var7];
                                      var23 = var25;
                                      var21 = var23;
                                      var19 = var21;
                                      var9 = var19;
                                      fl.field_o[var4] = var25;
                                      var10 = 0;
                                      var11 = var17.e(param0 + -31557);
                                      if ((var11 & 1) != 0) {
                                        var12 = 0;
                                        L8: while (true) {
                                          if (var5 <= var12) {
                                            if ((2 & var11) != 0) {
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
                                                        byte dupTemp$2 = var17.d(true);
                                                        var9[var5 * var13 + var12] = dupTemp$2;
                                                        var14 = dupTemp$2;
                                                        stackOut_44_0 = var10;
                                                        stackIn_46_0 = stackOut_44_0;
                                                        stackIn_45_0 = stackOut_44_0;
                                                        if (-1 == var14) {
                                                          stackOut_46_0 = stackIn_46_0;
                                                          stackOut_46_1 = 0;
                                                          stackIn_47_0 = stackOut_46_0;
                                                          stackIn_47_1 = stackOut_46_1;
                                                          break L11;
                                                        } else {
                                                          stackOut_45_0 = stackIn_45_0;
                                                          stackOut_45_1 = 1;
                                                          stackIn_47_0 = stackOut_45_0;
                                                          stackIn_47_1 = stackOut_45_1;
                                                          break L11;
                                                        }
                                                      }
                                                      var10 = stackIn_47_0 | stackIn_47_1;
                                                      var13++;
                                                      continue L10;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              break L7;
                                            }
                                          } else {
                                            var13 = 0;
                                            L12: while (true) {
                                              if (var6 <= var13) {
                                                var12++;
                                                continue L8;
                                              } else {
                                                var8[var12 + var5 * var13] = var17.d(true);
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
                                            if (0 != (2 & var11)) {
                                              var12 = 0;
                                              L14: while (true) {
                                                if (var7 <= var12) {
                                                  break L7;
                                                } else {
                                                  L15: {
                                                    byte dupTemp$3 = var17.d(true);
                                                    var9[var12] = dupTemp$3;
                                                    var13 = dupTemp$3;
                                                    stackOut_28_0 = var10;
                                                    stackIn_30_0 = stackOut_28_0;
                                                    stackIn_29_0 = stackOut_28_0;
                                                    if (var13 == -1) {
                                                      stackOut_30_0 = stackIn_30_0;
                                                      stackOut_30_1 = 0;
                                                      stackIn_31_0 = stackOut_30_0;
                                                      stackIn_31_1 = stackOut_30_1;
                                                      break L15;
                                                    } else {
                                                      stackOut_29_0 = stackIn_29_0;
                                                      stackOut_29_1 = 1;
                                                      stackIn_31_0 = stackOut_29_0;
                                                      stackIn_31_1 = stackOut_29_1;
                                                      break L15;
                                                    }
                                                  }
                                                  var10 = stackIn_31_0 | stackIn_31_1;
                                                  var12++;
                                                  continue L14;
                                                }
                                              }
                                            } else {
                                              break L7;
                                            }
                                          } else {
                                            var8[var12] = var17.d(true);
                                            var12++;
                                            continue L13;
                                          }
                                        }
                                      }
                                    }
                                    og.field_d[var4] = var10 != 0;
                                    var4++;
                                    continue L6;
                                  }
                                }
                              } else {
                                L16: {
                                  iv.field_l[var4] = var17.c((byte) 121);
                                  if (iv.field_l[var4] != 0) {
                                    break L16;
                                  } else {
                                    iv.field_l[var4] = 1;
                                    break L16;
                                  }
                                }
                                var4++;
                                continue L5;
                              }
                            }
                          } else {
                            we.field_B[var4] = var17.a(jg.a(param0, 0));
                            var4++;
                            continue L4;
                          }
                        }
                      } else {
                        vg.field_k[var4] = var17.a(255);
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    av.field_C[var4] = var17.a(255);
                    var4++;
                    continue L2;
                  }
                }
              } else {
                er.field_h[var4] = var16.a(255);
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
            stackOut_51_1 = new StringBuilder().append("eg.B(").append(param0).append(44);
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
          throw qo.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
    }
}
