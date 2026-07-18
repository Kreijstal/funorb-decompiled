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
                Object var4 = null;
                hf discarded$0 = ea.a(7, (dl) null, 115);
            }
            int discarded$1 = -23144;
            tj.a(param0, ((ea) this).field_c);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "ea.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void update(java.awt.Graphics param0) {
    }

    final static hf a(int param0, dl param1, int param2) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        hf stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        hf stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 > 8) {
              int discarded$2 = -129;
              stackOut_3_0 = ik.a(bb.a(param1, 100, param2));
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (hf) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("ea.B(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    public static void a() {
        field_f = null;
        field_b = null;
        field_g = null;
        field_d = null;
    }

    ea() {
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
            ((ea) this).field_e = true;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "ea.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "OVER <%0>";
        field_f = new tl();
    }
}
