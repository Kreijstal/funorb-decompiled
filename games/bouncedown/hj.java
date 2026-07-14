/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj {
    static int field_a;
    static int field_b;

    final static void a(boolean param0, byte param1, jk param2, int param3, int param4) {
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
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        boolean stackIn_14_0 = false;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_34_2 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_55_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_13_0 = false;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_33_2 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_31_2 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_44_0 = 0;
        int stackOut_44_1 = 0;
        int stackOut_54_0 = 0;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        var19 = Bounce.field_N;
        try {
          L0: {
            var5_int = wb.a((byte) 100, (-param4 + param3) * 3);
            var6 = 3 * param4;
            var7 = var5_int - 10;
            jg.k(0);
            if (param1 < -127) {
              break L0;
            } else {
              int discarded$1 = hj.a(23);
              break L0;
            }
          }
          L1: {
            if (param2.field_w <= 0) {
              break L1;
            } else {
              if (null != param2.field_v) {
                mg.h((byte) -121);
                break L1;
              } else {
                break L1;
              }
            }
          }
          lb.field_b = 0;
          var8 = 0;
          L2: while (true) {
            L3: {
              L4: {
                if ((var8 ^ -1) <= (param2.field_L ^ -1)) {
                  break L4;
                } else {
                  var9 = param2.field_O[var8];
                  var10 = param2.field_P[var8];
                  var11 = param2.field_l[var8];
                  stackOut_13_0 = param0;
                  stackIn_55_0 = stackOut_13_0 ? 1 : 0;
                  stackIn_14_0 = stackOut_13_0;
                  if (var19 != 0) {
                    break L3;
                  } else {
                    L5: {
                      L6: {
                        if (!stackIn_14_0) {
                          break L6;
                        } else {
                          var12 = ca.field_c[var9];
                          var13 = kg.field_g[var9];
                          var14 = ca.field_c[var10] + -var12;
                          var15 = -var12 + ca.field_c[var11];
                          var16 = kg.field_g[var10] - var13;
                          var17 = -var13 + kg.field_g[var11];
                          if (0 > -(var16 * var15) + var14 * var17) {
                            break L6;
                          } else {
                            if (var19 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      L7: {
                        var12 = r.field_c[var9];
                        if (var12 != -2147483648) {
                          break L7;
                        } else {
                          if (var19 == 0) {
                            break L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                      L8: {
                        var13 = r.field_c[var10];
                        if (2147483647 != (var13 ^ -1)) {
                          break L8;
                        } else {
                          if (var19 == 0) {
                            break L5;
                          } else {
                            break L8;
                          }
                        }
                      }
                      var14 = r.field_c[var11];
                      if (2147483647 == (var14 ^ -1)) {
                        break L5;
                      } else {
                        L9: {
                          var15 = -var6 + var13 + (var12 - -var14);
                          stackOut_30_0 = ja.field_c.length;
                          stackOut_30_1 = -1;
                          stackIn_33_0 = stackOut_30_0;
                          stackIn_33_1 = stackOut_30_1;
                          stackIn_31_0 = stackOut_30_0;
                          stackIn_31_1 = stackOut_30_1;
                          if (-1 < (var7 ^ -1)) {
                            stackOut_33_0 = stackIn_33_0;
                            stackOut_33_1 = stackIn_33_1;
                            stackOut_33_2 = var15 << -var7;
                            stackIn_34_0 = stackOut_33_0;
                            stackIn_34_1 = stackOut_33_1;
                            stackIn_34_2 = stackOut_33_2;
                            break L9;
                          } else {
                            stackOut_31_0 = stackIn_31_0;
                            stackOut_31_1 = stackIn_31_1;
                            stackOut_31_2 = var15 >> var7;
                            stackIn_34_0 = stackOut_31_0;
                            stackIn_34_1 = stackOut_31_1;
                            stackIn_34_2 = stackOut_31_2;
                            break L9;
                          }
                        }
                        var16 = stackIn_34_0 + (stackIn_34_1 - stackIn_34_2);
                        var17 = ja.field_c[var16];
                        L10: while (true) {
                          L11: {
                            L12: {
                              if ((var17 >> 899036036 ^ -1) == -1) {
                                break L12;
                              } else {
                                var16--;
                                stackOut_36_0 = -1;
                                stackOut_36_1 = var16 ^ -1;
                                stackIn_45_0 = stackOut_36_0;
                                stackIn_45_1 = stackOut_36_1;
                                stackIn_37_0 = stackOut_36_0;
                                stackIn_37_1 = stackOut_36_1;
                                if (var19 != 0) {
                                  break L11;
                                } else {
                                  L13: {
                                    if (stackIn_37_0 >= stackIn_37_1) {
                                      break L13;
                                    } else {
                                      System.err.println("Out of range!");
                                      if (var19 == 0) {
                                        break L5;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  var17 = ja.field_c[var16];
                                  if (var19 == 0) {
                                    continue L10;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                            }
                            stackOut_44_0 = var16 << -1112307772;
                            stackOut_44_1 = -var17;
                            stackIn_45_0 = stackOut_44_0;
                            stackIn_45_1 = stackOut_44_1;
                            break L11;
                          }
                          L14: {
                            var18 = stackIn_45_0 - stackIn_45_1;
                            lb.field_c[var18] = var8;
                            ja.field_c[var16] = 1 + var17;
                            if (-1 <= (param2.field_w ^ -1)) {
                              break L14;
                            } else {
                              if (null != param2.field_v) {
                                oc.field_a[param2.field_v[var8]] = oc.field_a[param2.field_v[var8]] + 1;
                                break L14;
                              } else {
                                break L14;
                              }
                            }
                          }
                          lb.field_b = lb.field_b + 1;
                          break L5;
                        }
                      }
                    }
                    var8++;
                    if (var19 == 0) {
                      continue L2;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              stackOut_54_0 = param2.field_w ^ -1;
              stackIn_55_0 = stackOut_54_0;
              break L3;
            }
            L15: {
              L16: {
                if (stackIn_55_0 >= -1) {
                  break L16;
                } else {
                  if (param2.field_v != null) {
                    var8 = 0;
                    var9 = 0;
                    L17: while (true) {
                      if (oc.field_a.length <= var9) {
                        break L16;
                      } else {
                        var10 = oc.field_a[var9];
                        oc.field_a[var9] = var8;
                        var8 = var8 + var10;
                        var9++;
                        if (var19 != 0) {
                          break L15;
                        } else {
                          if (var19 == 0) {
                            continue L17;
                          } else {
                            break L16;
                          }
                        }
                      }
                    }
                  } else {
                    break L16;
                  }
                }
              }
              break L15;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var5 = decompiledCaughtException;
            stackOut_68_0 = (RuntimeException) var5;
            stackOut_68_1 = new StringBuilder().append("hj.B(").append(param0).append(44).append(param1).append(44);
            stackIn_71_0 = stackOut_68_0;
            stackIn_71_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param2 == null) {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L18;
            } else {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "{...}";
              stackIn_72_0 = stackOut_69_0;
              stackIn_72_1 = stackOut_69_1;
              stackIn_72_2 = stackOut_69_2;
              break L18;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_72_0, stackIn_72_2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static int a(int param0) {
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            if (param0 == 24777) {
              break L0;
            } else {
              hj.a(false, (byte) -24, (jk) null, 13, 72);
              break L0;
            }
          }
          stackOut_3_0 = -bb.field_b + ui.field_p;
          stackIn_4_0 = stackOut_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var1, "hj.A(" + param0 + 41);
        }
        return stackIn_4_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
    }
}
