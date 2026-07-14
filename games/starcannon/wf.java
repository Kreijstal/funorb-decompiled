/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wf extends rf {
    static long field_f;
    int field_g;

    final static void a(java.awt.Canvas param0, boolean param1) {
        jk.a(param1, (java.awt.Component) (Object) param0);
        wk.a((java.awt.Component) (Object) param0, (byte) -64);
        if (!param1) {
          if (null != qj.field_eb) {
            qj.field_eb.a((java.awt.Component) (Object) param0, true);
            return;
          } else {
            return;
          }
        } else {
          wf.a(1);
          if (null == qj.field_eb) {
            return;
          } else {
            qj.field_eb.a((java.awt.Component) (Object) param0, true);
            return;
          }
        }
    }

    wf(int param0) {
        ((wf) this).field_g = param0;
    }

    final static boolean d(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -15200) {
          L0: {
            field_f = -51L;
            if (ie.field_x != jl.field_a) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (ie.field_x != jl.field_a) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
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
