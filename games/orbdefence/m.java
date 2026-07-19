/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m {
    static int field_c;
    static int[] field_d;
    static int[] field_a;
    static String field_e;
    static int field_b;

    public static void a(byte param0) {
        field_a = null;
        if (param0 <= 92) {
            return;
        }
        field_e = null;
        field_d = null;
    }

    final static java.awt.Frame a(int param0, int param1, int param2, int param3, int param4, be param5) {
        RuntimeException var6 = null;
        db[] var6_array = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        db[] var10 = null;
        eb var11 = null;
        Object stackIn_3_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_12_0 = 0;
        int stackIn_24_0 = 0;
        Object stackIn_32_0 = null;
        Object stackIn_35_0 = null;
        java.awt.Frame stackIn_37_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_23_0 = 0;
        Object stackOut_7_0 = null;
        java.awt.Frame stackOut_36_0 = null;
        Object stackOut_34_0 = null;
        Object stackOut_31_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var9 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (param5.b((byte) -100)) {
              L1: {
                if ((param1 ^ -1) == param3) {
                  var10 = a.a(param5, -119);
                  var6_array = var10;
                  if (var6_array != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      L3: {
                        L4: {
                          if (var8 >= var10.length) {
                            break L4;
                          } else {
                            stackOut_11_0 = var10[var8].field_d ^ -1;
                            stackIn_24_0 = stackOut_11_0;
                            stackIn_12_0 = stackOut_11_0;
                            if (var9 != 0) {
                              break L3;
                            } else {
                              L5: {
                                if (stackIn_12_0 != (param0 ^ -1)) {
                                  break L5;
                                } else {
                                  if (var10[var8].field_b == param4) {
                                    L6: {
                                      if (param2 == 0) {
                                        break L6;
                                      } else {
                                        if (param2 == var10[var8].field_a) {
                                          break L6;
                                        } else {
                                          break L5;
                                        }
                                      }
                                    }
                                    L7: {
                                      if (var7_int == 0) {
                                        break L7;
                                      } else {
                                        if (param1 >= var10[var8].field_e) {
                                          break L5;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    param1 = var10[var8].field_e;
                                    var7_int = 1;
                                    break L5;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              var8++;
                              if (var9 == 0) {
                                continue L2;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        stackOut_23_0 = var7_int;
                        stackIn_24_0 = stackOut_23_0;
                        break L3;
                      }
                      if (stackIn_24_0 != 0) {
                        break L1;
                      } else {
                        return null;
                      }
                    }
                  } else {
                    stackOut_7_0 = null;
                    stackIn_8_0 = stackOut_7_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
              var11 = param5.a(param1, param0, param2, param3 + 28253, param4);
              L8: while (true) {
                L9: {
                  if (var11.field_a != 0) {
                    break L9;
                  } else {
                    hb.a(10L, param3 + 122);
                    if (var9 == 0) {
                      continue L8;
                    } else {
                      break L9;
                    }
                  }
                }
                var7 = (java.awt.Frame) (var11.field_g);
                if (var7 != null) {
                  if (-3 != (var11.field_a ^ -1)) {
                    stackOut_36_0 = (java.awt.Frame) (var7);
                    stackIn_37_0 = stackOut_36_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    tj.a(param5, var7, -23144);
                    stackOut_34_0 = null;
                    stackIn_35_0 = stackOut_34_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackOut_31_0 = null;
                  stackIn_32_0 = stackOut_31_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) (var6);
            stackOut_38_1 = new StringBuilder().append("m.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param5 == null) {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L10;
            } else {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L10;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.awt.Frame) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.awt.Frame) ((Object) stackIn_8_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (java.awt.Frame) ((Object) stackIn_32_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (java.awt.Frame) ((Object) stackIn_35_0);
              } else {
                return stackIn_37_0;
              }
            }
          }
        }
    }

    final static void a(boolean param0, int param1) {
        bm.field_d.a((byte) 82, param1, 0);
    }

    static {
        field_d = new int[12];
        field_d[1] = 1;
        field_d[4] = 5000;
        field_d[5] = 1000;
        field_d[3] = 5000;
        field_d[6] = 1;
        field_d[7] = 10;
        field_d[10] = 10;
        field_d[8] = 1;
        field_d[2] = 10;
        field_d[11] = 5000;
        field_d[0] = 1;
        field_d[9] = 10;
        field_e = "Unpacking music";
    }
}
