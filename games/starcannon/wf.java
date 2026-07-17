/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wf extends rf {
    static long field_f;
    int field_g;

    final static void a(java.awt.Canvas param0, boolean param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            jk.a(false, (java.awt.Component) (Object) param0);
            wk.a((java.awt.Component) (Object) param0, (byte) -64);
            if (null == qj.field_eb) {
              break L0;
            } else {
              qj.field_eb.a((java.awt.Component) (Object) param0, true);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var2;
            stackOut_3_1 = new StringBuilder().append("wf.C(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + 0 + 41);
        }
    }

    wf(int param0) {
        ((wf) this).field_g = param0;
    }

    final static boolean d(int param0) {
        return ie.field_x == jl.field_a;
    }

    final static void a(int param0) {
        bc var1 = null;
        var1 = (bc) (Object) gi.field_a.d(46);
        if (var1 == null) {
          throw new IllegalStateException();
        } else {
          if (param0 >= -54) {
            field_f = -72L;
            ki.a(var1.field_m, var1.field_o, var1.field_g);
            ki.d(var1.field_f, var1.field_k, var1.field_n, var1.field_i);
            var1.field_m = null;
            va.field_h.b(120, (rf) (Object) var1);
            return;
          } else {
            ki.a(var1.field_m, var1.field_o, var1.field_g);
            ki.d(var1.field_f, var1.field_k, var1.field_n, var1.field_i);
            var1.field_m = null;
            va.field_h.b(120, (rf) (Object) var1);
            return;
          }
        }
    }

    static {
    }
}
