/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h {
    static String[][] field_b;
    static String field_c;
    static String field_d;
    static String field_a;
    static hd field_e;
    static String field_f;

    final static bb a(int param0, tc param1, hd param2, hd param3, hd param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        bb[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        tc var13_ref_tc = null;
        int var14 = 0;
        int var15 = 0;
        bg var16 = null;
        int var17 = 0;
        Object stackIn_5_0 = null;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        Object stackIn_16_0 = null;
        bb stackIn_37_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        bb stackOut_36_0 = null;
        Object stackOut_15_0 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        var17 = Kickabout.field_G;
        try {
          L0: {
            if (param1 == null) {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (bb) (Object) stackIn_5_0;
            } else {
              L1: {
                if (param1.field_o != null) {
                  stackOut_9_0 = param1.field_o.length;
                  stackIn_10_0 = stackOut_9_0;
                  break L1;
                } else {
                  stackOut_7_0 = 0;
                  stackIn_10_0 = stackOut_7_0;
                  break L1;
                }
              }
              L2: {
                var5_int = stackIn_10_0;
                if (param1.field_n != null) {
                  stackOut_13_0 = param1.field_n.length;
                  stackIn_14_0 = stackOut_13_0;
                  break L2;
                } else {
                  stackOut_11_0 = 0;
                  stackIn_14_0 = stackOut_11_0;
                  break L2;
                }
              }
              var6 = stackIn_14_0;
              var7 = var5_int - -var6;
              var8 = new String[var7];
              var9 = new char[var7];
              var10 = new int[var7];
              var11 = new bb[var7];
              if (param0 == 0) {
                L3: {
                  L4: {
                    if (param1.field_o == null) {
                      break L4;
                    } else {
                      var12 = 0;
                      L5: while (true) {
                        if (var12 >= param1.field_o.length) {
                          break L4;
                        } else {
                          var13_ref_tc = vc.field_x.a(200, param1.field_o[var12]);
                          var8[var12] = var13_ref_tc.field_r;
                          var9[var12] = param1.field_q[var12];
                          var11[var12] = h.a(0, var13_ref_tc, param2, param3, param4);
                          var12++;
                          if (var17 != 0) {
                            break L3;
                          } else {
                            if (var17 == 0) {
                              continue L5;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                  }
                  if (null == param1.field_n) {
                    break L3;
                  } else {
                    var12 = var5_int;
                    var13 = 49;
                    var14 = 0;
                    L6: while (true) {
                      if (~param1.field_n.length >= ~var14) {
                        break L3;
                      } else {
                        L7: {
                          L8: {
                            var15 = param1.field_n[var14];
                            if (var15 == -1) {
                              break L8;
                            } else {
                              L9: {
                                var16 = lm.field_j.a(param0 ^ 6, var15);
                                var8[var14 + var12] = var16.g((byte) -105);
                                var9[var14 + var12] = param1.field_p[var14];
                                if (var9[var12 + var14] <= 0) {
                                  var13 = (char)(var13 + 1);
                                  var9[var14 + var12] = (char) var13;
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              var10[var12 + var14] = param1.field_n[var14];
                              if (var17 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          var8[var14 + var12] = vp.field_b;
                          var9[var12 + var14] = param1.field_p[var14];
                          var10[var12 - -var14] = param1.field_n[var14];
                          break L7;
                        }
                        var14++;
                        if (var17 == 0) {
                          continue L6;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackOut_36_0 = new bb(0L, param3, param2, param4, var11, var10, var8, var9);
                stackIn_37_0 = stackOut_36_0;
                break L0;
              } else {
                stackOut_15_0 = null;
                stackIn_16_0 = stackOut_15_0;
                return (bb) (Object) stackIn_16_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var5;
            stackOut_38_1 = new StringBuilder().append("h.C(").append(param0).append(',');
            stackIn_41_0 = stackOut_38_0;
            stackIn_41_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param1 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L10;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_42_0 = stackOut_39_0;
              stackIn_42_1 = stackOut_39_1;
              stackIn_42_2 = stackOut_39_2;
              break L10;
            }
          }
          L11: {
            stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
            stackOut_42_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_42_2).append(',');
            stackIn_45_0 = stackOut_42_0;
            stackIn_45_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param2 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L11;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_46_0 = stackOut_43_0;
              stackIn_46_1 = stackOut_43_1;
              stackIn_46_2 = stackOut_43_2;
              break L11;
            }
          }
          L12: {
            stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
            stackOut_46_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(',');
            stackIn_49_0 = stackOut_46_0;
            stackIn_49_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param3 == null) {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L12;
            } else {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "{...}";
              stackIn_50_0 = stackOut_47_0;
              stackIn_50_1 = stackOut_47_1;
              stackIn_50_2 = stackOut_47_2;
              break L12;
            }
          }
          L13: {
            stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
            stackOut_50_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(',');
            stackIn_53_0 = stackOut_50_0;
            stackIn_53_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param4 == null) {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L13;
            } else {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "{...}";
              stackIn_54_0 = stackOut_51_0;
              stackIn_54_1 = stackOut_51_1;
              stackIn_54_2 = stackOut_51_2;
              break L13;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + ')');
        }
        return stackIn_37_0;
    }

    final static tv a(int param0) {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        tv stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        tv stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        try {
          L0: {
            if (vb.field_j == 0) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (tv) (Object) stackIn_4_0;
            } else {
              if (param0 == 17475) {
                stackOut_8_0 = fu.field_b[-1 + vb.field_j];
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (tv) (Object) stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "h.B(" + param0 + ')');
        }
        return stackIn_9_0;
    }

    public static void a(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_a = null;
              field_b = null;
              field_e = null;
              field_f = null;
              field_d = null;
              if (!param0) {
                break L1;
              } else {
                field_d = null;
                break L1;
              }
            }
            field_c = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "h.A(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Loading street";
        field_b = new String[][]{new String[4], new String[4], new String[4]};
        field_c = "Multiplayer Lobby";
        field_a = "<%0>: Hide Chat";
    }
}
