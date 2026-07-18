/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class za extends ksa {
    static int field_d;
    private static String field_z;

    protected za() {
    }

    final static int c(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            if (null != fwa.field_g) {
              var1_int = 0;
              var2 = 0;
              L1: while (true) {
                if (var2 >= 12) {
                  stackOut_10_0 = var1_int;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                } else {
                  L2: {
                    L3: {
                      var3 = fwa.field_g.field_c[var2];
                      if (fwa.field_g.a(var3, true, false)) {
                        break L3;
                      } else {
                        if (!fwa.field_g.c(var3, -40)) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var1_int++;
                    break L2;
                  }
                  var2++;
                  continue L1;
                }
              }
            } else {
              L4: {
                if (param0 == -93) {
                  break L4;
                } else {
                  int discarded$2 = za.c((byte) 43);
                  break L4;
                }
              }
              stackOut_14_0 = 12;
              stackIn_15_0 = stackOut_14_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var1, field_z + param0 + ')');
        }
        return stackIn_15_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "za.C(";
    }
}
