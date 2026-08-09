/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc extends td {
    final ii a(op param0, int param1) {
        aga var3 = null;
        RuntimeException var3_ref = null;
        iba var4 = null;
        iba stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = this.field_h.a(79, param0);
              if (param1 == 3) {
                break L1;
              } else {
                fc.a(68, -10, (byte) -83, -44, 25, 72);
                break L1;
              }
            }
            var4 = new iba(this.field_g, new nq(var3));
            var4.field_q = this.field_k;
            var4.field_r = this.field_n;
            stackIn_3_0 = (iba) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("fc.A(");

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
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return (ii) ((Object) stackIn_3_0);
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5) {
        int var6;
        var6 = 26 % ((param2 - 38) / 47);
        if (param0 == param1) {
          eda.a(param3, param4, param1, false, param5);
          return;
        } else {
          if (param4 + -param1 < eo.field_l) {
            vda.a(param0, param5, param3, param1, (byte) -115, param4);
            return;
          } else {
            if (pw.field_x < param1 + param4) {
              vda.a(param0, param5, param3, param1, (byte) -115, param4);
              return;
            } else {
              if (param3 + -param0 < an.field_q) {
                vda.a(param0, param5, param3, param1, (byte) -115, param4);
                return;
              } else {
                if (param3 + param0 > ha.field_n) {
                  vda.a(param0, param5, param3, param1, (byte) -115, param4);
                  return;
                } else {
                  dw.a(param3, param0, 0, param1, param5, param4);
                  return;
                }
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, kv param2, int param3, byte param4, int param5) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var8 = BachelorFridge.field_y;
        try {
          L0: {
            var6_int = 0;
            var7 = -110 % ((param4 - 7) / 37);
            L1: while (true) {
              if (var6_int >= param2.field_v.length) {
                break L0;
              } else {
                param2.field_v[var6_int] = hga.field_U.field_e[var6_int];
                var6_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var6);

            stackIn_7_1 = new StringBuilder().append("fc.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    fc(int param0, aga param1, int param2, int param3) {
        super(param0, param1);
        try {
            this.field_k = param2;
            this.field_n = param3;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "fc.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
    }
}
