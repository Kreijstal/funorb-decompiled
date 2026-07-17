/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk extends java.awt.Canvas implements java.awt.event.FocusListener {
    static String field_e;
    java.awt.Frame field_f;
    static tf field_d;
    static el field_a;
    static String field_b;
    volatile boolean field_g;
    static String field_c;

    final void a(int param0, cb param1) {
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
              dc.a((byte) -124, ((mk) this).field_f, param1);
              if (param0 == 6511) {
                break L1;
              } else {
                mk.a((byte) 114);
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
            stackOut_3_1 = new StringBuilder().append("mk.B(").append(param0).append(44);
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
          throw aa.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public final void update(java.awt.Graphics param0) {
    }

    public static void a(byte param0) {
        if (param0 >= -81) {
          field_d = null;
          field_a = null;
          field_e = null;
          field_c = null;
          field_d = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_e = null;
          field_c = null;
          field_d = null;
          field_b = null;
          return;
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
            ((mk) this).field_g = true;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "mk.focusLost(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    mk() {
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Quit to website";
        field_b = "Pause Menu";
        field_a = new el();
        field_c = "Loading...";
    }
}
