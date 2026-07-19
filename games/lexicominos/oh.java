/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh {
    static String field_c;
    static String field_a;
    static int field_b;

    final static java.awt.Frame a(int param0, int param1, int param2, byte param3, int param4, ab param5) {
        RuntimeException var6 = null;
        we[] var6_array = null;
        int var7 = 0;
        int var8_int = 0;
        java.awt.Frame var8 = null;
        int var9 = 0;
        we[] var10 = null;
        ei var11 = null;
        int stackIn_11_0 = 0;
        int stackIn_23_0 = 0;
        Object stackIn_31_0 = null;
        Object stackIn_34_0 = null;
        java.awt.Frame stackIn_36_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_22_0 = 0;
        java.awt.Frame stackOut_35_0 = null;
        Object stackOut_33_0 = null;
        Object stackOut_30_0 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var9 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (param5.b(0)) {
              L1: {
                if (-1 != (param4 ^ -1)) {
                  break L1;
                } else {
                  var10 = gb.a((byte) -127, param5);
                  var6_array = var10;
                  if (var6_array != null) {
                    var7 = 0;
                    var8_int = 0;
                    L2: while (true) {
                      L3: {
                        L4: {
                          if (var8_int >= var10.length) {
                            break L4;
                          } else {
                            stackOut_10_0 = var10[var8_int].field_a ^ -1;
                            stackIn_23_0 = stackOut_10_0;
                            stackIn_11_0 = stackOut_10_0;
                            if (var9 != 0) {
                              break L3;
                            } else {
                              L5: {
                                if (stackIn_11_0 != (param1 ^ -1)) {
                                  break L5;
                                } else {
                                  if (param0 == var10[var8_int].field_e) {
                                    L6: {
                                      if (-1 == (param2 ^ -1)) {
                                        break L6;
                                      } else {
                                        if (param2 != var10[var8_int].field_k) {
                                          break L5;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                    L7: {
                                      if (var7 == 0) {
                                        break L7;
                                      } else {
                                        if (var10[var8_int].field_f <= param4) {
                                          break L5;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    param4 = var10[var8_int].field_f;
                                    var7 = 1;
                                    break L5;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              var8_int++;
                              if (var9 == 0) {
                                continue L2;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        stackOut_22_0 = var7;
                        stackIn_23_0 = stackOut_22_0;
                        break L3;
                      }
                      if (stackIn_23_0 != 0) {
                        break L1;
                      } else {
                        return null;
                      }
                    }
                  } else {
                    return null;
                  }
                }
              }
              var11 = param5.a(28460, param1, param0, param4, param2);
              var7 = -55 / ((param3 - -61) / 63);
              L8: while (true) {
                L9: {
                  if (-1 != (var11.field_b ^ -1)) {
                    break L9;
                  } else {
                    ge.a(0, 10L);
                    if (var9 == 0) {
                      continue L8;
                    } else {
                      break L9;
                    }
                  }
                }
                var8 = (java.awt.Frame) (var11.field_g);
                if (var8 != null) {
                  if (-3 != (var11.field_b ^ -1)) {
                    stackOut_35_0 = (java.awt.Frame) (var8);
                    stackIn_36_0 = stackOut_35_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    ca.a(param5, 15232, var8);
                    stackOut_33_0 = null;
                    stackIn_34_0 = stackOut_33_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  stackOut_30_0 = null;
                  stackIn_31_0 = stackOut_30_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) (var6);
            stackOut_37_1 = new StringBuilder().append("oh.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param5 == null) {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L10;
            } else {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L10;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.awt.Frame) ((Object) stackIn_31_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.awt.Frame) ((Object) stackIn_34_0);
          } else {
            return stackIn_36_0;
          }
        }
    }

    final static boolean a(sh param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -16) {
                break L1;
              } else {
                field_c = (String) null;
                break L1;
              }
            }
            stackOut_2_0 = param0.a((byte) -128);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("oh.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static int a(int param0, byte[] param1, boolean param2, int param3) {
        java.awt.Frame discarded$2 = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        ab var7 = null;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = -1;
              if (!param2) {
                break L1;
              } else {
                var7 = (ab) null;
                discarded$2 = oh.a(-37, 109, 83, (byte) 108, 101, (ab) null);
                break L1;
              }
            }
            var5 = param0;
            L2: while (true) {
              L3: {
                if (var5 >= param3) {
                  var4_int = var4_int ^ -1;
                  break L3;
                } else {
                  var4_int = var4_int >>> -2041527256 ^ d.field_c[255 & (param1[var5] ^ var4_int)];
                  var5++;
                  if (var6 != 0) {
                    break L3;
                  } else {
                    continue L2;
                  }
                }
              }
              stackOut_9_0 = var4_int;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var4);
            stackOut_11_1 = new StringBuilder().append("oh.B(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_10_0;
    }

    final static void a(int param0, db param1, boolean param2, String param3, int param4, int param5) {
        java.awt.Frame discarded$0 = null;
        try {
            if (param2) {
                ab var7 = (ab) null;
                discarded$0 = oh.a(-85, -81, 63, (byte) 46, 52, (ab) null);
            }
            eh.a(param4, param1, param5 + -(24 * (param3.length() - 1)), 0, param3, param0);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "oh.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        int var1 = -85 % ((param0 - -65) / 48);
    }

    static {
        field_c = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
    }
}
