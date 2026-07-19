/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g extends fi {
    static hi field_y;
    static boolean field_A;
    static int field_z;

    final void a(int param0, int param1, qg param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        vl var8 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3 ^ 0, param4, param5);
              var8 = b.field_i;
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
                      if (!Transmogrify.field_A) {
                        break L1;
                      } else {
                        ((s) ((Object) this.field_m)).a((g) (this), 2089, var8);
                        b.field_i = null;
                        break L1;
                      }
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
            var7 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var7);
            stackOut_11_1 = new StringBuilder().append("g.BA(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
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
