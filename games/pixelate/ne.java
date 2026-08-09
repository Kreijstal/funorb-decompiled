/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne extends ie {
    static tn field_I;

    private ne(int param0, int param1, int param2, int param3, eb param4, fn param5, ng param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            this.field_H = param6;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "ne.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, ng param2, int param3, int param4, int param5) {
        bn var7 = null;
        bn var8 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3, param4, param5);
              var8 = qf.field_a;
              var7 = var8;
              if (var8 == null) {
                break L1;
              } else {
                if (this.a(param3 ^ 96, param1, param4, param0, param5)) {
                  if (this.field_n instanceof s) {
                    ((s) ((Object) this.field_n)).a(116, var8, (ne) (this));
                    qf.field_a = null;
                    break L1;
                  } else {
                    if (!(var8.field_n instanceof s)) {
                      break L1;
                    } else {
                      ((s) ((Object) var8.field_n)).a(param3 ^ -106, var8, (ne) (this));
                      qf.field_a = null;
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var7_ref);

            stackIn_10_1 = new StringBuilder().append("ne.EA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw aa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static int a(int param0, int param1) {
        param1--;
        param1 = param1 | param1 >>> -1328614847;
        param1 = param1 | param1 >>> 399449186;
        if (param0 != -1879863704) {
            field_I = (tn) null;
        }
        param1 = param1 | param1 >>> 538739364;
        param1 = param1 | param1 >>> -1879863704;
        param1 = param1 | param1 >>> 576781968;
        return param1 + 1;
    }

    final static String a(int param0, boolean param1, CharSequence param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_13_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var3 = lg.a(11, param1, param2);
            if (param0 >= 56) {
              if (var3 == null) {
                var4 = 0;
                L1: while (true) {
                  if (var4 < param2.length()) {
                    if (!oh.a(param2.charAt(var4), -112)) {
                      stackIn_13_0 = nj.field_g;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      var4++;
                      continue L1;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                stackIn_6_0 = (String) (var3);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3_ref);

            stackIn_18_1 = new StringBuilder().append("ne.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L2;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    static {
        field_I = null;
    }
}
