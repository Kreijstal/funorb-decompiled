/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih extends java.awt.Canvas implements java.awt.event.FocusListener {
    volatile boolean field_b;
    java.awt.Frame field_a;

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final void a(uf param0, int param1) {
        RuntimeException runtimeException = null;
        uf var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              sg.a(this.field_a, (byte) -105, param0);
              if (param1 == 5474) {
                break L1;
              } else {
                var4 = (uf) null;
                this.a((uf) null, -112);
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

            stackIn_5_1 = new StringBuilder().append("ih.A(");

            if (param0 == null) {
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
          throw sl.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    ih() {
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
            this.field_b = true;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "ih.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void update(java.awt.Graphics param0) {
    }

    static {
    }
}
