/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe {
    static int field_b;
    static int[] field_c;
    static int field_a;

    final static java.awt.Frame a(int param0, int param1, int param2, int param3, d param4, int param5) {
        int var8 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_35_0 = null;
        java.awt.Frame stackIn_37_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        rj[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var9 = 0;
        rj[] var10 = null;
        cb var11 = null;
        var9 = Geoblox.field_C;
        try {
          if (!param4.b(-26098)) {
            return null;
          }
          {
            L0: {
              if (param1 == ~param0) {
                var10 = vi.a(param1 ^ -112, param4);
                var6 = var10;
                if (var6 == null) {
                  stackIn_7_0 = null;
                  return (java.awt.Frame) ((Object) stackIn_7_0);
                }
                {
                  var7_int = 0;
                  L1: for (var8 = 0; var8 < var10.length; var8++) {
                    if (param3 != var10[var8].field_d) {
                      continue L1;
                    }
                    if (var10[var8].field_f == param2) {
                      if (param5 != 0) {
                        if (param5 != var10[var8].field_a) {
                          continue L1;
                        }
                      }
                      if (var7_int != 0) {
                        if (param0 >= var10[var8].field_h) {
                          continue L1;
                        }
                      }
                      var7_int = 1;
                      param0 = var10[var8].field_h;
                    }
                  }
                  if (var7_int != 0) {
                    break L0;
                  }
                  return null;
                }
              }
            }
            var11 = param4.a(param2, param1 ^ 1743550127, param5, param0, param3);
            L5: while (var11.field_a == 0) {
              bc.a(0, 10L);
            }
            var7 = (java.awt.Frame) (var11.field_b);
            if (var7 == null) {
              return null;
            }
            if (var11.field_a != 2) {
              stackIn_37_0 = (java.awt.Frame) (var7);
              return stackIn_37_0;
            }
            jk.a(var7, 10, param4);
            stackIn_35_0 = null;
            return (java.awt.Frame) ((Object) stackIn_35_0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_40_0 = (RuntimeException) (var6_ref);
          stackIn_40_1 = new StringBuilder().append("qe.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param5).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != -8616) {
            qe.a(87);
        }
        field_c = null;
    }

    final static void b(int param0) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = Geoblox.field_C;
        try {
          if (ji.field_h != 0) {
            if (ji.field_h < 21) {
              fa.field_b = fa.field_b + 10;
            }
          }
          fa.field_b = fa.field_b + param0;
          sa.field_b = fa.field_b / 3;
          L1: while (fa.field_b > 3 * sa.field_b) {
            sa.field_b = sa.field_b + 1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "qe.B(" + param0 + ')');
        }
    }

    final static void a(rh param0, rh param1, int param2) {
        try {
            if (param2 > -66) {
                d var4 = (d) null;
                qe.a(91, -118, 58, -45, (d) null, -79);
            }
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "qe.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_c = new int[8192];
    }
}
