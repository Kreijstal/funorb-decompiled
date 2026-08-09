/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gj {
    static int field_a;
    static mh field_b;
    static String field_d;
    static jp[] field_c;

    final static kn b(int param0) {
        int var1_int = 0;
        kn var2 = null;
        int var3 = 0;
        kn stackIn_4_0 = null;
        Throwable decompiledCaughtException = null;
        IllegalArgumentException var1 = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var1_int = param0;
            L1: while (true) {
              var2 = pj.field_c.a(var1_int, (byte) -97);
              if (!var2.field_A) {
                var1_int++;
                continue L1;
              } else {
                stackIn_4_0 = (kn) (var2);
                break L0;
              }
            }
          }
        } catch (java.lang.IllegalArgumentException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (IllegalArgumentException) (Object) decompiledCaughtException;
          return null;
        }
        return stackIn_4_0;
    }

    final static int a(eg param0, sp param1, int param2, int param3) {
        int stackIn_7_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param0.field_n == null) {
                  break L1;
                } else {
                  if (param1 == null) {
                    break L1;
                  } else {
                    if (param1.field_o == param0.field_l) {
                      var4_int = param1.field_i.length;
                      var5 = param0.field_n[param3].length / var4_int;
                      var6 = 0;
                      L2: while (true) {
                        if (var5 <= var6) {
                          var6 = 127 / ((param2 - 59) / 36);
                          stackIn_21_0 = -1;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          L3: {
                            if (param1.field_p != param0.field_r[param3][var6]) {
                              break L3;
                            } else {
                              if (!ci.a(param0.field_i[param3][var6], -46)) {
                                break L3;
                              } else {
                                var7 = 0;
                                L4: while (true) {
                                  if (var7 >= var4_int) {
                                    stackIn_18_0 = var6;
                                    decompiledRegionSelector0 = 1;
                                    break L0;
                                  } else {
                                    if (param1.field_i[var7] == param0.field_n[param3][var7 + var4_int * var6]) {
                                      var7++;
                                      continue L4;
                                    } else {
                                      break L3;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var6++;
                          continue L2;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            stackIn_7_0 = -1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var4);

            stackIn_24_1 = new StringBuilder().append("gj.C(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L5;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L6;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L6;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_25_0), stackIn_28_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_18_0;
          } else {
            return stackIn_21_0;
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != -27956) {
            field_c = (jp[]) null;
        }
        field_d = null;
        field_c = null;
    }

    static {
        field_d = "Tutorial: <%0>";
    }
}
