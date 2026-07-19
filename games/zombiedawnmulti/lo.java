/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lo {
    static String field_f;
    static int field_b;
    static String field_c;
    static String field_h;
    static cj field_g;
    static int[] field_j;
    static String field_e;
    static String field_i;
    static ri[] field_a;
    static int field_d;

    final static short[] a(int param0, short[] param1, ga param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        short[] stackIn_10_0 = null;
        short[] stackIn_21_0 = null;
        short[] stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        short[] stackOut_20_0 = null;
        short[] stackOut_23_0 = null;
        short[] stackOut_9_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var4_int = param2.h(param0, 14862);
            if (0 != var4_int) {
              L1: {
                L2: {
                  if (param1 == null) {
                    break L2;
                  } else {
                    if (var4_int == param1.length) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                param1 = new short[var4_int];
                break L1;
              }
              var5 = param2.h(4, 14862);
              if (param3 < -96) {
                L3: {
                  L4: {
                    L5: {
                      var6 = (short)param2.h(16, 14862);
                      if (0 < var5) {
                        break L5;
                      } else {
                        var7 = 0;
                        L6: while (true) {
                          if (var7 >= var4_int) {
                            if (var8 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          } else {
                            param1[var7] = (short)var6;
                            var7++;
                            if (var8 != 0) {
                              break L4;
                            } else {
                              continue L6;
                            }
                          }
                        }
                      }
                    }
                    var7 = 0;
                    L7: while (true) {
                      if (var4_int <= var7) {
                        break L4;
                      } else {
                        stackOut_20_0 = (short[]) (param1);
                        stackIn_24_0 = stackOut_20_0;
                        stackIn_21_0 = stackOut_20_0;
                        if (var8 != 0) {
                          break L3;
                        } else {
                          stackIn_21_0[var7] = (short)(var6 + param2.h(var5, 14862));
                          var7++;
                          continue L7;
                        }
                      }
                    }
                  }
                  stackOut_23_0 = (short[]) (param1);
                  stackIn_24_0 = stackOut_23_0;
                  break L3;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackOut_9_0 = (short[]) null;
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var4);
            stackOut_25_1 = new StringBuilder().append("lo.A(").append(param0).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          L9: {
            stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L9;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L9;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          return stackIn_24_0;
        }
    }

    public static void a(int param0) {
        field_i = null;
        field_a = null;
        field_h = null;
        field_j = null;
        field_c = null;
        if (param0 != 0) {
          return;
        } else {
          field_g = null;
          field_f = null;
          field_e = null;
          return;
        }
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        char[] var7 = null;
        char[] var8 = null;
        char[] var9 = null;
        char[] var10 = null;
        char[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_28_0 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (Character.isISOControl(param1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (gn.a(param1, 16413)) {
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var10 = af.field_d;
                var8 = var10;
                var6 = var8;
                var2 = var6;
                var3 = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      L4: {
                        if (var10.length <= var3) {
                          break L4;
                        } else {
                          var4 = var10[var3];
                          var13 = var4;
                          var12 = param1;
                          if (var5 != 0) {
                            if (var12 == var13) {
                              break L2;
                            } else {
                              break L3;
                            }
                          } else {
                            if (var12 != var13) {
                              var3++;
                              if (var5 == 0) {
                                continue L1;
                              } else {
                                break L4;
                              }
                            } else {
                              return true;
                            }
                          }
                        }
                      }
                      if (param0 == 8192) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                    lo.a(50);
                    break L2;
                  }
                  var11 = ln.field_d;
                  var9 = var11;
                  var7 = var9;
                  var2 = var7;
                  var3 = 0;
                  L5: while (true) {
                    L6: {
                      L7: {
                        if (var3 >= var11.length) {
                          break L7;
                        } else {
                          var4 = var11[var3];
                          stackOut_22_0 = param1 ^ -1;
                          stackIn_29_0 = stackOut_22_0;
                          stackIn_23_0 = stackOut_22_0;
                          if (var5 != 0) {
                            break L6;
                          } else {
                            if (stackIn_23_0 == (var4 ^ -1)) {
                              stackOut_25_0 = 1;
                              stackIn_26_0 = stackOut_25_0;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            } else {
                              var3++;
                              if (var5 == 0) {
                                continue L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                      }
                      stackOut_28_0 = 0;
                      stackIn_29_0 = stackOut_28_0;
                      break L6;
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2_ref), "lo.B(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_29_0 != 0;
            } else {
              return stackIn_26_0 != 0;
            }
          }
        }
    }

    static {
        field_h = "Please remove <%0> from your friend list first.";
        field_c = "Private";
        field_e = "Your zombie will become tougher, able to take more damage before dying...again.";
        field_i = "<%0> is already on your ignore list.";
        field_j = new int[8192];
        field_d = 0;
    }
}
