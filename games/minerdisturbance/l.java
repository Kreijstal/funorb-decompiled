/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class l extends java.awt.Canvas implements java.awt.event.FocusListener {
    java.awt.Frame field_d;
    static String field_e;
    static ea field_c;
    static String field_a;
    volatile boolean field_b;

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        if (param0 != 79) {
            return;
        }
        field_e = null;
    }

    final void a(boolean param0, vf param1) {
        try {
            if (param0) {
                java.awt.Graphics var4 = (java.awt.Graphics) null;
                this.paint((java.awt.Graphics) null);
            }
            tf.a((byte) 105, param1, this.field_d);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "l.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static jf a(String param0, byte param1) {
        RuntimeException var2 = null;
        String var3 = null;
        jf stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -126) {
                break L1;
              } else {
                var3 = (String) null;
                l.a((String) null, (byte) 111);
                break L1;
              }
            }
            L2: {
              if (!wm.field_f.a(0)) {
                break L2;
              } else {
                if (param0.equals(wm.field_f.a(false))) {
                  break L2;
                } else {
                  wm.field_f = al.a(-10218, param0);
                  break L2;
                }
              }
            }
            stackIn_6_0 = wm.field_f;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("l.B(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    public final void update(java.awt.Graphics param0) {
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
            this.field_b = true;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "l.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    l() {
    }

    public final void paint(java.awt.Graphics param0) {
    }

    static {
        field_e = "Waiting for extra data";
        field_a = "Error connecting to server. Please try using a different server.";
    }
}
