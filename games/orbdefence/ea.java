/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea extends java.awt.Canvas implements java.awt.event.FocusListener {
    static String field_g;
    static tl field_f;
    static long field_h;
    java.awt.Frame field_c;
    volatile boolean field_e;
    static boolean field_a;
    static String[] field_d;
    static hj[] field_b;

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void paint(java.awt.Graphics param0) {
    }

    final void a(be param0, int param1) {
        try {
            if (param1 > -85) {
                dl var4 = (dl) null;
                ea.a(7, (dl) null, 115);
            }
            tj.a(param0, this.field_c, -23144);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "ea.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void update(java.awt.Graphics param0) {
    }

    final static hf a(int param0, dl param1, int param2) {
        RuntimeException var3 = null;
        hf stackIn_2_0 = null;
        hf stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 > 8) {
              stackIn_4_0 = ik.a(bb.a(param1, 100, param2), -129);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (hf) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("ea.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_b = null;
        field_g = null;
        field_d = null;
        if (param0 != 29967) {
            field_f = (tl) null;
        }
    }

    ea() {
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
            this.field_e = true;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "ea.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "OVER <%0>";
        field_f = new tl();
    }
}
