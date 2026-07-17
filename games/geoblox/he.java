/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he extends java.awt.Canvas implements java.awt.event.FocusListener {
    volatile boolean field_c;
    static int field_d;
    static java.awt.Frame field_a;
    java.awt.Frame field_b;

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
            ((he) this).field_c = true;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "he.focusLost(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final void a(int param0, d param1) {
        RuntimeException runtimeException = null;
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
            L1: {
              jk.a(((he) this).field_b, 10, param1);
              if (param0 == 0) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("he.B(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            he.a(-79);
            field_a = null;
            return;
        }
        field_a = null;
    }

    he() {
    }

    public final void update(java.awt.Graphics param0) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0;
    }
}
