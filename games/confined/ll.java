/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll {
    static double field_b;
    static String field_c;
    static int field_d;
    static int field_a;

    final static va a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        va var7 = null;
        int var8 = 0;
        va stackIn_3_0 = null;
        va stackIn_7_0 = null;
        va stackIn_10_0 = null;
        va stackIn_16_0 = null;
        va stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        va stackOut_6_0 = null;
        va stackOut_18_0 = null;
        va stackOut_15_0 = null;
        va stackOut_9_0 = null;
        va stackOut_2_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var8 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            if (var2_int != 0) {
              if (var2_int > 255) {
                stackOut_6_0 = m.field_g;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                var3 = ij.a(0, '.', param1);
                if (var3.length >= 2) {
                  var4 = var3;
                  var5 = 0;
                  L1: while (true) {
                    if (var4.length <= var5) {
                      stackOut_18_0 = ck.a(var3[var3.length + -1], (byte) 127);
                      stackIn_19_0 = stackOut_18_0;
                      break L0;
                    } else {
                      var6 = var4[var5];
                      var7 = ik.a((byte) -126, var6);
                      if (var7 != null) {
                        stackOut_15_0 = (va) var7;
                        stackIn_16_0 = stackOut_15_0;
                        return stackIn_16_0;
                      } else {
                        var5++;
                        continue L1;
                      }
                    }
                  }
                } else {
                  stackOut_9_0 = vf.field_q;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              }
            } else {
              stackOut_2_0 = vf.field_q;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var2;
            stackOut_20_1 = new StringBuilder().append("ll.B(").append(57).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L2;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
        return stackIn_19_0;
    }

    final static void a(int param0, int param1, java.awt.Canvas param2, int param3) {
        java.awt.Graphics var4 = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
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
            if (param3 < -35) {
              try {
                L1: {
                  var4 = param2.getGraphics();
                  pi.field_S.a((byte) 91, var4, 0, 0);
                  var4.dispose();
                  break L1;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  var4_ref = (Exception) (Object) decompiledCaughtException;
                  param2.repaint();
                  break L2;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L3: {
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4_ref2;
            stackOut_6_1 = new StringBuilder().append("ll.D(").append(0).append(',').append(0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param3 + ')');
        }
    }

    final static boolean a(int param0, int param1) {
        if ((1 << param0 & i.field_o) != 0) {
            return false;
        }
        pn.field_a.b(hl.field_b, 320, 100, 9805732, -1);
        tf.a((byte) 59, param0, 105, i.field_o);
        return true;
    }

    public static void a(boolean param0) {
        field_c = null;
    }

    final static va a(String param0, boolean param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        va stackIn_4_0 = null;
        va stackIn_8_0 = null;
        va stackIn_13_0 = null;
        int stackIn_22_0 = 0;
        va stackIn_27_0 = null;
        va stackIn_41_0 = null;
        va stackIn_45_0 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        va stackOut_3_0 = null;
        va stackOut_7_0 = null;
        va stackOut_40_0 = null;
        va stackOut_44_0 = null;
        va stackOut_12_0 = null;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        va stackOut_26_0 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        var6 = Confined.field_J ? 1 : 0;
        try {
          var2_int = param0.length();
          if (0 == var2_int) {
            stackOut_3_0 = vf.field_q;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          } else {
            if (var2_int > 64) {
              stackOut_7_0 = m.field_g;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            } else {
              if (param0.charAt(0) != 34) {
                var3 = 0;
                var4 = 0;
                L0: while (true) {
                  if (var4 < var2_int) {
                    L1: {
                      var5 = param0.charAt(var4);
                      if (46 == var5) {
                        L2: {
                          if (var4 == 0) {
                            break L2;
                          } else {
                            if (-1 + var2_int == var4) {
                              break L2;
                            } else {
                              if (var3 == 0) {
                                var3 = 1;
                                break L1;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                        stackOut_40_0 = ql.field_k;
                        stackIn_41_0 = stackOut_40_0;
                        return stackIn_41_0;
                      } else {
                        if (ji.field_b.indexOf(var5) != -1) {
                          var3 = 0;
                          break L1;
                        } else {
                          stackOut_44_0 = ql.field_k;
                          stackIn_45_0 = stackOut_44_0;
                          return stackIn_45_0;
                        }
                      }
                    }
                    var4++;
                    continue L0;
                  } else {
                    return null;
                  }
                }
              } else {
                if (param0.charAt(-1 + var2_int) != 34) {
                  stackOut_12_0 = ql.field_k;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0;
                } else {
                  var3 = 0;
                  var4 = 1;
                  L3: while (true) {
                    if (-1 + var2_int > var4) {
                      L4: {
                        var5 = param0.charAt(var4);
                        if (var5 == 92) {
                          L5: {
                            if (var3 != 0) {
                              stackOut_21_0 = 0;
                              stackIn_22_0 = stackOut_21_0;
                              break L5;
                            } else {
                              stackOut_20_0 = 1;
                              stackIn_22_0 = stackOut_20_0;
                              break L5;
                            }
                          }
                          var3 = stackIn_22_0;
                          break L4;
                        } else {
                          L6: {
                            if (var5 != 34) {
                              break L6;
                            } else {
                              if (var3 == 0) {
                                stackOut_26_0 = ql.field_k;
                                stackIn_27_0 = stackOut_26_0;
                                return stackIn_27_0;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var3 = 0;
                          break L4;
                        }
                      }
                      var4++;
                      continue L3;
                    } else {
                      return null;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_49_0 = (RuntimeException) var2;
            stackOut_49_1 = new StringBuilder().append("ll.C(");
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param0 == null) {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L7;
            } else {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L7;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_52_0, stackIn_52_2 + ',' + true + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Level";
    }
}
