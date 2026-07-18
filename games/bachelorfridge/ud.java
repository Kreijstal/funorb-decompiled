/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud extends td {
    static String field_q;
    static int field_p;

    public static void c() {
        field_q = null;
    }

    final ii a(op param0, int param1) {
        RuntimeException var3 = null;
        ica var4 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var17 = 0;
        aga var18 = null;
        int[][] var22 = null;
        ica stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        ica stackOut_11_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var17 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var18 = ((ud) this).field_h.a(25, param0);
              var4 = new ica(((ud) this).field_g, new nq(var18));
              var4.field_q = ((ud) this).field_n;
              var4.field_s = ((ud) this).field_k;
              if (param1 == 3) {
                break L1;
              } else {
                field_p = -22;
                break L1;
              }
            }
            var22 = var4.a(param0, 0, -95, var18);
            var6 = 17;
            var7 = 17;
            var8 = var6 - 1 >> 1;
            var9 = -1 + var7 >> 1;
            var10 = 0;
            L2: while (true) {
              if (var10 >= var6) {
                stackOut_11_0 = (ica) var4;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                var11 = 0;
                L3: while (true) {
                  if (var11 >= var7) {
                    var10++;
                    continue L2;
                  } else {
                    L4: {
                      if (1 != var22[var10][var11]) {
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var11++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("ud.A(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ')');
        }
        return (ii) (Object) stackIn_12_0;
    }

    ud(int param0, aga param1, int param2, int param3) {
        super(param0, param1);
        try {
            ((ud) this).field_n = param3;
            ((ud) this).field_k = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "ud.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        wn.field_p = true;
        if (param1 < 77) {
            return;
        }
        try {
            var2 = "tuhstatbut";
            var3 = "rvnadlm";
            var4 = -1L;
            oc.a(param0, var2, var4, 122, var3);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "ud.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Allow spectators?";
    }
}
