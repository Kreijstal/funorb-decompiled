/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g extends fi {
    static hi field_y;
    static boolean field_A;
    static int field_z;

    final void a(int param0, int param1, qg param2, int param3, int param4, int param5) {
        vl var7 = null;
        RuntimeException var7_ref = null;
        vl var8 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3 ^ 0, param4, param5);
              var8 = b.field_i;
              var7 = var8;
              if (var8 == null) {
                break L1;
              } else {
                if (!this.b(param5, param0, -1, param1, param4)) {
                  break L1;
                } else {
                  if (this.field_m instanceof s) {
                    ((s) ((Object) this.field_m)).a((g) (this), 2089, var8);
                    b.field_i = null;
                    break L1;
                  } else {
                    if (!(var8.field_m instanceof s)) {
                      break L1;
                    } else {
                      ((s) ((Object) var8.field_m)).a((g) (this), param3 + 2090, var8);
                      b.field_i = null;
                      break L1;
                    }
                  }
                }
              }
            }
            if (param3 == -1) {
              break L0;
            } else {
              g.i(-34);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var7_ref);

            stackIn_11_1 = new StringBuilder().append("g.BA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private g(int param0, int param1, int param2, int param3, ui param4, ma param5, qg param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            this.field_v = param6;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "g.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    public static void i(int param0) {
        field_y = null;
        if (param0 != 19224) {
            field_z = 81;
        }
    }

    static {
        field_y = new hi();
    }
}
