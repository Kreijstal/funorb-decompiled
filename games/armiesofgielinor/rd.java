/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd extends java.awt.Canvas implements java.awt.event.FocusListener {
    static String field_a;
    volatile boolean field_k;
    static int field_d;
    static int field_b;
    static String field_g;
    static String field_h;
    static String field_f;
    static je field_e;
    java.awt.Frame field_c;
    static ic field_j;
    static long field_i;

    public static void a(int param0) {
        field_g = null;
        field_a = null;
        field_f = null;
        field_j = null;
        field_h = null;
        field_e = null;
        if (param0 != 20000000) {
            field_e = null;
        }
    }

    public final void update(java.awt.Graphics param0) {
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
            ((rd) this).field_k = true;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "rd.focusLost(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final static void b(int param0) {
        if (param0 != 8445) {
            rd.b(33);
            qj.field_C.setLength(0);
            rs.field_t = 0;
            return;
        }
        qj.field_C.setLength(0);
        rs.field_t = 0;
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void paint(java.awt.Graphics param0) {
    }

    final void a(int param0, hd param1) {
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
              fj.a(((rd) this).field_c, param1, param0 ^ 30916);
              if (param0 == -30918) {
                break L1;
              } else {
                field_f = null;
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
            stackOut_3_1 = new StringBuilder().append("rd.B(").append(param0).append(44);
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
          throw ig.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    rd() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Orb points: ";
        field_d = 0;
        field_f = "The game options are not all set.";
        field_a = "Spells to impose your will upon the world.";
        field_i = 20000000L;
        field_g = "Updates will sent to the email address you've given";
    }
}
