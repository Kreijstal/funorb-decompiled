/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak extends rqa {
    static boolean field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc[] var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 <= -119) {
                break L1;
              } else {
                var4 = (nc[]) null;
                this.a((nc[]) null, 27);
                break L1;
              }
            }
            si.a(214, 62, param0[0].a(113));
            stackIn_3_0 = new nc("void");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ak.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    ak(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static int e(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            if (null == fwa.field_g) {
              var1_int = 107 % ((param0 - -59) / 38);
              stackIn_13_0 = 9;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              var1_int = 0;
              var2 = 3;
              L1: while (true) {
                if (12 <= var2) {
                  stackIn_11_0 = var1_int;
                  decompiledRegionSelector0 = 0;
                  break L0;
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
                          break L2;
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
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1), "ak.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0;
        } else {
          return stackIn_13_0;
        }
    }

    static {
        field_o = true;
    }
}
