/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gv extends rqa {
    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        vfa var4 = null;
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
              if (param1 < -119) {
                break L1;
              } else {
                var4 = (vfa) null;
                gv.a((vfa) null, -90);
                break L1;
              }
            }
            si.a(59, 62, param0[0].a(98));
            stackIn_3_0 = new nc("void");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("gv.A(");

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

    final static void a(int param0, int param1, int param2) {
        be var3;
        vfa var4;
        var3 = new be();
        var3.field_b = param1;
        var3.field_a = param0;
        rkb.a(0, var3, dpa.field_p, 70);
        if (param2 != -10923) {
          var4 = (vfa) null;
          gv.a((vfa) null, -41);
          return;
        } else {
          return;
        }
    }

    gv(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(vfa param0, int param1) {
        int stackIn_7_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param1 > 9) {
                break L1;
              } else {
                gv.a(-34, -13, 122);
                break L1;
              }
            }
            L2: {
              L3: {
                efb.field_b = param0;
                if (null == efb.field_b) {
                  break L3;
                } else {
                  if (efb.field_b.field_b) {
                    stackIn_7_0 = 1;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_7_0 = 0;
              break L2;
            }
            mb.h(stackIn_7_0, 124);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var2);

            stackIn_11_1 = new StringBuilder().append("gv.C(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    static {
    }
}
