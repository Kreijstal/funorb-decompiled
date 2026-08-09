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
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        hh stackIn_6_0 = null;
        hh stackIn_10_0 = null;
        hh stackIn_19_0 = null;
        hh stackIn_22_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
              stackIn_6_0 = a.field_H;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-64 > (var2_int ^ -1)) {
                stackIn_10_0 = cb.field_a;
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
                          stackIn_22_0 = jj.field_f;
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
                        stackIn_19_0 = jj.field_f;
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
            stackIn_27_0 = (RuntimeException) (var2);

            stackIn_27_1 = new StringBuilder().append("vf.A(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L5;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
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
