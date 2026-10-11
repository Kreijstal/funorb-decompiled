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
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          jk.a(param1, (java.awt.Component) ((Object) param0));
          wk.a((java.awt.Component) ((Object) param0), (byte) -64);
          if (param1) {
            wf.a(1);
          }
          if (null == qj.field_eb) {
            return;
          }
          qj.field_eb.a((java.awt.Component) ((Object) param0), true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("wf.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    wf(int param0) {
        this.field_g = param0;
    }

    final static boolean d(int param0) {
        if (param0 == -15200) {
          return ie.field_x == jl.field_a ? true : false;
        }
        field_f = -51L;
        return ie.field_x == jl.field_a ? true : false;
    }

    final static void a(int param0) {
        bc var1 = (bc) (gi.field_a.d(46));
        if (var1 == null) {
          throw new IllegalStateException();
        }
        if (param0 < -54) {
          ki.a(var1.field_m, var1.field_o, var1.field_g);
          ki.d(var1.field_f, var1.field_k, var1.field_n, var1.field_i);
          var1.field_m = null;
          va.field_h.b(120, var1);
          return;
        }
        field_f = -72L;
        ki.a(var1.field_m, var1.field_o, var1.field_g);
        ki.d(var1.field_f, var1.field_k, var1.field_n, var1.field_i);
        var1.field_m = null;
        va.field_h.b(120, var1);
    }

    static {
    }
}
