/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gga extends mc {
    private gga(int param0, int param1, int param2, int param3, wwa param4, sba param5, shb param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            this.field_t = param6;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "gga.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3, shb param4, int param5) {
        RuntimeException var7 = null;
        int var8 = 0;
        ef var9 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.a((byte) -124, param1, param2, param3, param4, param5);
              var9 = lb.field_p;
              var8 = 123 % ((52 - param0) / 52);
              if (var9 == null) {
                break L1;
              } else {
                if (!this.a(param2, param1, param5, param3, (byte) 22)) {
                  break L1;
                } else {
                  if (this.field_l instanceof ol) {
                    ((ol) ((Object) this.field_l)).a((byte) -70, var9, (gga) (this));
                    lb.field_p = null;
                    return;
                  } else {
                    if (var9.field_l instanceof ol) {
                      ((ol) ((Object) var9.field_l)).a((byte) -70, var9, (gga) (this));
                      lb.field_p = null;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var7);

            stackIn_10_1 = new StringBuilder().append("gga.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param5 + ')');
        }
    }

    static {
    }
}
