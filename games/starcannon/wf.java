/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wf extends rf {
    static long field_f;
    int field_g;

    final static void a(java.awt.Canvas param0, boolean param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              jk.a(param1, (java.awt.Component) ((Object) param0));
              wk.a((java.awt.Component) ((Object) param0), (byte) -64);
              if (!param1) {
                break L1;
              } else {
                wf.a(1);
                break L1;
              }
            }
            if (null == qj.field_eb) {
              break L0;
            } else {
              qj.field_eb.a((java.awt.Component) ((Object) param0), true);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("wf.C(");

            if (param0 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
    }

    wf(int param0) {
        this.field_g = param0;
    }

    final static boolean d(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != -15200) {
          L0: {
            field_f = -51L;
            if (ie.field_x != jl.field_a) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (ie.field_x != jl.field_a) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static void a(int param0) {
        bc var1;
        var1 = (bc) ((Object) gi.field_a.d(46));
        if (var1 == null) {
          throw new IllegalStateException();
        } else {
          if (param0 >= -54) {
            field_f = -72L;
            ki.a(var1.field_m, var1.field_o, var1.field_g);
            ki.d(var1.field_f, var1.field_k, var1.field_n, var1.field_i);
            var1.field_m = null;
            va.field_h.b(120, var1);
            return;
          } else {
            ki.a(var1.field_m, var1.field_o, var1.field_g);
            ki.d(var1.field_f, var1.field_k, var1.field_n, var1.field_i);
            var1.field_m = null;
            va.field_h.b(120, var1);
            return;
          }
        }
    }

    static {
    }
}
