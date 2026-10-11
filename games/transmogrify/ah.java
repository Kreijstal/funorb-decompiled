/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah extends java.awt.Canvas {
    static we field_b;
    private java.awt.Component field_c;
    static float field_a;

    public static void a(int param0) {
        field_b = null;
        if (param0 != -23431) {
          ah.b(53);
        }
    }

    final static void a(int param0, int param1, byte param2, java.awt.Canvas param3) {
        java.awt.Graphics var4 = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            if (param2 < 88) {
              return;
            }
            var4 = param3.getGraphics();
            ri.field_k.a(-32299, param0, var4, param1);
            var4.dispose();
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref = (Exception) (Object) decompiledCaughtException;
            param3.repaint();
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_8_0 = var4_ref2;
          stackIn_8_1 = new StringBuilder().append("ah.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public final void update(java.awt.Graphics param0) {
        try {
          this.field_c.update(param0);
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "ah.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static java.awt.Container b(int param0) {
        if (aj.field_t != null) {
          return (java.awt.Container) ((Object) aj.field_t);
        }
        if (param0 != -18253) {
          return (java.awt.Container) null;
        }
        return (java.awt.Container) ((Object) ha.b(109));
    }

    ah(java.awt.Component param0) {
        try {
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "ah.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void paint(java.awt.Graphics param0) {
        try {
          this.field_c.paint(param0);
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "ah.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
