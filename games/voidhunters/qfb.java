/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qfb extends rqa {
    static int field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
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
                field_o = 25;
                break L1;
              }
            }
            stackIn_3_0 = new nc(frb.a(107, 109));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("qfb.A(");

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

    final static void a(int param0) {
        int fieldTemp$2 = 0;
        faa var1 = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var3 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param0 == 8) {
                break L1;
              } else {
                field_o = 71;
                break L1;
              }
            }
            var1 = dpa.field_p;
            L2: while (true) {
              if (!apb.a(57)) {
                break L0;
              } else {
                var1.h(param0 + 24327, 8);
                fieldTemp$2 = var1.field_e + 1;
                var1.field_e = var1.field_e + 1;
                var2 = fieldTemp$2;
                ida.a(var1, (byte) 127);
                dpa.field_p.e(var1.field_e + -var2, -129);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1_ref), "qfb.B(" + param0 + ')');
        }
    }

    qfb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
