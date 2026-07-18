/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class l {
    static wj field_b;
    static int[] field_c;
    static String field_a;

    final static void a(byte[] param0, byte param1) {
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
        ni var16 = null;
        ni var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
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
        int stackOut_34_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        var15 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var16 = new ni(param0);
            var17 = var16;
            var17.field_i = param0.length - 2;
            ef.field_l = var17.d((byte) -68);
            vg.field_I = new int[ef.field_l];
            wb.field_t = new byte[ef.field_l][];
            gg.field_i = new boolean[ef.field_l];
            of.field_d = new byte[ef.field_l][];
            ij.field_H = new int[ef.field_l];
            ob.field_a = new int[ef.field_l];
            b.field_b = new int[ef.field_l];
            var17.field_i = -(ef.field_l * 8) + (-7 + param0.length);
            e.field_e = var17.d((byte) 75);
            uf.field_k = var17.d((byte) -49);
            var3 = 1 + (255 & var17.e(false));
            var4 = 0;
            L1: while (true) {
              if (ef.field_l <= var4) {
                var4 = 0;
                L2: while (true) {
                  if (ef.field_l <= var4) {
                    var4 = 0;
                    L3: while (true) {
                      if (var4 >= ef.field_l) {
                        var4 = 0;
                        L4: while (true) {
                          if (var4 >= ef.field_l) {
                            var17.field_i = -(ef.field_l * 8) + param0.length - (7 + (-1 + var3) * 3);
                            rd.field_d = new int[var3];
                            var4 = 1;
                            L5: while (true) {
                              if (var3 <= var4) {
                                var17.field_i = 0;
                                var4 = 0;
                                L6: while (true) {
                                  if (ef.field_l <= var4) {
                                    break L0;
                                  } else {
                                    L7: {
                                      var5 = ij.field_H[var4];
                                      var6 = ob.field_a[var4];
                                      var7 = var6 * var5;
                                      var24 = new byte[var7];
                                      var22 = var24;
                                      var20 = var22;
                                      var18 = var20;
                                      var8 = var18;
                                      of.field_d[var4] = var24;
                                      var25 = new byte[var7];
                                      var23 = var25;
                                      var21 = var23;
                                      var19 = var21;
                                      var9 = var19;
                                      wb.field_t[var4] = var25;
                                      var10 = 0;
                                      var11 = var17.e(false);
                                      if ((1 & var11) == 0) {
                                        var12 = 0;
                                        L8: while (true) {
                                          if (var12 >= var7) {
                                            if ((var11 & 2) == 0) {
                                              break L7;
                                            } else {
                                              var12 = 0;
                                              L9: while (true) {
                                                if (var7 <= var12) {
                                                  break L7;
                                                } else {
                                                  L10: {
                                                    byte dupTemp$2 = var17.i(df.a(-91, 31));
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
                                            }
                                          } else {
                                            var8[var12] = var17.i(-124);
                                            var12++;
                                            continue L8;
                                          }
                                        }
                                      } else {
                                        var12 = 0;
                                        L11: while (true) {
                                          if (var5 <= var12) {
                                            if ((2 & var11) == 0) {
                                              break L7;
                                            } else {
                                              var12 = 0;
                                              L12: while (true) {
                                                if (var5 <= var12) {
                                                  break L7;
                                                } else {
                                                  var13 = 0;
                                                  L13: while (true) {
                                                    if (var13 >= var6) {
                                                      var12++;
                                                      continue L12;
                                                    } else {
                                                      L14: {
                                                        byte dupTemp$3 = var17.i(-107);
                                                        var9[var5 * var13 + var12] = dupTemp$3;
                                                        var14 = dupTemp$3;
                                                        stackOut_34_0 = var10;
                                                        stackIn_36_0 = stackOut_34_0;
                                                        stackIn_35_0 = stackOut_34_0;
                                                        if (var14 == -1) {
                                                          stackOut_36_0 = stackIn_36_0;
                                                          stackOut_36_1 = 0;
                                                          stackIn_37_0 = stackOut_36_0;
                                                          stackIn_37_1 = stackOut_36_1;
                                                          break L14;
                                                        } else {
                                                          stackOut_35_0 = stackIn_35_0;
                                                          stackOut_35_1 = 1;
                                                          stackIn_37_0 = stackOut_35_0;
                                                          stackIn_37_1 = stackOut_35_1;
                                                          break L14;
                                                        }
                                                      }
                                                      var10 = stackIn_37_0 | stackIn_37_1;
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
                                                var8[var12 - -(var5 * var13)] = var17.i(-65);
                                                var13++;
                                                continue L15;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    gg.field_i[var4] = var10 != 0;
                                    var4++;
                                    continue L6;
                                  }
                                }
                              } else {
                                L16: {
                                  rd.field_d[var4] = var17.c(true);
                                  if (0 != rd.field_d[var4]) {
                                    break L16;
                                  } else {
                                    rd.field_d[var4] = 1;
                                    break L16;
                                  }
                                }
                                var4++;
                                continue L5;
                              }
                            }
                          } else {
                            ob.field_a[var4] = var17.d((byte) -74);
                            var4++;
                            continue L4;
                          }
                        }
                      } else {
                        ij.field_H[var4] = var17.d((byte) 106);
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    b.field_b[var4] = var17.d((byte) -124);
                    var4++;
                    continue L2;
                  }
                }
              } else {
                vg.field_I[var4] = var16.d((byte) 62);
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
            stackOut_51_1 = new StringBuilder().append("l.D(");
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param0 == null) {
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
          throw pf.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + ',' + -91 + ')');
        }
    }

    final static void a(byte param0) {
        bd.field_kb = null;
        ic.field_bb = null;
        int var1 = 0;
    }

    public static void b(int param0) {
        field_a = null;
        field_b = null;
        field_c = null;
    }

    final static void a(int param0) {
        if (!(ok.field_x == null)) {
            ok.field_x.n(-22645);
        }
        uc.field_e = new nf();
        ak.field_a.d((qa) (Object) uc.field_e, 26034);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Username: ";
    }
}
