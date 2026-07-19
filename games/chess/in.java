/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class in {
    static int[] field_j;
    static mk field_g;
    static String field_e;
    static String field_h;
    static String[][] field_f;
    static boolean field_a;
    static boolean[] field_c;
    static int field_i;
    static ci field_b;
    static le field_d;

    final static java.awt.Frame a(int param0, int param1, jk param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        tm[] var6_array = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        tm[] var10 = null;
        nl var11 = null;
        Object stackIn_7_0 = null;
        Object stackIn_25_0 = null;
        java.awt.Frame stackIn_28_0 = null;
        nl stackIn_31_0 = null;
        Object stackIn_39_0 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_24_0 = null;
        Object stackOut_6_0 = null;
        nl stackOut_29_0 = null;
        Object stackOut_38_0 = null;
        nl stackOut_30_0 = null;
        java.awt.Frame stackOut_27_0 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var9 = Chess.field_G;
        try {
          L0: {
            if (param2.a(true)) {
              L1: {
                if (param0 != 0) {
                  break L1;
                } else {
                  var10 = ud.a(624968802, param2);
                  var6_array = var10;
                  if (var6_array != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var8 >= var10.length) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          stackOut_24_0 = null;
                          stackIn_25_0 = stackOut_24_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      } else {
                        if (param1 == var10[var8].field_g) {
                          L3: {
                            if (var10[var8].field_e == param5) {
                              L4: {
                                if (-1 == (param3 ^ -1)) {
                                  break L4;
                                } else {
                                  if (param3 == var10[var8].field_f) {
                                    break L4;
                                  } else {
                                    var8++;
                                    continue L2;
                                  }
                                }
                              }
                              L5: {
                                if (var7_int == 0) {
                                  break L5;
                                } else {
                                  if (var10[var8].field_i > param0) {
                                    break L5;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                              var7_int = 1;
                              param0 = var10[var8].field_i;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          var8++;
                          continue L2;
                        } else {
                          var8++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    stackOut_6_0 = null;
                    stackIn_7_0 = stackOut_6_0;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
              var11 = param2.a(param1, param5, param4 + -3053, param0, param3);
              if (param4 == 3160) {
                stackOut_29_0 = (nl) (var11);
                stackIn_31_0 = stackOut_29_0;
                L6: while (true) {
                  if (stackIn_31_0.field_f != 0) {
                    var7 = (java.awt.Frame) (var11.field_b);
                    if (var7 != null) {
                      if ((var11.field_f ^ -1) == -3) {
                        wf.a(var7, param2, param4 + -3057);
                        stackOut_38_0 = null;
                        stackIn_39_0 = stackOut_38_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        return var7;
                      }
                    } else {
                      return null;
                    }
                  } else {
                    bc.a(10L, (byte) -106);
                    stackOut_30_0 = (nl) (var11);
                    stackIn_31_0 = stackOut_30_0;
                    continue L6;
                  }
                }
              } else {
                stackOut_27_0 = (java.awt.Frame) null;
                stackIn_28_0 = stackOut_27_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) (var6);
            stackOut_40_1 = new StringBuilder().append("in.B(").append(param0).append(',').append(param1).append(',');
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param2 == null) {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L7;
            } else {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L7;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.awt.Frame) ((Object) stackIn_7_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.awt.Frame) ((Object) stackIn_25_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_28_0;
            } else {
              return (java.awt.Frame) ((Object) stackIn_39_0);
            }
          }
        }
    }

    final static int[] a(byte param0) {
        if (param0 != 20) {
            field_j = (int[]) null;
        }
        return new int[8];
    }

    final static void a(byte param0, boolean param1, boolean param2) {
        String var4 = (String) null;
        nj.a(param1, 2, (String) null, param2);
        if (param0 < 78) {
            field_j = (int[]) null;
        }
    }

    public static void b(byte param0) {
        field_b = null;
        field_g = null;
        field_f = (String[][]) null;
        field_h = null;
        field_d = null;
        field_e = null;
        field_c = null;
        int var1 = 43 % ((-16 - param0) / 38);
        field_j = null;
    }

    final static int a(String param0, int param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var3_int = -96 % ((-37 - param1) / 60);
            if (!param2) {
              stackOut_3_0 = sj.field_d.b(param0);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = vl.field_M.b(param0);
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("in.E(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    static {
        field_g = new mk();
        field_h = "Private";
        field_a = false;
        field_e = "Hide private chat and appear offline to friends";
    }
}
