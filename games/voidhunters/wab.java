/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wab extends rqa {
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
        ds var16 = null;
        ds var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_44_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        var15 = VoidHunters.field_G;
        try {
          L0: {
            var16 = new ds(param1);
            var17 = var16;
            var17.field_e = -2 + param1.length;
            mma.field_a = var17.e(1869);
            hla.field_a = new int[mma.field_a];
            hja.field_o = new byte[mma.field_a][];
            sh.field_a = new byte[mma.field_a][];
            mk.field_o = new boolean[mma.field_a];
            so.field_f = new int[mma.field_a];
            nhb.field_o = new int[mma.field_a];
            iib.field_e = new int[mma.field_a];
            var17.field_e = -(mma.field_a * 8) + -7 + param1.length;
            fbb.field_i = var17.e(1869);
            sg.field_H = var17.e(1869);
            var3 = (255 & var17.e((byte) -110)) - -1;
            var4 = 0;
            L1: while (true) {
              if (mma.field_a <= var4) {
                var4 = 0;
                L2: while (true) {
                  if (var4 >= mma.field_a) {
                    var4 = 0;
                    L3: while (true) {
                      if (mma.field_a <= var4) {
                        var4 = 0;
                        L4: while (true) {
                          if (var4 >= mma.field_a) {
                            var17.field_e = -7 + param1.length - 8 * mma.field_a + -((-1 + var3) * 3);
                            rlb.field_d = new int[var3];
                            var4 = 1;
                            L5: while (true) {
                              if (var4 >= var3) {
                                var17.field_e = 0;
                                var4 = 0;
                                L6: while (true) {
                                  if (mma.field_a <= var4) {
                                    break L0;
                                  } else {
                                    L7: {
                                      var5 = nhb.field_o[var4];
                                      var6 = hla.field_a[var4];
                                      var7 = var6 * var5;
                                      var24 = new byte[var7];
                                      var22 = var24;
                                      var20 = var22;
                                      var18 = var20;
                                      var8 = var18;
                                      sh.field_a[var4] = var24;
                                      var25 = new byte[var7];
                                      var23 = var25;
                                      var21 = var23;
                                      var19 = var21;
                                      var9 = var19;
                                      hja.field_o[var4] = var25;
                                      var10 = 0;
                                      var11 = var17.e((byte) -105);
                                      if (0 == (1 & var11)) {
                                        var12 = 0;
                                        L8: while (true) {
                                          if (var7 <= var12) {
                                            if ((var11 & 2) != 0) {
                                              var12 = 0;
                                              L9: while (true) {
                                                if (var7 <= var12) {
                                                  break L7;
                                                } else {
                                                  L10: {
                                                    byte dupTemp$2 = var17.d((byte) -114);
                                                    var9[var12] = dupTemp$2;
                                                    var13 = dupTemp$2;
                                                    stackOut_44_0 = var10;
                                                    stackIn_46_0 = stackOut_44_0;
                                                    stackIn_45_0 = stackOut_44_0;
                                                    if (-1 == var13) {
                                                      stackOut_46_0 = stackIn_46_0;
                                                      stackOut_46_1 = 0;
                                                      stackIn_47_0 = stackOut_46_0;
                                                      stackIn_47_1 = stackOut_46_1;
                                                      break L10;
                                                    } else {
                                                      stackOut_45_0 = stackIn_45_0;
                                                      stackOut_45_1 = 1;
                                                      stackIn_47_0 = stackOut_45_0;
                                                      stackIn_47_1 = stackOut_45_1;
                                                      break L10;
                                                    }
                                                  }
                                                  var10 = stackIn_47_0 | stackIn_47_1;
                                                  var12++;
                                                  continue L9;
                                                }
                                              }
                                            } else {
                                              break L7;
                                            }
                                          } else {
                                            var8[var12] = var17.d((byte) -114);
                                            var12++;
                                            continue L8;
                                          }
                                        }
                                      } else {
                                        var12 = 0;
                                        L11: while (true) {
                                          if (var5 <= var12) {
                                            if ((var11 & 2) == 0) {
                                              break L7;
                                            } else {
                                              var12 = 0;
                                              L12: while (true) {
                                                if (var5 <= var12) {
                                                  break L7;
                                                } else {
                                                  var13 = 0;
                                                  L13: while (true) {
                                                    if (var6 <= var13) {
                                                      var12++;
                                                      continue L12;
                                                    } else {
                                                      L14: {
                                                        byte dupTemp$3 = var17.d((byte) -114);
                                                        var9[var13 * var5 + var12] = dupTemp$3;
                                                        var14 = dupTemp$3;
                                                        stackOut_32_0 = var10;
                                                        stackIn_34_0 = stackOut_32_0;
                                                        stackIn_33_0 = stackOut_32_0;
                                                        if (-1 == var14) {
                                                          stackOut_34_0 = stackIn_34_0;
                                                          stackOut_34_1 = 0;
                                                          stackIn_35_0 = stackOut_34_0;
                                                          stackIn_35_1 = stackOut_34_1;
                                                          break L14;
                                                        } else {
                                                          stackOut_33_0 = stackIn_33_0;
                                                          stackOut_33_1 = 1;
                                                          stackIn_35_0 = stackOut_33_0;
                                                          stackIn_35_1 = stackOut_33_1;
                                                          break L14;
                                                        }
                                                      }
                                                      var10 = stackIn_35_0 | stackIn_35_1;
                                                      var13++;
                                                      continue L13;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            var13 = 0;
                                            L15: while (true) {
                                              if (var13 >= var6) {
                                                var12++;
                                                continue L11;
                                              } else {
                                                var8[var12 + var13 * var5] = var17.d((byte) -114);
                                                var13++;
                                                continue L15;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    mk.field_o[var4] = var10 != 0;
                                    var4++;
                                    continue L6;
                                  }
                                }
                              } else {
                                L16: {
                                  rlb.field_d[var4] = var17.c((byte) -87);
                                  if (0 != rlb.field_d[var4]) {
                                    break L16;
                                  } else {
                                    rlb.field_d[var4] = 1;
                                    break L16;
                                  }
                                }
                                var4++;
                                continue L5;
                              }
                            }
                          } else {
                            hla.field_a[var4] = var17.e(1869);
                            var4++;
                            continue L4;
                          }
                        }
                      } else {
                        nhb.field_o[var4] = var17.e(1869);
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    so.field_f[var4] = var17.e(1869);
                    var4++;
                    continue L2;
                  }
                }
              } else {
                iib.field_e[var4] = var16.e(1869);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var2 = decompiledCaughtException;
            stackOut_50_0 = (RuntimeException) var2;
            stackOut_50_1 = new StringBuilder().append("wab.B(").append(0).append(44);
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param1 == null) {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L17;
            } else {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L17;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_53_0, stackIn_53_2 + 41);
        }
    }

    wab(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 < -119) {
              ki.field_o = param0[0].a(81);
              stackOut_3_0 = new nc((Object) (Object) "void");
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (nc) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("wab.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
        return stackIn_4_0;
    }

    static {
    }
}
