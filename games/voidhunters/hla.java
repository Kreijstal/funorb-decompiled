/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hla {
    static int[] field_a;
    static String field_b;

    final static tv[] a(Class[] param0, tv[] param1, dja[] param2, int param3, tv[] param4, int param5, dja param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        tv var9 = null;
        Class var10 = null;
        tv var11 = null;
        int var12 = 0;
        tv var13 = null;
        tv var14 = null;
        int var15 = 0;
        Object stackIn_3_0 = null;
        tv[] stackIn_12_0 = null;
        tv[] stackIn_40_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        RuntimeException decompiledCaughtException = null;
        tv[] stackOut_11_0 = null;
        tv[] stackOut_39_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        var15 = VoidHunters.field_G;
        try {
          L0: {
            if (null != param1) {
              L1: {
                L2: {
                  if (null == param4) {
                    break L2;
                  } else {
                    if (param4.length == param1.length) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                param4 = param6.a(11995, param1.length);
                break L1;
              }
              var7_int = 97 / ((param3 - -68) / 42);
              var8 = 0;
              L3: while (true) {
                L4: {
                  L5: {
                    if (~param1.length >= ~var8) {
                      break L5;
                    } else {
                      stackOut_11_0 = (tv[]) param1;
                      stackIn_40_0 = stackOut_11_0;
                      stackIn_12_0 = stackOut_11_0;
                      if (var15 != 0) {
                        break L4;
                      } else {
                        L6: {
                          L7: {
                            var9 = stackIn_12_0[var8];
                            if (null == var9) {
                              break L7;
                            } else {
                              L8: {
                                L9: {
                                  var10 = ((Object) (Object) param1[var8]).getClass();
                                  var11 = param4[var8];
                                  if (var11 == null) {
                                    break L9;
                                  } else {
                                    if (((Object) (Object) var11).getClass() != var10) {
                                      break L9;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                tv dupTemp$1 = udb.a(param0, param2, var10, -82);
                                param4[var8] = dupTemp$1;
                                var11 = dupTemp$1;
                                break L8;
                              }
                              L10: {
                                L11: {
                                  var12 = param5;
                                  var13 = var9;
                                  var14 = var11;
                                  if (var12 == 1) {
                                    break L11;
                                  } else {
                                    L12: {
                                      if (2 != var12) {
                                        break L12;
                                      } else {
                                        ((tva) (Object) var13).a(var14, 29106);
                                        if (var15 == 0) {
                                          break L10;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                    if (var12 != 3) {
                                      break L10;
                                    } else {
                                      ((sjb) (Object) var13).a(var14, (byte) 39);
                                      if (var15 == 0) {
                                        break L10;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                }
                                var13.b((byte) 114, var14);
                                break L10;
                              }
                              if (var15 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          param4[var8] = null;
                          break L6;
                        }
                        var8++;
                        if (var15 == 0) {
                          continue L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  stackOut_39_0 = (tv[]) param4;
                  stackIn_40_0 = stackOut_39_0;
                  break L4;
                }
                break L0;
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (tv[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var7 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var7;
            stackOut_41_1 = new StringBuilder().append("hla.A(");
            stackIn_44_0 = stackOut_41_0;
            stackIn_44_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param0 == null) {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L13;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_45_0 = stackOut_42_0;
              stackIn_45_1 = stackOut_42_1;
              stackIn_45_2 = stackOut_42_2;
              break L13;
            }
          }
          L14: {
            stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
            stackOut_45_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(',');
            stackIn_48_0 = stackOut_45_0;
            stackIn_48_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param1 == null) {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L14;
            } else {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "{...}";
              stackIn_49_0 = stackOut_46_0;
              stackIn_49_1 = stackOut_46_1;
              stackIn_49_2 = stackOut_46_2;
              break L14;
            }
          }
          L15: {
            stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
            stackOut_49_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(',');
            stackIn_52_0 = stackOut_49_0;
            stackIn_52_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param2 == null) {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L15;
            } else {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "{...}";
              stackIn_53_0 = stackOut_50_0;
              stackIn_53_1 = stackOut_50_1;
              stackIn_53_2 = stackOut_50_2;
              break L15;
            }
          }
          L16: {
            stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
            stackOut_53_1 = ((StringBuilder) (Object) stackIn_53_1).append(stackIn_53_2).append(',').append(param3).append(',');
            stackIn_56_0 = stackOut_53_0;
            stackIn_56_1 = stackOut_53_1;
            stackIn_54_0 = stackOut_53_0;
            stackIn_54_1 = stackOut_53_1;
            if (param4 == null) {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "null";
              stackIn_57_0 = stackOut_56_0;
              stackIn_57_1 = stackOut_56_1;
              stackIn_57_2 = stackOut_56_2;
              break L16;
            } else {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "{...}";
              stackIn_57_0 = stackOut_54_0;
              stackIn_57_1 = stackOut_54_1;
              stackIn_57_2 = stackOut_54_2;
              break L16;
            }
          }
          L17: {
            stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
            stackOut_57_1 = ((StringBuilder) (Object) stackIn_57_1).append(stackIn_57_2).append(',').append(param5).append(',');
            stackIn_60_0 = stackOut_57_0;
            stackIn_60_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param6 == null) {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "null";
              stackIn_61_0 = stackOut_60_0;
              stackIn_61_1 = stackOut_60_1;
              stackIn_61_2 = stackOut_60_2;
              break L17;
            } else {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "{...}";
              stackIn_61_0 = stackOut_58_0;
              stackIn_61_1 = stackOut_58_1;
              stackIn_61_2 = stackOut_58_2;
              break L17;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_61_0, stackIn_61_2 + ')');
        }
        return stackIn_40_0;
    }

    public static void a(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 39) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            field_a = null;
            field_b = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var1, "hla.B(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Repair";
    }
}
