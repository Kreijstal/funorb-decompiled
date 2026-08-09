/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca extends hf {
    static String field_h;
    static mg field_f;
    static int field_i;
    static na field_g;

    final static nd a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        nd var5 = null;
        nd stackIn_4_0 = null;
        nd stackIn_7_0 = null;
        nd stackIn_10_0 = null;
        nd stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (0 == param0.length()) {
                  break L1;
                } else {
                  var2_int = param0.indexOf('@');
                  if (0 != (var2_int ^ -1)) {
                    var3 = param0.substring(0, var2_int);
                    var4 = param0.substring(param1 + var2_int);
                    var5 = r.a(var3, true);
                    if (var5 == null) {
                      stackIn_12_0 = fe.a(var4, false);
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      stackIn_10_0 = (nd) (var5);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    stackIn_7_0 = pj.field_f;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
            stackIn_4_0 = fb.field_j;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var2);

            stackIn_15_1 = new StringBuilder().append("ca.B(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_12_0;
            }
          }
        }
    }

    public static void b(boolean param0) {
        field_h = null;
        field_f = null;
        field_g = null;
        if (param0) {
            field_g = (na) null;
        }
    }

    private ca() throws Throwable {
        throw new Error();
    }

    static {
        field_h = "Unpacking music";
    }
}
