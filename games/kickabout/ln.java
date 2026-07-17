/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ln extends ct {
    static int[] field_B;

    private ln(int param0, int param1, int param2, int param3, gj param4, jv param5, fd param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            ((ln) this).field_z = param6;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "ln.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 44 + (param6 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, int param1, int param2, fd param3, int param4, int param5) {
        jg var7 = null;
        RuntimeException var7_ref = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3, param4, param5);
              var7 = mp.field_g;
              if (var7 == null) {
                break L1;
              } else {
                if (!((ln) this).a((byte) -81, param5, param0, param2, param1)) {
                  break L1;
                } else {
                  if (!(((ln) this).field_k instanceof co)) {
                    if (!(var7.field_k instanceof co)) {
                      break L1;
                    } else {
                      ((co) (Object) var7.field_k).a(var7, (ln) this, 14578);
                      mp.field_g = null;
                      return;
                    }
                  } else {
                    ((co) (Object) ((ln) this).field_k).a(var7, (ln) this, param4 + 14579);
                    mp.field_g = null;
                    return;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var7_ref;
            stackOut_7_1 = new StringBuilder().append("ln.T(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final static void a(int param0, hd param1, hd param2) {
        if (null == param1.field_jb) {
            param1.field_jb = new tf();
        }
        if (!(param2.field_jb != null)) {
            param2.field_jb = new tf();
        }
        if (param0 != 64) {
            return;
        }
        try {
            if (null == kw.field_b) {
                kw.field_b = new em(64);
            }
            if (!(null != ni.field_m)) {
                ni.field_m = new em(64);
            }
            ne.field_I = param1.field_jb;
            qn.field_b = param2.field_jb;
            qg.a(0);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "ln.R(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static java.awt.Canvas l(int param0) {
        if (param0 != 64) {
            field_B = null;
            return e.field_m == null ? ic.field_d : (java.awt.Canvas) (Object) e.field_m;
        }
        return e.field_m == null ? ic.field_d : (java.awt.Canvas) (Object) e.field_m;
    }

    public static void k(int param0) {
        if (param0 != 31235) {
            ln.k(110);
            field_B = null;
            return;
        }
        field_B = null;
    }

    static {
    }
}
