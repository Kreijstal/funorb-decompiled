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
            L1: {
              var5_int = wb.a((byte) 100, (-param4 + param3) * 3);
              var6 = 3 * param4;
              var7 = var5_int - 10;
              jg.k(0);
              if (param1 < -127) {
                break L1;
              } else {
                int discarded$1 = hj.a(23);
                break L1;
              }
            }
            L2: {
              if (param2.field_w <= 0) {
                break L2;
              } else {
                if (null != param2.field_v) {
                  mg.h((byte) -121);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            lb.field_b = 0;
            var8 = 0;
            L3: while (true) {
              L4: {
                L5: {
                  if (~var8 <= ~param2.field_L) {
                    break L5;
                  } else {
                    var9 = param2.field_O[var8];
                    var10 = param2.field_P[var8];
                    var11 = param2.field_l[var8];
                    stackOut_13_0 = param0;
                    stackIn_55_0 = stackOut_13_0 ? 1 : 0;
                    stackIn_14_0 = stackOut_13_0;
                    if (var19 != 0) {
                      break L4;
                    } else {
                      L6: {
                        L7: {
                          if (!stackIn_14_0) {
                            break L7;
                          } else {
                            var12 = ca.field_c[var9];
                            var13 = kg.field_g[var9];
                            var14 = ca.field_c[var10] + -var12;
                            var15 = -var12 + ca.field_c[var11];
                            var16 = kg.field_g[var10] - var13;
                            var17 = -var13 + kg.field_g[var11];
                            if (0 > -(var16 * var15) + var14 * var17) {
                              break L7;
                            } else {
                              if (var19 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        L8: {
                          var12 = r.field_c[var9];
                          if (var12 != -2147483648) {
                            break L8;
                          } else {
                            if (var19 == 0) {
                              break L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                        L9: {
                          var13 = r.field_c[var10];
                          if (var13 != -2147483648) {
                            break L9;
                          } else {
                            if (var19 == 0) {
                              break L6;
                            } else {
                              break L9;
                            }
                          }
                        }
                        var14 = r.field_c[var11];
                        if (var14 == -2147483648) {
                          break L6;
                        } else {
                          L10: {
                            var15 = -var6 + var13 + (var12 - -var14);
                            stackOut_30_0 = ja.field_c.length;
                            stackOut_30_1 = -1;
                            stackIn_33_0 = stackOut_30_0;
                            stackIn_33_1 = stackOut_30_1;
                            stackIn_31_0 = stackOut_30_0;
                            stackIn_31_1 = stackOut_30_1;
                            if (var7 < 0) {
                              stackOut_33_0 = stackIn_33_0;
                              stackOut_33_1 = stackIn_33_1;
                              stackOut_33_2 = var15 << -var7;
                              stackIn_34_0 = stackOut_33_0;
                              stackIn_34_1 = stackOut_33_1;
                              stackIn_34_2 = stackOut_33_2;
                              break L10;
                            } else {
                              stackOut_31_0 = stackIn_31_0;
                              stackOut_31_1 = stackIn_31_1;
                              stackOut_31_2 = var15 >> var7;
                              stackIn_34_0 = stackOut_31_0;
                              stackIn_34_1 = stackOut_31_1;
                              stackIn_34_2 = stackOut_31_2;
                              break L10;
                            }
                          }
                          var16 = stackIn_34_0 + (stackIn_34_1 - stackIn_34_2);
                          var17 = ja.field_c[var16];
                          L11: while (true) {
                            L12: {
                              L13: {
                                if (var17 >> 4 == 0) {
                                  break L13;
                                } else {
                                  var16--;
                                  stackOut_36_0 = -1;
                                  stackOut_36_1 = ~var16;
                                  stackIn_45_0 = stackOut_36_0;
                                  stackIn_45_1 = stackOut_36_1;
                                  stackIn_37_0 = stackOut_36_0;
                                  stackIn_37_1 = stackOut_36_1;
                                  if (var19 != 0) {
                                    break L12;
                                  } else {
                                    L14: {
                                      if (stackIn_37_0 >= stackIn_37_1) {
                                        break L14;
                                      } else {
                                        System.err.println("Out of range!");
                                        if (var19 == 0) {
                                          break L6;
                                        } else {
                                          break L14;
                                        }
                                      }
                                    }
                                    var17 = ja.field_c[var16];
                                    if (var19 == 0) {
                                      continue L11;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                              }
                              stackOut_44_0 = var16 << 4;
                              stackOut_44_1 = -var17;
                              stackIn_45_0 = stackOut_44_0;
                              stackIn_45_1 = stackOut_44_1;
                              break L12;
                            }
                            L15: {
                              var18 = stackIn_45_0 - stackIn_45_1;
                              lb.field_c[var18] = var8;
                              ja.field_c[var16] = 1 + var17;
                              if (param2.field_w <= 0) {
                                break L15;
                              } else {
                                if (null != param2.field_v) {
                                  oc.field_a[param2.field_v[var8]] = oc.field_a[param2.field_v[var8]] + 1;
                                  break L15;
                                } else {
                                  break L15;
                                }
                              }
                            }
                            lb.field_b = lb.field_b + 1;
                            break L6;
                          }
                        }
                      }
                      var8++;
                      if (var19 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                stackOut_54_0 = ~param2.field_w;
                stackIn_55_0 = stackOut_54_0;
                break L4;
              }
              L16: {
                L17: {
                  if (stackIn_55_0 >= -1) {
                    break L17;
                  } else {
                    if (param2.field_v != null) {
                      var8 = 0;
                      var9 = 0;
                      L18: while (true) {
                        if (oc.field_a.length <= var9) {
                          break L17;
                        } else {
                          var10 = oc.field_a[var9];
                          oc.field_a[var9] = var8;
                          var8 = var8 + var10;
                          var9++;
                          if (var19 != 0) {
                            break L16;
                          } else {
                            if (var19 == 0) {
                              continue L18;
                            } else {
                              break L17;
                            }
                          }
                        }
                      }
                    } else {
                      break L17;
                    }
                  }
                }
                break L16;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var5 = decompiledCaughtException;
            stackOut_68_0 = (RuntimeException) var5;
            stackOut_68_1 = new StringBuilder().append("hj.B(").append(param0).append(',').append(param1).append(',');
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
              break L19;
            } else {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "{...}";
              stackIn_72_0 = stackOut_69_0;
              stackIn_72_1 = stackOut_69_1;
              stackIn_72_2 = stackOut_69_2;
              break L19;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_72_0, stackIn_72_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static int a(int param0) {
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 24777) {
                break L1;
              } else {
                hj.a(false, (byte) -24, (jk) null, 13, 72);
                break L1;
              }
            }
            stackOut_3_0 = -bb.field_b + ui.field_p;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var1, "hj.A(" + param0 + ')');
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
