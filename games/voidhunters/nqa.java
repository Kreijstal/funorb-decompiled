/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nqa {
    static boolean field_c;
    static boolean[][] field_b;
    static volatile boolean field_a;

    final static Object a(ij param0, int param1) {
        ksa var2 = null;
        int var3 = 0;
        Object stackIn_6_0 = null;
        ksa stackIn_14_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = VoidHunters.field_G;
        try {
          L0: {
            if (ls.field_q) {
              if (param1 == 12642) {
                if (param0 != null) {
                  var2 = param0.d(0);
                  L1: while (true) {
                    if (var2 != null) {
                      if (!VoidHunters.a(true, var2)) {
                        var2 = param0.a((byte) 98);
                        continue L1;
                      } else {
                        stackIn_14_0 = (ksa) (var2);
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  return null;
                }
              } else {
                stackIn_6_0 = (Object) null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var2_ref);

            stackIn_19_1 = new StringBuilder().append("nqa.B(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L2;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_14_0;
        }
    }

    public static void a(byte param0) {
        if (param0 != -30) {
            return;
        }
        field_b = (boolean[][]) null;
    }

    static {
        field_c = false;
        field_a = true;
    }
}
