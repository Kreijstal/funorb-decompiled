/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf {
    static String field_d;
    static on field_b;
    static aj field_f;
    static String field_a;
    static km field_e;
    static int field_c;

    final static void a(int param0) {
        if (param0 != -64) {
          vf.a(true);
          gk.field_g.g(62, 8);
          gk.field_g.a(123, 117);
          return;
        } else {
          gk.field_g.g(62, 8);
          gk.field_g.a(123, 117);
          return;
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_b = null;
        field_f = null;
        if (param0) {
          field_d = (String) null;
          field_e = null;
          field_a = null;
          return;
        } else {
          field_e = null;
          field_a = null;
          return;
        }
    }

    final static hh a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        hh stackIn_6_0 = null;
        hh stackIn_10_0 = null;
        hh stackIn_19_0 = null;
        hh stackIn_22_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        hh stackOut_5_0 = null;
        hh stackOut_9_0 = null;
        hh stackOut_21_0 = null;
        hh stackOut_18_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var5 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 8286) {
                break L1;
              } else {
                field_d = (String) null;
                break L1;
              }
            }
            var2_int = param0.length();
            if (-1 == (var2_int ^ -1)) {
              stackOut_5_0 = a.field_H;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-64 > (var2_int ^ -1)) {
                stackOut_9_0 = cb.field_a;
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3 = 0;
                L2: while (true) {
                  if (var2_int > var3) {
                    L3: {
                      var4 = param0.charAt(var3);
                      if (var4 != 45) {
                        if ((ae.field_f.indexOf(var4) ^ -1) != 0) {
                          break L3;
                        } else {
                          stackOut_21_0 = jj.field_f;
                          stackIn_22_0 = stackOut_21_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      } else {
                        L4: {
                          if (var3 == 0) {
                            break L4;
                          } else {
                            if (var3 != -1 + var2_int) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        stackOut_18_0 = jj.field_f;
                        stackIn_19_0 = stackOut_18_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                    var3++;
                    continue L2;
                  } else {
                    return null;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var2);
            stackOut_25_1 = new StringBuilder().append("vf.A(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L5;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L5;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_19_0;
            } else {
              return stackIn_22_0;
            }
          }
        }
    }

    static {
        field_d = "Both players have the same number of pieces";
        field_b = new on();
        field_a = "Try again";
        field_c = 360;
    }
}
