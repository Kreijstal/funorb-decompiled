/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc {
    static boolean field_d;
    static int field_b;
    static String field_c;
    static int field_a;
    static cr field_e;
    static double field_g;
    static int field_f;

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
        ed var16 = null;
        ed var17 = null;
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
        int stackIn_47_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_46_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        var15 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var16 = new ed(param1);
            var17 = var16;
            var17.field_u = -2 + param1.length;
            eo.field_m = var17.a((byte) -11);
            vi.field_w = new int[eo.field_m];
            vl.field_j = new boolean[eo.field_m];
            pc.field_a = new int[eo.field_m];
            mh.field_c = new int[eo.field_m];
            ca.field_a = new int[eo.field_m];
            ej.field_c = new byte[eo.field_m][];
            se.field_y = new byte[eo.field_m][];
            var17.field_u = param1.length + -7 - eo.field_m * 8;
            ql.field_M = var17.a((byte) -11);
            vj.field_c = var17.a((byte) -11);
            var3 = (var17.h(-11) & 255) + 1;
            var4 = 0;
            L1: while (true) {
              if (eo.field_m <= var4) {
                var4 = 0;
                L2: while (true) {
                  if (var4 >= eo.field_m) {
                    var4 = 0;
                    L3: while (true) {
                      if (eo.field_m <= var4) {
                        var4 = 0;
                        L4: while (true) {
                          if (eo.field_m <= var4) {
                            var17.field_u = -(3 * (var3 - 1)) + (param1.length - 7 + -(eo.field_m * 8));
                            in.field_c = new int[var3];
                            var4 = 1;
                            L5: while (true) {
                              if (var3 <= var4) {
                                var17.field_u = 0;
                                var4 = 0;
                                L6: while (true) {
                                  if (var4 >= eo.field_m) {
                                    break L0;
                                  } else {
                                    L7: {
                                      var5 = mh.field_c[var4];
                                      var6 = vi.field_w[var4];
                                      var7 = var6 * var5;
                                      var24 = new byte[var7];
                                      var22 = var24;
                                      var20 = var22;
                                      var18 = var20;
                                      var8 = var18;
                                      se.field_y[var4] = var24;
                                      var25 = new byte[var7];
                                      var23 = var25;
                                      var21 = var23;
                                      var19 = var21;
                                      var9 = var19;
                                      ej.field_c[var4] = var25;
                                      var10 = 0;
                                      var11 = var17.h(-11);
                                      if (0 != (var11 & 1)) {
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
                                                    if (var13 >= var6) {
                                                      var12++;
                                                      continue L9;
                                                    } else {
                                                      L11: {
                                                        byte dupTemp$2 = var17.g(112);
                                                        var9[var12 - -(var5 * var13)] = dupTemp$2;
                                                        var14 = dupTemp$2;
                                                        stackOut_46_0 = var10;
                                                        stackIn_48_0 = stackOut_46_0;
                                                        stackIn_47_0 = stackOut_46_0;
                                                        if (var14 == -1) {
                                                          stackOut_48_0 = stackIn_48_0;
                                                          stackOut_48_1 = 0;
                                                          stackIn_49_0 = stackOut_48_0;
                                                          stackIn_49_1 = stackOut_48_1;
                                                          break L11;
                                                        } else {
                                                          stackOut_47_0 = stackIn_47_0;
                                                          stackOut_47_1 = 1;
                                                          stackIn_49_0 = stackOut_47_0;
                                                          stackIn_49_1 = stackOut_47_1;
                                                          break L11;
                                                        }
                                                      }
                                                      var10 = stackIn_49_0 | stackIn_49_1;
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
                                              if (var13 >= var6) {
                                                var12++;
                                                continue L8;
                                              } else {
                                                var8[var13 * var5 + var12] = var17.g(106);
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
                                            if ((var11 & 2) != 0) {
                                              var12 = 0;
                                              L14: while (true) {
                                                if (var7 <= var12) {
                                                  break L7;
                                                } else {
                                                  L15: {
                                                    byte dupTemp$3 = var17.g(102);
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
                                            } else {
                                              break L7;
                                            }
                                          } else {
                                            var8[var12] = var17.g(97);
                                            var12++;
                                            continue L13;
                                          }
                                        }
                                      }
                                    }
                                    vl.field_j[var4] = var10 != 0;
                                    var4++;
                                    continue L6;
                                  }
                                }
                              } else {
                                L16: {
                                  in.field_c[var4] = var17.m(0);
                                  if (in.field_c[var4] != 0) {
                                    break L16;
                                  } else {
                                    in.field_c[var4] = 1;
                                    break L16;
                                  }
                                }
                                var4++;
                                continue L5;
                              }
                            }
                          } else {
                            vi.field_w[var4] = var17.a((byte) -11);
                            var4++;
                            continue L4;
                          }
                        }
                      } else {
                        mh.field_c[var4] = var17.a((byte) -11);
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    pc.field_a[var4] = var17.a((byte) -11);
                    var4++;
                    continue L2;
                  }
                }
              } else {
                ca.field_a[var4] = var16.a((byte) -11);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var2 = decompiledCaughtException;
            stackOut_53_0 = (RuntimeException) var2;
            stackOut_53_1 = new StringBuilder().append("lc.A(").append(59).append(',');
            stackIn_55_0 = stackOut_53_0;
            stackIn_55_1 = stackOut_53_1;
            stackIn_54_0 = stackOut_53_0;
            stackIn_54_1 = stackOut_53_1;
            if (param1 == null) {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "null";
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              stackIn_56_2 = stackOut_55_2;
              break L17;
            } else {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "{...}";
              stackIn_56_0 = stackOut_54_0;
              stackIn_56_1 = stackOut_54_1;
              stackIn_56_2 = stackOut_54_2;
              break L17;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_56_0, stackIn_56_2 + ')');
        }
    }

    public static void a() {
        field_c = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = -1;
        field_c = "Waiting for sound effects";
    }
}
