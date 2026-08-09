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
            this.field_c = true;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "he.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final void a(int param0, d param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              jk.a(this.field_b, 10, param1);
              if (param0 == 0) {
                break L1;
              } else {
                field_a = (java.awt.Frame) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("he.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
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
        field_d = 0;
    }
}
