/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak extends rqa {
    static boolean field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_2_0 = null;
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
              if (param1 <= -119) {
                break L1;
              } else {
                var4 = null;
                nc discarded$2 = ((ak) this).a((nc[]) null, 27);
                break L1;
              }
            }
            si.a(214, 62, param0[0].a(113));
            stackOut_2_0 = new nc((Object) (Object) "void");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ak.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    ak(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static int e(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            if (null == fwa.field_g) {
              var1_int = 107 % ((param0 - -59) / 38);
              stackOut_14_0 = 9;
              stackIn_15_0 = stackOut_14_0;
              break L0;
            } else {
              var1_int = 0;
              var2 = 3;
              L1: while (true) {
                if (12 <= var2) {
                  stackOut_12_0 = var1_int;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0;
                } else {
                  L2: {
                    L3: {
                      var3 = fwa.field_g.field_c[var2];
                      if (fwa.field_g.a(var3, true, false)) {
                        break L3;
                      } else {
                        if (fwa.field_g.c(var3, 78)) {
                          break L3;
                        } else {
                          var2++;
                          break L2;
                        }
                      }
                    }
                    var1_int++;
                    var2++;
                    break L2;
                  }
                  var2++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var1, "ak.B(" + param0 + 41);
        }
        return stackIn_15_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = true;
    }
}
