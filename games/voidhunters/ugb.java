/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ugb extends rqa {
    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 < -119) {
              stackIn_4_0 = new nc(qua.field_b);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (nc) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("ugb.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static int a(int param0, pgb param1) {
        int var2_int = 0;
        int var3 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var2_int = kmb.field_a;
              if (param1.field_a != param0) {
                if (param1.field_a == 4) {
                  var2_int = bja.field_p[param1.field_a];
                  break L1;
                } else {
                  if (param1.field_i == wqa.field_a) {
                    var2_int = rqa.field_m[param1.field_a];
                    break L1;
                  } else {
                    var2_int = bja.field_p[param1.field_a];
                    break L1;
                  }
                }
              } else {
                if (param1.field_k) {
                  var2_int = kmb.field_a;
                  break L1;
                } else {
                  L2: {
                    if (0 != param1.field_f) {
                      break L2;
                    } else {
                      if (-1 != (param1.field_h ^ -1)) {
                        break L2;
                      } else {
                        var2_int = rqa.field_m[param1.field_a];
                        break L1;
                      }
                    }
                  }
                  var2_int = bja.field_p[param1.field_a];
                  break L1;
                }
              }
            }
            stackIn_14_0 = var2_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var2);

            stackIn_17_1 = new StringBuilder().append("ugb.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        return stackIn_14_0;
    }

    ugb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
